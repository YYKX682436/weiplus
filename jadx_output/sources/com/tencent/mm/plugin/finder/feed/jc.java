package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f107093a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f107094b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.tl6 f107095c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.a31 f107096d;

    public jc(boolean z17, java.util.LinkedList linkedList, r45.tl6 tl6Var, r45.a31 a31Var) {
        this.f107093a = z17;
        this.f107094b = linkedList;
        this.f107095c = tl6Var;
        this.f107096d = a31Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.finder.feed.jc)) {
            return false;
        }
        com.tencent.mm.plugin.finder.feed.jc jcVar = (com.tencent.mm.plugin.finder.feed.jc) obj;
        return this.f107093a == jcVar.f107093a && kotlin.jvm.internal.o.b(this.f107094b, jcVar.f107094b) && kotlin.jvm.internal.o.b(this.f107095c, jcVar.f107095c) && kotlin.jvm.internal.o.b(this.f107096d, jcVar.f107096d);
    }

    public int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.f107093a) * 31;
        java.util.LinkedList linkedList = this.f107094b;
        int hashCode2 = (hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31;
        r45.tl6 tl6Var = this.f107095c;
        int hashCode3 = (hashCode2 + (tl6Var == null ? 0 : tl6Var.hashCode())) * 31;
        r45.a31 a31Var = this.f107096d;
        return hashCode3 + (a31Var != null ? a31Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GetFinderFeedLikedListData(success=" + this.f107093a + ", likeList=" + this.f107094b + ", redPackageInfo=" + this.f107095c + ", likedListCommInfo=" + this.f107096d + ')';
    }
}
