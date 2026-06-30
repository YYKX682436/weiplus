package d83;

/* loaded from: classes2.dex */
public final class a extends com.p314xaae8f345.mm.p944x882e457a.i {
    public a() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.b6();
        lVar.f152198b = new r45.c6();
        lVar.f152200d = 6939;
        lVar.f152199c = "/cgi-bin/micromsg-bin/get_ilink_auth_code";
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.c6 resp = (r45.c6) fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIlinkAuthCode", "AffILinkAuthCodeCgi errType:" + i17 + " errCode:" + i18 + " errMsg:" + str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("AffILinkAuthCodeCgi ret:");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = resp.f452833d;
        sb6.append(gVar != null ? gVar.i() : null);
        sb6.append(", ");
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = resp.f452834e;
        sb6.append(gVar2 != null ? gVar2.i() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetIlinkAuthCode", sb6.toString());
    }
}
