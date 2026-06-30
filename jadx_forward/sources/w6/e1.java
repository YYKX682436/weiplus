package w6;

/* loaded from: classes13.dex */
public class e1 implements w6.k, u6.d, w6.j {

    /* renamed from: d, reason: collision with root package name */
    public final w6.l f524628d;

    /* renamed from: e, reason: collision with root package name */
    public final w6.j f524629e;

    /* renamed from: f, reason: collision with root package name */
    public int f524630f;

    /* renamed from: g, reason: collision with root package name */
    public w6.g f524631g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f524632h;

    /* renamed from: i, reason: collision with root package name */
    public volatile a7.o0 f524633i;

    /* renamed from: m, reason: collision with root package name */
    public w6.h f524634m;

    public e1(w6.l lVar, w6.j jVar) {
        this.f524628d = lVar;
        this.f524629e = jVar;
    }

    @Override // w6.k
    public boolean a() {
        java.lang.Object obj = this.f524632h;
        if (obj != null) {
            this.f524632h = null;
            int i17 = q7.j.f441834b;
            long elapsedRealtimeNanos = android.os.SystemClock.elapsedRealtimeNanos();
            try {
                t6.d d17 = this.f524628d.d(obj);
                w6.i iVar = new w6.i(d17, obj, this.f524628d.f524674i);
                t6.h hVar = this.f524633i.f83379a;
                w6.l lVar = this.f524628d;
                this.f524634m = new w6.h(hVar, lVar.f524679n);
                ((w6.e0) lVar.f524673h).a().b(this.f524634m, iVar);
                if (android.util.Log.isLoggable("SourceGenerator", 2)) {
                    java.util.Objects.toString(this.f524634m);
                    obj.toString();
                    d17.toString();
                    q7.j.a(elapsedRealtimeNanos);
                }
                this.f524633i.f83381c.h();
                this.f524631g = new w6.g(java.util.Collections.singletonList(this.f524633i.f83379a), this.f524628d, this);
            } catch (java.lang.Throwable th6) {
                this.f524633i.f83381c.h();
                throw th6;
            }
        }
        w6.g gVar = this.f524631g;
        if (gVar != null && gVar.a()) {
            return true;
        }
        this.f524631g = null;
        this.f524633i = null;
        boolean z17 = false;
        while (!z17) {
            if (!(this.f524630f < ((java.util.ArrayList) this.f524628d.b()).size())) {
                break;
            }
            java.util.List b17 = this.f524628d.b();
            int i18 = this.f524630f;
            this.f524630f = i18 + 1;
            this.f524633i = (a7.o0) ((java.util.ArrayList) b17).get(i18);
            if (this.f524633i != null) {
                if (!this.f524628d.f524681p.c(this.f524633i.f83381c.b())) {
                    if (this.f524628d.c(this.f524633i.f83381c.a()) != null) {
                    }
                }
                this.f524633i.f83381c.e(this.f524628d.f524680o, this);
                z17 = true;
            }
        }
        return z17;
    }

    @Override // w6.j
    public void b(t6.h hVar, java.lang.Object obj, u6.e eVar, t6.a aVar, t6.h hVar2) {
        this.f524629e.b(hVar, obj, eVar, this.f524633i.f83381c.b(), hVar);
    }

    @Override // u6.d
    public void c(java.lang.Object obj) {
        w6.z zVar = this.f524628d.f524681p;
        if (obj == null || !zVar.c(this.f524633i.f83381c.b())) {
            this.f524629e.b(this.f524633i.f83379a, obj, this.f524633i.f83381c, this.f524633i.f83381c.b(), this.f524634m);
        } else {
            this.f524632h = obj;
            this.f524629e.i();
        }
    }

    @Override // w6.k
    /* renamed from: cancel */
    public void mo173234xae7a2e7a() {
        a7.o0 o0Var = this.f524633i;
        if (o0Var != null) {
            o0Var.f83381c.mo751xae7a2e7a();
        }
    }

    @Override // u6.d
    public void d(java.lang.Exception exc) {
        this.f524629e.j(this.f524634m, exc, this.f524633i.f83381c, this.f524633i.f83381c.b());
    }

    @Override // w6.j
    public void i() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // w6.j
    public void j(t6.h hVar, java.lang.Exception exc, u6.e eVar, t6.a aVar) {
        this.f524629e.j(hVar, exc, eVar, this.f524633i.f83381c.b());
    }
}
