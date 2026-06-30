package ks1;

/* loaded from: classes16.dex */
public final class j extends ks1.g {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(js1.c tokenManager) {
        super(tokenManager);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tokenManager, "tokenManager");
    }

    @Override // ks1.g
    public com.p314xaae8f345.mm.p944x882e457a.o c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.api.C12965xc9712d2 transferRequestInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(transferRequestInfo, "transferRequestInfo");
        r45.ou3 ou3Var = new r45.ou3();
        ou3Var.f464055g = transferRequestInfo.f175447e;
        ou3Var.f464053e = transferRequestInfo.f175449g;
        ou3Var.f464057i = transferRequestInfo.f175448f;
        ou3Var.f464054f = transferRequestInfo.f175452m;
        ou3Var.f464056h = 400;
        r45.y24 y24Var = transferRequestInfo.f175450h;
        if (y24Var == null) {
            y24Var = new r45.y24();
        }
        ou3Var.f464052d = y24Var;
        ou3Var.f464060o = 2;
        ou3Var.f464061p = transferRequestInfo.f175458s;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = ou3Var;
        lVar.f152198b = new r45.pu3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/h5exttransfer";
        lVar.f152200d = 6673;
        lVar.f152201e = 6673;
        lVar.f152202f = 0;
        return lVar.a();
    }

    @Override // ks1.g
    public java.lang.String d() {
        return "/cgi-bin/micromsg-bin/h5exttransfer";
    }

    @Override // ks1.g
    public r45.z24 e(com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = oVar != null ? oVar.f152244b.f152233a : null;
        r45.pu3 pu3Var = fVar instanceof r45.pu3 ? (r45.pu3) fVar : null;
        if (pu3Var != null) {
            return pu3Var.f464943d;
        }
        return null;
    }

    @Override // ks1.g
    public java.lang.String f() {
        return "liteappExtTransfer";
    }
}
