package re2;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ re2.e0 f475910d;

    public d0(re2.e0 e0Var) {
        this.f475910d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        re2.e0 e0Var = this.f475910d;
        if (e0Var.f475922b != re2.a0.f475889e) {
            return;
        }
        if (e0Var.e()) {
            this.f475910d.f(4);
            return;
        }
        re2.e0 e0Var2 = this.f475910d;
        if (e0Var2.f475934n) {
            return;
        }
        e0Var2.f475934n = true;
        boolean z17 = e0Var2.f475936p;
        e0Var2.f475936p = false;
        long j17 = e0Var2.f475923c;
        long j18 = e0Var2.f475927g;
        java.lang.String initiatorFinderUsername = e0Var2.f475921a;
        re2.b0 b0Var = new re2.b0(e0Var2);
        re2.c0 c0Var = new re2.c0(e0Var2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.CoLiveRequestHelper", "pollInvitation: invitationId=" + j17 + ", version=" + j18 + ", screenshotDetected=" + z17);
        new ek2.u(j17, j18, initiatorFinderUsername, z17, new re2.d1(b0Var, c0Var)).l();
    }
}
