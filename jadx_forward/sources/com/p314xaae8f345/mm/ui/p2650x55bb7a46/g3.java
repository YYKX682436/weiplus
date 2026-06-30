package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f282051a;

    /* renamed from: b, reason: collision with root package name */
    public android.widget.LinearLayout f282052b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.FrameLayout f282053c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View.OnClickListener f282054d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.f3(this);

    public g3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484) {
        this.f282051a = viewOnClickListenerC21613xfaa83484;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDownloaderFooterHandler", "initFooter");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = this.f282051a;
        viewOnClickListenerC21613xfaa83484.setVisibility(8);
        android.view.View findViewById = viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.blq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.blk);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.bll);
        this.f282052b = linearLayout;
        linearLayout.setWeightSum(1.0f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f282052b.getChildAt(0);
        this.f282053c = frameLayout;
        frameLayout.setVisibility(0);
        this.f282053c.setOnClickListener(this.f282054d);
        ((android.widget.TextView) this.f282053c.findViewById(com.p314xaae8f345.mm.R.id.bln)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.bsk);
        android.view.View findViewById3 = this.f282053c.findViewById(com.p314xaae8f345.mm.R.id.blm);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById3, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        for (int i17 = 1; i17 < 6; i17++) {
            android.view.View childAt = this.f282052b.getChildAt(i17);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(childAt, arrayList4.toArray(), "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChattingDownloaderFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
