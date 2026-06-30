package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb;

/* loaded from: classes9.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f149259a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f149260b;

    /* renamed from: c, reason: collision with root package name */
    public volatile com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.u f149261c;

    public z(java.lang.String jobTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jobTag, "jobTag");
        this.f149259a = jobTag;
        this.f149260b = new java.util.LinkedList();
    }

    public final void a(long j17) {
        if (!(j17 >= 24)) {
            throw new java.lang.IllegalArgumentException("schedule interval should be greater than 24 hours".toString());
        }
        this.f149261c = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p760xf66bc0bb.u(j17, this.f149259a);
    }
}
