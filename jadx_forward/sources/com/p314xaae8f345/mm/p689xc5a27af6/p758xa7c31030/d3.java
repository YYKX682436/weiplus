package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes4.dex */
public final class d3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d3 f149087d = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.d3();

    public d3() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("cpu-collect");
        handlerThread.start();
        return new android.os.Handler(handlerThread.getLooper());
    }
}
