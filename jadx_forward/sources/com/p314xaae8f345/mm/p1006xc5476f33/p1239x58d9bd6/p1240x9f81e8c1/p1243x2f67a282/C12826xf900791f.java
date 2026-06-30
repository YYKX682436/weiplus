package com.p314xaae8f345.mm.p1006xc5476f33.p1239x58d9bd6.p1240x9f81e8c1.p1243x2f67a282;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/audio/broadcast/headset/HeadsetPlugReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "plugin-audio_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.audio.broadcast.headset.HeadsetPlugReceiver */
/* loaded from: classes13.dex */
public final class C12826xf900791f extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public int f174002a = -1;

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (gm0.j1.a()) {
            int intExtra = intent != null ? intent.getIntExtra("state", -1) : 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HeadsetPlugReceiver", "onReceive action[ HEADSET_PLUG ] state = %s,mic = %s", java.lang.Integer.valueOf(intExtra), java.lang.Integer.valueOf(intent != null ? intent.getIntExtra("microphone", -1) : 0));
            if (intent != null) {
                ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).fj(intent);
            }
            int i17 = this.f174002a;
            if (i17 == -1 || i17 != intExtra) {
                this.f174002a = intExtra;
                boolean z17 = intExtra != 0;
                ym1.e eVar = ym1.f.f544667h;
                if (z17) {
                    eVar.l(8);
                } else {
                    eVar.l(9);
                }
            }
        }
    }
}
