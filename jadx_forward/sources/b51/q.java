package b51;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f99586d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b51.u f99587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99589g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(android.view.View view, b51.u uVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99586d = view;
        this.f99587e = uVar;
        this.f99588f = str;
        this.f99589g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b51.q(this.f99586d, this.f99587e, this.f99588f, this.f99589g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b51.q qVar = (b51.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b textureViewSurfaceTextureListenerC29708xfaeeb83b = (org.p3363xbe4143f1.TextureViewSurfaceTextureListenerC29708xfaeeb83b) this.f99586d;
        if (textureViewSurfaceTextureListenerC29708xfaeeb83b.getVisibility() != 0) {
            textureViewSurfaceTextureListenerC29708xfaeeb83b.setVisibility(0);
        }
        this.f99587e.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[playPag-real] start tag = ");
        java.lang.String str = this.f99588f;
        sb6.append(str);
        sb6.append(" path:");
        java.lang.String str2 = this.f99589g;
        sb6.append(str2);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", sb6.toString());
        textureViewSurfaceTextureListenerC29708xfaeeb83b.m154967x348b34();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[playPag-real] end tag = " + str + " path:" + str2 + ' ');
        return jz5.f0.f384359a;
    }
}
