package s65;

/* loaded from: classes11.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f484973d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s65.e0 f484974e;

    public d0(s65.e0 e0Var, int i17) {
        this.f484974e = e0Var;
        this.f484973d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        s65.e0 e0Var = this.f484974e;
        s65.f0 f0Var = e0Var.f484978f;
        int i17 = f0Var.f484981b;
        int i18 = f0Var.f484980a;
        if (i17 <= i18) {
            f0Var.f484982c.a(i18, i17);
        }
        e0Var.f484978f.f484982c.c(this.f484973d);
    }
}
