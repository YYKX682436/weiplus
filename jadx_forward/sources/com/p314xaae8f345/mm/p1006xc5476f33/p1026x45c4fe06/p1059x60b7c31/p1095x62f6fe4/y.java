package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f163678a;

    public y(java.lang.String str) {
        super(null);
        this.f163678a = str;
    }

    /* renamed from: equals */
    public boolean m51109xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f163678a, ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y) obj).f163678a);
    }

    /* renamed from: hashCode */
    public int m51110x8cdac1b() {
        java.lang.String str = this.f163678a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m51111x9616526c() {
        return "FAILED(message=" + this.f163678a + ')';
    }
}
