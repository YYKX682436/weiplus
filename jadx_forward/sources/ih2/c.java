package ih2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f373088d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame f373089e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame) {
        super(0);
        this.f373088d = i17;
        this.f373089e = tRTCAudioFrame;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55720x1b30a884, this.f373088d);
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = this.f373089e;
        jSONObject.put("sampleRate", tRTCAudioFrame != null ? tRTCAudioFrame.f57043x88751aa : 0);
        jSONObject.put("channel", tRTCAudioFrame != null ? tRTCAudioFrame.f57040x2c0b7d03 : 0);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
