package db5;

/* loaded from: classes3.dex */
public class q7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ db5.d5 f310014d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f310015e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f310016f;

    public q7(db5.d5 d5Var, android.app.Activity activity, int i17) {
        this.f310014d = d5Var;
        this.f310015e = activity;
        this.f310016f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f310014d.showAtLocation(this.f310015e.getWindow().getDecorView(), 48, 0, this.f310016f);
    }
}
