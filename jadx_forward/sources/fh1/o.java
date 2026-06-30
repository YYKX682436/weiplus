package fh1;

/* loaded from: classes7.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fh1.z f344103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f344104e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fh1.z zVar, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(0);
        this.f344103d = zVar;
        this.f344104e = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fh1.x0 a17 = this.f344103d.a();
        fh1.n nVar = new fh1.n(this.f344104e);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = a17.D;
        atomicBoolean.get();
        if (atomicBoolean.get()) {
            nVar.mo152xb9724478();
        } else {
            a17.E.add(nVar);
        }
        return jz5.f0.f384359a;
    }
}
