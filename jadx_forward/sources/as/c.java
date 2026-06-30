package as;

/* loaded from: classes8.dex */
public final class c implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.p314xaae8f345.mm.p2621x8fb0427b.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        if (h6Var != null) {
            newFunctionMsgItem.f66770x515ba658 = true;
            h6Var.f66772x13c6891a = h6Var.f66779x8987ca93;
            h6Var.f66779x8987ca93 = newFunctionMsgItem.f66779x8987ca93;
            long j18 = newFunctionMsgItem.f66758x27886e88;
            if (0 < j18) {
                h6Var.f66758x27886e88 = j18 + newFunctionMsgItem.f66766x7ea831eb;
            } else {
                h6Var.f66758x27886e88 += newFunctionMsgItem.f66766x7ea831eb;
            }
            java.lang.String str = newFunctionMsgItem.f66764x5ae6efa9;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                h6Var.f66764x5ae6efa9 = str;
            }
            java.lang.String str2 = h6Var.f66769xf47740ff;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFunctionMsgId(...)");
            storage.z0(str2, h6Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor], functionMsgId: " + newFunctionMsgItem.f66769xf47740ff + ", op delay! update the exist one, new ActionTime:" + newFunctionMsgItem.f66758x27886e88 + " new delay:" + newFunctionMsgItem.f66766x7ea831eb + " reslt:" + h6Var);
            timer.a(101, h6Var, this);
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDelayExecutor", "[OpDelayExecutor] op delay, oldFunctionMsgItem is null! newFunctionMsgItem: " + newFunctionMsgItem);
        }
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
            new xr.c(linkedList, dispatcher, new as.b(timer, task, h6Var, dispatcher)).b();
        } else if (i17 == 2 || i17 == -2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpDelayExecutor", "[onTaskExpired] id" + h6Var.f66769xf47740ff + " actionTime:" + h6Var.f66758x27886e88);
            if (h6Var.f66758x27886e88 <= c01.id.a() / 1000) {
                ((jq.e) dispatcher).a(h6Var.f66769xf47740ff, h6Var, h6Var.f66759xf1091605, h6Var.t0());
            } else {
                timer.a(h6Var.f66771x9878653, h6Var, task.f537677c);
            }
            timer.d(task);
        }
    }
}
