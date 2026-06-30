package sc2;

/* loaded from: classes2.dex */
public final class f1 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sc2.h1 f487412g;

    public f1(sc2.h1 h1Var) {
        this.f487412g = h1Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            long j17 = fVar.f332498j;
            sc2.h1 h1Var = this.f487412g;
            if (j17 == h1Var.f84678f) {
                int i17 = fVar.f332492d;
                if (i17 == 11) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f487461w, "pauseCountdown");
                    h1Var.D = true;
                } else if (i17 == 1) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(h1Var.f487461w, "resumeCountdown");
                    h1Var.D = false;
                }
            }
        }
    }
}
