package ei3;

/* loaded from: classes10.dex */
public class e1 {

    /* renamed from: a, reason: collision with root package name */
    public ei3.l f334572a = ei3.l.Stop;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.SparseArray f334573b = new android.util.SparseArray();

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f334574c = new ei3.d1(this, android.os.Looper.getMainLooper());

    public void a(ei3.l lVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SightMediaStatusHandler", "status change to %s", lVar.toString());
        this.f334572a = lVar;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = this.f334574c;
        n3Var.mo50308x2936bf5f(n3Var.mo50292x733c63a2(257, lVar));
    }
}
