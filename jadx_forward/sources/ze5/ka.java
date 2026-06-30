package ze5;

/* loaded from: classes9.dex */
public abstract class ka {
    public static void a(android.widget.LinearLayout linearLayout, rd5.d dVar, yb5.d ui6, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 g0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        java.lang.Object[] objArr = {ze5.y8.a(te5.q0.f500260d, te5.t0.f500283d, te5.u0.f500284d)};
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        java.lang.Object obj = objArr[0];
        java.util.Objects.requireNonNull(obj);
        arrayList.add(obj);
        ze5.y8.b(java.util.Collections.unmodifiableList(arrayList), linearLayout, ui6, dVar, g0Var);
    }

    public static qd5.a b(rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        ic5.e eVar = ic5.f.f371970c;
        if (eVar.b(f9Var).isEmpty()) {
            return null;
        }
        java.lang.String b17 = eVar.b(dVar.f475787d.f526833b);
        java.lang.String v17 = dVar.v();
        if (v17 == null) {
            v17 = "";
        }
        return new ze5.u9(b17, v17);
    }
}
