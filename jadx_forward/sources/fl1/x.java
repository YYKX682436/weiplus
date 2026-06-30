package fl1;

/* loaded from: classes14.dex */
public class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.b2 f345421d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.c0 f345422e;

    public x(fl1.c0 c0Var, fl1.b2 b2Var) {
        this.f345422e = c0Var;
        this.f345421d = b2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f345422e.c(this.f345421d);
    }
}
