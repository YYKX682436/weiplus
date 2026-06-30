package com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p400x5d2a96d;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private int f128295a = -1;

    public final void a() {
        if (this.f128295a == -1) {
            this.f128295a = com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31159xd3fd3e93();
        }
    }

    public final void b() {
        com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31147xfc642370(36160, this.f128295a);
    }

    public final void c() {
        int i17 = this.f128295a;
        if (i17 == -1) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31157xeca9d2db(i17);
        }
    }

    public final void d() {
        int i17 = this.f128295a;
        if (i17 != -1) {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31154xe08f1d62(i17);
            this.f128295a = -1;
        }
    }

    public final void a(int i17) {
        int i18 = this.f128295a;
        if (i18 == -1) {
            com.p314xaae8f345.p373xbe494963.p378x2e06d1.p387x36f002.C3778x49e662c1.d("GLFrameBuffer", "FrameBuffer is invalid");
        } else {
            com.p314xaae8f345.p373xbe494963.p397x4f7965cc.p401x6a710b1.C3821x5d7fad02.m31146xf049ff1c(i17, i18);
        }
    }
}
