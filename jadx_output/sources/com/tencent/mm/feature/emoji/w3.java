package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class w3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66521d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vd0 f66522e;

    public w3(android.content.Context context, int i17, int i18, r45.vd0 vd0Var) {
        this.f66521d = context;
        this.f66522e = vd0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f66521d;
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(context, 1, false);
        k0Var.f211872n = new com.tencent.mm.feature.emoji.u3(1001, 1000);
        k0Var.f211881s = new com.tencent.mm.feature.emoji.v3(1001, this.f66522e, context, 1000);
        k0Var.v();
    }
}
