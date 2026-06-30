package kf2;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: c, reason: collision with root package name */
    public static final kf2.w f388843c = new kf2.w(null);

    /* renamed from: a, reason: collision with root package name */
    public final df2.k f388844a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f388845b;

    public x(df2.k controller, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s liteAppStore) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liteAppStore, "liteAppStore");
        this.f388844a = controller;
        this.f388845b = liteAppStore;
    }

    public final void a(long j17, int i17, xg2.a it) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        rm0.j jVar = it.f535912a;
        jSONObject.put("errType", jVar != null ? jVar.f478957e : -999);
        jSONObject.put("errCode", jVar != null ? jVar.f478958f : -999);
        if (jVar == null || (str = jVar.f478959g) == null) {
            str = "";
        }
        jSONObject.put("errMsg", str);
        this.f388845b.c(j17, i17, jSONObject.toString());
    }

    public final void b(long j17, int i17) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", 0);
        this.f388845b.c(j17, i17, jSONObject.toString());
    }

    public final void c(long j17, int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f pb6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pb6, "pb");
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("result", android.util.Base64.encodeToString(pb6.mo14344x5f01b1f6(), 0));
        this.f388845b.c(j17, i17, jSONObject.toString());
    }

    public abstract boolean d(long j17, java.lang.String str, java.lang.Object obj, int i17);

    public abstract java.lang.String e();
}
