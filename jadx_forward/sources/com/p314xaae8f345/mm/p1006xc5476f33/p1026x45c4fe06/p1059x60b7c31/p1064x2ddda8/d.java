package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.a {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 f160961d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff f160962e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f160963f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n f160964g;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n0 api, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ff context, java.lang.String key, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.n authWithTimeoutListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authWithTimeoutListener, "authWithTimeoutListener");
        this.f160961d = api;
        this.f160962e = context;
        this.f160963f = key;
        this.f160964g = authWithTimeoutListener;
    }

    /* renamed from: equals */
    public boolean m50594xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d dVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160961d, dVar.f160961d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160962e, dVar.f160962e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160963f, dVar.f160963f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f160964g, dVar.f160964g);
    }

    /* renamed from: hashCode */
    public int m50595x8cdac1b() {
        return (((((this.f160961d.hashCode() * 31) + this.f160962e.m50941x8cdac1b()) * 31) + this.f160963f.hashCode()) * 31) + this.f160964g.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m50596x9616526c() {
        return "Task(api=" + this.f160961d + ", context=" + this.f160962e + ", key=" + this.f160963f + ", authWithTimeoutListener=" + this.f160964g + ')';
    }
}
