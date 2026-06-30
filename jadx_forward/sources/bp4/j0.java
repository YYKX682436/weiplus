package bp4;

/* loaded from: classes10.dex */
public final class j0 implements bp4.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp4.k0 f104734d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104735e;

    public j0(bp4.k0 k0Var, ju3.d0 d0Var) {
        this.f104734d = k0Var;
        this.f104735e = d0Var;
    }

    @Override // bp4.c0
    public void h(long j17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.B(1468L, 0L);
        com.p314xaae8f345.mm.p2773x4c94ea4f.p2775x348b34.TextureViewSurfaceTextureListenerC22778x581fb68 textureViewSurfaceTextureListenerC22778x581fb68 = this.f104734d.f104747m;
        if (textureViewSurfaceTextureListenerC22778x581fb68 != null) {
            textureViewSurfaceTextureListenerC22778x581fb68.j(j17);
        }
    }

    @Override // bp4.c0
    /* renamed from: pause */
    public void mo10983x65825f6() {
        ju3.d0.k(this.f104735e, ju3.c0.f383428p1, null, 2, null);
    }

    @Override // bp4.c0
    /* renamed from: resume */
    public void mo10984xc84dc82d() {
        ju3.d0.k(this.f104735e, ju3.c0.f383446x1, null, 2, null);
    }
}
