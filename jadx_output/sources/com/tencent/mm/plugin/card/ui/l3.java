package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class l3 implements com.tencent.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardNewMsgUI f95065a;

    public l3(com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI) {
        this.f95065a = cardNewMsgUI;
    }

    @Override // com.tencent.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.tencent.mm.ui.y9
    public void b(java.lang.Object obj) {
        int i17 = com.tencent.mm.plugin.card.ui.CardNewMsgUI.f94893n;
        com.tencent.mm.plugin.card.ui.CardNewMsgUI cardNewMsgUI = this.f95065a;
        cardNewMsgUI.T6();
        com.tencent.mm.plugin.card.ui.s3 s3Var = cardNewMsgUI.f94895e;
        if ((s3Var.f95157o >= s3Var.f95158p) && xt1.t0.Vi().f() == 0) {
            android.view.View view = cardNewMsgUI.f94897g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardNewMsgUI$5", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
