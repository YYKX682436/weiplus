package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.w2 f87052e;

    public r2(com.tencent.mm.plugin.appbrand.page.w2 w2Var, java.lang.Runnable runnable) {
        this.f87052e = w2Var;
        this.f87051d = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f87052e.N(this.f87051d);
    }
}
