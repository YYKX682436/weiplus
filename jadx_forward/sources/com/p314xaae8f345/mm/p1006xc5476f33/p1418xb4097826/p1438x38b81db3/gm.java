package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class gm extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.axw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.g2 item = (so2.g2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePurchaseListConvert", "bind view ");
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.d5j);
        r45.s11 s11Var = item.f491892d;
        java.lang.String m75945x2fec8307 = s11Var.m75945x2fec8307(9);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        if (p17 != null) {
            g1Var.f().c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f), (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) p17, g1Var.h(mn2.f1.f411486d));
        }
        vo0.d a17 = g1Var.a();
        java.lang.String m75945x2fec83072 = s11Var.m75945x2fec8307(2);
        if (m75945x2fec83072 == null) {
            m75945x2fec83072 = "";
        }
        mn2.n nVar = new mn2.n(m75945x2fec83072, null, 2, null);
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.d5l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p18, "getView(...)");
        a17.c(nVar, (android.widget.ImageView) p18, g1Var.h(mn2.f1.f411490h));
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5o);
        java.lang.String m75945x2fec83073 = s11Var.m75945x2fec8307(0);
        if (m75945x2fec83073 == null) {
            m75945x2fec83073 = "";
        }
        textView.setText(m75945x2fec83073);
        android.view.View p19 = holder.p(com.p314xaae8f345.mm.R.id.d5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p19, "getView(...)");
        android.widget.TextView textView2 = (android.widget.TextView) p19;
        java.lang.String m75945x2fec83074 = s11Var.m75945x2fec8307(6);
        if (m75945x2fec83074 == null) {
            m75945x2fec83074 = "";
        }
        textView2.setText(m75945x2fec83074);
        java.lang.String m75945x2fec83075 = s11Var.m75945x2fec8307(7);
        if (m75945x2fec83075 == null) {
            m75945x2fec83075 = "";
        }
        if (m75945x2fec83075.length() == 0) {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5k)).setVisibility(8);
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5k)).setText("");
        } else {
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5k)).setVisibility(0);
            ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5k)).setText(m75945x2fec83075);
        }
        java.lang.String m75945x2fec83076 = s11Var.m75945x2fec8307(8);
        ((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5m)).setText(m75945x2fec83076 != null ? m75945x2fec83076 : "");
        android.view.View p27 = holder.p(com.p314xaae8f345.mm.R.id.d5o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p27, "getView(...)");
        android.widget.TextView textView3 = (android.widget.TextView) p27;
        android.view.View p28 = holder.p(com.p314xaae8f345.mm.R.id.d5n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p28, "getView(...)");
        textView3.getViewTreeObserver().addOnPreDrawListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fm(textView3, this, (android.widget.TextView) p28));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.ui.bk.r0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.d5o)).getPaint(), 0.8f);
    }
}
