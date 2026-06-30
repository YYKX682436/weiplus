package com.tencent.liteapp.ui;

/* loaded from: classes14.dex */
public class r implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f46215a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f46216b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.liteapp.ui.WxaLiteAppFragment f46217c;

    public r(com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment) {
        this.f46217c = wxaLiteAppFragment;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        int[] iArr = new int[2];
        com.tencent.liteapp.ui.WxaLiteAppFragment wxaLiteAppFragment = this.f46217c;
        wxaLiteAppFragment.f46067t.getLocationInWindow(iArr);
        this.f46215a = iArr[1] + i17;
        this.f46216b = z17;
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "keyboardStateChange shown=%b h=%d curHeight=%d l=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f46215a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
        kx5.n h17 = kx5.n.h();
        int i18 = wxaLiteAppFragment.f46023e.f349792a;
        boolean z18 = this.f46216b;
        int i19 = this.f46215a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z18));
        hashMap.put("height", java.lang.Integer.valueOf(i19));
        h17.j(i18, "notifyKeyboardChanged", hashMap);
    }
}
