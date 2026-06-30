package dc3;

/* loaded from: classes9.dex */
public class a extends dm.s7 {
    public static final l75.e0 Q1 = dm.s7.m125489x3593deb(dc3.a.class);

    public static r45.nm5 t0(dc3.a aVar) {
        r45.nm5 nm5Var = new r45.nm5();
        nm5Var.f463031d = aVar.f68309x29dd02d3;
        nm5Var.f463034g = aVar.f68293x4f4dc37;
        nm5Var.f463035h = aVar.f68292x4ecae8fb;
        nm5Var.f463040p = aVar.f68283x709d5570;
        nm5Var.f463039o = aVar.f68284x5c9035d8;
        nm5Var.f463044t = aVar.f68287xadbd0f0e;
        nm5Var.f463037m = aVar.f68290xca2593de;
        nm5Var.f463038n = aVar.f68291x278d9c4b;
        nm5Var.f463032e = aVar.f68301x96a1f680;
        nm5Var.f463033f = aVar.f68300x96a1d68f;
        nm5Var.f463047w = aVar.f68288x2784b87a;
        nm5Var.f463049y = aVar.f68299x7a9eff12;
        nm5Var.f463048x = aVar.f68307x1e0b4b0a;
        nm5Var.f463050z = aVar.f68285x657ccc82;
        nm5Var.A = aVar.f68289xa94c1dd;
        nm5Var.B = aVar.f68286xef38872e;
        nm5Var.f463041q = aVar.f68306x645a32d;
        nm5Var.G = aVar.f68308xcac5ce65;
        r45.eg7 eg7Var = new r45.eg7();
        nm5Var.D = eg7Var;
        eg7Var.f454999d = aVar.f68311xbac4f136;
        eg7Var.f455000e = aVar.f68312xbac5dad0;
        eg7Var.f455001f = aVar.f68314xfb93d3ab;
        eg7Var.f455002g = aVar.f68313x493557f6;
        r45.f34 f34Var = new r45.f34();
        nm5Var.E = f34Var;
        f34Var.f455516d = aVar.f68305xcade653b;
        f34Var.f455517e = aVar.f68304x1d59393d;
        f34Var.f455518f = aVar.f68302xe0c45a35;
        f34Var.f455519g = aVar.f68303x14965a8c;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f68298x8f314ce2)) {
            nm5Var.F = null;
        } else {
            bw5.x7 x7Var = new bw5.x7();
            nm5Var.F = x7Var;
            try {
                x7Var.mo11468x92b714fd(aVar.f68298x8f314ce2.getBytes(java.nio.charset.StandardCharsets.ISO_8859_1));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalRedPacketStoryInfo", "[convertToData] ecs_jump_info success");
            } catch (java.lang.Exception e17) {
                nm5Var.F = null;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalRedPacketStoryInfo", "[convertToData] ecs_jump_info fail: %s", e17.getLocalizedMessage());
            }
        }
        return nm5Var;
    }

    @Override // dm.s7, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return Q1;
    }
}
