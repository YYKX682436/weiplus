package n34;

@j95.b
/* loaded from: classes4.dex */
public class p4 extends i95.w implements p94.o0 {
    public java.lang.String Ai(java.lang.String str, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 c19772x1c2cd081) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        java.lang.String str2 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
        } else {
            byte[] decode = android.util.Base64.decode(str, 0);
            r45.td6 td6Var = new r45.td6();
            try {
                td6Var.mo11468x92b714fd(decode);
                r45.ud6 ud6Var = td6Var.f467862d;
                java.lang.String format = java.lang.String.format("snsId=%s&uxInfo=%s&source=%d&snsStatExt=%s", java.net.URLEncoder.encode(ud6Var.f468802f, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.net.URLEncoder.encode(ud6Var.f468801e, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.lang.Integer.valueOf(td6Var.f467862d.f468803g), java.net.URLEncoder.encode(com.p314xaae8f345.mm.p959x883644fd.k0.g(td6Var.f467862d), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c));
                r45.rd6 rd6Var = td6Var.f467864f;
                c19772x1c2cd081.f38869x6ac9171 = rd6Var == null ? "" : rd6Var.f466285d;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
                str2 = format;
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SnsStatExtUtil", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADExtStr", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getADExtStr", "com.tencent.mm.plugin.sns.SnsStatService");
        return str2;
    }

    public void wi(java.lang.String str, c01.l2 l2Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        if (f9Var.k2()) {
            ot0.q v17 = ot0.q.v(f9Var.j());
            if (v17 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            } else {
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.Y1)) {
                    l2Var.i(str, v17.Y1);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWith", "com.tencent.mm.modelstat.SnsStatExtUtil");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("dealWith", "com.tencent.mm.plugin.sns.SnsStatService");
    }
}
