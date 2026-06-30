package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class y implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74329d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.z f74330e;

    public y(com.tencent.mm.plugin.account.ui.z zVar, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74330e = zVar;
        this.f74329d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74329d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.z zVar = this.f74330e;
        d17.q(701, zVar.f74351d);
        gm0.j1.d().q(252, zVar.f74351d);
    }
}
