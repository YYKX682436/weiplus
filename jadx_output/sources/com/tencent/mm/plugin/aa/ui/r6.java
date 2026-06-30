package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.v f72790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.s6 f72791e;

    public r6(com.tencent.mm.plugin.aa.ui.s6 s6Var, r45.v vVar) {
        this.f72791e = s6Var;
        this.f72790d = vVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.aa.ui.s6 s6Var = this.f72791e;
        com.tencent.mm.plugin.aa.ui.PaylistAAUI.h7(s6Var.f72802a, this.f72790d);
        com.tencent.mm.plugin.aa.ui.PaylistAAUI paylistAAUI = s6Var.f72802a;
        paylistAAUI.f72548m = com.tencent.mm.wallet_core.ui.b2.i(paylistAAUI, false, false, null);
    }
}
