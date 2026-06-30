package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class e0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f150593d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f150594e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Intent intent, boolean z17) {
        super(0);
        this.f150593d = intent;
        this.f150594e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p874xaefb6cc9.f0 f0Var = com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150601a;
        pa1.t b17 = f0Var.b();
        if (b17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.WVAActivityDelegate", "startActivity but runtime is null");
        } else {
            android.content.Context I = b17.I();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(I, "getContext(...)");
            if (!(I instanceof android.app.Activity)) {
                throw new com.p314xaae8f345.wva.p3204x417d0592.C27797x789ae92d(hx5.e.f367244a, "Activity(AppBrandUI) not ready");
            }
            com.p314xaae8f345.mm.p874xaefb6cc9.f0.f150603c = this.f150593d;
            com.p314xaae8f345.mm.p874xaefb6cc9.f0.a(f0Var, I, this.f150593d, this.f150594e);
        }
        return jz5.f0.f384359a;
    }
}
