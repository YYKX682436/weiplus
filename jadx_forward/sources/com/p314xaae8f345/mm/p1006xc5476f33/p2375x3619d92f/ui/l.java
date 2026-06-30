package com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui;

/* loaded from: classes9.dex */
public class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a f262583d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a activityC19163x451b3a3a) {
        this.f262583d = activityC19163x451b3a3a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a.f262560o;
        com.p314xaae8f345.mm.p1006xc5476f33.p2375x3619d92f.ui.ActivityC19163x451b3a3a activityC19163x451b3a3a = this.f262583d;
        activityC19163x451b3a3a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletECardLogoutUI", "do logout");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_show_detail", false);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c();
        c19091x9511676c.f69225xed6d60f6 = activityC19163x451b3a3a.f262567m;
        c19091x9511676c.f69223x58802fcb = activityC19163x451b3a3a.f262568n;
        bundle.putParcelable("key_bankcard", c19091x9511676c);
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 2);
        bundle.putString("key_check_pwd_title", activityC19163x451b3a3a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kk6));
        com.p314xaae8f345.mm.p2802xd031a825.a.j(activityC19163x451b3a3a, sr4.b.class, bundle, null);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_ecard/ui/WalletECardLogoutUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
