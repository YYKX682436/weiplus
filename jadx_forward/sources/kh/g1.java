package kh;

/* loaded from: classes12.dex */
public final class g1 {

    /* renamed from: f, reason: collision with root package name */
    public static final kh.f1 f389338f = new kh.f1(null);

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f389339g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f389340h;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f389341a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f389342b;

    /* renamed from: c, reason: collision with root package name */
    public int f389343c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f389344d;

    /* renamed from: e, reason: collision with root package name */
    public int f389345e;

    static {
        jz5.i iVar = jz5.i.f384362d;
        f389339g = jz5.h.a(iVar, kh.e1.f389319d);
        f389340h = jz5.h.a(iVar, kh.d1.f389310d);
    }

    public g1(java.lang.String str, java.lang.String str2, int i17, java.lang.Object obj, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 1) != 0 ? "" : str;
        str2 = (i18 & 2) != 0 ? "" : str2;
        i17 = (i18 & 4) != 0 ? 0 : i17;
        obj = (i18 & 8) != 0 ? null : obj;
        this.f389341a = str;
        this.f389342b = str2;
        this.f389343c = i17;
        this.f389344d = obj;
    }

    public final java.lang.String a() {
        if (!(this.f389342b.length() == 0) && !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389342b, "null")) {
            return this.f389342b;
        }
        return this.f389341a + '-' + this.f389343c;
    }

    /* renamed from: equals */
    public boolean m143417xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kh.g1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.matrix.battery.LooperTaskMonitorFeatureKt.PendingTimer");
        kh.g1 g1Var = (kh.g1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389341a, g1Var.f389341a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389342b, g1Var.f389342b) && this.f389343c == g1Var.f389343c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f389344d, g1Var.f389344d) && this.f389345e == g1Var.f389345e;
    }

    /* renamed from: hashCode */
    public int m143418x8cdac1b() {
        return this.f389345e;
    }
}
