package ch2;

/* loaded from: classes10.dex */
public final class e1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41322d;

    public e1(ch2.o2 o2Var) {
        this.f41322d = o2Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        om2.i iVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean z17 = fn0.g.f264197c;
        int i17 = 1;
        boolean z18 = this.f41322d.P == com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger;
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "observeOriginalSwitch, ktvEnableChorus: " + z17 + ", isLeadSinger: " + z18);
        if (z17 && z18 && (iVar = this.f41322d.q7().f346307n) != null) {
            synchronized (iVar.f346323c) {
                r45.ia4 ia4Var = iVar.f346323c;
                if (ia4Var != null) {
                    if (!booleanValue) {
                        i17 = 0;
                    }
                    ia4Var.f376886x = i17;
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
