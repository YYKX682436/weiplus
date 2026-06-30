package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class qp implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104411d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.rp f104412e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ so2.i f104413f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104414g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f104415h;

    public qp(in5.s0 s0Var, com.tencent.mm.plugin.finder.convert.rp rpVar, so2.i iVar, java.lang.String str, android.view.ViewGroup viewGroup) {
        this.f104411d = s0Var;
        this.f104412e = rpVar;
        this.f104413f = iVar;
        this.f104414g = str;
        this.f104415h = viewGroup;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPreDraw holder: ");
        in5.s0 s0Var = this.f104411d;
        sb6.append(s0Var.hashCode());
        com.tencent.mars.xlog.Log.i("FinderMsgConvert", sb6.toString());
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((android.app.Activity) context).findViewById(android.R.id.content).getViewTreeObserver().removeOnPreDrawListener(this);
        java.lang.String timeText = this.f104414g;
        kotlin.jvm.internal.o.f(timeText, "$timeText");
        this.f104412e.w(s0Var, this.f104413f, timeText, this.f104415h);
        return false;
    }
}
