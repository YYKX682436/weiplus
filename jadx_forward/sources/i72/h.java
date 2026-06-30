package i72;

/* loaded from: classes14.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ i72.m f370953e;

    public h(i72.m mVar, long j17) {
        this.f370953e = mVar;
        this.f370952d = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f370953e.f370960d.f181640u) {
            long j17 = this.f370952d;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: enter worker thread. using %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j17));
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            i72.m mVar = this.f370953e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var = mVar.f370957a;
            if (n0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectCameraView", "hy: already released");
                if (this.f370953e.f370960d.f181644y != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.e(this));
                }
                return;
            }
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = mVar.f370960d;
                n0Var.f181552e = new android.graphics.Point(textureViewSurfaceTextureListenerC13526x5bf79f0a.f181642w, textureViewSurfaceTextureListenerC13526x5bf79f0a.f181643x);
                i72.m mVar2 = this.f370953e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.n0 n0Var2 = mVar2.f370957a;
                if (!(n0Var2.f181549b != null && n0Var2.f181556i)) {
                    n0Var2.a(mVar2.f370960d.f181631i, true, 4);
                }
                i72.m mVar3 = this.f370953e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a.E(mVar3.f370960d, mVar3.f370957a.f181551d);
                i72.m mVar4 = this.f370953e;
                mVar4.f370957a.d(mVar4.f370960d.f181631i);
                i72.m mVar5 = this.f370953e;
                mVar5.f370957a.c(mVar5.f370958b);
                if (this.f370953e.f370960d.f181644y != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.f(this));
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: opened and start preview. use: %d ms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a2 = this.f370953e.f370960d;
                if (textureViewSurfaceTextureListenerC13526x5bf79f0a2.f181636q && textureViewSurfaceTextureListenerC13526x5bf79f0a2.f181632m > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectCameraView", "hy: already request scanning face and now automatically capture");
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.a(textureViewSurfaceTextureListenerC13526x5bf79f0a2));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceDetectCameraView", e17, "hy: exception caused", new java.lang.Object[0]);
                if (this.f370953e.f370960d.f181644y != null) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i72.g(this));
                }
            }
        }
    }
}
