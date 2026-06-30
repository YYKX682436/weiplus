package as;

/* loaded from: classes8.dex */
public final class c implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.tencent.mm.storage.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(timer, "timer");
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(storage, "storage");
        kotlin.jvm.internal.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        if (h6Var != null) {
            newFunctionMsgItem.field_needShow = true;
            h6Var.field_preVersion = h6Var.field_version;
            h6Var.field_version = newFunctionMsgItem.field_version;
            long j18 = newFunctionMsgItem.field_actionTime;
            if (0 < j18) {
                h6Var.field_actionTime = j18 + newFunctionMsgItem.field_delayTime;
            } else {
                h6Var.field_actionTime += newFunctionMsgItem.field_delayTime;
            }
            java.lang.String str = newFunctionMsgItem.field_custombuff;
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                h6Var.field_custombuff = str;
            }
            java.lang.String str2 = h6Var.field_functionmsgid;
            kotlin.jvm.internal.o.f(str2, "getFunctionMsgId(...)");
            storage.z0(str2, h6Var);
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor], functionMsgId: " + newFunctionMsgItem.field_functionmsgid + ", op delay! update the exist one, new ActionTime:" + newFunctionMsgItem.field_actionTime + " new delay:" + newFunctionMsgItem.field_delayTime + " reslt:" + h6Var);
            timer.a(101, h6Var, this);
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor] op delay, oldFunctionMsgItem is null! newFunctionMsgItem: " + newFunctionMsgItem);
        }
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
            new xr.c(linkedList, dispatcher, new as.b(timer, task, h6Var, dispatcher)).b();
        } else if (i17 == 2 || i17 == -2) {
            com.tencent.mars.xlog.Log.i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] id" + h6Var.field_functionmsgid + " actionTime:" + h6Var.field_actionTime);
            if (h6Var.field_actionTime <= c01.id.a() / 1000) {
                ((jq.e) dispatcher).a(h6Var.field_functionmsgid, h6Var, h6Var.field_addMsg, h6Var.t0());
            } else {
                timer.a(h6Var.field_opCode, h6Var, task.f456144c);
            }
            timer.d(task);
        }
    }
}
