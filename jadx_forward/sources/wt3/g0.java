package wt3;

/* loaded from: classes5.dex */
public class g0 extends wt3.e {

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f530950o;

    /* renamed from: p, reason: collision with root package name */
    public final long f530951p;

    /* renamed from: q, reason: collision with root package name */
    public final long f530952q;

    /* renamed from: r, reason: collision with root package name */
    public final int f530953r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(im5.b lifeCycleKeeper, java.lang.String videoPath, long j17, long j18, int i17) {
        super(lifeCycleKeeper, videoPath);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifeCycleKeeper, "lifeCycleKeeper");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoPath, "videoPath");
        this.f530950o = videoPath;
        this.f530951p = j17;
        this.f530952q = j18;
        this.f530953r = 1000;
        this.f530929e = i17;
    }

    @Override // wt3.e
    public wt3.n0 f(wt3.q classifier) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classifier, "classifier");
        return new wt3.e1(this.f530950o, this.f530951p, this.f530952q, this.f530929e, this.f530953r, new wt3.f0(this), classifier);
    }

    @Override // wt3.e
    public boolean i() {
        return true;
    }

    public void l(long j17) {
        this.f530928d = j17;
    }
}
