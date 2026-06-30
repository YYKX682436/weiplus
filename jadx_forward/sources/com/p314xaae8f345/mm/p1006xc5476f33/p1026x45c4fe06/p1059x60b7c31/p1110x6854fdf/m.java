package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class m implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f164708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u f164709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f164711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l f164712e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u uVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f164712e = lVar;
        this.f164708a = intent;
        this.f164709b = uVar;
        this.f164710c = c0Var;
        this.f164711d = i17;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        int i19 = this.f164711d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = this.f164710c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l lVar = this.f164712e;
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f152244b.f152233a) == null || !(fVar instanceof r45.r46)) {
            lVar.f164707h = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, convert openId to username fail");
            c0Var.a(i19, lVar.o("fail:convert openId to username fail"));
            return;
        }
        r45.r46 r46Var = (r45.r46) fVar;
        if (r46Var.f466076d.f464282d == 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r46Var.f466077e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageBase", "shareTransId success, username:%s", r46Var.f466077e);
            java.lang.String str2 = r46Var.f466077e;
            android.content.Intent intent = this.f164708a;
            intent.putExtra("Select_Conv_User", str2);
            intent.putExtra("KSendWording", this.f164709b.f164788a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4x));
            this.f164712e.M(this.f164710c, this.f164711d, this.f164709b, this.f164708a, true);
            return;
        }
        lVar.f164707h = false;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r46Var.f466076d.f464283e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response username is null");
            c0Var.a(i19, lVar.o("fail:response username is null"));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response error msg:%s", r46Var.f466076d.f464283e);
            c0Var.a(i19, lVar.o("fail:" + r46Var.f466076d.f464283e));
        }
    }
}
