package fo2;

/* loaded from: classes2.dex */
public final class b implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo2.e f346429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f346430e;

    public b(fo2.e eVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var) {
        this.f346429d = eVar;
        this.f346430e = k0Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        if (g4Var.z()) {
            fo2.e eVar = this.f346429d;
            boolean z17 = eVar.z();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = eVar.f515691a;
            if (z17) {
                g4Var.l(20008, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573444m43), com.p314xaae8f345.mm.R.raw.f81311x8a0b4ea5, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            int intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209306jc).mo141623x754a37bb()).r()).intValue();
            java.lang.String str = eVar.f346433c;
            if (intValue == 1 && ya2.h.f542017a.b(str) != null) {
                g4Var.l(20002, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ezy), com.p314xaae8f345.mm.R.raw.f79181x28396080, false);
            }
            if (!eVar.o()) {
                g4Var.l(20005, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573232dy4), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec, false);
            }
            if (eVar.A()) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
                pm0.v.T(new ho2.c(nyVar != null ? nyVar.V6() : null, str, 1).l(), new fo2.a(this.f346430e, g4Var, eVar));
            }
        }
    }
}
