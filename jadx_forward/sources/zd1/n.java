package zd1;

/* loaded from: classes7.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f553081d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zd1.o f553082e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f553083f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f553084g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, zd1.o oVar, int i17, int i18) {
        super(0);
        this.f553081d = yVar;
        this.f553082e = oVar;
        this.f553083f = i17;
        this.f553084g = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        java.lang.String str2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f553081d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.gg.a(yVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = a17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7) a17 : null;
        int i17 = this.f553083f;
        zd1.o oVar = this.f553082e;
        if (n7Var == null) {
            oVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            yVar.a(i17, oVar.u(str2, jSONObject));
        } else {
            of1.w1 s37 = n7Var.s3();
            if (s37 != null) {
                if (s37.m151224xd4bfd001() == this.f553084g) {
                    if (s37.mo51534x86b9ebe3().z0()) {
                        zd1.m mVar = new zd1.m(yVar, i17, oVar);
                        oVar.getClass();
                        android.graphics.Bitmap m120139x12501425 = s37.mo51534x86b9ebe3().m120139x12501425();
                        if (m120139x12501425 == null) {
                            s37.I();
                        } else {
                            if (s37.f426581v == null) {
                                android.view.View view = new android.view.View(s37.getContext());
                                s37.f426581v = view;
                                s37.addView(view, new android.view.ViewGroup.LayoutParams(-1, -1));
                            }
                            android.view.View view2 = s37.f426581v;
                            if (view2 != null) {
                                view2.bringToFront();
                            }
                            android.view.View view3 = s37.f426581v;
                            if (view3 != null) {
                                view3.setBackground(new android.graphics.drawable.BitmapDrawable(s37.getContext().getResources(), m120139x12501425));
                            }
                        }
                        p012xc85e97e9.p093xedfae76a.y mo50358x95c7fa5f = n7Var.mo50358x95c7fa5f();
                        p3325xe03a0797.p3326xc267989b.y0 a18 = mo50358x95c7fa5f != null ? p012xc85e97e9.p093xedfae76a.z.a(mo50358x95c7fa5f) : p3325xe03a0797.p3326xc267989b.z0.b();
                        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
                        p3325xe03a0797.p3326xc267989b.l.d(a18, ((t26.a) p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a).f496880h, null, new zd1.k(s37, mVar, null), 2, null);
                    } else {
                        oVar.getClass();
                        str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi not supported" : null;
                        str2 = str != null ? str : "";
                        java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
                        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                        try {
                            jSONObject2.put("errno", 100);
                        } catch (java.lang.Exception e18) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
                        }
                        yVar.a(i17, oVar.u(str2, jSONObject2));
                    }
                }
            }
            yVar.a(i17, oVar.o("fail: htmlId not found"));
        }
        return jz5.f0.f384359a;
    }
}
