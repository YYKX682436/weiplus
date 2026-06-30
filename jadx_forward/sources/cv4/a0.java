package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/a0;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class a0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {

    /* renamed from: g, reason: collision with root package name */
    public final int f304116g = 10;

    /* renamed from: h, reason: collision with root package name */
    public final int f304117h = 11;

    /* renamed from: i, reason: collision with root package name */
    public final int f304118i = 1;

    /* renamed from: m, reason: collision with root package name */
    public final int f304119m = 6;

    /* renamed from: n, reason: collision with root package name */
    public final int f304120n = 11;

    /* renamed from: o, reason: collision with root package name */
    public final int f304121o = 1;

    /* renamed from: p, reason: collision with root package name */
    public final int f304122p = 2;

    /* renamed from: q, reason: collision with root package name */
    public final int f304123q = 3;

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        d85.g0 g0Var;
        d85.f0 f0Var;
        int i17 = jSONObject != null ? jSONObject.getInt("capability") : 0;
        int i18 = -1;
        int i19 = jSONObject != null ? jSONObject.getInt("authScene") : -1;
        if (i17 == this.f304118i) {
            g0Var = d85.g0.LOCAION;
        } else if (i17 == this.f304119m) {
            g0Var = d85.g0.STORAGE;
        } else {
            if (i17 != this.f304120n) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "capability error: " + i17);
                this.f224976f.a("capability error: " + i17);
                return;
            }
            g0Var = d85.g0.CAMERA;
        }
        if (i19 == this.f304116g) {
            f0Var = d85.f0.f308700r;
        } else {
            if (i19 != this.f304117h) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "authScene error: " + i19);
                this.f224976f.a("authScene error: " + i19);
                return;
            }
            f0Var = d85.f0.f308701s;
        }
        android.content.Context c17 = c();
        android.app.Activity activity = c17 instanceof android.app.Activity ? (android.app.Activity) c17 : null;
        if (activity != null) {
            java.util.HashMap hashMap = e85.i.f331848a;
            java.util.Set entrySet = e85.i.f331849b.entrySet();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : entrySet) {
                if (((java.util.Map.Entry) obj).getValue() == g0Var) {
                    arrayList.add(obj);
                }
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add((java.lang.String) ((java.util.Map.Entry) it.next()).getKey());
            }
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                d85.h0 ij6 = ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).ij(activity, (java.lang.String) it6.next(), f0Var.f308710e);
                if (ij6 == d85.h0.SYSTEM_REFUSE) {
                    i18 = this.f304122p;
                } else {
                    d85.h0 h0Var = d85.h0.BUSINESS_REFUSE;
                    int i27 = this.f304123q;
                    if (ij6 == h0Var) {
                        i18 = i27;
                    }
                    if (ij6 == d85.h0.GRANTED && i18 != i27) {
                        i18 = this.f304121o;
                    }
                    if (ij6 == d85.h0.ERROR) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.systemCapabilityAuthorizationStatus", "IPluginSensitive.PERMISSION_RESULT.ERROR = " + ij6.f308734d);
                    }
                }
            }
        }
        this.f224976f.b(kz5.c1.k(new jz5.l("retCode", 0), new jz5.l("status", java.lang.Integer.valueOf(i18)), new jz5.l("locationSystemAuthorizationStatus", 0), new jz5.l("accuracyAuthorization", java.lang.Boolean.FALSE), new jz5.l("isLocationAuthExptEnable", java.lang.Boolean.TRUE)));
    }
}
