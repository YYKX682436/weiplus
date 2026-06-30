package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f284433a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 f284434b;

    public d1(java.lang.String uniqueId, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.w2 snapshot) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snapshot, "snapshot");
        this.f284433a = uniqueId;
        this.f284434b = snapshot;
    }

    /* renamed from: equals */
    public boolean m79888xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1 d1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.d1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284433a, d1Var.f284433a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284434b, d1Var.f284434b);
    }

    /* renamed from: hashCode */
    public int m79889x8cdac1b() {
        return (this.f284433a.hashCode() * 31) + this.f284434b.m79921x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m79890x9616526c() {
        return "CardSnap(uniqueId=" + this.f284433a + ", snapshot=" + this.f284434b + ')';
    }
}
