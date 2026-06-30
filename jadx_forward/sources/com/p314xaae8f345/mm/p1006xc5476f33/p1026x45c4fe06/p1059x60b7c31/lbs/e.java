package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs;

/* loaded from: classes.dex */
public class e implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162939a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162940b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.f f162941c;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162941c = fVar;
        this.f162939a = e9Var;
        this.f162940b = i17;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.lbs.f fVar = this.f162941c;
        if (i17 != fVar.f162943g) {
            return false;
        }
        int i19 = this.f162940b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162939a;
        if (i18 == -1) {
            if (intent == null) {
                e9Var.a(i19, fVar.o("fail"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
                return true;
            }
            com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) intent.getParcelableExtra("key_pick_addr");
            java.lang.String stringExtra = intent.getStringExtra("kPoiid");
            if (stringExtra == null) {
                stringExtra = "";
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            if (c11121x1f1011 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseLocation", "addr: " + c11121x1f1011.m48126x9616526c());
                hashMap.put("address", c11121x1f1011.a());
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c11121x1f1011.c());
                hashMap.put("latitude", java.lang.Float.valueOf(c11121x1f1011.f152757t));
                hashMap.put("longitude", java.lang.Float.valueOf(c11121x1f1011.f152758u));
                hashMap.put("poiid", stringExtra);
                hashMap.get("address");
                hashMap.get(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                e9Var.a(i19, fVar.p("ok", hashMap));
            } else {
                e9Var.a(i19, fVar.o("fail"));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseLocation", "location result is empty!");
            }
        } else if (i18 == 0) {
            e9Var.a(i19, fVar.o("fail:cancel"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseLocation", "location result is cancel!");
        } else {
            e9Var.a(i19, fVar.o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiChooseLocation", "location result is fail!");
        }
        return true;
    }
}
