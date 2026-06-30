package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class f3 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f166139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 f166140e;

    public f3(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.C12566x87f2d8b7 c12566x87f2d8b7) {
        this.f166139d = str;
        this.f166140e = c12566x87f2d8b7;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e eVar;
        af.d dVar = af.d.f85977a;
        java.lang.String instanceId = this.f166139d;
        af.c b17 = dVar.b(instanceId, false);
        if (b17 instanceof ug1.c) {
            ((ug1.c) b17).b(this.f166140e);
        }
        dVar.a(instanceId);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u uVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u.f166736a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.s(instanceId);
        ik1.j jVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u.f166737b;
        jVar.d(sVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t tVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.t(instanceId);
        ik1.j jVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.u.f166738c;
        jVar2.d(tVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "releaseByInstanceId: single tasks remaining size = " + jVar.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCgiPrefetchBeforeLaunch", "releaseByInstanceId: batch tasks remaining size = " + jVar2.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2 k17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x2.k(instanceId, true);
        java.util.concurrent.CountDownLatch countDownLatch = (java.util.concurrent.CountDownLatch) ((java.util.concurrent.ConcurrentHashMap) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.tb.F).get(instanceId);
        if (countDownLatch != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.PrepareStepCheckLaunchInfo", "killByInstanceId instance:" + instanceId);
            countDownLatch.countDown();
        }
        if (k17 != null) {
            java.lang.String str = k17.f166908r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 c11829x68027553 = k17.C;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.c6.b(23, str, c11829x68027553 == null ? 0 : c11829x68027553.f158977d, k17.f166909s, k17.D);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().d(instanceId) == null && (eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e.class)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AppLaunchPrepareProcess[applaunch]", "AutoReleaseTimer timeout, remove LaunchParcel in AppBrandLaunchParcelStoreService for instanceId:%s", instanceId);
            eVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e.Bi(eVar, instanceId, null, 2, null);
        }
        return false;
    }
}
