package po3;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f438860a = {false};

    public static java.lang.String a() {
        java.lang.String str = lp0.b.D() + "FailMsgFileCache";
        boolean[] zArr = f438860a;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
                    java.lang.String str2 = a17.f294812f;
                    if (str2 != null) {
                        java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                        if (!a17.f294812f.equals(l17)) {
                            a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                        }
                    }
                    com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
                    if (m17.a()) {
                        m17.f294799a.r(m17.f294800b);
                    }
                    zArr[0] = true;
                }
            }
        }
        return str;
    }

    public static void b(int i17) {
        java.lang.String str;
        if (i17 == 1) {
            str = a() + "/normalMsg";
        } else if (i17 == 2) {
            str = a() + "/snsMsg";
        } else {
            str = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FailMsgFileCache", "removeFile error, cannot find filename");
            return;
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
            }
        }
    }
}
