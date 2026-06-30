package zo1;

/* loaded from: classes5.dex */
public final class v1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e f556329a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f556330b;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activityC12868xd8a7d79e, po1.d dVar) {
        this.f556329a = activityC12868xd8a7d79e;
        this.f556330b = dVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "[onVolumeMounted] user click is " + z17);
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12868xd8a7d79e activity = this.f556329a;
            zo1.u1 u1Var = new zo1.u1(activity);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            po1.d deviceInfo = this.f556330b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceInfo, "deviceInfo");
            android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034.class);
            intent.putExtra("deviceInfo", deviceInfo.c());
            ((com.p314xaae8f345.mm.ui.bd) activity.m78751x5dc77fb5(intent)).f279410a = new to1.e(u1Var);
        }
    }
}
