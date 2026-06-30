package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes9.dex */
public final class k8 implements tg3.z0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f225178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f225179b;

    public k8(java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.lang.Runnable runnable) {
        this.f225178a = f0Var;
        this.f225179b = runnable;
    }

    @Override // tg3.z0
    public final void a() {
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f225178a;
        int i17 = f0Var.f391649d - 1;
        f0Var.f391649d = i17;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppSendVideoMessage", "doShareVideoAfterSelectConversation, send video done");
            this.f225179b.run();
        }
    }
}
