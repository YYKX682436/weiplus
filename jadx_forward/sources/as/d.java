package as;

/* loaded from: classes8.dex */
public final class d implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.p314xaae8f345.mm.p2621x8fb0427b.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete! id:" + newFunctionMsgItem);
        if (h6Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, newFunctionMsgItem.version: %s, functionMsgItem.version: %s, %s", java.lang.Long.valueOf(newFunctionMsgItem.f66779x8987ca93), java.lang.Long.valueOf(h6Var.f66779x8987ca93), h6Var);
            long j18 = newFunctionMsgItem.f66779x8987ca93;
            if (j18 == h6Var.f66779x8987ca93 || j18 == 0) {
                h6Var.f66758x27886e88 = newFunctionMsgItem.f66758x27886e88;
                storage.mo9951xb06685ab(h6Var, new java.lang.String[0]);
                h6Var.f66761xe40d67b3 = newFunctionMsgItem.f66761xe40d67b3;
                timer.a(1, h6Var, this);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDeleteExecutor", "[OpDeleteExecutor] op delete, the origin one not exist! " + newFunctionMsgItem);
            timer.a(1, newFunctionMsgItem, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onTaskExpired] delete ");
        qk.h6 h6Var = task.f537676b;
        sb6.append(h6Var.f66769xf47740ff);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDeleteExecutor", sb6.toString());
        java.lang.String str = h6Var.f66769xf47740ff;
        r45.j4 j4Var = h6Var.f66759xf1091605;
        jq.e eVar = (jq.e) dispatcher;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.FunctionMsgDispatcher", "[onFunctionMsgDelete] item:%s", h6Var);
        try {
            eVar.b(j4Var);
            j4Var.f459098o = (int) h6Var.f66758x27886e88;
            h6Var.f66759xf1091605 = j4Var;
            h6Var.f66777x10a0fed7 = 100;
            com.p314xaae8f345.mm.p2621x8fb0427b.x7.f277864d.z0(str, h6Var);
            com.p314xaae8f345.mm.p944x882e457a.s0.a(java.lang.Integer.valueOf(j4Var.f459093g)).x5(new com.p314xaae8f345.mm.p944x882e457a.r0(j4Var, str, h6Var));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("FunctionMsg.FunctionMsgDispatcher", e17, "", new java.lang.Object[0]);
        }
        timer.d(task);
    }
}
