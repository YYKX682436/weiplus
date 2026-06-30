package i74;

/* loaded from: classes4.dex */
public class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i74.d f370993d;

    public c(i74.d dVar) {
        this.f370993d = dVar;
    }

    public void a(android.view.View view) {
        boolean z17;
        android.content.Context context;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            return;
        }
        view.setSelected(!view.isSelected());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        i74.d dVar = this.f370993d;
        android.widget.TextView textView = dVar.f371010w;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        if (textView != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("shouldShowConfirmBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            android.view.ViewGroup viewGroup = dVar.f371009v;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            if (viewGroup != null) {
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    if (viewGroup.getChildAt(i17).isSelected()) {
                        z17 = true;
                        break;
                    }
                }
            }
            z17 = false;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("shouldShowConfirmBtn", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
            if (z17) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showCloseWithFeedbackBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.G = true;
                android.widget.TextView textView2 = dVar.f371010w;
                if (textView2 != null && (context = dVar.f370994d) != null) {
                    textView2.setVisibility(0);
                    dVar.f371010w.setText(context.getText(com.p314xaae8f345.mm.R.C30867xcad56011.f574715j80));
                    dVar.f371010w.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561045a56));
                    dVar.f371010w.setBackground(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.b0t));
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCloseWithFeedbackBt", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.a(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.d();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
                dVar.a(0);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$500", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$500", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer");
        i74.l lVar = dVar.f371013z;
        if (lVar != null) {
            lVar.b(view, 5, view.getTag(com.p314xaae8f345.mm.R.id.n2f));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClickInner", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            a(view);
        } catch (java.lang.Throwable unused) {
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/FeedbackDisplayer$DynamicTextViewClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.FeedbackDisplayer$DynamicTextViewClickListener");
    }
}
