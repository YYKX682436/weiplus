package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.a1 f46214d;

    public q0(com.tencent.liteapp.ui.a1 a1Var) {
        this.f46214d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n h17 = kx5.n.h();
        com.tencent.liteapp.ui.a1 a1Var = this.f46214d;
        int i17 = a1Var.f46132e.f46037o;
        boolean z17 = a1Var.f46129b;
        int i18 = a1Var.f46128a;
        a1Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        h17.j(i17, "notifyKeyboardChanged", hashMap);
    }
}
