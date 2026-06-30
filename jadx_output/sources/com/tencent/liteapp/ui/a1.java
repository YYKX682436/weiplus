package com.tencent.liteapp.ui;

/* loaded from: classes15.dex */
public class a1 implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f46128a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46129b = false;

    /* renamed from: c, reason: collision with root package name */
    public int f46130c = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.os.Handler f46131d = new android.os.Handler();

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppUI f46132e;

    public a1(com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI) {
        this.f46132e = wxaLiteAppUI;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        com.tencent.liteapp.ui.WxaLiteAppUI wxaLiteAppUI = this.f46132e;
        if (wxaLiteAppUI.M) {
            wxaLiteAppUI.M = false;
            if (!z17) {
                return;
            }
        }
        int[] iArr = new int[2];
        wxaLiteAppUI.f46109s.getLocationInWindow(iArr);
        this.f46128a = i17 + iArr[1];
        this.f46129b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppUI", "keyboardStateChange shown=%b h=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f46128a));
        wxaLiteAppUI.getClass();
        boolean c17 = md.n.c(wxaLiteAppUI);
        wxaLiteAppUI.getClass();
        int b17 = md.n.b(wxaLiteAppUI, wxaLiteAppUI.F);
        if (c17 != wxaLiteAppUI.T || this.f46130c != b17) {
            wxaLiteAppUI.T = c17;
            wxaLiteAppUI.I = b17;
            android.content.Context context = zc.c.f471339b;
            if (context == null) {
                kotlin.jvm.internal.o.o("appContext");
                throw null;
            }
            float f17 = context.getResources().getDisplayMetrics().density;
            float f18 = b17 / f17;
            com.tencent.mm.plugin.lite.LiteAppCenter.setSystemBarHeight(wxaLiteAppUI.f46108r, -1.0f, f18, false);
            wxaLiteAppUI.getClass();
            android.graphics.Point b18 = es.u.b(wxaLiteAppUI);
            if (!wxaLiteAppUI.S || b18.x <= b18.y * 1.2d) {
                int i18 = wxaLiteAppUI.f46110t;
                if (i18 != -1) {
                    com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(wxaLiteAppUI.f46108r, 0.0f, i18 != 0 ? wxaLiteAppUI.f46103J / f17 : 0.0f, 0.0f, (i18 == 3 || i18 == 7) ? f18 : 0.0f, true);
                }
            } else {
                com.tencent.mm.plugin.lite.LiteAppCenter.setSafeAreaInsets(wxaLiteAppUI.f46108r, wxaLiteAppUI.f46103J / f17, 0.0f, f18, 0.0f, true);
            }
            kd.c.c("WxaLiteApp.WxaLiteAppUI", "onKeyboardStateChanged mShown=%b isShowNavigationBar=%b navigationBarHeight=%d", java.lang.Boolean.valueOf(this.f46129b), java.lang.Boolean.valueOf(wxaLiteAppUI.T), java.lang.Integer.valueOf(b17));
        }
        this.f46130c = b17;
        this.f46131d.postDelayed(new com.tencent.liteapp.ui.q0(this), 35L);
    }
}
