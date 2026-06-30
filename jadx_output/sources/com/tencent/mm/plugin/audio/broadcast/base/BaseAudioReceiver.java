package com.tencent.mm.plugin.audio.broadcast.base;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/audio/broadcast/base/BaseAudioReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-audio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class BaseAudioReceiver extends android.content.BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (gm0.j1.a()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BaseAudioReceiver", "onReceive action[ ACTION_AUDIO_BECOMING_NOISY ] ");
            if (intent != null) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).fj(intent);
            }
            ym1.f.f463134h.l(10);
        }
    }
}
