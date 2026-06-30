package com.tencent.mm.plugin.address.ui;

/* loaded from: classes15.dex */
public final class x1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74642d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        super(1);
        this.f74642d = walletAddAddressUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.address.model.RcptItem item = (com.tencent.mm.plugin.address.model.RcptItem) obj;
        kotlin.jvm.internal.o.g(item, "item");
        java.lang.String g07 = kz5.n0.g0(kz5.i0.H(q26.h0.y(q26.h0.o(q26.y.d(item, com.tencent.mm.plugin.address.ui.v1.f74634d), com.tencent.mm.plugin.address.ui.w1.f74638d))), " ", null, null, 0, null, null, 62, null);
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74642d;
        com.tencent.mm.plugin.address.ui.AddrItemView addrItemView = walletAddAddressUI.f74480y;
        if (addrItemView == null) {
            kotlin.jvm.internal.o.o("addrRegion");
            throw null;
        }
        addrItemView.setText(g07);
        java.lang.String str = item.f74372e;
        if (str == null) {
            str = "";
        }
        walletAddAddressUI.C = str;
        com.tencent.mm.plugin.address.ui.l1 l1Var = walletAddAddressUI.f74464f;
        if (l1Var != null) {
            kotlin.jvm.internal.o.d(l1Var);
            l1Var.dismiss();
            walletAddAddressUI.f74464f = null;
        }
        return jz5.f0.f302826a;
    }
}
