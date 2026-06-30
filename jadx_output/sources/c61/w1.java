package c61;

@j95.b
/* loaded from: classes8.dex */
public final class w1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f39368d = jz5.h.b(c61.v1.f39338d);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        qb2.z0 z0Var;
        kotlin.jvm.internal.o.g(context, "context");
        super.onAccountInitialized(context);
        qb2.r1 r1Var = (qb2.r1) ((jz5.n) this.f39368d).getValue();
        r1Var.getClass();
        try {
            if (gm0.j1.a()) {
                long c17 = c01.id.c() - 259200000;
                qb2.u1 u1Var = qb2.u1.f361300a;
                u1Var.b(1, c17);
                java.util.List c18 = u1Var.c(1);
                java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = r1Var.f361284e;
                concurrentLinkedQueue.clear();
                java.util.Iterator it = c18.iterator();
                while (it.hasNext()) {
                    qb2.z0 t17 = r1Var.t((com.tencent.mm.plugin.finder.storage.zj0) it.next());
                    java.util.Map map = t17.f361319b;
                    java.lang.String str = (java.lang.String) map.get(".sysmsg.content.task_id");
                    if (str == null) {
                        str = "";
                    }
                    int D1 = com.tencent.mm.sdk.platformtools.t8.D1((java.lang.String) map.get(".sysmsg.content.last_deliver_time"), 0);
                    long c19 = c01.id.c();
                    if (D1 != 0) {
                        z0Var = t17;
                        if (c19 / 1000 > D1) {
                            com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "drop item taskId = " + str + " lastDeliverTime = " + D1 + " now = " + c19);
                            u1Var.d(str);
                        }
                    } else {
                        z0Var = t17;
                    }
                    com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "add item taskId = " + str + " lastDeliverTime = " + D1 + " now = " + c19);
                    concurrentLinkedQueue.add(z0Var);
                }
                com.tencent.mars.xlog.Log.i("Finder.GlobalPushNewXmlConsumer", "loadPendingList from disk, size = " + concurrentLinkedQueue.size());
                u1Var.a(1);
                r1Var.f361289j = true;
                com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
                r1Var.c(((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127617b7).getValue()).r()).intValue(), qb2.c1.f361185h);
            }
        } catch (java.lang.Throwable th6) {
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            th6.printStackTrace(new java.io.PrintWriter(stringWriter));
            pm0.z.b(xy2.b.f458155b, "finderGlobalPushError", false, null, null, false, false, new qb2.o1(stringWriter), 60, null);
        }
    }
}
