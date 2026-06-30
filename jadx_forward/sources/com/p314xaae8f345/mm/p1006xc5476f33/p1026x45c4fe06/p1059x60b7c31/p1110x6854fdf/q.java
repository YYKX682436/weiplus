package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u f164731d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.da f164732e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f164733f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f164734g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f164735h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f164736i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l f164737m;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.ui.da daVar, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, boolean z18, android.content.Intent intent) {
        this.f164737m = lVar;
        this.f164731d = uVar;
        this.f164732e = daVar;
        this.f164733f = z17;
        this.f164734g = o6Var;
        this.f164735h = z18;
        this.f164736i = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        nb5.b bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar = this.f164731d;
        nf.g.a(uVar.f164788a).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.o(this));
        boolean z17 = this.f164733f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar = this.f164737m;
        android.content.Intent intent = this.f164736i;
        boolean z18 = this.f164735h;
        if (!z17) {
            j45.l.v(uVar.f164788a, z18 ? ".ui.transmit.SelectConversationDirectSelectUI" : ".ui.transmit.SelectConversationUI", intent, lVar.f164706g);
            if (z18) {
                return;
            }
            uVar.f164788a.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559409e0, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
            return;
        }
        boolean z19 = uVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0;
        java.lang.String b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.n2.b(c01.od.c(uVar.C, ""));
        java.lang.String c17 = c01.od.c(uVar.f164796i, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f164734g;
        if (o6Var == null || (u07 = o6Var.u0()) == null) {
            str = null;
            str2 = null;
        } else {
            str = u07.f158813f;
            str2 = u07.f158812e;
        }
        s05.d dVar = new s05.d();
        dVar.Q(c01.od.b(java.lang.Integer.valueOf(uVar.f164792e), 0));
        dVar.R(c01.od.c(uVar.f164810w, ""));
        dVar.U(c17);
        dVar.J(c01.od.c(uVar.f164795h, ""));
        dVar.T(c01.od.c(str, ""));
        dVar.E(uVar.f164809v);
        v05.b bVar2 = new v05.b();
        int i17 = bVar2.f449898d;
        bVar2.set(i17 + 6, 33);
        bVar2.set(i17 + 2, c01.od.c(uVar.f164793f, ""));
        bVar2.set(i17 + 3, c01.od.c(uVar.f164794g, ""));
        java.lang.String c18 = c01.od.c(uVar.f164810w, "");
        int i18 = bVar2.f513848e;
        bVar2.set(i18 + 11, c18);
        bVar2.set(i18 + 12, c01.od.c(str2, ""));
        bVar2.set(i18 + 39, dVar);
        if (z19) {
            nb5.a aVar = new nb5.a();
            aVar.n(b17);
            aVar.l(bVar2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.d0) uVar;
            s05.a aVar2 = new s05.a();
            aVar2.o(d0Var.Q);
            aVar2.k(c01.od.c(d0Var.R, ""));
            aVar2.l(c01.od.c(d0Var.T, ""));
            aVar2.n(c01.od.c(d0Var.S, ""));
            dVar.I(aVar2);
            bVar = aVar;
        } else {
            nb5.b bVar3 = new nb5.b();
            bVar3.n(b17);
            bVar3.l(bVar2);
            bVar = bVar3;
        }
        if (z18) {
            java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.p pVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.p(this);
            n13.t tVar = new n13.t();
            tVar.f415667b = pVar;
            n13.a0.td();
            tVar.f415668c = n13.y.f415674a;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(uVar.f164788a, bVar, stringExtra, tVar);
            return;
        }
        n13.r rVar = new n13.r();
        rVar.f415651b = lVar.f164706g;
        rVar.f415654e = false;
        if (uVar.f164798k || uVar.f164791d) {
            rVar.f415655f = false;
            rVar.f415656g = false;
            rVar.f415657h = false;
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(uVar.f164788a, bVar, rVar);
    }
}
