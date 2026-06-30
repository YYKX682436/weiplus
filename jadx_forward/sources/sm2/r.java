package sm2;

/* loaded from: classes3.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public boolean f491209d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491210e;

    public r(sm2.o4 o4Var) {
        this.f491210e = o4Var;
    }

    public final boolean a() {
        return this.f491209d;
    }

    public final void b(boolean z17) {
        this.f491209d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f491209d = false;
        sm2.o4 o4Var = this.f491210e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "closeMicHeartRunnable invoke");
        lk2.c.f400543e.a(o4Var.f101142a, 1, null);
    }
}
