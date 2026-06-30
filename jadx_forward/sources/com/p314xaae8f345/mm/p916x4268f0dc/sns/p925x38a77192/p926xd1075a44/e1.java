package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f151471a;

    /* renamed from: b, reason: collision with root package name */
    public final long f151472b;

    public e1(java.lang.Object obj, long j17) {
        this.f151471a = obj;
        this.f151472b = j17;
    }

    /* renamed from: equals */
    public boolean m47493xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1)) {
            return false;
        }
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1 e1Var = (com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.e1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f151471a, e1Var.f151471a) && this.f151472b == e1Var.f151472b;
    }

    /* renamed from: hashCode */
    public int m47494x8cdac1b() {
        java.lang.Object obj = this.f151471a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + java.lang.Long.hashCode(this.f151472b);
    }

    /* renamed from: toString */
    public java.lang.String m47495x9616526c() {
        return "MusicSearchDataWrapper(data=" + this.f151471a + ", recId=" + this.f151472b + ')';
    }
}
