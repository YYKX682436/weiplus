package kf2;

/* loaded from: classes.dex */
public final class f0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kf2.h0 f388757d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f388758e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f388759f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ v65.n f388760g;

    public f0(kf2.h0 h0Var, long j17, int i17, v65.n nVar) {
        this.f388757d = h0Var;
        this.f388758e = j17;
        this.f388759f = i17;
        this.f388760g = nVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        int i17 = this.f388759f;
        long j17 = this.f388758e;
        kf2.h0 h0Var = this.f388757d;
        if (m75939xb282bd08 == 0) {
            h0Var.b(j17, i17);
        } else {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ret.m75939xb282bd08(1));
            java.lang.Integer num = 4;
            h0Var.getClass();
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("errType", valueOf != null ? valueOf.intValue() : -999);
            jSONObject.put("errCode", num != null ? num.intValue() : -999);
            jSONObject.put("errMsg", "");
            h0Var.f388845b.c(j17, i17, jSONObject.toString());
        }
        this.f388760g.a(jz5.f0.f384359a);
    }
}
