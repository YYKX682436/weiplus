package l94;

/* loaded from: classes4.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l94.p f398915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ h94.a f398916e;

    public o(l94.p pVar, h94.a aVar) {
        this.f398915d = pVar;
        this.f398916e = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object m143895xf1229813;
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent$onBindData$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdTitleComponent$onBindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l94.p pVar = this.f398915d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pVar.h(), "onclick adinfoview");
        i94.a aVar = new i94.a(pVar.f(), this.f398916e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        m74.b bVar = aVar.f371290e;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            aVar.e();
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (bVar.isShowing()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            if (view instanceof android.view.ViewGroup) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            } else {
                java.lang.Object parent = view.getParent();
                if (parent != null) {
                    view = (android.view.View) parent;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("obtainRealAnchor", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                }
            }
            aVar.f371294i = view;
            i94.g gVar = aVar.f371293h;
            android.view.View contentView = bVar.getContentView();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView, "getContentView(...)");
            gVar.a(contentView);
            android.view.View view2 = aVar.f371294i;
            if (view2 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            } else {
                android.view.View contentView2 = bVar.getContentView();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(contentView2, "getContentView(...)");
                int c17 = aVar.c(view2, contentView2);
                aVar.i(c17);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                if (c17 < 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                    i17 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576075pp;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getAnimationStyle", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                    i17 = com.p314xaae8f345.mm.R.C30868x68b1db1.f576076pq;
                }
                bVar.setAnimationStyle(i17);
                android.view.View view3 = aVar.f371294i;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("adjustWindowPositionX", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                int b17 = i65.a.b(aVar.f371289d, 6);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("adjustWindowPositionX", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
                bVar.showAsDropDown(view3, b17, c17, 8388613);
                bVar.a(0.5f);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(bVar);
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("WsFoldAdFeedback", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showFeedback", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedback");
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ad/wsfold/ui/component/WsFoldAdTitleComponent$onBindData$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ad.wsfold.ui.component.WsFoldAdTitleComponent$onBindData$2");
    }
}
