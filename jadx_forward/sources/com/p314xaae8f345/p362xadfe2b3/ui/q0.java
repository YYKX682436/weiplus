package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.a1 f127747d;

    public q0(com.p314xaae8f345.p362xadfe2b3.ui.a1 a1Var) {
        this.f127747d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n h17 = kx5.n.h();
        com.p314xaae8f345.p362xadfe2b3.ui.a1 a1Var = this.f127747d;
        int i17 = a1Var.f127665e.f127570o;
        boolean z17 = a1Var.f127662b;
        int i18 = a1Var.f127661a;
        a1Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        h17.j(i17, "notifyKeyboardChanged", hashMap);
    }
}
