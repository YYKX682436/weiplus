package cu0;

/* loaded from: classes5.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final cu0.g f303848d = new cu0.g();

    public g() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a audioCacheInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioCacheInfo, "audioCacheInfo");
        if (!audioCacheInfo.g()) {
            return new jz5.l(0L, java.lang.Long.valueOf(longValue));
        }
        long h17 = e06.p.h(audioCacheInfo.c(), 0L, longValue);
        return new jz5.l(java.lang.Long.valueOf(h17), java.lang.Long.valueOf(e06.p.h(h17 + audioCacheInfo.b(), h17, longValue)));
    }
}
