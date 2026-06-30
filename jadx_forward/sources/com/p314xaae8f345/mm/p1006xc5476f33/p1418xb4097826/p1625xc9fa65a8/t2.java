package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class t2 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 f207388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.mu2 f207389e;

    public t2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 v2Var, r45.mu2 mu2Var) {
        this.f207388d = v2Var;
        this.f207389e = mu2Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.v2 v2Var = this.f207388d;
        v2Var.f207464m.getViewTreeObserver().removeOnPreDrawListener(this);
        java.lang.Object parent = v2Var.f207464m.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.View");
        int width = ((android.view.View) parent).getWidth();
        int width2 = v2Var.f207471t.getVisibility() == 0 ? v2Var.f207471t.getWidth() + ((int) v2Var.f207471t.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl)) + 0 : 0;
        if (v2Var.f207470s.getVisibility() == 0) {
            width2 += v2Var.f207470s.getWidth() + ((int) v2Var.f207470s.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl));
        }
        android.text.TextPaint paint = v2Var.f207464m.getPaint();
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) this.f207389e.m75936x14adae67(0);
        float measureText = paint.measureText(c19782x23db1cfa != null ? ya2.d.h(c19782x23db1cfa, null, false, 3, null).w0() : "");
        if (width2 + measureText > width) {
            android.widget.TextView textView = v2Var.f207464m;
            android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
            layoutParams.width = (width - width2) - 1;
            textView.setLayoutParams(layoutParams);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v2Var.f207461g, "adjustTitleTvSize titleW:" + v2Var.f207464m.getLayoutParams().width + ", containerW:" + width + ",iconW:" + width2);
        } else {
            android.widget.TextView textView2 = v2Var.f207464m;
            android.view.ViewGroup.LayoutParams layoutParams2 = textView2.getLayoutParams();
            layoutParams2.width = (int) measureText;
            textView2.setLayoutParams(layoutParams2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v2Var.f207461g, "adjustTitleTvSize titleW:" + v2Var.f207464m.getLayoutParams().width + ", titleMaxWidth:" + measureText);
        }
        return true;
    }
}
