package com.tencent.mm.plugin.address.ui;

/* loaded from: classes.dex */
public final class y1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.address.ui.WalletAddAddressUI f74649d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI) {
        super(1);
        this.f74649d = walletAddAddressUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.address.ui.WalletAddAddressUI walletAddAddressUI = this.f74649d;
        if (booleanValue) {
            android.widget.LinearLayout linearLayout = walletAddAddressUI.f74471p;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("addrCaptureMapLL");
                throw null;
            }
            linearLayout.performClick();
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("map_select_street", "view_clk", walletAddAddressUI.f74467i, 33328);
        } else {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("map_select_street", "view_exp", walletAddAddressUI.f74467i, 33328);
        }
        return jz5.f0.f302826a;
    }
}
