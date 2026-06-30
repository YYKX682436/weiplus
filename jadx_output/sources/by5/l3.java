package by5;

/* loaded from: classes13.dex */
public class l3 implements qx5.j {
    @Override // qx5.j
    public qx5.a a(android.content.Context context, android.net.Uri uri, qx5.l lVar) {
        java.util.Iterator it = ((java.util.ArrayList) cy5.m.b()).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ((cy5.h) it.next()).u(-1, true);
        }
        java.lang.String l17 = by5.z3.l();
        return !(l17.isEmpty() ? true : by5.u.h(l17)) ? qx5.a.a() : qx5.a.b();
    }
}
