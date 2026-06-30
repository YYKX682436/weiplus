package com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui;

/* loaded from: classes14.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.e f256855d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.e eVar) {
        this.f256855d = eVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.e eVar = this.f256855d;
        eVar.f256857d.f256819e.setEnabled(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = eVar.f256857d.f256825n;
        if (u3Var != null && u3Var.isShowing()) {
            eVar.f256857d.f256825n.dismiss();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2312x3befc424.ui.ViewOnClickListenerC18768x401c3b80 viewOnClickListenerC18768x401c3b80 = eVar.f256857d;
        viewOnClickListenerC18768x401c3b80.f256818d = 6;
        viewOnClickListenerC18768x401c3b80.T6();
    }
}
