package com.tencent.mm.plugin.appbrand.launching;

/* loaded from: classes7.dex */
public final class v6 extends com.tencent.mm.plugin.appbrand.launching.w6 {

    /* renamed from: a, reason: collision with root package name */
    public final int f85263a;

    /* renamed from: b, reason: collision with root package name */
    public final long f85264b;

    public v6(int i17, long j17) {
        super(null);
        this.f85263a = i17;
        this.f85264b = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.w6
    public int a() {
        return this.f85263a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.launching.v6)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.launching.v6 v6Var = (com.tencent.mm.plugin.appbrand.launching.v6) obj;
        return this.f85263a == v6Var.f85263a && this.f85264b == v6Var.f85264b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f85263a) * 31) + java.lang.Long.hashCode(this.f85264b);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6;
        long j17 = this.f85264b;
        int i17 = this.f85263a;
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

    public /* synthetic */ v6(int i17, long j17, int i18, kotlin.jvm.internal.i iVar) {
        this(i17, (i18 & 2) != 0 ? -1L : j17);
    }
}
