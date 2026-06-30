package jj3;

/* loaded from: classes14.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f381544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f381545e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jj3.j f381546f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String str, jj3.c cVar, jj3.j jVar) {
        super(1);
        this.f381544d = str;
        this.f381545e = cVar;
        this.f381546f = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureDestroyed " + this.f381544d + ' ' + it);
        jj3.c cVar = this.f381545e;
        jj3.d a17 = cVar.a();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17 != null ? a17.mo67061x8dd3293d() : null, it)) {
            this.f381546f.a(cVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: not current surface");
        }
        return jz5.f0.f384359a;
    }
}
