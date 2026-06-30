package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public final class w2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 f231731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var) {
        super(0);
        this.f231731d = b3Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.b3 b3Var = this.f231731d;
        os0.c cVar = b3Var.f231429i;
        if (cVar != null) {
            cVar.f429543s = null;
        }
        android.view.Surface surface = b3Var.f231423c;
        if (surface != null) {
            surface.release();
        }
        android.graphics.SurfaceTexture surfaceTexture = b3Var.f231422b;
        if (surfaceTexture != null) {
            surfaceTexture.release();
        }
        is0.c cVar2 = b3Var.f231421a;
        if (cVar2 != null) {
            cVar2.close();
        }
        os0.c cVar3 = b3Var.f231429i;
        if (cVar3 != null) {
            cVar3.n();
        }
        rs0.h hVar = b3Var.f231425e;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        return jz5.f0.f384359a;
    }
}
