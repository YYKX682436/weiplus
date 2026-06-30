package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class xm extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public r45.fd2 f186495e;

    public xm(r45.fd2 fd2Var) {
        this.f186495e = fd2Var;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570525b00;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        r45.fd2 fd2Var;
        so2.u2 item = (so2.u2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.fmb);
        r45.fd2 fd2Var2 = item.f492168d;
        if (textView != null) {
            textView.setText(fd2Var2.m75945x2fec8307(1));
        }
        r45.fd2 fd2Var3 = this.f186495e;
        if ((fd2Var3 == null || (fd2Var = (r45.fd2) fd2Var3.m75936x14adae67(3)) == null || fd2Var.m75939xb282bd08(0) != fd2Var2.m75939xb282bd08(0)) ? false : true) {
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.fmc);
            if (linearLayout == null) {
                return;
            }
            linearLayout.setVisibility(0);
            return;
        }
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.fmc);
        if (linearLayout2 == null) {
            return;
        }
        linearLayout2.setVisibility(8);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
