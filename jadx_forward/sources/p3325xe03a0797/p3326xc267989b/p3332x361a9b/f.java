package p3325xe03a0797.p3326xc267989b.p3332x361a9b;

/* loaded from: classes14.dex */
public final class f extends p3325xe03a0797.p3326xc267989b.p3332x361a9b.g {

    /* renamed from: i, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.q f392182i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.p3332x361a9b.k f392183m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(p3325xe03a0797.p3326xc267989b.p3332x361a9b.k kVar, java.lang.Object obj, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(kVar, obj);
        this.f392183m = kVar;
        this.f392182i = qVar;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t
    /* renamed from: toString */
    public java.lang.String mo144017x9616526c() {
        return "LockCont[" + this.f392185g + ", " + this.f392182i + "] for " + this.f392183m;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3332x361a9b.g
    public void u() {
        p3325xe03a0797.p3326xc267989b.r rVar = (p3325xe03a0797.p3326xc267989b.r) this.f392182i;
        rVar.h(rVar.f72727xdec89770);
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3332x361a9b.g
    public boolean w() {
        if (p3325xe03a0797.p3326xc267989b.p3332x361a9b.g.f392184h.compareAndSet(this, 0, 1)) {
            return ((p3325xe03a0797.p3326xc267989b.r) this.f392182i).w(jz5.f0.f384359a, null, new p3325xe03a0797.p3326xc267989b.p3332x361a9b.e(this.f392183m, this)) != null;
        }
        return false;
    }
}
