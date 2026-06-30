package as;

/* loaded from: classes8.dex */
public final class g implements as.a {
    @Override // as.a
    public void a(xr.f timer, qk.n7 dispatcher, com.p314xaae8f345.mm.p2621x8fb0427b.x7 storage, qk.h6 newFunctionMsgItem, qk.h6 h6Var, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newFunctionMsgItem, "newFunctionMsgItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpShowExecutor", "[OpShowExecutor] op show, old functionMsgItem:" + h6Var);
        newFunctionMsgItem.f66770x515ba658 = true;
        if (h6Var != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[OpShowExecutor] op show!,");
            sb6.append(newFunctionMsgItem.f66779x8987ca93);
            sb6.append(", ");
            sb6.append(h6Var.f66779x8987ca93);
            sb6.append(',');
            sb6.append(h6Var.f66759xf1091605 == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpShowExecutor", sb6.toString());
            h6Var.f66770x515ba658 = true;
            if (h6Var.f66759xf1091605 != null && h6Var.f66777x10a0fed7 == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FunctionMsg.OpShowExecutor", "show, update create time to: %s", java.lang.Long.valueOf(j17));
                r45.j4 j4Var = h6Var.f66759xf1091605;
                if (j4Var != null) {
                    j4Var.f459098o = (int) (c01.id.a() / 1000);
                }
            }
            h6Var.f66758x27886e88 = newFunctionMsgItem.f66758x27886e88;
            java.lang.String str = newFunctionMsgItem.f66764x5ae6efa9;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                h6Var.f66764x5ae6efa9 = str;
            }
            java.lang.String str2 = h6Var.f66769xf47740ff;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getFunctionMsgId(...)");
            storage.z0(str2, h6Var);
            timer.a(3, h6Var, this);
        }
    }

    @Override // as.a
    public void b(xr.f timer, qk.n7 dispatcher, xr.e task) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timer, "timer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        qk.h6 h6Var = task.f537676b;
        ((jq.e) dispatcher).a(h6Var.f66769xf47740ff, h6Var, h6Var.f66759xf1091605, h6Var.t0());
        timer.d(task);
    }
}
