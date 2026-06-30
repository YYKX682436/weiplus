package bd4;

/* loaded from: classes4.dex */
public final class h extends com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c f100882d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c c18266xe2e50b2c) {
        this.f100882d = c18266xe2e50b2c;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan
    public void onClick(android.view.View widget) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(widget);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadSpreadContent$shrinkSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(widget, "widget");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c c18266xe2e50b2c = this.f100882d;
        c18266xe2e50b2c.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        if (c18266xe2e50b2c.f250652w) {
            c18266xe2e50b2c.r();
        } else if (c18266xe2e50b2c.E == null) {
            c18266xe2e50b2c.q();
        } else {
            int i18 = c18266xe2e50b2c.D;
            java.lang.Runnable extraActionRunnable = c18266xe2e50b2c.F;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onShrink", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$3");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraActionRunnable, "extraActionRunnable");
            int[] iArr = new int[2];
            c18266xe2e50b2c.getLocationInWindow(iArr);
            int i19 = iArr[1];
            ad4.g.f84716a.b(c18266xe2e50b2c, i18 + i19, c18266xe2e50b2c.getHeight() + i19, 0, extraActionRunnable);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onShrink", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveInteractionLayout$setupSingleCommentLayout$3");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$changeFoldState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/ImproveCommentView$loadSpreadContent$shrinkSpan$1", "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "onClick", "(Landroid/view/View;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0, android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint ds6) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ds6, "ds");
        super.updateDrawState(ds6);
        ds6.setUnderlineText(false);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18266xe2e50b2c.G;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getCollapseTextColor$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        int i18 = this.f100882d.B;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getCollapseTextColor$p", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView");
        ds6.setColor(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateDrawState", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveCommentView$loadSpreadContent$shrinkSpan$1");
    }
}
