package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes10.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f108791a;

    /* renamed from: b, reason: collision with root package name */
    public final long f108792b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.wy0 f108793c;

    public q2(java.lang.String enterSessionId, long j17, r45.wy0 wy0Var) {
        kotlin.jvm.internal.o.g(enterSessionId, "enterSessionId");
        this.f108791a = enterSessionId;
        this.f108792b = j17;
        this.f108793c = wy0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.q2)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.q2 q2Var = (com.tencent.mm.plugin.finder.feed.q2) obj;
        return kotlin.jvm.internal.o.b(this.f108791a, q2Var.f108791a) && this.f108792b == q2Var.f108792b && kotlin.jvm.internal.o.b(this.f108793c, q2Var.f108793c);
    }

    public int hashCode() {
        int hashCode = ((this.f108791a.hashCode() * 31) + java.lang.Long.hashCode(this.f108792b)) * 31;
        r45.wy0 wy0Var = this.f108793c;
        return hashCode + (wy0Var == null ? 0 : wy0Var.hashCode());
    }

    public java.lang.String toString() {
        return "FinderCommentTitleBarCacheInfo(enterSessionId=" + this.f108791a + ", requestId=" + this.f108792b + ", titleBarInfo=" + this.f108793c + ')';
    }
}
