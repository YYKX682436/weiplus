package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class y4 implements nf.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f165465a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f165466b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z4 f165467c;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z4 z4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f165467c = z4Var;
        this.f165465a = c0Var;
        this.f165466b = i17;
    }

    @Override // nf.j
    /* renamed from: onResult */
    public void mo14598x57429edc(int i17, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.z4 z4Var = this.f165467c;
        int i18 = this.f165466b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f165465a;
        char c17 = 65535;
        if (i17 != -1) {
            c0Var.a(i18, z4Var.o("fail"));
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("k_select_group");
        java.util.HashMap hashMap = new java.util.HashMap();
        if (android.text.TextUtils.isEmpty(stringExtra)) {
            c0Var.a(i18, z4Var.o("cancel"));
            return;
        }
        stringExtra.getClass();
        switch (stringExtra.hashCode()) {
            case -1901805651:
                if (stringExtra.equals("invisible")) {
                    c17 = 0;
                    break;
                }
                break;
            case -977423767:
                if (stringExtra.equals("public")) {
                    c17 = 1;
                    break;
                }
                break;
            case -314497661:
                if (stringExtra.equals("private")) {
                    c17 = 2;
                    break;
                }
                break;
            case 466743410:
                if (stringExtra.equals("visible")) {
                    c17 = 3;
                    break;
                }
                break;
        }
        switch (c17) {
            case 0:
            case 3:
                java.lang.String stringExtra2 = intent.getStringExtra("Klabel_name_list");
                java.lang.String stringExtra3 = intent.getStringExtra("Kother_user_name_list");
                hashMap.put("group", stringExtra);
                try {
                    if (!android.text.TextUtils.isEmpty(stringExtra2)) {
                        hashMap.put("labels", new org.json.JSONObject(stringExtra2));
                    }
                    if (!android.text.TextUtils.isEmpty(stringExtra3)) {
                        hashMap.put("userList", new org.json.JSONArray(stringExtra3));
                    }
                    c0Var.a(i18, z4Var.p("ok", hashMap));
                    return;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiChooseShareGroup", e17, "", new java.lang.Object[0]);
                    c0Var.a(i18, z4Var.o("cancel"));
                    return;
                }
            case 1:
            case 2:
                hashMap.put("group", stringExtra);
                c0Var.a(i18, z4Var.p("ok", hashMap));
                return;
            default:
                c0Var.a(i18, z4Var.o("cancel"));
                return;
        }
    }
}
