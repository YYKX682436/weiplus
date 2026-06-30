package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class k4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k4 f203293d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.k4();

    public k4() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.content.Context context = view.getContext();
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) || ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).mo78538xecd98af8()) {
            return java.lang.Boolean.FALSE;
        }
        dp2.a aVar = dp2.a.f323716a;
        boolean z17 = false;
        boolean z18 = !aVar.b(0, view, 0.5f);
        boolean z19 = !aVar.b(1, view, 0.5f);
        if (z18 && z19) {
            z17 = true;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
