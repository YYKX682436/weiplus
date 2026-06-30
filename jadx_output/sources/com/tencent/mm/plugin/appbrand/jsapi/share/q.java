package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes9.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.u f83198d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.da f83199e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f83200f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f83201g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f83202h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f83203i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.l f83204m;

    public q(com.tencent.mm.plugin.appbrand.jsapi.share.l lVar, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.ui.da daVar, boolean z17, com.tencent.mm.plugin.appbrand.o6 o6Var, boolean z18, android.content.Intent intent) {
        this.f83204m = lVar;
        this.f83198d = uVar;
        this.f83199e = daVar;
        this.f83200f = z17;
        this.f83201g = o6Var;
        this.f83202h = z18;
        this.f83203i = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        nb5.b bVar;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.jsapi.share.u uVar = this.f83198d;
        nf.g.a(uVar.f83255a).f(new com.tencent.mm.plugin.appbrand.jsapi.share.o(this));
        boolean z17 = this.f83200f;
        com.tencent.mm.plugin.appbrand.jsapi.share.l lVar = this.f83204m;
        android.content.Intent intent = this.f83203i;
        boolean z18 = this.f83202h;
        if (!z17) {
            j45.l.v(uVar.f83255a, z18 ? ".ui.transmit.SelectConversationDirectSelectUI" : ".ui.transmit.SelectConversationUI", intent, lVar.f83173g);
            if (z18) {
                return;
            }
            uVar.f83255a.overridePendingTransition(com.tencent.mm.R.anim.f477876e0, com.tencent.mm.R.anim.f477728p);
            return;
        }
        boolean z19 = uVar instanceof com.tencent.mm.plugin.appbrand.jsapi.share.d0;
        java.lang.String b17 = com.tencent.mm.plugin.appbrand.jsapi.share.n2.b(c01.od.c(uVar.C, ""));
        java.lang.String c17 = c01.od.c(uVar.f83263i, "");
        com.tencent.mm.plugin.appbrand.o6 o6Var = this.f83201g;
        if (o6Var == null || (u07 = o6Var.u0()) == null) {
            str = null;
            str2 = null;
        } else {
            str = u07.f77280f;
            str2 = u07.f77279e;
        }
        s05.d dVar = new s05.d();
        dVar.Q(c01.od.b(java.lang.Integer.valueOf(uVar.f83259e), 0));
        dVar.R(c01.od.c(uVar.f83277w, ""));
        dVar.U(c17);
        dVar.J(c01.od.c(uVar.f83262h, ""));
        dVar.T(c01.od.c(str, ""));
        dVar.E(uVar.f83276v);
        v05.b bVar2 = new v05.b();
        int i17 = bVar2.f368365d;
        bVar2.set(i17 + 6, 33);
        bVar2.set(i17 + 2, c01.od.c(uVar.f83260f, ""));
        bVar2.set(i17 + 3, c01.od.c(uVar.f83261g, ""));
        java.lang.String c18 = c01.od.c(uVar.f83277w, "");
        int i18 = bVar2.f432315e;
        bVar2.set(i18 + 11, c18);
        bVar2.set(i18 + 12, c01.od.c(str2, ""));
        bVar2.set(i18 + 39, dVar);
        if (z19) {
            nb5.a aVar = new nb5.a();
            aVar.n(b17);
            aVar.l(bVar2);
            com.tencent.mm.plugin.appbrand.jsapi.share.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.share.d0) uVar;
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
            com.tencent.mm.plugin.appbrand.jsapi.share.p pVar = new com.tencent.mm.plugin.appbrand.jsapi.share.p(this);
            n13.t tVar = new n13.t();
            tVar.f334134b = pVar;
            n13.a0.td();
            tVar.f334135c = n13.y.f334141a;
            ((dk5.y) ((n13.a0) i95.n0.c(n13.a0.class))).wi(uVar.f83255a, bVar, stringExtra, tVar);
            return;
        }
        n13.r rVar = new n13.r();
        rVar.f334118b = lVar.f83173g;
        rVar.f334121e = false;
        if (uVar.f83265k || uVar.f83258d) {
            rVar.f334122f = false;
            rVar.f334123g = false;
            rVar.f334124h = false;
        }
        ((dk5.b0) ((n13.b0) i95.n0.c(n13.b0.class))).Bi(uVar.f83255a, bVar, rVar);
    }
}
