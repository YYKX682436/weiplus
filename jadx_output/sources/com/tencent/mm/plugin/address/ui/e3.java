package com.tencent.mm.plugin.address.ui;

/* loaded from: classes12.dex */
public class e3 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletSelectAddrUI f74542d;

    public e3(com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI) {
        this.f74542d = walletSelectAddrUI;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.address.ui.WalletSelectAddrUI walletSelectAddrUI = this.f74542d;
        int headerViewsCount = i17 - walletSelectAddrUI.f74493i.getHeaderViewsCount();
        if (headerViewsCount >= ((java.util.LinkedList) walletSelectAddrUI.f74488d).size()) {
            return true;
        }
        rl5.r rVar = new rl5.r(walletSelectAddrUI.getContext(), view);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.address.ui.u2(walletSelectAddrUI);
        rVar.f397354x = new com.tencent.mm.plugin.address.ui.x2(walletSelectAddrUI, headerViewsCount);
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i18 = iArr[0];
        rVar.n((i18 + view.getWidth()) / 2, iArr[1]);
        return true;
    }
}
