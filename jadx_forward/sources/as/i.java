package as;

/* loaded from: classes8.dex */
public final class i implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.p314xaae8f345.mm.p2621x8fb0427b.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        newFunctionMsgItem.f66770x515ba658 = true;
        if (h6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, insert a new one! " + newFunctionMsgItem);
            try {
                storage.mo880xb970c2b9(newFunctionMsgItem);
            } catch (java.lang.Exception unused) {
            }
            timer.a(0, newFunctionMsgItem, this);
            return;
        }
        long j18 = h6Var.f66779x8987ca93;
        long j19 = newFunctionMsgItem.f66779x8987ca93;
        if (j18 >= j19) {
            if (j18 >= j19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor], id:%s old:new [%s:%s]", h6Var.f66769xf47740ff, java.lang.Long.valueOf(j18), java.lang.Long.valueOf(newFunctionMsgItem.f66779x8987ca93));
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpUpdateExecutor", "[OpUpdateExecutor] op update, update the exist one! [%s:%s]", newFunctionMsgItem, h6Var);
        long j27 = h6Var.f66779x8987ca93;
        h6Var.f66772x13c6891a = j27;
        newFunctionMsgItem.f66772x13c6891a = j27;
        java.lang.String str = h6Var.f66769xf47740ff;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getFunctionMsgId(...)");
        storage.z0(str, newFunctionMsgItem);
        timer.a(0, newFunctionMsgItem, this);
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        qk.h6 h6Var = task.f537676b;
        int i17 = h6Var.f66777x10a0fed7;
        if (i17 == -1) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(h6Var);
            new xr.c(linkedList, dispatcher, new as.h(timer, task, h6Var, dispatcher)).b();
        } else if (i17 == 2 || i17 == -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpUpdateExecutor", "[onTaskExpired] id" + h6Var.f66769xf47740ff + " actionTime:" + h6Var.f66758x27886e88);
            if (h6Var.f66758x27886e88 <= c01.id.a() / 1000) {
                ((jq.e) dispatcher).a(h6Var.f66769xf47740ff, h6Var, h6Var.f66759xf1091605, h6Var.t0());
            } else {
                timer.a(h6Var.f66771x9878653, h6Var, task.f537677c);
            }
            timer.d(task);
        }
    }
}
