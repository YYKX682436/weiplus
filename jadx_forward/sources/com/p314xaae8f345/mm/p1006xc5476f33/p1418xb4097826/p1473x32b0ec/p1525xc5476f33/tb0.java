package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class tb0 implements ff0.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 f195913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cm2.g0 f195914c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f195915d;

    public tb0(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var, cm2.g0 g0Var, boolean z17) {
        this.f195912a = view;
        this.f195913b = dc0Var;
        this.f195914c = g0Var;
        this.f195915d = z17;
    }

    @Override // ff0.x
    public void a(ff0.z zVar) {
        jz5.f0 f0Var;
        boolean z17 = this.f195915d;
        cm2.g0 g0Var = this.f195914c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.dc0 dc0Var = this.f195913b;
        android.view.View view = this.f195912a;
        if (zVar != null) {
            view.setBackgroundColor(e3.b.g(zVar.f343129b, -1));
            dc0Var.c(g0Var, false, z17);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a8s);
            dc0Var.c(g0Var, true, z17);
        }
    }
}
