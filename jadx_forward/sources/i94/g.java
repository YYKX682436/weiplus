package i94;

/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f371303a;

    /* renamed from: b, reason: collision with root package name */
    public final i94.c f371304b;

    /* renamed from: c, reason: collision with root package name */
    public final i74.l f371305c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f371306d;

    /* renamed from: e, reason: collision with root package name */
    public i94.h f371307e;

    public g(android.content.Context context, i94.c data, i74.l feedbackController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedbackController, "feedbackController");
        this.f371303a = context;
        this.f371304b = data;
        this.f371305c = feedbackController;
    }

    public final void a(android.view.View contentView) {
        r45.d43 b17;
        r45.gr0 gr0Var;
        java.lang.String str;
        r45.d43 b18;
        r45.gr0 gr0Var2;
        r45.d43 b19;
        r45.gr0 gr0Var3;
        java.lang.String str2;
        r45.d43 b27;
        r45.gr0 gr0Var4;
        r45.d43 b28;
        r45.gr0 gr0Var5;
        r45.d43 b29;
        r45.gr0 gr0Var6;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        this.f371306d = contentView;
        java.lang.Object tag = contentView.getTag(com.p314xaae8f345.mm.R.id.vpl);
        i94.h hVar = tag instanceof i94.h ? (i94.h) tag : null;
        this.f371307e = hVar;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.TextView textView = hVar.f371310c;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTextView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            i94.c cVar = this.f371304b;
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTitleText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            boolean equals = "zh_CN".equals(f17);
            java.lang.String str3 = "";
            h94.a aVar = cVar.f371296a;
            if (!equals ? "zh_HK".equals(f17) || "zh_TW".equals(f17) ? (b17 = aVar.b()) == null || (gr0Var = b17.f453615r) == null || (str = gr0Var.f457033o) == null : (b18 = aVar.b()) == null || (gr0Var2 = b18.f453615r) == null || (str = gr0Var2.f457034p) == null : (b29 = aVar.b()) == null || (gr0Var6 = b29.f453615r) == null || (str = gr0Var6.f457032n) == null) {
                str = "";
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTitleText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            textView.setText(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.TextView textView2 = hVar.f371315h;
            if (textView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("complaintTextView");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintTextView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            cVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            java.lang.String f18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            boolean equals2 = "zh_CN".equals(f18);
            h94.a aVar2 = cVar.f371296a;
            if (!equals2 ? !("zh_HK".equals(f18) || "zh_TW".equals(f18) ? (b19 = aVar2.b()) == null || (gr0Var3 = b19.f453615r) == null || (str2 = gr0Var3.f457027f) == null : (b27 = aVar2.b()) == null || (gr0Var4 = b27.f453615r) == null || (str2 = gr0Var4.f457028g) == null) : !((b28 = aVar2.b()) == null || (gr0Var5 = b28.f453615r) == null || (str2 = gr0Var5.f457026e) == null)) {
                str3 = str2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintText", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackData");
            textView2.setText(str3);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getLikeIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.ImageView imageView = hVar.f371311d;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("likeIcon");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getLikeIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.content.Context context = this.f371303a;
            a84.v0.a(context, imageView, 20, 20);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCloseIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.widget.ImageView imageView2 = hVar.f371312e;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("closeIcon");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCloseIcon", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            a84.v0.a(context, imageView2, 20, 20);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedbackGreatButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view = hVar.f371313f;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedbackGreatButton");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedbackGreatButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view.setOnClickListener(new i94.d(this, contentView));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getFeedbackCloseAdButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view2 = hVar.f371314g;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedbackCloseAdButton");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getFeedbackCloseAdButton", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view2.setOnClickListener(new i94.e(this, contentView));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getComplaintContainer", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            android.view.View view3 = hVar.f371316i;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("complaintContainer");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getComplaintContainer", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackViewBuilder$WsFoldFeedbackViewHolder");
            view3.setOnClickListener(new i94.f(this, contentView));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateView", "com.tencent.mm.plugin.sns.ad.wsfold.feedback.WsFoldAdFeedbackDisplayer");
    }
}
