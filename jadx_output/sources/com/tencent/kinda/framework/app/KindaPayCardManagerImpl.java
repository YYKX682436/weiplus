package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KindaPayCardManagerImpl implements com.tencent.kinda.gen.KindaPayCardManager {
    @Override // com.tencent.kinda.gen.KindaPayCardManager
    public void addPayCardImpl(final com.tencent.kinda.gen.VoidCallback voidCallback, final com.tencent.kinda.gen.VoidCallback voidCallback2) {
        android.content.Context context = com.tencent.kinda.framework.widget.tools.KindaContext.get();
        if (!(context instanceof com.tencent.mm.ui.MMActivity)) {
            com.tencent.mars.xlog.Log.e("KindaPayCardManagerImpl", "Fail to start addPayCardImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("process_id", qs4.j.class.hashCode());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", activity.getClass().getName());
        com.tencent.mm.wallet_core.a.j(activity, qs4.j.class, bundle, null);
        com.tencent.mm.wallet_core.h g17 = com.tencent.mm.wallet_core.a.g(activity);
        if (!(g17 instanceof qs4.j)) {
            com.tencent.mars.xlog.Log.e("KindaPayCardManagerImpl", "Fail to get correct wallet process in addPayCardImpl, expect BindCardProcess got %s", g17.getClass().getName());
        } else {
            ((qs4.j) g17).f366420d = new qs4.i() { // from class: com.tencent.kinda.framework.app.KindaPayCardManagerImpl.1
                @Override // qs4.i
                public void run(int i17) {
                    if (i17 == -1) {
                        voidCallback.call();
                    } else {
                        voidCallback2.call();
                    }
                }
            };
        }
    }
}
