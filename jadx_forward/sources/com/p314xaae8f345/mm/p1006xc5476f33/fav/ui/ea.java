package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes3.dex */
public final class ea {

    /* renamed from: a, reason: collision with root package name */
    public final int f182370a;

    /* renamed from: b, reason: collision with root package name */
    public final int f182371b;

    public ea(int i17, int i18) {
        this.f182370a = i17;
        this.f182371b = i18;
    }

    /* renamed from: equals */
    public boolean m55339xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ea)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ea eaVar = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ea) obj;
        return this.f182370a == eaVar.f182370a && this.f182371b == eaVar.f182371b;
    }

    /* renamed from: hashCode */
    public int m55340x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f182370a) * 31) + java.lang.Integer.hashCode(this.f182371b);
    }

    /* renamed from: toString */
    public java.lang.String m55341x9616526c() {
        return "FavSortItem(type=" + this.f182370a + ", count=" + this.f182371b + ')';
    }
}
