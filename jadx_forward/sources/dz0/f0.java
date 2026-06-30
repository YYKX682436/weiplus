package dz0;

/* loaded from: classes5.dex */
public final class f0 implements ly0.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f326371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b f326372b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dz0.k0 f326373c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f326374d;

    public f0(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, com.p314xaae8f345.mm.p916x4268f0dc.p921x3304c6.uic.C11015x5b190a3b c11015x5b190a3b, dz0.k0 k0Var, java.lang.String str) {
        this.f326371a = e0Var;
        this.f326372b = c11015x5b190a3b;
        this.f326373c = k0Var;
        this.f326374d = str;
    }

    @Override // ly0.o
    public void a(int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f326371a;
        e0Var.f391648d += 0.25f / this.f326372b.f151331v.size();
        if (e0Var.f391648d > 0.75f) {
            e0Var.f391648d = 0.75f;
        }
        az0.e eVar = this.f326373c.f326435a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f326374d, e0Var.f391648d);
        }
    }

    @Override // ly0.o
    public void b() {
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f326371a;
        e0Var.f391648d += 0.25f / this.f326372b.f151331v.size();
        if (e0Var.f391648d > 0.5f) {
            e0Var.f391648d = 0.5f;
        }
        az0.e eVar = this.f326373c.f326435a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f326374d, e0Var.f391648d);
        }
    }

    @Override // ly0.o
    public void c(int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f326371a;
        e0Var.f391648d += 0.25f / this.f326372b.f151331v.size();
        if (e0Var.f391648d > 0.25f) {
            e0Var.f391648d = 0.25f;
        }
        az0.e eVar = this.f326373c.f326435a;
        if (eVar != null) {
            ((mz0.w1) eVar).a(this.f326374d, e0Var.f391648d);
        }
    }

    @Override // ly0.o
    public void d(int i17) {
    }
}
