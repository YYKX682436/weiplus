package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e04.n3 f241116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 f241117e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3, e04.n3 n3Var) {
        this.f241117e = activityC17301x38c077a3;
        this.f241116d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3.S;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.ActivityC17301x38c077a3 activityC17301x38c077a3 = this.f241117e;
        e04.n3 n3Var = this.f241116d;
        activityC17301x38c077a3.b7(n3Var);
        activityC17301x38c077a3.getClass();
        if (n3Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.f69643x7b28c57e)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "product == null || Util.isNullOrNil(product.field_thumburl)");
            return;
        }
        try {
            activityC17301x38c077a3.f240845g.setBackgroundColor(android.graphics.Color.parseColor(n3Var.f69635x2f110f5e));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.f69635x2f110f5e) && n3Var.f69635x2f110f5e.length() == 9) {
                activityC17301x38c077a3.f240853r.setBackgroundColor(android.graphics.Color.parseColor("#" + n3Var.f69635x2f110f5e.substring(3, 9)));
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.scanner.ProductUI", "parse maskColor wrong");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.scanner.ProductUI", "begin to get the url " + n3Var.f69643x7b28c57e);
        y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.b1 b1Var = activityC17301x38c077a3.f240861z;
        ((x60.e) fVar).getClass();
        android.graphics.Bitmap d17 = x51.w0.d(b1Var);
        if (d17 != null) {
            activityC17301x38c077a3.f240843e.setImageBitmap(d17);
            activityC17301x38c077a3.f240843e.setBackgroundDrawable(null);
            activityC17301x38c077a3.f240843e.setBackgroundColor(-1);
            activityC17301x38c077a3.h7();
        } else {
            activityC17301x38c077a3.f240843e.setImageBitmap(null);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n3Var.f69634x4e41914f)) {
            return;
        }
        e04.s3 s3Var = new e04.s3(n3Var.f69634x4e41914f);
        ((x60.e) ((y60.f) i95.n0.c(y60.f.class))).getClass();
        android.graphics.Bitmap d18 = x51.w0.d(s3Var);
        if (d18 == null || d18.isRecycled()) {
            return;
        }
        activityC17301x38c077a3.f240844f.setImageBitmap(d18);
    }
}
