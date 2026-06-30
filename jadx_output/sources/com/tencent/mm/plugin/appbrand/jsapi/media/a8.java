package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class a8 implements android.media.AudioManager.OnAudioFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.c8 f81700d;

    public a8(com.tencent.mm.plugin.appbrand.jsapi.media.c8 c8Var) {
        this.f81700d = c8Var;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.media.c8 c8Var = this.f81700d;
        com.tencent.mars.xlog.Log.i(c8Var.f81747g, "onAudioFocusChange, focusChange: " + i17);
        if (i17 == -3 || i17 == -2) {
            c8Var.d();
        } else if (i17 == -1) {
            c8Var.f();
        } else {
            if (i17 != 1) {
                return;
            }
            c8Var.e();
        }
    }
}
