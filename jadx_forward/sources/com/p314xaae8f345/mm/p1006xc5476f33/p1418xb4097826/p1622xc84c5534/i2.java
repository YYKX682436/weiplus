package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes10.dex */
public final class i2 implements mv2.w0 {
    @Override // mv2.w0
    /* renamed from: onPostErr */
    public void mo56114x385435c6(long j17, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f17 = cu2.u.f303974a.f(j17);
        if (f17 != null) {
            p2Var.F(f17, false);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2();
        am.vc vcVar = c5521xb353c3e2.f135849g;
        vcVar.f89721a = j17;
        vcVar.f89722b = false;
        c5521xb353c3e2.e();
    }

    @Override // mv2.w0
    /* renamed from: onPostFakeOk */
    public void mo56115x10614c10(long j17) {
    }

    @Override // mv2.w0
    /* renamed from: onPostNotify */
    public void mo56116x1ed18348(long j17, boolean z17) {
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2();
        am.vc vcVar = c5521xb353c3e2.f135849g;
        vcVar.f89721a = j17;
        vcVar.f89722b = false;
        c5521xb353c3e2.e();
    }

    @Override // mv2.w0
    /* renamed from: onPostOk */
    public void mo56117x5465d15b(long j17, long j18) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19783xd9a946b7 c19783xd9a946b7;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2 p2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.f206770a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h17 = bu2.j.f106067a.h(j18);
        if (h17 != null) {
            bg0.u uVar = (bg0.u) i95.n0.c(bg0.u.class);
            long m76339xdfbc0164 = h17.f66946x284ddcb8 != null ? r6.m76339xdfbc0164() : 0L;
            ((ag0.m) uVar).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257080a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderVideoShell", "markCdnUploadCost");
            if (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257095p <= 0) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b0.f257095p = m76339xdfbc0164;
            }
            ((ag0.m) ((bg0.u) i95.n0.c(bg0.u.class))).Bi();
            p2Var.F(h17, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            o3Var.getClass();
            if (!h17.m59338xecb5e178() && (c19783xd9a946b7 = h17.f66946x284ddcb8) != null) {
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6557x4df9ae47 c6557x4df9ae47 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6557x4df9ae47();
                c6557x4df9ae47.f139068d = c6557x4df9ae47.b("FeedId", o3Var.Ui(h17.m59251x5db1b11()), true);
                c6557x4df9ae47.f139069e = c6557x4df9ae47.b("SessionId", c19783xd9a946b7.m76327x23a7af9b(), true);
                c6557x4df9ae47.f139070f = c6557x4df9ae47.b("PostUsername", h17.getFeedObject().m76836x6c03c64c(), true);
                java.util.LinkedList m75941xfb821914 = h17.f66945x4aebb6f3.m75941xfb821914(11);
                cl0.g gVar = new cl0.g();
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                java.util.Iterator it = m75941xfb821914.iterator();
                while (it.hasNext()) {
                    r45.gb4 gb4Var = (r45.gb4) it.next();
                    cl0.g gVar2 = new cl0.g();
                    gVar2.o(ya.b.f77479x42930b2, gb4Var.m75939xb282bd08(6));
                    gVar2.o("type", gb4Var.m75939xb282bd08(5));
                    jSONArray.put(gVar2);
                }
                gVar.h("atcontent", jSONArray);
                gVar.o("num", m75941xfb821914.size());
                java.lang.String gVar3 = gVar.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar3, "toString(...)");
                c6557x4df9ae47.f139071g = c6557x4df9ae47.b("mentionedDetailInfo", r26.i0.t(gVar3, ",", ";", false), true);
                c6557x4df9ae47.k();
                o3Var.Zk(c6557x4df9ae47);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p2.t(p2Var, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.j2("postSucc", null), 3, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 h18 = bu2.j.f106067a.h(j18);
        if (h18 != null) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2 c5521xb353c3e2 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5521xb353c3e2();
            am.vc vcVar = c5521xb353c3e2.f135849g;
            vcVar.f89721a = j17;
            vcVar.f89722b = true;
            vcVar.f89723c = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.j(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n7.f183939a, h18, true, null, 4, null);
            c5521xb353c3e2.e();
        }
    }

    @Override // mv2.w0
    /* renamed from: onPostStart */
    public void mo55429x74e3dc83(long j17) {
    }
}
