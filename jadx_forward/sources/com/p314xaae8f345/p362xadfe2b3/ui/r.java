package com.p314xaae8f345.p362xadfe2b3.ui;

/* loaded from: classes14.dex */
public class r implements md.g {

    /* renamed from: a, reason: collision with root package name */
    public int f127748a = 0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f127749b = false;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 f127750c;

    public r(com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063) {
        this.f127750c = c3719xb0aa2063;
    }

    @Override // md.g
    public void a(boolean z17, int i17) {
        int[] iArr = new int[2];
        com.p314xaae8f345.p362xadfe2b3.ui.C3719xb0aa2063 c3719xb0aa2063 = this.f127750c;
        c3719xb0aa2063.f127600t.getLocationInWindow(iArr);
        this.f127748a = iArr[1] + i17;
        this.f127749b = z17;
        kd.c.c("WxaLiteAp.WxaLiteAppFragment", "keyboardStateChange shown=%b h=%d curHeight=%d l=%d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(this.f127748a), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(iArr[1]));
        kx5.n h17 = kx5.n.h();
        int i18 = c3719xb0aa2063.f127556e.f431325a;
        boolean z18 = this.f127749b;
        int i19 = this.f127748a;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("shown", java.lang.Boolean.valueOf(z18));
        hashMap.put("height", java.lang.Integer.valueOf(i19));
        h17.j(i18, "notifyKeyboardChanged", hashMap);
    }
}
