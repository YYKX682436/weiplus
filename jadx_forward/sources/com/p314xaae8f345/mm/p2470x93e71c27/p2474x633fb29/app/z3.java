package com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app;

/* loaded from: classes8.dex */
public class z3 extends com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f270712e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f270713f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f270714g;

    /* renamed from: h, reason: collision with root package name */
    public final int f270715h;

    public z3(int i17, int i18, int i19, java.lang.String str, java.util.LinkedList linkedList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "offset: " + i18 + ", limit = " + i19 + ", lang = " + str + "installedApp list size: " + linkedList.size());
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "install id:[%s]", (java.lang.String) it.next());
        }
        this.f270715h = i17;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.to3();
        lVar.f152198b = new r45.uo3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getsuggestionapplist";
        lVar.f152200d = 409;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        this.f270623d = a17;
        r45.to3 to3Var = (r45.to3) a17.f152243a.f152217a;
        to3Var.f468160d = i17;
        to3Var.f468161e = i18;
        to3Var.f468162f = i19;
        to3Var.f468163g = str;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it6 = linkedList.iterator();
        while (it6.hasNext()) {
            java.lang.String str2 = (java.lang.String) it6.next();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                linkedList2.add(x51.j1.i(str2));
            }
        }
        to3Var.f468164h = linkedList2.size();
        to3Var.f468165i = linkedList2;
        this.f270712e = new java.util.LinkedList();
        this.f270713f = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        this.f270714g = linkedList3;
        linkedList3.addAll(linkedList);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public void a(byte[] bArr) {
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "buf is null");
            return;
        }
        try {
            this.f270623d.f152244b.mo13863x347f4535(bArr);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetSuggestionAppList", e17, "", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public int b() {
        return 4;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u3
    public byte[] c() {
        try {
            return ((com.p314xaae8f345.mm.p944x882e457a.m) this.f270623d.mo47979x2d63726f()).mo13852xc3d7db06();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", e17.getMessage());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.NetSceneGetSuggestionAppList", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public final void d(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, r45.m2 m2Var) {
        mVar.z0(m2Var.f461611f);
        mVar.y0(m2Var.f461612g);
        mVar.M = m2Var.f461615m;
        mVar.A = true;
        mVar.f67372x453d1e07 = m2Var.f461613h;
        mVar.f67369x5e556d3a = m2Var.f461614i;
        mVar.A0(m2Var.f461617o);
        mVar.f319913p0 = m2Var.f461619q;
        mVar.A = true;
        f(mVar, m2Var.f461618p);
    }

    public final void e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, r45.ti5 ti5Var) {
        mVar.z0(ti5Var.f468010h);
        mVar.f67369x5e556d3a = ti5Var.f468008f;
        mVar.I = ti5Var.f468012m;
        mVar.f67372x453d1e07 = ti5Var.f468007e;
        mVar.M = ti5Var.f468015p;
        mVar.A = true;
        mVar.f67378x454032b6 = ti5Var.f468019t;
        mVar.y0(ti5Var.f468020u);
        mVar.f67386xa1e9e82c = ti5Var.f468021v;
        mVar.A0(ti5Var.f468024y);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ti5Var.f468024y)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "google play download url is : %s, download flag is %d", ti5Var.f468024y, java.lang.Integer.valueOf(ti5Var.D));
            mVar.w0(ti5Var.D);
        }
        mVar.R = ti5Var.f468025z;
        mVar.S = ti5Var.A;
        mVar.A = true;
        f(mVar, ti5Var.B);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mVar.f67378x454032b6)) {
            return;
        }
        if (mVar.f67378x454032b6.startsWith("1") || mVar.f67378x454032b6.startsWith("6")) {
            if (!mVar.f67378x454032b6.endsWith(",")) {
                mVar.f67378x454032b6 += ",";
            }
            mVar.f67378x454032b6 = "," + mVar.f67378x454032b6;
        }
    }

    public final void f(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m mVar, r45.og7 og7Var) {
        java.lang.String str = mVar.f67370x28d45f97;
        if (og7Var != null) {
            mVar.w0(og7Var.f463778d);
            mVar.W = og7Var.f463779e;
            mVar.X = og7Var.f463780f;
            mVar.U = og7Var.f463781g;
            mVar.V = og7Var.f463782h;
            mVar.Y = og7Var.f463783i;
            mVar.Z = og7Var.f463784m;
            mVar.A = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "get yyb download infos:[%d],[%s],[%s],[%s],[%s],[%s],[%d]", java.lang.Integer.valueOf(og7Var.f463778d), og7Var.f463779e, og7Var.f463780f, og7Var.f463781g, og7Var.f463782h, og7Var.f463783i, java.lang.Integer.valueOf(og7Var.f463784m));
        }
    }

    @Override // com.p314xaae8f345.mm.p971x6de15a2e.l0
    /* renamed from: onGYNetEnd */
    public void mo804x5f9cdc6f(int i17, int i18, int i19, java.lang.String str, com.p314xaae8f345.mm.p971x6de15a2e.v0 v0Var, byte[] bArr) {
        boolean mo880xb970c2b9;
        boolean mo9952xce0038c9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i18 + ", errCode = " + i19);
        if (i18 != 0 || i19 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "errType = " + i18 + ", errCode = " + i19);
            return;
        }
        r45.uo3 uo3Var = (r45.uo3) this.f270623d.f152244b.f152233a;
        if (uo3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "resp == null");
            return;
        }
        ((kt.a) ap3.e.a()).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.z Ri = zo3.p.Ri();
        java.util.LinkedList linkedList = uo3Var.f469060e;
        if (linkedList != null && linkedList.size() > 0) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                r45.ti5 ti5Var = (r45.ti5) it.next();
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ti5Var.f468006d)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "error appinfo, the appid is null");
                } else {
                    com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(ti5Var.f468006d);
                    int i27 = this.f270715h;
                    boolean z17 = true;
                    if (h17 != null) {
                        e(h17, ti5Var);
                        if (i27 == 3) {
                            h17.f67391x10a0fed7 = 5;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.R)) {
                                java.lang.Object[] objArr = new java.lang.Object[2];
                                objArr[0] = java.lang.Boolean.valueOf(h17.S != null);
                                objArr[1] = java.lang.Boolean.valueOf(h17.R != null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params1, has IntroUrl %s, has IconUrl %s", objArr);
                                mo9952xce0038c9 = false;
                                z17 = false;
                            } else {
                                mo9952xce0038c9 = Ri.mo9952xce0038c9(h17, new java.lang.String[0]);
                            }
                        } else {
                            mo9952xce0038c9 = Ri.mo9952xce0038c9(h17, new java.lang.String[0]);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "update appinfo: AppID = %s, ret = %s, needAddToList = %s", ti5Var.f468006d, java.lang.Boolean.valueOf(mo9952xce0038c9), java.lang.Boolean.valueOf(z17));
                    } else {
                        h17 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                        h17.f67370x28d45f97 = ti5Var.f468006d;
                        e(h17, ti5Var);
                        if (i27 == 3) {
                            h17.f67391x10a0fed7 = 5;
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.S) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.R)) {
                                java.lang.Object[] objArr2 = new java.lang.Object[2];
                                objArr2[0] = java.lang.Boolean.valueOf(h17.S != null);
                                objArr2[1] = java.lang.Boolean.valueOf(h17.R != null);
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NetSceneGetSuggestionAppList", "wrong suggestion params2, has IntroUrl %s, has IconUrl %s", objArr2);
                                mo880xb970c2b9 = false;
                                z17 = false;
                            } else {
                                mo880xb970c2b9 = Ri.mo880xb970c2b9(h17);
                            }
                        } else {
                            mo880xb970c2b9 = Ri.mo880xb970c2b9(h17);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneGetSuggestionAppList", "insert appinfo: AppID = %s, ret = %s, needAddToList = %s", ti5Var.f468006d, java.lang.Boolean.valueOf(mo880xb970c2b9), java.lang.Boolean.valueOf(z17));
                    }
                    if (z17 && !this.f270714g.contains(ti5Var.f468006d)) {
                        java.util.LinkedList linkedList2 = this.f270712e;
                        if (!linkedList2.contains(h17)) {
                            linkedList2.add(h17);
                        }
                    }
                }
            }
        }
        java.util.LinkedList linkedList3 = uo3Var.f469063h;
        if (linkedList3 == null || linkedList3.size() <= 0) {
            return;
        }
        java.util.Iterator it6 = linkedList3.iterator();
        while (it6.hasNext()) {
            r45.m2 m2Var = (r45.m2) it6.next();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h18 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(m2Var.f461609d);
            if (h18 != null) {
                d(h18, m2Var);
                Ri.mo9952xce0038c9(h18, new java.lang.String[0]);
            } else {
                h18 = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m();
                h18.f67370x28d45f97 = m2Var.f461609d;
                d(h18, m2Var);
                Ri.mo880xb970c2b9(h18);
            }
            this.f270713f.add(h18);
        }
    }
}
