package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class rr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f214515a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f214516b;

    /* renamed from: c, reason: collision with root package name */
    public final long f214517c;

    /* renamed from: d, reason: collision with root package name */
    public final long f214518d;

    /* renamed from: e, reason: collision with root package name */
    public final int f214519e;

    public rr(java.lang.String username, java.lang.String nickname, long j17, long j18, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        this.f214515a = username;
        this.f214516b = nickname;
        this.f214517c = j17;
        this.f214518d = j18;
        this.f214519e = i17;
    }

    /* renamed from: equals */
    public boolean m62884xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rr)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rr rrVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rr) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214515a, rrVar.f214515a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214516b, rrVar.f214516b) && this.f214517c == rrVar.f214517c && this.f214518d == rrVar.f214518d && this.f214519e == rrVar.f214519e;
    }

    /* renamed from: hashCode */
    public int m62885x8cdac1b() {
        return (((((((this.f214515a.hashCode() * 31) + this.f214516b.hashCode()) * 31) + java.lang.Long.hashCode(this.f214517c)) * 31) + java.lang.Long.hashCode(this.f214518d)) * 31) + java.lang.Integer.hashCode(this.f214519e);
    }

    /* renamed from: toString */
    public java.lang.String m62886x9616526c() {
        return "MentionContact(username='" + this.f214515a + "', nickname='" + this.f214516b + "', start=" + this.f214517c + ", length=" + this.f214518d + ')';
    }
}
