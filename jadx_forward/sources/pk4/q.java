package pk4;

/* loaded from: classes10.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 f438051d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9) {
        super(1);
        this.f438051d = c18691x35cf85c9;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ((java.lang.Number) obj).longValue();
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9.f256075p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18691x35cf85c9 c18691x35cf85c9 = this.f438051d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.C18693x84c11749 m71989x3a06c52a = c18691x35cf85c9.m71989x3a06c52a();
        if (m71989x3a06c52a != null) {
            m71989x3a06c52a.setAlpha(1.0f);
        }
        yz5.l onFrameAvailable = c18691x35cf85c9.getOnFrameAvailable();
        if (onFrameAvailable != null) {
            onFrameAvailable.mo146xb9724478(c18691x35cf85c9.f256080h);
        }
        return jz5.f0.f384359a;
    }
}
