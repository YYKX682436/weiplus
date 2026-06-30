package df2;

/* loaded from: classes10.dex */
public final class g2 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.k2 f311718d;

    public g2(df2.k2 k2Var) {
        this.f311718d = k2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "startCollectingLiveInfo - Live info changed, trigger=" + ((java.lang.Number) obj).intValue());
        df2.k2 k2Var = this.f311718d;
        k2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMediaBrowserController", "notifyLiveInfoChanged - Send update live info command to service");
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.r rVar = k2Var.f312078n;
        if (rVar != null) {
            sn2.c cVar = sn2.c.f491653e;
            rVar.a("UPDATE_LIVE_INFO", null, null);
        }
        return jz5.f0.f384359a;
    }
}
