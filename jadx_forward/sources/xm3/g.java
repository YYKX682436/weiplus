package xm3;

/* loaded from: classes4.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536846a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f536847b;

    public g(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f536846a = oldList;
        this.f536847b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        java.lang.Object a07 = kz5.n0.a0(this.f536846a, i17);
        java.lang.Object a08 = kz5.n0.a0(this.f536847b, i18);
        if (a07 == null || a08 == null) {
            return false;
        }
        return ((xm3.d) a07).X((xm3.d) a08);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        java.lang.Object a07 = kz5.n0.a0(this.f536846a, i17);
        java.lang.Object a08 = kz5.n0.a0(this.f536847b, i18);
        if (a07 == null || a08 == null) {
            return false;
        }
        return ((xm3.d) a07).s0((xm3.d) a08);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f536847b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f536846a.size();
    }
}
