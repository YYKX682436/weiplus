package gs0;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gs0.w f356555d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f356556e;

    public t(gs0.w wVar, long j17) {
        this.f356555d = wVar;
        this.f356556e = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f356555d.f356575l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, already stop");
            return;
        }
        if (this.f356555d.f356572i == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, rgb2yuvEGLEnvironment already relase");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X264TransImageReaderEncoder", "render gpu rgb2yuv, timestamp:" + this.f356556e);
        os0.g gVar = this.f356555d.f356571h;
        if (gVar != null) {
            gVar.o();
        }
        rs0.h hVar = this.f356555d.f356572i;
        android.opengl.EGLExt.eglPresentationTimeANDROID(hVar != null ? hVar.f480825a : null, hVar != null ? hVar.f480826b : null, this.f356556e);
        rs0.g gVar2 = rs0.i.f480829a;
        rs0.h hVar2 = this.f356555d.f356572i;
        gVar2.x(hVar2 != null ? hVar2.f480825a : null, hVar2 != null ? hVar2.f480826b : null);
        this.f356555d.f356577n++;
    }
}
