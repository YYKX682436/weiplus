package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f286352a;

    /* renamed from: b, reason: collision with root package name */
    public int f286353b;

    /* renamed from: c, reason: collision with root package name */
    public float f286354c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa f286355d;

    public l(int i17, int i18, float f17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f17 = (i19 & 4) != 0 ? 0.0f : f17;
        abstractC22098xdb6634aa = (i19 & 8) != 0 ? null : abstractC22098xdb6634aa;
        this.f286352a = i17;
        this.f286353b = i18;
        this.f286354c = f17;
        this.f286355d = abstractC22098xdb6634aa;
    }

    /* renamed from: equals */
    public boolean m80332xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.l)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.l lVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.l) obj;
        return this.f286352a == lVar.f286352a && this.f286353b == lVar.f286353b && java.lang.Float.compare(this.f286354c, lVar.f286354c) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f286355d, lVar.f286355d);
    }

    /* renamed from: hashCode */
    public int m80333x8cdac1b() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f286352a) * 31) + java.lang.Integer.hashCode(this.f286353b)) * 31) + java.lang.Float.hashCode(this.f286354c)) * 31;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.AbstractC22098xdb6634aa abstractC22098xdb6634aa = this.f286355d;
        return hashCode + (abstractC22098xdb6634aa == null ? 0 : abstractC22098xdb6634aa.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m80334x9616526c() {
        return "SwipeState(oldIndex=" + this.f286352a + ", newIndex=" + this.f286353b + ", progress=" + this.f286354c + ", oldCenterView=" + this.f286355d + ')';
    }
}
