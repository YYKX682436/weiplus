package t53;

/* loaded from: classes8.dex */
public final class c0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497263b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f497264c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f497265d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f497266e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f497267f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f497268g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f497269h;

    public c0(java.lang.String str, java.lang.String str2, java.lang.Integer num, java.lang.Boolean bool, java.lang.Boolean bool2, int i17, long j17, java.lang.String str3) {
        this.f497262a = str;
        this.f497263b = str2;
        this.f497264c = num;
        this.f497265d = bool;
        this.f497266e = bool2;
        this.f497267f = i17;
        this.f497268g = j17;
        this.f497269h = str3;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        int i17;
        y53.x xVar = (y53.x) ((u53.y) i95.n0.c(u53.y.class));
        java.lang.String fromUsername = this.f497262a;
        y53.m Di = xVar.Di(fromUsername);
        y53.x xVar2 = (y53.x) ((u53.y) i95.n0.c(u53.y.class));
        java.lang.String toUsername = this.f497263b;
        y53.m Di2 = xVar2.Di(toUsername);
        java.lang.Integer num = this.f497264c;
        java.lang.String str = "";
        if (num != null && num.intValue() == 1) {
            java.lang.Boolean bool = this.f497265d;
            if (bool != null) {
                if (bool.booleanValue()) {
                    java.lang.Boolean bool2 = this.f497266e;
                    if (bool2 != null) {
                        if (bool2.booleanValue()) {
                            str = "1";
                            i17 = 3;
                        } else {
                            str = "0";
                        }
                    }
                }
                i17 = 1;
            }
            i17 = 0;
        } else {
            if (num != null && num.intValue() == 2) {
                i17 = 2;
            }
            i17 = 0;
        }
        long j17 = Di.f67426x9f600742;
        long j18 = Di2.f67426x9f600742;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.lang.String sessionId = this.f497269h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromUsername, "fromUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUsername, "toUsername");
        long j19 = this.f497267f;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d c6633xea2e527d = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6633xea2e527d();
        c6633xea2e527d.f139873d = 4L;
        c6633xea2e527d.f139874e = 401L;
        c6633xea2e527d.f139875f = j19;
        c6633xea2e527d.f139876g = this.f497268g;
        c6633xea2e527d.f139877h = 401L;
        c6633xea2e527d.f139885p = c6633xea2e527d.b("SessionId", sessionId, true);
        c6633xea2e527d.f139880k = j17;
        c6633xea2e527d.f139881l = c6633xea2e527d.b("from_username", fromUsername, true);
        c6633xea2e527d.f139882m = j18;
        c6633xea2e527d.f139883n = c6633xea2e527d.b("to_username", toUsername, true);
        c6633xea2e527d.f139879j = c6633xea2e527d.b("ActionStatus", str, true);
        if (valueOf != null && valueOf.intValue() != 0) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("role", valueOf.intValue());
            c6633xea2e527d.p(java.net.URLEncoder.encode(jSONObject.toString()));
        }
        c6633xea2e527d.k();
        return null;
    }
}
