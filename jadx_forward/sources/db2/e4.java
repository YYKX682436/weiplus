package db2;

/* loaded from: classes8.dex */
public final class e4 extends com.p314xaae8f345.mm.p944x882e457a.i {
    public e4(double d17, double d18) {
        r45.zd3 zd3Var = new r45.zd3();
        zd3Var.f473464e = d17;
        zd3Var.f473463d = d18;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = zd3Var;
        lVar.f152198b = new r45.ae3();
        lVar.f152199c = "/cgi-bin/micromsg-bin/getcurlocation";
        lVar.f152200d = 665;
        lVar.f152201e = 0;
        lVar.f152202f = 0;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Cgi.GetCurrentLocation", "onCgiBack errType:" + i17 + ", errCode:" + i18 + ", errMsg:" + str);
    }
}
