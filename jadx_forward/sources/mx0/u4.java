package mx0;

/* loaded from: classes5.dex */
public final class u4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f413903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f413905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ mx0.r3 f413906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, boolean z17, mx0.r3 r3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f413904e = c10977x8e40eced;
        this.f413905f = z17;
        this.f413906g = r3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx0.u4(this.f413904e, this.f413905f, this.f413906g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.u4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        mx0.l1 m47306x2f3509ad;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f413903d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413904e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c10977x8e40eced.z0();
            if (!this.f413905f) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "reportEnterImportPreviewFailed");
                ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerate", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 2);
                db5.t7.i(c10977x8e40eced.getContext(), j65.q.b(c10977x8e40eced.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.m27), 0);
                c10977x8e40eced.g1(false, true);
                return jz5.f0.f384359a;
            }
            c10977x8e40eced.U1 = this.f413906g;
            this.f413903d = 1;
            obj = c10977x8e40eced.f151090v.X(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        m47306x2f3509ad = c10977x8e40eced.m47306x2f3509ad();
        m47306x2f3509ad.d(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingPluginLayout", "reportEnterImportPreviewCompleted");
        ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).rj("SCAssetGenerate", "MJShootComposing", ((yy0.m7) ((pp0.l0) i95.n0.c(pp0.l0.class))).Ni(), 0);
        return jz5.f0.f384359a;
    }
}
