package ww1;

/* loaded from: classes9.dex */
public class m extends com.p314xaae8f345.mm.p944x882e457a.i {
    public m(double d17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.lang.String str6, boolean z17, java.lang.String str7) {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.ix ixVar = new r45.ix();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.i0(d17 + "", "100"));
        sb6.append("");
        ixVar.f458909d = sb6.toString();
        ixVar.f458910e = str;
        ixVar.f458911f = str2;
        ixVar.f458912g = str3;
        ixVar.f458913h = str4;
        ixVar.f458914i = str5;
        ixVar.f458915m = gVar;
        ixVar.f458916n = str6;
        ixVar.f458917o = z17;
        ixVar.f458918p = str7;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiSaveQrcode", "fee：%s desc:%s desc_required:%s descPlaceholder:%s ", java.lang.Double.valueOf(d17), str6, java.lang.Boolean.valueOf(z17), str7);
        lVar.f152197a = ixVar;
        lVar.f152198b = new r45.jx();
        lVar.f152199c = "/cgi-bin/mmpay-bin/busif2fsaveqrcode";
        lVar.f152200d = 4461;
        lVar.f152211o = 2;
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public /* bridge */ /* synthetic */ void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }
}
