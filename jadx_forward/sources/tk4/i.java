package tk4;

/* loaded from: classes11.dex */
public final class i extends android.media.AudioDeviceCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a f501520a;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a) {
        this.f501520a = c18711x7115b73a;
    }

    @Override // android.media.AudioDeviceCallback
    public void onAudioDevicesAdded(android.media.AudioDeviceInfo[] audioDeviceInfoArr) {
        super.onAudioDevicesAdded(audioDeviceInfoArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2285xb446ff0.C18711x7115b73a c18711x7115b73a = this.f501520a;
        p3325xe03a0797.p3326xc267989b.l.d(c18711x7115b73a.K, null, null, new tk4.h(c18711x7115b73a, audioDeviceInfoArr, null), 3, null);
    }
}
