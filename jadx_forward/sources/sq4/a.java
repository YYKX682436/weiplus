package sq4;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f492899a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f492900b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f492901c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f492902d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f492903e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f492904f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f492905g;

    public a(boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37) {
        this.f492899a = z17;
        this.f492900b = z18;
        this.f492901c = z19;
        this.f492902d = z27;
        this.f492903e = z28;
        this.f492904f = z29;
        this.f492905g = z37;
    }

    /* renamed from: toString */
    public java.lang.String m165056x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f492900b ? 1 : 2);
        sb6.append('#');
        sb6.append(this.f492901c ? 3 : 4);
        sb6.append('#');
        if (this.f492899a) {
            sb6.append(this.f492902d ? 5 : 6);
            sb6.append('#');
            sb6.append(this.f492903e ? 7 : 8);
            sb6.append('#');
            sb6.append(this.f492904f ? 9 : 10);
            sb6.append('#');
        }
        sb6.append(this.f492905g ? 14 : 13);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
