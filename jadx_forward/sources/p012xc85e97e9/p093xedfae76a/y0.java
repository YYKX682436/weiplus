package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f93200d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.m f93201e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93202f = false;

    public y0(p012xc85e97e9.p093xedfae76a.b0 b0Var, p012xc85e97e9.p093xedfae76a.m mVar) {
        this.f93200d = b0Var;
        this.f93201e = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f93202f) {
            return;
        }
        this.f93200d.f(this.f93201e);
        this.f93202f = true;
    }
}
