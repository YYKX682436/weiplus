package ak0;

/* loaded from: classes12.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static com.p314xaae8f345.p3076xcbed6b1f.p3078x5c30872.AbstractC26587x7a37b8e7 f87069a;

    public static void a() {
        android.app.Application m104434x367a4c1a = f87069a.m104434x367a4c1a();
        if (com.p314xaae8f345.mm.app.v5.a(m104434x367a4c1a) != com.p314xaae8f345.mm.app.v5.f135384h) {
            return;
        }
        com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Hit main process condition.", new java.lang.Object[0]);
        try {
            if (!ak0.o.f()) {
                com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Patch is not loaded, do not needs to do fix.", new java.lang.Object[0]);
                return;
            }
            java.lang.String a17 = bm5.f1.a();
            java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(m104434x367a4c1a);
            java.io.File m104680x3b463ffc = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104680x3b463ffc(m104679xac1dbbfb.getAbsolutePath());
            java.io.File m104681x4bb4abc7 = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104681x4bb4abc7(m104679xac1dbbfb.getAbsolutePath());
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17 m104696x91bd9b4d = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104696x91bd9b4d(m104680x3b463ffc, m104681x4bb4abc7);
            if (!com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55624x33afa6b0.equals(m104696x91bd9b4d.f55907xc2f69c4b)) {
                com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Status is ok, do not needs to do fix.", new java.lang.Object[0]);
                return;
            }
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Before fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", m104696x91bd9b4d.f55908x84da1cb1, m104696x91bd9b4d.f55906x3867f718, m104696x91bd9b4d.f55907xc2f69c4b, m104696x91bd9b4d.f55903xac39f8c4);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.g2.a(a17, 257, java.lang.String.format("BEFORE_FIXED##%s##%s##%s##%s", m104696x91bd9b4d.f55908x84da1cb1, m104696x91bd9b4d.f55906x3867f718, m104696x91bd9b4d.f55907xc2f69c4b, m104696x91bd9b4d.f55903xac39f8c4));
            java.io.File file = new java.io.File(m104679xac1dbbfb, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104684x2e62bb27(m104696x91bd9b4d.f55906x3867f718));
            java.io.File file2 = new java.io.File(file, "odex");
            java.io.File file3 = new java.io.File(file, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55690xa7e2e32d);
            java.io.File file4 = new java.io.File(file2, "tinker_classN.dex");
            java.io.File file5 = new java.io.File(file3, "tinker_classN.dex");
            if (file4.exists() && file4.canRead()) {
                m104696x91bd9b4d.f55907xc2f69c4b = "odex";
            } else if (file5.exists() && file5.canRead()) {
                m104696x91bd9b4d.f55907xc2f69c4b = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55690xa7e2e32d;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.g2.a(a17, 257, java.lang.String.format("FIXED##%s##%s##%s##%s", m104696x91bd9b4d.f55908x84da1cb1, m104696x91bd9b4d.f55906x3867f718, m104696x91bd9b4d.f55907xc2f69c4b, m104696x91bd9b4d.f55903xac39f8c4));
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** After fixing: oldver: %s, newver: %s, oatdir: %s, fingerpint: %s", m104696x91bd9b4d.f55908x84da1cb1, m104696x91bd9b4d.f55906x3867f718, m104696x91bd9b4d.f55907xc2f69c4b, m104696x91bd9b4d.f55903xac39f8c4);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104698x2e66fab7(m104680x3b463ffc, m104696x91bd9b4d, m104681x4bb4abc7);
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Killing other processes.", new java.lang.Object[0]);
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26642xfc05db38.m104759x8758b283(m104434x367a4c1a);
            com.p314xaae8f345.mm.app.p5.e("MicroMsg.MMApplicationLikeLegacy", "** Other processes were killed.", new java.lang.Object[0]);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.mm.app.p5.d("MicroMsg.MMApplicationLikeLegacy", th6, "** Exception occurred.", new java.lang.Object[0]);
        }
    }

    public static java.lang.String b(java.lang.String str) {
        try {
            return new java.io.File(new java.io.File(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(f87069a.m104434x367a4c1a()).getAbsolutePath(), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104684x2e62bb27(tv5.c.a(f87069a))).getAbsolutePath() + "/lib/lib/" + str).getAbsolutePath();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26643x725bfea6.m104767x58ef3d35("MicroMsg.MMApplicationLikeLegacy", th6, "[-] Fail to get patched native libs path.", new java.lang.Object[0]);
            return null;
        }
    }

    public static void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch");
        if (android.os.Build.VERSION.SDK_INT < 35) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch Build.VERSION.SDK_INT < 35");
            return;
        }
        if (!ak0.o.f()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch isTinkerLoadSuccess = false");
            return;
        }
        try {
            java.lang.Class<?> cls = java.lang.Class.forName("android.app.ResourcesManager");
            java.lang.reflect.Field field = null;
            java.util.Map map = (java.util.Map) com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(cls, "mResourceImpls").get(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104704xfb2fc3fa(cls, "getInstance", (java.lang.Class<?>[]) new java.lang.Class[0]).invoke(null, new java.lang.Object[0]));
            if (map == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "hackResourcesKeyForTinkerPatch resourceImpls == null");
                return;
            }
            java.io.File m104679xac1dbbfb = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104679xac1dbbfb(f87069a.m104434x367a4c1a());
            java.lang.String str = new java.io.File(m104679xac1dbbfb, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104684x2e62bb27(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26638x12179c17.m104696x91bd9b4d(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104680x3b463ffc(m104679xac1dbbfb.getAbsolutePath()), com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26637x8fe39687.m104681x4bb4abc7(m104679xac1dbbfb.getAbsolutePath())).f55906x3867f718)).getAbsolutePath() + "/res/resources.apk";
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                java.lang.Object key = ((java.util.Map.Entry) it.next()).getKey();
                if (key != null) {
                    boolean z17 = true;
                    if (field == null) {
                        field = com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26639xfeb4df20.m104702x183d66c1(key.getClass(), "mResDir");
                        field.setAccessible(true);
                    }
                    java.lang.String str2 = (java.lang.String) field.get(key);
                    if (str2 != null) {
                        if (!str2.contains(f87069a.m104434x367a4c1a().getPackageName()) || !str2.endsWith("/base.apk")) {
                            z17 = false;
                        }
                        if (z17) {
                            field.set(key, str);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "ResourceKey: " + key);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMApplicationLikeLegacy", "Override: " + str2 + " -> " + str);
                        }
                    }
                }
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMApplicationLikeLegacy", th6, "Hack resources failed.", new java.lang.Object[0]);
        }
    }

    public static void d() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (ak0.o.f()) {
            if (lp0.a.f401788i) {
                java.lang.String b17 = b("arm64-v8a");
                if (!android.text.TextUtils.isEmpty(b17)) {
                    fp.d0.c(b17);
                }
                ov5.c.a(f87069a, "arm64-v8a");
                return;
            }
            java.lang.String b18 = b("armeabi-v7a");
            if (!android.text.TextUtils.isEmpty(b18)) {
                fp.d0.c(b18);
            }
            ov5.c.a(f87069a, "armeabi-v7a");
            java.lang.String b19 = b("armeabi");
            if (!android.text.TextUtils.isEmpty(b19)) {
                fp.d0.c(b19);
            }
            ov5.c.a(f87069a, "armeabi");
        }
    }
}
