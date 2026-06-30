package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1734x55baa833.ui;

/* loaded from: classes5.dex */
public final class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f220389a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f220390b;

    public r(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f220389a = oldList;
        this.f220390b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        w33.c cVar = (w33.c) this.f220389a.get(i17);
        w33.c cVar2 = (w33.c) this.f220390b.get(i18);
        if (cVar.f524244c == cVar2.f524244c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f524242a, cVar2.f524242a)) {
            w33.e eVar = cVar.f524243b;
            java.lang.String str = eVar.f524249b;
            w33.e eVar2 = cVar2.f524243b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, eVar2.f524249b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(eVar.f524250c, eVar2.f524250c) && cVar.f524245d == cVar2.f524245d) {
                return true;
            }
        }
        return false;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((w33.c) this.f220389a.get(i17)).f524243b.f524248a, ((w33.c) this.f220390b.get(i18)).f524243b.f524248a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f220390b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f220389a.size();
    }
}
