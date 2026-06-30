package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851;

/* loaded from: classes12.dex */
public class t0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f182328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u0 f182329e;

    public t0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u0 u0Var, android.graphics.Bitmap bitmap) {
        this.f182329e = u0Var;
        this.f182328d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.u0 u0Var = this.f182329e;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c activityC13591xdaafa82c = u0Var.f182335f;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.a1 a1Var = u0Var.f182333d;
        android.graphics.Bitmap bitmap = this.f182328d;
        java.lang.String str = u0Var.f182334e;
        if (bitmap == null) {
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.ActivityC13591xdaafa82c.f182157w;
            activityC13591xdaafa82c.getClass();
            bitmap = activityC13591xdaafa82c.a7(a1Var.f182216a);
        }
        boolean z17 = true;
        if (bitmap != activityC13591xdaafa82c.f182162q) {
            ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1414xb06a1851.k0(activityC13591xdaafa82c));
        } else if (str.equals("onCdnStatusChanged")) {
            k82.c.f386420a.e(activityC13591xdaafa82c.f182160o.f67645x88be67a1, 1);
        }
        if (bitmap != null) {
            bitmap.getWidth();
            bitmap.getHeight();
            a1Var.f182226k = bitmap.getWidth();
            a1Var.f182227l = bitmap.getHeight();
        }
        try {
            android.view.ViewGroup.LayoutParams layoutParams = a1Var.f182217b.getLayoutParams();
            layoutParams.width = -1;
            int width = bitmap.getWidth();
            int i18 = activityC13591xdaafa82c.f182159n;
            if (width > i18 / 3) {
                int width2 = (int) ((i18 / bitmap.getWidth()) * bitmap.getHeight());
                layoutParams.height = width2;
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.v1 v1Var = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a;
                if (width2 > v1Var.f274566a) {
                    int width3 = bitmap.getWidth();
                    int height = bitmap.getHeight();
                    int i19 = v1Var.f274566a;
                    if (width3 >= i19 || height >= i19) {
                        z17 = false;
                    }
                    if (z17) {
                        a1Var.f182217b.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                    } else {
                        layoutParams.height = i19 >> 2;
                        a1Var.f182217b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                    }
                } else {
                    a1Var.f182217b.setScaleType(android.widget.ImageView.ScaleType.FIT_XY);
                }
            } else {
                int height2 = bitmap.getHeight();
                boolean z19 = com.p314xaae8f345.mm.sdk.p2603x2137b148.l1.f274350a;
                int i27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u1.f274536a.f274566a;
                if (height2 > i27) {
                    layoutParams.height = i27 >> 2;
                    a1Var.f182217b.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
                } else {
                    if (a1Var.f182217b.getMinimumWidth() > bitmap.getWidth()) {
                        layoutParams.width = a1Var.f182217b.getMinimumWidth();
                    }
                    a1Var.f182217b.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
                }
            }
            java.lang.String x17 = o72.x1.x(a1Var.f182216a);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(x17)) {
                a1Var.f182217b.setImageBitmap(bitmap);
                return;
            }
            try {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.e) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j5.class))).getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.gif.b a17 = com.p314xaae8f345.mm.p1006xc5476f33.gif.d.c().a(x17 + "_detail", x17);
                a1Var.f182217b.setImageDrawable(a17);
                a17.stop();
                a17.start();
            } catch (java.lang.Exception unused) {
                a1Var.f182217b.setImageBitmap(bitmap);
            }
        } catch (java.lang.Throwable unused2) {
        }
    }

    /* renamed from: toString */
    public java.lang.String m55335x9616526c() {
        return super.toString() + "|renderView";
    }
}
