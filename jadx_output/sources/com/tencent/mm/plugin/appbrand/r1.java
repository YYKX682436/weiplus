package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class r1 implements com.tencent.mm.ipcinvoker.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f87742a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f87743b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f87744c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l81.v0 f87745d;

    public r1(java.lang.String str, int i17, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, l81.v0 v0Var) {
        this.f87742a = str;
        this.f87743b = i17;
        this.f87744c = atomicBoolean;
        this.f87745d = v0Var;
    }

    @Override // com.tencent.mm.ipcinvoker.s0
    public void a() {
        l81.v0 v0Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindRemoteService onRemoteProcessDied(");
        java.lang.String str = this.f87742a;
        sb6.append(str);
        sb6.append("), id:");
        sb6.append(this.f87743b);
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPreRenderColdStartService", sb6.toString());
        if (!this.f87744c.getAndSet(true) && (v0Var = this.f87745d) != null) {
            l81.v0.b(v0Var, -5, null, 2, null);
        }
        com.tencent.mm.ipcinvoker.d0.i(str, this);
    }
}
