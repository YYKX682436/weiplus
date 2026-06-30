package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jc {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f188626a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f188627b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.tl6 f188628c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.a31 f188629d;

    public jc(boolean z17, java.util.LinkedList linkedList, r45.tl6 tl6Var, r45.a31 a31Var) {
        this.f188626a = z17;
        this.f188627b = linkedList;
        this.f188628c = tl6Var;
        this.f188629d = a31Var;
    }

    /* renamed from: equals */
    public boolean m56073xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc jcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.jc) obj;
        return this.f188626a == jcVar.f188626a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188627b, jcVar.f188627b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188628c, jcVar.f188628c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188629d, jcVar.f188629d);
    }

    /* renamed from: hashCode */
    public int m56074x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f188626a) * 31;
        java.util.LinkedList linkedList = this.f188627b;
        int hashCode2 = (hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31;
        r45.tl6 tl6Var = this.f188628c;
        int hashCode3 = (hashCode2 + (tl6Var == null ? 0 : tl6Var.hashCode())) * 31;
        r45.a31 a31Var = this.f188629d;
        return hashCode3 + (a31Var != null ? a31Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56075x9616526c() {
        return "GetFinderFeedLikedListData(success=" + this.f188626a + ", likeList=" + this.f188627b + ", redPackageInfo=" + this.f188628c + ", likedListCommInfo=" + this.f188629d + ')';
    }
}
