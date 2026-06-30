package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class u6 extends com.tencent.mm.plugin.appbrand.launching.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f85224b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f85225c;

    public u6(int i17, boolean z17, java.lang.String str) {
        super(null);
        this.f85223a = i17;
        this.f85224b = z17;
        this.f85225c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.u6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.u6 u6Var = (com.tencent.mm.plugin.appbrand.launching.u6) obj;
        return this.f85223a == u6Var.f85223a && this.f85224b == u6Var.f85224b && kotlin.jvm.internal.o.b(this.f85225c, u6Var.f85225c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f85223a) * 31) + java.lang.Boolean.hashCode(this.f85224b)) * 31;
        java.lang.String str = this.f85225c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LATEST(");
        sb6.append(this.f85223a);
        sb6.append("|forceUpdate:");
        sb6.append(this.f85224b);
        sb6.append("|semver:");
        java.lang.String str = this.f85225c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(')');
        return sb6.toString();
    }

    public /* synthetic */ u6(int i17, boolean z17, java.lang.String str, int i18, kotlin.jvm.internal.i iVar) {
        this((i18 & 1) != 0 ? 0 : i17, (i18 & 2) != 0 ? false : z17, (i18 & 4) != 0 ? null : str);
    }
}
