package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class gc {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Point f213685a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hc f213686b;

    public gc(android.graphics.Point popupWindowPos, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.hc direction) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(popupWindowPos, "popupWindowPos");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(direction, "direction");
        this.f213685a = popupWindowPos;
        this.f213686b = direction;
    }

    /* renamed from: equals */
    public boolean m62691xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc gcVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gc) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213685a, gcVar.f213685a) && this.f213686b == gcVar.f213686b;
    }

    /* renamed from: hashCode */
    public int m62692x8cdac1b() {
        return (this.f213685a.hashCode() * 31) + this.f213686b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m62693x9616526c() {
        return "PopupMenuUIParams(popupWindowPos=" + this.f213685a + ", direction=" + this.f213686b + ')';
    }
}
