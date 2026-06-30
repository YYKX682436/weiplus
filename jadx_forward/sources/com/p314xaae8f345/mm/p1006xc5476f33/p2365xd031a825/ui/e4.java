package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class e4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f261780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 f261781e;

    public e4(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986, java.lang.String str) {
        this.f261781e = activityC19113xc67f5986;
        this.f261780d = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19113xc67f5986 activityC19113xc67f5986 = this.f261781e;
        java.lang.String m121683x7d902dbb = activityC19113xc67f5986.f261533e.m121683x7d902dbb();
        if (m121683x7d902dbb == null || !m121683x7d902dbb.equals(this.f261780d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11353, 0, 2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11353, 0, 1);
        }
        activityC19113xc67f5986.getClass();
        com.p3249xcbb51f6b.p3252x9137034c.C28007xd683f79f.m121681x764fefd8(java.lang.Long.toString(c01.id.a() / 1000));
        int i17 = activityC19113xc67f5986.m83105x7498fe14().getInt("entry_scene", -1);
        int i18 = activityC19113xc67f5986.m83105x7498fe14().getInt("real_name_verify_mode") == 4 ? 1 : 0;
        java.lang.String string = activityC19113xc67f5986.m83105x7498fe14().getString("kreq_token");
        if (string == null || string.isEmpty()) {
            activityC19113xc67f5986.m83098x5406100e(new ss4.z(3, activityC19113xc67f5986.m83107xcc3330f3(), activityC19113xc67f5986.f261533e.m121684x15a9108d(false), (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19113xc67f5986.m83105x7498fe14().getParcelable("key_pay_info"), null, -1, i17, i18));
        } else {
            int i19 = activityC19113xc67f5986.m83105x7498fe14().getInt("key_bind_scene");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletConfirmCardIDUI", "doNext has token, bind_scene:" + i19);
            activityC19113xc67f5986.m83098x5406100e(new ss4.z(activityC19113xc67f5986.m83107xcc3330f3(), activityC19113xc67f5986.f261533e.m121684x15a9108d(false), (com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56) activityC19113xc67f5986.m83105x7498fe14().getParcelable("key_pay_info"), string, i19, i17, i18));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletConfirmCardIDUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
