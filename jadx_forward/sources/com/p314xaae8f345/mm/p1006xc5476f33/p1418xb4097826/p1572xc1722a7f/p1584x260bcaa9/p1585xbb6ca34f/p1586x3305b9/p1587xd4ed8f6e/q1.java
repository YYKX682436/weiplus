package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public final class q1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6s;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        vp2.p item = (vp2.p) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        r45.mb4 mb4Var = item.getFeedObject().m59311x25315bf4() ? (r45.mb4) kz5.n0.Z(item.getFeedObject().m59259x7dea7760()) : (r45.mb4) kz5.n0.Z(item.getFeedObject().m59264x7efe73ec());
        str = "";
        if (mb4Var != null) {
            java.lang.String m75945x2fec8307 = mb4Var.m75945x2fec8307(16);
            boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            java.lang.String m75945x2fec83072 = mb4Var.m75945x2fec8307(20);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            java.lang.String concat = m75945x2fec8307.concat(m75945x2fec83072);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(concat)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(mb4Var.m75945x2fec8307(1));
                java.lang.String m75945x2fec83073 = mb4Var.m75945x2fec8307(19);
                sb6.append(m75945x2fec83073 != null ? m75945x2fec83073 : "");
                str = sb6.toString();
            } else {
                str = concat;
            }
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hmn);
        if (textView != null) {
            textView.setText(item.getFeedObject().m59273x80025a04());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hkh);
        if (imageView != null) {
            mn2.g1 g1Var = mn2.g1.f411508a;
            g1Var.e().c(new mn2.q3(str, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.f411498s));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
