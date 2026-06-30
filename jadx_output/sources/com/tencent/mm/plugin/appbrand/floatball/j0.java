package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public final class j0 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f78105d;

    public j0(yz5.a aVar) {
        this.f78105d = aVar;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        this.f78105d.invoke();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandFloatBallTingController", "onExitPage onEnd");
    }
}
