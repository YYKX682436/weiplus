package bm5;

/* loaded from: classes11.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bm5.m1 f22705d = new bm5.m1();

    public m1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bm5.o1 o1Var = bm5.o1.f22719a;
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("Repairer");
        bm5.o1.f22721c = M;
        int o17 = M != null ? M.o("RepairerConfig_Inner_Version_Int", 0) : 0;
        if (o17 != 1) {
            com.tencent.mm.sdk.platformtools.o4 o4Var = bm5.o1.f22721c;
            if (o4Var != null) {
                o4Var.e();
            }
            com.tencent.mm.sdk.platformtools.o4 o4Var2 = bm5.o1.f22721c;
            if (o4Var2 != null) {
                o4Var2.d();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.RepairerLogic", "diff version, clear all currentVersion:" + o17 + " currentVersion:1");
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("same version, currentVersion:1 ");
            com.tencent.mm.app.v5 a17 = com.tencent.mm.app.v5.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            sb6.append(a17 != null ? a17.name() : null);
            com.tencent.mars.xlog.Log.i("MicroMsg.RepairerLogic", sb6.toString());
        }
        com.tencent.mm.sdk.platformtools.o4 o4Var3 = bm5.o1.f22721c;
        if (o4Var3 != null) {
            o4Var3.A("RepairerConfig_Inner_Version_Int", 1);
        }
        bm5.o1.f22722d.set(true);
        java.util.Iterator it = ((java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) bm5.o1.f22723e).getValue()).iterator();
        while (it.hasNext()) {
            bm5.e1 e1Var = (bm5.e1) ((java.lang.ref.WeakReference) it.next()).get();
            if (e1Var != null) {
                e1Var.e();
            }
        }
        bm5.o1 o1Var2 = bm5.o1.f22719a;
        ((java.util.concurrent.ConcurrentLinkedDeque) ((jz5.n) bm5.o1.f22723e).getValue()).clear();
        return jz5.f0.f302826a;
    }
}
