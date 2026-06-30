package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes15.dex */
public class a1 implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f127661a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f127662b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f127663c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f127664d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 f127665e;

    public a1(com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7) {
        this.f127665e = activityC3722x408816c7;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        com.p314xaae8f345.p362xadfe2b3.ui.ActivityC3722x408816c7 activityC3722x408816c7 = this.f127665e;
        if (activityC3722x408816c7.M) {
            activityC3722x408816c7.M = false;
            if (!z17) {
                return;
            }
        }
        int[] iArr = new int[2];
        activityC3722x408816c7.f127642s.getLocationInWindow(iArr);
        this.f127661a = i17 + iArr[1];
        this.f127662b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "keyboardStateChange shown=%b h=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f127661a));
        activityC3722x408816c7.getClass();
        boolean c17 = md.n.c(activityC3722x408816c7);
        activityC3722x408816c7.getClass();
        int b17 = md.n.b(activityC3722x408816c7, activityC3722x408816c7.F);
        if (c17 != activityC3722x408816c7.T || this.f127663c != b17) {
            activityC3722x408816c7.T = c17;
            activityC3722x408816c7.I = b17;
            android.content.Context context = zc.c.f552872b;
            if (context == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("appContext");
                throw null;
            }
            float f17 = context.getResources().getDisplayMetrics().density;
            float f18 = b17 / f17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65489x42927ce9(activityC3722x408816c7.f127641r, -1.0f, f18, false);
            activityC3722x408816c7.getClass();
            android.graphics.Point b18 = es.u.b(activityC3722x408816c7);
            if (!activityC3722x408816c7.S || b18.x <= b18.y * 1.2d) {
                int i18 = activityC3722x408816c7.f127643t;
                if (i18 != -1) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(activityC3722x408816c7.f127641r, 0.0f, i18 != 0 ? activityC3722x408816c7.f127636J / f17 : 0.0f, 0.0f, (i18 == 3 || i18 == 7) ? f18 : 0.0f, true);
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65486xf2dfa652(activityC3722x408816c7.f127641r, activityC3722x408816c7.f127636J / f17, 0.0f, f18, 0.0f, true);
            }
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", java.lang.Boolean.valueOf(this.f127662b), java.lang.Boolean.valueOf(activityC3722x408816c7.T), java.lang.Integer.valueOf(b17));
        }
        this.f127663c = b17;
        this.f127664d.postDelayed(new com.p314xaae8f345.p362xadfe2b3.ui.q0(this), 35L);
    }
}
