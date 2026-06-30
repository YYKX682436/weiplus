package ro1;

/* loaded from: classes5.dex */
public final class k implements ro1.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ro1.h f479520a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ po1.d f479521b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479522c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f479523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f479524e;

    public k(ro1.h hVar, po1.d dVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f) {
        this.f479520a = hVar;
        this.f479521b = dVar;
        this.f479522c = str;
        this.f479523d = str2;
        this.f479524e = activityC21401x6ce6f73f;
    }

    @Override // ro1.h
    public void a(java.lang.String deviceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deviceId, "deviceId");
        this.f479520a.a(deviceId);
    }

    @Override // ro1.h
    /* renamed from: onFailed */
    public void mo162785x428b6afc(int i17) {
        po1.d dVar = this.f479521b;
        dVar.d(this.f479522c);
        java.lang.String str = this.f479523d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        dVar.f438834g = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("UDiskDeviceManager", "[addUDiskDevice] Fail to add direct access disk, rollback and try SAF mode again. device=" + dVar);
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activity = this.f479524e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ro1.h callback = this.f479520a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.p1267xe125c5cf.ActivityC12865x8f6cd034.class);
        intent.putExtra("deviceInfo", dVar.c());
        ((com.p314xaae8f345.mm.ui.bd) activity.m78751x5dc77fb5(intent)).f279410a = new to1.e(callback);
    }
}
