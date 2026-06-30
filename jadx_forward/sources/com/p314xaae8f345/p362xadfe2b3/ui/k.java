package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class k implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f127726a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f127727b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 f127728c;

    public k(com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329) {
        this.f127728c = c3717xac6c2329;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        int[] iArr = new int[2];
        com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = this.f127728c;
        c3717xac6c2329.getLocationInWindow(iArr);
        this.f127726a = iArr[1] + i17;
        this.f127727b = z17;
        kd.c.c("WxaLiteApp.WxaLiteAppBaseView", "keyboardStateChange shown=%b h=%d curHeight=%d l=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f127726a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
        kx5.n h17 = kx5.n.h();
        int i18 = c3717xac6c2329.f127577h;
        boolean z18 = this.f127727b;
        int i19 = this.f127726a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z18));
        hashMap.put("height", java.lang.Integer.valueOf(i19));
        h17.j(i18, "notifyKeyboardChanged", hashMap);
        if (z17) {
            return;
        }
        c3717xac6c2329.f127575f.f431328d.clearFocus();
    }
}
