package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui;

/* loaded from: classes3.dex */
public class o1 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f238233d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 f238234e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94, java.util.List list) {
        super(false);
        this.f238234e = activityC17121x70367c94;
        this.f238233d = list;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        for (android.view.View view2 : this.f238233d) {
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.jnc);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/remittance/mobile/ui/MobileRemittanceUI$25", "onRealClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setContentDescription(((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jnd)).getText());
        }
        android.widget.ImageView imageView = (android.widget.ImageView) view.getTag();
        int intValue = ((java.lang.Integer) imageView.getTag()).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2021xc04a90a2.ui.ActivityC17121x70367c94 activityC17121x70367c94 = this.f238234e;
        activityC17121x70367c94.S = intValue;
        imageView.setVisibility(0);
        view.setContentDescription(activityC17121x70367c94.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hhu) + ((java.lang.Object) ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jnd)).getText()));
        view.sendAccessibilityEvent(32768);
    }
}
