package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public class c6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 f280406d;

    public c6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var) {
        this.f280406d = b5Var;
    }

    public final void a(java.util.HashSet hashSet) {
        if (hashSet.isEmpty()) {
            this.f280406d.f280113d.q().mo50293x3498a0(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.y5(this));
        }
    }

    public final void b(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5303xc75d2f73 c5303xc75d2f73) {
        ot0.q v17;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.b5 b5Var = this.f280406d;
        java.util.List<com.p314xaae8f345.mm.p2621x8fb0427b.f9> p07 = b5Var.p0();
        java.util.Iterator it = p07.iterator();
        while (it.hasNext()) {
            if (!com.p314xaae8f345.mm.ui.p2650x55bb7a46.la.a((com.p314xaae8f345.mm.p2621x8fb0427b.f9) it.next())) {
                db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c96), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
                return;
            }
        }
        long g17 = ip.c.g();
        d40.n nVar = (d40.n) ((e40.v) i95.n0.c(e40.v.class));
        if (nVar.wi()) {
            g17 = nVar.Ai();
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3 e3Var = com.p314xaae8f345.mm.ui.p2650x55bb7a46.e3.f281987a;
        if (e3Var.a(p07, g17)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572766cf1, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(g17)), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            return;
        }
        long i17 = ip.c.i();
        if (e3Var.b(p07, i17)) {
            db5.e1.y(b5Var.f280113d.g(), b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572767cf2, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(i17)), "", b5Var.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_e), null);
            return;
        }
        am.c4 c4Var = c5303xc75d2f73.f135623g;
        c4Var.f87857j = b5Var.f280113d.f542250l;
        c4Var.f87860m = 41;
        c4Var.f87863p = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.t5(this);
        c5303xc75d2f73.e();
        am.d4 d4Var = c5303xc75d2f73.f135624h;
        int i18 = d4Var.f87966a == 0 ? 1 : 2;
        long i19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var : p07) {
            if (f9Var.k2() && (v17 = ot0.q.v(f9Var.j())) != null && v17.f430199i == 5 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430207k)) {
                int i27 = f9Var.t2() ? 1 : 2;
                try {
                    str = java.net.URLEncoder.encode(v17.f430207k, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                } catch (java.io.UnsupportedEncodingException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingMoreBtnBarHelper", e17, "", new java.lang.Object[0]);
                    str = "";
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13378, str, java.lang.Long.valueOf(i19), java.lang.Integer.valueOf(i27), 2, java.lang.Integer.valueOf(i18));
            }
        }
        tb5.i0 i0Var = tb5.i0.f498588a;
        i0Var.c(p07, "fav", b5Var.f280113d.x(), b5Var.f280236q);
        if (d4Var.f87966a == 0) {
            am.c4 c4Var2 = c5303xc75d2f73.f135623g;
            if (14 != c4Var2.f87850c) {
                return;
            }
            r45.sq0 sq0Var = c4Var2.f87849b;
            if (sq0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingMoreBtnBarHelper", "want to report record fav, but type count is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11142, java.lang.Integer.valueOf(sq0Var.f467439d), java.lang.Integer.valueOf(c4Var2.f87849b.f467440e), java.lang.Integer.valueOf(c4Var2.f87849b.f467441f), java.lang.Integer.valueOf(c4Var2.f87849b.f467442g), java.lang.Integer.valueOf(c4Var2.f87849b.f467443h), java.lang.Integer.valueOf(c4Var2.f87849b.f467444i), java.lang.Integer.valueOf(c4Var2.f87849b.f467445m), java.lang.Integer.valueOf(c4Var2.f87849b.f467446n), java.lang.Integer.valueOf(c4Var2.f87849b.f467447o), java.lang.Integer.valueOf(c4Var2.f87849b.f467448p), java.lang.Integer.valueOf(c4Var2.f87849b.f467449q), java.lang.Integer.valueOf(c4Var2.f87849b.f467450r), java.lang.Integer.valueOf(c4Var2.f87849b.f467451s), java.lang.Integer.valueOf(c4Var2.f87849b.f467452t), java.lang.Integer.valueOf(c4Var2.f87849b.f467453u));
            int size = ((java.util.LinkedList) p07).size();
            r45.sq0 sq0Var2 = c4Var2.f87849b;
            pm0.v.K(null, new yd5.l(3L, size, sq0Var2.f467439d + sq0Var2.f467440e + sq0Var2.f467441f + sq0Var2.f467442g + sq0Var2.f467443h + sq0Var2.f467444i + sq0Var2.f467445m + sq0Var2.f467446n + sq0Var2.f467447o + sq0Var2.f467448p + sq0Var2.f467449q + sq0Var2.f467450r + sq0Var2.f467451s + sq0Var2.f467452t + sq0Var2.f467453u, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a1) ((sb5.l) b5Var.f280113d.f542241c.a(sb5.l.class))).A, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a1) ((sb5.l) b5Var.f280113d.f542241c.a(sb5.l.class))).B, 1L));
            java.util.List p08 = b5Var.p0();
            tb5.g0 state = b5Var.f280236q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
            i0Var.b("multi_select_msg_fav_succ", p08, state);
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(b5Var.f280113d.x())) {
                b5Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
                for (com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 : p07) {
                    ot0.q v18 = ot0.q.v(f9Var2.j());
                    int i28 = v18 == null ? 0 : v18.f430199i;
                    sb6.append(f9Var2.I0());
                    sb7.append(f9Var2.mo78013xfb85f7b0());
                    sb8.append(i28);
                    sb6.append("|");
                    sb7.append("|");
                    sb8.append("|");
                }
                int k17 = b5Var.f280113d.k();
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("msgid", sb6.toString());
                hashMap.put("msgtype", sb7.toString());
                hashMap.put("submsgtype", sb8.toString());
                hashMap.put("chat_name", b5Var.f280113d.x());
                hashMap.put("enter_sessionid", b5Var.f280113d.f542255q);
                hashMap.put("enter_type", java.lang.Integer.valueOf(vh0.l2.a(k17)));
                hashMap.put("view_id", "yuanbao_msg_collect");
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x021b, code lost:
    
        if (com.p314xaae8f345.mm.vfs.w6.j(((k90.b) ((tg3.u0) i95.n0.c(tg3.u0.class))).aj(r3, bm5.f0.f104095g, m11.c0.d(r4).f404170e, "", "")) == false) goto L50;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:72:0x026d  */
    /* JADX WARN: Type inference failed for: r13v3, types: [m11.j] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v2, types: [int] */
    /* JADX WARN: Type inference failed for: r17v3 */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r25) {
        /*
            Method dump skipped, instructions count: 833
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.c6.onClick(android.view.View):void");
    }
}
