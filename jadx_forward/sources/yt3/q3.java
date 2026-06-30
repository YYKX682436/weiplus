package yt3;

/* loaded from: classes10.dex */
public final class q3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yt3.r3 f547146a;

    public q3(yt3.r3 r3Var) {
        this.f547146a = r3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x
    public void a(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordButtonPlugin", "onProgressFinish");
        this.f547146a.n(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.x
    public void b(java.util.ArrayList subProgress) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subProgress, "subProgress");
        yz5.l lVar = this.f547146a.f547174v;
        if (lVar != null) {
            lVar.mo146xb9724478(subProgress);
        }
    }
}
