package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class m4 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.a f72735d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.n4 f72736e;

    public m4(com.tencent.mm.plugin.aa.ui.n4 n4Var, r45.a aVar) {
        this.f72736e = n4Var;
        this.f72735d = aVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.wallet_core.ui.r1.V(this.f72736e.f72747b.getContext(), this.f72735d.f369571h, false);
    }
}
