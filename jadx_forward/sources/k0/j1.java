package k0;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final long f384467a;

    /* renamed from: b, reason: collision with root package name */
    public final long f384468b;

    public j1(long j17, long j18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f384467a = j17;
        this.f384468b = j18;
    }

    /* renamed from: equals */
    public boolean m141663xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0.j1)) {
            return false;
        }
        k0.j1 j1Var = (k0.j1) obj;
        return e1.y.c(this.f384467a, j1Var.f384467a) && e1.y.c(this.f384468b, j1Var.f384468b);
    }

    /* renamed from: hashCode */
    public int m141664x8cdac1b() {
        int i17 = e1.y.f327854l;
        return (java.lang.Long.hashCode(this.f384467a) * 31) + java.lang.Long.hashCode(this.f384468b);
    }

    /* renamed from: toString */
    public java.lang.String m141665x9616526c() {
        return "SelectionColors(selectionHandleColor=" + ((java.lang.Object) e1.y.i(this.f384467a)) + ", selectionBackgroundColor=" + ((java.lang.Object) e1.y.i(this.f384468b)) + ')';
    }
}
