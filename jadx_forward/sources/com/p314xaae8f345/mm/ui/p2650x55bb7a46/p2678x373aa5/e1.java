package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* loaded from: classes3.dex */
public final class e1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f284442a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f284443b;

    public e1(java.util.List cardsInOrder, java.util.LinkedHashMap startViewsById) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardsInOrder, "cardsInOrder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(startViewsById, "startViewsById");
        this.f284442a = cardsInOrder;
        this.f284443b = startViewsById;
    }

    /* renamed from: equals */
    public boolean m79891xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1 e1Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.e1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284442a, e1Var.f284442a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f284443b, e1Var.f284443b);
    }

    /* renamed from: hashCode */
    public int m79892x8cdac1b() {
        return (this.f284442a.hashCode() * 31) + this.f284443b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m79893x9616526c() {
        return "FoldedSnap(cardsInOrder=" + this.f284442a + ", startViewsById=" + this.f284443b + ')';
    }
}
