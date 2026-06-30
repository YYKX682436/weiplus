package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes.dex */
public class z implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 f225372a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 a0Var) {
        this.f225372a = a0Var;
    }

    @Override // nf.k
    public boolean a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.a0 a0Var = this.f225372a;
        if (i17 != a0Var.f225029g) {
            return false;
        }
        if (i18 == -1) {
            if (intent == null) {
                a0Var.f224976f.a("invalid location result");
                return true;
            }
            com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011 c11121x1f1011 = (com.p314xaae8f345.mm.p949xdb1a5788.C11121x1f1011) intent.getParcelableExtra("key_pick_addr");
            java.util.HashMap hashMap = new java.util.HashMap();
            if (c11121x1f1011 != null) {
                hashMap.put("address", c11121x1f1011.a());
                hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, c11121x1f1011.c());
                hashMap.put("latitude", java.lang.Float.valueOf(c11121x1f1011.f152757t));
                hashMap.put("longitude", java.lang.Float.valueOf(c11121x1f1011.f152758u));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiChooseLocation", "cbResult: %s", hashMap);
                a0Var.f224976f.c(new org.json.JSONObject(hashMap), false);
            } else {
                a0Var.f224976f.a("empty location result");
            }
        } else if (i18 == 0) {
            a0Var.f224976f.a("user cancel");
        } else {
            a0Var.f224976f.a("location choose fail");
        }
        return true;
    }
}
