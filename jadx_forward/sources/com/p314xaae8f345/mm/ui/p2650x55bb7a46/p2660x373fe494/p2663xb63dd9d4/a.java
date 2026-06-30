package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f283279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f283280b;

    public a(java.lang.String uniqueId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueId, "uniqueId");
        this.f283279a = uniqueId;
        this.f283280b = i17;
    }

    /* renamed from: equals */
    public boolean m79686xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.a)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.a aVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f283279a, aVar.f283279a) && this.f283280b == aVar.f283280b;
    }

    /* renamed from: hashCode */
    public int m79687x8cdac1b() {
        return (this.f283279a.hashCode() * 31) + java.lang.Integer.hashCode(this.f283280b);
    }

    /* renamed from: toString */
    public java.lang.String m79688x9616526c() {
        return "ContentAnchorInfo(uniqueId=" + this.f283279a + ", pixelOffset=" + this.f283280b + ')';
    }
}
