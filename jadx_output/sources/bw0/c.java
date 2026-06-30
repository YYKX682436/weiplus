package bw0;

/* loaded from: classes5.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.l f24775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.a f24776e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw0.l lVar, bw0.a aVar) {
        super(1);
        this.f24775d = lVar;
        this.f24776e = aVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        bw0.l lVar = this.f24775d;
        sw0.b bVar = lVar.f24791o;
        if (bVar != null) {
            bw0.a aVar = this.f24776e;
            aVar.getClass();
            java.lang.String textStyleID = bVar.f413415b;
            kotlin.jvm.internal.o.g(textStyleID, "textStyleID");
            vw0.i0 i0Var = aVar.I;
            i0Var.getClass();
            java.util.Iterator it6 = i0Var.f440797t.f275970d.iterator();
            while (true) {
                obj2 = null;
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                if (kotlin.jvm.internal.o.b(((sw0.d) obj3).f413422a.f48224b, textStyleID)) {
                    break;
                }
            }
            sw0.d dVar = (sw0.d) obj3;
            if (dVar != null) {
                lVar.l7().w(dVar, null);
            }
            java.lang.String fontStyleID = bVar.f413417d;
            kotlin.jvm.internal.o.g(fontStyleID, "fontStyleID");
            i0Var.getClass();
            java.util.Iterator it7 = i0Var.f440799v.f275970d.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it7.next();
                if (kotlin.jvm.internal.o.b(((sw0.d) obj4).f413422a.f48224b, fontStyleID)) {
                    break;
                }
            }
            sw0.d dVar2 = (sw0.d) obj4;
            if (dVar2 != null) {
                lVar.l7().v(dVar2);
            }
            java.lang.String colorStyleID = bVar.f413416c;
            kotlin.jvm.internal.o.g(colorStyleID, "colorStyleID");
            java.util.Iterator it8 = i0Var.f440798u.f275970d.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.Object next = it8.next();
                if (kotlin.jvm.internal.o.b(((sw0.d) next).f413422a.f48224b, colorStyleID)) {
                    obj2 = next;
                    break;
                }
            }
            sw0.d dVar3 = (sw0.d) obj2;
            if (dVar3 != null) {
                lVar.l7().u(dVar3);
            }
        }
        return java.lang.Boolean.TRUE;
    }
}
