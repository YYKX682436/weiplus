package com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui;

/* loaded from: classes9.dex */
public class a0 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f260276a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 f260277b;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 viewOnClickListenerC19035xfddf7d86, java.util.List list) {
        this.f260277b = viewOnClickListenerC19035xfddf7d86;
        this.f260276a = list;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.ViewOnClickListenerC19035xfddf7d86 viewOnClickListenerC19035xfddf7d86 = this.f260277b;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = viewOnClickListenerC19035xfddf7d86.mo55332x76847179();
        java.lang.String str = viewOnClickListenerC19035xfddf7d86.f260236p;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = viewOnClickListenerC19035xfddf7d86.f260238r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.z zVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.pay.ui.z(this);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.List<com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c> list = this.f260276a;
        if ((list == null || list.size() == 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WalletDialogHelper", "hy: bankcard list is null and should not show new");
            return;
        }
        int i17 = 0;
        if (list == null || list.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletDialogHelper", "hy: no bankcard show new only");
            linkedList.add(null);
        } else {
            int i18 = 0;
            for (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c2 : list) {
                linkedList.add(c19091x9511676c2.f69233x225aa2b6);
                if (c19091x9511676c != null && c19091x9511676c.equals(c19091x9511676c2)) {
                    i17 = i18;
                }
                i18++;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(null)) {
                linkedList.add(null);
                if (c19091x9511676c == null) {
                    i17 = i18;
                }
            }
        }
        db5.e1.S(mo55332x76847179, str, linkedList, i17, null, zVar);
    }
}
