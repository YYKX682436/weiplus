package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui;

/* loaded from: classes9.dex */
public class tm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f229002d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.um f229003e;

    public tm(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.um umVar, boolean z17) {
        this.f229003e = umVar;
        this.f229002d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.um umVar = this.f229003e;
        umVar.f229048b.f229110t.setVisibility(8);
        android.app.Dialog dialog = umVar.f229048b.f229116z.B;
        if (dialog != null && dialog.isShowing()) {
            umVar.f229048b.f229116z.B.dismiss();
        }
        r45.wv3 wv3Var = umVar.f229047a;
        if (wv3Var.f471036i == 1 || wv3Var.f471040p == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "envelope has expired do nothing");
            return;
        }
        if (this.f229002d) {
            android.view.View view = umVar.f229048b.f229104n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = umVar.f229048b.f229104n;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/ui/LuckyMoneyPickEnvelopeUI$BizVH$2$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        umVar.f229048b.f229105o.setVisibility(0);
        umVar.f229048b.f229106p.setVisibility(8);
        umVar.f229048b.f229107q.setVisibility(0);
    }
}
