package e00;

/* loaded from: classes9.dex */
public final class q implements pq.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.qe0 f327340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bw5.u8 f327341b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327342c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327343d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f327344e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.l f327345f;

    public q(bw5.qe0 qe0Var, bw5.u8 u8Var, java.lang.String str, java.lang.String str2, java.lang.String str3, jz5.l lVar) {
        this.f327340a = qe0Var;
        this.f327341b = u8Var;
        this.f327342c = str;
        this.f327343d = str2;
        this.f327344e = str3;
        this.f327345f = lVar;
    }

    @Override // pq.b
    public void a(java.lang.Object appBundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBundle, "appBundle");
        if (appBundle instanceof l81.b1) {
            bw5.qe0 qe0Var = this.f327340a;
            if (qe0Var.f113595g) {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                bw5.u8 u8Var = this.f327341b;
                java.lang.String str = u8Var.f115317p1[3] ? u8Var.f115307f : "";
                if (str == null) {
                    str = "";
                }
                jSONObject.putOpt("feedId", str);
                boolean[] zArr = u8Var.f115317p1;
                java.lang.String str2 = zArr[4] ? u8Var.f115308g : "";
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.putOpt("nonceId", str2);
                jSONObject.putOpt("lastGMsgId", this.f327342c);
                jSONObject.putOpt("reqType", java.lang.Integer.valueOf(e00.j.f327316a.a(this.f327343d, this.f327344e, true)));
                jSONObject.putOpt("productId", java.lang.Long.valueOf(u8Var.f115313n));
                java.lang.String str3 = zArr[18] ? u8Var.f115325x : "";
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject.putOpt("ecSource", str3);
                java.lang.String c17 = u8Var.c();
                if (c17 == null) {
                    c17 = "";
                }
                jSONObject.putOpt("finderLiveId", c17);
                java.lang.String m13096x93d5ac12 = u8Var.m13096x93d5ac12();
                jSONObject.putOpt("finderUsername", m13096x93d5ac12 != null ? m13096x93d5ac12 : "");
                if (!((java.lang.Boolean) this.f327345f.f384366d).booleanValue()) {
                    jSONObject.putOpt("showLiving", java.lang.Boolean.valueOf(qe0Var.b().f113128f == 1 && qe0Var.b().f113127e == 1));
                }
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                l81.b1 b1Var = (l81.b1) appBundle;
                b1Var.V = f00.o.class;
                b1Var.W = jSONObject2;
            }
        }
    }
}
