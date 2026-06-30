package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f150595a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f150596b;

    /* renamed from: c, reason: collision with root package name */
    public final int f150597c;

    /* renamed from: d, reason: collision with root package name */
    public final long f150598d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f150599e;

    public e1(boolean z17, java.lang.String pkgPath, int i17, long j17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgPath, "pkgPath");
        this.f150595a = z17;
        this.f150596b = pkgPath;
        this.f150597c = i17;
        this.f150598d = j17;
        this.f150599e = z18;
    }

    /* renamed from: equals */
    public boolean m46915xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p874xaefb6cc9.e1)) {
            return false;
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.e1 e1Var = (com.p314xaae8f345.mm.p874xaefb6cc9.e1) obj;
        return this.f150595a == e1Var.f150595a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150596b, e1Var.f150596b) && this.f150597c == e1Var.f150597c && this.f150598d == e1Var.f150598d && this.f150599e == e1Var.f150599e;
    }

    /* renamed from: hashCode */
    public int m46916x8cdac1b() {
        return (((((((java.lang.Boolean.hashCode(this.f150595a) * 31) + this.f150596b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f150597c)) * 31) + java.lang.Long.hashCode(this.f150598d)) * 31) + java.lang.Boolean.hashCode(this.f150599e);
    }

    /* renamed from: toString */
    public java.lang.String m46917x9616526c() {
        return "ModulePkgResult(exists=" + this.f150595a + ", pkgPath=" + this.f150596b + ", pkgVersion=" + this.f150597c + ", pkgSize=" + this.f150598d + ", hasOldVersion=" + this.f150599e + ')';
    }

    public /* synthetic */ e1(boolean z17, java.lang.String str, int i17, long j17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(z17, (i18 & 2) != 0 ? "" : str, (i18 & 4) != 0 ? 0 : i17, (i18 & 8) != 0 ? 0L : j17, (i18 & 16) != 0 ? false : z18);
    }
}
