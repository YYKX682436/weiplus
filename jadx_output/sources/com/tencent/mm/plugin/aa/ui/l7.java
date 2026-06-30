package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class l7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.m7 f72728e;

    public l7(com.tencent.mm.plugin.aa.ui.m7 m7Var, r45.a aVar) {
        this.f72728e = m7Var;
        this.f72727d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.PaylistAAUI", "click getPayListDetail onInterrupt Item");
        com.tencent.mm.wallet_core.ui.r1.V(this.f72728e.f72741a.getContext(), this.f72727d.f369571h, false);
    }
}
