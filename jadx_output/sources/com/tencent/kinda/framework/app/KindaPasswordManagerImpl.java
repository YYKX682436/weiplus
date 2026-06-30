package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaPasswordManagerImpl implements com.tencent.kinda.gen.KindaPasswordManager {
    private final java.lang.String TAG = "KindaPasswordManagerImpl";
    private final java.lang.String KEY_PROCESS_ID = "process_id";

    @Override // com.tencent.kinda.gen.KindaPasswordManager
    public void startResetPasswordImpl(final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2, boolean z17) {
        final android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            context.getClass();
            com.tencent.mars.xlog.Log.e("KindaPasswordManagerImpl", "Fail to start ResetPasswordImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) context;
        mMActivity.getIntent().putExtra("process_id", fs4.h.class.hashCode());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("isFromKinda", true);
        bundle.putBoolean("isDomesticUser", z17);
        com.tencent.mm.wallet_core.a.j(mMActivity, fs4.h.class, bundle, null);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(mMActivity);
        if (!(g17 instanceof fs4.h)) {
            com.tencent.mars.xlog.Log.e("KindaPasswordManagerImpl", "Fail to get correct wallet process in ResetPasswordImpl, expect ForgotPwdProcess got %s", g17.getClass().getName());
        } else {
            ((fs4.h) g17).f266341d = new fs4.g() { // from class: com.tencent.kinda.framework.app.KindaPasswordManagerImpl.1
                @Override // fs4.g
                public void run(int i17) {
                    com.tencent.kinda.framework.widget.tools.KindaContext.popToContext(context);
                    if (i17 == 0) {
                        voidCallback.call();
                    } else {
                        voidCallback2.call();
                    }
                }
            };
        }
    }
}
