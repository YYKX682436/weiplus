package jj3;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f381548d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.j f381549e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 f381550f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, jj3.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1885x9ce6d72e.p1886xb8b29091.p1887xc84b4196.TextureViewSurfaceTextureListenerC16577xc6e62da0 textureViewSurfaceTextureListenerC16577xc6e62da0) {
        super(1);
        this.f381548d = str;
        this.f381549e = jVar;
        this.f381550f = textureViewSurfaceTextureListenerC16577xc6e62da0;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFirstFrame ");
        java.lang.String str = this.f381548d;
        sb6.append(str);
        sb6.append(' ');
        sb6.append(it);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", sb6.toString());
        jj3.j jVar = this.f381549e;
        yz5.a aVar = (yz5.a) jVar.f381554f.get(str);
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        jVar.f381554f.remove(str);
        this.f381550f.m67067xb7ba2d98(jj3.g.f381547d);
        return jz5.f0.f384359a;
    }
}
