package zk3;

/* loaded from: classes8.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c f555058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555059e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, zk3.g0 g0Var) {
        super(0);
        this.f555058d = c16601x7ed0e40c;
        this.f555059e = g0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = this.f555058d;
        if (c16601x7ed0e40c != null) {
            zk3.g0 g0Var = this.f555059e;
            g0Var.f554985g.add(0, new uk3.a(c16601x7ed0e40c));
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = g0Var.f554995t;
            if (c22848x6ddd90cf != null) {
                c22848x6ddd90cf.m8149x8b456734(c22848x6ddd90cf.a0());
            }
            java.util.ArrayList arrayList = g0Var.f554985g;
            if (arrayList.size() == 1) {
                g0Var.d7(((uk3.a) arrayList.get(0)).f510057d, false, false);
            } else {
                g0Var.d7(null, true, false);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
            if (c22849x81a93d25 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(c22849x81a93d25, arrayList2.toArray(), "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
                c22849x81a93d25.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(c22849x81a93d25, "com/tencent/mm/plugin/multitask/ui/uic/MultiTaskMinusScreenUIC$onMultiTaskChange$1", "invoke", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            g0Var.X6();
            try {
                int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_multitask_max_item_num, 100);
                if (arrayList.size() > Ni) {
                    int size = arrayList.size();
                    for (int i17 = Ni; i17 < size; i17++) {
                        java.lang.Object obj = arrayList.get(i17);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.i1.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = ((uk3.a) obj).f510057d;
                        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0.We((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.j0) c17, c16601x7ed0e40c2.f66791xc8a07680, c16601x7ed0e40c2.f66793x2262335f, false, 4, null);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "INSERT, maxNum: " + Ni + ", curSize: " + arrayList.size());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "remove last multitask info error: %s", e17.getMessage());
            }
        }
        return jz5.f0.f384359a;
    }
}
