package com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui;

/* loaded from: classes3.dex */
public final class a implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f258468d;

    /* renamed from: e, reason: collision with root package name */
    public int f258469e;

    public a(java.lang.String key, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f258468d = key;
        this.f258469e = i17;
    }

    /* renamed from: equals */
    public boolean m72874xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f258468d, aVar.f258468d) && this.f258469e == aVar.f258469e;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    /* renamed from: hashCode */
    public int m72875x8cdac1b() {
        return (this.f258468d.hashCode() * 31) + java.lang.Integer.hashCode(this.f258469e);
    }

    /* renamed from: toString */
    public java.lang.String m72876x9616526c() {
        return "BeautyParams(key=" + this.f258468d + ", value=" + this.f258469e + ')';
    }
}
