package yv0;

/* loaded from: classes5.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f547513a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f547514b;

    public n(java.util.List oldList, java.util.List newList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldList, "oldList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newList, "newList");
        this.f547513a = oldList;
        this.f547514b = newList;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean a(int i17, int i18) {
        yv0.p pVar = (yv0.p) this.f547514b.get(i18);
        yv0.p pVar2 = (yv0.p) this.f547513a.get(i17);
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f547518a, pVar2.f547518a) && pVar.f547519b == pVar2.f547519b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(pVar.f547522e, pVar2.f547522e);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public boolean b(int i17, int i18) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((yv0.p) this.f547514b.get(i18)).f547518a, ((yv0.p) this.f547513a.get(i17)).f547518a);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public java.lang.Object c(int i17, int i18) {
        yv0.p pVar = (yv0.p) this.f547514b.get(i18);
        yv0.p pVar2 = (yv0.p) this.f547513a.get(i17);
        int width = pVar.f547522e.width();
        int width2 = pVar2.f547522e.width();
        android.graphics.Rect rect = pVar.f547522e;
        android.graphics.Rect rect2 = pVar2.f547522e;
        if (width != width2 && rect.height() != rect2.height()) {
            return yv0.o.f547515d;
        }
        if (rect.left == rect2.left && rect.top == rect2.top) {
            return null;
        }
        return yv0.o.f547516e;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int d() {
        return this.f547514b.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.b0
    public int e() {
        return this.f547513a.size();
    }
}
