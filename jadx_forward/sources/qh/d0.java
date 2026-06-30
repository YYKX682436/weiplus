package qh;

/* loaded from: classes12.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f444864d = 1;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qh.f0 f444865e;

    public d0(qh.f0 f0Var, qh.b0 b0Var) {
        this.f444865e = f0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        qh.f0 f0Var = this.f444865e;
        if (f0Var.f444877p) {
            android.os.Message obtain = android.os.Message.obtain(f0Var.f444869e);
            obtain.what = this.f444864d;
            obtain.arg1 = 3;
            f0Var.f444869e.sendMessageAtFrontOfQueue(obtain);
            this.f444864d = this.f444864d == 2 ? 1 : 2;
            f0Var.f444869e.postDelayed(this, f0Var.f444880s);
        }
    }
}
