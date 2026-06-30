package vz4;

/* loaded from: classes8.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f523267a = "http://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fxy) + "/jsserver.js?wechat_pkgid=jscore_lib";

    /* renamed from: b, reason: collision with root package name */
    public static vz4.x f523268b;

    public static void a(jh0.s sVar) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar;
        if (sVar != null) {
            vz4.x xVar = new vz4.x();
            f523268b = xVar;
            xVar.e(f523267a, true, false);
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.s sVar2 = f523268b.f523290e;
            if (sVar2 != null && (oVar = sVar2.f269996e) != null) {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(oVar.f269984f) && oVar.f269982d >= 4) {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    java.util.Iterator it = oVar.f269984f.iterator();
                    while (it.hasNext()) {
                        r45.ps0 ps0Var = (r45.ps0) it.next();
                        if (!oVar.e(ps0Var.f464903g)) {
                            try {
                                java.lang.String d17 = ik1.f.d(new a05.b(oVar.f269979a, oVar.f269982d + ps0Var.f464901e, ps0Var.f464902f));
                                if (d17 != null) {
                                    sb6.append("\n");
                                    sb6.append(d17);
                                }
                            } catch (java.io.IOException e17) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "getAllCode: " + e17.getMessage());
                            }
                        }
                    }
                    str = sb6.toString();
                    sVar.a(str);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "getAllCode, mFileIndexList is null");
            }
            str = null;
            sVar.a(str);
        }
    }
}
