package px0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.r41 f440320e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc, r45.r41 r41Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440319d = c10988x551cb0cc;
        this.f440320e = r41Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px0.l(this.f440319d, this.f440320e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        px0.l lVar = (px0.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        lVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnAIGCTaskQuery aigc:");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440319d;
        sb6.append(c10988x551cb0cc.f151188s);
        sb6.append(' ');
        r45.r41 r41Var = this.f440320e;
        sb6.append(r41Var.m75939xb282bd08(7));
        sb6.append(' ');
        sb6.append(r41Var.m75939xb282bd08(6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", sb6.toString());
        int m75939xb282bd08 = r41Var.m75939xb282bd08(7);
        jz5.g gVar = c10988x551cb0cc.f151182m;
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) gVar.mo141623x754a37bb();
        int progress = c22803x544dcce2 != null ? c22803x544dcce2.getProgress() : 1;
        int i17 = c10988x551cb0cc.f151178f ? 95 : 100;
        if (progress > 50 && (c10977x8e40eced = c10988x551cb0cc.f151186q) != null) {
            c10977x8e40eced.X0();
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce22 = (com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2) gVar.mo141623x754a37bb();
        if (c22803x544dcce22 != null) {
            c22803x544dcce22.a(e06.p.f(m75939xb282bd08, progress, i17));
        }
        return jz5.f0.f384359a;
    }
}
