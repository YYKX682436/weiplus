package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class h0 implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f46162a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46163b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f46164c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f46165d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppTransparentUI f46166e;

    public h0(com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI) {
        this.f46166e = wxaLiteAppTransparentUI;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        com.tencent.liteapp.ui.WxaLiteAppTransparentUI wxaLiteAppTransparentUI = this.f46166e;
        if (wxaLiteAppTransparentUI.P) {
            wxaLiteAppTransparentUI.P = false;
            if (!z17) {
                return;
            }
        }
        int[] iArr = new int[2];
        wxaLiteAppTransparentUI.f46090r.getLocationInWindow(iArr);
        this.f46162a = i17 + iArr[1];
        this.f46163b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "keyboardStateChange shown=%b h=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f46162a));
        wxaLiteAppTransparentUI.getClass();
        boolean c17 = md.n.c(wxaLiteAppTransparentUI);
        wxaLiteAppTransparentUI.getClass();
        int b17 = md.n.b(wxaLiteAppTransparentUI, wxaLiteAppTransparentUI.E);
        if (c17 != wxaLiteAppTransparentUI.L || this.f46164c != b17) {
            wxaLiteAppTransparentUI.L = c17;
            wxaLiteAppTransparentUI.H = b17;
            android.content.Context context = zc.c.f471339b;
            if (context == null) {
                kotlin.jvm.internal.o.o("appContext");
                throw null;
            }
            float f17 = context.getResources().getDisplayMetrics().density;
            float f18 = b17 / f17;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSystemBarHeight(wxaLiteAppTransparentUI.f46089q, -1.0f, f18, false);
            wxaLiteAppTransparentUI.getClass();
            android.graphics.Point b18 = es.u.b(wxaLiteAppTransparentUI);
            if (!wxaLiteAppTransparentUI.K || b18.x <= b18.y * 1.2d) {
                int i18 = wxaLiteAppTransparentUI.f46091s;
                if (i18 != -1) {
                    com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(wxaLiteAppTransparentUI.f46089q, 0.0f, i18 != 0 ? wxaLiteAppTransparentUI.I / f17 : 0.0f, 0.0f, (i18 == 3 || i18 == 7) ? f18 : 0.0f, true);
                }
            } else {
                com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(wxaLiteAppTransparentUI.f46089q, wxaLiteAppTransparentUI.I / f17, 0.0f, f18, 0.0f, true);
            }
            kd.c.c("WxaLiteApp.WxaLiteAppTransparentUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", java.lang.Boolean.valueOf(this.f46163b), java.lang.Boolean.valueOf(wxaLiteAppTransparentUI.L), java.lang.Integer.valueOf(b17));
        }
        this.f46164c = b17;
        this.f46165d.postDelayed(new com.tencent.liteapp.ui.y(this), 35L);
    }
}
