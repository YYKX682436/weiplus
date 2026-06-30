package p012xc85e97e9.p093xedfae76a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.lifecycle.LiveData$LifecycleBoundObserver */
/* loaded from: classes13.dex */
public class C1119x111ffcd8 extends p012xc85e97e9.p093xedfae76a.f0 implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.y f93118h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f93119i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1119x111ffcd8(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        super(g0Var, k0Var);
        this.f93119i = g0Var;
        this.f93118h = yVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f0
    public void b() {
        this.f93118h.mo273xed6858b4().c(this);
    }

    @Override // p012xc85e97e9.p093xedfae76a.f0
    public boolean c(p012xc85e97e9.p093xedfae76a.y yVar) {
        return this.f93118h == yVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.f0
    public boolean d() {
        return this.f93118h.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.STARTED);
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        p012xc85e97e9.p093xedfae76a.y yVar2 = this.f93118h;
        p012xc85e97e9.p093xedfae76a.n b17 = yVar2.mo273xed6858b4().b();
        if (b17 == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
            this.f93119i.mo522xb5bdeb7a(this.f93156d);
            return;
        }
        p012xc85e97e9.p093xedfae76a.n nVar = null;
        while (nVar != b17) {
            a(d());
            nVar = b17;
            b17 = yVar2.mo273xed6858b4().b();
        }
    }
}
