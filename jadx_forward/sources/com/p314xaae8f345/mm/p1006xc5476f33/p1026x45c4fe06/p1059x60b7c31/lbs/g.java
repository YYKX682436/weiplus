package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes7.dex */
public final class g implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h f162946a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162947b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f162948c;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h hVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162946a = hVar;
        this.f162947b = e9Var;
        this.f162948c = i17;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.h hVar = this.f162946a;
        if (i17 != hVar.f162950g) {
            return false;
        }
        int i19 = this.f162948c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162947b;
        if (i18 != -1) {
            if (i18 != 0) {
                e9Var.a(i19, hVar.o("fail"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChoosePOI", "choose failed");
            } else {
                e9Var.a(i19, hVar.o("fail cancel"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChoosePOI", "choose canceled");
            }
        } else {
            if (intent == null) {
                e9Var.a(i19, hVar.o("fail:internal error"));
                return true;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            int intExtra = intent.getIntExtra("get_poi_data_type", 0);
            hashMap.put("type", java.lang.Integer.valueOf(intExtra));
            if (intExtra == 1) {
                java.lang.String stringExtra = intent.getStringExtra("get_city");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra);
                hashMap.put("city", stringExtra);
            } else if (intExtra == 2) {
                java.lang.String stringExtra2 = intent.getStringExtra("get_poi_name");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra2);
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, stringExtra2);
                java.lang.String stringExtra3 = intent.getStringExtra("get_poi_address");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(stringExtra3);
                hashMap.put("address", stringExtra3);
                hashMap.put("latitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lat", -1.0f)));
                hashMap.put("longitude", java.lang.Float.valueOf(intent.getFloatExtra("get_lng", -1.0f)));
            }
            e9Var.a(i19, hVar.p("ok", hashMap));
        }
        return true;
    }
}
