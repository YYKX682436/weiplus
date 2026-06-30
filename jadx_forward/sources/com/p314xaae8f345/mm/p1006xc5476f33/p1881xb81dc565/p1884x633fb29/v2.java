package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class v2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 f231725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f231726e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f231727f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var, int i17, int i18) {
        super(0);
        this.f231725d = b3Var;
        this.f231726e = i17;
        this.f231727f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        rs0.h n17 = rs0.g.n(rs0.i.f480829a, null, null, this.f231726e, this.f231727f, null, 16, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var = this.f231725d;
        b3Var.f231425e = n17;
        is0.c cVar = new is0.c(false, 19L);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(cVar.f375928e);
        surfaceTexture.setOnFrameAvailableListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u2(b3Var, surfaceTexture));
        b3Var.f231422b = surfaceTexture;
        b3Var.f231423c = new android.view.Surface(b3Var.f231422b);
        b3Var.f231421a = cVar;
        os0.c cVar2 = new os0.c(this.f231726e, this.f231727f, 0, 0, 2, 0, 44, null);
        cVar2.f429545u = false;
        b3Var.f231429i = cVar2;
        return jz5.f0.f384359a;
    }
}
