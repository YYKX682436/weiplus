package xj5;

/* loaded from: classes5.dex */
public final class k extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f536442b;

    public k(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f536441a = oldList;
        this.f536442b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        try {
            return ((xj5.a) this.f536441a.get(i17)).d((xj5.a) this.f536442b.get(i18));
        } catch (java.lang.Throwable unused) {
            return false;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        xj5.a aVar = (xj5.a) this.f536441a.get(i17);
        xj5.a aVar2 = (xj5.a) this.f536442b.get(i18);
        return aVar.h() == aVar2.h() && aVar.mo2128x1ed62e84() == aVar2.mo2128x1ed62e84();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f536442b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f536441a.size();
    }
}
