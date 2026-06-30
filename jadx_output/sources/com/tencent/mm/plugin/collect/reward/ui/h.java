package com.tencent.mm.plugin.collect.reward.ui;

/* loaded from: classes9.dex */
public class h implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.collect.reward.ui.i f96301d;

    public h(com.tencent.mm.plugin.collect.reward.ui.i iVar) {
        this.f96301d = iVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        boolean z17;
        com.tencent.mm.plugin.collect.reward.ui.i iVar = this.f96301d;
        z17 = ((com.tencent.mm.wallet_core.ui.WalletBaseUI) iVar.f96305b).mKindaEnable;
        if (z17) {
            iVar.f96305b.hideLoading();
        }
    }
}
