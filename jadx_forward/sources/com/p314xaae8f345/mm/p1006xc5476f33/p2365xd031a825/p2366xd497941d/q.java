package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d;

/* loaded from: classes9.dex */
public class q implements h45.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a f261011a;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar) {
        this.f261011a = aVar;
    }

    @Override // h45.i
    /* renamed from: onKindaBusinessCallback */
    public void mo24858x44dbb8f3(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "startBindCardUseCase callback");
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.i1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.a aVar = this.f261011a;
        aVar.f260858o.mo48814x2efc64();
        aVar.f260859p.mo48814x2efc64();
        aVar.f260854k = intent;
        aVar.f260853j = true;
        if (intent.getIntExtra("retcode", -1) != 1) {
            if (intent.getIntExtra("retcode", -1) == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Cancel");
                android.app.Activity mo24762xef326bb9 = ((h45.q) i95.n0.c(h45.q.class)).mo24762xef326bb9();
                if (mo24762xef326bb9 != null) {
                    aVar.f(mo24762xef326bb9, aVar.f295334c);
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "activity is null");
                    return;
                }
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RealNameVerifyProcess", "KindaBindCardEvent bindCard Succ");
        android.app.Activity mo24762xef326bb92 = ((h45.q) i95.n0.c(h45.q.class)).mo24762xef326bb9();
        if (mo24762xef326bb92 != null) {
            android.os.Bundle bundle = aVar.f295334c;
            bundle.putInt("realname_verify_process_ret", -1);
            bundle.putString("realname_verify_process_finish_title", intent.getStringExtra("realname_title"));
            bundle.putString("realname_verify_process_finish_desc", intent.getStringExtra("realname_desc"));
            bundle.putString("realname_verify_process_finish_page", intent.getStringExtra("realname_btn_title"));
            bundle.putInt("realname_verify_process_finish_err_jump", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(intent.getStringExtra("realname_err_jump_page"), 0));
            bundle.putInt("realname_verify_process_finish_passport_page_style", intent.getIntExtra("passport_page_style", 0));
            bundle.putString("realname_verify_process_finish_confirm_btn_title", intent.getStringExtra("confirm_btn_title"));
            bundle.putString("realname_verify_process_finish_confirm_btn_url", intent.getStringExtra("confirm_btn_url"));
            bundle.putString("realname_verify_process_finish_cancel_btn_title", intent.getStringExtra(".cancel_btn_title"));
            bundle.putString("realname_verify_process_finish_bottom_wording", intent.getStringExtra("bottom_wording"));
            bundle.putString("realname_verify_process_finish_bottom_url", intent.getStringExtra("bottom_url"));
            bundle.putString("realname_verify_process_finish_bottom_username", intent.getStringExtra("bottom_username"));
            aVar.B(mo24762xef326bb92, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2366xd497941d.ActivityC19084x72adb339.class, aVar.f295334c);
        }
    }
}
