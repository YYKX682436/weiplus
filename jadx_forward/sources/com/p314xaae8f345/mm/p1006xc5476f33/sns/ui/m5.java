package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f f251420d;

    public m5(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f) {
        this.f251420d = viewOnClickListenerC17971x568f8e3f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$6");
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f viewOnClickListenerC17971x568f8e3f = this.f251420d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ViewOnClickListenerC17971x568f8e3f.f247883p1;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            android.view.View view = viewOnClickListenerC17971x568f8e3f.f247897q;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$1200", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/LongVideoFullScreenView$6", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LongVideoFullScreenView", th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.LongVideoFullScreenView$6");
    }
}
