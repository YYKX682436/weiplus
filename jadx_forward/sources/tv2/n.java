package tv2;

/* loaded from: classes10.dex */
public final class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tv2.o f503854a;

    public n(tv2.o oVar) {
        this.f503854a = oVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LogPost.FinderPostConfirmStage", "[postConfirm] errType=" + fVar.f152148a + " errCode=" + fVar.f152149b + " errMsg=" + fVar.f152150c);
        int i17 = fVar.f152148a;
        tv2.o oVar = this.f503854a;
        if (i17 == 0 && fVar.f152149b == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.c(oVar.f503855h);
            mv2.f0 f0Var = mv2.f0.f413094a;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.np2) fVar.f152151d).m75936x14adae67(1);
            java.lang.String m75945x2fec8307 = ((r45.np2) fVar.f152151d).m75945x2fec8307(3);
            if (m75945x2fec8307 == null) {
                m75945x2fec8307 = "";
            }
            f0Var.q(oVar.f503855h, c19792x256d2725, m75945x2fec8307, 1);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d27252 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.np2) fVar.f152151d).m75936x14adae67(1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(c19792x256d27252 != null ? c19792x256d27252.m76784x5db1b11() : 0L);
            if (h17 != null && (c19783xd9a946b72 = h17.f66946x284ddcb8) != null) {
                c19783xd9a946b72.m76426x5b7df934(c19783xd9a946b72.m76319x2534fe28() + ((int) oVar.g()));
            }
            if (h17 != null && (c19783xd9a946b7 = h17.f66946x284ddcb8) != null) {
                hc2.p0.b(c19783xd9a946b7, "postSuccess");
            }
            ov2.e.i(oVar, "andr_Cgi_Confirm_Suc", oVar.f503855h, 0, null, 12, null);
        } else {
            int i18 = fVar.f152149b;
            if (i18 == -4302 || i18 == -4301) {
                cu2.u.f303974a.c(oVar.f503855h.m59260x51f8f5b0());
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11();
                c5437xe8b43b11.f135780g.f87971b = oVar.f503855h.m59260x51f8f5b0();
                c5437xe8b43b11.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
            long m59260x51f8f5b0 = oVar.f503855h.m59260x51f8f5b0();
            int i19 = fVar.f152148a;
            int i27 = fVar.f152149b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostReportLogic", "savePostConfirmError " + m59260x51f8f5b0 + ", " + i19 + ", " + i27);
            cu2.t tVar = cu2.u.f303974a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = tVar.f(m59260x51f8f5b0);
            if (f17 != null) {
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b73 = f17.f66946x284ddcb8;
                if (c19783xd9a946b73 != null) {
                    c19783xd9a946b73.m76370x99f9ad7b(i19);
                }
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b74 = f17.f66946x284ddcb8;
                if (c19783xd9a946b74 != null) {
                    c19783xd9a946b74.m76369x99f1cc2e(i27);
                }
                tVar.l(f17);
            }
            oVar.h("andr_Cgi_Confirm_Fail", oVar.f503855h, fVar.f152149b, fVar.f152150c);
        }
        oVar.f503855h.m59433x2b7e608b("doPostConfirmEnd");
        oVar.f503856i = new tv2.q(oVar.f503855h);
        oVar.f503857m.countDown();
        return jz5.f0.f384359a;
    }
}
