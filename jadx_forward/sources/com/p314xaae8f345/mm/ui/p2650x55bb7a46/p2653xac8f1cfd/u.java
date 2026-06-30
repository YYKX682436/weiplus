package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes15.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f281563a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281564b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q f281565c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p f281566d;

    public u(int i17, java.lang.String talker) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f281563a = i17;
        this.f281564b = talker;
    }

    public abstract ot0.q a();

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 b() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q qVar = this.f281565c;
        if (qVar != null) {
            return qVar.f281264a;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17 = c();
        this.f281565c = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q(c17);
        return c17;
    }

    public abstract com.p314xaae8f345.mm.p2621x8fb0427b.f9 c();
}
