package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class wv implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a f252998d;

    public wv(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a) {
        this.f252998d = activityC18144x3e20023a;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int actionMasked = motionEvent.getActionMasked();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a activityC18144x3e20023a = this.f252998d;
        if (actionMasked == 0) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18144x3e20023a.D;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var = activityC18144x3e20023a.f249161h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            l1Var.g();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.l1 l1Var2 = activityC18144x3e20023a.f249161h;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.zx zxVar = l1Var2.f251245m;
            zxVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            if (zxVar.f253258f) {
                zxVar.f253258f = false;
                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(zxVar.f253264l, 30L);
                zxVar.f253259g = 10;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("scrollDown", "com.tencent.mm.plugin.sns.ui.TimeLineScrollAnimation");
        } else if (actionMasked == 1) {
            activityC18144x3e20023a.a1();
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/SnsWsFoldDetailUI$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.SnsWsFoldDetailUI$3");
        return false;
    }
}
