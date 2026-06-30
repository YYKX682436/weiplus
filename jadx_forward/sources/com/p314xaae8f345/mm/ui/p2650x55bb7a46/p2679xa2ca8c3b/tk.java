package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes11.dex */
public class tk extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287145s;

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f570049vn);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uk ukVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uk();
        ukVar.a(xgVar, true);
        xgVar.setTag(ukVar);
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
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var.mo78013xfb85f7b0() == 37) {
            java.lang.String j17 = f9Var.j();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemFMessageFrom", "dealClickVerifyMsgEvent : " + j17);
            if (j17 != null && j17.length() > 0) {
                com.p314xaae8f345.mm.p2621x8fb0427b.e9 H9 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).H9(j17);
                iz5.a.g(null, H9.f275392a.length() > 0);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(H9.f275392a, true);
                android.content.Intent intent = new android.content.Intent();
                if (n17 == null || ((int) n17.E2) <= 0 || !n17.r2()) {
                    intent.putExtra("Verify_ticket", H9.f275411t);
                    intent.putExtra("User_Verify", true);
                    intent.putExtra("Contact_User", H9.f275392a);
                    intent.putExtra("Contact_Alias", H9.f275393b);
                    intent.putExtra("Contact_Nick", H9.f275394c);
                    intent.putExtra("Contact_QuanPin", H9.f275395d);
                    intent.putExtra("Contact_PyInitial", H9.f275396e);
                    intent.putExtra("Contact_Sex", H9.f275406o);
                    intent.putExtra("Contact_Signature", H9.f275407p);
                    intent.putExtra("Contact_Scene", H9.f275399h);
                    intent.putExtra("Contact_FMessageCard", true);
                    intent.putExtra("Contact_City", H9.a());
                    intent.putExtra("Contact_Province", H9.d());
                    intent.putExtra("Contact_Mobile_MD5", H9.f275400i);
                    intent.putExtra("Contact_full_Mobile_MD5", H9.f275401j);
                    intent.putExtra("Contact_KSnsIFlag", H9.f275409r);
                    intent.putExtra("Contact_KSnsBgUrl", H9.f275410s);
                } else {
                    intent.putExtra("Contact_User", n17.d1());
                    com.p314xaae8f345.mm.ui.p2690x38b72420.g1.c(intent, n17.d1());
                }
                java.lang.String str = H9.f275397f;
                if ((str == null ? "" : str).length() <= 0) {
                    int i17 = H9.f275399h;
                    if (i17 != 18) {
                        switch (i17) {
                            case 22:
                            case 23:
                            case 24:
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                                break;
                            default:
                                str = this.f287145s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572389b22);
                                break;
                        }
                    }
                    str = this.f287145s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26);
                }
                intent.putExtra("Contact_Content", str);
                intent.putExtra("Contact_verify_Scene", H9.f275399h);
                intent.putExtra("Contact_Uin", H9.f275402k);
                intent.putExtra("Contact_QQNick", H9.f275403l);
                intent.putExtra("Contact_Mobile_MD5", H9.f275400i);
                intent.putExtra("User_From_Fmessage", true);
                intent.putExtra("Contact_from_msgType", 37);
                intent.putExtra("Contact_KSnsIFlag", H9.f275409r);
                intent.putExtra("Contact_KSnsBgUrl", H9.f275410s);
                j45.l.j(this.f287145s.g(), com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
                k45.a.a(H9.f275399h);
            }
        } else if (f9Var.mo78013xfb85f7b0() == 40) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
            if (D3.f277891a.length() > 0) {
                k45.a.a(D3.f277897g);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n18 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(D3.f277891a, true);
                if (n18 != null && ((int) n18.E2) > 0 && n18.r2()) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.g1.a(this.f287145s.g(), n18, D3, false, false, null, D3.f277914x);
                } else if (D3.f277900j > 0) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(this.f287145s.g(), D3, false, false, null);
                } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277898h) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D3.f277899i)) {
                    com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(this.f287145s.g(), D3, false, false, null);
                } else {
                    r61.a i18 = m61.k.wi().i(D3.f277898h);
                    if ((i18 == null || i18.e() == null || i18.e().length() <= 0) && ((i18 = m61.k.wi().i(D3.f277899i)) == null || i18.e() == null || i18.e().length() <= 0)) {
                        if (n18 == null || ((int) n18.E2) <= 0) {
                            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(this.f287145s.g(), D3, false, false, null);
                        } else {
                            com.p314xaae8f345.mm.ui.p2690x38b72420.g1.a(this.f287145s.g(), n18, D3, false, false, null, D3.f277914x);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemFMessageFrom", "error : this is not the mobile contact, MD5 = " + D3.f277898h + " fullMD5:" + D3.f277899i);
                    } else {
                        if (i18.i() == null || i18.i().length() <= 0) {
                            i18.f474325h = D3.f277891a;
                            i18.O = 128;
                            if (m61.k.wi().j(i18.e(), i18) == -1) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemFMessageFrom", "update mobile contact username failed");
                            }
                        }
                        com.p314xaae8f345.mm.ui.p2690x38b72420.g1.b(this.f287145s.g(), D3, false, false, null);
                    }
                }
            }
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean b0() {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var, yb5.d dVar, rd5.d dVar2, java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        this.f287145s = dVar;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uk ukVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uk) g0Var;
        if (f9Var.mo78013xfb85f7b0() == 37) {
            com.p314xaae8f345.mm.p2621x8fb0427b.e9 H9 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).H9(f9Var.j());
            java.lang.String str2 = H9.f275392a;
            if (str2 == null || str2.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse verify msg failed");
                return;
            }
            kv.c0 c0Var = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str3 = H9.f275392a;
            int i17 = H9.f275398g;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.g.f(str3, i17);
            if (c01.e2.J(H9.f275392a)) {
                ukVar.f287240f.setVisibility(8);
                ukVar.f287241g.setVisibility(8);
                ukVar.f287242h.setVisibility(0);
                ukVar.f287239e.setBackgroundColor(16777215);
                ukVar.f287242h.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffb));
            } else {
                ukVar.f287240f.setVisibility(0);
                ukVar.f287241g.setVisibility(0);
                ukVar.f287242h.setVisibility(0);
                ukVar.f287239e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562755nn);
                ukVar.f287242h.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffa));
            }
            int i18 = H9.f275399h;
            if (i18 == 13) {
                r61.a h17 = m61.k.wi().h(H9.f275392a);
                if (h17 == null || h17.h() == null || h17.h().equals("")) {
                    ukVar.f287243i.setVisibility(8);
                } else {
                    ukVar.f287243i.setVisibility(0);
                    ukVar.f287243i.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1v, h17.h()));
                }
            } else if (i18 != 18) {
                switch (i18) {
                    case 22:
                    case 23:
                    case 24:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                        ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b27);
                        break;
                    case 25:
                        ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572387b20);
                        break;
                    case 30:
                        ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.hq9);
                        break;
                    default:
                        ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572388b21);
                        break;
                }
            } else {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572392b25);
            }
            android.widget.TextView textView = ukVar.f287237c;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = dVar.g();
            java.lang.String b17 = H9.b();
            float textSize = ukVar.f287237c.getTextSize();
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g17, b17, textSize));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.T(ukVar.f39488x6a87d846, H9.f275392a, null);
            ukVar.f287238d.setVisibility(0);
            java.lang.String str4 = H9.f275397f;
            if (str4 == null || str4.trim().equals("")) {
                ukVar.f287238d.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572393b26));
            } else {
                ukVar.f287238d.setText(H9.f275397f);
            }
        } else if (f9Var.mo78013xfb85f7b0() == 40) {
            com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(f9Var.j());
            java.lang.String str5 = D3.f277891a;
            if (str5 == null || str5.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse possible friend msg failed");
                return;
            }
            kv.c0 c0Var2 = (kv.c0) i95.n0.c(kv.c0.class);
            java.lang.String str6 = D3.f277891a;
            int i19 = D3.f277896f;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) c0Var2).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.g.f(str6, i19);
            if (c01.e2.J(D3.f277891a)) {
                ukVar.f287240f.setVisibility(8);
                ukVar.f287241g.setVisibility(8);
                ukVar.f287242h.setVisibility(0);
                ukVar.f287239e.setBackgroundColor(16777215);
                ukVar.f287242h.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffb));
            } else {
                ukVar.f287240f.setVisibility(0);
                ukVar.f287241g.setVisibility(0);
                ukVar.f287242h.setVisibility(0);
                ukVar.f287239e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562755nn);
                ukVar.f287242h.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ffa));
            }
            int i27 = D3.f277897g;
            if (i27 == 4) {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1r);
                ukVar.f287238d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1s);
                java.lang.String g18 = D3.g();
                if (g18 == null) {
                    g18 = D3.c();
                }
                android.widget.TextView textView2 = ukVar.f287237c;
                le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g19 = dVar.g();
                float textSize2 = ukVar.f287237c.getTextSize();
                ((ke0.e) xVar2).getClass();
                textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g19, g18, textSize2));
            } else if (i27 == 10 || i27 == 11) {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1u);
                java.lang.String f17 = r61.q0.f(D3.f277898h);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f17)) {
                    f17 = r61.q0.f(D3.f277899i);
                }
                ukVar.f287238d.setText(dVar.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b1v, f17));
                android.widget.TextView textView3 = ukVar.f287237c;
                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g27 = dVar.g();
                java.lang.String c17 = D3.c();
                float textSize3 = ukVar.f287237c.getTextSize();
                ((ke0.e) xVar3).getClass();
                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g27, c17, textSize3));
            } else if (i27 == 31) {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572390b23);
                ukVar.f287238d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572391b24);
                android.widget.TextView textView4 = ukVar.f287237c;
                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g28 = dVar.g();
                java.lang.String c18 = D3.c();
                float textSize4 = ukVar.f287237c.getTextSize();
                ((ke0.e) xVar4).getClass();
                textView4.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g28, c18, textSize4));
            } else if (i27 != 32) {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1w);
                ukVar.f287238d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1x);
                android.widget.TextView textView5 = ukVar.f287237c;
                le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g29 = dVar.g();
                java.lang.String c19 = D3.c();
                float textSize5 = ukVar.f287237c.getTextSize();
                ((ke0.e) xVar5).getClass();
                textView5.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g29, c19, textSize5));
            } else {
                ukVar.f287236b.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1z);
                ukVar.f287238d.setText(com.p314xaae8f345.mm.R.C30867xcad56011.b1y);
                android.widget.TextView textView6 = ukVar.f287237c;
                le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                android.app.Activity g37 = dVar.g();
                java.lang.String c27 = D3.c();
                float textSize6 = ukVar.f287237c.getTextSize();
                ((ke0.e) xVar6).getClass();
                textView6.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(g37, c27, textSize6));
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.T(ukVar.f39488x6a87d846, D3.f277891a, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemFMessageFrom", "FROM_FMESSAGE did not include this type, msgType = " + f9Var.mo78013xfb85f7b0());
        }
        ukVar.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar2, dVar.D(), ukVar, null));
        ukVar.f39493x8ad70635.setOnClickListener(w(dVar));
        ukVar.f39493x8ad70635.setOnLongClickListener(u(dVar));
        ukVar.f39493x8ad70635.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) dVar.f542241c.a(sb5.z.class))).B1);
    }
}
