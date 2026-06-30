package ri2;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f477580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ri2.j f477581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f477582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ri2.j jVar, android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f477581e = jVar;
        this.f477582f = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ri2.e(this.f477581e, this.f477582f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ri2.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f477580d;
        ri2.j jVar = this.f477581e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = jVar.f477606p;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.setVisibility(8);
            }
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392103c;
            ri2.d dVar = new ri2.d(jVar, this.f477582f, null);
            this.f477580d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, dVar, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b2 = jVar.f477606p;
        if (c22789xd23e9a9b2 != null) {
            c22789xd23e9a9b2.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b3 = jVar.f477606p;
        if (c22789xd23e9a9b3 != null) {
            c22789xd23e9a9b3.g();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b4 = jVar.f477606p;
        if (c22789xd23e9a9b4 != null) {
            c22789xd23e9a9b4.setScaleY(1.5f);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b5 = jVar.f477606p;
        if (c22789xd23e9a9b5 != null) {
            c22789xd23e9a9b5.setScaleX(1.5f);
        }
        return jz5.f0.f384359a;
    }
}
