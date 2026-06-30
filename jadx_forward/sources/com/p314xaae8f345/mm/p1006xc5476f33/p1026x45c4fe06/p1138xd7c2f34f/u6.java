package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class u6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f166756a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f166757b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f166758c;

    public u6(int i17, boolean z17, java.lang.String str) {
        super(null);
        this.f166756a = i17;
        this.f166757b = z17;
        this.f166758c = str;
    }

    /* renamed from: equals */
    public boolean m51835xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6 u6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u6) obj;
        return this.f166756a == u6Var.f166756a && this.f166757b == u6Var.f166757b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f166758c, u6Var.f166758c);
    }

    /* renamed from: hashCode */
    public int m51836x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f166756a) * 31) + java.lang.Boolean.hashCode(this.f166757b)) * 31;
        java.lang.String str = this.f166758c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m51837x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LATEST(");
        sb6.append(this.f166756a);
        sb6.append("|forceUpdate:");
        sb6.append(this.f166757b);
        sb6.append("|semver:");
        java.lang.String str = this.f166758c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ u6(int i17, boolean z17, java.lang.String str, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? null : str);
    }
}
