package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class h0 implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f127695a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f127696b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f127697c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f127698d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 f127699e;

    public h0(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133) {
        this.f127699e = activityC3721x69b5f133;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3721x69b5f133 activityC3721x69b5f133 = this.f127699e;
        if (activityC3721x69b5f133.P) {
            activityC3721x69b5f133.P = false;
            if (!z17) {
                return;
            }
        }
        int[] iArr = new int[2];
        activityC3721x69b5f133.f127623r.getLocationInWindow(iArr);
        this.f127695a = i17 + iArr[1];
        this.f127696b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "keyboardStateChange shown=%b h=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f127695a));
        activityC3721x69b5f133.getClass();
        boolean c17 = md.n.c(activityC3721x69b5f133);
        activityC3721x69b5f133.getClass();
        int b17 = md.n.b(activityC3721x69b5f133, activityC3721x69b5f133.E);
        if (c17 != activityC3721x69b5f133.L || this.f127697c != b17) {
            activityC3721x69b5f133.L = c17;
            activityC3721x69b5f133.H = b17;
            android.content.Context context = zc.c.f552872b;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                throw null;
            }
            float f17 = context.getResources().getDisplayMetrics().density;
            float f18 = b17 / f17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65489x42927ce9(activityC3721x69b5f133.f127622q, -1.0f, f18, false);
            activityC3721x69b5f133.getClass();
            android.graphics.Point b18 = es.u.b(activityC3721x69b5f133);
            if (!activityC3721x69b5f133.K || b18.x <= b18.y * 1.2d) {
                int i18 = activityC3721x69b5f133.f127624s;
                if (i18 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(activityC3721x69b5f133.f127622q, 0.0f, i18 != 0 ? activityC3721x69b5f133.I / f17 : 0.0f, 0.0f, (i18 == 3 || i18 == 7) ? f18 : 0.0f, true);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(activityC3721x69b5f133.f127622q, activityC3721x69b5f133.I / f17, 0.0f, f18, 0.0f, true);
            }
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", java.lang.Boolean.valueOf(this.f127696b), java.lang.Boolean.valueOf(activityC3721x69b5f133.L), java.lang.Integer.valueOf(b17));
        }
        this.f127697c = b17;
        this.f127698d.postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.y(this), 35L);
    }
}
