package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class r4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72787d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.s4 f72788e;

    public r4(com.tencent.mm.plugin.aa.ui.s4 s4Var, r45.a aVar) {
        this.f72788e = s4Var;
        this.f72787d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f72788e.f72800b.getContext(), this.f72787d.f369571h, false);
    }
}
