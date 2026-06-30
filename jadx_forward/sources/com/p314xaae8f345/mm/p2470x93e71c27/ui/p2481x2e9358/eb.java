package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes15.dex */
public class eb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib f271835d;

    public eb(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar) {
        this.f271835d = ibVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = this.f271835d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(ibVar.getContext());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.cb cbVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.cb(this, u1Var);
        u1Var.u(ibVar.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.k97));
        u1Var.t(ibVar.S, cbVar, ibVar.R);
        u1Var.a(true);
        u1Var.i(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.db(this));
        u1Var.q(false);
        ibVar.l(3);
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/VoiceInputPanel$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
