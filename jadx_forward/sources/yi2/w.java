package yi2;

/* loaded from: classes2.dex */
public final class w extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f544125a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f544126b;

    public w(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f544125a = oldList;
        this.f544126b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f544125a.get(i17), this.f544126b.get(i18));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f544125a;
        int h17 = ((in5.c) list.get(i17)).h();
        java.util.List list2 = this.f544126b;
        return h17 == ((in5.c) list2.get(i18)).h() && ((in5.c) list.get(i17)).mo2128x1ed62e84() == ((in5.c) list2.get(i18)).mo2128x1ed62e84();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        return new android.os.Bundle();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f544126b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f544125a.size();
    }
}
