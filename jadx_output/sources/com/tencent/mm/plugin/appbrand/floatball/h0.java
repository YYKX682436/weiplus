package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class h0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f78098d;

    public h0(yz5.a aVar) {
        this.f78098d = aVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        this.f78098d.invoke();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallTingController", "onEnterPage onEnd");
    }
}
