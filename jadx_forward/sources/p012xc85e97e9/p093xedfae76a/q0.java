package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class q0 implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: o, reason: collision with root package name */
    public static final p012xc85e97e9.p093xedfae76a.q0 f93173o = new p012xc85e97e9.p093xedfae76a.q0();

    /* renamed from: h, reason: collision with root package name */
    public android.os.Handler f93178h;

    /* renamed from: d, reason: collision with root package name */
    public int f93174d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f93175e = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f93176f = true;

    /* renamed from: g, reason: collision with root package name */
    public boolean f93177g = true;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f93179i = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f93180m = new p012xc85e97e9.p093xedfae76a.m0(this);

    /* renamed from: n, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.r0 f93181n = new p012xc85e97e9.p093xedfae76a.n0(this);

    public void a() {
        int i17 = this.f93175e + 1;
        this.f93175e = i17;
        if (i17 == 1) {
            if (!this.f93176f) {
                this.f93178h.removeCallbacks(this.f93180m);
            } else {
                this.f93179i.f(p012xc85e97e9.p093xedfae76a.m.ON_RESUME);
                this.f93176f = false;
            }
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f93179i;
    }
}
