package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class f9 {

    /* renamed from: a, reason: collision with root package name */
    public final long f102173a;

    /* renamed from: b, reason: collision with root package name */
    public int f102174b;

    /* renamed from: c, reason: collision with root package name */
    public int f102175c;

    public f9(long j17, int i17, int i18) {
        this.f102173a = j17;
        this.f102174b = i17;
        this.f102175c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.assist.f9)) {
            return false;
        }
        com.tencent.mm.plugin.finder.assist.f9 f9Var = (com.tencent.mm.plugin.finder.assist.f9) obj;
        return this.f102173a == f9Var.f102173a && this.f102174b == f9Var.f102174b && this.f102175c == f9Var.f102175c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f102173a) * 31) + java.lang.Integer.hashCode(this.f102174b)) * 31) + java.lang.Integer.hashCode(this.f102175c);
    }

    public java.lang.String toString() {
        return "PlayTimeCostRecord(clickTime=" + this.f102173a + ", clickToPlayTimeCost=" + this.f102174b + ", selectToPlayTimeCost=" + this.f102175c + ')';
    }
}
