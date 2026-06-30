package yf;

/* loaded from: classes7.dex */
public class z0 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f543015a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f543016b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ sf.f f543017c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.d1 f543018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f543019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f543020f;

    public z0(yf.i0 i0Var, int i17, org.json.JSONObject jSONObject, sf.f fVar, yf.d1 d1Var, org.json.JSONObject jSONObject2) {
        this.f543020f = i0Var;
        this.f543015a = i17;
        this.f543016b = jSONObject;
        this.f543017c = fVar;
        this.f543018d = d1Var;
        this.f543019e = jSONObject2;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f543020f.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoadFailure#" + this.f543015a);
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f543017c;
        yf.i0 i0Var = this.f543020f;
        java.lang.String x17 = i0Var.x();
        final int i17 = this.f543015a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, path: %s, localPath: %s", java.lang.Integer.valueOf(i17), str, str2);
        try {
            this.f543016b.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
            yf.d1 d1Var = this.f543018d;
            d1Var.f542868a--;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, pendingConvertCount: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d1Var.f542868a));
            if (d1Var.f542868a == 0) {
                final org.json.JSONObject jSONObject = this.f543019e;
                i0Var.G(new java.lang.Runnable() { // from class: yf.z0$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yf.i0 i0Var2 = yf.z0.this.f543020f;
                        yf.o oVar = i0Var2.f542895i;
                        int i18 = i17;
                        if (oVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, adapter is null", java.lang.Integer.valueOf(i18));
                            return;
                        }
                        sc1.k1 h17 = oVar.h("applySticker", jSONObject);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applySticker, error:[%s, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(h17.f487221a), h17.f487222b);
                        fVar.b(h17.f487221a == 0 ? jc1.f.f380445a : jc1.f.f380448d, h17.f487223c);
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, put fail since %s", java.lang.Integer.valueOf(i17), e17);
            fVar.a(jc1.f.f380448d);
        }
    }
}
