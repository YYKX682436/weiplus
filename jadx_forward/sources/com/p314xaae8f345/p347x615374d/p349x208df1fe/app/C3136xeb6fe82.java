package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaPayCardManagerImpl */
/* loaded from: classes9.dex */
public class C3136xeb6fe82 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3569x1e69942 {
    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3569x1e69942
    /* renamed from: addPayCardImpl */
    public void mo25217xf09866b7(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192) {
        android.content.Context context = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get();
        if (!(context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPayCardManagerImpl", "Fail to start addPayCardImpl due to incompatible context(%s)", context.getClass().getName());
            return;
        }
        android.app.Activity activity = (android.app.Activity) context;
        activity.getIntent().putExtra("process_id", qs4.j.class.hashCode());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("key_bind_scene", 0);
        bundle.putBoolean("is_from_new_cashier", true);
        bundle.putString("start_activity_class", activity.getClass().getName());
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activity, qs4.j.class, bundle, null);
        com.p314xaae8f345.mm.p2802xd031a825.h g17 = com.p314xaae8f345.mm.p2802xd031a825.a.g(activity);
        if (!(g17 instanceof qs4.j)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KindaPayCardManagerImpl", "Fail to get correct wallet process in addPayCardImpl, expect BindCardProcess got %s", g17.getClass().getName());
        } else {
            ((qs4.j) g17).f447953d = new qs4.i() { // from class: com.tencent.kinda.framework.app.KindaPayCardManagerImpl.1
                @Override // qs4.i
                public void run(int i17) {
                    if (i17 == -1) {
                        abstractC3623x3b485619.mo25801x2e7a5e();
                    } else {
                        abstractC3623x3b4856192.mo25801x2e7a5e();
                    }
                }
            };
        }
    }
}
