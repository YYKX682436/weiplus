package xv2;

/* loaded from: classes10.dex */
public final class d implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xv2.e f538935a;

    public d(xv2.e eVar) {
        this.f538935a = eVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.iq2) fVar.f152151d).m75936x14adae67(1);
        long m76784x5db1b11 = c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L;
        xv2.e eVar = this.f538935a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = eVar.f538936h;
        c14994x9b99c079.m59433x2b7e608b("doPostSceneEnd");
        java.util.concurrent.CountDownLatch countDownLatch = eVar.f538940o;
        if (i17 == 0 && i18 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(m76784x5db1b11);
            if (h17 != null && (c19783xd9a946b72 = h17.f66946x284ddcb8) != null) {
                c19783xd9a946b72.m76426x5b7df934(c19783xd9a946b72.m76319x2534fe28() + ((int) eVar.g()));
            }
            if (h17 != null && (c19783xd9a946b7 = h17.f66946x284ddcb8) != null) {
                hc2.p0.b(c19783xd9a946b7, "postSuccess");
            }
            eVar.f538939n = new tv2.q(c14994x9b99c079);
            countDownLatch.countDown();
            ov2.e.i(eVar, "andr_Cgi_Post_Suc", eVar.f538936h, 0, null, 12, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.P(c14994x9b99c079.m59260x51f8f5b0(), i17, i18);
            if (c14994x9b99c079.m59328xcaae1dc7()) {
                mv2.f0 f0Var = mv2.f0.f413094a;
                pm0.v.X(new mv2.w(c14994x9b99c079.m59260x51f8f5b0()));
            }
            eVar.f538939n = new tv2.x(c14994x9b99c079, 2);
            countDownLatch.countDown();
            eVar.h("andr_Cgi_Post_Fail", c14994x9b99c079, i18, str);
        }
        hz2.d.f367846a.h(i17, i18, str);
        return jz5.f0.f384359a;
    }
}
