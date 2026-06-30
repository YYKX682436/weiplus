package yx3;

/* loaded from: classes15.dex */
public final class j extends yx3.k {

    /* renamed from: c, reason: collision with root package name */
    public final m8.d f549441c;

    /* renamed from: d, reason: collision with root package name */
    public final q9.h f549442d;

    /* renamed from: e, reason: collision with root package name */
    public float f549443e;

    /* renamed from: f, reason: collision with root package name */
    public m8.i0 f549444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dk4.a mediaInfo, vx3.c soundInfo, boolean z17) {
        super(mediaInfo, soundInfo, z17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaInfo, "mediaInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(soundInfo, "soundInfo");
        this.f549441c = new m8.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, null, 0);
        this.f549442d = new q9.h(new q9.a(new r9.p()));
        this.f549443e = 1.0f;
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.a(this, soundInfo));
    }

    @Override // yx3.k
    public void a(float f17, float f18) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.b(this, f17));
    }

    @Override // yx3.k
    public long b() {
        m8.i0 i0Var = this.f549444f;
        if (i0Var != null) {
            return i0Var.mo146925x9746038c();
        }
        return 0L;
    }

    @Override // yx3.k
    public int c() {
        return this.f549446b.f522804b;
    }

    @Override // yx3.k
    public boolean d() {
        m8.i0 i0Var = this.f549444f;
        if (i0Var != null && i0Var.t() == 3) {
            m8.i0 i0Var2 = this.f549444f;
            if (i0Var2 != null && i0Var2.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // yx3.k
    public void e() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.c(this));
    }

    @Override // yx3.k
    public void f() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.d(this));
    }

    @Override // yx3.k
    public void g(long j17) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.e(this, j17));
    }

    @Override // yx3.k
    public void h() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.f(this));
    }

    @Override // yx3.k
    public void i(boolean z17) {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.g(z17, this));
    }

    @Override // yx3.k
    public void j(yz5.l listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        m8.i0 i0Var = this.f549444f;
        if (i0Var != null) {
            i0Var.g(new yx3.h(listener));
        }
    }

    @Override // yx3.k
    public void k() {
        pm0.v.O("MicroMsg.RingtonePlayer", new yx3.i(this));
    }
}
