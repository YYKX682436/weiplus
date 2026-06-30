package com.tencent.mm.plugin.card.ui;

/* loaded from: classes3.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f94964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardGiftVideoUI f94965e;

    public c2(com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI, boolean z17) {
        this.f94965e = cardGiftVideoUI;
        this.f94964d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.CardGiftVideoUI cardGiftVideoUI = this.f94965e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cardGiftVideoUI.hashCode());
        boolean z17 = this.f94964d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", valueOf, java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.View view = (android.view.View) cardGiftVideoUI.f94847i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            cardGiftVideoUI.f94849n.setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) cardGiftVideoUI.f94847i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        cardGiftVideoUI.f94849n.setVisibility(0);
    }
}
