package k74;

/* loaded from: classes4.dex */
public final class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 f386316d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09 c17753xe309eb09) {
        this.f386316d = c17753xe309eb09;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String mReason;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
            return;
        }
        view.setSelected(!view.isSelected());
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2116x8438d441.p2119xf495eb85.p2120x72ce5378.C17753xe309eb09.f244723s;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMItemSelectChangedListener$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        k74.a aVar = this.f386316d.f244730m;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMItemSelectChangedListener$p", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer");
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            k74.h hVar = ((k74.e) aVar).f386319a;
            boolean c17 = hVar.c();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$hasSelectedItem", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            hVar.d(c17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$updateSubmitBtnStyle", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            i74.l lVar = hVar.f386324c;
            if (lVar != null) {
                java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.n2f);
                lVar.b(view, 5, tag);
                if (tag instanceof j74.c) {
                    j74.c cVar = (j74.c) tag;
                    mReason = cVar.f379598b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mReason, "mReason");
                    i17 = cVar.f379597a;
                    java.lang.String str = "onSelectChange, reason=" + mReason + ", id=" + i17;
                    int i19 = rl.b.f478676a;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", str, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
                }
            }
            mReason = "";
            i17 = -1;
            java.lang.String str2 = "onSelectChange, reason=" + mReason + ", id=" + i17;
            int i192 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedbackNewStyleDisplayer", str2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doOnSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSelectChange", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackNewStyleDisplayer$mOnItemSelectChangedListener$1");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/timeline/feedback/improve/FeedbackItemContainer$mItemClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.timeline.feedback.improve.FeedbackItemContainer$mItemClickListener$1");
    }
}
