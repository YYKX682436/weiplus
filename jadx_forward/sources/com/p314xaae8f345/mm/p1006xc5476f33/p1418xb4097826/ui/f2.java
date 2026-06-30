package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class f2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f210649i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f210650m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 currentItem) {
        super(holder, currentItem);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentItem, "currentItem");
        this.f210649i = holder.f3639x46306858.getContext();
        this.f210650m = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.uxd);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s0
    public void b() {
        java.lang.String m75945x2fec8307;
        jz5.l lVar;
        dy1.r rVar;
        this.f184640h.mo48813x58998cd();
        nv2.n1 n1Var = nv2.n1.f422084h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f184637e;
        int g17 = n1Var.g(abstractC14490x69736cb5.getFeedObject().getFeedObject());
        android.content.Context context = this.f210649i;
        if (g17 != 0) {
            lVar = new jz5.l(java.lang.Boolean.FALSE, null);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
            if (abstractC14490x69736cb5.j(context)) {
                m75945x2fec8307 = abstractC14490x69736cb5.D(context);
            } else {
                r45.ru2 m76771x17e42f9f = abstractC14490x69736cb5.getFeedObject().getFeedObject().m76771x17e42f9f();
                m75945x2fec8307 = m76771x17e42f9f != null ? m76771x17e42f9f.m75945x2fec8307(0) : null;
            }
            lVar = new jz5.l(java.lang.Boolean.valueOf(((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) || abstractC14490x69736cb5.getFeedObject().m59315x31740422()) ? false : true), m75945x2fec8307);
        }
        boolean booleanValue = ((java.lang.Boolean) lVar.f384366d).booleanValue();
        java.lang.String str = (java.lang.String) lVar.f384367e;
        if (!booleanValue) {
            c(false);
            return;
        }
        c(true);
        android.widget.TextView textView = this.f210650m;
        if (textView != null) {
            android.text.SpannableString Ui = ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).Ui(textView.getContext(), str, (int) textView.getTextSize(), 1);
            i95.m c17 = i95.n0.c(zy2.s6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(Ui);
            textView.setText(zy2.s6.l6((zy2.s6) c17, Ui, (int) textView.getTextSize(), true, null, 0, false, null, 120, null));
            textView.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "context");
        if (!abstractC14490x69736cb5.j(context) || (rVar = (dy1.r) i95.n0.c(dy1.r.class)) == null || textView == null) {
            return;
        }
        cy1.a aVar = (cy1.a) rVar;
        aVar.pk(textView, "from_finderuin_sns");
        aVar.ik(textView, 32, 25496);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        android.content.Context context2 = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        zy2.ra Sj = ((c61.p2) ybVar).Sj(context2);
        aVar.Ai(textView, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e2(Sj != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) Sj).V6() : null));
    }

    public final void c(boolean z17) {
        android.widget.TextView textView = this.f210650m;
        if (textView == null) {
            return;
        }
        textView.setVisibility(z17 ? 0 : (!((java.lang.Boolean) ((jz5.n) this.f184638f).mo141623x754a37bb()).booleanValue() || this.f184637e.getFeedObject().m59310xb9a58d36()) ? 4 : 8);
    }
}
