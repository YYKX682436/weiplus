package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class s5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74183d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.t5 f74184e;

    public s5(com.tencent.mm.plugin.account.ui.t5 t5Var, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74184e = t5Var;
        this.f74183d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74183d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.t5 t5Var = this.f74184e;
        d17.q(701, t5Var.f74211d);
        gm0.j1.d().q(252, t5Var.f74211d);
    }
}
