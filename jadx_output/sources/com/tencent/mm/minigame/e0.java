package com.tencent.mm.minigame;

/* loaded from: classes7.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f69060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f69061e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Intent intent, boolean z17) {
        super(0);
        this.f69060d = intent;
        this.f69061e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.minigame.f0 f0Var = com.tencent.mm.minigame.f0.f69068a;
        pa1.t b17 = f0Var.b();
        if (b17 == null) {
            com.tencent.mars.xlog.Log.w("WVA.WVAActivityDelegate", "startActivity but runtime is null");
        } else {
            android.content.Context I = b17.I();
            kotlin.jvm.internal.o.f(I, "getContext(...)");
            if (!(I instanceof android.app.Activity)) {
                throw new com.tencent.wva.hostsdk.WVAException(hx5.e.f285711a, "Activity(AppBrandUI) not ready");
            }
            com.tencent.mm.minigame.f0.f69070c = this.f69060d;
            com.tencent.mm.minigame.f0.a(f0Var, I, this.f69060d, this.f69061e);
        }
        return jz5.f0.f302826a;
    }
}
