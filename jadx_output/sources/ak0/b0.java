package ak0;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.tinker.entry.ApplicationLike f5536a;

    public static void a() {
        android.app.Application application = f5536a.getApplication();
        if (com.tencent.mm.app.v5.a(application) != com.tencent.mm.app.v5.f53851h) {
            return;
        }
        com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Hit main process condition.", new java.lang.Object[0]);
        try {
            if (!ak0.o.f()) {
                com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Patch is not loaded, do not needs to do fix.", new java.lang.Object[0]);
                return;
            }
            java.lang.String a17 = bm5.f1.a();
            java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(application);
            java.io.File patchInfoFile = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath());
            java.io.File patchInfoLockFile = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath());
            com.tencent.tinker.loader.shareutil.SharePatchInfo readAndCheckPropertyWithLock = com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckPropertyWithLock(patchInfoFile, patchInfoLockFile);
            if (!com.tencent.tinker.loader.shareutil.ShareConstants.CHANING_DEX_OPTIMIZE_PATH.equals(readAndCheckPropertyWithLock.oatDir)) {
                com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Status is ok, do not needs to do fix.", new java.lang.Object[0]);
                return;
            }
            com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Before fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint);
            com.tencent.mm.sdk.platformtools.g2.a(a17, 257, java.lang.String.format("BEFORE_FIXED##%s##%s##%s##%s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint));
            java.io.File file = new java.io.File(patchDirectory, com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(readAndCheckPropertyWithLock.newVersion));
            java.io.File file2 = new java.io.File(file, "odex");
            java.io.File file3 = new java.io.File(file, com.tencent.tinker.loader.shareutil.ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH);
            java.io.File file4 = new java.io.File(file2, "tinker_classN.dex");
            java.io.File file5 = new java.io.File(file3, "tinker_classN.dex");
            if (file4.exists() && file4.canRead()) {
                readAndCheckPropertyWithLock.oatDir = "odex";
            } else if (file5.exists() && file5.canRead()) {
                readAndCheckPropertyWithLock.oatDir = com.tencent.tinker.loader.shareutil.ShareConstants.INTERPRET_DEX_OPTIMIZE_PATH;
            }
            com.tencent.mm.sdk.platformtools.g2.a(a17, 257, java.lang.String.format("FIXED##%s##%s##%s##%s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint));
            com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** After fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", readAndCheckPropertyWithLock.oldVersion, readAndCheckPropertyWithLock.newVersion, readAndCheckPropertyWithLock.oatDir, readAndCheckPropertyWithLock.fingerPrint);
            com.tencent.tinker.loader.shareutil.SharePatchInfo.rewritePatchInfoFileWithLock(patchInfoFile, readAndCheckPropertyWithLock, patchInfoLockFile);
            com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Killing other processes.", new java.lang.Object[0]);
            com.tencent.tinker.loader.shareutil.ShareTinkerInternals.killProcessExceptMain(application);
            com.tencent.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Other processes were killed.", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.tencent.mm.app.p5.d("MicroMsg.MMApplicationLikeLegacy", th6, "** Exception occurred.", new java.lang.Object[0]);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        try {
            return new java.io.File(new java.io.File(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(f5536a.getApplication()).getAbsolutePath(), com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(tv5.c.a(f5536a))).getAbsolutePath() + "/lib/lib/" + str).getAbsolutePath();
        } catch (java.lang.Throwable th6) {
            com.tencent.tinker.loader.shareutil.ShareTinkerLog.printErrStackTrace("MicroMsg.MMApplicationLikeLegacy", th6, "[-] Fail to get patched native libs path.", new java.lang.Object[0]);
            return null;
        }
    }

    public static void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch");
        if (android.os.Build.VERSION.SDK_INT < 35) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch Build.VERSION.SDK_INT < 35");
            return;
        }
        if (!ak0.o.f()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch isTinkerLoadSuccess = false");
            return;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ResourcesManager");
            java.lang.reflect.Field field = null;
            java.util.Map map = (java.util.Map) com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(cls, "mResourceImpls").get(com.tencent.tinker.loader.shareutil.ShareReflectUtil.findMethod(cls, "getInstance", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
            if (map == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch resourceImpls == null");
                return;
            }
            java.io.File patchDirectory = com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchDirectory(f5536a.getApplication());
            java.lang.String str = new java.io.File(patchDirectory, com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchVersionDirectory(com.tencent.tinker.loader.shareutil.SharePatchInfo.readAndCheckPropertyWithLock(com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoFile(patchDirectory.getAbsolutePath()), com.tencent.tinker.loader.shareutil.SharePatchFileUtil.getPatchInfoLockFile(patchDirectory.getAbsolutePath())).newVersion)).getAbsolutePath() + "/res/resources.apk";
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
                if (key != null) {
                    boolean z17 = true;
                    if (field == null) {
                        field = com.tencent.tinker.loader.shareutil.ShareReflectUtil.findField(key.getClass(), "mResDir");
                        field.setAccessible(true);
                    }
                    java.lang.String str2 = (java.lang.String) field.get(key);
                    if (str2 != null) {
                        if (!str2.contains(f5536a.getApplication().getPackageName()) || !str2.endsWith("/base.apk")) {
                            z17 = false;
                        }
                        if (z17) {
                            field.set(key, str);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "ResourceKey: " + key);
                            com.tencent.mars.xlog.Log.i("MicroMsg.MMApplicationLikeLegacy", "Override: " + str2 + " -> " + str);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMApplicationLikeLegacy", th6, "Hack resources failed.", new java.lang.Object[0]);
        }
    }

    public static void d() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (ak0.o.f()) {
            if (lp0.a.f320255i) {
                java.lang.String b17 = b("arm64-v8a");
                if (!android.text.TextUtils.isEmpty(b17)) {
                    fp.d0.c(b17);
                }
                ov5.c.a(f5536a, "arm64-v8a");
                return;
            }
            java.lang.String b18 = b("armeabi-v7a");
            if (!android.text.TextUtils.isEmpty(b18)) {
                fp.d0.c(b18);
            }
            ov5.c.a(f5536a, "armeabi-v7a");
            java.lang.String b19 = b("armeabi");
            if (!android.text.TextUtils.isEmpty(b19)) {
                fp.d0.c(b19);
            }
            ov5.c.a(f5536a, "armeabi");
        }
    }
}
