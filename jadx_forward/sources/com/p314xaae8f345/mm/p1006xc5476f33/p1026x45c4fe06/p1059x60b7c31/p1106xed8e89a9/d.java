package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class d implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.e f164320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f164322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164323f;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.e eVar, java.lang.String str, int i18, java.lang.String str2) {
        this.f164318a = lVar;
        this.f164319b = i17;
        this.f164320c = eVar;
        this.f164321d = str;
        this.f164322e = i18;
        this.f164323f = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 c12218xee12cb06 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06) abstractC11888x1a859600;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.e eVar = this.f164320c;
        int i17 = this.f164319b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164318a;
        if (c12218xee12cb06 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, null result");
            lVar.a(i17, eVar.o("fail"));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(c12218xee12cb06.f164298d));
        int i18 = c12218xee12cb06.f164298d;
        if (i18 == 0) {
            lVar.a(i17, eVar.o("fail"));
            return;
        }
        if (i18 != 1) {
            if (i18 != 2) {
                lVar.a(i17, eVar.o("fail"));
                return;
            } else {
                lVar.a(i17, eVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f164321d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("key_add_contact_report_info", str);
        }
        if (!((c12218xee12cb06.f164299e & 1) != 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenBizProfile", "onReceiveResult, fail:not biz contact");
            lVar.a(i17, eVar.o("fail:not biz contact"));
            return;
        }
        intent.putExtra("Contact_Scene", this.f164322e);
        intent.putExtra("Contact_User", this.f164323f);
        intent.putExtra("key_use_new_contact_profile", true);
        lVar.j(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.c(lVar, intent), 100L);
        lVar.a(i17, eVar.o("ok"));
    }
}
