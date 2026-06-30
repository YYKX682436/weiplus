package km4;

/* loaded from: classes11.dex */
public final class g implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f390809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f390810c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f390812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f390813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f390814g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f390815h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f390816i;

    public g(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.content.Context context, l81.b1 b1Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, long j17, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, yz5.l lVar, java.lang.String str) {
        this.f390808a = c0Var;
        this.f390809b = context;
        this.f390810c = b1Var;
        this.f390811d = h0Var;
        this.f390812e = c0Var2;
        this.f390813f = j17;
        this.f390814g = h0Var2;
        this.f390815h = lVar;
        this.f390816i = str;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str2);
            if (jSONObject.optInt("action") == 1) {
                java.lang.Object obj = km4.l.f390830b;
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f390812e;
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f390808a;
                synchronized (obj) {
                    if (!c0Var.f391645d && !c0Var2.f391645d) {
                        c0Var2.f391645d = true;
                        if (jSONObject.optBoolean("ad_load_result", false)) {
                            km4.l lVar = km4.l.f390829a;
                            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f390813f;
                            if (currentTimeMillis < 0) {
                                currentTimeMillis = 0;
                            }
                            jSONObject2.put("PreRenderCost", currentTimeMillis);
                            lVar.a(2, jSONObject2.toString());
                            this.f390808a.f391645d = true;
                            km4.l.d(this.f390814g);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(this.f390809b, this.f390810c);
                        } else {
                            km4.l.f390829a.a(12, null);
                            km4.l.c(this.f390815h, this.f390812e, this.f390814g, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
                        }
                        ft.p4 p4Var = (ft.p4) this.f390811d.f391656d;
                        if (p4Var != null) {
                            ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f390816i, p4Var);
                        }
                    }
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAdHelper", "openAD weAppDataCallback result = " + str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TingAdHelper", e17, "parse back value failed", new java.lang.Object[0]);
            km4.l.c(this.f390815h, this.f390812e, this.f390814g, com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC24972xf15f2364.f44771x3ffc7f3);
        }
    }
}
