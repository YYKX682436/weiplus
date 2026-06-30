package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f196398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f196399e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 f196400f;

    public w3(android.view.ViewGroup viewGroup, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.c4 c4Var) {
        this.f196398d = viewGroup;
        this.f196399e = i17;
        this.f196400f = c4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup viewGroup = this.f196398d;
        android.view.ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = this.f196399e + com.p314xaae8f345.mm.ui.bl.c(viewGroup.getContext());
        qo0.c cVar = this.f196400f.f193635v;
        if (cVar != null) {
            qo0.c.a(cVar, qo0.b.V2, null, 2, null);
        }
    }
}
