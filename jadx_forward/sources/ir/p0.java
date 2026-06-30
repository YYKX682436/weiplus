package ir;

/* loaded from: classes15.dex */
public final class p0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f375421a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f375422b;

    public p0(java.util.List list, java.util.List list2) {
        this.f375421a = list;
        this.f375422b = list2;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        java.util.List list = this.f375421a;
        if (i17 >= list.size()) {
            return false;
        }
        java.util.List list2 = this.f375422b;
        if (i18 < list2.size()) {
            return ((ir.u0) list.get(i17)).a(list2.get(i18));
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f375421a;
        if (i17 >= list.size()) {
            return false;
        }
        java.util.List list2 = this.f375422b;
        if (i18 < list2.size()) {
            return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list.get(i17), list2.get(i18));
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f375422b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f375421a.size();
    }
}
