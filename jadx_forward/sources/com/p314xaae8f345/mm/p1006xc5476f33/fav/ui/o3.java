package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class o3 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e f182848a;

    public o3(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e) {
        this.f182848a = activityC13568x82804f7e;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.ActivityC13568x82804f7e activityC13568x82804f7e = this.f182848a;
        if (activityC13568x82804f7e.f181900q.f182835d == 1 || activityC13568x82804f7e.isFinishing() || activityC13568x82804f7e.m78477x9d1e994e()) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(activityC13568x82804f7e.f181891e.m81089x75594384()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(activityC13568x82804f7e.f181891e.m81090x75675b05()));
        int i17 = activityC13568x82804f7e.f181900q.f182835d;
        if (i17 == 0 || i17 == 2) {
            activityC13568x82804f7e.U6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.c());
        } else {
            activityC13568x82804f7e.U6(false);
        }
    }
}
