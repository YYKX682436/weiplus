package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public abstract class e {
    public static java.util.Map a(android.content.Intent intent) {
        java.lang.Object obj;
        java.lang.String str;
        java.lang.Object obj2;
        java.lang.String str2;
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
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        java.lang.String stringExtra6 = intent.getStringExtra("addressCitySecondStageName");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        java.lang.String stringExtra7 = intent.getStringExtra("addressCountiesThirdStageName");
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        java.lang.String stringExtra8 = intent.getStringExtra("addressCountiesFourStageName");
        if (stringExtra8 == null) {
            stringExtra8 = "";
        }
        java.lang.String stringExtra9 = intent.getStringExtra("addressDetailInfo");
        if (stringExtra9 == null) {
            obj = "addressDetailInfo";
            str = "";
        } else {
            obj = "addressDetailInfo";
            str = stringExtra9;
        }
        int intExtra = intent.getIntExtra("addressID", 0);
        int intExtra2 = intent.getIntExtra("formatErrorCode", 0);
        if (android.text.TextUtils.isEmpty(stringExtra8) || str.startsWith(stringExtra8)) {
            obj2 = "formatErrorCode";
            str2 = str;
        } else {
            obj2 = "formatErrorCode";
            str2 = java.lang.String.format("%s%s", stringExtra8, str);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.AddressConverter", "first =  " + stringExtra5 + " ; detail =" + str + "; second = " + stringExtra6 + " ; tel = " + stringExtra3 + "; third = " + stringExtra7);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra2)) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str3 = str;
        hashMap.put("nationalCode", stringExtra.length() < 6 ? stringExtra : stringExtra.substring(0, 6));
        hashMap.put("userName", stringExtra2);
        hashMap.put("telNumber", stringExtra3);
        hashMap.put("addressPostalCode", stringExtra4);
        hashMap.put("proviceFirstStageName", stringExtra5);
        hashMap.put("addressCitySecondStageName", stringExtra6);
        hashMap.put("addressCountiesThirdStageName", stringExtra7);
        hashMap.put("addressStreetFourthStageName", stringExtra8);
        hashMap.put(obj, str2);
        hashMap.put("addressDetailInfoNew", str3);
        hashMap.put("nationalCodeFull", stringExtra);
        hashMap.put("addressID", java.lang.String.valueOf(intExtra));
        hashMap.put(obj2, java.lang.String.valueOf(intExtra2));
        return hashMap;
    }
}
