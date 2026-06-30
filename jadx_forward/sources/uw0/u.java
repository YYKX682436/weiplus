package uw0;

/* loaded from: classes5.dex */
public final class u implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513145d;

    public u(uw0.x xVar) {
        this.f513145d = xVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        sw0.a data = (sw0.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        uw0.x xVar = this.f513145d;
        xVar.getClass();
        r45.ol5 titleInfo = data.f494945a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleInfo, "titleInfo");
        sw0.a aVar = new sw0.a(titleInfo, true);
        pw0.b bVar = xVar.E1;
        bVar.getClass();
        java.util.ArrayList arrayList = bVar.f357503d;
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((sw0.a) it.next()).f494946b) {
                break;
            }
            i17++;
        }
        if (i17 >= 0) {
            java.lang.Object obj3 = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            r45.ol5 titleInfo2 = ((sw0.a) obj3).f494945a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleInfo2, "titleInfo");
            bVar.x(i17, new sw0.a(titleInfo2, false));
        }
        bVar.x(intValue, aVar);
        uw0.p pVar = xVar.C1;
        if (pVar != null) {
            uw0.t0 t0Var = (uw0.t0) pVar;
            java.lang.String m75945x2fec8307 = aVar.f494945a.m75945x2fec8307(0);
            if (m75945x2fec8307 != null) {
                t0Var.q7(m75945x2fec8307);
            }
        }
        return jz5.f0.f384359a;
    }
}
