package nx0;

/* loaded from: classes5.dex */
public final class b2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 f422605d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nx0.q1 f422606e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 c10980xb7502633, nx0.q1 q1Var) {
        super(2);
        this.f422605d = c10980xb7502633;
        this.f422606e = q1Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        nx0.r1 itemData = (nx0.r1) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemData, "itemData");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p906x4f35b23f.C10980xb7502633 c10980xb7502633 = this.f422605d;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(itemData, c10980xb7502633.f151127f)) {
            nx0.q1 q1Var = this.f422606e;
            int i17 = 0;
            for (java.lang.Object obj3 : q1Var.f422735d) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                nx0.r1 r1Var = (nx0.r1) obj3;
                if (r1Var.f422746d) {
                    r1Var.f422746d = false;
                    q1Var.m8147xed6e4d18(i17);
                }
                i17 = i18;
            }
            c10980xb7502633.f151127f = itemData;
            boolean z17 = itemData.f422748f;
            java.util.List list = q1Var.f422735d;
            if (z17) {
                ((nx0.r1) list.get(intValue)).f422746d = true;
                q1Var.m8147xed6e4d18(intValue);
            } else {
                ((nx0.r1) list.get(intValue)).f422746d = true;
                ((nx0.r1) list.get(intValue)).f422747e = true;
                q1Var.m8147xed6e4d18(intValue);
            }
            nx0.a2 a2Var = new nx0.a2(itemData, q1Var, intValue);
            p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new nx0.c2(c10980xb7502633, a2Var, null), 2, null);
        }
        return jz5.f0.f384359a;
    }
}
