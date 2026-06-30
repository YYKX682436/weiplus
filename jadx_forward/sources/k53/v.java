package k53;

/* loaded from: classes8.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f385938d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k53.b0 f385939e;

    public v(k53.c0 c0Var, p33.l lVar, k53.b0 b0Var) {
        this.f385938d = lVar;
        this.f385939e = b0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r90.l lVar = (r90.l) i95.n0.c(r90.l.class);
        java.lang.String str = this.f385938d.f433140i;
        ((q90.i) lVar).getClass();
        android.graphics.Bitmap p17 = ai3.d.p(str);
        if (p17 != null) {
            this.f385939e.f385872f.post(new k53.u(this, p17));
        }
    }
}
