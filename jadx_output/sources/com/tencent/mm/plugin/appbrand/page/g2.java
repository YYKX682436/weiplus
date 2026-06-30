package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public class g2 extends com.tencent.mm.plugin.appbrand.page.k2 {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f86630g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.wd f86631h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f86632i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.y1 f86633m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(com.tencent.mm.plugin.appbrand.page.y1 y1Var, java.lang.String str, long j17, com.tencent.mm.plugin.appbrand.page.wd wdVar, java.lang.Runnable runnable) {
        super(str);
        this.f86633m = y1Var;
        this.f86630g = j17;
        this.f86631h = wdVar;
        this.f86632i = runnable;
    }

    @Override // com.tencent.mm.plugin.appbrand.page.k2
    public void a() {
        com.tencent.mm.plugin.appbrand.page.y1.O(this.f86633m, this.f86630g, this.f86816d, this.f86631h);
        java.lang.Runnable runnable = this.f86632i;
        if (runnable != null) {
            runnable.run();
        }
    }
}
