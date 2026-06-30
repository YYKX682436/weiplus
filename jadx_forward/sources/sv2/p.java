package sv2;

/* loaded from: classes10.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sv2.q f494875a;

    public p(sv2.q qVar) {
        this.f494875a = qVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 m76802x2dd01666;
        java.util.LinkedList<com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e> m76962x74cd162e;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        sv2.q qVar = this.f494875a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = qVar.f494879n;
        c14994x9b99c079.m59432x8c9240d6("doPostSceneEnd");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) ((r45.pp2) resp).m75936x14adae67(1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("svrFinderObj id:");
        sb6.append(pm0.v.u(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L));
        sb6.append(", localId:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.x80 x80Var = qVar.f494876h;
        sb6.append(x80Var.f66236x88be67a1);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = qVar.f494878m;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        if (c19792x256d2725 != null && (m76802x2dd01666 = c19792x256d2725.m76802x2dd01666()) != null && (m76962x74cd162e = m76802x2dd01666.m76962x74cd162e()) != null && (c19788xd7cfd73e = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e) kz5.n0.Z(m76962x74cd162e)) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "full_cover_url:" + c19788xd7cfd73e.m76593x1b8bd82d() + " full_cover_url_token:" + c19788xd7cfd73e.m76594x3e755f67());
        }
        cu2.o oVar = cu2.o.f303963a;
        java.util.concurrent.CountDownLatch countDownLatch = qVar.f494881p;
        if (i17 == 0 && i18 == 0 && c19792x256d2725 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b7 != null) {
                c19783xd9a946b7.m76426x5b7df934(c19783xd9a946b7.m76319x2534fe28() + ((int) qVar.g()));
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b72 = c14994x9b99c079.f66946x284ddcb8;
            if (c19783xd9a946b72 != null) {
                hc2.p0.b(c19783xd9a946b72, "postSuccess");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206494a.a(x80Var);
            oVar.c(x80Var, c19792x256d2725);
            mv2.f0 f0Var = mv2.f0.f413094a;
            pm0.v.X(new mv2.u(x80Var.f66236x88be67a1, c19792x256d2725.m76784x5db1b11(), true));
            if (c14994x9b99c079.m59277xa8f45ee4().m75942xfb822ef2(6) > 0) {
                long a17 = c01.id.a() - c14994x9b99c079.m59277xa8f45ee4().m75942xfb822ef2(6);
                boolean m59314x4d5c4d55 = c14994x9b99c079.m59314x4d5c4d55();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0 f0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.f0.f206548a;
                f0Var2.d(1718L, 11L, 1L, m59314x4d5c4d55);
                f0Var2.d(1718L, 12L, a17, m59314x4d5c4d55);
            }
            qVar.f494880o = new sv2.b(x80Var);
            countDownLatch.countDown();
            ov2.e.i(qVar, "andr_Cgi_Draft_Suc", qVar.f494879n, 0, null, 12, null);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e0.f206536a;
            e0Var.f(c14994x9b99c079.m59314x4d5c4d55());
            if (((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(x80Var.f66236x88be67a1) != null) {
                if (i17 == 4) {
                    x80Var.f66235x52c1d072 = (x80Var.f66235x52c1d072 | 2) & (-2);
                    oVar.b(x80Var);
                    e0Var.e(c14994x9b99c079.m59314x4d5c4d55());
                }
                if ((x80Var.f66235x52c1d072 & 2) != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a.P(x80Var.f66236x88be67a1, i17, i18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b0.f206494a.a(x80Var);
                    mv2.f0 f0Var3 = mv2.f0.f413094a;
                    pm0.v.X(new mv2.t(x80Var.f66236x88be67a1, false));
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "deleted when scene end.");
            }
            qVar.f494880o = new sv2.c(x80Var, 2);
            countDownLatch.countDown();
            qVar.h("andr_Cgi_Draft_Fail", c14994x9b99c079, i18, str);
        }
        return jz5.f0.f384359a;
    }
}
