package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.k f149234d = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.k();

    public k() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z trigger = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trigger, "$this$trigger");
        java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        long millis = timeUnit.toMillis(90L);
        java.util.LinkedList linkedList = trigger.f149260b;
        linkedList.addFirst(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.r(millis));
        linkedList.addFirst(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.y(true, timeUnit.toMillis(30L)));
        return jz5.f0.f384359a;
    }
}
