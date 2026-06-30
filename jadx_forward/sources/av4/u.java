package av4;

/* loaded from: classes.dex */
public final class u implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f95869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f95870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f95871c;

    public u(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f95869a = hashMap;
        this.f95870b = kVar;
        this.f95871c = y2Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenFinderViewJSApi", "onCallback callbackReportReadInfo");
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        nw4.y2 y2Var = this.f95871c;
        nw4.k kVar = this.f95870b;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f384366d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.Object obj3 = lVar.f384367e;
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            java.util.HashMap hashMap = this.f95869a;
            hashMap.put("retCode", valueOf);
            hashMap.put("feed_read_info", str);
            if (intValue == 0) {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":ok", hashMap);
            } else {
                kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail open fail", null);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.OpenFinderViewJSApi", "callbackReportReadInfo null");
            kVar.f422396d.e(y2Var.f422546c, y2Var.f422552i + ":fail open fail", null);
        }
    }
}
