package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class b8 implements com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.hf2 f232594a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fm3.u f232595b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f232596c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 f232597d;

    public b8(r45.hf2 hf2Var, fm3.u uVar, android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var) {
        this.f232594a = hf2Var;
        this.f232595b = uVar;
        this.f232596c = viewGroup;
        this.f232597d = n0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5
    public final void a(boolean z17, boolean z18) {
        fm3.u uVar;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var;
        android.view.ViewGroup viewGroup;
        java.lang.String str;
        fm3.u uVar2;
        r45.hf2 hf2Var = this.f232594a;
        if (hf2Var == null || (uVar = this.f232595b) == null) {
            return;
        }
        fm3.j0 j0Var = fm3.j0.f345611a;
        android.view.ViewGroup viewGroup2 = this.f232596c;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0 n0Var2 = this.f232597d;
        if (z17) {
            android.content.Context context = viewGroup2.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            n0Var = n0Var2;
            viewGroup = viewGroup2;
            str = "getContext(...)";
            uVar2 = uVar;
            j0Var.f(context, hf2Var, uVar, 2, 1, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var2.Q6(), (r27 & 256) != 0 ? 1 : n0Var2.O6(), (r27 & 512) != 0 ? "" : n0Var2.P6(), (r27 & 1024) != 0 ? 2 : n0Var2.E);
        } else {
            n0Var = n0Var2;
            viewGroup = viewGroup2;
            str = "getContext(...)";
            uVar2 = uVar;
        }
        if (z18) {
            android.content.Context context2 = viewGroup.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, str);
            j0Var.f(context2, hf2Var, uVar2, 2, 3, 2, (r27 & 64) != 0 ? 2 : 0, (r27 & 128) != 0 ? 1 : n0Var.Q6(), (r27 & 256) != 0 ? 1 : n0Var.O6(), (r27 & 512) != 0 ? "" : n0Var.P6(), (r27 & 1024) != 0 ? 2 : n0Var.E);
        }
    }
}
