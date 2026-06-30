package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class v5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db f252154d;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db) {
        this.f252154d = c17974x4f9963db;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("test", "touch: " + motionEvent.getAction());
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db.f247911h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db = this.f252154d;
        boolean z17 = c17974x4f9963db.f247914f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$100", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (!z17) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            view.setPressed(true);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db.a(c17974x4f9963db);
            view.invalidate();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c17974x4f9963db.f247912d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            java.lang.Runnable runnable = c17974x4f9963db.f247913e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            n3Var.mo50300x3fa464aa(runnable);
        } else if (action == 1 || action == 3) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var2 = c17974x4f9963db.f247912d;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$300", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            java.lang.Runnable runnable2 = c17974x4f9963db.f247913e;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            n3Var2.mo50293x3498a0(runnable2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4> list = c17974x4f9963db.f247915g;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
        if (list != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout");
            for (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4 c17972xe84284f4 : list) {
                c17972xe84284f4.q(c17972xe84284f4, motionEvent);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MaskLinearLayout$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.MaskLinearLayout$2");
        return false;
    }
}
