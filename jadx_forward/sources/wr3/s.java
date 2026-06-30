package wr3;

/* loaded from: classes11.dex */
public final class s extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f530407a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f530408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f530409c;

    public s(wr3.n0 status, r45.s5 message, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f530407a = status;
        this.f530408b = message;
        this.f530409c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f530409c;
    }

    /* renamed from: equals */
    public boolean m174361xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.s)) {
            return false;
        }
        wr3.s sVar = (wr3.s) obj;
        return this.f530407a == sVar.f530407a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f530408b, sVar.f530408b) && this.f530409c == sVar.f530409c;
    }

    /* renamed from: hashCode */
    public int m174362x8cdac1b() {
        return (((this.f530407a.hashCode() * 31) + this.f530408b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f530409c);
    }

    /* renamed from: toString */
    public java.lang.String m174363x9616526c() {
        return "AudioDataItem(status=" + this.f530407a + ", message=" + this.f530408b + ", viewType=" + this.f530409c + ')';
    }
}
