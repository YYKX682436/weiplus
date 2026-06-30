package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class g7 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 f232680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f232681e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f232682f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232683g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f232684h;

    public g7(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var, boolean z17, boolean z18, fm3.u uVar, boolean z19) {
        this.f232680d = q7Var;
        this.f232681e = z17;
        this.f232682f = z18;
        this.f232683g = uVar;
        this.f232684h = z19;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7 q7Var = this.f232680d;
        boolean z17 = true;
        g4Var.j(201, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4c), com.p314xaae8f345.mm.R.raw.f80208xd82fc049, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), !this.f232681e);
        if (!this.f232682f) {
            g4Var.j(202, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h5d), com.p314xaae8f345.mm.R.raw.f80075x444ae503, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), !this.f232684h);
        } else if (fm3.u.A.e(this.f232683g)) {
            g4Var.j(203, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574132h40), com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), false);
        }
        g4Var.j(204, q7Var.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h3i), com.p314xaae8f345.mm.R.raw.f79198xcadaea78, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), false);
        int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274645h;
        if (!(i17 == 788529167 || i17 == 788529166) && !z65.c.a()) {
            z17 = false;
        }
        if (z17) {
            g4Var.j(205, "调试", com.p314xaae8f345.mm.R.raw.f80290xd9c5d1ec, q7Var.m80379x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5), false);
        }
    }
}
