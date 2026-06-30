package com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui;

/* loaded from: classes12.dex */
public class a0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a f177145d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a) {
        this.f177145d = activityC13098x53df0b7a;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1321xbe8cc686.ui.ActivityC13098x53df0b7a activityC13098x53df0b7a = this.f177145d;
        java.lang.String str = activityC13098x53df0b7a.f177128f;
        java.lang.String str2 = com.p314xaae8f345.p552xbf8d97c1.p554xec41ae0d.p555x3bc562.p556xd78fb9d4.InterfaceC4630x8a5f16f0.f19902xf2c82d18;
        if (i17 != 0) {
            if (i17 == 1) {
                str2 = "image";
            } else if (i17 == 2) {
                str2 = "video";
            } else if (i17 == 3) {
                str2 = "file";
            }
        }
        activityC13098x53df0b7a.f177131i.c(true, str2, activityC13098x53df0b7a.f177130h);
        activityC13098x53df0b7a.V6(str2);
    }
}
