package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public class t7 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.h1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f168647a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f168648b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f168649c;

    public t7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var, android.view.View view, int i17) {
        this.f168649c = n7Var;
        this.f168647a = view;
        this.f168648b = i17;
    }

    public boolean a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0 z0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = z0Var.f173625a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPageViewWC", "onItemClick appId:%s, username:%s", c11714x918fd2e4.f157895e, c11714x918fd2e4.f157894d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f168649c;
        n7Var.U1 = 1;
        n7Var.S1.a();
        n7Var.R1.a();
        int i17 = z0Var.f173626b;
        if (i17 != 1 && i17 != 2) {
            return false;
        }
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559();
        c12559xbdae8559.f169323f = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.h0.f33958x366c91de;
        c12559xbdae8559.f169324g = n7Var.mo48798x74292566();
        final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e42 = z0Var.f173625a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.page.t7$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae85592 = c12559xbdae8559;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7 t7Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.t7.this;
                t7Var.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x xVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1140xd93301d8.x.f166565a;
                android.content.Context mo50352x76847179 = t7Var.f168649c.mo50352x76847179();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e43 = c11714x918fd2e42;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a) xVar).b(mo50352x76847179, c11714x918fd2e43.f157894d, c11714x918fd2e43.f157895e, null, c11714x918fd2e43.f157896f, -1, c12559xbdae85592, null, null);
            }
        }, 250L);
        return true;
    }
}
