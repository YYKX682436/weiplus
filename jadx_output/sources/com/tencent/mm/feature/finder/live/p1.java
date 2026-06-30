package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f66862a;

    /* renamed from: b, reason: collision with root package name */
    public final int f66863b;

    public p1(int i17, int i18) {
        this.f66862a = i17;
        this.f66863b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.finder.live.p1)) {
            return false;
        }
        com.tencent.mm.feature.finder.live.p1 p1Var = (com.tencent.mm.feature.finder.live.p1) obj;
        return this.f66862a == p1Var.f66862a && this.f66863b == p1Var.f66863b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f66862a) * 31) + java.lang.Integer.hashCode(this.f66863b);
    }

    public java.lang.String toString() {
        return "RequestAndRefreshActivityIconResult(interval=" + this.f66862a + ", actType=" + this.f66863b + ')';
    }
}
