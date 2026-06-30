package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29;

/* loaded from: classes14.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f258222a;

    /* renamed from: b, reason: collision with root package name */
    public final long f258223b;

    /* renamed from: c, reason: collision with root package name */
    public final long f258224c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f258225d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f258226e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f258227f;

    public k0(long j17, long j18, long j19, java.lang.String str, boolean z17, boolean z18) {
        this.f258222a = j17;
        this.f258223b = j18;
        this.f258224c = j19;
        this.f258225d = str;
        this.f258226e = z17;
        this.f258227f = z18;
    }

    /* renamed from: equals */
    public boolean m72756xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0 k0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.k0) obj;
        return this.f258222a == k0Var.f258222a && this.f258223b == k0Var.f258223b && this.f258224c == k0Var.f258224c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f258225d, k0Var.f258225d) && this.f258226e == k0Var.f258226e && this.f258227f == k0Var.f258227f;
    }

    /* renamed from: hashCode */
    public int m72757x8cdac1b() {
        int hashCode = ((((java.lang.Long.hashCode(this.f258222a) * 31) + java.lang.Long.hashCode(this.f258223b)) * 31) + java.lang.Long.hashCode(this.f258224c)) * 31;
        java.lang.String str = this.f258225d;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f258226e)) * 31) + java.lang.Boolean.hashCode(this.f258227f);
    }

    /* renamed from: toString */
    public java.lang.String m72758x9616526c() {
        return "VoIPInfo(roomId=" + this.f258222a + ", roomKey=" + this.f258223b + ", inviteId=" + this.f258224c + ", talkerName=" + this.f258225d + ", videoRoom=" + this.f258226e + ", outCall=" + this.f258227f + ')';
    }
}
