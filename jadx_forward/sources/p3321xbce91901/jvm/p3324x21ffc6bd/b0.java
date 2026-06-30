package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes16.dex */
public abstract class b0 extends p3321xbce91901.jvm.p3324x21ffc6bd.e implements f06.v {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f391644d;

    public b0(java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i17) {
        super(obj, cls, str, str2, (i17 & 1) == 1);
        this.f391644d = (i17 & 2) == 2;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: compute */
    public f06.c mo143933x38a78837() {
        return this.f391644d ? this : super.mo143933x38a78837();
    }

    /* renamed from: equals */
    public boolean m143934xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p3321xbce91901.jvm.p3324x21ffc6bd.b0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.b0 b0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.b0) obj;
            return mo9625x74f198fd().equals(b0Var.mo9625x74f198fd()) && mo9624xfb82e301().equals(b0Var.mo9624xfb82e301()) && mo9626x3f6b0a02().equals(b0Var.mo9626x3f6b0a02()) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m143943x2404e5d7(), b0Var.m143943x2404e5d7());
        }
        if (obj instanceof f06.v) {
            return obj.equals(mo143933x38a78837());
        }
        return false;
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.e
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public f06.v mo143935xd3829966() {
        if (this.f391644d) {
            throw new java.lang.UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        f06.c mo143933x38a78837 = mo143933x38a78837();
        if (mo143933x38a78837 != this) {
            return (f06.v) mo143933x38a78837;
        }
        throw new xz5.b();
    }

    /* renamed from: hashCode */
    public int m143936x8cdac1b() {
        return (((mo9625x74f198fd().hashCode() * 31) + mo9624xfb82e301().hashCode()) * 31) + mo9626x3f6b0a02().hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143937x9616526c() {
        f06.c mo143933x38a78837 = mo143933x38a78837();
        if (mo143933x38a78837 != this) {
            return mo143933x38a78837.toString();
        }
        return "property " + mo9624xfb82e301() + " (Kotlin reflection is not available)";
    }

    public b0() {
        super(p3321xbce91901.jvm.p3324x21ffc6bd.e.f72681xc42f6aad, null, null, null, false);
        this.f391644d = false;
    }
}
