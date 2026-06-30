package bm5;

/* loaded from: classes11.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bm5.m1 f104238d = new bm5.m1();

    public m1() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        bm5.o1 o1Var = bm5.o1.f104252a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("Repairer");
        bm5.o1.f104254c = M;
        int o17 = M != null ? M.o("RepairerConfig_Inner_Version_Int", 0) : 0;
        if (o17 != 1) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = bm5.o1.f104254c;
            if (o4Var != null) {
                o4Var.e();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = bm5.o1.f104254c;
            if (o4Var2 != null) {
                o4Var2.d();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerLogic", "diff version, clear all currentVersion:" + o17 + " currentVersion:1");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("same version, currentVersion:1 ");
            com.p314xaae8f345.mm.app.v5 a17 = com.p314xaae8f345.mm.app.v5.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
            sb6.append(a17 != null ? a17.name() : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RepairerLogic", sb6.toString());
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = bm5.o1.f104254c;
        if (o4Var3 != null) {
            o4Var3.A("RepairerConfig_Inner_Version_Int", 1);
        }
        bm5.o1.f104255d.set(true);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) bm5.o1.f104256e).mo141623x754a37bb()).iterator();
        while (it.hasNext()) {
            bm5.e1 e1Var = (bm5.e1) ((java.lang.ref.WeakReference) it.next()).get();
            if (e1Var != null) {
                e1Var.e();
            }
        }
        bm5.o1 o1Var2 = bm5.o1.f104252a;
        ((java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) bm5.o1.f104256e).mo141623x754a37bb()).clear();
        return jz5.f0.f384359a;
    }
}
