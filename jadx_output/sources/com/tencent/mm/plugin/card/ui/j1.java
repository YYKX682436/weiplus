package com.tencent.mm.plugin.card.ui;

/* loaded from: classes15.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.l1 f95032d;

    public j1(com.tencent.mm.plugin.card.ui.l1 l1Var) {
        this.f95032d = l1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.card.ui.l1 l1Var = this.f95032d;
        if (l1Var.f95063d.Z.getVisibility() != 0) {
            l1Var.f95063d.Z.setVisibility(0);
        }
    }
}
