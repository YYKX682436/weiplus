package kf3;

/* loaded from: classes12.dex */
public class y0 implements com.p314xaae8f345.mm.ui.y9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc f388997a;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc) {
        this.f388997a = activityC16486x3260b8cc;
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void a(java.lang.Object obj) {
    }

    @Override // com.p314xaae8f345.mm.ui.y9
    public void b(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1854x10e43c7c.ui.ActivityC16486x3260b8cc activityC16486x3260b8cc = this.f388997a;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c gestureDetectorOnGestureListenerC21510x15ed9d8c = activityC16486x3260b8cc.f230062g;
        kf3.k0 k0Var = activityC16486x3260b8cc.f230061f;
        gestureDetectorOnGestureListenerC21510x15ed9d8c.m79088x648e109b(k0Var.f388912r >= k0Var.f388913s);
        activityC16486x3260b8cc.f230062g.setVisibility(0);
        android.view.View view = activityC16486x3260b8cc.f230065m;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/masssend/ui/MassSendHistoryUI$6", "onPostReset", "(Ljava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16486x3260b8cc.f230066n.setVisibility(0);
    }
}
