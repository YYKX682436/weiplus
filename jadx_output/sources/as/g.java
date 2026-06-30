package as;

/* loaded from: classes8.dex */
public final class g implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.tencent.mm.storage.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpShowExecutor", "[OpShowExecutor] op show, old functionMsgItem:" + h6Var);
        newFunctionMsgItem.field_needShow = true;
        if (h6Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpShowExecutor] op show!,");
            sb6.append(newFunctionMsgItem.field_version);
            sb6.append(", ");
            sb6.append(h6Var.field_version);
            sb6.append(',');
            sb6.append(h6Var.field_addMsg == null);
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpShowExecutor", sb6.toString());
            h6Var.field_needShow = true;
            if (h6Var.field_addMsg != null && h6Var.field_status == 2) {
                com.tencent.mars.xlog.Log.i("FunctionMsg.OpShowExecutor", "show, update create time to: %s", java.lang.Long.valueOf(j17));
                r45.j4 j4Var = h6Var.field_addMsg;
                if (j4Var != null) {
                    j4Var.f377565o = (int) (c01.id.a() / 1000);
                }
            }
            h6Var.field_actionTime = newFunctionMsgItem.field_actionTime;
            java.lang.String str = newFunctionMsgItem.field_custombuff;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                h6Var.field_custombuff = str;
            }
            java.lang.String str2 = h6Var.field_functionmsgid;
            kotlin.jvm.internal.o.f(str2, "getFunctionMsgId(...)");
            storage.z0(str2, h6Var);
            timer.a(3, h6Var, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(task, "task");
        qk.h6 h6Var = task.f456143b;
        ((jq.e) dispatcher).a(h6Var.field_functionmsgid, h6Var, h6Var.field_addMsg, h6Var.t0());
        timer.d(task);
    }
}
