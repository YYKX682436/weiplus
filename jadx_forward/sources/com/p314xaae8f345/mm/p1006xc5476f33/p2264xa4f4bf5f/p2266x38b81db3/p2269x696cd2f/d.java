package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class d extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final nj4.e f254797d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f254798e;

    /* renamed from: f, reason: collision with root package name */
    public final int f254799f;

    /* renamed from: g, reason: collision with root package name */
    public final mj4.h f254800g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f254801h;

    public d(nj4.e groupItem, java.lang.String userName, int i17, mj4.h hVar, java.util.List list, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        hVar = (i18 & 8) != 0 ? null : hVar;
        list = (i18 & 16) != 0 ? null : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(groupItem, "groupItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        this.f254797d = groupItem;
        this.f254798e = userName;
        this.f254799f = i17;
        this.f254800g = hVar;
        this.f254801h = list;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d other = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        java.lang.String str = this.f254798e;
        java.lang.String str2 = other.f254798e;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, str2) && this.f254799f == other.f254799f && nj4.f.a(this.f254800g, other.f254800g);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d other = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f254798e.hashCode();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return this.f254798e;
    }
}
