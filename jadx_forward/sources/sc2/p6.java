package sc2;

/* loaded from: classes2.dex */
public final class p6 {
    public p6(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(ad2.h observer, in5.s0 holder, android.view.View view, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        long mo2128x1ed62e84 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L;
        java.lang.String u17 = pm0.v.u(mo2128x1ed62e84);
        view.setOnClickListener(new sc2.n6(holder, view, u17, infoEx, observer));
        ym5.a1.h(view, new sc2.o6(infoEx, observer, u17, holder, mo2128x1ed62e84));
    }
}
