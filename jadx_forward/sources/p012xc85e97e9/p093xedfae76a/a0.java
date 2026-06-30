package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes13.dex */
public class a0 {

    /* renamed from: a, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.n f93131a;

    /* renamed from: b, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.v f93132b;

    public a0(p012xc85e97e9.p093xedfae76a.x xVar, p012xc85e97e9.p093xedfae76a.n nVar) {
        p012xc85e97e9.p093xedfae76a.v c1121x20fbdf84;
        java.util.Map map = p012xc85e97e9.p093xedfae76a.c0.f93147a;
        boolean z17 = xVar instanceof p012xc85e97e9.p093xedfae76a.v;
        boolean z18 = xVar instanceof p012xc85e97e9.p093xedfae76a.h;
        if (z17 && z18) {
            c1121x20fbdf84 = new p012xc85e97e9.p093xedfae76a.C1114x629e589e((p012xc85e97e9.p093xedfae76a.h) xVar, (p012xc85e97e9.p093xedfae76a.v) xVar);
        } else if (z18) {
            c1121x20fbdf84 = new p012xc85e97e9.p093xedfae76a.C1114x629e589e((p012xc85e97e9.p093xedfae76a.h) xVar, null);
        } else if (z17) {
            c1121x20fbdf84 = (p012xc85e97e9.p093xedfae76a.v) xVar;
        } else {
            java.lang.Class<?> cls = xVar.getClass();
            if (p012xc85e97e9.p093xedfae76a.c0.c(cls) == 2) {
                java.util.List list = (java.util.List) ((java.util.HashMap) p012xc85e97e9.p093xedfae76a.c0.f93148b).get(cls);
                if (list.size() == 1) {
                    p012xc85e97e9.p093xedfae76a.c0.a((java.lang.reflect.Constructor) list.get(0), xVar);
                    c1121x20fbdf84 = new p012xc85e97e9.p093xedfae76a.C1123x67e2663e(null);
                } else {
                    p012xc85e97e9.p093xedfae76a.j[] jVarArr = new p012xc85e97e9.p093xedfae76a.j[list.size()];
                    for (int i17 = 0; i17 < list.size(); i17++) {
                        p012xc85e97e9.p093xedfae76a.c0.a((java.lang.reflect.Constructor) list.get(i17), xVar);
                        jVarArr[i17] = null;
                    }
                    c1121x20fbdf84 = new p012xc85e97e9.p093xedfae76a.C1113xb5bf9902(jVarArr);
                }
            } else {
                c1121x20fbdf84 = new p012xc85e97e9.p093xedfae76a.C1121x20fbdf84(xVar);
            }
        }
        this.f93132b = c1121x20fbdf84;
        this.f93131a = nVar;
    }

    public void a(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m mVar) {
        p012xc85e97e9.p093xedfae76a.n h17 = mVar.h();
        p012xc85e97e9.p093xedfae76a.n nVar = this.f93131a;
        if (h17 != null && h17.compareTo(nVar) < 0) {
            nVar = h17;
        }
        this.f93131a = nVar;
        this.f93132b.mo2520xaba1ac62(yVar, mVar);
        this.f93131a = h17;
    }
}
