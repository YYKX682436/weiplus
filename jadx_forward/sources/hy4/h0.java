package hy4;

/* loaded from: classes8.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public long f367640a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f367642c;

    /* renamed from: d, reason: collision with root package name */
    public int f367643d;

    /* renamed from: e, reason: collision with root package name */
    public int f367644e;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f367641b = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f367645f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f367646g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f367647h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f367648i = -1;

    public final void a(int i17) {
        if (this.f367648i > 0) {
            return;
        }
        this.f367648i = i17;
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f367640a;
        if (currentTimeMillis < 0 || currentTimeMillis > 86400000) {
            currentTimeMillis = 0;
        }
        jx3.f fVar = jx3.f.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[10];
        objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(this.f367641b);
        java.lang.String str = this.f367641b;
        java.lang.String str2 = "";
        if (str != null) {
            try {
                android.net.Uri parse = android.net.Uri.parse(str);
                java.lang.String queryParameter = parse.getQueryParameter("__biz");
                long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V(parse.getQueryParameter("mid"), 0L);
                int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(parse.getQueryParameter("idx"), 0);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(queryParameter) && V >= 0) {
                    str2 = "id://local/i.html?__biz=" + queryParameter + "&mid=" + V + "&idx=" + P;
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WebViewLongClickReportHelper", "getUrlId ex " + e17.getMessage());
            }
        }
        objArr[1] = str2;
        objArr[2] = java.lang.Integer.valueOf(this.f367642c ? 1 : 0);
        objArr[3] = java.lang.Integer.valueOf(this.f367643d);
        objArr[4] = java.lang.Integer.valueOf(this.f367644e);
        objArr[5] = java.lang.Long.valueOf(currentTimeMillis);
        objArr[6] = com.p314xaae8f345.mm.sdk.p2603x2137b148.y9.a(this.f367645f);
        objArr[7] = this.f367646g;
        objArr[8] = java.lang.Integer.valueOf(i17);
        objArr[9] = this.f367647h;
        fVar.d(19208, objArr);
    }
}
