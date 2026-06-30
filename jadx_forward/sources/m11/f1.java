package m11;

/* loaded from: classes12.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f404226d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k70.f0 f404227e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m11.l1 f404228f;

    public f1(m11.l1 l1Var, java.lang.String str, k70.f0 f0Var) {
        this.f404228f = l1Var;
        this.f404226d = str;
        this.f404227e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f404228f.b(this.f404226d, this.f404227e);
    }
}
