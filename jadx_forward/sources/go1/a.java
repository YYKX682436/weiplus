package go1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f355451a;

    /* renamed from: b, reason: collision with root package name */
    public final long f355452b;

    /* renamed from: c, reason: collision with root package name */
    public final long f355453c;

    /* renamed from: d, reason: collision with root package name */
    public final long f355454d;

    /* renamed from: e, reason: collision with root package name */
    public final long f355455e;

    public a(java.lang.String talker, long j17, long j18, long j19, long j27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        this.f355451a = talker;
        this.f355452b = j17;
        this.f355453c = j18;
        this.f355454d = j19;
        this.f355455e = j27;
    }

    /* renamed from: equals */
    public boolean m131934xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go1.a)) {
            return false;
        }
        go1.a aVar = (go1.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f355451a, aVar.f355451a) && this.f355452b == aVar.f355452b && this.f355453c == aVar.f355453c && this.f355454d == aVar.f355454d && this.f355455e == aVar.f355455e;
    }

    /* renamed from: hashCode */
    public int m131935x8cdac1b() {
        return (((((((this.f355451a.hashCode() * 31) + java.lang.Long.hashCode(this.f355452b)) * 31) + java.lang.Long.hashCode(this.f355453c)) * 31) + java.lang.Long.hashCode(this.f355454d)) * 31) + java.lang.Long.hashCode(this.f355455e);
    }

    /* renamed from: toString */
    public java.lang.String m131936x9616526c() {
        return "ConvInfo(talker=" + this.f355451a + ", startTime=" + this.f355452b + ", endTime=" + this.f355453c + ", estimatedSize=" + this.f355454d + ", fullDiffOff=" + this.f355455e + ')';
    }
}
