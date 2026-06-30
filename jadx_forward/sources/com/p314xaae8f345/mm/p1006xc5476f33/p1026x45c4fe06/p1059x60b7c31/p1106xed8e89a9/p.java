package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164347a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164348b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.q f164349c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164351e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164352f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164353g;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.q qVar, java.lang.String str, int i18, java.lang.String str2, java.lang.String str3) {
        this.f164347a = lVar;
        this.f164348b = i17;
        this.f164349c = qVar;
        this.f164350d = str;
        this.f164351e = i18;
        this.f164352f = str2;
        this.f164353g = str3;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 c12218xee12cb06 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.q qVar = this.f164349c;
        int i17 = this.f164348b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164347a;
        if (c12218xee12cb06 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiProfile", "onReceiveResult get NULL result");
            qVar.getClass();
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, qVar.u(str, jSONObject));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(c12218xee12cb06.f164298d));
        int i18 = c12218xee12cb06.f164298d;
        if (i18 == 0) {
            lVar.a(i17, qVar.o("fail"));
            return;
        }
        if (i18 != 1) {
            if (i18 != 2) {
                lVar.a(i17, qVar.o("fail"));
                return;
            } else {
                lVar.a(i17, qVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str3 = this.f164350d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            intent.putExtra("key_add_contact_report_info", str3);
        }
        if ((c12218xee12cb06.f164299e & 1) != 0) {
            intent.putExtra("Contact_Scene", this.f164351e);
        }
        java.lang.String tabTypeStr = this.f164352f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(tabTypeStr, "$tabTypeStr");
        if ((tabTypeStr.length() > 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(tabTypeStr, 0) == 2) {
            intent.putExtra("biz_profile_tab_type", 1);
        }
        intent.putExtra("Contact_User", this.f164353g);
        intent.putExtra("key_use_new_contact_profile", true);
        j45.l.j(lVar.getF229340d(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        lVar.a(i17, qVar.o("ok"));
    }
}
