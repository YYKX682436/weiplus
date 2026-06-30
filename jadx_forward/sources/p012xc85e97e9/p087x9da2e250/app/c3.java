package p012xc85e97e9.p087x9da2e250.app;

/* loaded from: classes13.dex */
public class c3 implements o4.g {

    /* renamed from: d, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.b0 f92804d = null;

    /* renamed from: e, reason: collision with root package name */
    public o4.f f92805e = null;

    public void a(p012xc85e97e9.p093xedfae76a.m mVar) {
        this.f92804d.f(mVar);
    }

    public void b() {
        if (this.f92804d == null) {
            this.f92804d = new p012xc85e97e9.p093xedfae76a.b0(this, true);
            this.f92805e = new o4.f(this, null);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        b();
        return this.f92804d;
    }

    @Override // o4.g
    /* renamed from: getSavedStateRegistry */
    public o4.b mo2511xdf516e9d() {
        return this.f92805e.f424342b;
    }
}
