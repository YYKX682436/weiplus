package if0;

/* loaded from: classes16.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ if0.k f372558d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f372559e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f372560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(if0.k kVar, int i17, long j17) {
        super(0);
        this.f372558d = kVar;
        this.f372559e = i17;
        this.f372560f = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if0.k kVar = this.f372558d;
        if0.l lVar = kVar.f372565e;
        if (lVar != null) {
            if (lVar.f372567b >= this.f372559e) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + this.f372558d.f372565e + " exist, ignore");
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(kVar.d(), "delayTask:" + this.f372558d.f372565e + " exist, cancel");
            lVar.f372566a.cancel(false);
        }
        if0.k kVar2 = this.f372558d;
        ku5.u0 u0Var = ku5.t0.f394148d;
        if0.i iVar = new if0.i(this.f372558d);
        long j17 = this.f372560f;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        wu5.c w17 = t0Var.w(iVar, j17, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(w17, "computeDelay(...)");
        kVar2.f372565e = new if0.l(w17, this.f372559e);
        return jz5.f0.f384359a;
    }
}
