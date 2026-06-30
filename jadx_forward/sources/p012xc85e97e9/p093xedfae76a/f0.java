package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public abstract class f0 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f93156d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93157e;

    /* renamed from: f, reason: collision with root package name */
    public int f93158f = -1;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.g0 f93159g;

    public f0(p012xc85e97e9.p093xedfae76a.g0 g0Var, p012xc85e97e9.p093xedfae76a.k0 k0Var) {
        this.f93159g = g0Var;
        this.f93156d = k0Var;
    }

    public void a(boolean z17) {
        if (z17 == this.f93157e) {
            return;
        }
        this.f93157e = z17;
        int i17 = z17 ? 1 : -1;
        p012xc85e97e9.p093xedfae76a.g0 g0Var = this.f93159g;
        g0Var.m7801x47643646(i17);
        if (this.f93157e) {
            g0Var.m7802xe907d129(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c(p012xc85e97e9.p093xedfae76a.y yVar) {
        return false;
    }

    public abstract boolean d();
}
