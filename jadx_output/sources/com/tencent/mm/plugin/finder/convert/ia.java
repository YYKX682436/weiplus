package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ia implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103652d;

    public ia(in5.s0 s0Var) {
        this.f103652d = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        in5.s0 s0Var = this.f103652d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC finderHorizontalVideoDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderHorizontalVideoDrawerUIC.class);
        if (finderHorizontalVideoDrawerUIC != null) {
            finderHorizontalVideoDrawerUIC.U6(s0Var);
        }
    }
}
