package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f107358a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f107359b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.tl6 f107360c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.a31 f107361d;

    public m7(boolean z17, java.util.LinkedList linkedList, r45.tl6 tl6Var, r45.a31 a31Var) {
        this.f107358a = z17;
        this.f107359b = linkedList;
        this.f107360c = tl6Var;
        this.f107361d = a31Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.m7)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.m7 m7Var = (com.tencent.mm.plugin.finder.feed.m7) obj;
        return this.f107358a == m7Var.f107358a && kotlin.jvm.internal.o.b(this.f107359b, m7Var.f107359b) && kotlin.jvm.internal.o.b(this.f107360c, m7Var.f107360c) && kotlin.jvm.internal.o.b(this.f107361d, m7Var.f107361d);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f107358a) * 31;
        java.util.LinkedList linkedList = this.f107359b;
        int hashCode2 = (hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31;
        r45.tl6 tl6Var = this.f107360c;
        int hashCode3 = (hashCode2 + (tl6Var == null ? 0 : tl6Var.hashCode())) * 31;
        r45.a31 a31Var = this.f107361d;
        return hashCode3 + (a31Var != null ? a31Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CgiGetFinderFeedFavedListData(success=" + this.f107358a + ", favList=" + this.f107359b + ", redPackageInfo=" + this.f107360c + ", likedListCommInfo=" + this.f107361d + ')';
    }
}
