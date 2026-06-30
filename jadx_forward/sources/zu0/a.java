package zu0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 f557194a;

    /* renamed from: b, reason: collision with root package name */
    public final int f557195b;

    /* renamed from: c, reason: collision with root package name */
    public final int f557196c;

    public a(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.p472x58ceaf0.C4094x2bd762a1 assetInfo, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(assetInfo, "assetInfo");
        this.f557194a = assetInfo;
        this.f557195b = i17;
        this.f557196c = i18;
    }

    /* renamed from: equals */
    public boolean m179472xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu0.a)) {
            return false;
        }
        zu0.a aVar = (zu0.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557194a, aVar.f557194a) && this.f557195b == aVar.f557195b && this.f557196c == aVar.f557196c;
    }

    /* renamed from: hashCode */
    public int m179473x8cdac1b() {
        return (((this.f557194a.hashCode() * 31) + java.lang.Integer.hashCode(this.f557195b)) * 31) + java.lang.Integer.hashCode(this.f557196c);
    }

    /* renamed from: toString */
    public java.lang.String m179474x9616526c() {
        return "MCMediaFile(assetInfo=" + this.f557194a + ", width=" + this.f557195b + ", height=" + this.f557196c + ')';
    }
}
