package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes3.dex */
public final class y2 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233527e;

    public y2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6) {
        this.f233527e = c16693xf5eb90b6;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c4z;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2 item = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.w2) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.j7p);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.v2 v2Var = item.f233512d;
        if (textView != null) {
            textView.setText(v2Var.f233501e);
        }
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.j7p);
        if (textView2 != null) {
            textView2.setContentDescription(v2Var.f233501e);
        }
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.by8);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233527e;
        p17.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.x2(c16693xf5eb90b6));
        com.p314xaae8f345.mm.ui.bk.q0(((android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.j7p)).getPaint());
        if (v2Var.f233502f) {
            android.widget.TextView textView3 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.j7p);
            if (textView3 != null) {
                textView3.setTextColor(c16693xf5eb90b6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                return;
            }
            return;
        }
        android.widget.TextView textView4 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.j7p);
        if (textView4 != null) {
            textView4.setTextColor(c16693xf5eb90b6.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
