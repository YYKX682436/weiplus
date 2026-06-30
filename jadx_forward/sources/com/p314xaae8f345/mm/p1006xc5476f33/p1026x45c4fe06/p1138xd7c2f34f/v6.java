package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class v6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166796a;

    /* renamed from: b, reason: collision with root package name */
    public final long f166797b;

    public v6(int i17, long j17) {
        super(null);
        this.f166796a = i17;
        this.f166797b = j17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6
    public int a() {
        return this.f166796a;
    }

    /* renamed from: equals */
    public boolean m51842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6 v6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.v6) obj;
        return this.f166796a == v6Var.f166796a && this.f166797b == v6Var.f166797b;
    }

    /* renamed from: hashCode */
    public int m51843x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f166796a) * 31) + java.lang.Long.hashCode(this.f166797b);
    }

    /* renamed from: toString */
    public java.lang.String m51844x9616526c() {
        java.lang.StringBuilder sb6;
        long j17 = this.f166797b;
        int i17 = this.f166796a;
        if (j17 >= 0) {
            sb6 = new java.lang.StringBuilder("VERSION(");
            sb6.append(i17);
            sb6.append('|');
            sb6.append(j17);
        } else {
            sb6 = new java.lang.StringBuilder("VERSION(");
            sb6.append(i17);
        }
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ v6(int i17, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? -1L : j17);
    }
}
