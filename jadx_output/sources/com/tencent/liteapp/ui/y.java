package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.h0 f46241d;

    public y(com.tencent.liteapp.ui.h0 h0Var) {
        this.f46241d = h0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        kx5.n h17 = kx5.n.h();
        com.tencent.liteapp.ui.h0 h0Var = this.f46241d;
        int i17 = h0Var.f46166e.f46080m;
        boolean z17 = h0Var.f46163b;
        int i18 = h0Var.f46162a;
        h0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z17));
        hashMap.put("height", java.lang.Integer.valueOf(i18));
        h17.j(i17, "notifyKeyboardChanged", hashMap);
    }
}
