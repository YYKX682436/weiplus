package yf;

/* loaded from: classes7.dex */
public class y0 implements zf.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f543007a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sf.f f543008b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f543009c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf.i0 f543010d;

    public y0(yf.i0 i0Var, org.json.JSONObject jSONObject, sf.f fVar, java.lang.String str) {
        this.f543010d = i0Var;
        this.f543007a = jSONObject;
        this.f543008b = fVar;
        this.f543009c = str;
    }

    @Override // zf.a
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f543010d.x(), "convertResourcePathAndOperateLivePusher#onLoadFailure");
    }

    @Override // zf.b
    public void b(java.lang.String str, java.lang.String str2) {
        final sf.f fVar = this.f543008b;
        final org.json.JSONObject jSONObject = this.f543007a;
        yf.i0 i0Var = this.f543010d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var.x(), "convertResourcePathAndOperateLivePusher#onLoad, path: %s, localPath: %s", str, str2);
        try {
            jSONObject.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, str2);
            final java.lang.String str3 = this.f543009c;
            i0Var.G(new java.lang.Runnable() { // from class: yf.y0$$a
                @Override // java.lang.Runnable
                public final void run() {
                    yf.i0 i0Var2 = yf.y0.this.f543010d;
                    yf.o oVar = i0Var2.f542895i;
                    if (oVar == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var2.x(), "convertResourcePathAndOperateLivePusher#onLoad, adapter is null");
                        return;
                    }
                    java.lang.String str4 = str3;
                    sc1.k1 h17 = oVar.h(str4, jSONObject);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i0Var2.x(), "convertResourcePathAndOperateLivePusher#onLoad, type:%s, error:[%s, %s]", str4, java.lang.Integer.valueOf(h17.f487221a), h17.f487222b);
                    fVar.b(h17.f487221a == 0 ? jc1.f.f380445a : jc1.f.f380448d, h17.f487223c);
                }
            });
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(i0Var.x(), "convertResourcePathAndOperateLivePusher#onLoad, put fail since " + e17);
            fVar.a(jc1.f.f380448d);
        }
    }
}
