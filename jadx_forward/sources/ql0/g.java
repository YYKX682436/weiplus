package ql0;

/* loaded from: classes13.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f445997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f445998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f445999f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.Float f446000g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446001h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446002i;

    public g(ql0.l lVar, boolean z17, java.lang.String str, java.lang.Boolean bool, java.lang.Float f17, java.lang.String str2, java.lang.String str3) {
        this.f445997d = lVar;
        this.f445998e = z17;
        this.f445999f = str;
        this.f446000g = f17;
        this.f446001h = str2;
        this.f446002i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ql0.l lVar = this.f445997d;
        java.lang.String str = lVar.f446026d;
        boolean z17 = this.f445998e;
        java.lang.String str2 = this.f445999f;
        java.lang.String str3 = this.f446001h;
        if (!z17 || android.text.TextUtils.isEmpty(str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "red dot id null");
            tl0.b.f501730d.z0(2);
        } else {
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = str2;
            objArr[1] = str3 == null ? "" : str3;
            java.lang.String str4 = this.f446002i;
            objArr[2] = str4 == null ? "" : str4;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "click reddotId:%s anchorId:%s title:%s", objArr);
            ul0.c cVar = tl0.b.f501729c;
            if (cVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "db null?");
            } else if (kl0.a.b()) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                calendar.setTime(new java.util.Date(currentTimeMillis));
                int i17 = calendar.get(7);
                int i18 = calendar.get(11);
                dm.n7 n7Var = new dm.n7();
                n7Var.f67681xef3863f8 = str2 == null ? "" : str2;
                n7Var.f67676xe3dffc55 = str3 == null ? "" : str3;
                if (str4 == null) {
                    str4 = "";
                }
                n7Var.f67684x29dd02d3 = str4;
                n7Var.f67683x9de75411 = currentTimeMillis;
                n7Var.f67677x6f12d422 = i17;
                n7Var.f67679xd557edbc = i18;
                n7Var.f67675xf102ad1b = 2;
                if (!cVar.z0(n7Var)) {
                    cVar.D0(n7Var);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "save BaseLiveHomeRedDotEvent " + str2);
                em0.b.b("LiveHomeRedDot", 501);
                hl0.e eVar = new hl0.e("LiveHomeRedDot", str2);
                eVar.f363593h = java.lang.System.currentTimeMillis();
                eVar.a();
                if (!android.text.TextUtils.isEmpty(str2)) {
                    lVar.wi(str2 != null ? str2 : "", true);
                }
            }
        }
        if (wm.a.a()) {
            lVar.getClass();
            ((vm.b) ((xs.x0) i95.n0.c(xs.x0.class))).m134976x2690a4ac();
            if (!z17) {
                new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70().m111194xc55f083f(java.util.Optional.of(java.lang.Boolean.TRUE));
                new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9().m111205xc55f083f();
            } else {
                new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a().m111219x33443489(str2, java.util.Optional.of(java.lang.Boolean.TRUE));
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9 c27153x10a6a4c9 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27153x10a6a4c9();
                java.lang.Float f17 = this.f446000g;
                c27153x10a6a4c9.m111207x33443489(str2, str3, java.util.Optional.of(java.lang.Float.valueOf(f17 != null ? f17.floatValue() : 0.0f)));
            }
        }
    }
}
