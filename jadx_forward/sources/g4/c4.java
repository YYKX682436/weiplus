package g4;

/* loaded from: classes5.dex */
public final class c4 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f349774a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Integer f349775b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.h3 f349776c;

    /* renamed from: d, reason: collision with root package name */
    public final int f349777d;

    public c4(java.util.List pages, java.lang.Integer num, g4.h3 config, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pages, "pages");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f349774a = pages;
        this.f349775b = num;
        this.f349776c = config;
        this.f349777d = i17;
    }

    public final g4.z3 a(int i17) {
        java.util.List list = this.f349774a;
        int i18 = 0;
        boolean z17 = true;
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (!((g4.z3) it.next()).f350186a.isEmpty()) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            return null;
        }
        int i19 = i17 - this.f349777d;
        while (i18 < kz5.c0.h(list) && i19 > kz5.c0.h(((g4.z3) list.get(i18)).f350186a)) {
            i19 -= ((g4.z3) list.get(i18)).f350186a.size();
            i18++;
        }
        return i19 < 0 ? (g4.z3) kz5.n0.X(list) : (g4.z3) list.get(i18);
    }

    /* renamed from: equals */
    public boolean m130827xb2c87fbf(java.lang.Object obj) {
        if (obj instanceof g4.c4) {
            g4.c4 c4Var = (g4.c4) obj;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349774a, c4Var.f349774a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349775b, c4Var.f349775b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f349776c, c4Var.f349776c) && this.f349777d == c4Var.f349777d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m130828x8cdac1b() {
        int hashCode = this.f349774a.hashCode();
        java.lang.Integer num = this.f349775b;
        return hashCode + (num != null ? num.hashCode() : 0) + this.f349776c.hashCode() + java.lang.Integer.hashCode(this.f349777d);
    }

    /* renamed from: toString */
    public java.lang.String m130829x9616526c() {
        return "PagingState(pages=" + this.f349774a + ", anchorPosition=" + this.f349775b + ", config=" + this.f349776c + ", leadingPlaceholderCount=" + this.f349777d + ')';
    }
}
