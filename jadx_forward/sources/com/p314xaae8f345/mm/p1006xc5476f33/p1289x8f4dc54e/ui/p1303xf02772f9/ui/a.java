package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui;

/* loaded from: classes4.dex */
public final class a extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.zm f176092d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f176093e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f176094f;

    public a(r45.zm authorizeItem, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorizeItem, "authorizeItem");
        this.f176092d = authorizeItem;
        this.f176093e = z17;
        this.f176094f = z18;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a other = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        if (this.f176093e) {
            return false;
        }
        r45.zm zmVar = this.f176092d;
        int i17 = zmVar.f473736f;
        r45.zm zmVar2 = other.f176092d;
        return (i17 == zmVar2.f473736f) && zmVar.f473735e.equals(zmVar2.f473735e);
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a other = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1303xf02772f9.ui.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    @Override // xm3.a, in5.c
    public int h() {
        return this.f176093e ? 1 : 0;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f176092d.f473737g;
        return str == null ? "" : str;
    }
}
