package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class k implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f46193a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46194b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppBaseView f46195c;

    public k(com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView) {
        this.f46195c = wxaLiteAppBaseView;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        int[] iArr = new int[2];
        com.tencent.liteapp.ui.WxaLiteAppBaseView wxaLiteAppBaseView = this.f46195c;
        wxaLiteAppBaseView.getLocationInWindow(iArr);
        this.f46193a = iArr[1] + i17;
        this.f46194b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "keyboardStateChange shown=%b h=%d curHeight=%d l=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f46193a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
        kx5.n h17 = kx5.n.h();
        int i18 = wxaLiteAppBaseView.f46044h;
        boolean z18 = this.f46194b;
        int i19 = this.f46193a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z18));
        hashMap.put("height", java.lang.Integer.valueOf(i19));
        h17.j(i18, "notifyKeyboardChanged", hashMap);
        if (z17) {
            return;
        }
        wxaLiteAppBaseView.f46042f.f349795d.clearFocus();
    }
}
