package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class i2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 f261860d;

    public i2(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7) {
        this.f261860d = activityC19108xd69d11c7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19108xd69d11c7 activityC19108xd69d11c7 = this.f261860d;
        arrayList2.add(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kl8));
        arrayList2.add(activityC19108xd69d11c7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kki));
        java.util.List list = activityC19108xd69d11c7.V1;
        if (((java.util.ArrayList) list).size() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c c19097xe6dc5b4c = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19097xe6dc5b4c) ((java.util.ArrayList) list).get(0);
            if (c19097xe6dc5b4c.b()) {
                arrayList2.remove(1);
            } else {
                if (2 == c19097xe6dc5b4c.f261191r) {
                    arrayList2.remove(0);
                }
            }
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activityC19108xd69d11c7.mo55332x76847179(), arrayList2);
        c0Var.i(activityC19108xd69d11c7.W1);
        c0Var.f293792t = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h2(this, c0Var);
        c0Var.l();
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletCardElementUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
