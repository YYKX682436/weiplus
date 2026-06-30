package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j60 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 f216350a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f216351b;

    /* renamed from: c, reason: collision with root package name */
    public final float f216352c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f216353d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f216354e;

    public j60(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60 layout, java.util.List viewsToHide, float f17, yz5.l lVar, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewsToHide, "viewsToHide");
        this.f216350a = layout;
        this.f216351b = viewsToHide;
        this.f216352c = f17;
        this.f216353d = lVar;
        this.f216354e = aVar;
    }

    /* renamed from: equals */
    public boolean m63155xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j60)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j60 j60Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j60) obj;
        return this.f216350a == j60Var.f216350a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216351b, j60Var.f216351b) && java.lang.Float.compare(this.f216352c, j60Var.f216352c) == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216353d, j60Var.f216353d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f216354e, j60Var.f216354e);
    }

    /* renamed from: hashCode */
    public int m63156x8cdac1b() {
        int hashCode = ((((this.f216350a.hashCode() * 31) + this.f216351b.hashCode()) * 31) + java.lang.Float.hashCode(this.f216352c)) * 31;
        yz5.l lVar = this.f216353d;
        int hashCode2 = (hashCode + (lVar == null ? 0 : lVar.hashCode())) * 31;
        yz5.a aVar = this.f216354e;
        return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m63157x9616526c() {
        return "PanelConfig(layout=" + this.f216350a + ", viewsToHide=" + this.f216351b + ", currentSpeed=" + this.f216352c + ", onSpeedSelected=" + this.f216353d + ", onPanelDismiss=" + this.f216354e + ')';
    }
}
