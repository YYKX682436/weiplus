package nx0;

/* loaded from: classes5.dex */
public final class l3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e f422692d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.a3 f422693e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e c10983xbff22f6e, nx0.a3 a3Var) {
        super(2);
        this.f422692d = c10983xbff22f6e;
        this.f422693e = a3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.b3 itemData = (nx0.b3) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10983xbff22f6e c10983xbff22f6e = this.f422692d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemData, c10983xbff22f6e.f151143f)) {
            nx0.a3 a3Var = this.f422693e;
            int i17 = 0;
            for (java.lang.Object obj3 : a3Var.f422599d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.b3 b3Var = (nx0.b3) obj3;
                if (b3Var.f422611d) {
                    b3Var.f422611d = false;
                    a3Var.m8147xed6e4d18(i17);
                }
                i17 = i18;
            }
            c10983xbff22f6e.f151143f = itemData;
            boolean z17 = itemData.f422613f;
            java.util.List list = a3Var.f422599d;
            if (z17) {
                ((nx0.b3) list.get(intValue)).f422611d = true;
                a3Var.m8147xed6e4d18(intValue);
            } else {
                ((nx0.b3) list.get(intValue)).f422611d = true;
                ((nx0.b3) list.get(intValue)).f422612e = true;
                a3Var.m8147xed6e4d18(intValue);
            }
            nx0.k3 k3Var = new nx0.k3(itemData, a3Var, intValue);
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nx0.m3(c10983xbff22f6e, k3Var, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
