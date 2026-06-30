package i33;

/* loaded from: classes3.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f369727a;

    /* renamed from: b, reason: collision with root package name */
    public int f369728b;

    public g1(android.view.View view, int i17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i18 & 2) != 0 ? -1 : i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f369727a = view;
        this.f369728b = i17;
    }

    /* renamed from: equals */
    public boolean m134684xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i33.g1)) {
            return false;
        }
        i33.g1 g1Var = (i33.g1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f369727a, g1Var.f369727a) && this.f369728b == g1Var.f369728b;
    }

    /* renamed from: hashCode */
    public int m134685x8cdac1b() {
        return (this.f369727a.hashCode() * 31) + java.lang.Integer.hashCode(this.f369728b);
    }

    /* renamed from: toString */
    public java.lang.String m134686x9616526c() {
        return "ViewVisibilitySnapshot(view=" + this.f369727a + ", visibility=" + this.f369728b + ')';
    }
}
