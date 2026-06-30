package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    public final long f191800a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f191801b;

    public lc(long j17, boolean z17) {
        this.f191800a = j17;
        this.f191801b = z17;
    }

    /* renamed from: equals */
    public boolean m56630xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc lcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.lc) obj;
        return this.f191800a == lcVar.f191800a && this.f191801b == lcVar.f191801b;
    }

    /* renamed from: hashCode */
    public int m56631x8cdac1b() {
        return (java.lang.Long.hashCode(this.f191800a) * 31) + java.lang.Boolean.hashCode(this.f191801b);
    }

    /* renamed from: toString */
    public java.lang.String m56632x9616526c() {
        return "ItemData(content=" + this.f191800a + ", isSelect=" + this.f191801b + ')';
    }
}
