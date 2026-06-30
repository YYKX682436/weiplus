package um5;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.w f510716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.HandlerThread f510717e;

    public q(um5.w wVar, android.os.HandlerThread handlerThread) {
        this.f510716d = wVar;
        this.f510717e = handlerThread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        um5.w wVar = this.f510716d;
        wVar.f510725a.b();
        com.p314xaae8f345.tav.p2957xa228aba5.C25745xc3945049 c25745xc3945049 = wVar.f510733i;
        if (c25745xc3945049 != null) {
            c25745xc3945049.m97285x41012807();
        }
        um5.y yVar = wVar.f510732h;
        if (yVar != null) {
            android.opengl.GLES20.glDeleteProgram(yVar.f510757c);
        }
        android.view.Surface surface = wVar.f510731g;
        if (surface != null) {
            surface.release();
        }
        com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719 c25779x3338e719 = wVar.f510730f;
        if (c25779x3338e719 != null) {
            c25779x3338e719.mo97551x41012807();
        }
        um5.x xVar = wVar.f510742r;
        xVar.getClass();
        yz5.l lVar = um5.x.f510744k;
        if (lVar != null) {
            lVar.mo146xb9724478(xVar);
        }
        android.os.HandlerThread handlerThread = this.f510717e;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        xm5.b.c(wVar.c(), "destroyEGL finished", new java.lang.Object[0]);
    }
}
