package b20;

/* loaded from: classes8.dex */
public final class e extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name) {
        super(name);
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        com.tencent.mm.protobuf.g b17;
        java.util.LinkedList linkedList;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(jumpInfo, "jumpInfo");
        kotlin.jvm.internal.o.g(callback, "callback");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "context.context is null");
            callback.c("context.context is null");
            return;
        }
        bw5.v7 g17 = jumpInfo.g();
        jz5.f0 f0Var = null;
        if (g17 != null && (b17 = g17.b()) != null) {
            bw5.c8 parseFrom = new bw5.c8().parseFrom(b17.g());
            if (!(parseFrom instanceof bw5.c8)) {
                parseFrom = null;
            }
            jz5.f0 f0Var2 = jz5.f0.f302826a;
            if (parseFrom != null) {
                bw5.w5 w5Var = parseFrom.f25967e[1] ? parseFrom.f25966d : new bw5.w5();
                if (w5Var != null && (linkedList = w5Var.f34588d) != null) {
                    if (!(linkedList.size() > 0)) {
                        linkedList = null;
                    }
                    if (linkedList != null) {
                        com.tencent.mars.xlog.Log.i("ECS_O.NativeHandler.ChattingGiftEntry", "hy: show bottom sheet with " + linkedList.size() + " items");
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(c17, 1, false);
                        k0Var.f211872n = new b20.a(linkedList);
                        org.json.JSONObject d17 = context.d();
                        k0Var.f211881s = new b20.c(linkedList, context, d17);
                        k0Var.v();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("send_gift_actionsheet", "view_exp", d17 != null ? d75.b.e(d17, b20.d.f17328d) : kz5.q0.f314001d, 12, false);
                        callback.d(null);
                        f0Var = f0Var2;
                    }
                }
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "hy: no action sheet params");
                callback.c("no action sheet params");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "hy: no server param");
            callback.c("no server params");
        }
    }
}
