package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 f260913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f260914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f260915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f260916g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a f260917h;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6243x5c461184 c6243x5c461184, android.content.Intent intent, android.app.Activity activity, android.os.Bundle bundle) {
        this.f260917h = aVar;
        this.f260913d = c6243x5c461184;
        this.f260914e = intent;
        this.f260915f = activity;
        this.f260916g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r rVar;
        boolean z17;
        java.lang.Class<?> cls;
        boolean z18;
        this.f260913d.f273897d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f260917h;
        aVar.getClass();
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f260849f);
        android.os.Bundle bundle = this.f260916g;
        android.app.Activity activity = this.f260915f;
        android.content.Intent intent = this.f260914e;
        if (K0 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f260850g)) {
            aVar.l(activity, aVar.f260851h, bundle);
            int i17 = aVar.f260851h;
            if (i17 == -1 || i17 == 0) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c12 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12();
                c6256xb3fb7c12.f136506g.f87653a = aVar.f260851h;
                c6256xb3fb7c12.e();
                boolean z19 = intent.getExtras().getBoolean("is_from_new_cashier");
                int i18 = aVar.f260851h;
                if (i18 == -1) {
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("notifyType", "WCPayRealnameVerifyLogic");
                    bundle2.putBoolean("stopUseCase", true);
                    ((h45.q) i95.n0.c(h45.q.class)).mo24781x29b0a117(bundle2, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.g(this));
                } else if (i18 == 0 && z19 && !aVar.f260856m && (rVar = aVar.f260857n) != null) {
                    rVar.run(activity);
                }
                if (aVar.f260853j) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b80 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80();
                    int intExtra = aVar.f260854k.getIntExtra("retcode", -1);
                    am.di diVar = c5663xbbd89b80.f135987g;
                    if (intExtra == 1) {
                        diVar.f87986a = true;
                        diVar.f87988c = aVar.f260854k.getStringExtra("bind_serial");
                        diVar.f87989d = aVar.f260854k.getStringExtra("password");
                        diVar.f87990e = aVar.f260854k.getStringExtra("bank_type");
                        diVar.f87991f = aVar.f260854k.getStringExtra("mobile_no");
                        diVar.f87992g = aVar.f260854k.getStringExtra("realname_title");
                        diVar.f87993h = aVar.f260854k.getStringExtra("realname_desc");
                        diVar.f87994i = aVar.f260854k.getStringExtra("realname_btn_title");
                        diVar.f87995j = aVar.f260854k.getStringExtra("realname_err_jump_page");
                        diVar.f87997l = aVar.f260854k.getIntExtra("passport_page_style", 0);
                        diVar.f87998m = aVar.f260854k.getStringExtra("confirm_btn_title");
                        diVar.f87999n = aVar.f260854k.getStringExtra("confirm_btn_url");
                        diVar.f88000o = aVar.f260854k.getStringExtra("cancel_btn_title");
                        diVar.f88001p = aVar.f260854k.getStringExtra("bottom_wording");
                        diVar.f88002q = aVar.f260854k.getStringExtra("bottom_url");
                        diVar.f88003r = aVar.f260854k.getStringExtra("bottom_username");
                    } else if (aVar.f260854k.getIntExtra("retcode", -1) == -1) {
                        z17 = false;
                        diVar.f87986a = false;
                        diVar.f87987b = bundle.getBoolean("key_need_bind_response", z17);
                        diVar.f87996k = java.lang.Boolean.TRUE;
                        c5663xbbd89b80.e();
                        return;
                    }
                    z17 = false;
                    diVar.f87987b = bundle.getBoolean("key_need_bind_response", z17);
                    diVar.f87996k = java.lang.Boolean.TRUE;
                    c5663xbbd89b80.e();
                    return;
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "real name verify process end,jump to " + aVar.f260849f + aVar.f260850g);
        boolean z27 = aVar.f295334c.getBoolean("process_finish_stay_orgpage", true);
        intent.putExtra("key_process_is_end", true);
        intent.putExtra("key_process_is_stay", z27);
        intent.putExtra("key_should_contain_activity_when_on_new_intent", true);
        boolean z28 = intent.getExtras().getBoolean("is_from_new_cashier");
        try {
            cls = java.lang.Class.forName(intent.getExtras().getString("start_activity_class", ""));
        } catch (java.lang.ClassNotFoundException unused) {
            cls = null;
        }
        if (z28) {
            if (cls == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar2 = this.f260917h;
                aVar2.k(this.f260915f, aVar2.f260849f, aVar2.f260850g, aVar2.f260851h, this.f260914e, z27);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar3 = this.f260917h;
                aVar3.h(this.f260915f, cls, aVar3.f260851h, this.f260914e, z27);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.r rVar2 = aVar.f260857n;
            if (rVar2 != null) {
                rVar2.run(activity);
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar4 = this.f260917h;
        aVar4.k(this.f260915f, aVar4.f260849f, aVar4.f260850g, aVar4.f260851h, this.f260914e, z27);
        int i19 = aVar.f260851h;
        if (i19 == -1 || i19 == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12 c6256xb3fb7c122 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6256xb3fb7c12();
            c6256xb3fb7c122.f136506g.f87653a = aVar.f260851h;
            c6256xb3fb7c122.e();
            if (aVar.f260851h == -1) {
                android.os.Bundle bundle3 = new android.os.Bundle();
                bundle3.putString("notifyType", "WCPayRealnameVerifyLogic");
                bundle3.putBoolean("stopUseCase", true);
                ((h45.q) i95.n0.c(h45.q.class)).mo24781x29b0a117(bundle3, "", new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.f(this));
            }
            ((h45.q) i95.n0.c(h45.q.class)).mo24789xcfbaeb4a();
            if (aVar.f260853j) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80 c5663xbbd89b802 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5663xbbd89b80();
                int intExtra2 = aVar.f260854k.getIntExtra("retcode", -1);
                am.di diVar2 = c5663xbbd89b802.f135987g;
                if (intExtra2 == 1) {
                    diVar2.f87986a = true;
                    diVar2.f87988c = aVar.f260854k.getStringExtra("bind_serial");
                    diVar2.f87989d = aVar.f260854k.getStringExtra("password");
                    diVar2.f87990e = aVar.f260854k.getStringExtra("bank_type");
                    diVar2.f87991f = aVar.f260854k.getStringExtra("mobile_no");
                    diVar2.f87992g = aVar.f260854k.getStringExtra("realname_title");
                    diVar2.f87993h = aVar.f260854k.getStringExtra("realname_desc");
                    diVar2.f87994i = aVar.f260854k.getStringExtra("realname_btn_title");
                    diVar2.f87995j = aVar.f260854k.getStringExtra("realname_err_jump_page");
                    diVar2.f87997l = aVar.f260854k.getIntExtra("passport_page_style", 0);
                    diVar2.f87998m = aVar.f260854k.getStringExtra("confirm_btn_title");
                    diVar2.f87999n = aVar.f260854k.getStringExtra("confirm_btn_url");
                    diVar2.f88000o = aVar.f260854k.getStringExtra("cancel_btn_title");
                    diVar2.f88001p = aVar.f260854k.getStringExtra("bottom_wording");
                    diVar2.f88002q = aVar.f260854k.getStringExtra("bottom_url");
                    diVar2.f88003r = aVar.f260854k.getStringExtra("bottom_username");
                } else if (aVar.f260854k.getIntExtra("retcode", -1) == -1) {
                    z18 = false;
                    diVar2.f87986a = false;
                    diVar2.f87987b = bundle.getBoolean("key_need_bind_response", z18);
                    diVar2.f87996k = java.lang.Boolean.TRUE;
                    c5663xbbd89b802.e();
                }
                z18 = false;
                diVar2.f87987b = bundle.getBoolean("key_need_bind_response", z18);
                diVar2.f87996k = java.lang.Boolean.TRUE;
                c5663xbbd89b802.e();
            }
        }
    }
}
