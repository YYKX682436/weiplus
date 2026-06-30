package z83;

/* loaded from: classes5.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 f552292d;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 activityC16162x32920c96) {
        this.f552292d = activityC16162x32920c96;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96.f224699q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16162x32920c96 activityC16162x32920c96 = this.f552292d;
        activityC16162x32920c96.getClass();
        android.content.Intent intent = new android.content.Intent(activityC16162x32920c96, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1787x8dd0682.ui.reg.ActivityC16160x425523e6.class);
        java.lang.String str = activityC16162x32920c96.f224700d;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("loginUrl");
            throw null;
        }
        intent.putExtra("intent.key.login.url", str);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16162x32920c96, arrayList2.toArray(), "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16162x32920c96.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16162x32920c96, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI", "goBackRegUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/kidswatch/ui/reg/KidsWatchRegRebindUI$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
