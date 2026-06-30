package i53;

/* loaded from: classes12.dex */
public class j3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f370151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f370152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.k3 f370153f;

    public j3(i53.k3 k3Var, long j17, long j18) {
        this.f370153f = k3Var;
        this.f370151d = j17;
        this.f370152e = j18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f370153f.f370169f.f370194d.m64484x3ae760af((int) ((this.f370151d * 100) / this.f370152e));
    }
}
