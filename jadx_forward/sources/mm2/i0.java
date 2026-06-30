package mm2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f410664a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f410665b;

    /* renamed from: c, reason: collision with root package name */
    public final int f410666c;

    public i0(java.util.LinkedList linkedList, java.lang.String str, int i17) {
        this.f410664a = linkedList;
        this.f410665b = str;
        this.f410666c = i17;
    }

    /* renamed from: equals */
    public boolean m147963xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.i0)) {
            return false;
        }
        mm2.i0 i0Var = (mm2.i0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410664a, i0Var.f410664a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f410665b, i0Var.f410665b) && this.f410666c == i0Var.f410666c;
    }

    /* renamed from: hashCode */
    public int m147964x8cdac1b() {
        java.util.LinkedList linkedList = this.f410664a;
        int hashCode = (linkedList == null ? 0 : linkedList.hashCode()) * 31;
        java.lang.String str = this.f410665b;
        return ((hashCode + (str != null ? str.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f410666c);
    }

    /* renamed from: toString */
    public java.lang.String m147965x9616526c() {
        return "LiveCheerInfo(cheerIconInfo=" + this.f410664a + ", cheerBtnUrl=" + this.f410665b + ", enable=" + this.f410666c + ')';
    }
}
