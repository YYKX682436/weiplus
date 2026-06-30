package g4;

/* loaded from: classes5.dex */
public final class i1 extends g4.l1 {

    /* renamed from: f, reason: collision with root package name */
    public static final g4.i1 f349900f;

    /* renamed from: g, reason: collision with root package name */
    public static final g4.g1 f349901g;

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f349902a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f349903b;

    /* renamed from: c, reason: collision with root package name */
    public final int f349904c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349905d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.a0 f349906e;

    static {
        g4.g1 g1Var = new g4.g1(null);
        f349901g = g1Var;
        g4.x4 x4Var = g4.x4.f350151e;
        java.util.List c17 = kz5.b0.c(g4.x4.f350151e);
        g4.x0 x0Var = g4.x0.f350138c;
        g4.x0 x0Var2 = g4.x0.f350137b;
        f349900f = g1Var.a(c17, 0, 0, new g4.a0(x0Var, x0Var2, x0Var2, new g4.z0(x0Var, x0Var2, x0Var2), null, 16, null));
    }

    public i1(g4.a1 a1Var, java.util.List list, int i17, int i18, g4.a0 a0Var) {
        super(null);
        this.f349902a = a1Var;
        this.f349903b = list;
        this.f349904c = i17;
        this.f349905d = i18;
        this.f349906e = a0Var;
        if (!(a1Var == g4.a1.APPEND || i17 >= 0)) {
            throw new java.lang.IllegalArgumentException(("Prepend insert defining placeholdersBefore must be > 0, but was " + i17).toString());
        }
        if (a1Var == g4.a1.PREPEND || i18 >= 0) {
            if (!(a1Var != g4.a1.REFRESH || (list.isEmpty() ^ true))) {
                throw new java.lang.IllegalArgumentException("Cannot create a REFRESH Insert event with no TransformablePages as this could permanently stall pagination. Note that this check does not prevent empty LoadResults and is instead usually an indication of an internal error in Paging itself.".toString());
            }
        } else {
            throw new java.lang.IllegalArgumentException(("Append insert defining placeholdersAfter must be > 0, but was " + i18).toString());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.util.Collection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ed -> B:10:0x00f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0090 -> B:19:0x00b2). Please report as a decompilation issue!!! */
    @Override // g4.l1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(yz5.p r19, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r20) {
        /*
            Method dump skipped, instructions count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g4.i1.a(yz5.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* renamed from: equals */
    public boolean m130839xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.i1)) {
            return false;
        }
        g4.i1 i1Var = (g4.i1) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349902a, i1Var.f349902a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349903b, i1Var.f349903b) && this.f349904c == i1Var.f349904c && this.f349905d == i1Var.f349905d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349906e, i1Var.f349906e);
    }

    /* renamed from: hashCode */
    public int m130840x8cdac1b() {
        g4.a1 a1Var = this.f349902a;
        int hashCode = (a1Var != null ? a1Var.hashCode() : 0) * 31;
        java.util.List list = this.f349903b;
        int hashCode2 = (((((hashCode + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f349904c)) * 31) + java.lang.Integer.hashCode(this.f349905d)) * 31;
        g4.a0 a0Var = this.f349906e;
        return hashCode2 + (a0Var != null ? a0Var.m130819x8cdac1b() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m130841x9616526c() {
        return "Insert(loadType=" + this.f349902a + ", pages=" + this.f349903b + ", placeholdersBefore=" + this.f349904c + ", placeholdersAfter=" + this.f349905d + ", combinedLoadStates=" + this.f349906e + ")";
    }
}
