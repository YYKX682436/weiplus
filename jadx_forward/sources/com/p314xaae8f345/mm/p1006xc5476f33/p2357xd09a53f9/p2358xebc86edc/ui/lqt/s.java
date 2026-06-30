package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt;

/* loaded from: classes9.dex */
public class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19008x5975ff64 f259894d;

    public s(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19008x5975ff64 c19008x5975ff64) {
        this.f259894d = c19008x5975ff64;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.C19008x5975ff64 c19008x5975ff64 = this.f259894d;
        java.util.Iterator it = ((java.util.ArrayList) c19008x5975ff64.f259460e).iterator();
        while (it.hasNext()) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
            if (weakReference.get() != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) weakReference.get()).f259920c.isEnabled()) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) weakReference.get()).f259920c.setChecked(false);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u uVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2358xebc86edc.ui.lqt.u) view.getTag();
        java.util.List list = c19008x5975ff64.f259459d;
        if (list == null || ((java.util.ArrayList) list).size() <= uVar.f259922e) {
            c19008x5975ff64.f259461f = null;
        } else {
            uVar.f259920c.setChecked(true);
            c19008x5975ff64.f259461f = (r45.bn5) ((java.util.ArrayList) c19008x5975ff64.f259459d).get(uVar.f259922e);
        }
        c19008x5975ff64.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLqtArriveTimeLayout", "click item: %s, %s", java.lang.Integer.valueOf(uVar.f259922e), uVar.f259918a.getText());
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/balance/ui/lqt/WalletLqtArriveTimeLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
