package mw0;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 f413218d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p897x8f55093d.p898x854b442e.C10948xe76107c2 c10948xe76107c2) {
        super(2);
        this.f413218d = c10948xe76107c2;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        kw0.a data = (kw0.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        mw0.h hVar = this.f413218d.selectedStickerStyleCallback;
        if (hVar != null) {
            hVar.e3(data);
        }
        return jz5.f0.f384359a;
    }
}
