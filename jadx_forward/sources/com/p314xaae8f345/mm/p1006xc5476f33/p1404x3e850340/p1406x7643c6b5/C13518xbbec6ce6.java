package com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5;

/* renamed from: com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService */
/* loaded from: classes14.dex */
public class C13518xbbec6ce6 extends com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5 {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.z f181577i;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Messenger f181578m;

    /* renamed from: n, reason: collision with root package name */
    public f72.f f181579n;

    public C13518xbbec6ce6() {
        new f72.e(this);
        this.f181577i = null;
        this.f181578m = null;
        this.f181579n = null;
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public java.lang.String b() {
        return "MicroMsg.FaceDetectProcessService";
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public android.os.IBinder c(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "service onBind hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        return new f72.e(this);
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "service onCreate hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        super.d();
        this.f181577i = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.z();
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "service onDestroy");
        super.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r2 == h72.q.STOPPED) goto L49;
     */
    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1406x7643c6b5.C13518xbbec6ce6.g(android.content.Intent, int, int):int");
    }

    @Override // com.p314xaae8f345.mm.p2613x7643c6b5.AbstractC21025xb0cc40f5
    public boolean h(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "service onUnbind");
        super.h(intent);
        return false;
    }

    public final void i(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "replyToClient requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Message message = new android.os.Message();
        message.what = i17;
        message.arg1 = i18;
        j(message);
    }

    public final void j(android.os.Message message) {
        try {
            if (this.f181578m != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectProcessService", "serivce send msg to client: %d, msg: %s, client hashCode: %d", java.lang.Integer.valueOf(message.what), message.toString(), java.lang.Integer.valueOf(this.f181578m.hashCode()));
                this.f181578m.send(message);
            }
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceDetectProcessService", e17, "", new java.lang.Object[0]);
        }
    }
}
