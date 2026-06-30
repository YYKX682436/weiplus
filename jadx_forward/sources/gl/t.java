package gl;

/* loaded from: classes14.dex */
public final class t extends android.media.AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gl.y f354306a;

    public t(gl.y yVar) {
        this.f354306a = yVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ac  */
    @Override // android.media.AudioDeviceCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] r18) {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.t.onAudioDevicesAdded(android.media.AudioDeviceInfo[]):void");
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesRemoved(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        gl.q qVar;
        super.onAudioDevicesRemoved(audioDeviceInfoArr);
        gl.y yVar = this.f354306a;
        if (audioDeviceInfoArr != null) {
            for (android.media.AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LEAudioProfile", "onAudioDevicesRemoved device is " + audioDeviceInfo.getAddress() + " and " + ((java.lang.Object) audioDeviceInfo.getProductName()));
                if ((audioDeviceInfo.getType() == 7 || audioDeviceInfo.getType() == 26) && (qVar = yVar.f354321c) != null) {
                    ((gl.i) qVar).nj(4, audioDeviceInfo.getProductName().toString());
                }
                if (audioDeviceInfo.getType() == 3 || audioDeviceInfo.getType() == 22 || audioDeviceInfo.getType() == 11 || audioDeviceInfo.getType() == 4) {
                    yVar.f354264a = null;
                    gl.q qVar2 = yVar.f354321c;
                    if (qVar2 != null) {
                        ((gl.i) qVar2).nj(3, audioDeviceInfo.getProductName().toString());
                    }
                }
            }
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var = yVar.f354325g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        yVar.f354324f = java.lang.Boolean.TRUE;
        yVar.l(new android.media.AudioDeviceInfo[0]);
    }
}
