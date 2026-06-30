package cw1;

/* loaded from: classes12.dex */
public final class f6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f304470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cw1.l6 f304471e;

    public f6(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, cw1.l6 l6Var) {
        this.f304470d = c0Var;
        this.f304471e = l6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f304470d.f391645d) {
            return;
        }
        cw1.l6.b(this.f304471e);
    }
}
