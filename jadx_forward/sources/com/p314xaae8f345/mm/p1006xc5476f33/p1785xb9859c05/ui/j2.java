package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class j2 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 f224410a;

    public j2(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0) {
        this.f224410a = activityC16139x444a8b0;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16139x444a8b0 activityC16139x444a8b0 = this.f224410a;
        if (activityC16139x444a8b0.f224166e.getCount() == 0) {
            activityC16139x444a8b0.f224165d.setVisibility(8);
            android.view.View view = activityC16139x444a8b0.f224168g;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        activityC16139x444a8b0.f224165d.setVisibility(0);
        android.view.View view2 = activityC16139x444a8b0.f224168g;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/ipcall/ui/IPCallMsgUI$3", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
