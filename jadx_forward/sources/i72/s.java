package i72;

/* loaded from: classes14.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 f370969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 f370970e;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.C13528xdd12ba45 c13528xdd12ba45, com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 t0Var) {
        this.f370970e = c13528xdd12ba45;
        this.f370969d = t0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f370970e.f181652d.F();
        if (this.f370969d != null) {
            synchronized (this.f370970e.f181652d) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.mo50302x6b17ad39(null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
                yVar.f181576d.f181577i.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: init motion no instance");
                yVar.f181576d.f181577i.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: release out not init");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: motionResult: %d, finalResult: %d", -3, java.lang.Integer.valueOf(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55644xa67f77f6));
            }
            ((f72.b) this.f370969d).a(null);
        }
    }
}
