package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes3.dex */
public class c2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f176497d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176498e;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf, boolean z17) {
        this.f176498e = activityC13052x7242bfaf;
        this.f176497d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176498e;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(activityC13052x7242bfaf.hashCode());
        boolean z17 = this.f176497d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CardGiftVideoUI", "%d switch video model isVideoPlay %b", valueOf, java.lang.Boolean.valueOf(z17));
        if (z17) {
            android.view.View view = (android.view.View) activityC13052x7242bfaf.f176380i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC13052x7242bfaf.f176382n.setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) activityC13052x7242bfaf.f176380i;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/CardGiftVideoUI$8", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC13052x7242bfaf.f176382n.setVisibility(0);
    }
}
