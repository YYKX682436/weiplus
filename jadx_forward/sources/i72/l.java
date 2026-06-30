package i72;

/* loaded from: classes14.dex */
public class l implements com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i72.m f370956a;

    public l(i72.m mVar) {
        this.f370956a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u
    public void a(byte[] bArr) {
        i72.m mVar = this.f370956a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1407x6b01a6e.TextureViewSurfaceTextureListenerC13526x5bf79f0a textureViewSurfaceTextureListenerC13526x5bf79f0a = mVar.f370960d;
        if (!textureViewSurfaceTextureListenerC13526x5bf79f0a.B) {
            if (textureViewSurfaceTextureListenerC13526x5bf79f0a.A == null) {
                textureViewSurfaceTextureListenerC13526x5bf79f0a.A = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d.m(java.lang.Integer.valueOf(bArr.length));
            }
            byte[] bArr2 = mVar.f370960d.A;
            if (bArr2 == null || bArr2.length < bArr.length) {
                return;
            }
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            mVar.f370960d.A = bArr;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s sVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d;
        synchronized (sVar) {
            sVar.k(bArr);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.f181574f.mo50293x3498a0(new i72.k(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.u
    public com.p314xaae8f345.mm.p872xbfc2bd01.a b() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s.f181566d;
    }
}
