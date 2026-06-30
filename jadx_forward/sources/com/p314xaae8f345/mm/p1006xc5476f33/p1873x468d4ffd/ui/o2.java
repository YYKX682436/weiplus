package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class o2 implements fo4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d f230913d;

    public o2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d) {
        this.f230913d = activityC16554x70dcab5d;
    }

    @Override // fo4.b
    /* renamed from: onSurfaceTextureAvailable */
    public void mo66986xb7df39dc(android.graphics.SurfaceTexture surfaceTexture, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightCaptureUI", "callback onSurfaceTextureAvailable set local surface: %s", surfaceTexture);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.ActivityC16554x70dcab5d activityC16554x70dcab5d = this.f230913d;
        activityC16554x70dcab5d.f230784y = surfaceTexture;
        if (activityC16554x70dcab5d.a7(false)) {
            activityC16554x70dcab5d.i7(1);
        } else {
            activityC16554x70dcab5d.i7(8);
        }
    }
}
