package if0;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final wu5.c f372566a;

    /* renamed from: b, reason: collision with root package name */
    public final int f372567b;

    public l(wu5.c task, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        this.f372566a = task;
        this.f372567b = i17;
    }

    /* renamed from: equals */
    public boolean m135170xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof if0.l)) {
            return false;
        }
        if0.l lVar = (if0.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f372566a, lVar.f372566a) && this.f372567b == lVar.f372567b;
    }

    /* renamed from: hashCode */
    public int m135171x8cdac1b() {
        return (this.f372566a.hashCode() * 31) + java.lang.Integer.hashCode(this.f372567b);
    }

    /* renamed from: toString */
    public java.lang.String m135172x9616526c() {
        return super.toString() + ", priority:" + this.f372567b + ", state:" + this.f372566a.mo144429x75286adb();
    }
}
