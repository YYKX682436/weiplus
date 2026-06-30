package zw1;

/* loaded from: classes8.dex */
public class s3 implements com.p314xaae8f345.mm.p2802xd031a825.ui.z {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f558323a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f558324b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558325c;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17, ww1.a3 a3Var) {
        this.f558325c = activityC13149x63b02cb3;
        this.f558323a = i17;
        this.f558324b = a3Var;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z
    /* renamed from: onClick */
    public void mo48650xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUI", "click set money tv");
        ww1.a3 a3Var = this.f558324b;
        int i17 = this.f558323a;
        if (i17 == 1) {
            if (view == null || a3Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WalletCollectQrCode", "handlePersonalCodeClick: 参数为空 view=" + view + ", dataModel=" + a3Var);
            } else {
                android.content.Context context = view.getContext();
                activityC13149x63b02cb3 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3) context : null;
                if (activityC13149x63b02cb3 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "Invalid context type, expected WalletCollectQrCodeUI");
                } else {
                    r45.hk5 hk5Var = a3Var.f531626c0;
                    boolean z17 = hk5Var != null ? hk5Var.f457780d : false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "checkIfNeedShowSheetForPersonal: " + z17);
                    if (z17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "showReceiptSettingSheetForPersonal");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13149x63b02cb3, 1, false);
                        k0Var.f293405n = new zw1.m6(activityC13149x63b02cb3, a3Var, i17);
                        k0Var.v();
                        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
                    } else {
                        activityC13149x63b02cb3.M7(a3Var, i17);
                    }
                }
            }
        } else if (view == null || a3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WalletCollectQrCode", "handlePersonalCodeClick:  view=" + view + ", dataModel=" + a3Var);
        } else {
            android.content.Context context2 = view.getContext();
            activityC13149x63b02cb3 = context2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3) context2 : null;
            if (activityC13149x63b02cb3 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletCollectQrCodeUIHelp", "Invalid context type, expected WalletCollectQrCodeUI");
            } else {
                r45.fk5 fk5Var = a3Var.f531624b0;
                boolean z18 = fk5Var != null ? fk5Var.f455945d : false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "checkIfNeedShowSheet: " + z18);
                if (z18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletCollectQrCodeUIHelp", "showReceiptSettingSheet");
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) activityC13149x63b02cb3, 1, false);
                    k0Var2.f293405n = new zw1.i6(activityC13149x63b02cb3, a3Var);
                    k0Var2.f293414s = new zw1.j6(activityC13149x63b02cb3, a3Var, i17);
                    k0Var2.v();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 22, java.lang.Integer.valueOf(i17));
                } else {
                    activityC13149x63b02cb3.M7(a3Var, i17);
                }
            }
        }
        this.f558325c.N = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 3, java.lang.Integer.valueOf(i17));
    }
}
