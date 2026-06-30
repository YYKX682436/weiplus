package com.tencent.mm.plugin.card.ui;

/* loaded from: classes12.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.a2 f95464d;

    public z1(com.tencent.mm.plugin.card.ui.a2 a2Var) {
        this.f95464d = a2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.a2 a2Var = this.f95464d;
        a2Var.f94928a.finish();
        a2Var.f94928a.overridePendingTransition(0, 0);
    }
}
