package f12;

/* loaded from: classes4.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f340170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f340172f;

    public l0(f12.o0 o0Var, java.lang.String str, int i17) {
        this.f340170d = o0Var;
        this.f340171e = str;
        this.f340172f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f340170d.f340192g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        h0Var.o(this.f340171e, this.f340172f);
    }
}
