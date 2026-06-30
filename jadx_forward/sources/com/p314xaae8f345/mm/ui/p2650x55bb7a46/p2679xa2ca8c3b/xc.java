package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class xc extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287513s;

    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x006e. Please report as an issue. */
    public static boolean d0(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionPayment.k(dVar.g(), null)) {
            return true;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemAppMsgRemittanceFrom", "[onChattingItemClickedFrom] content == null");
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_remittance_data_lose_switch, false)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bd.a(dVar.g(), f9Var.Q0());
            }
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sender_name", f9Var.Q0());
        int i17 = v17.I0;
        if (i17 != 1) {
            if (i17 != 11) {
                if (i17 != 21) {
                    switch (i17) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 8:
                        case 9:
                            break;
                        case 7:
                            break;
                        default:
                            switch (i17) {
                                case 23:
                                case 24:
                                case 25:
                                case 26:
                                    break;
                                case 27:
                                    break;
                                default:
                                    java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430201i1) ? v17.f430207k : v17.f430201i1;
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgRemittanceFrom", "Unrecognized type %d, probably version to low & check update! url:%s", java.lang.Integer.valueOf(v17.I0), str);
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                                        return true;
                                    }
                                    intent.putExtra("rawUrl", str);
                                    j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                                    return true;
                            }
                    }
                }
            }
            intent.putExtra("is_sender", true);
            intent.putExtra("appmsg_type", v17.I0);
            intent.putExtra("transfer_id", v17.L0);
            intent.putExtra(ya.b.f77506xba41a63c, v17.K0);
            intent.putExtra("effective_date", v17.N0);
            intent.putExtra("total_fee", v17.Q0);
            intent.putExtra("fee_type", v17.R0);
            intent.putExtra("payer_name", v17.O0);
            intent.putExtra("receiver_name", v17.P0);
            intent.putExtra("transfer_attach", v17.S0);
            if (c01.z1.I()) {
                j45.l.j(dVar.g(), "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, null);
                return true;
            }
            j45.l.j(dVar.g(), "remittance", ".ui.RemittanceDetailUI", intent, null);
            return true;
        }
        intent.putExtra("invalid_time", v17.M0);
        intent.putExtra("is_sender", false);
        intent.putExtra("appmsg_type", v17.I0);
        intent.putExtra("transfer_id", v17.L0);
        intent.putExtra(ya.b.f77506xba41a63c, v17.K0);
        intent.putExtra("effective_date", v17.N0);
        intent.putExtra("total_fee", v17.Q0);
        intent.putExtra("fee_type", v17.R0);
        intent.putExtra("key_msg_id", f9Var.m124847x74d37ac6());
        intent.putExtra("payer_name", v17.O0);
        intent.putExtra("receiver_name", v17.P0);
        intent.putExtra("transfer_attach", v17.S0);
        boolean I = c01.z1.I();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dVar.f542250l;
        if (I) {
            j45.l.p(abstractC21611x7536149b, "wallet_payu", ".remittance.ui.PayURemittanceDetailUI", intent, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23);
            return true;
        }
        j45.l.p(abstractC21611x7536149b, "remittance", ".ui.RemittanceDetailUI", intent, com.p314xaae8f345.p3006xb8ff1437.api.C26181xd678f817.f50628x98affc23);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570044vf);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc();
        wcVar.a(xgVar, true);
        xgVar.setTag(wcVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d();
        if (f9Var == null) {
            return false;
        }
        g4Var.c(d17, 100, 0, this.f287513s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return d0(dVar, f9Var);
    }

    public final void e0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar) {
        wcVar.f39493x8ad70635.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562607k6);
        wcVar.f39493x8ad70635.setPadding(0, 0, 0, 0);
        if (wcVar.f287454e != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                wcVar.f287451b.setAlpha(0.3f);
                wcVar.f287452c.setAlpha(0.3f);
                wcVar.f287453d.setAlpha(0.3f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                wcVar.f287455f.setAlpha(0.3f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                wcVar.f287456g.setAlpha(0.3f);
            } else {
                wcVar.f287451b.setAlpha(1.0f);
                wcVar.f287452c.setAlpha(1.0f);
                wcVar.f287453d.setAlpha(1.0f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
                wcVar.f287455f.setAlpha(1.0f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
                wcVar.f287456g.setAlpha(1.0f);
            }
            wcVar.f287454e.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }

    public final void f0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar) {
        wcVar.f39493x8ad70635.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f77941xaae5a4ee);
        wcVar.f39493x8ad70635.setPadding(0, 0, 0, 0);
        if (wcVar.f287454e != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                wcVar.f287451b.setAlpha(0.3f);
                wcVar.f287452c.setAlpha(0.3f);
                wcVar.f287453d.setAlpha(0.3f);
                wcVar.f287455f.setAlpha(0.3f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                wcVar.f287456g.setAlpha(0.3f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            } else {
                wcVar.f287451b.setAlpha(1.0f);
                wcVar.f287452c.setAlpha(1.0f);
                wcVar.f287453d.setAlpha(1.0f);
                wcVar.f287455f.setAlpha(1.0f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
                wcVar.f287456g.setAlpha(1.0f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
            }
            wcVar.f287454e.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }

    public final void g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wc wcVar) {
        if (wcVar.f287454e != null) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                wcVar.f287451b.setAlpha(0.8f);
                wcVar.f287452c.setAlpha(0.8f);
                wcVar.f287453d.setAlpha(0.8f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                wcVar.f287455f.setAlpha(0.5f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
                wcVar.f287456g.setAlpha(0.5f);
            } else {
                wcVar.f287451b.setAlpha(1.0f);
                wcVar.f287452c.setAlpha(1.0f);
                wcVar.f287453d.setAlpha(1.0f);
                wcVar.f287455f.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
                wcVar.f287455f.setAlpha(1.0f);
                wcVar.f287456g.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.adh));
                wcVar.f287456g.setAlpha(1.0f);
            }
            wcVar.f287454e.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bd.b(f9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02cb  */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v17 */
    /* JADX WARN: Type inference failed for: r13v18 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int] */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r25, yb5.d r26, rd5.d r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 1074
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xc.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }
}
