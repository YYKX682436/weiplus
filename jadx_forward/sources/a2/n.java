package a2;

/* loaded from: classes10.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final a2.o f82317a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82318b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82319c;

    public n(a2.o intrinsics, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intrinsics, "intrinsics");
        this.f82317a = intrinsics;
        this.f82318b = i17;
        this.f82319c = i18;
    }

    /* renamed from: equals */
    public boolean m377xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2.n)) {
            return false;
        }
        a2.n nVar = (a2.n) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f82317a, nVar.f82317a) && this.f82318b == nVar.f82318b && this.f82319c == nVar.f82319c;
    }

    /* renamed from: hashCode */
    public int m378x8cdac1b() {
        return (((this.f82317a.hashCode() * 31) + java.lang.Integer.hashCode(this.f82318b)) * 31) + java.lang.Integer.hashCode(this.f82319c);
    }

    /* renamed from: toString */
    public java.lang.String m379x9616526c() {
        return "ParagraphIntrinsicInfo(intrinsics=" + this.f82317a + ", startIndex=" + this.f82318b + ", endIndex=" + this.f82319c + ')';
    }
}
