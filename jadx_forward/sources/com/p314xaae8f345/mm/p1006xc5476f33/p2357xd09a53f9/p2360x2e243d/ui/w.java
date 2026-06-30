package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui;

/* loaded from: classes9.dex */
public class w implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e f260180d;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e) {
        this.f260180d = activityC19024x28e2705e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c) adapterView.getAdapter().getItem(i17);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.q0(18, 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.ActivityC19024x28e2705e activityC19024x28e2705e = this.f260180d;
        if (c19091x9511676c != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.c cVar = activityC19024x28e2705e.f260087i;
            java.util.List list = cVar.f260154h;
            if (list != null && !((java.util.ArrayList) list).isEmpty()) {
                java.util.Iterator it = ((java.util.ArrayList) cVar.f260154h).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.String str = (java.lang.String) it.next();
                    if (str.equals(c19091x9511676c.f69225xed6d60f6)) {
                        ((java.util.ArrayList) cVar.f260154h).remove(str);
                        gm0.j1.i();
                        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_SERIAL_STRING_SYNC, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(cVar.f260154h, ","));
                        break;
                    }
                }
            }
            if (c19091x9511676c.F0()) {
                if (c19091x9511676c.f69263xe0badd12 == 0) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.d.a(c19091x9511676c)) {
                        gm0.j1.i();
                        java.lang.String str2 = (java.lang.String) gm0.j1.u().c().l(196659, null);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        if (android.text.TextUtils.isEmpty(str2)) {
                            sb6.append(c19091x9511676c.f69223x58802fcb);
                        } else {
                            sb6.append(str2);
                            sb6.append("&");
                            sb6.append(c19091x9511676c.f69223x58802fcb);
                        }
                        gm0.j1.i();
                        gm0.j1.u().c().w(196659, sb6.toString());
                    }
                    android.os.Bundle bundle = new android.os.Bundle();
                    bundle.putParcelable("key_bankcard", c19091x9511676c);
                    bundle.putString("key_bank_username", c19091x9511676c.f69226x3a0bff44);
                    bundle.putString("key_bank_type", c19091x9511676c.f69223x58802fcb);
                    com.p314xaae8f345.mm.p2802xd031a825.a.k(activityC19024x28e2705e, "wxcredit", "WXCreditOpenProcess", bundle, null);
                } else {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putParcelable("key_bankcard", c19091x9511676c);
                    com.p314xaae8f345.mm.p2802xd031a825.a.k(activityC19024x28e2705e, "wxcredit", "WXCreditManagerProcess", bundle2, null);
                }
            } else if (c19091x9511676c.A0()) {
                activityC19024x28e2705e.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "do honey pay card back");
                if (u73.h.g()) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                    m27539xaf65a0fc.mo27566xe4673800("card_id", c19091x9511676c.f69225xed6d60f6);
                    ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("honeyPayCardBackUseCase", m27539xaf65a0fc, new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.x(activityC19024x28e2705e));
                } else {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_card_no", c19091x9511676c.f69225xed6d60f6);
                    j45.l.j(activityC19024x28e2705e, "honey_pay", ".ui.HoneyPayCardBackUI", intent, null);
                }
            } else {
                at4.u1 p17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().p();
                boolean z17 = (p17.f95514a & 4096) > 0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchConfig", "isReportLocation, ret = %s switchBit %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(p17.f95514a));
                if (z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "jump to H5 bankcard detail page");
                    gm0.j1.i();
                    java.lang.String str3 = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_STRING_SYNC, "");
                    gm0.j1.i();
                    long longValue = ((java.lang.Long) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_BANKCARD_DETAIL_URL_TIMESTAMP_LONG_SYNC, 0L)).longValue();
                    long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3) || currentTimeMillis - longValue >= 7200) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "listen BankcardLogoReadyEvent for newest url");
                        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
                        new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e>(a0Var) { // from class: com.tencent.mm.plugin.wallet.bind.ui.WalletBankcardManageUI$6$1
                            {
                                this.f39173x3fe91575 = 585646942;
                            }

                            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
                            /* renamed from: callback */
                            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5186xcb31c54e c5186xcb31c54e) {
                                mo48814x2efc64();
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "BankcardLogoReady,jump bank url");
                                com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2360x2e243d.ui.w.this.f260180d.X6(c19091x9511676c);
                                return true;
                            }
                        }.mo48813x58998cd();
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletBankcardManageUI", "bank's url is not null");
                        activityC19024x28e2705e.X6(c19091x9511676c);
                    }
                } else {
                    activityC19024x28e2705e.Y6(c19091x9511676c);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14422, 1, c19091x9511676c.f69223x58802fcb);
        } else {
            activityC19024x28e2705e.U6(null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14422, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/bind/ui/WalletBankcardManageUI$6", "android/widget/AdapterView$OnItemClickListener", "onItemClick", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }
}
