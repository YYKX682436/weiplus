package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class s6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1 f211327d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f211328e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1 activityC15034x94404de1, int i17) {
        super(0);
        this.f211327d = activityC15034x94404de1;
        this.f211328e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.Bitmap bitmap = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a.f210114e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1 activityC15034x94404de1 = this.f211327d;
        android.view.View m78513xc2a54588 = activityC15034x94404de1.m78513xc2a54588();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m78513xc2a54588, "access$getContentView(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a.f210114e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.b0(m78513xc2a54588);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15034x94404de1 activityC15034x94404de12 = this.f211327d;
        android.content.Intent intent = new android.content.Intent(activityC15034x94404de1, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15035xa57e2b0a.class);
        intent.addFlags(268435456);
        intent.putExtra("KEY_ROUTER_LAUNCHER", this.f211328e);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC15034x94404de12, arrayList.toArray(), "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC15034x94404de12.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC15034x94404de12, "com/tencent/mm/plugin/finder/ui/FinderHomeAffinityUI$routeToSnapshotUI$1", "invoke", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC15034x94404de1.overridePendingTransition(0, 0);
        return jz5.f0.f384359a;
    }
}
