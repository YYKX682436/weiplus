package q61;

/* loaded from: classes11.dex */
public final class f implements q61.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f441777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f441778b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.z f441779c;

    public f(long j17, int i17, p3325xe03a0797.p3326xc267989b.z zVar) {
        this.f441777a = j17;
        this.f441778b = i17;
        this.f441779c = zVar;
    }

    @Override // q61.k
    public void a(boolean z17, r45.nf5 nf5Var) {
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f441777a;
        if (currentTimeMillis < this.f441778b) {
            q61.j.f441799f = true;
        } else {
            q61.j.f441799f = false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushLoginURLMainDeviceCGIPushLoginURLTAG3MainDeviceCGI", "cgi time " + currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushLoginURLMainDeviceCGIPushLoginURLTAG3MainDeviceCGI", "cgi timeLimit " + this.f441778b);
        if (z17) {
            q61.j.f441796c = nf5Var;
            q61.j.f441795b = true;
        } else {
            q61.j.f441795b = false;
            q61.j.f441796c = null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PushLoginURLMainDeviceCGI", "TAGcheckLoginURLMainDevice fail block ");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PushLoginURLTAG3MainDeviceCGI", "checkDone");
        ((p3325xe03a0797.p3326xc267989b.a0) this.f441779c).U(java.lang.Boolean.valueOf(z17));
    }
}
