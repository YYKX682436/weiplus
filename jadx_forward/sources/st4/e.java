package st4;

/* loaded from: classes9.dex */
public class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a f494147d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a activityC19181xc87129a) {
        this.f494147d = activityC19181xc87129a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.ui.ActivityC19181xc87129a activityC19181xc87129a = this.f494147d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87 c19178xda56ba87 = (com.p314xaae8f345.mm.p1006xc5476f33.p2378xd0375d53.p2380x2e243d.p2381x633fb29.C19178xda56ba87) activityC19181xc87129a.f262775p.get(activityC19181xc87129a.f262766d.m83183xfb85ada3());
        if (c19178xda56ba87 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletPayUCardElementUI", "hy: should not be NULL!!!");
            yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        activityC19181xc87129a.f262766d.m83195x853d357d(50);
        activityC19181xc87129a.m83105x7498fe14().putParcelable("key_card_element", c19178xda56ba87);
        activityC19181xc87129a.m83105x7498fe14().putString("key_card_id", activityC19181xc87129a.f262766d.m83183xfb85ada3());
        activityC19181xc87129a.m83105x7498fe14().putString("key_cvv", activityC19181xc87129a.f262768f.m83183xfb85ada3());
        activityC19181xc87129a.m83105x7498fe14().putString("key_expire_data", activityC19181xc87129a.f262767e.m83183xfb85ada3());
        activityC19181xc87129a.m83106x57340563().d(new java.lang.Object[0]);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_payu/bind/ui/WalletPayUCardElementUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
