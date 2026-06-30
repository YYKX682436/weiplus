package t56;

/* loaded from: classes16.dex */
public class l0 extends p56.q implements p56.s {

    /* renamed from: h, reason: collision with root package name */
    public static final p56.s f497431h = new t56.h0();

    /* renamed from: e, reason: collision with root package name */
    public final p56.q f497432e;

    /* renamed from: f, reason: collision with root package name */
    public final p56.m f497433f;

    /* renamed from: g, reason: collision with root package name */
    public final p56.s f497434g;

    public l0(r56.e eVar, p56.q qVar) {
        this.f497432e = qVar;
        z56.g gVar = new z56.g();
        gVar.f551834h = new z56.a(gVar);
        this.f497433f = new w56.c(new z56.b(gVar, gVar));
        p56.h hVar = (p56.h) eVar.mo14559x2e7a5e(p56.l.b(new s56.k(gVar, s56.x.f484796a)));
        hVar.getClass();
        a66.e eVar2 = new a66.e();
        p56.d dVar = new p56.d(hVar, eVar2);
        try {
            p56.f fVar = hVar.f433626a;
            if (x56.m.f533665e != null) {
                x56.r.f533673e.a().getClass();
            }
            fVar.mo131526x2e7a5e(dVar);
            this.f497434g = eVar2;
        } catch (java.lang.NullPointerException e17) {
            throw e17;
        } catch (java.lang.Throwable th6) {
            th = th6;
            q56.f.b(th);
            r56.e eVar3 = x56.m.f533670j;
            th = eVar3 != null ? (java.lang.Throwable) ((x56.c) eVar3).mo14559x2e7a5e(th) : th;
            x56.m.a(th);
            java.lang.NullPointerException nullPointerException = new java.lang.NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    @Override // p56.s
    public boolean b() {
        return this.f497434g.b();
    }

    @Override // p56.s
    public void c() {
        this.f497434g.c();
    }

    @Override // p56.q
    /* renamed from: createWorker */
    public p56.p mo157871x6217339a() {
        p56.p mo157871x6217339a = this.f497432e.mo157871x6217339a();
        s56.e eVar = new s56.e(new s56.d());
        w56.c cVar = new w56.c(eVar);
        p56.l b17 = p56.l.b(new s56.m(eVar, new t56.f0(this, mo157871x6217339a)));
        t56.g0 g0Var = new t56.g0(this, mo157871x6217339a, cVar);
        this.f497433f.a(b17);
        return g0Var;
    }
}
