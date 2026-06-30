package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes11.dex */
public final class r7 implements w82.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101376a;

    public r7(com.tencent.mm.plugin.fav.ui.z7 z7Var) {
        this.f101376a = z7Var;
    }

    public void a(int i17, boolean z17) {
        com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101376a;
        z7Var.f101664j.getLayoutParams().height = (i65.a.f(z7Var.f101655a, com.tencent.mm.R.dimen.f479738dv) * 2) + i17;
        z7Var.f101663i.getLayoutParams().height = i17 + (i65.a.f(z7Var.f101655a, com.tencent.mm.R.dimen.f479646bl) * 2) + (i65.a.f(z7Var.f101655a, com.tencent.mm.R.dimen.f479738dv) * 2);
        z7Var.f101663i.requestLayout();
        z7Var.f101664j.post(new com.tencent.mm.plugin.fav.ui.q7(z7Var));
    }
}
