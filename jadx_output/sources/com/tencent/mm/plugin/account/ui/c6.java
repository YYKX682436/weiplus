package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class c6 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h11.e f73767d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.d6 f73768e;

    public c6(com.tencent.mm.plugin.account.ui.d6 d6Var, h11.e eVar) {
        this.f73768e = d6Var;
        this.f73767d = eVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f73767d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.d6 d6Var = this.f73768e;
        d17.q(701, d6Var.f73797d.f73843d);
        gm0.j1.d().q(252, d6Var.f73797d.f73843d);
    }
}
