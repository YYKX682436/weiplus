package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class vc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.ad f74274e;

    public vc(com.tencent.mm.plugin.account.ui.ad adVar, com.tencent.mm.modelbase.m1 m1Var) {
        this.f74274e = adVar;
        this.f74273d = m1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74273d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.ad adVar = this.f74274e;
        d17.q(145, adVar);
        gm0.j1.d().q(132, adVar);
    }
}
