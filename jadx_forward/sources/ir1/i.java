package ir1;

/* loaded from: classes3.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e f375515d;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e) {
        this.f375515d = activityC12967xcacb933e;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.p1290x2c1ddc83.ui.ActivityC12967xcacb933e activityC12967xcacb933e = this.f375515d;
        android.view.View view2 = activityC12967xcacb933e.f175472n;
        if (view2 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ListView listView = activityC12967xcacb933e.f175465d;
        if (listView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        listView.setVisibility(4);
        android.view.View view3 = activityC12967xcacb933e.f175474p;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI", "requestRefresh", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        activityC12967xcacb933e.V6();
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansBlackListUI$initView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
