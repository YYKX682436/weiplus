package vx5;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f522853a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f522854b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f522855c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Boolean f522856d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f522857e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f522858f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.ClassLoader f522859g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Class f522860h;

    /* JADX WARN: Removed duplicated region for block: B:27:0x039f  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.content.Intent r47, android.app.Service r48, android.content.Context r49) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.a.<init>(android.content.Intent, android.app.Service, android.content.Context):void");
    }

    public static boolean f() {
        try {
            return android.os.Build.VERSION.SDK_INT >= 28 ? android.os.Process.isIsolated() : ((java.lang.Boolean) android.os.Process.class.getMethod("isIsolated", new java.lang.Class[0]).invoke(null, new java.lang.Object[0])).booleanValue();
        } catch (java.lang.Throwable th6) {
            by5.c4.d("ChildProcessServiceWrapper", "isIsolatedProcess, error:", th6);
            throw new java.lang.RuntimeException(th6);
        }
    }

    public static java.nio.ByteBuffer[] i(java.io.FileInputStream fileInputStream) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.zip.ZipInputStream zipInputStream = new java.util.zip.ZipInputStream(new java.io.BufferedInputStream(fileInputStream));
        while (true) {
            java.util.zip.ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry == null) {
                zipInputStream.close();
                zipInputStream.close();
                java.nio.ByteBuffer[] byteBufferArr = new java.nio.ByteBuffer[arrayList.size()];
                arrayList.toArray(byteBufferArr);
                return byteBufferArr;
            }
            if (nextEntry.getName().endsWith(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55637xc33c4c99)) {
                by5.c4.f("ChildProcessServiceWrapper", "readDexFileFromApk, dexFile:" + nextEntry.getName());
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                byte[] bArr = new byte[1024];
                while (true) {
                    int read = zipInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
                arrayList.add(java.nio.ByteBuffer.wrap(byteArrayOutputStream.toByteArray()));
            }
            zipInputStream.closeEntry();
        }
    }

    public final void a(android.app.Service service, android.content.Context context) {
        boolean z17;
        java.lang.ClassLoader classLoader = this.f522859g;
        try {
            by5.c4.f("ChildProcessServiceWrapper", "createChildProcessServiceByCustom, start");
            this.f522858f = classLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate").getMethod("createChildProcessService", android.app.Service.class, android.content.Context.class).invoke(null, service, context);
            z17 = true;
        } catch (java.lang.Exception e17) {
            by5.c4.g("ChildProcessServiceWrapper", "createChildProcessServiceByCustom, error:" + e17);
            z17 = false;
        }
        if (z17) {
            return;
        }
        by5.c4.f("ChildProcessServiceWrapper", "createChildProcessServiceByChromium, start");
        this.f522858f = classLoader.loadClass("org.chromium.content_public.app.ChildProcessServiceFactory").getMethod("create", android.app.Service.class, android.content.Context.class).invoke(null, service, context);
    }

    public final int b() {
        by5.z e17 = by5.a0.e(this.f522853a);
        if (e17.f118148a) {
            return e17.b();
        }
        return -1;
    }

    public java.lang.Class c(java.lang.String str) {
        try {
            java.lang.ClassLoader classLoader = this.f522859g;
            if (classLoader == null) {
                by5.c4.g("ChildProcessServiceWrapper", "getBridgeClass, classloader is null");
                return null;
            }
            return classLoader.loadClass("com.tencent.xweb.pinus." + str);
        } catch (java.lang.Throwable th6) {
            by5.c4.g("ChildProcessServiceWrapper", "getBridgeClass failed, class:" + str + ", error:" + th6);
            return null;
        }
    }

    public final java.lang.Class d() {
        java.lang.Class cls = this.f522860h;
        if (cls != null) {
            return cls;
        }
        java.lang.ClassLoader classLoader = this.f522859g;
        if (classLoader == null) {
            return null;
        }
        try {
            java.lang.Class<?> loadClass = classLoader.loadClass("org.chromium.base.process_launcher.ChildProcessService");
            this.f522860h = loadClass;
            return loadClass;
        } catch (java.lang.Throwable th6) {
            by5.c4.c("ChildProcessServiceWrapper", "getChildProcessServiceClass error:" + android.util.Log.getStackTraceString(th6));
            return null;
        }
    }

    public final java.lang.String e() {
        java.lang.String str = this.f522854b;
        return str != null ? str.contains("SandboxedProcessService") ? "render" : str.contains("PrivilegedProcessService") ? "gpu" : "" : "";
    }

    public final void g(android.content.Context context, android.os.IBinder iBinder, android.os.Parcel parcel, android.os.Parcel parcel2) {
        java.lang.String a17 = com.p314xaae8f345.p3210x3857dc.b0.a(context, "xweb_linker");
        iBinder.transact(1, parcel, parcel2, 0);
        android.os.ParcelFileDescriptor parcelFileDescriptor = (android.os.ParcelFileDescriptor) parcel2.readParcelable(vx5.a.class.getClassLoader());
        android.system.Os.lseek(parcelFileDescriptor.getFileDescriptor(), 0L, android.system.OsConstants.SEEK_SET);
        java.lang.String str = "app_xwalk_" + this.f522853a + "/extracted_xwalkcore/libxwebcore.so";
        vx5.l lVar = vx5.k.f522907a;
        java.lang.ClassLoader classLoader = this.f522859g;
        if (lVar.k(classLoader)) {
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInIsolatedProcess, from runtime, libPath:" + str + ", linkerPath:" + a17);
            java.lang.Class<?> loadClass = classLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate");
            java.lang.Class<?> cls = java.lang.Boolean.TYPE;
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInIsolatedProcess, result:" + loadClass.getMethod("loadXWebLibraryInIsolatedProcess", java.lang.String.class, cls, java.lang.Integer.TYPE, cls, java.lang.String.class).invoke(null, str, java.lang.Boolean.FALSE, java.lang.Integer.valueOf(parcelFileDescriptor.detachFd()), java.lang.Boolean.TRUE, a17));
        } else {
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27843xa6b2ec2c.m120286x372485e9(classLoader);
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInIsolatedProcess, from sdk, libPath:" + str);
            com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.p3217x6ce85017.AbstractC27852x87ab9247.m120481x9cf0d20b().m120492x77d0160a(str, false, parcelFileDescriptor.detachFd(), true);
        }
        if (this.f522856d.booleanValue()) {
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInIsolatedProcess need close");
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException e17) {
                by5.c4.c("ChildProcessServiceWrapper", "loadXWebLibraryInIsolatedProcess close fd error:" + e17.toString());
            }
        }
    }

    public final void h(java.lang.String path) {
        vx5.l lVar = vx5.k.f522907a;
        java.lang.ClassLoader classLoader = this.f522859g;
        if (lVar.k(classLoader)) {
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInNonIsolatedProcess, from runtime, libPath:" + path);
            by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInNonIsolatedProcess, result:" + classLoader.loadClass("com.tencent.xweb.pinus.PSViewDelegate").getMethod("loadXWebLibraryInNonIsolatedProcess", java.lang.String.class).invoke(null, path));
            return;
        }
        com.p314xaae8f345.p3210x3857dc.p3216x65baef3.sdk.C27843xa6b2ec2c.m120286x372485e9(classLoader);
        by5.c4.f("ChildProcessServiceWrapper", "loadXWebLibraryInNonIsolatedProcess, from sdk, libPath:" + path);
        com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        com.p314xaae8f345.cso.C2941xefde02d2.h(path);
    }

    public final void j(android.os.IBinder iBinder, android.os.Parcel parcel, android.os.Parcel parcel2) {
        iBinder.transact(3, parcel, parcel2, 0);
        boolean z17 = parcel2.readInt() == 1;
        by5.c4.f("ChildProcessServiceWrapper", "setCustomFont, custom font exist:" + z17);
        if (z17) {
            this.f522859g.loadClass("com.tencent.xweb.XWebCommJni").getMethod("SetCustomFontFD", java.lang.Integer.TYPE).invoke(null, java.lang.Integer.valueOf(((android.os.ParcelFileDescriptor) parcel2.readParcelable(vx5.a.class.getClassLoader())).detachFd()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k() {
        /*
            r10 = this;
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "ChildProcessServiceWrapper"
            r2 = 0
            java.lang.String r3 = "PSViewDelegate"
            java.lang.Class r3 = r10.c(r3)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L1a
            java.lang.String r0 = "invokeRuntimeChannel, clazz is null"
            by5.c4.g(r1, r0)     // Catch: java.lang.Throwable -> L3f
            goto L45
        L1a:
            by5.i0 r4 = new by5.i0     // Catch: java.lang.Throwable -> L3f
            java.lang.String r5 = "invokeRuntimeChannel"
            r6 = 2
            java.lang.Class[] r7 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L3f
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L3f
            r7[r2] = r8     // Catch: java.lang.Throwable -> L3f
            java.lang.Class<java.lang.Object[]> r8 = java.lang.Object[].class
            r9 = 1
            r7[r9] = r8     // Catch: java.lang.Throwable -> L3f
            r4.<init>(r3, r5, r7)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L3f
            r5 = 80003(0x13883, float:1.12108E-40)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L3f
            r3[r2] = r5     // Catch: java.lang.Throwable -> L3f
            r3[r9] = r0     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r4.b(r3)     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
            java.lang.String r3 = "invokeRuntimeChannel error"
            by5.c4.d(r1, r3, r0)
        L45:
            r0 = 0
        L46:
            boolean r1 = r0 instanceof java.lang.Boolean
            if (r1 == 0) goto L50
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L50:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: vx5.a.k():boolean");
    }
}
