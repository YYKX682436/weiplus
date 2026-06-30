package p05;

/* loaded from: classes3.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431985a;

    /* renamed from: b, reason: collision with root package name */
    public final long f431986b;

    /* renamed from: c, reason: collision with root package name */
    public int f431987c;

    public a4(java.lang.String path, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f431985a = path;
        this.f431986b = j17;
        this.f431987c = i17;
    }

    /* renamed from: equals */
    public boolean m157548xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p05.a4)) {
            return false;
        }
        p05.a4 a4Var = (p05.a4) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f431985a, a4Var.f431985a) && this.f431986b == a4Var.f431986b && this.f431987c == a4Var.f431987c;
    }

    /* renamed from: hashCode */
    public int m157549x8cdac1b() {
        return (((this.f431985a.hashCode() * 31) + java.lang.Long.hashCode(this.f431986b)) * 31) + java.lang.Integer.hashCode(this.f431987c);
    }

    /* renamed from: toString */
    public java.lang.String m157550x9616526c() {
        return "EffectRunningData(path=" + this.f431985a + ", ptr=" + this.f431986b + ", rate=" + this.f431987c + ')';
    }
}
