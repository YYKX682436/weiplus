package nx0;

/* loaded from: classes5.dex */
public final class u2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d f422771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.g2 f422772e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d c10981x1a40da5d, nx0.g2 g2Var) {
        super(2);
        this.f422771d = c10981x1a40da5d;
        this.f422772e = g2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47358xb3543e45;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47358xb3543e452;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10984x806b8ef5 m47358xb3543e453;
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.i2 itemData = (nx0.i2) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10981x1a40da5d c10981x1a40da5d = this.f422771d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemData, c10981x1a40da5d.f151135g)) {
            nx0.g2 g2Var = this.f422772e;
            int i17 = 0;
            for (java.lang.Object obj3 : g2Var.f422651d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.i2 i2Var = (nx0.i2) obj3;
                if (i2Var.f422668d) {
                    i2Var.f422668d = false;
                    g2Var.m8147xed6e4d18(i17);
                }
                i17 = i18;
            }
            c10981x1a40da5d.f151135g = itemData;
            if (itemData.a()) {
                m47358xb3543e453 = c10981x1a40da5d.m47358xb3543e45();
                m47358xb3543e453.setVisibility(4);
            } else {
                m47358xb3543e45 = c10981x1a40da5d.m47358xb3543e45();
                m47358xb3543e45.setVisibility(0);
                itemData.f422669e = 0.6f;
                m47358xb3543e452 = c10981x1a40da5d.m47358xb3543e45();
                m47358xb3543e452.m47378x3ae760af(a06.d.b(itemData.f422669e * 100));
            }
            p3325xe03a0797.p3326xc267989b.i2 i2Var2 = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var2, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nx0.v2(c10981x1a40da5d, null), 2, null);
            ((nx0.i2) g2Var.f422651d.get(intValue)).f422668d = true;
            g2Var.m8147xed6e4d18(intValue);
        }
        return jz5.f0.f384359a;
    }
}
