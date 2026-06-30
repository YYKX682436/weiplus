package l41;

@j95.b
/* loaded from: classes8.dex */
public final class g2 extends i95.w implements j41.z {
    public final void Ai(com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1) {
        r45.s4 s4Var = c11207x71c7a1c1.f153810i;
        if (s4Var != null) {
            if (s4Var.f467022g == null) {
                s4Var.f467022g = new r45.l05();
            }
            r45.l05 l05Var = s4Var.f467022g;
            if (l05Var != null) {
                l05Var.f460592d = c11207x71c7a1c1.f153807f;
                r45.s4 s4Var2 = c11207x71c7a1c1.f153810i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s4Var2);
                l05Var.f460594f = s4Var2.f467019d;
            }
        }
    }

    public void Bi(com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        Ai(request);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMKefuStartConversationService", "startConversation %s", request);
        if (request.f153806e == 0) {
            request.f153806e = java.lang.System.currentTimeMillis();
        }
        android.content.Intent intent = request.f153821w;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        wi(intent, request);
        intent.setClassName(request.f153805d, "com.tencent.mm.openim.ui.OpenIMKefuConfirmUI");
        if (!(request.f153805d instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        if (com.p314xaae8f345.mm.ui.b2.a(request.f153805d, true, new android.content.Intent[]{intent}, new java.lang.Object[0])) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversation hit duplicated start");
            return;
        }
        android.content.Context context = request.f153805d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversation", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void Di(com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 request) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        r45.s4 s4Var = request.f153810i;
        java.lang.String str2 = s4Var != null ? s4Var.f467023h : null;
        if (str2 == null || str2.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.OpenIMKefuStartConversationService", "startConversationDirectly username invalid");
            return;
        }
        Ai(request);
        android.content.Intent intent = request.f153821w;
        if (intent == null) {
            intent = new android.content.Intent();
        }
        wi(intent, request);
        if (request.f153816r) {
            intent.setClassName(request.f153805d, "com.tencent.mm.ui.conversation.OpenImKefuServiceConversationUI");
            intent.putExtra("Contact_User", "opencustomerservicemsg");
            if (request.f153818t) {
                intent.putExtra("key_back_to_launcher_ui_when_finish", true);
            }
        } else {
            if (request.f153811m) {
                java.io.Serializable serializableExtra = request.f153822x.getSerializableExtra("KEY_START_CHATTING_HALF_SCREEN_UIC");
                if (serializableExtra == null) {
                    serializableExtra = ((rb5.m) ((wn.o) i95.n0.c(wn.o.class))).wi(1);
                }
                intent.putExtra("KHalfScreenUIC", serializableExtra);
                android.os.ResultReceiver resultReceiver = request.f153812n;
                if (resultReceiver != null) {
                    intent.putExtra("KEY_LIFE_CYCLE_OBSERVER", resultReceiver);
                }
                android.os.ResultReceiver resultReceiver2 = request.f153813o;
                if (resultReceiver2 != null) {
                    intent.putExtra("key_HalfScreenActionReceiver", resultReceiver2);
                }
                intent.putExtra("finish_direct", true);
                ty.j0 j0Var = (ty.j0) i95.n0.c(ty.j0.class);
                r45.s4 s4Var2 = request.f153810i;
                str = s4Var2 != null ? s4Var2.f467023h : null;
                ((sy.z) j0Var).Ai(str != null ? str : "", intent);
            } else {
                intent.putExtra("finish_direct", true);
                r45.s4 s4Var3 = request.f153810i;
                str = s4Var3 != null ? s4Var3.f467023h : null;
                intent.putExtra("Chat_User", str != null ? str : "");
                intent.setClassName(request.f153805d, "com.tencent.mm.ui.conversation.OpenImKefuServiceChattingUI");
            }
        }
        if (!(request.f153805d instanceof android.app.Activity) || request.f153819u) {
            intent.addFlags(268435456);
        }
        if (request.f153811m) {
            return;
        }
        android.content.Context context = request.f153805d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/openim/model/OpenIMKefuStartConversationService", "startConversationWithoutConfirm", "(Lcom/tencent/mm/openim/api/OpenIMKefuStartConversationRequest;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public final void wi(android.content.Intent intent, com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1) {
        intent.putExtra("key_start_conversation_request", c11207x71c7a1c1);
        intent.putExtra("key_start_conversation_timestamp", java.lang.System.currentTimeMillis());
        intent.putExtras(c11207x71c7a1c1.f153822x);
    }
}
