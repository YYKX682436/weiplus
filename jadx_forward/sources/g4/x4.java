package g4;

/* loaded from: classes5.dex */
public final class x4 {

    /* renamed from: e, reason: collision with root package name */
    public static final g4.x4 f350151e = new g4.x4(0, kz5.p0.f395529d);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f350152a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f350153b;

    /* renamed from: c, reason: collision with root package name */
    public final int f350154c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f350155d;

    public x4(int[] originalPageOffsets, java.util.List data, int i17, java.util.List list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalPageOffsets, "originalPageOffsets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f350152a = originalPageOffsets;
        this.f350153b = data;
        this.f350154c = i17;
        this.f350155d = list;
        if (!(originalPageOffsets.length == 0)) {
            if (list == null || list.size() == data.size()) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("If originalIndices (size = ");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list);
            sb6.append(list.size());
            sb6.append(") is provided, it must be same length as data (size = ");
            sb6.append(data.size());
            sb6.append(')');
            throw new java.lang.IllegalArgumentException(sb6.toString().toString());
        }
        throw new java.lang.IllegalArgumentException("originalPageOffsets cannot be empty when constructing TransformablePage".toString());
    }

    /* renamed from: equals */
    public boolean m130863xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g4.x4.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.TransformablePage<*>");
        }
        g4.x4 x4Var = (g4.x4) obj;
        return java.util.Arrays.equals(this.f350152a, x4Var.f350152a) && !(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350153b, x4Var.f350153b) ^ true) && this.f350154c == x4Var.f350154c && !(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f350155d, x4Var.f350155d) ^ true);
    }

    /* renamed from: hashCode */
    public int m130864x8cdac1b() {
        int hashCode = ((((java.util.Arrays.hashCode(this.f350152a) * 31) + this.f350153b.hashCode()) * 31) + this.f350154c) * 31;
        java.util.List list = this.f350155d;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130865x9616526c() {
        return "TransformablePage(originalPageOffsets=" + java.util.Arrays.toString(this.f350152a) + ", data=" + this.f350153b + ", hintOriginalPageOffset=" + this.f350154c + ", hintOriginalIndices=" + this.f350155d + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x4(int i17, java.util.List data) {
        this(new int[]{i17}, data, i17, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }
}
