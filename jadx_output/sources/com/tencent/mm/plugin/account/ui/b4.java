package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class b4 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f73740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.c4 f73741e;

    public b4(com.tencent.mm.plugin.account.ui.c4 c4Var, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f73741e = c4Var;
        this.f73740d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73740d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.c4 c4Var = this.f73741e;
        d17.q(701, c4Var.f73766d);
        gm0.j1.d().q(252, c4Var.f73766d);
    }
}
