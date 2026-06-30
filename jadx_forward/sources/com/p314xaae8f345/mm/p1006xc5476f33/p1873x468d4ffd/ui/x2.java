package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class x2 implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z2 f230977d;

    public x2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.z2 z2Var) {
        this.f230977d = z2Var;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "SightCaptureUI_edit_finish_save_new_thumb";
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230977d.f230987a;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d.N1;
        activityC16554x70dcab5d.getClass();
        try {
            android.graphics.Bitmap p17 = ai3.d.p(activityC16554x70dcab5d.f230768m.mo127744x5000ed37());
            if (p17 == null || activityC16554x70dcab5d.f230765h == null || java.lang.Math.min(p17.getWidth(), p17.getHeight()) <= activityC16554x70dcab5d.f230765h.f152737t) {
                return;
            }
            int width = p17.getWidth();
            int height = p17.getHeight();
            com.p314xaae8f345.mm.p948xcd333a14.C11120x15dce88d c11120x15dce88d = activityC16554x70dcab5d.f230765h;
            int i19 = c11120x15dce88d.f152737t;
            if (i19 <= 0) {
                i19 = c11120x15dce88d.f152724d;
            }
            if (width < height) {
                i17 = (int) (height / ((width * 1.0f) / i19));
            } else {
                int i27 = i19;
                i19 = (int) (width / ((height * 1.0f) / i19));
                i17 = i27;
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(android.graphics.Bitmap.createScaledBitmap(p17, i19, i17, true), 60, android.graphics.Bitmap.CompressFormat.JPEG, activityC16554x70dcab5d.f230768m.b(), true);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SightCaptureUI", e17, "saveNewThumbAfterEdit error: %s", e17.getMessage());
        }
    }
}
