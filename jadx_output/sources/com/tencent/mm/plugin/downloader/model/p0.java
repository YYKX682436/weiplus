package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h02.a f97106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f97107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f97108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f97109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.downloader.model.r0 f97110h;

    public p0(com.tencent.mm.plugin.downloader.model.r0 r0Var, h02.a aVar, int i17, android.content.Context context, boolean z17) {
        this.f97110h = r0Var;
        this.f97106d = aVar;
        this.f97107e = i17;
        this.f97108f = context;
        this.f97109g = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.network.s sVar;
        com.tencent.mm.modelbase.r1 r1Var = gm0.j1.n().f273288b;
        if (r1Var == null || (sVar = r1Var.f70764d) == null) {
            return;
        }
        new com.tencent.mm.modelsimple.n1(this.f97106d.field_packageName, this.f97107e).doScene(sVar, new com.tencent.mm.plugin.downloader.model.o0(this));
    }
}
