package as;

/* loaded from: classes8.dex */
public final class f implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.p314xaae8f345.mm.p2621x8fb0427b.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        newFunctionMsgItem.f66770x515ba658 = false;
        if (h6Var != null) {
            if (h6Var.f66779x8987ca93 < newFunctionMsgItem.f66779x8987ca93) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, update the exist one, preVersion: %s oldFunctionMsgItem:%s", java.lang.Long.valueOf(h6Var.f66772x13c6891a), h6Var);
                long j18 = h6Var.f66779x8987ca93;
                h6Var.f66772x13c6891a = j18;
                newFunctionMsgItem.f66772x13c6891a = j18;
                h6Var.f66758x27886e88 = newFunctionMsgItem.f66758x27886e88;
                java.lang.String str = newFunctionMsgItem.f66764x5ae6efa9;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    h6Var.f66764x5ae6efa9 = str;
                }
                java.lang.String str2 = h6Var.f66769xf47740ff;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFunctionMsgId(...)");
                storage.z0(str2, newFunctionMsgItem);
                timer.a(2, newFunctionMsgItem, this);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show! but version is smaller");
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpNoShowExecutor", "[OpNoShowExecutor] op update but no show, insert a new one! %s", newFunctionMsgItem);
            storage.mo880xb970c2b9(newFunctionMsgItem);
            timer.a(2, newFunctionMsgItem, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        qk.h6 h6Var = task.f537676b;
        if (h6Var.f66777x10a0fed7 != -1) {
            timer.d(task);
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(h6Var);
        new xr.c(linkedList, dispatcher, new as.e(timer, task)).b();
    }
}
