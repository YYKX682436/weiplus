package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f188891a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f188892b;

    /* renamed from: c, reason: collision with root package name */
    public final r45.tl6 f188893c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.a31 f188894d;

    public m7(boolean z17, java.util.LinkedList linkedList, r45.tl6 tl6Var, r45.a31 a31Var) {
        this.f188891a = z17;
        this.f188892b = linkedList;
        this.f188893c = tl6Var;
        this.f188894d = a31Var;
    }

    /* renamed from: equals */
    public boolean m56087xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7 m7Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.m7) obj;
        return this.f188891a == m7Var.f188891a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188892b, m7Var.f188892b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188893c, m7Var.f188893c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f188894d, m7Var.f188894d);
    }

    /* renamed from: hashCode */
    public int m56088x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f188891a) * 31;
        java.util.LinkedList linkedList = this.f188892b;
        int hashCode2 = (hashCode + (linkedList == null ? 0 : linkedList.hashCode())) * 31;
        r45.tl6 tl6Var = this.f188893c;
        int hashCode3 = (hashCode2 + (tl6Var == null ? 0 : tl6Var.hashCode())) * 31;
        r45.a31 a31Var = this.f188894d;
        return hashCode3 + (a31Var != null ? a31Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m56089x9616526c() {
        return "CgiGetFinderFeedFavedListData(success=" + this.f188891a + ", favList=" + this.f188892b + ", redPackageInfo=" + this.f188893c + ", likedListCommInfo=" + this.f188894d + ')';
    }
}
