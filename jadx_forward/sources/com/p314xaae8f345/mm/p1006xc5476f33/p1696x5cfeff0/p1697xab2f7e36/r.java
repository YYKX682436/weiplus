package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public class r implements android.hardware.Camera.PreviewCallback {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f218707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s f218708e;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s sVar, android.graphics.Point point) {
        this.f218708e = sVar;
        this.f218707d = point;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.s sVar = this.f218708e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad4809 = sVar.f218712b;
        if (textureViewSurfaceTextureListenerC15532xe9ad4809.f218597J > 0.0f && textureViewSurfaceTextureListenerC15532xe9ad4809.K > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1700x373aa5.C15542xf394888c c15542xf394888c = textureViewSurfaceTextureListenerC15532xe9ad4809.f218599e;
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.TextureViewSurfaceTextureListenerC15532xe9ad4809 textureViewSurfaceTextureListenerC15532xe9ad48092 = sVar.f218712b;
            c15542xf394888c.m63499x3ae760af(((float) (currentTimeMillis - textureViewSurfaceTextureListenerC15532xe9ad48092.K)) / textureViewSurfaceTextureListenerC15532xe9ad48092.f218597J);
        }
        if (sVar.f218712b.F) {
            byte[] bArr2 = new byte[bArr.length];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            bArr = bArr2;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionPreviewLayout", "onPreviewFrame set data to yt");
        com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867 m120758x9cf0d20b = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3227x208df1fe.C27901xdeb6b867.m120758x9cf0d20b();
        android.graphics.Point point = this.f218707d;
        m120758x9cf0d20b.m120774x5101c248(bArr, point.x, point.y, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.v.b().c(bArr);
    }
}
