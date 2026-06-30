package com.tencent.mm.plugin.facedetect.service;

/* loaded from: classes14.dex */
public class FaceDetectProcessService extends com.tencent.mm.service.MMService {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.facedetect.model.z f100044i;

    /* renamed from: m, reason: collision with root package name */
    public android.os.Messenger f100045m;

    /* renamed from: n, reason: collision with root package name */
    public f72.f f100046n;

    public FaceDetectProcessService() {
        new f72.e(this);
        this.f100044i = null;
        this.f100045m = null;
        this.f100046n = null;
    }

    @Override // com.tencent.mm.service.MMService
    public java.lang.String b() {
        return "MicroMsg.FaceDetectProcessService";
    }

    @Override // com.tencent.mm.service.MMService
    public android.os.IBinder c(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "service onBind hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        return new f72.e(this);
    }

    @Override // com.tencent.mm.service.MMService
    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "service onCreate hashCode: %d", java.lang.Integer.valueOf(hashCode()));
        super.d();
        this.f100044i = new com.tencent.mm.plugin.facedetect.model.z();
    }

    @Override // com.tencent.mm.service.MMService
    public void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "service onDestroy");
        super.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d1, code lost:
    
        if (r2 == h72.q.STOPPED) goto L49;
     */
    @Override // com.tencent.mm.service.MMService
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int g(android.content.Intent r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.facedetect.service.FaceDetectProcessService.g(android.content.Intent, int, int):int");
    }

    @Override // com.tencent.mm.service.MMService
    public boolean h(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "service onUnbind");
        super.h(intent);
        return false;
    }

    public final void i(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "replyToClient requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.os.Message message = new android.os.Message();
        message.what = i17;
        message.arg1 = i18;
        j(message);
    }

    public final void j(android.os.Message message) {
        try {
            if (this.f100045m != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FaceDetectProcessService", "serivce send msg to client: %d, msg: %s, client hashCode: %d", java.lang.Integer.valueOf(message.what), message.toString(), java.lang.Integer.valueOf(this.f100045m.hashCode()));
                this.f100045m.send(message);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.FaceDetectProcessService", e17, "", new java.lang.Object[0]);
        }
    }
}
