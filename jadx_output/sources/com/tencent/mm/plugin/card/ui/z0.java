package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.a1 f95463d;

    public z0(com.tencent.mm.plugin.card.ui.a1 a1Var) {
        this.f95463d = a1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.a1 a1Var = this.f95463d;
        a1Var.f94927a.finish();
        a1Var.f94927a.overridePendingTransition(0, 0);
    }
}
