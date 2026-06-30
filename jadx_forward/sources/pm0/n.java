package pm0;

/* loaded from: classes8.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f438317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f438318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.k0 f438319f;

    public n(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        this.f438317d = g0Var;
        this.f438318e = yVar;
        this.f438319f = k0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object mo3195x754a37bb = this.f438317d.mo3195x754a37bb();
        if (mo3195x754a37bb == null || !this.f438318e.mo273xed6858b4().b().a(p012xc85e97e9.p093xedfae76a.n.STARTED)) {
            return;
        }
        this.f438319f.mo525x7bb163d5(mo3195x754a37bb);
    }
}
