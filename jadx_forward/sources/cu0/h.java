package cu0;

/* loaded from: classes5.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303849d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cu0.x xVar) {
        super(3);
        this.f303849d = xVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a audioCacheInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        long longValue2 = ((java.lang.Number) obj3).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audioCacheInfo, "audioCacheInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f303849d.j(), "[onMusicClipChanged] musicId=" + audioCacheInfo.f237244e + " start=" + longValue + " duration=" + longValue2);
        java.lang.String a17 = audioCacheInfo.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = this.f303849d.f303888e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a17, c16997xb0aa383a != null ? c16997xb0aa383a.a() : null)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = this.f303849d.f303888e;
            if (c16997xb0aa383a2 != null) {
                c16997xb0aa383a2.G = java.lang.Long.valueOf(longValue);
                c16997xb0aa383a2.H = java.lang.Long.valueOf(longValue2);
            }
            ev0.t tVar = this.f303849d.f303886c;
            p3325xe03a0797.p3326xc267989b.l.d(tVar.f338411a, null, null, new ev0.o(longValue, longValue2 + longValue, tVar, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f303849d.j(), "[onMusicClipChanged] item not currently selected, skip");
        }
        return jz5.f0.f384359a;
    }
}
