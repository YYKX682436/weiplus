package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class p6 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.q6 f72771e;

    public p6(com.tencent.mm.plugin.aa.ui.q6 q6Var, r45.a aVar) {
        this.f72771e = q6Var;
        this.f72770d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click aaPay onInterrupt AAAlertItem");
        com.tencent.mm.wallet_core.ui.r1.V(this.f72771e.f72779a.getContext(), this.f72770d.f369571h, false);
    }
}
