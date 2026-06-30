package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0;

/* loaded from: classes14.dex */
public class d implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f218729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.e f218730e;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.e eVar, android.graphics.Point point) {
        this.f218730e = eVar;
        this.f218729d = point;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.e eVar = this.f218730e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f = eVar.f218749a;
        if (textureViewSurfaceTextureListenerC15528xde21bc5f.F > 0.0f) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15539x128d01d6 c15539x128d01d6 = textureViewSurfaceTextureListenerC15528xde21bc5f.f218552d;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.TextureViewSurfaceTextureListenerC15528xde21bc5f textureViewSurfaceTextureListenerC15528xde21bc5f2 = eVar.f218749a;
            c15539x128d01d6.m63490x3ae760af(((float) (currentTimeMillis - textureViewSurfaceTextureListenerC15528xde21bc5f2.G)) / textureViewSurfaceTextureListenerC15528xde21bc5f2.F);
        }
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867 m120758x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b();
        android.graphics.Point point = this.f218729d;
        m120758x9cf0d20b.m120774x5101c248(bArr, point.x, point.y, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().c(bArr);
    }
}
