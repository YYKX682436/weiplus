package bj0;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f102656a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f102657b;

    /* renamed from: c, reason: collision with root package name */
    public final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 f102658c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f102659d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f102660e;

    public q(int i17, java.lang.ref.WeakReference engine, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17, boolean z17, boolean z18, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 8) != 0 ? false : z17;
        z18 = (i18 & 16) != 0 ? false : z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(engine, "engine");
        this.f102656a = i17;
        this.f102657b = engine;
        this.f102658c = interfaceC28648x8c0b9e17;
        this.f102659d = z17;
        this.f102660e = z18;
    }

    /* renamed from: equals */
    public boolean m10654xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bj0.q)) {
            return false;
        }
        bj0.q qVar = (bj0.q) obj;
        return this.f102656a == qVar.f102656a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102657b, qVar.f102657b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f102658c, qVar.f102658c) && this.f102659d == qVar.f102659d && this.f102660e == qVar.f102660e;
    }

    /* renamed from: hashCode */
    public int m10655x8cdac1b() {
        int hashCode = ((java.lang.Integer.hashCode(this.f102656a) * 31) + this.f102657b.hashCode()) * 31;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.InterfaceC28648x8c0b9e17 interfaceC28648x8c0b9e17 = this.f102658c;
        return ((((hashCode + (interfaceC28648x8c0b9e17 == null ? 0 : interfaceC28648x8c0b9e17.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f102659d)) * 31) + java.lang.Boolean.hashCode(this.f102660e);
    }

    /* renamed from: toString */
    public java.lang.String m10656x9616526c() {
        return "ViewStackData(hash=" + this.f102656a + ", engine=" + this.f102657b + ", renderSurface=" + this.f102658c + ", finishing=" + this.f102659d + ", isActive=" + this.f102660e + ')';
    }
}
