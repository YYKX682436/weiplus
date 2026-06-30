package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class i0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 f231531d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f231532e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var, yz5.a aVar) {
        super(0);
        this.f231531d = s0Var;
        this.f231532e = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.s0 s0Var = this.f231531d;
        yz5.a aVar = this.f231532e;
        s0Var.getClass();
        s0Var.f231647f = rs0.g.n(rs0.i.f480829a, null, null, 1, 1, null, 16, null);
        is0.c cVar = new is0.c(false, 19L);
        s0Var.f231648g = cVar;
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
        s0Var.f231653o = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j0.f231551d);
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.k0(aVar));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkCameraManager", "init create mulititalk camera PboSurfaceRender");
        return jz5.f0.f384359a;
    }
}
