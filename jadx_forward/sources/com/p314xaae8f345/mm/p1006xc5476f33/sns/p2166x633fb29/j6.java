package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29;

/* loaded from: classes4.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245865d;

    public j6(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.k6 k6Var, java.lang.String str) {
        this.f245865d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.b2 D0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_clear_sns_tmp_file, true);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(fj6);
        java.lang.String str = this.f245865d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "removeDraftTmpFile clear:%s finalDraftKey:%s", valueOf, str);
        if (fj6 && (D0 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj().D0(str)) != null) {
            byte[] bArr = D0.f67847x28ff5a1c;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(bArr)) {
                android.os.Parcel obtain = android.os.Parcel.obtain();
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                try {
                    android.content.Intent intent = (android.content.Intent) android.content.Intent.CREATOR.createFromParcel(obtain);
                    java.lang.String stringExtra = intent.getStringExtra("KSightThumbPath");
                    java.lang.String stringExtra2 = intent.getStringExtra("KSightPath");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsRetryEditTipManager", "delete %s, %s", stringExtra, stringExtra2);
                    dw3.c0 c0Var = dw3.c0.f325715a;
                    c0Var.l(stringExtra2);
                    c0Var.l(stringExtra);
                } catch (java.lang.Exception unused) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Dj().J0(str, null, 0);
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.model.SnsRetryEditTipManager$2");
    }
}
