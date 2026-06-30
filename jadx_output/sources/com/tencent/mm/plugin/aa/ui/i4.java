package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class i4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.j4 f72684e;

    public i4(com.tencent.mm.plugin.aa.ui.j4 j4Var, r45.a aVar) {
        this.f72684e = j4Var;
        this.f72683d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f72684e.f72698b.getContext(), this.f72683d.f369571h, false);
    }
}
