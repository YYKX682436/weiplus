package com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1241x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/audio/broadcast/base/BaseAudioReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-audio_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.audio.broadcast.base.BaseAudioReceiver */
/* loaded from: classes13.dex */
public final class C12824x4a5e7874 extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseAudioReceiver", "onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
            if (intent != null) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).fj(intent);
            }
            ym1.f.f544667h.l(10);
        }
    }
}
