package ul;

/* loaded from: classes14.dex */
public abstract class a {
    public static android.media.AudioTrack a(boolean z17, int i17, int i18, int i19, int i27) {
        int i28;
        int i29;
        int i37 = z17 ? 3 : 0;
        if (ym1.f.wi().l() || ym1.f.Ni()) {
            i37 = 3;
        }
        wo.c cVar = wo.v1.f529356c;
        if (cVar.f529122a) {
            cVar.c();
            if (z17 && (i29 = cVar.E) > -1) {
                i37 = i29;
            } else if (!z17 && (i28 = cVar.F) > -1) {
                i37 = i28;
            }
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(i17, i18, i19);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDeviceFactory", "speakerOn: %b, type: %d, sampleRate: %d, channelConfig: %d, PlayBufSize: %d, bufTimes: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(minBufferSize), java.lang.Integer.valueOf(i27));
        int i38 = minBufferSize * i27;
        to.e eVar = new to.e(i37, i17, i18, i19, i38, 1);
        if (eVar.getState() == 0) {
            eVar.release();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDeviceFactory", "reconstruct AudioTrack");
            eVar = new to.e(i37 == 0 ? 3 : 0, i17, i18, i19, i38, 1);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioDeviceFactory", "AudioTrack state: " + eVar.getState());
        return eVar;
    }
}
