package d04;

/* loaded from: classes14.dex */
public final class g3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 f306955d;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33) {
        this.f306955d = c17337xb9c9eb33;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33.G;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17337xb9c9eb33 c17337xb9c9eb33 = this.f306955d;
        c17337xb9c9eb33.i();
        android.view.TextureView textureView = c17337xb9c9eb33.f241330q;
        android.graphics.Bitmap bitmap = textureView != null ? textureView.getBitmap() : null;
        if (bitmap == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ScanSharedMaskView", "updateBackgroundBlurView get bitmap failed");
        } else {
            new e04.h3(new p3321xbce91901.jvm.p3324x21ffc6bd.h0(), bitmap, new d04.f3(c17337xb9c9eb33)).mo152xb9724478();
        }
    }
}
