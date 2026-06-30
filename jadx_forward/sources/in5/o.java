package in5;

/* loaded from: classes2.dex */
public abstract class o {
    public static final void a(java.util.Set set) {
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            in5.j jVar = (in5.j) it.next();
            long a17 = hq.d.a();
            jVar.f374605c = a17;
            jVar.f374606d = a17 - jVar.f374604b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExposeTimeRecordListener", "updateTimeRecord: " + jVar);
        }
    }

    public static final void b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, in5.p pVar, yz5.l canStartExpose) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c1163xf1deaba4, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canStartExpose, "canStartExpose");
        ym5.a1.g(c1163xf1deaba4, new in5.l(pVar, canStartExpose));
        ym5.a1.h(c1163xf1deaba4, new in5.m(c1163xf1deaba4));
    }

    public static final void c(android.view.View view, in5.v vVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "<this>");
        ym5.a1.h(view, vVar != null ? new in5.n(vVar) : null);
    }
}
