package i53;

/* loaded from: classes12.dex */
public class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370278d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370279e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.v3 f370280f;

    public u3(i53.v3 v3Var, long j17, long j18) {
        this.f370280f = v3Var;
        this.f370278d = j17;
        this.f370279e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f370280f.f370298g.f221613p.m64484x3ae760af((int) ((this.f370278d * 100) / this.f370279e));
    }
}
