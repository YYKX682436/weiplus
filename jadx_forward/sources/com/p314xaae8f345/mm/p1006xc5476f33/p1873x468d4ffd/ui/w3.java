package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes5.dex */
public class w3 implements qk.p7 {
    public w3(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16555xc2a48267 activityC16555xc2a48267) {
    }

    @Override // qk.p7
    public void a(android.graphics.Bitmap bitmap, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TestVideoEditUI", "[onSuccess] w:%s h:%s", java.lang.Integer.valueOf(bitmap.getWidth()), java.lang.Integer.valueOf(bitmap.getHeight()));
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.PNG, lp0.b.l() + java.lang.String.format("%s%d.%s", "wx_photo_edit_", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), "png"), true);
        } catch (java.io.IOException unused) {
        }
    }

    @Override // qk.p7
    /* renamed from: onError */
    public void mo9160xaf8aa769(java.lang.Exception exc) {
    }
}
