package ks1;

/* loaded from: classes16.dex */
public final class b extends ks1.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(js1.c tokenManager) {
        super(tokenManager);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenManager, "tokenManager");
    }

    @Override // ks1.g
    public com.p314xaae8f345.mm.p944x882e457a.o c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 transferRequestInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transferRequestInfo, "transferRequestInfo");
        r45.ru3 ru3Var = new r45.ru3();
        ru3Var.f466746g = transferRequestInfo.f175447e;
        ru3Var.f466744e = transferRequestInfo.f175449g;
        ru3Var.f466748i = transferRequestInfo.f175448f;
        ru3Var.f466745f = transferRequestInfo.f175452m;
        ru3Var.f466747h = 400;
        r45.y24 y24Var = transferRequestInfo.f175450h;
        if (y24Var == null) {
            y24Var = new r45.y24();
        }
        ru3Var.f466743d = y24Var;
        ru3Var.f466751o = 1;
        ru3Var.f466749m = transferRequestInfo.f175455p;
        ru3Var.f466750n = transferRequestInfo.f175454o;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ru3Var;
        lVar.f152198b = new r45.su3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/mawebtransfer";
        lVar.f152200d = 7094;
        lVar.f152201e = 7094;
        lVar.f152202f = 0;
        return lVar.a();
    }

    @Override // ks1.g
    public java.lang.String d() {
        return "/cgi-bin/micromsg-bin/mawebtransfer";
    }

    @Override // ks1.g
    public r45.z24 e(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.su3 su3Var = fVar instanceof r45.su3 ? (r45.su3) fVar : null;
        if (su3Var != null) {
            return su3Var.f467508d;
        }
        return null;
    }

    @Override // ks1.g
    public java.lang.String f() {
        return "AppBrandH5WebTransfer";
    }
}
