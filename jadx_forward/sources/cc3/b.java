package cc3;

/* loaded from: classes9.dex */
public class b extends com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e {
    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    public r45.js5 a() {
        java.lang.String str = ((cc3.a) this.f295418c).f122013q;
        dc3.a aVar = new dc3.a();
        aVar.f68306x645a32d = str;
        if (!hb3.o.Ni().Vi().get(aVar, new java.lang.String[0])) {
            return null;
        }
        r45.nm5 t07 = dc3.a.t0(aVar);
        t07.f463036i.addAll(hb3.o.Ni().aj().y0(((cc3.a) this.f295418c).f122013q));
        r45.vm3 vm3Var = new r45.vm3();
        vm3Var.f76492x92037252 = new r45.ie();
        vm3Var.f469891d = t07;
        return vm3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.e
    public void b(com.p314xaae8f345.mm.p944x882e457a.f fVar) {
        int mo70514xb06685ab;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f152149b), java.lang.Integer.valueOf(fVar.f152148a));
        if (fVar.f152148a == 0 && fVar.f152149b == 0 && ((r45.vm3) fVar.f152151d).f469891d != null) {
            dc3.a aVar = new dc3.a();
            aVar.f68306x645a32d = ((cc3.a) this.f295418c).f122013q;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = fVar.f152151d;
            ((r45.vm3) fVar2).f469891d.G = ((r45.vm3) fVar2).f469892e;
            boolean z17 = hb3.o.Ni().Vi().get(aVar, new java.lang.String[0]);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "get story info: %s, %s", ((cc3.a) this.f295418c).f122013q, java.lang.Boolean.valueOf(z17));
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar3 = fVar.f152151d;
            r45.nm5 nm5Var = ((r45.vm3) fVar3).f469891d;
            java.lang.String str = ((cc3.a) this.f295418c).f122013q;
            int i17 = ((r45.vm3) fVar3).f469892e;
            if (nm5Var != null) {
                aVar.f68309x29dd02d3 = nm5Var.f463031d;
                aVar.f68292x4ecae8fb = nm5Var.f463035h;
                aVar.f68283x709d5570 = nm5Var.f463040p;
                aVar.f68284x5c9035d8 = nm5Var.f463039o;
                aVar.f68287xadbd0f0e = nm5Var.f463044t;
                aVar.f68290xca2593de = nm5Var.f463037m;
                aVar.f68291x278d9c4b = nm5Var.f463038n;
                aVar.f68293x4f4dc37 = nm5Var.f463034g;
                aVar.f68301x96a1f680 = nm5Var.f463032e;
                aVar.f68300x96a1d68f = nm5Var.f463033f;
                aVar.f68288x2784b87a = nm5Var.f463047w;
                aVar.f68299x7a9eff12 = nm5Var.f463049y;
                aVar.f68307x1e0b4b0a = nm5Var.f463048x;
                aVar.f68285x657ccc82 = nm5Var.f463050z;
                aVar.f68289xa94c1dd = nm5Var.A;
                aVar.f68286xef38872e = nm5Var.B;
                aVar.f68306x645a32d = str;
                aVar.f68308xcac5ce65 = i17;
                r45.eg7 eg7Var = nm5Var.D;
                if (eg7Var != null) {
                    aVar.f68311xbac4f136 = eg7Var.f454999d;
                    aVar.f68312xbac5dad0 = eg7Var.f455000e;
                    aVar.f68314xfb93d3ab = eg7Var.f455001f;
                    aVar.f68313x493557f6 = eg7Var.f455002g;
                }
                r45.jm5 jm5Var = nm5Var.f463042r;
                if (jm5Var != null) {
                    aVar.f68295xf4b4a1e6 = jm5Var.f459467J;
                    aVar.f68294xcba903d2 = jm5Var.Q;
                    aVar.f68296x56bcaec2 = jm5Var.f459474m;
                    aVar.f68297x37905281 = jm5Var.f459475n;
                }
                r45.f34 f34Var = nm5Var.E;
                if (f34Var != null) {
                    aVar.f68305xcade653b = f34Var.f455516d;
                    aVar.f68304x1d59393d = f34Var.f455517e;
                    aVar.f68302xe0c45a35 = f34Var.f455518f;
                    aVar.f68303x14965a8c = f34Var.f455519g;
                }
                bw5.x7 x7Var = nm5Var.F;
                if (x7Var != null) {
                    try {
                        aVar.f68298x8f314ce2 = new java.lang.String(x7Var.mo14344x5f01b1f6(), java.nio.charset.StandardCharsets.ISO_8859_1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalRedPacketStoryInfo", "[convertFromProto] ecs_jump_info success");
                    } catch (java.io.IOException e17) {
                        aVar.f68298x8f314ce2 = "";
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LocalRedPacketStoryInfo", "[convertFromProto] ecs_jump_info failed :%s", e17.getMessage());
                    }
                } else {
                    aVar.f68298x8f314ce2 = "";
                }
            }
            aVar.f68310x499140be = java.lang.System.currentTimeMillis();
            if (z17) {
                hb3.o.Ni().Vi().mo9952xce0038c9(aVar, new java.lang.String[0]);
            } else {
                hb3.o.Ni().Vi().mo880xb970c2b9(aVar);
            }
            dc3.d aj6 = hb3.o.Ni().aj();
            java.lang.String str2 = ((cc3.a) this.f295418c).f122013q;
            aj6.getClass();
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                mo70514xb06685ab = -1;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LocalRedPacketStoryInfoStorage", "delete story detail: %s", str2);
                mo70514xb06685ab = aj6.f310244d.mo70514xb06685ab("LocalStoryDetail", "packet_id=?", new java.lang.String[]{str2});
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketStoryInfoAsyncLoader", "delete story detail: %s", java.lang.Integer.valueOf(mo70514xb06685ab));
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar4 = fVar.f152151d;
            if (((r45.vm3) fVar4).f469891d.f463036i == null || ((r45.vm3) fVar4).f469891d.f463036i.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RedPacketStoryInfoAsyncLoader", "story detail is empty!!");
                return;
            }
            l75.k0 k0Var = hb3.o.Ni().aj().f310244d;
            long F = k0Var != null ? k0Var.F(java.lang.Long.valueOf(java.lang.Thread.currentThread().getId())) : -1L;
            java.util.Iterator it = ((r45.vm3) fVar.f152151d).f469891d.f463036i.iterator();
            while (it.hasNext()) {
                r45.re6 re6Var = (r45.re6) it.next();
                java.lang.String str3 = ((cc3.a) this.f295418c).f122013q;
                dc3.c cVar = new dc3.c();
                if (re6Var != null) {
                    cVar.f68490x645a32d = str3;
                    cVar.f68484xfd0bc00c = re6Var.f466310g;
                    cVar.f68491x2a070e41 = re6Var.f466311h;
                    cVar.f68488x2cc75b1a = re6Var.f466307d;
                    cVar.f68487x1a37dd9e = re6Var.f466309f;
                    cVar.f68489x1a37fd8f = re6Var.f466308e;
                    cVar.f68486x9bdcc647 = re6Var.f466312i;
                    cVar.f68485x9bdca656 = re6Var.f466313m;
                }
                hb3.o.Ni().aj().mo880xb970c2b9(cVar);
            }
            l75.k0 k0Var2 = hb3.o.Ni().aj().f310244d;
            if (k0Var2 != null) {
                k0Var2.w(java.lang.Long.valueOf(F));
            }
        }
    }
}
