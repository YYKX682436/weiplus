package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    public final so2.n1 f185021a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f185022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f185023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f185024d;

    /* renamed from: e, reason: collision with root package name */
    public final int f185025e;

    public gi(so2.n1 placeHolderFeed, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 recommendPlayFeed, int i17, int i18, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeHolderFeed, "placeHolderFeed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recommendPlayFeed, "recommendPlayFeed");
        this.f185021a = placeHolderFeed;
        this.f185022b = recommendPlayFeed;
        this.f185023c = i17;
        this.f185024d = i18;
        this.f185025e = i19;
    }

    /* renamed from: equals */
    public boolean m55676xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi giVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gi) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f185021a, giVar.f185021a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f185022b, giVar.f185022b) && this.f185023c == giVar.f185023c && this.f185024d == giVar.f185024d && this.f185025e == giVar.f185025e;
    }

    /* renamed from: hashCode */
    public int m55677x8cdac1b() {
        return (((((((((int) this.f185021a.mo2128x1ed62e84()) * 31) + this.f185022b.m58305x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f185023c)) * 31) + java.lang.Integer.hashCode(this.f185024d)) * 31) + java.lang.Integer.hashCode(this.f185025e);
    }

    /* renamed from: toString */
    public java.lang.String m55678x9616526c() {
        return "SocialHotViewTag(placeHolderFeed=" + this.f185021a + ", recommendPlayFeed=" + this.f185022b + ", placeHolderPosition=" + this.f185023c + ", targetTabType=" + this.f185024d + ", showType=" + this.f185025e + ')';
    }
}
