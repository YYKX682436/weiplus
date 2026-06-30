package f72;

/* loaded from: classes14.dex */
public class b implements com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 f341571a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6 c13518xbbec6ce6) {
        this.f341571a = c13518xbbec6ce6;
    }

    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.C13511x29b1cb27.FaceResult faceResult) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = java.lang.Boolean.valueOf(faceResult == null);
        objArr[1] = java.lang.Integer.valueOf(faceResult != null ? faceResult.f35499xc84dc81d : -1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "release out result == null:%b, result: %d", objArr);
        if (faceResult != null && faceResult.f35499xc84dc81d == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.m77784x795fa299(new f72.a(this, faceResult));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "release out data not valid");
            this.f341571a.i(1, faceResult != null ? faceResult.f35499xc84dc81d : -1);
        }
    }
}
