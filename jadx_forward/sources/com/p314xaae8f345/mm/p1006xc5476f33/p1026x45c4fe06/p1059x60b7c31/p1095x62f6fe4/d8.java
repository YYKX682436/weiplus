package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes5.dex */
public final class d8 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f163307a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f163308b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 f163309c;

    public d8(long j17, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var) {
        this.f163307a = j17;
        this.f163308b = z17;
        this.f163309c = r1Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.s1
    public boolean a() {
        return this.f163308b;
    }

    /* renamed from: equals */
    public boolean m51055xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8 d8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.d8) obj;
        return this.f163307a == d8Var.f163307a && this.f163308b == d8Var.f163308b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f163309c, d8Var.f163309c);
    }

    /* renamed from: hashCode */
    public int m51056x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f163307a) * 31) + java.lang.Boolean.hashCode(this.f163308b)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 r1Var = this.f163309c;
        return hashCode + (r1Var == null ? 0 : r1Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51057x9616526c() {
        return "Session(sessionId=" + this.f163307a + ", gainFocus=" + this.f163308b + ", onAudioFocusChange=" + this.f163309c + ')';
    }
}
