package bw0;

/* loaded from: classes5.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw0.l f106308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw0.a f106309e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(bw0.l lVar, bw0.a aVar) {
        super(1);
        this.f106308d = lVar;
        this.f106309e = aVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Object obj2;
        java.lang.Object obj3;
        java.lang.Object obj4;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        bw0.l lVar = this.f106308d;
        sw0.b bVar = lVar.f106324o;
        if (bVar != null) {
            bw0.a aVar = this.f106309e;
            aVar.getClass();
            java.lang.String textStyleID = bVar.f494948b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textStyleID, "textStyleID");
            vw0.i0 i0Var = aVar.I;
            i0Var.getClass();
            java.util.Iterator it6 = i0Var.f522330t.f357503d.iterator();
            while (true) {
                obj2 = null;
                if (!it6.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it6.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sw0.d) obj3).f494955a.f129757b, textStyleID)) {
                    break;
                }
            }
            sw0.d dVar = (sw0.d) obj3;
            if (dVar != null) {
                lVar.l7().w(dVar, null);
            }
            java.lang.String fontStyleID = bVar.f494950d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontStyleID, "fontStyleID");
            i0Var.getClass();
            java.util.Iterator it7 = i0Var.f522332v.f357503d.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj4 = null;
                    break;
                }
                obj4 = it7.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sw0.d) obj4).f494955a.f129757b, fontStyleID)) {
                    break;
                }
            }
            sw0.d dVar2 = (sw0.d) obj4;
            if (dVar2 != null) {
                lVar.l7().v(dVar2);
            }
            java.lang.String colorStyleID = bVar.f494949c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(colorStyleID, "colorStyleID");
            java.util.Iterator it8 = i0Var.f522331u.f357503d.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                }
                java.lang.Object next = it8.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((sw0.d) next).f494955a.f129757b, colorStyleID)) {
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
