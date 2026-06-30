package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class lc {

    /* renamed from: a, reason: collision with root package name */
    public final long f110267a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f110268b;

    public lc(long j17, boolean z17) {
        this.f110267a = j17;
        this.f110268b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.ui.lc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.ui.lc lcVar = (com.tencent.mm.plugin.finder.feed.ui.lc) obj;
        return this.f110267a == lcVar.f110267a && this.f110268b == lcVar.f110268b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f110267a) * 31) + java.lang.Boolean.hashCode(this.f110268b);
    }

    public java.lang.String toString() {
        return "ItemData(content=" + this.f110267a + ", isSelect=" + this.f110268b + ')';
    }
}
