package rp4;

/* loaded from: classes10.dex */
public final class f implements vm5.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp4.g f480161d;

    public f(rp4.g gVar) {
        this.f480161d = gVar;
    }

    @Override // vm5.a
    public void a(long j17) {
        rp4.g gVar = this.f480161d;
        if (gVar.f480189n) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("EDIT_CROP_VIDEO_CURRENT_TIME_INT", (int) j17);
            gVar.f480183e.w(ju3.c0.f383418l1, bundle);
        }
    }

    @Override // vm5.a
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on error");
    }

    @Override // vm5.a
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on completed");
    }

    @Override // vm5.a
    public void i() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on stop");
    }

    @Override // vm5.b
    public void r() {
        rp4.g gVar = this.f480161d;
        if (gVar.f480193r) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on First Frame");
            gVar.f480193r = false;
            com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = gVar.f480182d;
            if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textureViewSurfaceTextureListenerC22778x581fb68, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                textureViewSurfaceTextureListenerC22778x581fb68.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(textureViewSurfaceTextureListenerC22778x581fb68, "com/tencent/mm/plugin/vlog/ui/video/EditVideoPreviewPlugin$videoCallback$1", "onFrame", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
            ju3.d0.k(gVar.f480183e, ju3.c0.D, null, 2, null);
        }
    }

    @Override // vm5.a
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "video on start");
    }

    @Override // vm5.a
    public void x() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditVideoPreviewPlugin", "videoView on FirstFrame");
    }
}
