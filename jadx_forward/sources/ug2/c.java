package ug2;

/* loaded from: classes3.dex */
public final class c implements ug2.f {

    /* renamed from: a, reason: collision with root package name */
    public final r45.ch1 f509049a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f509050b;

    /* renamed from: c, reason: collision with root package name */
    public long f509051c;

    public c(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        this.f509049a = msg;
        this.f509050b = jz5.h.b(new ug2.b(this));
    }

    @Override // ug2.f
    public void a(long j17) {
        this.f509051c = j17;
    }

    @Override // ug2.f
    public ug2.e b() {
        return ug2.e.f509056e;
    }

    @Override // ug2.f
    public long c() {
        return this.f509051c;
    }

    @Override // ug2.f
    /* renamed from: priority */
    public ug2.d mo167986xba8879a4() {
        return ug2.d.f509053e;
    }
}
