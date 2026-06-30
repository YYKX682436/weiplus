package xn5;

/* loaded from: classes13.dex */
public final class l1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xn5.l1 f537226d = new xn5.l1();

    public l1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.y yVar;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Iterator it = ((java.util.LinkedHashMap) xn5.q1.f537247b).entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            jz5.f0 f0Var = jz5.f0.f384359a;
            if (!hasNext) {
                xn5.q1 q1Var = xn5.q1.f537246a;
                xn5.q1.f537249d = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CViewCreator", "fillingCacheViewList cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                return f0Var;
            }
            xn5.c0 c0Var = (xn5.c0) ((java.util.Map.Entry) it.next()).getValue();
            if (c0Var instanceof xn5.k1) {
                java.lang.ref.WeakReference weakReference = ((xn5.k1) c0Var).f537221e;
                if (weakReference == null || (yVar = (p012xc85e97e9.p093xedfae76a.y) weakReference.get()) == null) {
                    f0Var = null;
                } else if (yVar.mo273xed6858b4().b() == p012xc85e97e9.p093xedfae76a.n.DESTROYED) {
                    it.remove();
                } else {
                    xn5.q1.a(xn5.q1.f537246a, c0Var);
                }
                if (f0Var == null) {
                    xn5.q1 q1Var2 = xn5.q1.f537246a;
                    it.remove();
                }
            } else {
                xn5.q1.a(xn5.q1.f537246a, c0Var);
            }
        }
    }
}
