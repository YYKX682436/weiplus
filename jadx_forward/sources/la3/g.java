package la3;

/* loaded from: classes8.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f399064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w f399065e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg0.v2 f399066f;

    public g(la3.h hVar, android.os.Bundle bundle, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar, zg0.v2 v2Var) {
        this.f399064d = bundle;
        this.f399065e = wVar;
        this.f399066f = v2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.os.Bundle bundle = this.f399064d;
        try {
            boolean containsKey = bundle.containsKey("jsapi_preverify_fun_list");
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2414xe125c5cf.w wVar = this.f399065e;
            if (!containsKey || wVar == null) {
                boolean z17 = true;
                java.lang.Object[] objArr = new java.lang.Object[1];
                if (wVar == null) {
                    z17 = false;
                }
                objArr[0] = java.lang.Boolean.valueOf(z17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "has JSAPI_CONTROL_BYTES wvPerm %b", objArr);
            } else {
                wVar.i(bundle);
            }
            ((nw4.n) this.f399066f).q();
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiteAppWebViewStubCallback", "In onCallback method, it happens something unwanted!");
        }
    }
}
