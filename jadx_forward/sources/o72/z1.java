package o72;

/* loaded from: classes8.dex */
public class z1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dm.n3 f425063d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f425064e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425065f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f425066g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f425067h;

    public z1(dm.n3 n3Var, boolean z17, java.lang.String str, int i17, java.lang.Runnable runnable) {
        this.f425063d = n3Var;
        this.f425064e = z17;
        this.f425065f = str;
        this.f425066g = i17;
        this.f425067h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        dm.n3 n3Var = this.f425063d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(n3Var.f67643xc8a07680);
        java.lang.Long valueOf2 = java.lang.Long.valueOf(n3Var.f67645x88be67a1);
        boolean z17 = this.f425064e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Fav.FavApiLogic", "delete favItem id %d, localId %d, needBatchDel %B, do on worker thread", valueOf, valueOf2, java.lang.Boolean.valueOf(z17));
        o72.x1.m(n3Var, z17, this.f425065f, this.f425066g);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(this.f425067h);
        o72.x1.o(n3Var);
    }
}
