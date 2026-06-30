package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes10.dex */
public class h7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 f288288d;

    public h7(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0) {
        this.f288288d = activityC22321x6fa86dd0;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c2201 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201();
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22321x6fa86dd0 activityC22321x6fa86dd0 = this.f288288d;
        activityC22321x6fa86dd0.f288048t = c6336x745c2201;
        android.content.Intent intent = new android.content.Intent(activityC22321x6fa86dd0, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22328xf8c1b478.class);
        intent.putExtra("intent_status_mgr", true);
        intent.putExtra("list_type", 16);
        intent.putExtra("filter_type", "@social.black.android");
        activityC22321x6fa86dd0.startActivityForResult(intent, 2);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6336x745c2201 c6336x745c22012 = activityC22321x6fa86dd0.f288048t;
        c6336x745c22012.f136905d = 5L;
        c6336x745c22012.f136914m = java.lang.System.currentTimeMillis();
        yj0.a.h(this, "com/tencent/mm/ui/contact/OnlyChatContactMgrUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
