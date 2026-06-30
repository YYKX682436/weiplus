package mx0;

/* loaded from: classes5.dex */
public final class i7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f413580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a f413581e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413582f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413580d = c4128x879fba0a;
        this.f413581e = c4128x879fba0a2;
        this.f413582f = c10977x8e40eced;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.i7(this.f413580d, this.f413581e, this.f413582f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        mx0.i7 i7Var = (mx0.i7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        i7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.g3 m47316xc93d195a;
        mx0.g3 m47316xc93d195a2;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a = this.f413580d;
        if (c4128x879fba0a.m33980x66356283()) {
            com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a c4128x879fba0a2 = this.f413581e;
            boolean m33980x66356283 = c4128x879fba0a2.m33980x66356283();
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413582f;
            if (m33980x66356283) {
                double m33988x124aa384 = (c4128x879fba0a.m33988x124aa384() / c4128x879fba0a2.m33988x124aa384()) * 100;
                m47316xc93d195a2 = c10977x8e40eced.m47316xc93d195a();
                float f17 = (float) m33988x124aa384;
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10975xd53de684 c10975xd53de684 = m47316xc93d195a2.f413526g.f151037g;
                if (c10975xd53de684 != null) {
                    c10975xd53de684.f151067m = f17;
                    c10975xd53de684.invalidate();
                }
            } else {
                m47316xc93d195a = c10977x8e40eced.m47316xc93d195a();
                float m33987xd22e7c2d = (((float) (((long) c4128x879fba0a.m33987xd22e7c2d()) % 2000)) / 2000) * 100;
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10975xd53de684 c10975xd53de6842 = m47316xc93d195a.f413526g.f151037g;
                if (c10975xd53de6842 != null) {
                    c10975xd53de6842.f151067m = m33987xd22e7c2d;
                    c10975xd53de6842.invalidate();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
