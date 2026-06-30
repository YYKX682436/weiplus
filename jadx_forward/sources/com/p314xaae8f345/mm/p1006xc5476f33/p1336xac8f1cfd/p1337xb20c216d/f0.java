package com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d;

/* loaded from: classes12.dex */
public class f0 implements com.p314xaae8f345.mm.ui.p2740x696c9db.p5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 f178090a;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2) {
        this.f178090a = activityC13155x6eea6ae2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.p5
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.ActivityC13155x6eea6ae2 activityC13155x6eea6ae2 = this.f178090a;
        if (activityC13155x6eea6ae2.f178022r.f182835d == 1) {
            return;
        }
        c01.l2 c17 = c01.n2.d().c("basescanui@datacenter", true);
        c17.i("key_basescanui_screen_position", java.lang.Boolean.TRUE);
        c17.i("key_basescanui_screen_x", java.lang.Float.valueOf(activityC13155x6eea6ae2.f178013f.m81089x75594384()));
        c17.i("key_basescanui_screen_y", java.lang.Float.valueOf(activityC13155x6eea6ae2.f178013f.m81090x75675b05()));
        int i17 = activityC13155x6eea6ae2.f178022r.f182835d;
        if (i17 == 0 || i17 == 2) {
            activityC13155x6eea6ae2.U6(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.k1.c());
        } else {
            activityC13155x6eea6ae2.U6(false);
        }
    }
}
