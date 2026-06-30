package m11;

/* loaded from: classes9.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404212d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404213e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k70.f0 f404214f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f404215g;

    public e1(m11.l1 l1Var, java.lang.String str, java.lang.String str2, k70.f0 f0Var) {
        this.f404215g = l1Var;
        this.f404212d = str;
        this.f404213e = str2;
        this.f404214f = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404215g.d(this.f404212d, this.f404213e, this.f404214f);
    }
}
