package jj3;

/* loaded from: classes14.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f381542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jj3.c f381543e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, jj3.c cVar) {
        super(1);
        this.f381542d = str;
        this.f381543e = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.SurfaceTexture it = (android.graphics.SurfaceTexture) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "onSurfaceTextureAvailable " + this.f381542d + ' ' + it);
        jj3.d a17 = this.f381543e.a();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17 != null ? a17.mo67061x8dd3293d() : null, it)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MTR.RenderTargetHolder", "bindOutputView: set inUse");
            this.f381543e.f381541e = true;
        }
        return jz5.f0.f384359a;
    }
}
