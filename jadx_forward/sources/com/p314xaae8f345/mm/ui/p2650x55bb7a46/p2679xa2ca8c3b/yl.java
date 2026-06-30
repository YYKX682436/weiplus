package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class yl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570059w0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xl xlVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xl(this);
        xlVar.a(xgVar);
        xgVar.setTag(xlVar);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        menuItem.getItemId();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        g4Var.c(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d(), 100, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: user clicked on the like item");
        if (f9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, msg is null.");
            return false;
        }
        java.lang.String U1 = f9Var.U1();
        ot0.q v17 = ot0.q.v(U1);
        if (v17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, content is null.");
            return false;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430207k)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", v17.f430207k);
            j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent, null);
            return true;
        }
        if ((((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(v17.F0, true).m124896xfb85f7b0() & 524288) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicrMsg.ChattingItemHardDeviceMsgLike", "we run black user");
        } else {
            int i17 = v17.f430167J;
            if (i17 == 2) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430224o0)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_is_latest", true);
                    intent2.putExtra("app_username", v17.H);
                    intent2.putExtra("device_type", v17.C0);
                    intent2.putExtra("locate_to_username", v17.F0);
                    j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceRankInfoUI", intent2, null);
                } else {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_rank_info", U1);
                    intent3.putExtra("key_rank_title", v17.f430268z0);
                    intent3.putExtra("key_champion_info", v17.A0);
                    intent3.putExtra("key_champion_coverimg", v17.A0);
                    intent3.putExtra("rank_id", v17.f430224o0);
                    intent3.putExtra("app_username", v17.H);
                    intent3.putExtra("device_type", v17.C0);
                    intent3.putExtra("key_champioin_username", v17.f430264y0);
                    intent3.putExtra("locate_to_username", v17.F0);
                    j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceRankInfoUI", intent3, null);
                }
                ve4.g.a(30);
            } else if (i17 == 4) {
                android.content.Intent intent4 = new android.content.Intent();
                intent4.putExtra(dm.i4.f66875xa013b0d5, v17.F0);
                intent4.putExtra("app_username", "gh_43f2581f6fd6");
                j45.l.j(dVar.g(), "exdevice", ".ui.ExdeviceProfileUI", intent4, null);
                ve4.g.a(29);
            }
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        int i17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xl xlVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xl) g0Var;
        ot0.q v17 = ot0.q.v(dVar2.f475787d.f526833b.U1());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), g0Var, null);
        if (v17 != null && (v17.f430167J == 2 || (i17 = v17.B0) == 2 || i17 == 4)) {
            kv.z zVar = (kv.z) i95.n0.c(kv.z.class);
            android.widget.ImageView imageView = xlVar.f287529b;
            java.lang.String str2 = v17.F0;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) zVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.u.b(imageView, str2, 0.5f, true);
            xlVar.f287530c.i(0, dVar.s().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            xlVar.f287530c.m79271x1c5c5ff4(dVar.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
            xlVar.f287530c.m79252xb86dec4b(android.text.TextUtils.TruncateAt.END);
            xlVar.f287530c.m79267x52d64a5e(true);
            xlVar.f287530c.m79266x3b2de958(true);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21526xca364659 c21526xca364659 = xlVar.f287530c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            java.lang.String str3 = v17.E0;
            ((ke0.e) xVar).getClass();
            c21526xca364659.m79270x765074af(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, str3));
        }
        g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        g0Var.f39493x8ad70635.setTag(erVar);
        g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
    }
}
