package vq4;

/* loaded from: classes12.dex */
public final class n implements wh.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f520896a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f520897b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ rh.c1 f520898c;

    public n(int i17, org.json.JSONObject jSONObject, rh.c1 c1Var) {
        this.f520896a = i17;
        this.f520897b = jSONObject;
        this.f520898c = c1Var;
    }

    @Override // wh.t0
    /* renamed from: accept */
    public void mo40853xab27b508(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPProfileReport", "dump all tasks:");
        int i17 = 0;
        for (java.lang.Object obj2 : ((java.util.Map) obj).entrySet()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry) obj2;
            if (i17 < this.f520896a) {
                vq4.x.a(this.f520897b, java.lang.String.valueOf(i17), new vq4.m(entry, this.f520898c, i17));
            }
            i17 = i18;
        }
    }
}
