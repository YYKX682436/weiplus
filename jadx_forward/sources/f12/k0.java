package f12;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f12.o0 f340165d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340166e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f340167f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f340168g;

    public k0(f12.o0 o0Var, java.lang.String str, long j17, long j18) {
        this.f340165d = o0Var;
        this.f340166e = str;
        this.f340167f = j17;
        this.f340168g = j18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        t21.h0 h0Var = this.f340165d.f340192g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(h0Var);
        h0Var.mo48220x9bb59ea0(this.f340166e, this.f340167f, this.f340168g);
    }
}
