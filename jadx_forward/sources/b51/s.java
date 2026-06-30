package b51;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f99591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b51.u f99592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99594g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(android.view.View view, b51.u uVar, java.lang.String str, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99591d = view;
        this.f99592e = uVar;
        this.f99593f = str;
        this.f99594g = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b51.s(this.f99591d, this.f99592e, this.f99593f, this.f99594g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        b51.s sVar = (b51.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        sVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) this.f99591d;
        if (c22789xd23e9a9b.getVisibility() != 0) {
            c22789xd23e9a9b.setVisibility(0);
        }
        this.f99592e.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[playPag-real] start tag = ");
        java.lang.String str = this.f99593f;
        sb6.append(str);
        sb6.append(" path:");
        java.lang.String str2 = this.f99594g;
        sb6.append(str2);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", sb6.toString());
        c22789xd23e9a9b.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micro.PagTargetDispatcher", "[playPag-real] end tag = " + str + " path:" + str2 + ' ');
        return jz5.f0.f384359a;
    }
}
