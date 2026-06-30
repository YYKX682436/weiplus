package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes8.dex */
public final class ff {

    /* renamed from: a, reason: collision with root package name */
    public int f255414a;

    /* renamed from: b, reason: collision with root package name */
    public int f255415b;

    public ff(int i17, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i19 & 1) != 0 ? 0 : i17;
        i18 = (i19 & 2) != 0 ? 0 : i18;
        this.f255414a = i17;
        this.f255415b = i18;
    }

    /* renamed from: equals */
    public boolean m71871xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff ffVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ff) obj;
        return this.f255414a == ffVar.f255414a && this.f255415b == ffVar.f255415b;
    }

    /* renamed from: hashCode */
    public int m71872x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f255414a) * 31) + java.lang.Integer.hashCode(this.f255415b);
    }

    /* renamed from: toString */
    public java.lang.String m71873x9616526c() {
        return "RedInfo(showType=" + this.f255414a + ", count=" + this.f255415b + ')';
    }
}
