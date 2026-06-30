package w56;

/* loaded from: classes16.dex */
public class a extends p56.r {

    /* renamed from: h, reason: collision with root package name */
    public final p56.r f524575h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f524576i;

    public a(p56.r rVar) {
        super(rVar, true);
        this.f524575h = rVar;
    }

    @Override // p56.m
    public void a(java.lang.Object obj) {
        try {
            if (this.f524576i) {
                return;
            }
            this.f524575h.a(obj);
        } catch (java.lang.Throwable th6) {
            q56.f.c(th6, this);
        }
    }

    @Override // p56.m
    /* renamed from: onCompleted */
    public void mo157868xaa8b332c() {
        q56.n nVar;
        if (this.f524576i) {
            return;
        }
        this.f524576i = true;
        try {
            this.f524575h.mo157868xaa8b332c();
            try {
                c();
            } finally {
            }
        } catch (java.lang.Throwable th6) {
            try {
                q56.f.b(th6);
                x56.m.a(th6);
                throw new q56.h(th6.getMessage(), th6);
            } catch (java.lang.Throwable th7) {
                try {
                    c();
                    throw th7;
                } finally {
                }
            }
        }
    }

    @Override // p56.m
    /* renamed from: onError */
    public void mo157869xaf8aa769(java.lang.Throwable th6) {
        q56.f.b(th6);
        if (this.f524576i) {
            return;
        }
        this.f524576i = true;
        x56.m.a(th6);
        try {
            this.f524575h.mo157869xaf8aa769(th6);
            try {
                c();
            } catch (java.lang.Throwable th7) {
                x56.m.a(th7);
                throw new q56.i(th7);
            }
        } catch (q56.j e17) {
            try {
                c();
                throw e17;
            } catch (java.lang.Throwable th8) {
                x56.m.a(th8);
                throw new q56.j("Observer.onError not implemented and error while unsubscribing.", new q56.e(java.util.Arrays.asList(th6, th8)));
            }
        } catch (java.lang.Throwable th9) {
            x56.m.a(th9);
            try {
                c();
                throw new q56.i("Error occurred when trying to propagate error to Observer.onError", new q56.e(java.util.Arrays.asList(th6, th9)));
            } catch (java.lang.Throwable th10) {
                x56.m.a(th10);
                throw new q56.i("Error occurred when trying to propagate error to Observer.onError and during unsubscription.", new q56.e(java.util.Arrays.asList(th6, th9, th10)));
            }
        }
    }
}
