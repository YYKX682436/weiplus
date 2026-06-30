package zd1;

/* loaded from: classes7.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f553085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f553086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553087f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553088g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553089h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f553090i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f553091m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f553092n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f553093o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f553094p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ zd1.s f553095q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var3, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var4, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i18, zd1.s sVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553085d = h0Var;
        this.f553086e = z17;
        this.f553087f = f0Var;
        this.f553088g = f0Var2;
        this.f553089h = f0Var3;
        this.f553090i = f0Var4;
        this.f553091m = i17;
        this.f553092n = c11510xdd90c2f2;
        this.f553093o = yVar;
        this.f553094p = i18;
        this.f553095q = sVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zd1.q(this.f553085d, this.f553086e, this.f553087f, this.f553088g, this.f553089h, this.f553090i, this.f553091m, this.f553092n, this.f553093o, this.f553094p, this.f553095q, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zd1.q qVar = (zd1.q) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        qVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        float f17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0((android.graphics.Bitmap) this.f553085d.f391656d, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot.jpg", false);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("test bitmap path: ");
                sb6.append(lp0.b.D());
                sb6.append("AppSnapshot.jpg, isOk:");
                sb6.append(D0);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb6.toString());
            }
            if (this.f553086e) {
                int i17 = this.f553087f.f391649d + this.f553088g.f391649d;
                java.lang.Object obj2 = this.f553085d.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
                if (i17 > ((android.graphics.Bitmap) obj2).getWidth()) {
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("clip fail, x + width:");
                    sb7.append(this.f553087f.f391649d + this.f553088g.f391649d);
                    sb7.append(" snapshot!!.width:");
                    java.lang.Object obj3 = this.f553085d.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj3);
                    sb7.append(((android.graphics.Bitmap) obj3).getWidth());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb7.toString());
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f553088g;
                    java.lang.Object obj4 = this.f553085d.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj4);
                    f0Var.f391649d = ((android.graphics.Bitmap) obj4).getWidth() - this.f553087f.f391649d;
                }
                int i18 = this.f553089h.f391649d + this.f553090i.f391649d;
                java.lang.Object obj5 = this.f553085d.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj5);
                if (i18 > ((android.graphics.Bitmap) obj5).getHeight()) {
                    java.lang.StringBuilder sb8 = new java.lang.StringBuilder("clip fail, y + height:");
                    sb8.append(this.f553089h.f391649d + this.f553090i.f391649d);
                    sb8.append(" height:");
                    java.lang.Object obj6 = this.f553085d.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj6);
                    sb8.append(((android.graphics.Bitmap) obj6).getHeight());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb8.toString());
                    p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var2 = this.f553090i;
                    java.lang.Object obj7 = this.f553085d.f391656d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj7);
                    f0Var2.f391649d = ((android.graphics.Bitmap) obj7).getHeight() - this.f553089h.f391649d;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f553085d;
                java.lang.Object obj8 = h0Var.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj8);
                int i19 = this.f553087f.f391649d;
                int i27 = this.f553089h.f391649d;
                int i28 = this.f553088g.f391649d;
                int i29 = this.f553090i.f391649d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i29));
                arrayList.add(java.lang.Integer.valueOf(i28));
                arrayList.add(java.lang.Integer.valueOf(i27));
                arrayList.add(java.lang.Integer.valueOf(i19));
                arrayList.add((android.graphics.Bitmap) obj8);
                java.lang.Object obj9 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj9, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/jsapi/security/JsApiSetAppSnapshotStrategy$invoke$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj9, createBitmap, "com/tencent/mm/plugin/appbrand/jsapi/security/JsApiSetAppSnapshotStrategy$invoke$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                h0Var.f391656d = createBitmap;
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                boolean D02 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0((android.graphics.Bitmap) this.f553085d.f391656d, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot_After.jpg", false);
                java.lang.StringBuilder sb9 = new java.lang.StringBuilder("test bitmap path: ");
                sb9.append(lp0.b.D());
                sb9.append("AppSnapshot_After.jpg, isOk:");
                sb9.append(D02);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb9.toString());
            }
            int i37 = this.f553091m;
            if (i37 > 0) {
                float f18 = i37;
                java.lang.Object obj10 = this.f553085d.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj10);
                int width = ((android.graphics.Bitmap) obj10).getWidth();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f553085d.f391656d);
                f17 = f18 / java.lang.Math.min(width, ((android.graphics.Bitmap) r10).getHeight());
            } else {
                f17 = 1.0f;
            }
            zd1.d dVar = zd1.e.f553063i;
            if (f17 >= 1.0f) {
                java.lang.Object obj11 = this.f553085d.f391656d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj11);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = this.f553092n.C0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
                dVar.a((android.graphics.Bitmap) obj11, C0, false);
            } else {
                android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0((android.graphics.Bitmap) this.f553085d.f391656d, f17, f17, true);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
                    boolean D03 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(F0, 100, android.graphics.Bitmap.CompressFormat.JPEG, lp0.b.D() + "AppSnapshot_After_Scale.jpg", false);
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder("test bitmap path: ");
                    sb10.append(lp0.b.D());
                    sb10.append("AppSnapshot_After.jpg, isOk:");
                    sb10.append(D03);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", sb10.toString());
                }
                if (F0 != null && !F0.isRecycled()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C02 = this.f553092n.C0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C02, "getService(...)");
                    dVar.a(F0, C02, true);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f553093o;
            int i38 = this.f553094p;
            zd1.s sVar = this.f553095q;
            sVar.getClass();
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
            yVar.a(i38, sVar.u(str, jSONObject));
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiSetAppSnapshotStrategy", "scale and dispatch bitmap for " + this.f553092n.f156336n + ", get exception:" + e18);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar2 = this.f553093o;
            int i39 = this.f553094p;
            zd1.s sVar2 = this.f553095q;
            sVar2.getClass();
            java.lang.String str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            java.lang.String str4 = str3 != null ? str3 : "";
            java.lang.String str5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            yVar2.a(i39, sVar2.u(str4, jSONObject2));
        }
        return jz5.f0.f384359a;
    }
}
