package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes9.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f261915d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 f261916e;

    public k9(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c) {
        this.f261916e = activityC19125x69c29dd3;
        this.f261915d = c19091x9511676c;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19125x69c29dd3 activityC19125x69c29dd3 = this.f261916e;
        com.p314xaae8f345.mm.p2802xd031a825.h m83108x2b5a5a39 = activityC19125x69c29dd3.m83108x2b5a5a39();
        if (activityC19125x69c29dd3.f261656t && m83108x2b5a5a39 != null && "PayProcess".equals(m83108x2b5a5a39.e())) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c c19091x9511676c = this.f261915d;
            int i17 = c19091x9511676c != null ? c19091x9511676c.v0() ? 1 : c19091x9511676c.D0() ? 3 : 2 : 0;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(activityC19125x69c29dd3.mo55332x76847179());
            i0Var.g(com.p314xaae8f345.mm.R.C30867xcad56011.l0l);
            java.lang.String string = activityC19125x69c29dd3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l0k, activityC19125x69c29dd3.V6());
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar = i0Var.f293354b;
            aVar.f293262s = string;
            aVar.A = true;
            i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.l0j);
            i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.l0i);
            aVar.E = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.g9(this, i17);
            aVar.F = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.h9(this, i17);
            i0Var.h();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15443, 1);
            activityC19125x69c29dd3.f261656t = false;
        } else {
            activityC19125x69c29dd3.W6();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet_core/ui/WalletVerifyCodeUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
