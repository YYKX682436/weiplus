package nd1;

/* loaded from: classes.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f417909d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f417910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f417912g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417913h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nd1.r f417914i;

    public q(nd1.r rVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str, org.json.JSONObject jSONObject, java.lang.String str2) {
        this.f417914i = rVar;
        this.f417909d = yVar;
        this.f417910e = i17;
        this.f417911f = str;
        this.f417912g = jSONObject;
        this.f417913h = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f417909d;
        int i17 = yVar.mo32091x9a3f0ba2().E0().f387377g;
        int s17 = yVar.mo32091x9a3f0ba2().x0().s(false);
        nd1.r rVar = this.f417914i;
        int i18 = this.f417910e;
        if (s17 < i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.i3 x07 = yVar.mo32091x9a3f0ba2().x0();
            x07.getClass();
            x07.c0(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.k4(x07, this.f417911f, this.f417912g, this.f417913h));
            yVar.a(i18, rVar.o("ok"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiNavigateTo", "page limit exceeded: " + i17);
        yVar.a(i18, rVar.o("fail:page limit exceeded: " + i17));
    }
}
