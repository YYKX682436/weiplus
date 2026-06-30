package wu3;

/* loaded from: classes10.dex */
public final class d2 implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea f531261d;

    public d2(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea) {
        this.f531261d = c17052x24b53ea;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = this.f531261d;
        nt3.f0 f0Var = c17052x24b53ea.f237621e;
        if (f0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("render");
            throw null;
        }
        nt3.f fVar = new nt3.f(surface, f0Var);
        c17052x24b53ea.f237620d = fVar;
        fVar.b();
        nt3.f fVar2 = c17052x24b53ea.f237620d;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("glThread");
            throw null;
        }
        nt3.f0 f0Var2 = fVar2.f421310c;
        f0Var2.f421314a = i17;
        f0Var2.f421315b = i18;
        if (fVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("glThread");
            throw null;
        }
        f0Var2.f421317d = 66;
        c17052x24b53ea.f237623g = true;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea.f237619o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureAvailable");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea.f237619o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureDestroyed");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea c17052x24b53ea = this.f531261d;
        c17052x24b53ea.f237623g = false;
        nt3.f fVar = c17052x24b53ea.f237620d;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("glThread");
            throw null;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = fVar.f421313f;
        if (n3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.GLThread", "stop but handler is null");
            return true;
        }
        n3Var.mo50302x6b17ad39(null);
        fVar.f421313f.mo50293x3498a0(new nt3.e(fVar));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea.f237619o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureSizeChanged");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17052x24b53ea.f237619o;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Story.StoryFakeVideoPlayView", "onSurfaceTextureUpdated");
    }
}
