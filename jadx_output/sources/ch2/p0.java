package ch2;

/* loaded from: classes10.dex */
public final class p0 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41435d;

    public p0(ch2.o2 o2Var) {
        this.f41435d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.i iVar;
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = fn0.g.f264197c;
        boolean z18 = this.f41435d.P == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "observeAccompanyVolume, ktvEnableChorus: " + z17 + ", isLeadSinger: " + z18);
        if (z17 && z18 && (iVar = this.f41435d.q7().f346307n) != null) {
            synchronized (iVar.f346323c) {
                r45.ia4 ia4Var = iVar.f346323c;
                if (ia4Var != null) {
                    ia4Var.f376887y = intValue;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
