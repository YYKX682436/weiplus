package mi1;

/* loaded from: classes7.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public int f408100a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f408101b;

    public h2(int i17, java.lang.Object obj, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        obj = (i18 & 2) != 0 ? null : obj;
        this.f408100a = i17;
        this.f408101b = obj;
    }

    /* renamed from: equals */
    public boolean m147340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mi1.h2)) {
            return false;
        }
        mi1.h2 h2Var = (mi1.h2) obj;
        return this.f408100a == h2Var.f408100a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408101b, h2Var.f408101b);
    }

    /* renamed from: hashCode */
    public int m147341x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f408100a) * 31;
        java.lang.Object obj = this.f408101b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m147342x9616526c() {
        return "State(state=" + this.f408100a + ", data=" + this.f408101b + ')';
    }
}
