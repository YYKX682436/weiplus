package mn0;

/* loaded from: classes10.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mn0.y f411336d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(mn0.y yVar) {
        super(0);
        this.f411336d = yVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mn0.y yVar = this.f411336d;
        com.p314xaae8f345.p2926x359365.C25485x5a0a6891 e17 = yVar.e(yVar.f411338d);
        e17.m94513x8ee3e659(true);
        hn0.w.f363976a.a("BaseLiveTXPlayer");
        ko0.t tVar = ko0.t.f391436a;
        jz5.g gVar = ko0.t.f391437b;
        if (((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue()) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("api", com.p314xaae8f345.p420x6236cc6.p421x316220.C3880x9fc009d.TXLivePropertyKey.f15448xb8169cb5);
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.put("type", 1);
            jSONObject.put("params", jSONObject2);
            java.lang.String jSONObject3 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject3, "toString(...)");
            e17.m94511xd33a8dd4(jSONObject3);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseLiveTXPlayer", "create txLivePlayer enableAudioCodec:" + ((java.lang.Boolean) ((jz5.n) gVar).mo141623x754a37bb()).booleanValue());
        return e17;
    }
}
