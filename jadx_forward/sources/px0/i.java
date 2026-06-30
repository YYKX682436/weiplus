package px0;

/* loaded from: classes5.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f440313e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced) {
        super(1);
        this.f440312d = c10988x551cb0cc;
        this.f440313e = c10977x8e40eced;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Boolean) obj).booleanValue();
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670 = this.f440312d;
        boolean m7481x7a6e8df6 = componentCallbacksC1101xa17d4670.m7481x7a6e8df6();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f440313e;
        if (!m7481x7a6e8df6 || componentCallbacksC1101xa17d4670.m7482xefa32bc() || componentCallbacksC1101xa17d4670.m7489xb226ab8b()) {
            c10977x8e40eced.u0();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MaterialImportPreviewFragment", "Fragment not associated with fragment manager, skip remove transaction");
        } else {
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = componentCallbacksC1101xa17d4670.m7454x171a637d().m7630xb2c12e75();
            m7630xb2c12e75.j(componentCallbacksC1101xa17d4670);
            m7630xb2c12e75.g();
            c10977x8e40eced.u0();
        }
        return jz5.f0.f384359a;
    }
}
