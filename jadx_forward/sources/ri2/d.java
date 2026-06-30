package ri2;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ri2.j f477578d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f477579e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ri2.j jVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f477578d = jVar;
        this.f477579e = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ri2.d(this.f477578d, this.f477579e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ri2.j jVar = this.f477578d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = jVar.f477606p;
        if (c22789xd23e9a9b != null) {
            c22789xd23e9a9b.d();
        }
        ym5.l2 l2Var = ym5.l2.f544957a;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = jVar.f477606p;
        ym5.j2[] j2VarArr = ym5.j2.f544925d;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = jVar.f477606p;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.o(ae2.in.f85221a.a(ym5.f6.N));
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = jVar.f477606p;
        if (c22789xd23e9a9b4 != null) {
            android.content.res.AssetManager assets = this.f477579e.getAssets();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(assets, "getAssets(...)");
            c22789xd23e9a9b4.k(assets, jVar.f477594d);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = jVar.f477606p;
        if (c22789xd23e9a9b5 == null) {
            return null;
        }
        c22789xd23e9a9b5.m82583xcde73672(0);
        return jz5.f0.f384359a;
    }
}
