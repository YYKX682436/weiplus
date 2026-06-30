package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public final class f implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f164326a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164327b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.g f164328c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f164330e;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.g gVar, java.lang.String str, java.lang.String str2) {
        this.f164326a = lVar;
        this.f164327b = i17;
        this.f164328c = gVar;
        this.f164329d = str;
        this.f164330e = str2;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06 c12218xee12cb06 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.C12218xee12cb06) abstractC11888x1a859600;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult resultCode:%d", java.lang.Integer.valueOf(c12218xee12cb06.f164298d));
        int i17 = c12218xee12cb06.f164298d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.g gVar = this.f164328c;
        int i18 = this.f164327b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f164326a;
        if (i17 == 0) {
            lVar.a(i18, gVar.o("fail"));
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                lVar.a(i18, gVar.o("fail"));
                return;
            } else {
                lVar.a(i18, gVar.o("cancel"));
                return;
            }
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = this.f164329d;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            intent.putExtra("key_add_contact_report_info", str);
        }
        if ((c12218xee12cb06.f164299e & 1) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenUserProfile", "onReceiveResult, fail:not user contact");
            lVar.a(i18, gVar.o("fail:not user contact"));
        } else {
            intent.putExtra("Contact_User", this.f164330e);
            j45.l.j(lVar.mo50352x76847179(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
            lVar.a(i18, gVar.o("ok"));
        }
    }
}
