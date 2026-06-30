package my3;

/* loaded from: classes13.dex */
public final class j implements com.p314xaae8f345.mm.p794xb0fa9b5e.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ my3.q f414341d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414342e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414343f;

    public j(my3.q qVar, java.lang.String str, java.lang.String str2) {
        this.f414341d = qVar;
        this.f414342e = str;
        this.f414343f = str2;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        boolean z17 = false;
        if (bundle != null && bundle.getBoolean("result", false)) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosServiceImpl", "Login result " + z17);
        my3.q qVar = this.f414341d;
        if (!z17) {
            fy3.f fVar = qVar.f414366s;
            if (fVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Rtos.RtosWatchLoginUI", "onLoginFail");
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4 activityC17256xc70b42d4 = ((oy3.t) fVar).f431577a;
                activityC17256xc70b42d4.f240140y = 8;
                com.p314xaae8f345.mm.p1006xc5476f33.p2034x3593a6.ui.ActivityC17256xc70b42d4.U6(activityC17256xc70b42d4, 8);
                return;
            }
            return;
        }
        java.lang.String userName = this.f414343f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(userName, "$userName");
        my3.q.Bi(qVar, this.f414342e, userName);
        qVar.Ri(fy3.i.f348784m);
        fy3.f fVar2 = qVar.f414366s;
        if (fVar2 != null) {
            ((oy3.t) fVar2).c();
        }
    }
}
