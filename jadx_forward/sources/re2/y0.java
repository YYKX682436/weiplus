package re2;

/* loaded from: classes3.dex */
public final class y0 extends re2.e0 {

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f476038r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String initiatorFinderUsername) {
        super(initiatorFinderUsername);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initiatorFinderUsername, "initiatorFinderUsername");
        this.f476038r = "Finder.CoLiveInviteeTask";
    }

    @Override // re2.e0
    public java.lang.String c() {
        return this.f476038r;
    }

    @Override // re2.e0
    public boolean g(int i17) {
        if (i17 != -200030) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f476038r, "onPollFail: invitee kicked out (errCode=" + i17 + ')');
        if (this.f475922b != re2.a0.f475890f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c(), "markDeadKicked: phase=" + this.f475922b + " → DEAD");
            gk2.e eVar = dk2.ef.I;
            mm2.n0 n0Var = eVar != null ? (mm2.n0) eVar.a(mm2.n0.class) : null;
            if (n0Var != null) {
                n0Var.f410808t = mm2.m0.f410764e;
            }
            f(1);
        }
        return true;
    }

    @Override // re2.e0
    public void h() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f476038r, "onScreenshotDetected ignored: invitee doesn't need qrcode refresh");
    }
}
