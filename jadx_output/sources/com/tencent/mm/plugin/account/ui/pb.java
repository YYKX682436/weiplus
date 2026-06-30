package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class pb implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.sa f74112d;

    public pb(com.tencent.mm.plugin.account.ui.sa saVar) {
        this.f74112d = saVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.sa saVar = this.f74112d;
        com.tencent.mm.plugin.account.ui.MobileInputUI mobileInputUI = saVar.f74188d;
        com.tencent.mm.plugin.account.ui.l3 l3Var = new com.tencent.mm.plugin.account.ui.l3(saVar.f74191g);
        l3Var.f73998b = saVar.f74188d.N;
        com.tencent.mm.plugin.account.ui.q3.c(mobileInputUI, l3Var);
    }
}
