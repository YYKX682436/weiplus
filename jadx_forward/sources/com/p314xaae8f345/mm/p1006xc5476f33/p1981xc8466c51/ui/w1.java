package com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui;

/* loaded from: classes12.dex */
public class w1 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf f237129a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf) {
        this.f237129a = activityC16972xc3ec91bf;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p5
    public void a() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf.f236842J;
        com.p314xaae8f345.mm.p1006xc5476f33.p1981xc8466c51.ui.ActivityC16972xc3ec91bf activityC16972xc3ec91bf = this.f237129a;
        if (!activityC16972xc3ec91bf.X6()) {
            if (activityC16972xc3ec91bf.isFinishing() || activityC16972xc3ec91bf.m78477x9d1e994e()) {
                return;
            }
            activityC16972xc3ec91bf.Y6(false);
            return;
        }
        if (activityC16972xc3ec91bf.f236858v.f182835d == 1) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(activityC16972xc3ec91bf.f236847h.m81089x75594384()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(activityC16972xc3ec91bf.f236847h.m81090x75675b05()));
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85 c6631xd817ea85 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6631xd817ea85();
        c6631xd817ea85.f139850e = 1L;
        c6631xd817ea85.f139851f = 5L;
        int selectedItemPosition = activityC16972xc3ec91bf.f236847h.getSelectedItemPosition();
        if (-1 != selectedItemPosition) {
            r45.gp0 n17 = activityC16972xc3ec91bf.f236848i.getItem(selectedItemPosition).n();
            c6631xd817ea85.q(n17.f456967s);
            c6631xd817ea85.p(n17.f456971u);
        }
        c6631xd817ea85.k();
        int i18 = activityC16972xc3ec91bf.f236858v.f182835d;
        if (i18 == 0 || i18 == 2) {
            activityC16972xc3ec91bf.Y6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.c());
        } else {
            activityC16972xc3ec91bf.Y6(false);
        }
    }
}
