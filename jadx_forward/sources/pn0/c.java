package pn0;

/* loaded from: classes14.dex */
public class c extends pn0.a {

    /* renamed from: l, reason: collision with root package name */
    public final android.view.Surface f438481l;

    public c(nn0.o oVar, android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        super(oVar);
        this.f438481l = new android.view.Surface(surfaceTexture);
        u(i17, i18);
    }

    @Override // pn0.b
    /* renamed from: getSurface */
    public android.view.Surface mo158745xcf572877() {
        return this.f438481l;
    }

    @Override // pn0.b
    /* renamed from: reset */
    public void mo158746x6761d4f() {
    }

    @Override // pn0.b
    /* renamed from: startPlay */
    public void mo158747x8113c2b6() {
    }

    @Override // pn0.b
    /* renamed from: stopPlay */
    public void mo158748x66343656(boolean z17) {
    }

    public c(nn0.o oVar, android.view.Surface surface, int i17, int i18) {
        super(oVar);
        this.f438481l = surface;
        u(i17, i18);
    }
}
