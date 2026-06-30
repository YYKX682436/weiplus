package kh2;

/* loaded from: classes10.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f389522d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f389523e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f389524f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ om2.u f389525g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame f389526h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389527i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, boolean z17, boolean z18, om2.u uVar, com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame, java.lang.String str) {
        super(0);
        this.f389522d = i17;
        this.f389523e = z17;
        this.f389524f = z18;
        this.f389525g = uVar;
        this.f389526h = tRTCAudioFrame;
        this.f389527i = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55720x1b30a884, this.f389522d);
        jSONObject.put("noteEmpty", this.f389523e);
        jSONObject.put("lyricEmpty", this.f389524f);
        jSONObject.put(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.UID, this.f389525g.f427916a);
        com.p314xaae8f345.p3109x36756d.C26787x72a69a1d.TRTCAudioFrame tRTCAudioFrame = this.f389526h;
        jSONObject.put("sampleRate", tRTCAudioFrame != null ? tRTCAudioFrame.f57043x88751aa : 0);
        jSONObject.put("channel", tRTCAudioFrame != null ? tRTCAudioFrame.f57040x2c0b7d03 : 0);
        jSONObject.put(ya.b.f77502x92235c1b, this.f389527i);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        return r26.i0.t(jSONObject2, ",", ";", false);
    }
}
