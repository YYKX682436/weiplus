package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public final class p implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162131a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162132b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q f162133c;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q qVar) {
        this.f162131a = lVar;
        this.f162132b = i17;
        this.f162133c = qVar;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public final void mo14598x57429edc(int i17, android.content.Intent intent) {
        java.lang.String str;
        boolean z17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onActivityResult appId[");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162131a;
        sb6.append(lVar.mo48798x74292566());
        sb6.append("], resultCode[");
        sb6.append(i17);
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.Common.JsApiChooseContactNew", sb6.toString());
        boolean z18 = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.q qVar = this.f162133c;
        int i18 = this.f162132b;
        if (i17 != -1) {
            if (i17 == 0 || i17 == 1) {
                lVar.a(i18, qVar.o("fail cancel"));
                return;
            } else {
                lVar.a(i18, qVar.o("fail:system error"));
                return;
            }
        }
        java.lang.String str2 = null;
        android.net.Uri data = intent != null ? intent.getData() : null;
        if (data == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Common.JsApiChooseContactNew", "onActivityResult appId[" + lVar.mo48798x74292566() + "] NULL contactUri");
            return;
        }
        android.content.ContentResolver contentResolver = lVar.mo50352x76847179().getContentResolver();
        if (contentResolver == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Common.JsApiChooseContactNew", "onActivityResult appId[" + lVar.mo48798x74292566() + "] NULL ContentResolver");
            lVar.a(i18, qVar.o("fail:internal error invalid android context"));
            return;
        }
        android.database.Cursor query = contentResolver.query(data, new java.lang.String[]{"data1"}, null, null, null);
        if (query != null) {
            try {
                if (!query.moveToFirst()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.Common.JsApiChooseContactNew", "onActivityResult appId[" + lVar.mo48798x74292566() + "] cursor empty");
                    str = null;
                    vz5.b.a(query, null);
                }
                do {
                    java.lang.String string = query.getString(0);
                    if (string == null) {
                        str = null;
                    } else {
                        str = string.replaceAll("\\D", "");
                        if (str.startsWith("86")) {
                            str = str.substring(2);
                        }
                    }
                    if (str != null && str.length() != 0) {
                        z17 = false;
                        if (!z17 && android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(str)) {
                            break;
                        }
                    }
                    z17 = true;
                    if (!z17) {
                        break;
                        break;
                    }
                } while (query.moveToNext());
                str = null;
                vz5.b.a(query, null);
            } finally {
            }
        } else {
            str = null;
        }
        query = contentResolver.query(data, new java.lang.String[]{"display_name"}, null, null, null);
        if (query != null) {
            try {
                java.lang.String string2 = query.moveToFirst() ? query.getString(0) : "";
                vz5.b.a(query, null);
                str2 = string2;
            } finally {
            }
        }
        java.lang.String str3 = str2 == null ? "" : str2;
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (z18) {
            lVar.a(i18, qVar.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("phoneNumber", str);
        hashMap.put("displayName", str3);
        lVar.a(i18, qVar.p("ok", hashMap));
    }
}
