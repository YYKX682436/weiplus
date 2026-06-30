package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public final class z0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f164862a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f164863b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 f164864c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 f164865d;

    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var) {
        this.f164862a = yVar;
        this.f164863b = i17;
        this.f164864c = a1Var;
        this.f164865d = t0Var;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        java.lang.String str2 = "fail:convert openId to username fail";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.a1 a1Var = this.f164864c;
        int i19 = this.f164863b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = this.f164862a;
        if (i17 == 0 && i18 == 0) {
            boolean z17 = true;
            if (!(oVar == null)) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar.f152244b.f152233a;
                if (!(fVar == null) && (fVar instanceof r45.r46)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ShareTransIdResponse");
                    r45.r46 r46Var = (r45.r46) fVar;
                    if (r46Var.f466076d.f464282d != 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response errcode:" + r46Var.f466076d.f464282d);
                        java.lang.String str3 = r46Var.f466076d.f464283e;
                        if (str3 != null && str3.length() != 0) {
                            z17 = false;
                        }
                        if (z17) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response errmsg:" + r46Var.f466076d.f464283e);
                        } else {
                            str2 = "fail:" + r46Var.f466076d.f464283e + ' ';
                        }
                        yVar.a(i19, a1Var.o(str2));
                        return;
                    }
                    java.lang.String str4 = r46Var.f466077e;
                    if (str4 != null && str4.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, response username is null");
                        yVar.a(i19, a1Var.o("fail:response username is null"));
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId success, username:" + r46Var.f466077e);
                    java.lang.String username = r46Var.f466077e;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(username, "username");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t0 t0Var = this.f164865d;
                    t0Var.getClass();
                    t0Var.f164769d = username;
                    a1Var.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.o5.b(yVar, t0Var.f164766a, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u0(yVar, i19, a1Var, t0Var));
                    return;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiShareImageMessageToSpecificContact", "shareTransId fail, convert openId to username fail");
        yVar.a(i19, a1Var.o("fail:convert openId to username fail"));
    }
}
