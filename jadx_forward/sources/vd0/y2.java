package vd0;

/* loaded from: classes8.dex */
public final class y2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f517074a;

    /* renamed from: b, reason: collision with root package name */
    public final vd0.c3 f517075b;

    /* renamed from: c, reason: collision with root package name */
    public final int f517076c;

    public y2(java.lang.ref.WeakReference activityRef, vd0.c3 searchIndex, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityRef, "activityRef");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(searchIndex, "searchIndex");
        this.f517074a = activityRef;
        this.f517075b = searchIndex;
        this.f517076c = i17;
    }

    /* renamed from: equals */
    public boolean m171573xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.y2)) {
            return false;
        }
        vd0.y2 y2Var = (vd0.y2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517074a, y2Var.f517074a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517075b, y2Var.f517075b) && this.f517076c == y2Var.f517076c;
    }

    /* renamed from: hashCode */
    public int m171574x8cdac1b() {
        return (((this.f517074a.hashCode() * 31) + this.f517075b.m171494x8cdac1b()) * 31) + java.lang.Integer.hashCode(this.f517076c);
    }

    /* renamed from: toString */
    public java.lang.String m171575x9616526c() {
        return "ActivityIndexHolder(activityRef=" + this.f517074a + ", searchIndex=" + this.f517075b + ", activityId=" + this.f517076c + ')';
    }
}
