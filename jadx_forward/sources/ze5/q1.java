package ze5;

/* loaded from: classes9.dex */
public final class q1 {
    public q1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public boolean a(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        java.lang.String j17;
        ot0.q v17;
        boolean z17;
        if (f9Var == null) {
            return false;
        }
        ((fq3.w) ((bx1.t) i95.n0.c(bx1.t.class))).Di(f9Var.Q0(), 1);
        if (dVar == null) {
            return false;
        }
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        if (te5.t.b(f9Var, g17) || (j17 = f9Var.j()) == null || (v17 = ot0.q.v(j17)) == null) {
            return false;
        }
        lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
        java.lang.String str = v17.f430179d;
        ((kt.c) i0Var).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(str);
        if (h17 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h17.f67370x28d45f97)) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.e(dVar, v17, c01.z1.r(), h17, f9Var.I0(), dVar.x());
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G0(v17.f430223o)) {
            long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String str2 = v17.f430227p;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d D0 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.u5.wi().D0(str2);
            if (D0 == null || !D0.t0()) {
                z17 = false;
            } else {
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(Q0, m124847x74d37ac6);
                if (Li.z2()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemAppMsgTo", "openImg:: msg is clean, attachId %s, msgId: %d, msgSvrId: %d, imgPath: %s", str2, java.lang.Long.valueOf(m124847x74d37ac6), java.lang.Long.valueOf(Li.I0()), Li.z0());
                    android.content.Intent intent = new android.content.Intent();
                    intent.setClassName(dVar.g(), "com.tencent.mm.ui.chatting.ResourcesExceedUI");
                    intent.putExtra("clean_view_type", 1);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar.a0((android.content.Intent) arrayList.get(0));
                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    android.content.Intent intent2 = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22534xec824752.class);
                    intent2.putExtra("key_image_path", D0.f68099xfeae815);
                    intent2.putExtra("key_message_id", m124847x74d37ac6);
                    intent2.putExtra("key_message_talker", Q0);
                    intent2.putExtra("key_favorite", true);
                    intent2.putExtra("key_conv_session_id", dVar.f542255q);
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent2);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(dVar, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    dVar.a0((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsg$ChattingItemAppMsgTo", "openImg", "(JLjava/lang/String;Ljava/lang/String;Lcom/tencent/mm/ui/chatting/context/ChattingContext;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
                z17 = true;
            }
            if (z17) {
                return true;
            }
        }
        sc5.g gVar = sc5.g.f488105a;
        android.app.Activity g18 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g18, "getContext(...)");
        java.lang.String str3 = dVar.f542255q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getSessionConv(...)");
        gVar.f(g18, f9Var, new sc5.h(str3));
        return false;
    }
}
