package yo4;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public static final yo4.j f545771d = new yo4.j();

    public j() {
        super(2);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        jz5.l lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a info = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        if (info.g()) {
            long h17 = e06.p.h(info.c(), 0L, longValue);
            lVar = new jz5.l(java.lang.Long.valueOf(h17), java.lang.Long.valueOf(e06.p.h(info.b() + h17, h17, longValue)));
        } else {
            lVar = new jz5.l(0L, java.lang.Long.valueOf(longValue));
        }
        long longValue2 = ((java.lang.Number) lVar.f384366d).longValue();
        long longValue3 = ((java.lang.Number) lVar.f384367e).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditAddMusicPlugin", "[provideInitialClipRange] musicId=" + info.f237244e + " totalDurationMs=" + longValue + " hasTrim=" + info.g() + " return=[" + longValue2 + ", " + longValue3 + ']');
        return new jz5.l(java.lang.Long.valueOf(longValue2), java.lang.Long.valueOf(longValue3));
    }
}
