package zw1;

/* loaded from: classes9.dex */
public final class q2 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public final void O6(ww1.a3 a3Var, ww1.b3 b3Var) {
        boolean z17;
        android.widget.RelativeLayout relativeLayout;
        if (b3Var == null) {
            ot5.g.a("MicroMsg.WalletCollectQrCodeGiftEntranceUIC", "[setGiftEntranceBtnStyle] collectViewModel is null");
            return;
        }
        if (a3Var == null) {
            ot5.g.a("MicroMsg.WalletCollectQrCodeGiftEntranceUIC", "[setGiftEntranceBtnStyle] collectDataModel is null");
            android.widget.RelativeLayout relativeLayout2 = b3Var.f531686y;
            if (relativeLayout2 == null) {
                return;
            }
            relativeLayout2.setVisibility(8);
            return;
        }
        if (a3Var.H == null) {
            ot5.g.a("MicroMsg.WalletCollectQrCodeGiftEntranceUIC", "[shouldEnableCollectGiftEntrance] collectDataModel.gift_guide_info is null");
            z17 = false;
        } else {
            ot5.g.c("MicroMsg.WalletCollectQrCodeGiftEntranceUIC", "[shouldEnableCollectGiftEntrance] gift_guide_entrance is " + a3Var.F);
            z17 = a3Var.F;
        }
        if (!z17) {
            ot5.g.c("MicroMsg.WalletCollectQrCodeGiftEntranceUIC", "[setGiftEntranceBtnStyle] shouldEnableCollectGiftEntrance return false");
            android.widget.RelativeLayout relativeLayout3 = b3Var.f531686y;
            if (relativeLayout3 == null) {
                return;
            }
            relativeLayout3.setVisibility(8);
            return;
        }
        android.widget.RelativeLayout relativeLayout4 = b3Var.f531686y;
        if (relativeLayout4 != null) {
            relativeLayout4.setVisibility(0);
        }
        r45.lt3 lt3Var = a3Var.H;
        if ((lt3Var != null ? lt3Var.f461346d : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.g(b3Var.f531687z, lt3Var.f461346d, -1, 0, 0, true, 1.0f);
        }
        r45.lt3 lt3Var2 = a3Var.H;
        if ((lt3Var2 != null ? lt3Var2.f461347e : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.j(b3Var.A, lt3Var2.f461347e);
        }
        r45.lt3 lt3Var3 = a3Var.H;
        if ((lt3Var3 != null ? lt3Var3.f461348f : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.z1.g(b3Var.B, lt3Var3.f461348f, -1, 0, 0, true, 1.0f);
        }
        r45.lt3 lt3Var4 = a3Var.H;
        if ((lt3Var4 != null ? lt3Var4.f461349g : null) == null || (relativeLayout = b3Var.f531686y) == null) {
            return;
        }
        relativeLayout.setOnClickListener(new zw1.p2(this, a3Var, b3Var));
    }
}
