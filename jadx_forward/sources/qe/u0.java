package qe;

/* loaded from: classes7.dex */
public class u0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f443527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f443528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qe.v0 f443529f;

    public u0(qe.v0 v0Var, java.lang.String str, long j17, int i17) {
        this.f443529f = v0Var;
        this.f443527d = j17;
        this.f443528e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f443529f.f443532c.f443468h.m83417x65d02670(this.f443527d, this.f443528e);
    }
}
