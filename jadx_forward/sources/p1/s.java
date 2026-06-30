package p1;

/* loaded from: classes14.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final long f432412a;

    /* renamed from: b, reason: collision with root package name */
    public final long f432413b;

    /* renamed from: c, reason: collision with root package name */
    public final long f432414c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f432415d;

    /* renamed from: e, reason: collision with root package name */
    public final long f432416e;

    /* renamed from: f, reason: collision with root package name */
    public final long f432417f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f432418g;

    /* renamed from: h, reason: collision with root package name */
    public final int f432419h;

    /* renamed from: i, reason: collision with root package name */
    public final long f432420i;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.List f432421j;

    /* renamed from: k, reason: collision with root package name */
    public p1.d f432422k;

    public s(long j17, long j18, long j19, boolean z17, long j27, long j28, boolean z18, boolean z19, int i17, long j29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f432412a = j17;
        this.f432413b = j18;
        this.f432414c = j19;
        this.f432415d = z17;
        this.f432416e = j27;
        this.f432417f = j28;
        this.f432418g = z18;
        this.f432419h = i17;
        this.f432420i = j29;
        this.f432422k = new p1.d(z19, z19);
    }

    public final void a() {
        p1.d dVar = this.f432422k;
        dVar.f432340b = true;
        dVar.f432339a = true;
    }

    public final boolean b() {
        p1.d dVar = this.f432422k;
        return dVar.f432340b || dVar.f432339a;
    }

    /* renamed from: toString */
    public java.lang.String m157659x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("PointerInputChange(id=");
        sb6.append((java.lang.Object) p1.r.b(this.f432412a));
        sb6.append(", uptimeMillis=");
        sb6.append(this.f432413b);
        sb6.append(", position=");
        sb6.append((java.lang.Object) d1.e.h(this.f432414c));
        sb6.append(", pressed=");
        sb6.append(this.f432415d);
        sb6.append(", previousUptimeMillis=");
        sb6.append(this.f432416e);
        sb6.append(", previousPosition=");
        sb6.append((java.lang.Object) d1.e.h(this.f432417f));
        sb6.append(", previousPressed=");
        sb6.append(this.f432418g);
        sb6.append(", isConsumed=");
        sb6.append(b());
        sb6.append(", type=");
        int i17 = this.f432419h;
        sb6.append((java.lang.Object) (i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        sb6.append(", historical=");
        java.lang.Object obj = this.f432421j;
        if (obj == null) {
            obj = kz5.p0.f395529d;
        }
        sb6.append(obj);
        sb6.append(",scrollDelta=");
        sb6.append((java.lang.Object) d1.e.h(this.f432420i));
        sb6.append(')');
        return sb6.toString();
    }

    public s(long j17, long j18, long j19, boolean z17, long j27, long j28, boolean z18, boolean z19, int i17, java.util.List list, long j29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(j17, j18, j19, z17, j27, j28, z18, z19, i17, j29, null);
        this.f432421j = list;
    }
}
