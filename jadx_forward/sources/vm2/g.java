package vm2;

/* loaded from: classes10.dex */
public final class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f519623a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f519624b;

    public g(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f519623a = oldList;
        this.f519624b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        in5.c cVar = (in5.c) this.f519623a.get(i17);
        boolean z17 = cVar instanceof vm2.k;
        java.util.List list = this.f519624b;
        if (z17) {
            vm2.k kVar = (vm2.k) cVar;
            in5.c other = (in5.c) list.get(i18);
            kVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
            if (kVar == other) {
                return true;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vm2.k.class, other.getClass()) && (other instanceof vm2.k)) {
                if (kVar.f519627d == ((vm2.k) other).f519627d) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof vm2.n)) {
            return false;
        }
        vm2.n nVar = (vm2.n) cVar;
        in5.c other2 = (in5.c) list.get(i18);
        nVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other2, "other");
        if (nVar == other2) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(vm2.n.class, other2.getClass()) || !(other2 instanceof vm2.n)) {
            return false;
        }
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(nVar.f519632d, ((vm2.n) other2).f519632d);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f519623a;
        int h17 = ((in5.c) list.get(i17)).h();
        java.util.List list2 = this.f519624b;
        return h17 == ((in5.c) list2.get(i18)).h() && ((in5.c) list.get(i17)).mo2128x1ed62e84() == ((in5.c) list2.get(i18)).mo2128x1ed62e84();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        return new android.os.Bundle();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f519624b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f519623a.size();
    }
}
