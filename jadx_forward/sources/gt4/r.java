package gt4;

/* loaded from: classes9.dex */
public class r implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97 f357044d;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97 c19144x4e901f97) {
        this.f357044d = c19144x4e901f97;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19144x4e901f97 c19144x4e901f97 = this.f357044d;
        java.util.Iterator it = ((java.util.ArrayList) c19144x4e901f97.f262228d).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2) it.next()).f262233f.setImageResource(com.p314xaae8f345.mm.R.raw.f80936xc6307b2b);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19145xd4a650f2) view).f262233f.setImageResource(com.p314xaae8f345.mm.R.raw.f80939xfe2298a3);
        gt4.s sVar = c19144x4e901f97.f262229e;
        if (sVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z8 z8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.z8) sVar;
            z8Var.getClass();
            if (view.getTag() != null) {
                int intValue = ((java.lang.Integer) view.getTag()).intValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c activityC19123x554b2e1c = z8Var.f262368a;
                if (intValue == -1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do bind new card");
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19123x554b2e1c.f261635g;
                    activityC19123x554b2e1c.m83105x7498fe14().putBoolean("key_is_changing_balance_phone_num", true);
                    activityC19123x554b2e1c.m83105x7498fe14().putInt("key_pay_flag", 2);
                    com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19123x554b2e1c, activityC19123x554b2e1c.m83105x7498fe14());
                } else if (intValue == -2) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "do verify idcard tail");
                    activityC19123x554b2e1c.m83105x7498fe14().putBoolean("key_forward_to_id_verify", true);
                    com.p314xaae8f345.mm.p2802xd031a825.a.d(activityC19123x554b2e1c, activityC19123x554b2e1c.m83105x7498fe14());
                } else {
                    r45.jd jdVar = (r45.jd) ((java.util.LinkedList) activityC19123x554b2e1c.f261637e).get(intValue);
                    activityC19123x554b2e1c.m83105x7498fe14().putBoolean("key_balance_change_phone_need_confirm_phone", false);
                    activityC19123x554b2e1c.m83105x7498fe14().putBoolean("key_forward_to_id_verify", false);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletSwitchVerifyPhoneUI", "select wx phone: %s", java.lang.Boolean.valueOf(jdVar.f459243d.equals("wx")));
                    activityC19123x554b2e1c.m83106x57340563().d(jdVar);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/view/SwitchPhoneItemGroupView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
