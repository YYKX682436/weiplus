package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.b1 f72562d;

    public a1(com.tencent.mm.plugin.aa.ui.b1 b1Var) {
        this.f72562d = b1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.aa.ui.b1 b1Var = this.f72562d;
        b1Var.f72576d.hideVKB();
        b1Var.f72576d.showNormalStWcKb();
    }
}
