package fv;

/* loaded from: classes16.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fv.k f348458d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f348459e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f348460f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(fv.k kVar, int i17, long j17) {
        super(0);
        this.f348458d = kVar;
        this.f348459e = i17;
        this.f348460f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fv.k kVar = this.f348458d;
        fv.l lVar = kVar.f348465e;
        if (lVar != null) {
            if (lVar.f348467b >= this.f348459e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + this.f348458d.f348465e + " exist, ignore");
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + this.f348458d.f348465e + " exist, cancel");
            lVar.f348466a.cancel(false);
        }
        fv.k kVar2 = this.f348458d;
        ku5.u0 u0Var = ku5.t0.f394148d;
        fv.i iVar = new fv.i(this.f348458d);
        long j17 = this.f348460f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c w17 = t0Var.w(iVar, j17, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w17, "computeDelay(...)");
        kVar2.f348465e = new fv.l(w17, this.f348459e);
        return jz5.f0.f384359a;
    }
}
