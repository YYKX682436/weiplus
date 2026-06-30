package x82;

@j95.b
/* loaded from: classes9.dex */
public class i extends i95.w implements o72.l4 {
    public boolean wi(android.content.Context context, o72.r2 r2Var, r45.dq0 dq0Var) {
        java.lang.String str;
        r45.hp0 hp0Var;
        java.lang.String e17;
        r45.jp0 jp0Var;
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "Context is null");
        } else if (r2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "Fav item is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "Handler favItemInfo id %d, type %d", java.lang.Long.valueOf(r2Var.f67645x88be67a1), java.lang.Integer.valueOf(r2Var.f67657x2262335f));
            ((a82.y1) ((o72.s4) i95.n0.c(o72.s4.class))).Di(java.lang.Long.valueOf(r2Var.f67645x88be67a1));
            k82.c cVar = k82.c.f386420a;
            cVar.c(r2Var.f67645x88be67a1, r2Var.f67643xc8a07680, r2Var.f67657x2262335f, dq0Var.f454186d, r2Var.f67651x76e81a5a);
            int i17 = r2Var.f67657x2262335f;
            if (i17 != -2) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.f9 f9Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionMusic;
                r45.km6 km6Var = null;
                if (i17 != 21) {
                    if (i17 == 24) {
                        r45.op0 op0Var = r2Var.f67640x5ab01132.P;
                        q80.d0 d0Var = new q80.d0();
                        d0Var.f442184c = op0Var.f463949p;
                        d0Var.f442183b = x82.k0.b(op0Var);
                        d0Var.f442182a = op0Var.f463950q;
                        d0Var.f442185d = java.lang.Boolean.valueOf(op0Var.f463952s);
                        java.lang.String str2 = d0Var.f442183b;
                        if (str2 == null || str2.isEmpty() || (str = d0Var.f442182a) == null || str.isEmpty()) {
                            o72.r2 r2Var2 = new o72.r2();
                            r2Var2.U0(r2Var.f67660x4b6e9352);
                            d0Var.f442183b = x82.k0.b(r2Var2.f67640x5ab01132.P);
                            d0Var.f442182a = r2Var2.f67640x5ab01132.P.f463950q;
                        }
                        com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80 c3708xc1f46f80 = new com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3708xc1f46f80();
                        c3708xc1f46f80.f14311x683188c = com.p314xaae8f345.p362xadfe2b3.gen.EnumC3698xfb48f2f.FAV_LIST;
                        d0Var.f442207z = c3708xc1f46f80;
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).lk(context, d0Var, new x82.w(d0Var, r2Var, op0Var, context));
                    } else if (i17 != 32) {
                        if (i17 != 33) {
                            switch (i17) {
                                case 1:
                                    android.content.Intent intent = new android.content.Intent();
                                    intent.putExtra("key_detail_text", r2Var.f67640x5ab01132.f452507s);
                                    intent.putExtra("key_detail_info_id", r2Var.f67645x88be67a1);
                                    intent.putExtra("key_detail_can_share_to_friend", r2Var.t0());
                                    intent.putExtra("key_detail_time", r2Var.f67659xa783a79b);
                                    long j17 = r2Var.f67649xde813d09;
                                    if (j17 <= 0) {
                                        j17 = r2Var.f67659xa783a79b;
                                    }
                                    intent.putExtra("key_detail_create_time", j17);
                                    x82.k0.o(dq0Var, intent);
                                    o72.z2.b("FavoriteTextDetailUI", dq0Var.f454189g);
                                    ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                    o72.x1.L0(context, ".ui.detail.FavoriteTextDetailUI", intent, null);
                                    break;
                                case 2:
                                    x82.k0.f(context, r2Var, dq0Var);
                                    break;
                                case 3:
                                    android.content.Intent intent2 = new android.content.Intent();
                                    x82.k0.n(r2Var, dq0Var, intent2);
                                    intent2.putExtra("key_detail_create_time", r2Var.f67640x5ab01132.f452495d.f459577q);
                                    o72.z2.b("FavoriteVoiceDetailUI", dq0Var.f454189g);
                                    ((y30.q) ((z30.u) i95.n0.c(z30.u.class))).getClass();
                                    o72.x1.L0(context, ".ui.detail.FavoriteVoiceDetailUI", intent2, null);
                                    break;
                                case 4:
                                    x82.k0.i(context, r2Var, dq0Var);
                                    break;
                                case 5:
                                    x82.k0.k(context, r2Var, true, dq0Var);
                                    break;
                                case 6:
                                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionLocation.k(context, null)) {
                                        r45.bq0 bq0Var = r2Var.f67640x5ab01132;
                                        r45.pp0 pp0Var = bq0Var.f452499h;
                                        java.lang.String str3 = bq0Var.f452503o;
                                        r45.jq0 jq0Var = bq0Var.f452495d;
                                        if (jq0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jq0Var.f459575o)) {
                                            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
                                            java.lang.String str4 = r2Var.f67642xd3939c3a;
                                            ((sg3.a) v0Var).getClass();
                                            e17 = c01.a2.e(str4);
                                        } else {
                                            tg3.v0 v0Var2 = (tg3.v0) i95.n0.c(tg3.v0.class);
                                            java.lang.String str5 = jq0Var.f459575o;
                                            ((sg3.a) v0Var2).getClass();
                                            e17 = c01.a2.e(str5);
                                        }
                                        java.lang.String str6 = e17;
                                        java.util.ArrayList arrayList = new java.util.ArrayList();
                                        java.util.LinkedList linkedList = r2Var.f67653xef67d413.f466629e;
                                        if (linkedList != null) {
                                            arrayList.addAll(linkedList);
                                        }
                                        o72.z2.b("RedirectUI", dq0Var.f454189g);
                                        o72.x1.N0(r2Var.f67645x88be67a1, r2Var, pp0Var, str6, str3, arrayList, context, true, true);
                                        ((ku5.t0) ku5.t0.f394148d).B(new x82.j0(r2Var));
                                        break;
                                    }
                                    break;
                                case 7:
                                    if (f9Var.k(context, null)) {
                                        r45.gp0 J2 = o72.x1.J(r2Var);
                                        android.content.Intent intent3 = new android.content.Intent();
                                        intent3.putExtra("rawUrl", J2.A);
                                        intent3.putExtra("key_enable_teen_mode_check", true);
                                        intent3.putExtra("key_enable_fts_quick", true);
                                        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
                                        ((ku5.t0) ku5.t0.f394148d).B(new x82.g0(r2Var));
                                        break;
                                    }
                                    break;
                                case 8:
                                    x82.k0.e(context, r2Var, true, dq0Var);
                                    break;
                                default:
                                    switch (i17) {
                                        case 10:
                                            long j18 = r2Var.f67645x88be67a1;
                                            java.lang.String str7 = r2Var.f67640x5ab01132.f452513y.f451727m;
                                            android.content.Intent intent4 = new android.content.Intent();
                                            intent4.putExtra("key_is_favorite_item", true);
                                            intent4.putExtra("key_favorite_local_id", j18);
                                            intent4.putExtra("key_Product_xml", str7);
                                            intent4.putExtra("key_can_delete_favorite_item", true);
                                            intent4.putExtra("key_ProductUI_getProductInfoScene", 3);
                                            j45.l.j(context, "scanner", ".ui.ProductUI", intent4, null);
                                            ((ku5.t0) ku5.t0.f394148d).B(new x82.f0(r2Var));
                                            break;
                                        case 11:
                                            android.content.Intent intent5 = new android.content.Intent();
                                            intent5.putExtra("key_product_scene", 4);
                                            intent5.putExtra("key_product_info", r2Var.f67640x5ab01132.f452513y.f451727m);
                                            j45.l.j(context, "product", ".ui.MallProductUI", intent5, null);
                                            ((ku5.t0) ku5.t0.f394148d).B(new x82.d0(r2Var));
                                            break;
                                        default:
                                            switch (i17) {
                                                case 14:
                                                    x82.k0.g(context, r2Var, true, dq0Var);
                                                    break;
                                                case 15:
                                                    break;
                                                case 16:
                                                    r45.gp0 J3 = o72.x1.J(r2Var);
                                                    if (J3 != null && (jp0Var = J3.O1) != null && (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(jp0Var.f459531d) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(J3.O1.f459534g))) {
                                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavItemLogic", "it is ad sight.");
                                                        x82.k0.h(context, r2Var, dq0Var);
                                                        break;
                                                    } else {
                                                        x82.k0.i(context, r2Var, dq0Var);
                                                        break;
                                                    }
                                                    break;
                                                case 17:
                                                    com.p314xaae8f345.mm.p2621x8fb0427b.y8 D3 = ((com.p314xaae8f345.mm.p2621x8fb0427b.g9) c01.d9.b().u()).D3(o72.x1.J(r2Var).f456941f);
                                                    if (!c01.e2.G(D3.f277891a) || com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.SessionOa.k(context, null)) {
                                                        android.content.Intent intent6 = new android.content.Intent();
                                                        intent6.putExtra("Contact_User", D3.f277891a);
                                                        intent6.putExtra("Contact_Alias", D3.f277893c);
                                                        intent6.putExtra("Contact_Nick", D3.f277892b);
                                                        intent6.putExtra("Contact_QuanPin", D3.f277894d);
                                                        intent6.putExtra("Contact_PyInitial", D3.f277895e);
                                                        intent6.putExtra("Contact_Uin", D3.f277900j);
                                                        intent6.putExtra("Contact_Mobile_MD5", D3.f277898h);
                                                        intent6.putExtra("Contact_full_Mobile_MD5", D3.f277899i);
                                                        intent6.putExtra("Contact_QQNick", D3.g());
                                                        intent6.putExtra("User_From_Fmessage", false);
                                                        intent6.putExtra("Contact_Scene", D3.f277897g);
                                                        intent6.putExtra("Contact_FMessageCard", true);
                                                        intent6.putExtra("Contact_RemarkName", D3.f277902l);
                                                        intent6.putExtra("Contact_VUser_Info_Flag", D3.f277907q);
                                                        intent6.putExtra("Contact_VUser_Info", D3.f277908r);
                                                        intent6.putExtra("Contact_BrandIconURL", D3.f277909s);
                                                        intent6.putExtra("Contact_Province", D3.f());
                                                        intent6.putExtra("Contact_City", D3.b());
                                                        intent6.putExtra("Contact_Sex", D3.f277905o);
                                                        intent6.putExtra("Contact_Signature", D3.f277906p);
                                                        intent6.putExtra("Contact_ShowUserName", false);
                                                        intent6.putExtra("Contact_KSnsIFlag", 0);
                                                        o72.z2.b("ContactInfoUI", dq0Var.f454189g);
                                                        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent6, null);
                                                        k45.a.a(D3.f277897g);
                                                        ((ku5.t0) ku5.t0.f394148d).B(new x82.c0(r2Var));
                                                        break;
                                                    }
                                                    break;
                                                case 18:
                                                    x82.k0.j(context, -1L, "", -1, r2Var, true, dq0Var);
                                                    break;
                                                default:
                                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FavItemLogic", "Do not match any type %d", java.lang.Integer.valueOf(i17));
                                                    break;
                                            }
                                        case 12:
                                            long j19 = r2Var.f67645x88be67a1;
                                            java.lang.String str8 = r2Var.f67640x5ab01132.C.f462274m;
                                            android.content.Intent intent7 = new android.content.Intent();
                                            intent7.putExtra("key_TV_getProductInfoScene", 3);
                                            intent7.putExtra("key_is_favorite_item", true);
                                            intent7.putExtra("key_favorite_local_id", j19);
                                            intent7.putExtra("key_TV_xml", str8);
                                            intent7.putExtra("key_can_delete_favorite_item", true);
                                            j45.l.j(context, "shake", ".ui.TVInfoUI", intent7, null);
                                            ((ku5.t0) ku5.t0.f394148d).B(new x82.e0(r2Var));
                                            break;
                                    }
                            }
                        } else if (f9Var.k(context, null)) {
                            r2Var.f67640x5ab01132.getClass();
                            r45.gp0 J4 = o72.x1.J(r2Var);
                            if (J4 != null && (hp0Var = J4.J1) != null) {
                                km6Var = hp0Var.G;
                            }
                            if (km6Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavItemLogic", "No valid data, null == shareObject");
                            } else {
                                bw5.o50 v17 = il4.d.v(km6Var.f460372e);
                                if (v17 != null) {
                                    il4.e eVar = new il4.e();
                                    bw5.ar0 ar0Var = bw5.ar0.TingScene_Fav;
                                    eVar.f373639c = 1500;
                                    eVar.f373647k = r2Var.f67643xc8a07680 + "";
                                    ((rk4.k8) ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj()).o(context, v17, ar0Var, eVar, null);
                                    ((ku5.t0) ku5.t0.f394148d).B(new x82.h0(r2Var));
                                } else {
                                    cVar.e(r2Var.f67645x88be67a1, 3);
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FavItemLogic", "handleMusicAlbumItem categoryItem null");
                                }
                            }
                        }
                    }
                }
                if (f9Var.k(context, null)) {
                    r45.jq0 jq0Var2 = r2Var.f67640x5ab01132.f452495d;
                    r45.gp0 J5 = o72.x1.J(r2Var);
                    java.lang.String str9 = jq0Var2.f459583w;
                    java.lang.Boolean bool = java.lang.Boolean.FALSE;
                    o72.x1.s0(context, J5, str9, bool, true, bw5.ar0.TingScene_Fav, r2Var.f67643xc8a07680 + "", bool, null, null);
                    ((ku5.t0) ku5.t0.f394148d).B(new x82.i0(r2Var));
                }
            } else {
                dp.a.m125853x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.cdu, 0).show();
            }
        }
        return true;
    }
}
