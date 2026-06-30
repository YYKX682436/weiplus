package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class g2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f102186a;

    public g2(int i17) {
        this.f102186a = new com.tencent.mm.sdk.platformtools.r2(i17);
    }

    public static void a(com.tencent.mm.plugin.finder.assist.g2 g2Var, long j17, java.lang.String taskID, yz5.a taskBlock, com.tencent.mm.plugin.finder.assist.h2 mode, oz5.l coroutineContext, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            taskID = "FinderDebouncedTask";
        }
        if ((i17 & 8) != 0) {
            mode = com.tencent.mm.plugin.finder.assist.h2.f102215d;
        }
        if ((i17 & 16) != 0) {
            coroutineContext = kotlinx.coroutines.q1.f310568a;
        }
        g2Var.getClass();
        kotlin.jvm.internal.o.g(taskID, "taskID");
        kotlin.jvm.internal.o.g(taskBlock, "taskBlock");
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(coroutineContext, "coroutineContext");
        com.tencent.mm.sdk.platformtools.r2 r2Var = g2Var.f102186a;
        com.tencent.mm.plugin.finder.assist.e2 e2Var = (com.tencent.mm.plugin.finder.assist.e2) r2Var.get(taskID);
        if (e2Var == null) {
            e2Var = new com.tencent.mm.plugin.finder.assist.e2(j17, mode, coroutineContext);
            r2Var.put(taskID, e2Var);
        }
        e2Var.a(new com.tencent.mm.plugin.finder.assist.f2(taskID, taskBlock));
    }
}
