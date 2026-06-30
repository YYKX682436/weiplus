package bt2;

/* loaded from: classes3.dex */
public abstract class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f105717d;

    /* renamed from: e, reason: collision with root package name */
    public ws2.o f105718e;

    /* renamed from: f, reason: collision with root package name */
    public bt2.c f105719f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.content.Context context, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.util.AttributeSet attributeSet) {
        super(context, componentCallbacksC1101xa17d4670, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f105717d = "FinderLiveShoppingReplayRouter";
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.f105718e = new ws2.o(abstractActivityC21394xb3d2c0cf, bt2.e.f105716d);
        this.f105719f = new bt2.c(abstractActivityC21394xb3d2c0cf);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0, com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5.AbstractC10852x30afa45a, qo0.c
    /* renamed from: getLiveRole */
    public abstract /* synthetic */ int mo11219xd0598cf8();

    /* renamed from: getShoppingReplayBaseUIC */
    public final ws2.o m11220x7f570b99() {
        return this.f105718e;
    }

    /* renamed from: getShoppingReplayDecorateUIC */
    public final bt2.c m11221x8ea4485d() {
        return this.f105719f;
    }

    /* renamed from: getTAG */
    public final java.lang.String m11222xb5886c64() {
        return this.f105717d;
    }

    /* renamed from: setShoppingReplayBaseUIC */
    public final void m11223x4f69be0d(ws2.o oVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oVar, "<set-?>");
        this.f105718e = oVar;
    }

    /* renamed from: setShoppingReplayDecorateUIC */
    public final void m11224xd870a0d1(bt2.c cVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cVar, "<set-?>");
        this.f105719f = cVar;
    }
}
