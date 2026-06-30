package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes9.dex */
public final class a3 implements tg3.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f164643a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f164644b;

    public a3(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.Runnable runnable) {
        this.f164643a = f0Var;
        this.f164644b = runnable;
    }

    @Override // tg3.z0
    public final void a() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f164643a;
        int i17 = f0Var.f391649d - 1;
        f0Var.f391649d = i17;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareVideoMessage", "doShareVideoAfterSelectConversation, send video done");
            this.f164644b.run();
        }
    }
}
