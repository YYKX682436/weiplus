package xa;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f534292a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f534293b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f534294c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f534295d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f534296e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f534297f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f534298g;

    public c(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18221xe071d469(!com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p218x36f002.C2012xf30f3a62.m18621xab7baa3(str), "ApplicationId must be set.");
        this.f534293b = str;
        this.f534292a = str2;
        this.f534294c = str3;
        this.f534295d = str4;
        this.f534296e = str5;
        this.f534297f = str6;
        this.f534298g = str7;
    }

    public static xa.c a(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1930x4f90b0b5 c1930x4f90b0b5 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1930x4f90b0b5(context);
        java.lang.String m18233x2fec8307 = c1930x4f90b0b5.m18233x2fec8307("google_app_id");
        if (android.text.TextUtils.isEmpty(m18233x2fec8307)) {
            return null;
        }
        return new xa.c(m18233x2fec8307, c1930x4f90b0b5.m18233x2fec8307("google_api_key"), c1930x4f90b0b5.m18233x2fec8307("firebase_database_url"), c1930x4f90b0b5.m18233x2fec8307("ga_trackingId"), c1930x4f90b0b5.m18233x2fec8307("gcm_defaultSenderId"), c1930x4f90b0b5.m18233x2fec8307("google_storage_bucket"), c1930x4f90b0b5.m18233x2fec8307("project_id"));
    }

    /* renamed from: equals */
    public final boolean m175212xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof xa.c)) {
            return false;
        }
        xa.c cVar = (xa.c) obj;
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534293b, cVar.f534293b) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534292a, cVar.f534292a) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534294c, cVar.f534294c) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534295d, cVar.f534295d) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534296e, cVar.f534296e) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534297f, cVar.f534297f) && com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18189x5c46734(this.f534298g, cVar.f534298g);
    }

    /* renamed from: hashCode */
    public final int m175213x8cdac1b() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18190x8cdac1b(this.f534293b, this.f534292a, this.f534294c, this.f534295d, this.f534296e, this.f534297f, this.f534298g);
    }

    /* renamed from: toString */
    public final java.lang.String m175214x9616526c() {
        return com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1921x4c5cf4.m18191xbe50cd3a(this).add("applicationId", this.f534293b).add("apiKey", this.f534292a).add("databaseUrl", this.f534294c).add("gcmSenderId", this.f534296e).add("storageBucket", this.f534297f).add("projectId", this.f534298g).m18192x9616526c();
    }
}
