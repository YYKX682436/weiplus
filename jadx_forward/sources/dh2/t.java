package dh2;

/* loaded from: classes10.dex */
public final class t implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dh2.x f313995d;

    public t(dh2.x xVar) {
        this.f313995d = xVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSongPlayManager", "observeVoiceVolumeChange: " + intValue);
        dh2.x xVar = this.f313995d;
        xVar.m(intValue);
        xVar.n(intValue);
        return jz5.f0.f384359a;
    }
}
