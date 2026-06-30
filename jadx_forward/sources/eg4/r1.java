package eg4;

/* loaded from: classes11.dex */
public class r1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f334320d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f334321e;

    public r1(eg4.t1 t1Var, java.lang.String str) {
        this.f334321e = t1Var;
        this.f334320d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        eg4.g1.a(this.f334321e.f334344o, null, this.f334320d, false);
    }
}
