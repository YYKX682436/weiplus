package to5;

/* loaded from: classes14.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicLong f502524j = new java.util.concurrent.atomic.AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final int f502525a;

    /* renamed from: b, reason: collision with root package name */
    public final cp5.a f502526b;

    /* renamed from: c, reason: collision with root package name */
    public final int f502527c;

    /* renamed from: d, reason: collision with root package name */
    public final int f502528d;

    /* renamed from: e, reason: collision with root package name */
    public final int f502529e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f502530f;

    /* renamed from: g, reason: collision with root package name */
    public final int f502531g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f502532h;

    /* renamed from: i, reason: collision with root package name */
    public final long f502533i;

    public a(int i17, cp5.a dataBuffer, int i18, int i19, int i27, boolean z17, int i28, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataBuffer, "dataBuffer");
        this.f502525a = i17;
        this.f502526b = dataBuffer;
        this.f502527c = i18;
        this.f502528d = i19;
        this.f502529e = i27;
        this.f502530f = z17;
        this.f502531g = i28;
        this.f502532h = z18;
        this.f502533i = f502524j.incrementAndGet();
    }

    /* renamed from: equals */
    public boolean m166842xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof to5.a)) {
            return false;
        }
        to5.a aVar = (to5.a) obj;
        return this.f502525a == aVar.f502525a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f502526b, aVar.f502526b) && this.f502527c == aVar.f502527c && this.f502528d == aVar.f502528d && this.f502529e == aVar.f502529e && this.f502530f == aVar.f502530f && this.f502531g == aVar.f502531g && this.f502532h == aVar.f502532h;
    }

    /* renamed from: hashCode */
    public int m166843x8cdac1b() {
        return (((((((((((((java.lang.Integer.hashCode(this.f502525a) * 31) + this.f502526b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f502527c)) * 31) + java.lang.Integer.hashCode(this.f502528d)) * 31) + java.lang.Integer.hashCode(this.f502529e)) * 31) + java.lang.Boolean.hashCode(this.f502530f)) * 31) + java.lang.Integer.hashCode(this.f502531g)) * 31) + java.lang.Boolean.hashCode(this.f502532h);
    }

    /* renamed from: toString */
    public java.lang.String m166844x9616526c() {
        return "DecodeResult(memberId=" + this.f502525a + ", dataBuffer=" + this.f502526b + ", w=" + this.f502527c + ", h=" + this.f502528d + ", format=" + this.f502529e + ", screenFrame=" + this.f502530f + ", ori=" + this.f502531g + ", landscapeMode=" + this.f502532h + ')';
    }
}
