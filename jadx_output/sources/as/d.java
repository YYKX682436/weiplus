package as;

/* loaded from: classes8.dex */
public final class d implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.tencent.mm.storage.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete! id:" + newFunctionMsgItem);
        if (h6Var != null) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, %s", java.lang.Long.valueOf(newFunctionMsgItem.field_version), java.lang.Long.valueOf(h6Var.field_version), h6Var);
            long j18 = newFunctionMsgItem.field_version;
            if (j18 == h6Var.field_version || j18 == 0) {
                h6Var.field_actionTime = newFunctionMsgItem.field_actionTime;
                storage.delete(h6Var, new java.lang.String[0]);
                h6Var.field_businessInfo = newFunctionMsgItem.field_businessInfo;
                timer.a(1, h6Var, this);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, the origin one not exist! " + newFunctionMsgItem);
            timer.a(1, newFunctionMsgItem, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTaskExpired] delete ");
        qk.h6 h6Var = task.f456143b;
        sb6.append(h6Var.field_functionmsgid);
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpDeleteExecutor", sb6.toString());
        java.lang.String str = h6Var.field_functionmsgid;
        r45.j4 j4Var = h6Var.field_addMsg;
        jq.e eVar = (jq.e) dispatcher;
        com.tencent.mars.xlog.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgDelete] item:%s", h6Var);
        try {
            eVar.b(j4Var);
            j4Var.f377565o = (int) h6Var.field_actionTime;
            h6Var.field_addMsg = j4Var;
            h6Var.field_status = 100;
            com.tencent.mm.storage.x7.f196331d.z0(str, h6Var);
            com.tencent.mm.modelbase.s0.a(java.lang.Integer.valueOf(j4Var.f377560g)).x5(new com.tencent.mm.modelbase.r0(j4Var, str, h6Var));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("FunctionMsg.FunctionMsgDispatcher", e17, "", new java.lang.Object[0]);
        }
        timer.d(task);
    }
}
