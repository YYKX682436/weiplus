package cr0;

/* loaded from: classes12.dex */
public final class d1 {

    /* renamed from: e, reason: collision with root package name */
    public static final jz5.g f303139e;

    /* renamed from: f, reason: collision with root package name */
    public static final jz5.g f303140f;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f303141a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f303142b;

    /* renamed from: c, reason: collision with root package name */
    public long f303143c;

    /* renamed from: d, reason: collision with root package name */
    public int f303144d;

    static {
        new cr0.c1(null);
        jz5.i iVar = jz5.i.f384362d;
        f303139e = jz5.h.a(iVar, cr0.b1.f303126d);
        f303140f = jz5.h.a(iVar, cr0.a1.f303114d);
    }

    public d1(java.lang.String str, java.lang.String str2, long j17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? "" : str;
        str2 = (i17 & 2) != 0 ? "" : str2;
        j17 = (i17 & 4) != 0 ? 0L : j17;
        this.f303141a = str;
        this.f303142b = str2;
        this.f303143c = j17;
    }

    /* renamed from: equals */
    public boolean m122504xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cr0.d1.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.matrix.battery.BinderTracker.PendingTimer");
        cr0.d1 d1Var = (cr0.d1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303141a, d1Var.f303141a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f303142b, d1Var.f303142b) && this.f303143c == d1Var.f303143c && this.f303144d == d1Var.f303144d;
    }

    /* renamed from: hashCode */
    public int m122505x8cdac1b() {
        return this.f303144d;
    }
}
