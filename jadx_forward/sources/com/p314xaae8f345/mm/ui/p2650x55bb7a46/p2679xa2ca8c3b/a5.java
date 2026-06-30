package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class a5 extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f284816s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570069wc);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y4 y4Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y4();
        y4Var.b(xgVar, false);
        xgVar.setTag(y4Var);
        return xgVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        menuItem.getItemId();
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        g4Var.c(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).d(), 100, 0, this.f284816s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        java.lang.String U1 = f9Var.U1();
        if (U1 != null) {
            ot0.q v17 = ot0.q.v(U1);
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430201i1) ? v17.f430207k : v17.f430201i1;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.f430237r1)) {
                ot0.d dVar2 = (ot0.d) v17.y(ot0.d.class);
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("key_native_url", v17.f430237r1);
                intent.putExtra("key_image_id", v17.f430249u1);
                intent.putExtra("key_image_aes_key", v17.f430253v1);
                intent.putExtra("key_image_length", v17.f430257w1);
                intent.putExtra("key_username", dVar.x());
                intent.putExtra("key_msgid", f9Var.m124847x74d37ac6());
                intent.putExtra("key_msg_newyear_localreceivestatus", dVar2.f429972c);
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = dVar2.f429971b;
                if (c21053xdbf1e5f4 != null) {
                    intent.putExtra("key_emoji_md5", c21053xdbf1e5f4.f68671x4b6e68b9);
                }
                ot0.e eVar = (ot0.e) v17.y(ot0.e.class);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f429976c)) {
                    intent.putExtra("key_voice_url", eVar.f429975b);
                    intent.putExtra("key_voice_asekey", eVar.f429976c);
                    intent.putExtra("key_voice_length", eVar.f429977d);
                    intent.putExtra("key_voice_play_time", eVar.f429978e);
                    intent.putExtra("key_voice_keyword", eVar.f429980g);
                }
                j45.l.j(dVar.g(), "luckymoney", ".ui.LuckyMoneyNewYearReceiveUIV2", intent, null);
            } else if ("1004".equals(v17.f430233q1) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v17.H1)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).wi(v17.f430245t1, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.b5.a(dVar.g(), v17.f430207k, v17.H1);
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                ((pg0.s3) ((qg0.h0) i95.n0.c(qg0.h0.class))).wi(v17.f430245t1, java.lang.Long.valueOf(f9Var.m124847x74d37ac6()));
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("rawUrl", str);
                j45.l.j(dVar.g(), "webview", ".ui.tools.WebViewUI", intent2, null);
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f284816s = dVar;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y4 y4Var = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.y4) g0Var;
        ot0.d dVar3 = (ot0.d) v17.y(ot0.d.class);
        if (v17.G1 == 1) {
            y4Var.a(2, this);
            if (dVar3.f429972c == 0) {
                y4Var.f287561d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cal);
                y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_u);
                y4Var.f287560c.setVisibility(8);
            } else {
                y4Var.f287561d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cam);
                y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c_v);
                y4Var.f287560c.setVisibility(0);
                int i17 = dVar3.f429972c;
                if (i17 == 1) {
                    y4Var.f287560c.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573960gm0));
                } else if (i17 == 2) {
                    y4Var.f287560c.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573963gm3));
                }
            }
        } else {
            y4Var.a(1, this);
            if (dVar3.f429972c == 0) {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a_t);
                } else {
                    y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a_t);
                }
                y4Var.f287568k.setVisibility(8);
                y4Var.f287568k.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                y4Var.f287567j.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                y4Var.f287566i.m82040x7541828(android.graphics.Color.parseColor("#FFE2B1"));
            } else {
                if (com.p314xaae8f345.mm.ui.bk.C()) {
                    y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6u);
                    y4Var.f287568k.setTextColor(android.graphics.Color.parseColor("#7FFFE2B1"));
                    y4Var.f287567j.setTextColor(android.graphics.Color.parseColor("#7FFFE2B1"));
                    y4Var.f287566i.m82040x7541828(android.graphics.Color.parseColor("#7FFFE2B1"));
                } else {
                    y4Var.f287562e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bun);
                    y4Var.f287568k.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                    y4Var.f287567j.setTextColor(android.graphics.Color.parseColor("#FFE2B1"));
                    y4Var.f287566i.m82040x7541828(android.graphics.Color.parseColor("#FFE2B1"));
                }
                y4Var.f287568k.setVisibility(0);
                int i18 = dVar3.f429972c;
                if (i18 == 1) {
                    y4Var.f287568k.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573960gm0));
                } else if (i18 == 2) {
                    y4Var.f287568k.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573963gm3));
                }
            }
            ot0.e eVar = (ot0.e) v17.y(ot0.e.class);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(eVar.f429976c)) {
                y4Var.f287565h.setVisibility(8);
                y4Var.c(104);
            } else {
                y4Var.f287565h.setVisibility(0);
                y4Var.f287567j.setText(java.lang.String.format("%d\"", java.lang.Long.valueOf(eVar.f429978e / 1000)));
                y4Var.c(84);
            }
            y4Var.f287561d.setVisibility(8);
            android.view.ViewGroup.LayoutParams layoutParams = y4Var.f287562e.getLayoutParams();
            layoutParams.width = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 131);
            y4Var.f287562e.setLayoutParams(layoutParams);
        }
        g0Var.f39493x8ad70635.setOnClickListener(w(dVar));
        g0Var.f39493x8ad70635.setOnLongClickListener(u(dVar));
        g0Var.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
        g0Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, this.f284816s.D(), g0Var, null));
    }
}
