package cw2;

/* loaded from: classes11.dex */
public final class p5 extends cw2.q5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.Surface f305460a;

    /* renamed from: b, reason: collision with root package name */
    public final int f305461b;

    /* renamed from: c, reason: collision with root package name */
    public final int f305462c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(android.view.Surface surface, int i17, int i18) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        this.f305460a = surface;
        this.f305461b = i17;
        this.f305462c = i18;
    }

    /* renamed from: equals */
    public boolean m122914xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw2.p5)) {
            return false;
        }
        cw2.p5 p5Var = (cw2.p5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f305460a, p5Var.f305460a) && this.f305461b == p5Var.f305461b && this.f305462c == p5Var.f305462c;
    }

    /* renamed from: hashCode */
    public int m122915x8cdac1b() {
        return (((this.f305460a.hashCode() * 31) + java.lang.Integer.hashCode(this.f305461b)) * 31) + java.lang.Integer.hashCode(this.f305462c);
    }

    /* renamed from: toString */
    public java.lang.String m122916x9616526c() {
        return "Recreate(surface=" + this.f305460a + ", width=" + this.f305461b + ", height=" + this.f305462c + ')';
    }
}
