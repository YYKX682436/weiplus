package ch2;

/* loaded from: classes10.dex */
public final class p0 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122968d;

    public p0(ch2.o2 o2Var) {
        this.f122968d = o2Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        om2.i iVar;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = fn0.g.f345730c;
        boolean z18 = this.f122968d.P == com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "observeAccompanyVolume, ktvEnableChorus: " + z17 + ", isLeadSinger: " + z18);
        if (z17 && z18 && (iVar = this.f122968d.q7().f427840n) != null) {
            synchronized (iVar.f427856c) {
                r45.ia4 ia4Var = iVar.f427856c;
                if (ia4Var != null) {
                    ia4Var.f458420y = intValue;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
