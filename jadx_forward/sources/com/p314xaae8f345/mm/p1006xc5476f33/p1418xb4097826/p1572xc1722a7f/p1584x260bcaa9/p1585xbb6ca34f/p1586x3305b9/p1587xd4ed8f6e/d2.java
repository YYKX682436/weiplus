package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class d2 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6t;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String m75945x2fec8307;
        android.widget.ImageView imageView;
        java.lang.String str;
        vp2.r item = (vp2.r) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(i17));
        holder.f374657h = item;
        r45.na2 na2Var = item.f520485d;
        r45.dd2 dd2Var = (r45.dd2) na2Var.m75936x14adae67(0);
        if (dd2Var != null && dd2Var.m75939xb282bd08(0) == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.jr6);
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(0);
                return;
            }
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.hnz);
        if (textView != null) {
            r45.dd2 dd2Var2 = (r45.dd2) na2Var.m75936x14adae67(0);
            if (dd2Var2 == null || (str = dd2Var2.m75945x2fec8307(1)) == null) {
                str = "";
            }
            textView.setText(str);
        }
        r45.dd2 dd2Var3 = (r45.dd2) na2Var.m75936x14adae67(0);
        if (dd2Var3 == null || (m75945x2fec8307 = dd2Var3.m75945x2fec8307(9)) == null || (imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hny)) == null) {
            return;
        }
        mn2.g1 g1Var = mn2.g1.f411508a;
        g1Var.e().c(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView, g1Var.h(mn2.f1.f411498s));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
