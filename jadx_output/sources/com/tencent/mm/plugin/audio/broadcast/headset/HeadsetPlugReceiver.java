package com.tencent.mm.plugin.audio.broadcast.headset;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/audio/broadcast/headset/HeadsetPlugReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-audio_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class HeadsetPlugReceiver extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public int f92469a = -1;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (gm0.j1.a()) {
            int intExtra = intent != null ? intent.getIntExtra("state", -1) : 0;
            com.tencent.mars.xlog.Log.i("MicroMsg.HeadsetPlugReceiver", "onReceive action[ HEADSET_PLUG ] state = %s,mic = %s", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("microphone", -1) : 0));
            if (intent != null) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).fj(intent);
            }
            int i17 = this.f92469a;
            if (i17 == -1 || i17 != intExtra) {
                this.f92469a = intExtra;
                boolean z17 = intExtra != 0;
                ym1.e eVar = ym1.f.f463134h;
                if (z17) {
                    eVar.l(8);
                } else {
                    eVar.l(9);
                }
            }
        }
    }
}
