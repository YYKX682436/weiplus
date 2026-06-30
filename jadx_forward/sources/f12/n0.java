package f12;

/* loaded from: classes4.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f340181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f340183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f340184g;

    public n0(f12.o0 o0Var, java.lang.String str, long j17, long j18) {
        this.f340181d = o0Var;
        this.f340182e = str;
        this.f340183f = j17;
        this.f340184g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f340181d.f340192g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        h0Var.f(this.f340182e, this.f340183f, this.f340184g);
    }
}
