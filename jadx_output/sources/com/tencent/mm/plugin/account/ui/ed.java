package com.tencent.mm.plugin.account.ui;

/* loaded from: classes.dex */
public class ed implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.z0 f73824d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.qd f73825e;

    public ed(com.tencent.mm.plugin.account.ui.qd qdVar, com.tencent.mm.modelsimple.z0 z0Var) {
        this.f73825e = qdVar;
        this.f73824d = z0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73824d);
        gm0.j1.d().q(126, this.f73825e);
    }
}
