package le1;

/* loaded from: classes.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 f399664d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f399665e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f399666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f399667g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ le1.h f399668h;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var, boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, le1.h hVar) {
        this.f399664d = o6Var;
        this.f399665e = z17;
        this.f399666f = yVar;
        this.f399667g = i17;
        this.f399668h = hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = this.f399664d;
        if (o6Var.u0().L1.f158902s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetHalfScreenState", "skip, halfScreenConfig.forbidSlidingUpGesture=true");
        } else {
            boolean z17 = this.f399665e;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetHalfScreenState", "call forceForbidDragExpand=%b", java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1224x1c644e5f.l0 l0Var = o6Var.H2;
            l0Var.f172734g = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.f0 f0Var = l0Var.f172731d;
            if (f0Var != null) {
                f0Var.c0(z17);
            }
        }
        le1.h hVar = this.f399668h;
        hVar.getClass();
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        this.f399666f.a(this.f399667g, hVar.u(str, jSONObject));
    }
}
