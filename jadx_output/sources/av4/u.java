package av4;

/* loaded from: classes.dex */
public final class u implements zy2.i5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f14336a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nw4.k f14337b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f14338c;

    public u(java.util.HashMap hashMap, nw4.k kVar, nw4.y2 y2Var) {
        this.f14336a = hashMap;
        this.f14337b = kVar;
        this.f14338c = y2Var;
    }

    @Override // zy2.i5
    public void a(java.lang.Object obj) {
        jz5.f0 f0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenFinderViewJSApi", "onCallback callbackReportReadInfo");
        jz5.l lVar = obj instanceof jz5.l ? (jz5.l) obj : null;
        nw4.y2 y2Var = this.f14338c;
        nw4.k kVar = this.f14337b;
        if (lVar != null) {
            java.lang.Object obj2 = lVar.f302833d;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 0;
            java.lang.Object obj3 = lVar.f302834e;
            java.lang.String str = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str == null) {
                str = "";
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
            java.util.HashMap hashMap = this.f14336a;
            hashMap.put("retCode", valueOf);
            hashMap.put("feed_read_info", str);
            if (intValue == 0) {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
            } else {
                kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.OpenFinderViewJSApi", "callbackReportReadInfo null");
            kVar.f340863d.e(y2Var.f341013c, y2Var.f341019i + ":fail open fail", null);
        }
    }
}
