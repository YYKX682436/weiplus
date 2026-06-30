package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes5.dex */
public class pe implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qe f155647d;

    public pe(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qe qeVar) {
        this.f155647d = qeVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.qe qeVar = this.f155647d;
        android.view.View findViewById = qeVar.f155678e.findViewById(com.p314xaae8f345.mm.R.id.mnr);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/account/ui/RegAffiliateAccountUI$8$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.ImageView) qeVar.f155678e.findViewById(com.p314xaae8f345.mm.R.id.mnp)).setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c(qeVar.f155677d));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = qeVar.f155678e.f155088n;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        qeVar.f155678e.f155088n.dismiss();
    }
}
