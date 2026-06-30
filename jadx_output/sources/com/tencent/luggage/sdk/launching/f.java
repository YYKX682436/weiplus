package com.tencent.luggage.sdk.launching;

/* loaded from: classes7.dex */
public final class f extends com.tencent.luggage.sdk.launching.h {

    /* renamed from: e, reason: collision with root package name */
    public final int f47612e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f47613f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f47614g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public f(int i17, java.lang.String str) {
        this.f47612e = i17;
        this.f47613f = str;
    }

    @Override // com.tencent.luggage.sdk.launching.h
    public void a(android.os.Parcelable parcelable) {
        b(new com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage(this.f47612e, 1, parcelable, null, null, 24, null));
    }

    public final void b(com.tencent.luggage.sdk.launching.OnWXAppResultXPCMessage onWXAppResultXPCMessage) {
        java.lang.String str = this.f47613f;
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnWXAppResultEventSender", "sendMessage, processName empty, message:" + onWXAppResultXPCMessage.f47601e);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.x2.o(this.f47613f)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OnWXAppResultEventSender", "sendMessage, process dead, message:" + onWXAppResultXPCMessage.f47601e + ", processName:" + this.f47613f + ", instance:" + this.f47612e);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.OnWXAppResultEventSender", "sendMessage, " + onWXAppResultXPCMessage.f47602f + ", instance:" + onWXAppResultXPCMessage.f47600d + ", action:" + onWXAppResultXPCMessage.f47601e);
        com.tencent.luggage.sdk.launching.e eVar = new com.tencent.luggage.sdk.launching.e(this, onWXAppResultXPCMessage);
        boolean g17 = com.tencent.mm.ipcinvoker.d0.g(this.f47613f);
        if (!kotlin.jvm.internal.o.b(android.os.Looper.getMainLooper(), android.os.Looper.myLooper()) || g17) {
            eVar.invoke();
        } else {
            ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.luggage.sdk.launching.c(eVar));
        }
    }
}
