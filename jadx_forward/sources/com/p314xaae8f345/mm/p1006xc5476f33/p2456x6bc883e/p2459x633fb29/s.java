package com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29;

/* loaded from: classes8.dex */
public class s extends com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.b {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda f269995d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o f269996e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f269997f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f269998g;

    public s(int i17, boolean z17, java.lang.String str) {
        super(i17, z17, str);
        this.f269998g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
    }

    public com.p314xaae8f345.p3210x3857dc.y0 a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar;
        com.p314xaae8f345.p3210x3857dc.y0 y0Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        java.util.Map map = this.f269997f;
        if (map != null && map.get(str) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27 c19542xf3901c27 = (com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19542xf3901c27) this.f269997f.get(str);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19542xf3901c27.f269898g)) {
                com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(c19542xf3901c27.f269898g);
                if (r6Var.m() && r6Var.A() && r6Var.C() == c19542xf3901c27.f269903o) {
                    try {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WepkgInterceptor", "rid hit preload file. rid:%s, localPath:%s", str, c19542xf3901c27.f269898g);
                        return new com.p314xaae8f345.p3210x3857dc.y0(c19542xf3901c27.f269900i, this.f269998g, com.p314xaae8f345.mm.vfs.w6.C(r6Var));
                    } catch (java.io.FileNotFoundException unused) {
                    }
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar2 = this.f269996e;
        if (oVar2 == null) {
            return null;
        }
        java.lang.String str2 = this.f269998g;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(oVar2.f269984f) || oVar2.f269982d < 4 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "mFileIndexList is null");
        } else {
            java.util.Iterator it = oVar2.f269984f.iterator();
            while (it.hasNext()) {
                r45.ps0 ps0Var = (r45.ps0) it.next();
                java.lang.String str3 = ps0Var.f464900d;
                if (str3 == null) {
                    str3 = "";
                }
                if (str3.equals(str)) {
                    if (oVar2.e(ps0Var.f464903g)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgReader", "filename (%s) is media resource", str);
                        return y0Var;
                    }
                    int i17 = ps0Var.f464902f;
                    if (i17 <= 5242880) {
                        try {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgReader", "rid hit big package. rid:%s", str);
                            oVar = oVar2;
                        } catch (java.io.IOException e17) {
                            e = e17;
                            oVar = oVar2;
                        }
                        try {
                            com.p314xaae8f345.p3210x3857dc.y0 y0Var2 = new com.p314xaae8f345.p3210x3857dc.y0(ps0Var.f464903g, str2, new a05.b(oVar2.f269979a, oVar2.f269982d + ps0Var.f464901e, ps0Var.f464902f));
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(ps0Var.f464904h)) {
                                java.util.HashMap hashMap = new java.util.HashMap();
                                java.util.Iterator it6 = ps0Var.f464904h.iterator();
                                while (it6.hasNext()) {
                                    r45.js0 js0Var = (r45.js0) it6.next();
                                    hashMap.put(js0Var.f459616d, js0Var.f459617e);
                                }
                                y0Var2.f302158e = hashMap;
                            }
                            return y0Var2;
                        } catch (java.io.IOException e18) {
                            e = e18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Wepkg.WePkgReader", "filename = %s, offset = %d, size = %d, mimeType = %s, e = %s", str, java.lang.Long.valueOf(ps0Var.f464901e), java.lang.Integer.valueOf(ps0Var.f464902f), ps0Var.f464903g, e.getMessage());
                            oVar2 = oVar;
                            y0Var = null;
                        }
                    } else {
                        oVar = oVar2;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Wepkg.WePkgReader", "fileSize(%d) > limitSize(%d), filename = %s, offset = %d, mimeType = %s", java.lang.Integer.valueOf(i17), 5242880L, str, java.lang.Long.valueOf(ps0Var.f464901e), ps0Var.f464903g);
                    }
                    oVar2 = oVar;
                    y0Var = null;
                }
            }
        }
        return null;
    }

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.C19543x781c5eda c19543x781c5eda, com.p314xaae8f345.mm.p1006xc5476f33.p2456x6bc883e.p2459x633fb29.o oVar, java.util.Map map) {
        super(0, true, c19543x781c5eda.f269909f);
        this.f269998g = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c;
        this.f269995d = c19543x781c5eda;
        this.f269996e = oVar;
        this.f269997f = map;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c19543x781c5eda.f269922v)) {
            return;
        }
        this.f269998g = c19543x781c5eda.f269922v;
    }
}
