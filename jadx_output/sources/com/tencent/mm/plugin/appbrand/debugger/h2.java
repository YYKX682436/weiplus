package com.tencent.mm.plugin.appbrand.debugger;

/* loaded from: classes7.dex */
public class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.debugger.l2 f77764d;

    public h2(com.tencent.mm.plugin.appbrand.debugger.l2 l2Var) {
        this.f77764d = l2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.debugger.l2 l2Var = this.f77764d;
        com.tencent.mm.plugin.appbrand.debugger.l2.b(l2Var);
        android.content.Context context = l2Var.getContext();
        com.tencent.mm.plugin.appbrand.debugger.a1 a1Var = l2Var.f77783d;
        l2Var.f77789m.setText(context.getString(com.tencent.mm.R.string.f490271qb, java.lang.Integer.valueOf(a1Var.f77615q.size()), java.lang.Integer.valueOf(a1Var.f77614p.size()), java.lang.Long.valueOf(a1Var.f77621w)));
    }
}
