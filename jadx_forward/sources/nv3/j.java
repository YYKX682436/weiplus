package nv3;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f422216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 f422217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f422218f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 abstractC17059x115d0b14, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        super(2);
        this.f422216d = i17;
        this.f422217e = abstractC17059x115d0b14;
        this.f422218f = c16997xb0aa383a;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        yz5.q m68324x32e9307;
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderMusicClipHelper", "onClipChanged: musicId=" + this.f422216d + " startMs=" + longValue + " durationMs=" + longValue2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.AbstractC17059x115d0b14 abstractC17059x115d0b14 = this.f422217e;
        if (abstractC17059x115d0b14 != null && (m68324x32e9307 = abstractC17059x115d0b14.m68324x32e9307()) != null) {
            m68324x32e9307.mo147xb9724478(this.f422218f, java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(longValue2));
        }
        return jz5.f0.f384359a;
    }
}
