package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes7.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 f254167d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f254168e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 f254169f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254170g;

    public k1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        this.f254170g = c18557xc00aa3f3;
        this.f254167d = c11714x918fd2e4;
        this.f254168e = i17;
        this.f254169f = c12559xbdae8559;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254170g;
        c18557xc00aa3f3.G2 = 13;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f254167d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "launchAppBrand appId:%s, appPath: %s", c11714x918fd2e4.f157895e, c11714x918fd2e4.f157899i);
        c18557xc00aa3f3.getClass();
        ((com.p314xaae8f345.mm.p689xc5a27af6.p692x45c4fe06.p693x91727fcf.c0) ((ft.j) i95.n0.c(ft.j.class))).Ai();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11711x54208329 c11711x54208329 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j0.f158012m.f157879i;
        boolean z17 = c11711x54208329 != null && c11711x54208329.a();
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "sendLocationToAppBrandProcess isLocationIn10Minutes:%b", java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5958x288a9f89 c5958x288a9f89 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5958x288a9f89();
            java.lang.String str = c11714x918fd2e4.f157895e;
            am.ns nsVar = c5958x288a9f89.f136257g;
            nsVar.f88984a = str;
            nsVar.f88985b = c11714x918fd2e4.f157894d;
            nsVar.f88986c = this.f254168e;
            nsVar.f88987d = c11711x54208329.f157880d;
            nsVar.f88988e = c11711x54208329.f157881e;
            nsVar.f88989f = c11711x54208329.f157882f;
            nsVar.f88990g = c11711x54208329.f157883g;
            nsVar.f88991h = c11711x54208329.f157884h;
            nsVar.f88992i = c11711x54208329.f157885i;
            nsVar.f88993j = java.lang.System.currentTimeMillis() - c11711x54208329.f157886m;
            c5958x288a9f89.e();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "sendLocationToAppBrandProcess location is invalid");
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).aj(c18557xc00aa3f3.getContext(), c11714x918fd2e4.f157894d, c11714x918fd2e4.f157895e, c11714x918fd2e4.f157896f, -1, c11714x918fd2e4.f157899i, this.f254169f);
    }
}
