package o20;

/* loaded from: classes14.dex */
public final class k extends o20.t {

    /* renamed from: a, reason: collision with root package name */
    public final o20.d0 f423924a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(o20.d0 error) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(error, "error");
        this.f423924a = error;
    }

    /* renamed from: equals */
    public boolean m150454xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o20.k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f423924a, ((o20.k) obj).f423924a);
    }

    /* renamed from: hashCode */
    public int m150455x8cdac1b() {
        return this.f423924a.m150450x8cdac1b();
    }

    /* renamed from: toString */
    public java.lang.String m150456x9616526c() {
        return "ERROR(error=" + this.f423924a + ')';
    }
}
