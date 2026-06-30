package dw2;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final so2.j5 f325647a;

    /* renamed from: b, reason: collision with root package name */
    public final in5.s0 f325648b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f325649c;

    public d(so2.j5 j5Var, in5.s0 s0Var) {
        this.f325647a = j5Var;
        this.f325648b = s0Var;
        this.f325649c = new java.util.LinkedList();
    }

    /* renamed from: equals */
    public boolean m126335xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw2.d)) {
            return false;
        }
        dw2.d dVar = (dw2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325647a, dVar.f325647a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f325648b, dVar.f325648b);
    }

    /* renamed from: hashCode */
    public int m126336x8cdac1b() {
        so2.j5 j5Var = this.f325647a;
        int hashCode = (j5Var == null ? 0 : j5Var.hashCode()) * 31;
        in5.s0 s0Var = this.f325648b;
        return hashCode + (s0Var != null ? s0Var.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m126337x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("VisibilityFeed:");
        int i17 = 0;
        for (java.lang.Object obj : this.f325649c) {
            int i18 = i17 + 1;
            java.lang.Integer num = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            sb6.append("[index:" + i17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("type:");
            so2.j5 j5Var = ((dw2.d) obj).f325647a;
            if (j5Var != null) {
                num = java.lang.Integer.valueOf(j5Var.h());
            }
            sb7.append(num);
            sb7.append(']');
            sb6.append(sb7.toString());
            i17 = i18;
        }
        java.lang.String sb8 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb8, "toString(...)");
        return sb8;
    }

    public /* synthetic */ d(so2.j5 j5Var, in5.s0 s0Var, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? null : j5Var, (i17 & 2) != 0 ? null : s0Var);
    }
}
