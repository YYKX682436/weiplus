package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class k0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72703d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.n0 f72704e;

    public k0(com.tencent.mm.plugin.aa.ui.n0 n0Var, r45.a aVar) {
        this.f72704e = n0Var;
        this.f72703d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f72704e.f72743a.getContext(), this.f72703d.f369571h, false);
    }
}
