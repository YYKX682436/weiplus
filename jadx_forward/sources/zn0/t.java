package zn0;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget f555931a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam f555932b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig f555933c;

    public t(com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCPublishTarget publishTarget, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(publishTarget, "publishTarget");
        this.f555931a = publishTarget;
        this.f555932b = tRTCStreamEncoderParam;
        this.f555933c = tRTCStreamMixingConfig;
    }

    /* renamed from: equals */
    public boolean m179186xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.t)) {
            return false;
        }
        zn0.t tVar = (zn0.t) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555931a, tVar.f555931a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555932b, tVar.f555932b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f555933c, tVar.f555933c);
    }

    /* renamed from: hashCode */
    public int m179187x8cdac1b() {
        int hashCode = this.f555931a.hashCode() * 31;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamEncoderParam tRTCStreamEncoderParam = this.f555932b;
        int hashCode2 = (hashCode + (tRTCStreamEncoderParam == null ? 0 : tRTCStreamEncoderParam.hashCode())) * 31;
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCStreamMixingConfig tRTCStreamMixingConfig = this.f555933c;
        return hashCode2 + (tRTCStreamMixingConfig != null ? tRTCStreamMixingConfig.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m179188x9616526c() {
        return "FinderLivePublishMediaStreamDataWrap(publishTarget=" + this.f555931a + ", streamEncoderParam=" + this.f555932b + ", streamMixingConfig=" + this.f555933c + ')';
    }
}
