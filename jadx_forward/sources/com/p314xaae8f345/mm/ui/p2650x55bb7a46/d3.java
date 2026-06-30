package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes.dex */
public class d3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f281945a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281946b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.LinearLayout f281947c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.FrameLayout f281948d;

    public d3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484, java.lang.String str) {
        this.f281946b = null;
        this.f281945a = viewOnClickListenerC21613xfaa83484;
        this.f281946b = str;
    }

    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.ChattingSportFooterHandler", "initFooter");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = this.f281945a;
        android.view.View findViewById = viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.blq);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.blk);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) viewOnClickListenerC21613xfaa83484.findViewById(com.p314xaae8f345.mm.R.id.bll);
        this.f281947c = linearLayout;
        linearLayout.setWeightSum(1.0f);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f281947c.getChildAt(0);
        this.f281948d = frameLayout;
        frameLayout.setVisibility(0);
        this.f281948d.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.c3(this));
        android.widget.FrameLayout frameLayout2 = this.f281948d;
        frameLayout2.setBackgroundColor(frameLayout2.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77701x3cb0746));
        qv1.a aVar = (qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class));
        java.lang.String str = this.f281946b;
        if (aVar.d(str)) {
            ((android.widget.TextView) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.bln)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.jja);
        } else if (c01.v1.D(str)) {
            ((android.widget.TextView) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.bln)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.hqh);
        } else {
            ((android.widget.TextView) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.bln)).setText(com.p314xaae8f345.mm.R.C30867xcad56011.bq8);
        }
        ((android.widget.TextView) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.bln)).setTextColor(this.f281948d.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        ((android.widget.TextView) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.bln)).setTextSize(0, this.f281948d.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561458j4));
        android.content.Context context = this.f281948d.getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f281948d.findViewById(com.p314xaae8f345.mm.R.id.blm);
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f80097x8eab27b0, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)));
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
            android.view.ViewGroup.LayoutParams layoutParams = c22699x3dcdb352.getLayoutParams();
            layoutParams.height = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            layoutParams.width = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
            c22699x3dcdb352.setLayoutParams(layoutParams);
        }
        for (int i17 = 1; i17 < 6; i17++) {
            android.view.View childAt = this.f281947c.getChildAt(i17);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(childAt, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            childAt.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChattingChatroomDismissFooterHandler", "initFooter", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
