package oo1;

/* loaded from: classes5.dex */
public final class b implements oo1.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f428655a;

    /* renamed from: b, reason: collision with root package name */
    public long f428656b;

    /* renamed from: c, reason: collision with root package name */
    public long f428657c;

    /* renamed from: d, reason: collision with root package name */
    public long f428658d;

    /* renamed from: e, reason: collision with root package name */
    public long f428659e;

    public b(java.lang.String talker, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f428655a = talker;
        this.f428656b = j17;
        this.f428657c = j18;
        this.f428658d = j19;
        this.f428659e = j27;
    }

    /* renamed from: equals */
    public boolean m152048xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo1.b)) {
            return false;
        }
        oo1.b bVar = (oo1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f428655a, bVar.f428655a) && this.f428656b == bVar.f428656b && this.f428657c == bVar.f428657c && this.f428658d == bVar.f428658d && this.f428659e == bVar.f428659e;
    }

    /* renamed from: hashCode */
    public int m152049x8cdac1b() {
        return (((((((this.f428655a.hashCode() * 31) + java.lang.Long.hashCode(this.f428656b)) * 31) + java.lang.Long.hashCode(this.f428657c)) * 31) + java.lang.Long.hashCode(this.f428658d)) * 31) + java.lang.Long.hashCode(this.f428659e);
    }

    /* renamed from: toString */
    public java.lang.String m152050x9616526c() {
        return "RoamConvInfo(talker=" + this.f428655a + ", msgCount=" + this.f428656b + ", msgSize=" + this.f428657c + ", mediaSize=" + this.f428658d + ", lastCreateTime=" + this.f428659e + ')';
    }
}
