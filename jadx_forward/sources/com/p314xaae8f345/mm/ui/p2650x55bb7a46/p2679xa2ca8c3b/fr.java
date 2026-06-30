package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class fr {

    /* renamed from: a, reason: collision with root package name */
    public final int f285526a;

    /* renamed from: b, reason: collision with root package name */
    public final int f285527b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f285528c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Class f285529d;

    /* renamed from: e, reason: collision with root package name */
    public final int f285530e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f285531f;

    public fr(int i17, int i18, boolean z17, java.lang.Class clazz, int i19, yz5.l isSupport) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isSupport, "isSupport");
        this.f285526a = i17;
        this.f285527b = i18;
        this.f285528c = z17;
        this.f285529d = clazz;
        this.f285530e = i19;
        this.f285531f = isSupport;
    }

    /* renamed from: equals */
    public boolean m80044xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fr)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fr frVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.fr) obj;
        return this.f285526a == frVar.f285526a && this.f285527b == frVar.f285527b && this.f285528c == frVar.f285528c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285529d, frVar.f285529d) && this.f285530e == frVar.f285530e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f285531f, frVar.f285531f);
    }

    /* renamed from: hashCode */
    public int m80045x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f285526a) * 31) + java.lang.Integer.hashCode(this.f285527b)) * 31) + java.lang.Boolean.hashCode(this.f285528c)) * 31) + this.f285529d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f285530e)) * 31) + this.f285531f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m80046x9616526c() {
        return "ChattingItemTypeWrapper(msgType=" + this.f285526a + ", subType=" + this.f285527b + ", isFrom=" + this.f285528c + ", clazz=" + this.f285529d + ", conditionIndex=" + this.f285530e + ", isSupport=" + this.f285531f + ')';
    }
}
