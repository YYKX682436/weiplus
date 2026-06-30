package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class gk implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ik f103494d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f103495e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f103496f;

    public gk(com.tencent.mm.plugin.finder.convert.ik ikVar, kotlin.jvm.internal.c0 c0Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f103494d = ikVar;
        this.f103495e = c0Var;
        this.f103496f = recyclerView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.convert.ik ikVar = this.f103494d;
        android.view.View view = ikVar.f103675g;
        if (view != null) {
            kotlin.jvm.internal.c0 c0Var = this.f103495e;
            if (c0Var.f310112d || !view.getGlobalVisibleRect(ikVar.f103673e) || ikVar.f103673e.height() < view.getHeight() || view.getHeight() <= 0) {
                c0Var.f310112d = false;
                return;
            }
            android.content.Context context = this.f103496f.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            boolean z17 = xy2.c.e(context).length() > 0;
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = 1;
            objArr[1] = java.lang.Integer.valueOf(z17 ? 1 : 2);
            objArr[2] = 2;
            g0Var.d(20971, objArr);
            c0Var.f310112d = true;
        }
    }
}
