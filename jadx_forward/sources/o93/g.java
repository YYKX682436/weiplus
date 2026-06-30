package o93;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo93/g;", "Lcom/tencent/mm/plugin/lite/api/p;", "Lcom/tencent/mm/plugin/appbrand/jsapi/k0;", "appBrandJsApi", "<init>", "(Lcom/tencent/mm/plugin/appbrand/jsapi/k0;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f425260g;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 appBrandJsApi) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appBrandJsApi, "appBrandJsApi");
        this.f425260g = appBrandJsApi;
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        o93.i b17 = o93.i.b();
        b17.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f425260g;
        boolean z18 = k0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f;
        java.util.HashMap hashMap = b17.f425264b;
        o93.a aVar = b17.f425263a;
        if (!z18) {
            java.lang.String z19 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1) k0Var).z(aVar, jSONObject);
            int i17 = (int) this.f224975e.f380561e;
            hashMap.put(java.lang.Integer.valueOf(i17), this.f224975e);
            b17.a(i17, z19);
            return;
        }
        int i18 = (int) this.f224975e.f380561e;
        hashMap.put(java.lang.Integer.valueOf(i18), this.f224975e);
        aVar.b0(c());
        aVar.L(this.f224975e.f380558b);
        aVar.a0(this.f224975e.f380557a);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f) k0Var).A(aVar, jSONObject, i18);
    }
}
