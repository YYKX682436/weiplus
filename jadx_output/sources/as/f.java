package as;

/* loaded from: classes8.dex */
public final class f implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.tencent.mm.storage.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        newFunctionMsgItem.field_needShow = false;
        if (h6Var != null) {
            if (h6Var.field_version < newFunctionMsgItem.field_version) {
                com.tencent.mars.xlog.Log.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, update the exist one, preVersion: %s oldFunctionMsgItem:%s", java.lang.Long.valueOf(h6Var.field_preVersion), h6Var);
                long j18 = h6Var.field_version;
                h6Var.field_preVersion = j18;
                newFunctionMsgItem.field_preVersion = j18;
                h6Var.field_actionTime = newFunctionMsgItem.field_actionTime;
                java.lang.String str = newFunctionMsgItem.field_custombuff;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                    h6Var.field_custombuff = str;
                }
                java.lang.String str2 = h6Var.field_functionmsgid;
                kotlin.jvm.internal.o.f(str2, "getFunctionMsgId(...)");
                storage.z0(str2, newFunctionMsgItem);
                timer.a(2, newFunctionMsgItem, this);
            } else {
                com.tencent.mars.xlog.Log.w("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show! but version is smaller");
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, insert a new one! %s", newFunctionMsgItem);
            storage.insert(newFunctionMsgItem);
            timer.a(2, newFunctionMsgItem, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(task, "task");
        qk.h6 h6Var = task.f456143b;
        if (h6Var.field_status != -1) {
            timer.d(task);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(h6Var);
        new xr.c(linkedList, dispatcher, new as.e(timer, task)).b();
    }
}
