package sj3;

/* loaded from: classes14.dex */
public final class u3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.d4 f490309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f490310e;

    public u3(sj3.d4 d4Var, boolean z17) {
        this.f490309d = d4Var;
        this.f490310e = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        sj3.d4 d4Var = this.f490309d;
        sj3.q3 q3Var = d4Var.f490008d;
        if (q3Var == null || d4Var.f490011g || q3Var == null) {
            return;
        }
        q3Var.c(this.f490310e);
    }
}
