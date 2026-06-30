package tc4;

/* loaded from: classes4.dex */
public final class h2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f498887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xc4.p f498888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tc4.i2 f498889f;

    public h2(android.view.View view, xc4.p pVar, tc4.i2 i2Var) {
        this.f498887d = view;
        this.f498888e = pVar;
        this.f498889f = i2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$updateBottomLine$$inlined$doOnPreDraw$1");
        xc4.p pVar = this.f498888e;
        if (!android.text.TextUtils.isEmpty(pVar.I0())) {
            tc4.i2 i2Var = this.f498889f;
            if (i2Var.m166211x87be458c() instanceof android.widget.TextView) {
                android.view.View m166211x87be458c = i2Var.m166211x87be458c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m166211x87be458c, "null cannot be cast to non-null type android.widget.TextView");
                android.widget.TextView textView = (android.widget.TextView) m166211x87be458c;
                int width = i2Var.m166234xdb7766d4().getWidth();
                if (width <= 0) {
                    i2Var.w("MicroMsg.Improve.TimelineItemMeasure", "updateBottomLine: failed");
                } else {
                    android.widget.TextView m166230x8e783193 = i2Var.m166230x8e783193();
                    int width2 = width - (m166230x8e783193 != null ? m166230x8e783193.getWidth() : 0);
                    android.view.ViewGroup.LayoutParams layoutParams = i2Var.m166211x87be458c().getLayoutParams();
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                    int i17 = width2 - (marginLayoutParams != null ? marginLayoutParams.leftMargin : 0);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    boolean z17 = pVar.d1().f38980x988ba8e == 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isStar", "com.tencent.mm.plugin.sns.ui.improve.model.ImproveSnsInfo");
                    if (z17) {
                        int width3 = i17 - i2Var.m166233xbb8c5faf().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams2 = i2Var.m166233xbb8c5faf().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
                        i17 = width3 - (marginLayoutParams2 != null ? marginLayoutParams2.leftMargin : 0);
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.Z0(), java.lang.Boolean.TRUE)) {
                        int width4 = i17 - i2Var.m166224x8af4d5e0().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams3 = i2Var.m166224x8af4d5e0().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams3 : null;
                        i17 = width4 - (marginLayoutParams3 != null ? marginLayoutParams3.leftMargin : 0);
                    }
                    if (pVar.l1()) {
                        int width5 = i17 - i2Var.m166220xc8e2c8bc().getWidth();
                        android.view.ViewGroup.LayoutParams layoutParams4 = i2Var.m166220xc8e2c8bc().getLayoutParams();
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams4 : null;
                        i17 = width5 - (marginLayoutParams4 != null ? marginLayoutParams4.leftMargin : 0);
                    }
                    textView.setMaxWidth(i17);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.improve.item.ImproveTimelineItemMeasure$updateBottomLine$$inlined$doOnPreDraw$1");
    }
}
