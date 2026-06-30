package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.q f288606d;

    public p(com.p314xaae8f345.mm.ui.p2690x38b72420.q qVar) {
        this.f288606d = qVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2690x38b72420.q qVar = this.f288606d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = qVar.f288657d;
        addressUIFragment.f287840o.setAdapter((android.widget.ListAdapter) addressUIFragment.f287842q);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AddressUI", "post to first init finish");
        android.view.View mo26077x4ff8c0f0 = qVar.f288657d.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.imk);
        if (mo26077x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo26077x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo26077x4ff8c0f0, "com/tencent/mm/ui/contact/AddressUI$AddressUIFragment$21$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.startAnimation(android.view.animation.AnimationUtils.loadAnimation(qVar.f288657d.mo7438x76847179(), com.p314xaae8f345.mm.R.C30854x2dc211.f559317bd));
            qVar.f288657d.N.a();
        }
    }
}
