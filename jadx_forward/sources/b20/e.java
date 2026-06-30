package b20;

/* loaded from: classes8.dex */
public final class e extends y10.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String name) {
        super(name);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    @Override // t10.c
    public void b(pq.a context, bw5.x7 jumpInfo, t10.d callback) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17;
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        android.content.Context c17 = context.c();
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "context.context is null");
            callback.c("context.context is null");
            return;
        }
        bw5.v7 g17 = jumpInfo.g();
        jz5.f0 f0Var = null;
        if (g17 != null && (b17 = g17.b()) != null) {
            bw5.c8 mo11468x92b714fd = new bw5.c8().mo11468x92b714fd(b17.g());
            if (!(mo11468x92b714fd instanceof bw5.c8)) {
                mo11468x92b714fd = null;
            }
            jz5.f0 f0Var2 = jz5.f0.f384359a;
            if (mo11468x92b714fd != null) {
                bw5.w5 w5Var = mo11468x92b714fd.f107500e[1] ? mo11468x92b714fd.f107499d : new bw5.w5();
                if (w5Var != null && (linkedList = w5Var.f116121d) != null) {
                    if (!(linkedList.size() > 0)) {
                        linkedList = null;
                    }
                    if (linkedList != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ECS_O.NativeHandler.ChattingGiftEntry", "hy: show bottom sheet with " + linkedList.size() + " items");
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(c17, 1, false);
                        k0Var.f293405n = new b20.a(linkedList);
                        org.json.JSONObject d17 = context.d();
                        k0Var.f293414s = new b20.c(linkedList, context, d17);
                        k0Var.v();
                        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("send_gift_actionsheet", "view_exp", d17 != null ? d75.b.e(d17, b20.d.f98861d) : kz5.q0.f395534d, 12, false);
                        callback.d(null);
                        f0Var = f0Var2;
                    }
                }
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "hy: no action sheet params");
                callback.c("no action sheet params");
            }
            f0Var = f0Var2;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ECS_O.NativeHandler.ChattingGiftEntry", "hy: no server param");
            callback.c("no server params");
        }
    }
}
