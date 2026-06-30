package t16;

/* loaded from: classes15.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final n16.b f496144a;

    /* renamed from: b, reason: collision with root package name */
    public final int f496145b;

    public f(n16.b classId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        this.f496144a = classId;
        this.f496145b = i17;
    }

    /* renamed from: equals */
    public boolean m165626xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t16.f)) {
            return false;
        }
        t16.f fVar = (t16.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f496144a, fVar.f496144a) && this.f496145b == fVar.f496145b;
    }

    /* renamed from: hashCode */
    public int m165627x8cdac1b() {
        return (this.f496144a.m148881x8cdac1b() * 31) + java.lang.Integer.hashCode(this.f496145b);
    }

    /* renamed from: toString */
    public java.lang.String m165628x9616526c() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = 0;
        while (true) {
            i17 = this.f496145b;
            if (i18 >= i17) {
                break;
            }
            sb6.append("kotlin/Array<");
            i18++;
        }
        sb6.append(this.f496144a);
        for (int i19 = 0; i19 < i17; i19++) {
            sb6.append(">");
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
