package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31;

/* loaded from: classes.dex */
public class r0 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.b f263978d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s0 f263979e;

    public r0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s0 s0Var, sd.b bVar) {
        this.f263979e = s0Var;
        this.f263978d = bVar;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        sd.b bVar;
        java.lang.Object obj;
        java.lang.Object obj2;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.s0 s0Var = this.f263979e;
        if (i17 == (s0Var.hashCode() & 65535)) {
            sd.b bVar2 = this.f263978d;
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0) bVar2.f488129a).f488143d).m78545xde66c1f2(null);
            if (i18 != -1 || intent == null) {
                bVar = bVar2;
            } else {
                java.lang.String stringExtra = intent.getStringExtra("nationalCode");
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (stringExtra == null) {
                    stringExtra = "";
                }
                java.lang.String stringExtra2 = intent.getStringExtra("userName");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                java.lang.String stringExtra3 = intent.getStringExtra("telNumber");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                java.lang.String stringExtra4 = intent.getStringExtra("addressPostalCode");
                if (stringExtra4 == null) {
                    stringExtra4 = "";
                }
                java.lang.String stringExtra5 = intent.getStringExtra("proviceFirstStageName");
                java.lang.String str2 = stringExtra5 == null ? "" : stringExtra5;
                java.lang.String stringExtra6 = intent.getStringExtra("addressCitySecondStageName");
                java.lang.String str3 = stringExtra6 != null ? stringExtra6 : "";
                java.lang.String stringExtra7 = intent.getStringExtra("addressCountiesThirdStageName");
                java.lang.String str4 = stringExtra7 == null ? "" : stringExtra7;
                java.lang.String stringExtra8 = intent.getStringExtra("addressCountiesFourStageName");
                if (stringExtra8 == null) {
                    stringExtra8 = "";
                }
                java.lang.String stringExtra9 = intent.getStringExtra("addressDetailInfo");
                if (stringExtra9 == null) {
                    stringExtra9 = "";
                }
                if (android.text.TextUtils.isEmpty(stringExtra8) || stringExtra9.startsWith(stringExtra8)) {
                    obj = "addressDetailInfo";
                    obj2 = "proviceFirstStageName";
                    str = stringExtra9;
                } else {
                    obj = "addressDetailInfo";
                    obj2 = "proviceFirstStageName";
                    str = java.lang.String.format("%s%s", stringExtra8, stringExtra9);
                }
                java.lang.String str5 = str;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiEditAddress", "first =  " + str2 + " ; detail =" + stringExtra9 + "; second = " + str3 + " ; tel = " + stringExtra3 + "; third = " + str4);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    s0Var.getClass();
                    hashMap.put("nationalCode", stringExtra.length() < 6 ? stringExtra : stringExtra.substring(0, 6));
                    hashMap.put("nationalCodeFull", stringExtra);
                    hashMap.put("userName", stringExtra2);
                    hashMap.put("telNumber", stringExtra3);
                    hashMap.put("addressPostalCode", stringExtra4);
                    hashMap.put(obj2, str2);
                    hashMap.put("addressCitySecondStageName", str3);
                    hashMap.put("addressCountiesThirdStageName", str4);
                    hashMap.put("addressStreetFourthStageName", stringExtra8);
                    hashMap.put(obj, str5);
                    hashMap.put("addressDetailInfoNew", stringExtra9);
                    bVar2.d(hashMap);
                    return;
                }
                bVar = bVar2;
            }
            if (i18 == 0) {
                bVar.c("cancel", null);
            } else {
                bVar.c("fail", null);
            }
        }
    }
}
