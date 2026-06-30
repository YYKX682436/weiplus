package tb1;

/* loaded from: classes7.dex */
public class i0 implements z2.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f498433d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f498434e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gb1.n f498435f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tb1.k0 f498436g;

    public i0(tb1.k0 k0Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, gb1.n nVar) {
        this.f498436g = k0Var;
        this.f498433d = weakReference;
        this.f498434e = weakReference2;
        this.f498435f = nVar;
    }

    @Override // z2.f
    /* renamed from: onRequestPermissionsResult */
    public void mo50562x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        tb1.a0 a0Var = (tb1.a0) this.f498433d.get();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l) this.f498434e.get();
        if (i17 == 16) {
            if (iArr != null && iArr.length > 0 && iArr[0] == 0 && a0Var != null && lVar != null) {
                tb1.b.f498422a.f498423a = true;
                this.f498436g.P(lVar, a0Var, this.f498435f);
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (a0Var != null) {
                hashMap.put("cameraId", java.lang.Integer.valueOf(a0Var.mo50746x72efd496()));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, get Camera id fail");
            }
            if (lVar != null) {
                java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
                tb1.d0 d0Var = new tb1.d0();
                d0Var.p(lVar);
                d0Var.r(jSONObject);
                d0Var.m();
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.JsApiInsertCamera", "onRequestPermissionsResult weak camera is null, dispatch data fail");
            }
            tb1.b.f498422a.f498423a = false;
        }
    }
}
