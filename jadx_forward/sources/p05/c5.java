package p05;

/* loaded from: classes10.dex */
public final class c5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.c5 f432009d = new p05.c5();

    public c5() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        p05.e5.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffectUtil", "start load ".concat(it));
        p05.l4.R.a();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        boolean g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.g(it);
        if (!g17) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XLabEffectUtil", "IExpansionsService load " + it + " failed");
                fp.d0.n(it);
                g17 = true;
            } catch (java.lang.Error unused) {
                boolean z17 = p05.e5.f432043a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.XLabEffectUtil", "LoadLibrary " + it + " fail");
            }
        }
        if (g17) {
            p05.e5.f432044b.remove(it);
        } else {
            p05.e5.f432044b.add(it);
        }
        boolean z18 = tq5.k.f502805a;
        java.util.HashSet hashSet = p05.e5.f432044b;
        tq5.k.f502805a = hashSet.isEmpty();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.XLabEffectUtil", "end load " + it + ", success " + g17 + ", list: " + hashSet);
        return jz5.f0.f384359a;
    }
}
