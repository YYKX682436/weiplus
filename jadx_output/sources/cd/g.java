package cd;

/* loaded from: classes9.dex */
public final class g implements com.tencent.mm.wallet_core.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cd.a f40506a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cd.h f40507b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f40508c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f40509d;

    public g(cd.a aVar, cd.h hVar, int i17, java.lang.String str) {
        this.f40506a = aVar;
        this.f40507b = hVar;
        this.f40508c = i17;
        this.f40509d = str;
    }

    @Override // com.tencent.mm.wallet_core.g
    public final android.content.Intent onProcessEnd(int i17, android.os.Bundle bundle) {
        cd.h hVar = this.f40507b;
        cd.a aVar = this.f40506a;
        if (bundle == null) {
            aVar.onCall(dd.d.f228871a.f(null, "feedback data is null, please retry"));
            hVar.f40512b = null;
            return null;
        }
        boolean z17 = false;
        int i18 = bundle.getInt("key_process_result_code", 0);
        int i19 = bundle.getInt("key_process_err_code", 0);
        if (i18 == -1 && i19 == 0) {
            z17 = true;
        }
        int i27 = this.f40508c;
        java.lang.String str = z17 ? i27 == 1 ? "openFingerprintPaySuccess" : "openFaceIdPaySuccess" : i27 == 1 ? "openFingerprintPayFailed" : "openFaceIdPayFailed";
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("event_name", str);
        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
        com.tencent.mm.plugin.lite.w.k(this.f40509d, "pay.notifyAll", jSONObject);
        aVar.onCall(dd.c.j(dd.d.f228871a, null, null, 3, null));
        hVar.f40512b = null;
        return null;
    }
}
