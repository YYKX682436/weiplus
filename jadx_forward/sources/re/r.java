package re;

/* loaded from: classes7.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    public int f475821b;

    /* renamed from: c, reason: collision with root package name */
    public int f475822c;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f475826g;

    /* renamed from: a, reason: collision with root package name */
    public boolean f475820a = false;

    /* renamed from: d, reason: collision with root package name */
    public boolean f475823d = false;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f475824e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f475825f = false;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y0 f475827h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y0();

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var) {
        this.f475826g = v5Var;
    }

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y0 y0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475826g;
        k91.f M1 = v5Var.M1();
        if (M1 == null) {
            return;
        }
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(v5Var.v3());
        java.util.Map map = this.f475824e;
        java.util.HashMap hashMap = new java.util.HashMap(map);
        ((java.util.HashMap) map).clear();
        java.lang.String Z1 = v5Var.Z1();
        java.lang.String str = M1.f387257m;
        if (!android.text.TextUtils.isEmpty(str) || !android.text.TextUtils.isEmpty(Z1)) {
            hashMap.put("originalPageOrientation", str);
            hashMap.put("lastPageOrientation", Z1);
        }
        int mo50260x9f1221c2 = v5Var.mo50260x9f1221c2();
        int width = v5Var.mo51313xaf0c0532().getWidth();
        int height = v5Var.mo51313xaf0c0532().getHeight();
        int i17 = a17[0];
        int i18 = a17[1];
        xi1.o a18 = v5Var.mo50261xee5260a9().mo51612x60543150().a();
        y0Var.getClass();
        java.util.HashMap hashMap2 = new java.util.HashMap(10);
        hashMap2.put("windowWidth", java.lang.Integer.valueOf(ik1.w.e(width)));
        hashMap2.put("windowHeight", java.lang.Integer.valueOf(ik1.w.e(height)));
        hashMap2.put("screenWidth", java.lang.Integer.valueOf(ik1.w.e(i17)));
        hashMap2.put("screenHeight", java.lang.Integer.valueOf(ik1.w.e(i18)));
        java.util.HashMap hashMap3 = new java.util.HashMap();
        hashMap3.put("size", hashMap2);
        hashMap3.put("changedWebviewIds", new int[]{mo50260x9f1221c2});
        if (u46.a.b(xi1.o.f536243n, a18)) {
            hashMap3.put("deviceOrientation", "landscape");
        } else if (xi1.o.PORTRAIT == a18) {
            hashMap3.put("deviceOrientation", "portrait");
        }
        if (!hashMap.isEmpty()) {
            hashMap3.put("pageOrientation", new java.util.HashMap(hashMap));
        }
        java.lang.String jSONObject = new org.json.JSONObject(hashMap3).toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandOnViewDidResize[pageOrientation]", "dispatch(%s) with page(%s:%s) data(%s)", y0Var.k(), v5Var.mo48798x74292566(), v5Var.X1(), jSONObject);
        y0Var.f163907f = jSONObject;
        y0Var.v(v5Var, v5Var.mo50260x9f1221c2());
        y0Var.m();
        y0Var.f163907f = jSONObject;
        y0Var.v(v5Var.v3(), v5Var.mo50260x9f1221c2());
        y0Var.m();
    }

    public final boolean b(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475826g;
        xi1.o a17 = v5Var.C1() != null ? v5Var.C1().a() : null;
        if (a17 == null) {
            a17 = xi1.o.d(v5Var.Z1());
        }
        xi1.o oVar = xi1.o.PORTRAIT;
        if (a17 == null) {
            a17 = oVar;
        }
        boolean z17 = false;
        if (u46.a.b(xi1.o.f536243n, a17)) {
            return i17 > i18;
        }
        if (oVar != a17) {
            return true;
        }
        if (i18 > i17) {
            return true;
        }
        if ((v5Var.mo50261xee5260a9() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1178x6fbd6873.p1179xd10bdbf0.p1180x9d4bf30f.r0) && v5Var.v1() != null && v5Var.v1().isInMultiWindowMode()) {
            if (v5Var.mo50261xee5260a9().mo51612x60543150().a() == oVar || v5Var.v1().getRequestedOrientation() == 1) {
                if ((i17 > 0) & (i18 > 0)) {
                    z17 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "isViewSizeMatchedByRequestedOrientation, activityInMultiWindowMode width[%d] height[%d] ret[%b]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
        }
        return z17;
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f475826g;
        if (v5Var.mo50262x39e05d35()) {
            if (!this.f475825f) {
                a(this.f475827h);
                return;
            }
            a(new re.q(null));
            this.f475825f = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.AppBrandPageViewResizedEmitter[pageOrientation]", "tryDispatchViewDidResize, appId[%s], url[%s], now_orientation[%s], send onAppRouteResized instead", v5Var.mo48798x74292566(), v5Var.X1(), v5Var.Z1());
        }
    }
}
