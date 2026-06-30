package es;

/* loaded from: classes15.dex */
public class r implements es.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ es.s f337806a;

    public r(es.s sVar) {
        this.f337806a = sVar;
    }

    @Override // es.f
    public void a() {
        mo128072xbb3aa236();
    }

    @Override // es.f
    public void b() {
    }

    @Override // es.f
    /* renamed from: onAnimationEnd */
    public void mo128072xbb3aa236() {
        this.f337806a.f337808e.f337811c.f146508v = true;
        new android.os.Handler().post(new es.q(this));
    }

    @Override // es.f
    /* renamed from: onAnimationStart */
    public void mo128073xd7e2f2fd() {
    }
}
