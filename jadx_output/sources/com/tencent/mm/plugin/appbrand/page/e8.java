package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class e8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f86567d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.android.RenderMode f86568e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f86570g;

    public e8(com.tencent.mm.plugin.appbrand.page.n7 n7Var, io.flutter.embedding.android.RenderMode renderMode, java.lang.Runnable runnable) {
        this.f86570g = n7Var;
        this.f86568e = renderMode;
        this.f86569f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        gf.o1 a17;
        df.a0 a0Var;
        if (this.f86567d.getAndSet(true)) {
            return;
        }
        com.tencent.mm.plugin.appbrand.page.n7 n7Var = this.f86570g;
        com.tencent.mm.plugin.appbrand.o6 runtime = n7Var.getRuntime();
        gf.m1 m1Var = gf.o1.f271155b;
        synchronized (gf.o1.class) {
            a17 = gf.o1.f271155b.a(runtime);
        }
        int b27 = n7Var.b2();
        io.flutter.embedding.android.RenderMode renderMode = this.f86568e;
        kotlin.jvm.internal.o.g(renderMode, "renderMode");
        df.w1 w1Var = (df.w1) a17.f271157a.get(b27);
        if (w1Var != null && (a0Var = w1Var.f229585i) != null) {
            a0Var.k(renderMode, this);
        }
        if (n7Var.getContentView() == null) {
            return;
        }
        this.f86569f.run();
    }
}
