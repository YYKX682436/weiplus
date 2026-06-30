package bu2;

/* loaded from: classes2.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f106049a;

    /* renamed from: b, reason: collision with root package name */
    public final int f106050b;

    /* renamed from: c, reason: collision with root package name */
    public final int f106051c;

    /* renamed from: d, reason: collision with root package name */
    public final r45.mb4 f106052d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f106053e;

    public h0(float f17, int i17, int i18, r45.mb4 mb4Var, java.util.List mediaList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaList, "mediaList");
        this.f106049a = f17;
        this.f106050b = i17;
        this.f106051c = i18;
        this.f106052d = mb4Var;
        this.f106053e = mediaList;
    }

    /* renamed from: equals */
    public boolean m11293xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.h0)) {
            return false;
        }
        bu2.h0 h0Var = (bu2.h0) obj;
        return java.lang.Float.compare(this.f106049a, h0Var.f106049a) == 0 && this.f106050b == h0Var.f106050b && this.f106051c == h0Var.f106051c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106052d, h0Var.f106052d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f106053e, h0Var.f106053e);
    }

    /* renamed from: hashCode */
    public int m11294x8cdac1b() {
        int hashCode = ((((java.lang.Float.hashCode(this.f106049a) * 31) + java.lang.Integer.hashCode(this.f106050b)) * 31) + java.lang.Integer.hashCode(this.f106051c)) * 31;
        r45.mb4 mb4Var = this.f106052d;
        return ((hashCode + (mb4Var == null ? 0 : mb4Var.hashCode())) * 31) + this.f106053e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m11295x9616526c() {
        return "MaxMediaHWInfo(ratioHW=" + this.f106049a + ", height=" + this.f106050b + ", width=" + this.f106051c + ", maxRadioMedia=" + this.f106052d + ", mediaList=" + this.f106053e + ')';
    }
}
