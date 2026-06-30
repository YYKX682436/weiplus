package bz4;

/* loaded from: classes7.dex */
public class d implements gp1.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f118345a;

    public d(bz4.e eVar, long j17) {
        this.f118345a = j17;
    }

    @Override // gp1.d0
    public void a(java.util.List list) {
        java.lang.String str;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) it.next();
            if (c12886x91aa2b6d.f174579d == 3 && c12886x91aa2b6d.G.getInt("eventType") == 1 && (str = c12886x91aa2b6d.f174582g) != null) {
                if (str.startsWith("" + this.f118345a)) {
                    ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().U(c12886x91aa2b6d);
                    return;
                }
            }
        }
    }
}
