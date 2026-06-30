package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.h0 f127774d;

    public y(com.p314xaae8f345.p362xadfe2b3.ui.h0 h0Var) {
        this.f127774d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n h17 = kx5.n.h();
        com.p314xaae8f345.p362xadfe2b3.ui.h0 h0Var = this.f127774d;
        int i17 = h0Var.f127699e.f127613m;
        boolean z17 = h0Var.f127696b;
        int i18 = h0Var.f127695a;
        h0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        h17.j(i17, "notifyKeyboardChanged", hashMap);
    }
}
