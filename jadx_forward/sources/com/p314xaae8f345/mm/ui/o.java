package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class o implements p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 f290966d;

    public o(com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 activityC21339x2c5c4123) {
        this.f290966d = activityC21339x2c5c4123;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
        com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 c21354xd0cc2aa9 = this.f290966d.f278085d;
        float f18 = c21354xd0cc2aa9.f278165d * (i17 + f17);
        android.graphics.Matrix matrix = c21354xd0cc2aa9.f278170i;
        matrix.setTranslate(f18, 0.0f);
        c21354xd0cc2aa9.f278169h.setImageMatrix(matrix);
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageSelected */
    public void mo8333x510f45c9(int i17) {
        com.p314xaae8f345.mm.ui.ActivityC21339x2c5c4123 activityC21339x2c5c4123 = this.f290966d;
        activityC21339x2c5c4123.f278085d.m78380x684367d(i17);
        if (i17 == 0) {
            mf4.d.f407694b.f142449d = 3L;
        } else {
            mf4.d.f407694b.f142449d = 2L;
            if (activityC21339x2c5c4123.f278088g) {
                com.p314xaae8f345.mm.ui.C21354xd0cc2aa9 c21354xd0cc2aa9 = activityC21339x2c5c4123.f278085d;
                c21354xd0cc2aa9.f278177s = false;
                com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = c21354xd0cc2aa9.f278172n;
                if (c21407xddef161a != null) {
                    c21407xddef161a.f278447e.setVisibility(4);
                }
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_NEED_DISPLAY_ALBUM_GUIDE_BOOLEAN_SYNC, java.lang.Boolean.FALSE);
            }
        }
        mf4.d.f407693a.b();
        if (!bi4.v1.g() || i17 != 1) {
            activityC21339x2c5c4123.mo74408xb0dfae51(false);
            return;
        }
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).fj(13L, activityC21339x2c5c4123.f278085d.f278177s ? "1" : "0");
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().a(37);
        activityC21339x2c5c4123.mo74408xb0dfae51(true);
    }
}
