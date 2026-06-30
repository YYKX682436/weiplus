package yc1;

/* loaded from: classes.dex */
public class d0 implements h45.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f542310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f542311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yc1.f0 f542312c;

    public d0(yc1.f0 f0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f542312c = f0Var;
        this.f542310a = e9Var;
        this.f542311b = i17;
    }

    @Override // h45.r
    public void a(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback fail");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("err_desc", str);
        this.f542310a.a(this.f542311b, this.f542312c.p("fail", hashMap));
    }

    @Override // h45.r
    /* renamed from: onSuccess */
    public void mo74492xe05b4124(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSecureTunnel", "secureTunnel callback success: %s", str);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("respbuf", str);
        this.f542310a.a(this.f542311b, this.f542312c.p("ok", hashMap));
    }
}
