package fh1;

/* loaded from: classes7.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344137d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344138e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(fh1.z zVar, int i17) {
        super(0);
        this.f344137d = zVar;
        this.f344138e = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.z zVar = this.f344137d;
        java.lang.String str = zVar.f344164e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRemoveFrame frameId:");
        int i17 = this.f344138e;
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameId", i17);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.G1("onRemoveFrame", jSONObject2);
        return jz5.f0.f384359a;
    }
}
