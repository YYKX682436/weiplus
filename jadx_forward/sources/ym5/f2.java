package ym5;

/* loaded from: classes13.dex */
public final class f2 implements com.p314xaae8f345.mm.rfx.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f544828a;

    public f2(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b) {
        this.f544828a = c22789xd23e9a9b;
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void a(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544828a;
        if (!c22789xd23e9a9b.getUseRfx() || (i17 = c22789xd23e9a9b.f294874u) == 0) {
            return;
        }
        ym5.l2.f544957a.a(textureViewSurfaceTextureListenerC20956x37a43b17, c22789xd23e9a9b.f294875v, i17);
        c22789xd23e9a9b.f294871r = 0;
        c22789xd23e9a9b.f294872s = 0.0d;
        c22789xd23e9a9b.f294874u = 0;
        c22789xd23e9a9b.f294875v = 0.0d;
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void b(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void c(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void d(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
        int i17;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544828a;
        if (!c22789xd23e9a9b.getUseRfx() || (i17 = c22789xd23e9a9b.f294874u) == 0) {
            return;
        }
        ym5.l2.f544957a.a(textureViewSurfaceTextureListenerC20956x37a43b17, c22789xd23e9a9b.f294875v, i17);
        c22789xd23e9a9b.f294871r = 0;
        c22789xd23e9a9b.f294872s = 0.0d;
        c22789xd23e9a9b.f294874u = 0;
        c22789xd23e9a9b.f294875v = 0.0d;
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void e(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17, com.p314xaae8f345.mm.rfx.C20944x47b47a89 c20944x47b47a89) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544828a;
        if (c22789xd23e9a9b.getUseRfx() && c20944x47b47a89 != null && c22789xd23e9a9b.f294873t) {
            c22789xd23e9a9b.f294874u++;
            c22789xd23e9a9b.f294875v += (int) c20944x47b47a89.f39078x3300ce55;
        }
    }

    @Override // com.p314xaae8f345.mm.rfx.i
    public void f(com.p314xaae8f345.mm.rfx.TextureViewSurfaceTextureListenerC20956x37a43b17 textureViewSurfaceTextureListenerC20956x37a43b17) {
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f544828a;
        if (c22789xd23e9a9b.getUseRfx()) {
            c22789xd23e9a9b.f294873t = true;
        }
    }
}
