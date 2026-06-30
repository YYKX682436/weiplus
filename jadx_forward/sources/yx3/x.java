package yx3;

/* loaded from: classes10.dex */
public final class x extends yx3.k {

    /* renamed from: c, reason: collision with root package name */
    public final kk4.v f549501c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(dk4.a mediaInfo, vx3.c soundInfo, boolean z17) {
        super(mediaInfo, soundInfo, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soundInfo, "soundInfo");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f549501c = new kk4.v(context);
    }

    @Override // yx3.k
    public void a(float f17, float f18) {
        this.f549501c.K(f17);
    }

    @Override // yx3.k
    public long b() {
        return this.f549501c.o();
    }

    @Override // yx3.k
    public int c() {
        return this.f549446b.f522804b;
    }

    @Override // yx3.k
    public boolean d() {
        return this.f549501c.s();
    }

    @Override // yx3.k
    public void e() {
        kk4.b.i(this.f549501c, false, false, 3, null);
    }

    @Override // yx3.k
    public void f() {
        this.f549501c.O();
    }

    @Override // yx3.k
    public void g(long j17) {
        kk4.v vVar = this.f549501c;
        dk4.a aVar = this.f549445a;
        vVar.B(aVar);
        vVar.A(aVar.f316008l);
        vVar.f390118j = true;
        vVar.P = j17;
        vVar.F = this.f549446b.f522804b;
    }

    @Override // yx3.k
    public void h() {
        this.f549501c.mo143590x408b7293();
    }

    @Override // yx3.k
    public void i(boolean z17) {
        this.f549501c.C(z17);
    }

    @Override // yx3.k
    public void j(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f549501c.D(new yx3.w(listener));
    }

    @Override // yx3.k
    public void k() {
        this.f549501c.P();
    }
}
