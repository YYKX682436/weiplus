package p3321xbce91901.jvm.p3324x21ffc6bd;

/* loaded from: classes14.dex */
public abstract class a implements p3321xbce91901.jvm.p3324x21ffc6bd.k, java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f391635d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Class f391636e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f391637f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f391638g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f391639h;

    /* renamed from: i, reason: collision with root package name */
    public final int f391640i;

    /* renamed from: m, reason: collision with root package name */
    public final int f391641m;

    public a(int i17, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i18) {
        this.f391635d = obj;
        this.f391636e = cls;
        this.f391637f = str;
        this.f391638g = str2;
        this.f391639h = (i18 & 1) == 1;
        this.f391640i = i17;
        this.f391641m = i18 >> 1;
    }

    /* renamed from: equals */
    public boolean m143930xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3321xbce91901.jvm.p3324x21ffc6bd.a)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.a aVar = (p3321xbce91901.jvm.p3324x21ffc6bd.a) obj;
        return this.f391639h == aVar.f391639h && this.f391640i == aVar.f391640i && this.f391641m == aVar.f391641m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391635d, aVar.f391635d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f391636e, aVar.f391636e) && this.f391637f.equals(aVar.f391637f) && this.f391638g.equals(aVar.f391638g);
    }

    @Override // p3321xbce91901.jvm.p3324x21ffc6bd.k
    /* renamed from: getArity */
    public int mo134417x7429f927() {
        return this.f391640i;
    }

    /* renamed from: hashCode */
    public int m143931x8cdac1b() {
        java.lang.Object obj = this.f391635d;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Class cls = this.f391636e;
        return ((((((((((hashCode + (cls != null ? cls.hashCode() : 0)) * 31) + this.f391637f.hashCode()) * 31) + this.f391638g.hashCode()) * 31) + (this.f391639h ? 1231 : 1237)) * 31) + this.f391640i) * 31) + this.f391641m;
    }

    /* renamed from: toString */
    public java.lang.String m143932x9616526c() {
        return p3321xbce91901.jvm.p3324x21ffc6bd.i0.f391657a.h(this);
    }
}
