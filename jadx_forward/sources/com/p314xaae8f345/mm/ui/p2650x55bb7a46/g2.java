package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 f282050d;

    public g2(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484) {
        this.f282050d = viewOnClickListenerC21613xfaa83484;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ViewOnClickListenerC21613xfaa83484 viewOnClickListenerC21613xfaa83484 = this.f282050d;
        viewOnClickListenerC21613xfaa83484.f279704h.a();
        android.widget.ImageView imageView = (android.widget.ImageView) view;
        if (imageView.getTag() == null) {
            imageView.setTag(new java.lang.Object());
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ap_);
            int i17 = 0;
            while (i17 < viewOnClickListenerC21613xfaa83484.f279711r) {
                android.view.View childAt = viewOnClickListenerC21613xfaa83484.f279700d.getChildAt(i17);
                int i18 = i17 >= 3 ? 0 : 8;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(childAt, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i17++;
            }
        } else {
            imageView.setTag(null);
            imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ap9);
            int i19 = 0;
            while (i19 < viewOnClickListenerC21613xfaa83484.f279711r) {
                android.view.View childAt2 = viewOnClickListenerC21613xfaa83484.f279700d.getChildAt(i19);
                int i27 = i19 < 3 ? 0 : 8;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(i27));
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(childAt2, arrayList3.toArray(), "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(childAt2, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                i19++;
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChatFooterCustom$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
