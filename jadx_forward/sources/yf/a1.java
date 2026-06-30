package yf;

/* loaded from: classes7.dex */
public class a1 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f542827a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f542828b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f542829c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sf.f f542830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yf.d1 f542831e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f542832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f542833g;

    public a1(yf.i0 i0Var, int i17, org.json.JSONObject jSONObject, java.lang.String[] strArr, sf.f fVar, yf.d1 d1Var, org.json.JSONObject jSONObject2) {
        this.f542833g = i0Var;
        this.f542827a = i17;
        this.f542828b = jSONObject;
        this.f542829c = strArr;
        this.f542830d = fVar;
        this.f542831e = d1Var;
        this.f542832f = jSONObject2;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f542833g.x(), "convertPathAndApplyMakeupInner#onLoadFailure#" + this.f542827a);
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f542830d;
        yf.i0 i0Var = this.f542833g;
        java.lang.String x17 = i0Var.x();
        final int i17 = this.f542827a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x17, "convertPathAndApplyMakeupInner#onLoad#%d, path: %s, localPath: %s", java.lang.Integer.valueOf(i17), str, str2);
        try {
            this.f542828b.put(this.f542829c[i17], str2);
            yf.d1 d1Var = this.f542831e;
            d1Var.f542868a--;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertPathAndApplyMakeupInner#onLoad#%d, pendingConvertCount: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(d1Var.f542868a));
            if (d1Var.f542868a == 0) {
                final org.json.JSONObject jSONObject = this.f542832f;
                i0Var.G(new java.lang.Runnable() { // from class: yf.a1$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        yf.i0 i0Var2 = yf.a1.this.f542833g;
                        yf.o oVar = i0Var2.f542895i;
                        int i18 = i17;
                        if (oVar == null) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var2.x(), "convertPathAndApplyMakeupInner#onLoad#%d, adapter is null", java.lang.Integer.valueOf(i18));
                            return;
                        }
                        sc1.k1 h17 = oVar.h("applyMakeup", jSONObject);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var2.x(), "convertResourcePathWorkaroundAndOperateLivePusher1#onLoad#%d, type:applyMakeup, error:[%s, %s]", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(h17.f487221a), h17.f487222b);
                        fVar.b(h17.f487221a == 0 ? jc1.f.f380445a : jc1.f.f380448d, h17.f487223c);
                    }
                });
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertPathAndApplyMakeupInner#onLoad#%d, put fail since %s", java.lang.Integer.valueOf(i17), e17);
            fVar.a(jc1.f.f380448d);
        }
    }
}
