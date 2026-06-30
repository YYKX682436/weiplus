package fl1;

/* loaded from: classes7.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f345292d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.g1 f345293e;

    public f1(fl1.g1 g1Var, int i17) {
        this.f345293e = g1Var;
        this.f345292d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f345293e.setProgress(this.f345292d);
    }
}
