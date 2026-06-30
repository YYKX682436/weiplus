package f72;

/* loaded from: classes14.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 f341573d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 f341574e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 c13518xbbec6ce6, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 t0Var) {
        this.f341574e = c13518xbbec6ce6;
        this.f341573d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "service do release out");
        this.f341574e.f181577i.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new f72.c(this, null));
    }
}
