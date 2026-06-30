package s23;

/* loaded from: classes4.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.f f483835d = new s23.f();

    public f() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.d2 d2Var;
        java.util.Set entrySet = s23.n.f483843e.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.Iterator it = entrySet.iterator();
        do {
            d2Var = null;
            if (!it.hasNext()) {
                break;
            }
            s23.x xVar = (s23.x) ((java.util.Map.Entry) it.next()).getValue();
            if (xVar != null) {
                k33.b bVar = xVar.f483890u;
                r23.m mVar = bVar instanceof r23.m ? (r23.m) bVar : null;
                if (mVar != null) {
                    if (!mVar.isShowing()) {
                        mVar = null;
                    }
                    if (mVar != null) {
                        d2Var = mVar.f450373k;
                    }
                }
            }
        } while (d2Var == null);
        return d2Var;
    }
}
