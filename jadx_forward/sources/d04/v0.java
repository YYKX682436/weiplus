package d04;

/* loaded from: classes13.dex */
public final class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f307056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f307057e;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, android.view.TextureView textureView) {
        this.f307056d = c17327x39ee10a4;
        this.f307057e = textureView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f307056d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4.f241231a2;
            c17327x39ee10a4.M();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.Bitmap bitmap = this.f307057e.getBitmap();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanCodeProductMergeMaskView", "updatePreviewBitmap getBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            ((ku5.t0) ku5.t0.f394148d).B(new d04.u0(this.f307056d, bitmap));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanCodeProductMergeMaskView", e17, "updatePreviewBitmap exception", new java.lang.Object[0]);
        }
    }
}
