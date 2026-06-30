package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class f5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae f259706d;

    public f5(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae) {
        this.f259706d = activityC19019x2a980aae;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.ActivityC19019x2a980aae activityC19019x2a980aae = this.f259706d;
        if (activityC19019x2a980aae.f259584s != 8) {
            activityC19019x2a980aae.finish();
        } else if (activityC19019x2a980aae.getIntent().getIntExtra("is_from_kinda_balance", 0) != 0) {
            activityC19019x2a980aae.setResult(-1);
            activityC19019x2a980aae.finish();
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.addFlags(67108864);
            j45.l.j(activityC19019x2a980aae.mo55332x76847179(), "mall", ".ui.MallWalletUI", intent, null);
        }
        if (activityC19019x2a980aae.f259584s == 14) {
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            m27539xaf65a0fc.mo27566xe4673800("notifyType", "refreshByLQT");
            ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtSaveFetchFinishUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
