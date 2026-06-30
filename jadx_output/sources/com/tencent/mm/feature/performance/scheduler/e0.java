package com.tencent.mm.feature.performance.scheduler;

/* loaded from: classes9.dex */
public final class e0 {
    public e0(kotlin.jvm.internal.i iVar) {
    }

    public final boolean a(java.lang.Class task, boolean z17) {
        kotlin.jvm.internal.o.g(task, "task");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_is_cancel", z17);
        bundle.putString("key_task_name", task.getName());
        com.tencent.mars.xlog.Log.i("MicroMsg.BgScheduler", "isCancel " + z17 + " task " + task.getName());
        com.tencent.mm.ipcinvoker.type.IPCBoolean iPCBoolean = (com.tencent.mm.ipcinvoker.type.IPCBoolean) com.tencent.mm.ipcinvoker.d0.f(com.tencent.mm.sdk.platformtools.w9.f193053a, bundle, com.tencent.mm.feature.performance.scheduler.f0.class);
        if (iPCBoolean != null) {
            return iPCBoolean.f68400d;
        }
        return false;
    }
}
