package as;

/* loaded from: classes8.dex */
public final class i implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.tencent.mm.storage.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        newFunctionMsgItem.field_needShow = true;
        if (h6Var == null) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, insert a new one! " + newFunctionMsgItem);
            try {
                storage.insert(newFunctionMsgItem);
            } catch (java.lang.Exception unused) {
            }
            timer.a(0, newFunctionMsgItem, this);
            return;
        }
        long j18 = h6Var.field_version;
        long j19 = newFunctionMsgItem.field_version;
        if (j18 >= j19) {
            if (j18 >= j19) {
                com.tencent.mars.xlog.Log.e("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor], id:%s old:new [%s:%s]", h6Var.field_functionmsgid, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(newFunctionMsgItem.field_version));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, update the exist one! [%s:%s]", newFunctionMsgItem, h6Var);
        long j27 = h6Var.field_version;
        h6Var.field_preVersion = j27;
        newFunctionMsgItem.field_preVersion = j27;
        java.lang.String str = h6Var.field_functionmsgid;
        kotlin.jvm.internal.o.f(str, "getFunctionMsgId(...)");
        storage.z0(str, newFunctionMsgItem);
        timer.a(0, newFunctionMsgItem, this);
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(task, "task");
        qk.h6 h6Var = task.f456143b;
        int i17 = h6Var.field_status;
        if (i17 == -1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(h6Var);
            new xr.c(linkedList, dispatcher, new as.h(timer, task, h6Var, dispatcher)).b();
        } else if (i17 == 2 || i17 == -2) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] id" + h6Var.field_functionmsgid + " actionTime:" + h6Var.field_actionTime);
            if (h6Var.field_actionTime <= c01.id.a() / 1000) {
                ((jq.e) dispatcher).a(h6Var.field_functionmsgid, h6Var, h6Var.field_addMsg, h6Var.t0());
            } else {
                timer.a(h6Var.field_opCode, h6Var, task.f456144c);
            }
            timer.d(task);
        }
    }
}
