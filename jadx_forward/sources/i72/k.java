package i72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i72.l f370955d;

    public k(i72.l lVar) {
        this.f370955d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = this.f370955d.f370956a.f370960d;
        long j17 = textureViewSurfaceTextureListenerC13526x5bf79f0a.f181633n;
        long j18 = elapsedRealtime - j17;
        if (j17 < 0 || j18 > textureViewSurfaceTextureListenerC13526x5bf79f0a.f181632m) {
            textureViewSurfaceTextureListenerC13526x5bf79f0a.f181633n = elapsedRealtime;
            byte[] bArr = textureViewSurfaceTextureListenerC13526x5bf79f0a.A;
            synchronized (textureViewSurfaceTextureListenerC13526x5bf79f0a.f181639t) {
                if (!textureViewSurfaceTextureListenerC13526x5bf79f0a.f181638s) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FaceDetectCameraView", "hy: not requesting scanning. stop send msg");
                    return;
                }
                if (bArr != null && !textureViewSurfaceTextureListenerC13526x5bf79f0a.B) {
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.B = true;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
                    ((i72.m) textureViewSurfaceTextureListenerC13526x5bf79f0a.f181645z).b();
                    ((i72.m) textureViewSurfaceTextureListenerC13526x5bf79f0a.f181645z).a();
                    i72.m mVar = (i72.m) textureViewSurfaceTextureListenerC13526x5bf79f0a.f181645z;
                    synchronized (mVar.f370960d.f181640u) {
                        int i17 = mVar.f370957a.f181554g;
                    }
                    yVar.f181576d.f181577i.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8 c13513x253b41f8 = new com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.C13513x253b41f8();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: process not init");
                    java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jip);
                    c13513x253b41f8.f181481d = 4;
                    c13513x253b41f8.f181482e = string;
                    textureViewSurfaceTextureListenerC13526x5bf79f0a.B = false;
                    android.os.Message mo50288x733c63a2 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a.C.mo50288x733c63a2();
                    mo50288x733c63a2.what = 1;
                    mo50288x733c63a2.obj = c13513x253b41f8;
                    mo50288x733c63a2.sendToTarget();
                }
            }
        }
    }
}
