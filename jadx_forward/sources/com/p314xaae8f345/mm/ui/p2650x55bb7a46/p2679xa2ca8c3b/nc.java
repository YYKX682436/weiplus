package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class nc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 implements we5.b {

    /* renamed from: s, reason: collision with root package name */
    public int f286446s = -1;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569991tt);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc vcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc();
        vcVar.a(xgVar);
        xgVar.setTag(vcVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean N() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        if (this.f286446s < 0) {
            return false;
        }
        mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
        java.lang.String j17 = f9Var.j();
        ((lp3.l) jVar).getClass();
        r45.k55 e17 = bm5.d1.e(j17);
        int i17 = this.f286446s;
        java.util.LinkedList linkedList = e17.f459919e;
        if (i17 >= linkedList.size()) {
            return false;
        }
        r45.l55 l55Var = (r45.l55) linkedList.get(this.f286446s);
        int itemId = menuItem.getItemId();
        if (itemId == 292) {
            db5.e1.B(dVar.g(), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bav), "", dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.boo), dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sc(this, f9Var, l55Var), null, com.p314xaae8f345.mm.R.C30859x5a72f63.f560155ch);
            return true;
        }
        if (itemId != 293) {
            return false;
        }
        e0(dVar, android.util.Pair.create(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Long.valueOf(l55Var.f460688g)), f9Var.Q0());
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        int indexOfChild = ((android.view.ViewGroup) view.getParent()).indexOfChild(view);
        mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
        java.lang.String j17 = f9Var.j();
        ((lp3.l) jVar).getClass();
        java.util.LinkedList linkedList = bm5.d1.e(j17).f459919e;
        boolean z17 = false;
        if (indexOfChild >= linkedList.size()) {
            return false;
        }
        this.f286446s = indexOfChild;
        r45.l55 l55Var = (r45.l55) linkedList.get(indexOfChild);
        if (c01.z1.r().equals(l55Var.f460685d) && c01.id.c() - l55Var.f460688g <= u04.d.f505010c && ((lp3.r) i95.n0.c(lp3.r.class)).Ni()) {
            z17 = true;
        }
        if (z17) {
            g4Var.c(d17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c0.f33779x366c91de, 0, view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
        } else {
            g4Var.c(d17, 292, 0, view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // we5.b
    public rd5.d b(we5.a aVar) {
        return new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uc(aVar);
    }

    @Override // we5.b
    public boolean c() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0127, code lost:
    
        if (r0.f340366b == (-2)) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0142 A[Catch: Exception -> 0x022c, TryCatch #1 {Exception -> 0x022c, blocks: (B:11:0x00e9, B:16:0x0133, B:18:0x0142, B:19:0x0149, B:22:0x0166, B:24:0x016f, B:26:0x0178, B:29:0x0182, B:31:0x018b), top: B:10:0x00e9 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x031c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01d6 A[Catch: Exception -> 0x022a, TryCatch #2 {Exception -> 0x022a, blocks: (B:34:0x019e, B:52:0x01cd, B:54:0x01d6, B:55:0x01da, B:57:0x01e0, B:60:0x01fd, B:62:0x0201, B:63:0x0206, B:65:0x0204), top: B:33:0x019e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d0(final yb5.d r22, rd5.d r23, r45.k55 r24, int r25, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc r26) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc.d0(yb5.d, rd5.d, r45.k55, int, com.tencent.mm.ui.chatting.viewitems.vc):void");
    }

    @Override // we5.b
    public void e(final yb5.d dVar, final rd5.d dVar2, java.lang.String str, we5.y0 y0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        java.lang.String j17 = f9Var.j();
        ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).getClass();
        final r45.k55 e17 = bm5.d1.e(j17);
        int size = e17.f459919e.size();
        boolean ij6 = ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).ij(f9Var.m124847x74d37ac6(), f9Var.Q0());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta taVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ta) ((sb5.p0) dVar.f542241c.a(sb5.p0.class));
        taVar.getClass();
        boolean z17 = taVar.f281508g;
        java.util.HashMap hashMap = taVar.f281512n;
        if (ij6 || z17) {
            hashMap.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(size));
        } else {
            hashMap.put(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()), java.lang.Integer.valueOf(size - 1));
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = taVar.f281513o;
            if (f9Var.m124847x74d37ac6() > (f9Var2 != null ? f9Var2.m124847x74d37ac6() : 0L)) {
                taVar.f281513o = f9Var;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgPat", "content:%s, talker:%s, recordNum:%d", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(j17), e17.f459918d, java.lang.Integer.valueOf(size));
        if (size > 0) {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 q57 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().q5(str);
            boolean z18 = false;
            if (size < 5 || q57.m124847x74d37ac6() == f9Var.m124847x74d37ac6()) {
                ij6 = false;
            }
            final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg kgVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg) dVar.f542241c.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg.class);
            if (kgVar != null) {
                if (((java.util.HashSet) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h6) kgVar).f280679e).contains(java.lang.Long.valueOf(f9Var.m124847x74d37ac6()))) {
                    z18 = true;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgPat", "need fold %s, hasExpanded %s", java.lang.Boolean.valueOf(ij6), java.lang.Boolean.valueOf(z18));
            final boolean z19 = ij6 & (!z18);
            if (z19) {
                size = 3;
            }
            final int i17 = size;
            y0Var.c(new we5.t0() { // from class: com.tencent.mm.ui.chatting.viewitems.nc$$a
                @Override // we5.t0
                public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc.this;
                    yb5.d dVar3 = dVar;
                    rd5.d dVar4 = dVar2;
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc vcVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc) g0Var;
                    ncVar.d0(dVar3, dVar4, e17, i17, vcVar);
                    vcVar.f287380c.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar4, (java.lang.String) null));
                    if (!z19) {
                        vcVar.f287380c.setVisibility(8);
                    } else {
                        vcVar.f287380c.setVisibility(0);
                        vcVar.f287380c.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.oc(ncVar, dVar3, kgVar, vcVar));
                    }
                }
            });
        }
    }

    public final void e0(yb5.d dVar, android.util.Pair pair, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) dVar.g(), 1, true);
        k0Var.r(dVar.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i2e), 1, i65.a.b(dVar.g(), 14), null);
        k0Var.f293405n = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pc(this, dVar);
        k0Var.f293414s = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qc(this, pair, str, dVar);
        k0Var.f293387d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rc(this, str, pair);
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        e(dVar, dVar2, str, we5.y0.a((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc) g0Var));
    }
}
