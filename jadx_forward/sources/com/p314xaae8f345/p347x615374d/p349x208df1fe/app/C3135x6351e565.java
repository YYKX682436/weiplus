package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaPasswordManagerImpl */
/* loaded from: classes9.dex */
public class C3135x6351e565 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3568x3d7669a5 {
    private final java.lang.String TAG = "KindaPasswordManagerImpl";

    /* renamed from: KEY_PROCESS_ID */
    private final java.lang.String f12041x9900130b = "process_id";

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3568x3d7669a5
    /* renamed from: startResetPasswordImpl */
    public void mo25216x1da74a08(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192, boolean z17) {
        final android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            context.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPasswordManagerImpl", "Fail to start ResetPasswordImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        abstractActivityC21394xb3d2c0cf.getIntent().putExtra("process_id", fs4.h.class.hashCode());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isFromKinda", true);
        bundle.putBoolean("isDomesticUser", z17);
        com.p314xaae8f345.mm.p2802xd031a825.a.j(abstractActivityC21394xb3d2c0cf, fs4.h.class, bundle, null);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(abstractActivityC21394xb3d2c0cf);
        if (!(g17 instanceof fs4.h)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPasswordManagerImpl", "Fail to get correct wallet process in ResetPasswordImpl, expect ForgotPwdProcess got %s", g17.getClass().getName());
        } else {
            ((fs4.h) g17).f347874d = new fs4.g() { // from class: com.tencent.kinda.framework.app.KindaPasswordManagerImpl.1
                @Override // fs4.g
                public void run(int i17) {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27318x1a0a0763(context);
                    if (i17 == 0) {
                        abstractC3623x3b485619.mo25801x2e7a5e();
                    } else {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    }
                }
            };
        }
    }
}
