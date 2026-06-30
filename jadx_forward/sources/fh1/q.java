package fh1;

/* loaded from: classes7.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f344116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344117f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344118g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f344119h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(fh1.z zVar, int i17, java.lang.String str, int i18, int i19) {
        super(0);
        this.f344115d = zVar;
        this.f344116e = i17;
        this.f344117f = str;
        this.f344118g = i18;
        this.f344119h = i19;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.z zVar = this.f344115d;
        java.lang.String str = zVar.f344164e;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onInsertFrame frameId:");
        int i17 = this.f344116e;
        sb6.append(i17);
        sb6.append(" extraData:");
        java.lang.String str2 = this.f344117f;
        sb6.append(str2);
        sb6.append(" width:");
        sb6.append(this.f344118g);
        sb6.append(" height:");
        sb6.append(this.f344119h);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        fh1.x0 a17 = zVar.a();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("frameId", i17);
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        a17.G1("onInsertFrame", jSONObject2);
        return jz5.f0.f384359a;
    }
}
