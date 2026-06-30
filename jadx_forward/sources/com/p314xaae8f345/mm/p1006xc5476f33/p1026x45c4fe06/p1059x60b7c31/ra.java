package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes12.dex */
public class ra implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 f164433d;

    public ra(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 c11931x604547f3) {
        this.f164433d = c11931x604547f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        ve4.e eVar = (ve4.e) i95.n0.c(ve4.e.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ue4.w) eVar).getClass();
        boolean a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.a(context);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 c11931x604547f3 = this.f164433d;
        c11931x604547f3.f160122i = a17;
        if (!c11931x604547f3.f160124n || c11931x604547f3.f160122i) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3.B(c11931x604547f3);
            return;
        }
        g32.d0 d0Var = (g32.d0) i95.n0.c(g32.d0.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qa qaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.qa(this);
        g32.h hVar = (g32.h) d0Var;
        hVar.getClass();
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.cs3();
        lVar.f152198b = new r45.ds3();
        lVar.f152199c = "/cgi-bin/mmoc-bin/hardware/getwerunuserstate";
        lVar.f152200d = 1926;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        com.p314xaae8f345.mm.p944x882e457a.z2.d(lVar.a(), new g32.g(hVar, qaVar), true);
    }
}
