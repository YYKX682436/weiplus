package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class qp implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185944d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp f185945e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i f185946f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f185947g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185948h;

    public qp(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.rp rpVar, so2.i iVar, java.lang.String str, android.view.ViewGroup viewGroup) {
        this.f185944d = s0Var;
        this.f185945e = rpVar;
        this.f185946f = iVar;
        this.f185947g = str;
        this.f185948h = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreDraw holder: ");
        in5.s0 s0Var = this.f185944d;
        sb6.append(s0Var.hashCode());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMsgConvert", sb6.toString());
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).findViewById(android.R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
        java.lang.String timeText = this.f185947g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(timeText, "$timeText");
        this.f185945e.w(s0Var, this.f185946f, timeText, this.f185948h);
        return false;
    }
}
