package cd;

/* loaded from: classes9.dex */
public final class g implements com.p314xaae8f345.mm.p2802xd031a825.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cd.a f122039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.h f122040b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f122041c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f122042d;

    public g(cd.a aVar, cd.h hVar, int i17, java.lang.String str) {
        this.f122039a = aVar;
        this.f122040b = hVar;
        this.f122041c = i17;
        this.f122042d = str;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.g
    /* renamed from: onProcessEnd */
    public final android.content.Intent mo14634xe047072b(int i17, android.os.Bundle bundle) {
        cd.h hVar = this.f122040b;
        cd.a aVar = this.f122039a;
        if (bundle == null) {
            aVar.mo14625xc397f4dd(dd.d.f310404a.f(null, "feedback data is null, please retry"));
            hVar.f122045b = null;
            return null;
        }
        boolean z17 = false;
        int i18 = bundle.getInt("key_process_result_code", 0);
        int i19 = bundle.getInt("key_process_err_code", 0);
        if (i18 == -1 && i19 == 0) {
            z17 = true;
        }
        int i27 = this.f122041c;
        java.lang.String str = z17 ? i27 == 1 ? "openFingerprintPaySuccess" : "openFaceIdPaySuccess" : i27 == 1 ? "openFingerprintPayFailed" : "openFaceIdPayFailed";
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_name", str);
        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.w.k(this.f122042d, "pay.notifyAll", jSONObject);
        aVar.mo14625xc397f4dd(dd.c.j(dd.d.f310404a, null, null, 3, null));
        hVar.f122045b = null;
        return null;
    }
}
