package f92;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f92.t f341801d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f341802e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m92.b f341803f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m92.j f341804g;

    public q(f92.t tVar, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, m92.b bVar, m92.j jVar) {
        this.f341801d = tVar;
        this.f341802e = g0Var;
        this.f341803f = bVar;
        this.f341804g = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        for (l92.b bVar : this.f341801d.h6().f406517g) {
            long j17 = this.f341802e.f391654d;
            m92.b account = this.f341803f;
            m92.j jVar = this.f341804g;
            if (j17 < 0) {
                java.lang.String source = jVar.name();
                bVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
            } else {
                java.lang.String source2 = jVar.name();
                bVar.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(account, "account");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source2, "source");
            }
        }
    }
}
