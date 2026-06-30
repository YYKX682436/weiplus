package com.tencent.mm.plugin.account.ui;

/* loaded from: classes9.dex */
public class wc implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelsimple.v0 f74297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.xc f74298e;

    public wc(com.tencent.mm.plugin.account.ui.xc xcVar, com.tencent.mm.modelsimple.v0 v0Var) {
        this.f74298e = xcVar;
        this.f74297d = v0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        gm0.j1.d().d(this.f74297d);
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        com.tencent.mm.plugin.account.ui.xc xcVar = this.f74298e;
        d17.q(701, xcVar.f74321d);
        gm0.j1.d().q(252, xcVar.f74321d);
    }
}
