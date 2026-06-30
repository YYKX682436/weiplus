package sp2;

/* loaded from: classes2.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492737d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.d3 f492738e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f492739f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(sp2.d3 d3Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492738e = d3Var;
        this.f492739f = abstractActivityC21394xb3d2c0cf;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.s2(this.f492738e, this.f492739f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492737d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f492739f;
        sp2.d3 d3Var = this.f492738e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            d3Var.d(abstractActivityC21394xb3d2c0cf);
            this.f492737d = 1;
            p3325xe03a0797.p3326xc267989b.f1 b17 = p3325xe03a0797.p3326xc267989b.l.b(p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c), null, null, new sp2.y2(abstractActivityC21394xb3d2c0cf, d3Var, null), 3, null);
            d3Var.f492546g = b17;
            obj = ((p3325xe03a0797.p3326xc267989b.g1) b17).k(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.k kVar = (yl2.k) obj;
        az2.f fVar = d3Var.f492548i;
        if (fVar != null) {
            fVar.b();
        }
        d3Var.f492548i = null;
        if (kVar != null) {
            this.f492737d = 2;
            if (sp2.d3.a(d3Var, abstractActivityC21394xb3d2c0cf, kVar, this) == aVar) {
                return aVar;
            }
        } else {
            qz5.b.d(android.util.Log.i("Finder.LiveEntranceLiveChatHelper", "prepareJob failed, livePrepareInfo is null"));
        }
        return jz5.f0.f384359a;
    }
}
