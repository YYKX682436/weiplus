package com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.wallet_index.ui.WalletOpenViewProxyUI */
/* loaded from: classes9.dex */
public class ActivityC19171xb0aad1a extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f262650g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.d f262651d;

    /* renamed from: e, reason: collision with root package name */
    public gs4.f f262652e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Map f262653f = new java.util.HashMap();

    public static void Y6(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_LQT_VERSION_INT_SYNC;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "LQTVersion Old: %s New: %s", c17.m(u3Var, 0), str);
        gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0)));
    }

    public final void U6(boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) this.f262653f).get("closeWebView"));
        if (z17) {
            setResult(-1, intent);
        } else {
            setResult(0, intent);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e0 e0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.e0(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(e0Var, 50L, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v103, types: [int] */
    /* JADX WARN: Type inference failed for: r0v107 */
    /* JADX WARN: Type inference failed for: r0v110 */
    public final void V6(java.lang.String str) {
        android.content.DialogInterface.OnCancelListener onCancelListener;
        boolean z17;
        java.lang.String str2;
        int P;
        boolean z18 = true;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] packageExt null or nil");
        } else {
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) this.f262653f).get("openview");
            if ("open_wcpay_biz_view".equals(str3)) {
                h45.a0.e(mo55332x76847179(), null);
            } else {
                if ("open_wcpay_hbrefund".equals(str3)) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    m27539xaf65a0fc.mo27557xc5c55e60("refund_open_from", 3);
                    m27539xaf65a0fc.mo27566xe4673800("refund_json", this.f262652e.b());
                    m27539xaf65a0fc.mo27566xe4673800("refund_lingqian_title", this.f262652e.f356617d);
                    m27539xaf65a0fc.mo27566xe4673800("refund_lingqian_desc", this.f262652e.f356618e);
                    m27539xaf65a0fc.mo27566xe4673800("refund_origin_title", this.f262652e.f356619f);
                    m27539xaf65a0fc.mo27566xe4673800("refund_origin_desc", this.f262652e.f356620g);
                    m27539xaf65a0fc.mo27566xe4673800("top_tip", this.f262652e.f356621h);
                    m27539xaf65a0fc.mo27566xe4673800("refund_time_title", this.f262652e.f356622i);
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7049x74612385 c7049x74612385 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7049x74612385();
                    gm0.j1.i();
                    int i17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.B0(((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EXT_PAY_SETTING_LONG_SYNC, 0L)).longValue() & 3, 2L) ? 2 : 1;
                    m27539xaf65a0fc.mo27556xf2e34299("is_return_to_lq", i17 == 1);
                    ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("hongbaoRefundWay", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.g0(this));
                    c7049x74612385.f143636f = 3L;
                    c7049x74612385.f143634d = i17;
                    c7049x74612385.k();
                } else if ("open_wallet_delay_transfer_setting_ui".equals(str3)) {
                    com.p314xaae8f345.mm.p2802xd031a825.b a17 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
                    a17.getClass();
                    boolean c17 = a17.c(e42.c0.clicfg_pay_delay_transfer_kinda_switch, false);
                    com.p314xaae8f345.mm.p2802xd031a825.b a18 = com.p314xaae8f345.mm.p2802xd031a825.b.a();
                    a18.getClass();
                    ?? r07 = c17;
                    if (a18.c(e42.c0.clicfg_pay_delay_transfer_flutter_switch, false)) {
                        r07 = 2;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "func[handleOpenView] do open wallet_delay_transfer_setting_ui，openType ：%s", java.lang.Integer.valueOf((int) r07));
                    if (r07 == 1) {
                        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc2 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                        m27539xaf65a0fc2.mo27556xf2e34299("isOpenFlutter", false);
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("delayTransferUseCase", m27539xaf65a0fc2, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.i0(this));
                        return;
                    } else if (r07 == 2) {
                        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc3 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                        m27539xaf65a0fc3.mo27556xf2e34299("isOpenFlutter", true);
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("delayTransferUseCase", m27539xaf65a0fc3, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.k0(this));
                        return;
                    } else {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("key_scene", 1);
                        j45.l.j(mo55332x76847179(), "wallet", ".pwd.ui.WalletDelayTransferSettingUI", intent, null);
                    }
                } else if ("open_wcpay_balance_view".equals(str3)) {
                    h45.a0.b(mo55332x76847179(), 0);
                } else if ("open_wcpay_order_detail_view".equals(str3)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("trans_id", (java.lang.String) ((java.util.HashMap) this.f262653f).get("trans_id"));
                    intent2.putExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 1);
                    if (((java.util.HashMap) this.f262653f).containsKey("bill_id")) {
                        intent2.putExtra("bill_id", (java.lang.String) ((java.util.HashMap) this.f262653f).get("bill_id"));
                    }
                    j45.l.j(mo55332x76847179(), "order", ".ui.MallOrderTransactionInfoUI", intent2, null);
                } else if ("open_wcpay_f2f_receive_detail".equals(str3)) {
                    android.content.Intent intent3 = new android.content.Intent();
                    intent3.putExtra("key_timestamp", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) ((java.util.HashMap) this.f262653f).get("fromtimestamp"), 0L));
                    intent3.putExtra("key_from_scene", 1);
                    j45.l.j(mo55332x76847179(), "collect", ".ui.CollectBillUI", intent3, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13944, 2);
                } else if ("open_wcpay_grouppay_detail".equals(str3)) {
                    android.content.Intent intent4 = new android.content.Intent();
                    intent4.putExtra("bill_no", (java.lang.String) ((java.util.HashMap) this.f262653f).get("billno"));
                    intent4.putExtra("chatroom", (java.lang.String) ((java.util.HashMap) this.f262653f).get("groupid"));
                    intent4.putExtra("key_sign", (java.lang.String) ((java.util.HashMap) this.f262653f).get("sign"));
                    intent4.putExtra("key_ver", (java.lang.String) ((java.util.HashMap) this.f262653f).get("ver"));
                    intent4.putExtra("enter_scene", 5);
                    j45.l.j(mo55332x76847179(), "aa", ".ui.PaylistAAUI", intent4, null);
                } else if ("open_wcpay_t2bc_detail".equals(str3)) {
                    java.lang.String str4 = (java.lang.String) ((java.util.HashMap) this.f262653f).get("transfer_bill_id");
                    if (!((h45.q) i95.n0.c(h45.q.class)).mo24851x287b17dd(str4, null)) {
                        android.content.Intent intent5 = new android.content.Intent();
                        intent5.putExtra("key_transfer_bill_id", str4);
                        intent5.putExtra("key_enter_scene", 1);
                        j45.l.j(mo55332x76847179(), "remittance", ".bankcard.ui.BankRemitDetailUI", intent5, null);
                    }
                } else if ("open_honey_pay_home".equals(str3)) {
                    if (u73.h.g()) {
                        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("HoneyPayPayerUseCase", com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc(), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.l0(this));
                    } else {
                        j45.l.j(mo55332x76847179(), "honey_pay", ".ui.HoneyPayMainUI", new android.content.Intent(), null);
                    }
                } else {
                    if ("open_honey_pay_card_back".equals(str3)) {
                        if (u73.h.g()) {
                            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc4 = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                            m27539xaf65a0fc4.mo27566xe4673800("card_id", (java.lang.String) ((java.util.HashMap) this.f262653f).get("card_id"));
                            ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("honeyPayCardBackUseCase", m27539xaf65a0fc4, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.m0(this));
                        } else {
                            android.content.Intent intent6 = new android.content.Intent();
                            intent6.putExtra("key_card_no", (java.lang.String) ((java.util.HashMap) this.f262653f).get("card_id"));
                            j45.l.j(mo55332x76847179(), "honey_pay", ".ui.HoneyPayCardBackUI", intent6, null);
                        }
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.n0 n0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.n0(this, true);
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(n0Var, 500L, false);
                        return;
                    }
                    if ("open_honey_pay_user_detail".equals(str3)) {
                        android.content.Intent intent7 = new android.content.Intent();
                        intent7.putExtra("key_is_payer", false);
                        intent7.putExtra("key_card_no", (java.lang.String) ((java.util.HashMap) this.f262653f).get("card_id"));
                        j45.l.j(mo55332x76847179(), "honey_pay", ".ui.HoneyPayProxyUI", intent7, null);
                        ku5.u0 u0Var2 = ku5.t0.f394148d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o0 o0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.o0(this, true);
                        ku5.t0 t0Var2 = (ku5.t0) u0Var2;
                        t0Var2.getClass();
                        t0Var2.z(o0Var, 500L, false);
                        return;
                    }
                    if ("open_wcpay_t2bc_view".equals(str3)) {
                        if (!((h45.q) i95.n0.c(h45.q.class)).mo24852xdf2d02ae(null, null)) {
                            j45.l.j(mo55332x76847179(), "remittance", ".bankcard.ui.BankRemitBankcardInputUI", new android.content.Intent(), null);
                        }
                    } else if ("open_wcpay_fetch_balance_view".equals(str3)) {
                        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6234x100b5516 c6234x100b5516 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6234x100b5516();
                        c6234x100b5516.f136482g.f87834a = mo55332x76847179();
                        c6234x100b5516.e();
                    } else if ("open_wcpay_wallet_lock_view".equals(str3)) {
                        android.content.Intent intent8 = new android.content.Intent();
                        intent8.putExtra("wallet_lock_jsapi_scene", (java.lang.String) ((java.util.HashMap) this.f262653f).get("entry_scene"));
                        if (((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).Ai()) {
                            ((h45.q) i95.n0.c(h45.q.class)).mo24843xf99bd94d(this, intent8, new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.p0(this));
                        } else {
                            ((bu4.i) ((cu4.k) i95.n0.c(cu4.k.class))).wi().l(this, intent8);
                        }
                    } else if ("open_wcpay_security_setting_view".equals(str3)) {
                        android.content.Intent intent9 = new android.content.Intent();
                        intent9.putExtra("wallet_lock_jsapi_scene", (java.lang.String) ((java.util.HashMap) this.f262653f).get("entry_scene"));
                        if (com.p314xaae8f345.mm.p2802xd031a825.b.a().e()) {
                            ((h45.q) i95.n0.c(h45.q.class)).mo24826x2446a031(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1((java.lang.String) ((java.util.HashMap) this.f262653f).get("entry_scene"), 0), new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.q0(this));
                        } else {
                            j45.l.j(this, "wallet", ".pwd.ui.WalletSecuritySettingUI", intent9, null);
                        }
                    } else if ("open_wcpay_c2c_message_view".equals(str3)) {
                        java.util.Map map = this.f262653f;
                        if (map != null && ((P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P((java.lang.String) ((java.util.HashMap) map).get("bizType"), -1)) == 1 || P == 7)) {
                            java.lang.String str5 = (java.lang.String) ((java.util.HashMap) this.f262653f).get("bizId");
                            java.lang.String str6 = (java.lang.String) ((java.util.HashMap) this.f262653f).get(dm.i4.f66875xa013b0d5);
                            long V = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.V((java.lang.String) ((java.util.HashMap) this.f262653f).get("createTime"), -1L);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open c2c message view, bizType: %s, bizId: %s, username: %s, createTime: %s", java.lang.Integer.valueOf(P), str5, str6, java.lang.Long.valueOf(V));
                            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5654x780453b8 c5654x780453b8 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5654x780453b8();
                            am.wh whVar = c5654x780453b8.f135980g;
                            whVar.f89816b = str5;
                            whVar.f89817c = str6;
                            whVar.f89818d = java.lang.Long.valueOf(V);
                            c5654x780453b8.e();
                        }
                    } else if ("open_lqt_auto_planindex_view".equals(str3)) {
                        j45.l.j(mo55332x76847179(), "wallet", ".balance.ui.lqt.WalletLqtPlanBeforeHomeUI", new android.content.Intent(), null);
                    } else if ("open_wcpay_hk_f2f".equals(str3)) {
                        android.content.Intent intent10 = new android.content.Intent();
                        intent10.putExtra("key_from_scene", 1);
                        j45.l.j(mo55332x76847179(), "collect", ".ui.CollectHKMainUI", intent10, null);
                    } else if ("open_lqt_auto_planadd_view".equals(str3)) {
                        android.content.Intent intent11 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19014x45f83936.class);
                        intent11.putExtra("key_mode", 1);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(intent11);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI", "handleOpenView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                        startActivity((android.content.Intent) arrayList.get(0));
                        yj0.a.f(this, "com/tencent/mm/plugin/wallet_index/ui/WalletOpenViewProxyUI", "handleOpenView", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    } else if ("open_wcpay_lqt_save".equals(str3)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.c3.c((java.lang.String) ((java.util.HashMap) this.f262653f).get("trace_info"));
                        Y6((java.lang.String) ((java.util.HashMap) this.f262653f).get("lqt_fund_agent_entity"));
                        java.util.Map map2 = this.f262653f;
                        boolean l17 = j62.e.g().l("clicfg_android_balance_jump_route_change", false, false, true);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveJumpHandler", "[handle] enableKindaRoute: %s", java.lang.Boolean.valueOf(l17));
                        if (l17) {
                            java.lang.String str7 = map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("operate_id") : null;
                            android.content.Intent intent12 = new android.content.Intent(this, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19020x7623dbfb.class);
                            intent12.putExtra("lqt_save_fetch_mode", 1);
                            intent12.putExtra("operate_id", str7);
                            if (str != null && r26.n0.B(str, "entry_scene", false)) {
                                intent12.putExtra("entrance_type", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("entry_scene") : null, 0));
                            }
                            if (str != null && r26.n0.B(str, "amount", false)) {
                                double E1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.E1(map2 != null ? (java.lang.String) ((java.util.HashMap) map2).get("amount") : null) / 100.0d;
                                intent12.putExtra("fill_money", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(E1));
                                intent12.putExtra("limit_cashier_amount", E1);
                                intent12.putExtra("outer_trans_money", com.p314xaae8f345.mm.p2802xd031a825.ui.r1.o(E1));
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveJumpHandler", "[jumpToLqtSaveKinda] start lqt save use case (kinda only)");
                            if (!((h45.q) i95.n0.c(h45.q.class)).mo24819x8648fb0d(this, intent12, nt4.g.f421358a)) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LqtSaveJumpHandler", "[jumpToLqtSaveKinda] startLqtSaveUseCase not available, start failed");
                            }
                            finish();
                            z17 = false;
                        } else {
                            if (map2 != null) {
                                str2 = (java.lang.String) ((java.util.HashMap) map2).get("operate_id");
                                onCancelListener = null;
                                z17 = false;
                            } else {
                                onCancelListener = null;
                                z17 = false;
                                str2 = null;
                            }
                            new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.z().l().h(new nt4.i(this, com.p314xaae8f345.mm.p2802xd031a825.ui.b2.e(this, z17, z17, onCancelListener), str, map2, str2));
                        }
                        z18 = z17;
                    } else {
                        z18 = true;
                        if ("open_wcpay_grouppay_introview".equals(str3)) {
                            java.lang.String str8 = (java.lang.String) ((java.util.HashMap) this.f262653f).get("amount");
                            java.lang.String str9 = (java.lang.String) ((java.util.HashMap) this.f262653f).get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                            android.content.Intent intent13 = new android.content.Intent();
                            intent13.putExtra("amount", str8);
                            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str9)) {
                                str9 = java.net.URLDecoder.decode(str9);
                                intent13.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str9);
                            }
                            intent13.putExtra("enter_scene", 5);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", str8, str9);
                            j45.l.j(this, "aa", ".ui.AAEntranceUI", intent13, null);
                        } else if ("open_transfer_operation_result_view".equals(str3)) {
                            new com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui.C17139x8ed6d66d().b(mo55332x76847179().getMainLooper());
                        }
                    }
                    z18 = true;
                }
            }
        }
        android.content.Intent intent14 = new android.content.Intent();
        intent14.putExtra("closeWebView", (java.lang.String) ((java.util.HashMap) this.f262653f).get("closeWebView"));
        setResult(-1, intent14);
        if (z18) {
            finish();
        }
    }

    public final void W6() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i0_));
        u1Var.k(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.f573827fz1);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.f0(this));
        u1Var.q(false);
    }

    public final void X6(android.content.Intent intent) {
        if (intent == null) {
            intent = new android.content.Intent();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "start LQTDetail");
        if (((h45.q) i95.n0.c(h45.q.class)).mo24812x391b2a71(mo55332x76847179())) {
            return;
        }
        j45.l.j(mo55332x76847179(), "wallet", ".balance.ui.lqt.WalletLqtDetailUI", intent, null);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 563) {
            if (i18 == -1) {
                java.lang.String stringExtra = intent.getStringExtra("Select_Conv_User");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "select chatroom：%s", stringExtra);
                java.lang.String str = (java.lang.String) ((java.util.HashMap) this.f262653f).get("amount");
                java.lang.String str2 = (java.lang.String) ((java.util.HashMap) this.f262653f).get(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
                android.content.Intent intent2 = new android.content.Intent();
                intent2.putExtra("amount", str);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str2 = java.net.URLDecoder.decode(str2);
                    intent2.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, str2);
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                    intent2.putExtra("chatroom_name", stringExtra);
                }
                intent2.putExtra("enter_scene", 5);
                j45.l.j(mo55332x76847179(), "aa", ".ui.LaunchAAUI", intent2, null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "view open grouppay, amount: %s, title: %s", str, str2);
            }
            finish();
        }
        super.onActivityResult(i17, i18, intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instructions count: 890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2376x3657410c.ui.ActivityC19171xb0aad1a.onCreate(android.os.Bundle):void");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(580);
        m83121xf6ff5b27(385);
        m83121xf6ff5b27(2996);
        m83121xf6ff5b27(1477);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "onSceneEnd, errType: %s, errCode: %s, errMsg: %s, scene: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str, m1Var);
        if (i17 != 0 || i18 != 0) {
            setResult(0);
            finish();
            return true;
        }
        if (m1Var instanceof ss4.d) {
            h45.y.f360501a = ((ss4.d) m1Var).H();
            V6(getIntent().getStringExtra("packageExt"));
            return true;
        }
        if (m1Var instanceof ss4.a0) {
            V6(getIntent().getStringExtra("packageExt"));
            return true;
        }
        if (!(m1Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3)) {
            if (m1Var instanceof gs4.h) {
                this.f262652e = ((gs4.h) m1Var).H();
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_HB_REFUND_CONFIG_REFACTOR_STRING_SYNC, this.f262652e.b());
                V6(getIntent().getStringExtra("packageExt"));
            }
            return false;
        }
        r45.p15 p15Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.p2359x633fb29.lqt.f3) m1Var).f259165d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletOpenViewProxyUI", "on open lqb account scene end, retcode: %s, regmsg: %s", java.lang.Integer.valueOf(p15Var.f464194d), p15Var.f464195e);
        r45.ce4 ce4Var = p15Var.f464196f;
        if (ce4Var != null) {
            this.f262651d.a(ce4Var, null);
        }
        if (p15Var.f464194d == 0) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_account_type", 2);
            X6(intent);
            setResult(-1);
        } else if (p15Var.f464196f == null) {
            dp.a.m125854x26a183b(this, p15Var.f464195e, 1).show();
            setResult(0);
        }
        finish();
        return true;
    }
}
