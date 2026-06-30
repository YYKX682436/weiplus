package c04;

/* loaded from: classes13.dex */
public final class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.TextureView f119202e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a, android.view.TextureView textureView) {
        this.f119201d = c17324xa321818a;
        this.f119202e = textureView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119201d;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a.A1;
            c17324xa321818a.x();
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            android.graphics.Bitmap bitmap = this.f119202e.getBitmap();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanGoodsMaskView", "updatePreviewBitmap getBitmap cost: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            ((ku5.t0) ku5.t0.f394148d).B(new c04.z(this.f119201d, bitmap));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ScanGoodsMaskView", e17, "updatePreviewBitmap exception", new java.lang.Object[0]);
        }
    }
}
