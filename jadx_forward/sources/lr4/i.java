package lr4;

/* loaded from: classes11.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.e f402269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f402270e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f402271f;

    public i(lr4.e eVar, lr4.k kVar, android.view.View view) {
        this.f402269d = eVar;
        this.f402270e = kVar;
        this.f402271f = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lr4.e eVar = this.f402269d;
        kr4.g gVar = (kr4.g) eVar.f374658i;
        lr4.c cVar = this.f402270e.f402279i;
        if (cVar != null) {
            android.view.View itemView = this.f402271f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "$itemView");
            eVar.m8183xf806b362();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            java.lang.String Di = ((fr4.g0) i95.n0.c(fr4.g0.class)).Di();
            lr4.n nVar = (lr4.n) cVar;
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f69048xbed8694c, "w1wsayhisessionholder@w1wmsg");
            com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.C18980x270fd319 c18980x270fd319 = nVar.f402290a;
            if (b17) {
                java.lang.String b18 = mr4.a.b();
                android.content.Context context = itemView.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                android.content.Intent intent = new android.content.Intent();
                intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p2356x1f7bb004.ui.ActivityC18985xe6e49aee.class);
                intent.putExtra("KEY_CONV_TYPE", 2);
                try {
                    android.content.Intent intent2 = c18980x270fd319.m7548xe6e42394().getIntent();
                    if (intent2 != null) {
                        intent.putExtra("key_w1w_refer_scene", intent2.getStringExtra("key_w1w_refer_scene"));
                        intent.putExtra("key_w1w_refer_scene_note", intent2.getStringExtra("key_w1w_refer_scene_note"));
                        intent.putExtra("key_w1w_refer_session_id", intent2.getStringExtra("key_w1w_refer_session_id"));
                        java.lang.String stringExtra = intent2.getStringExtra("key_w1w_refer_ext_info");
                        fr4.s[] sVarArr = fr4.s.f347393d;
                        intent.putExtra("key_w1w_refer_ext_info", mr4.a.d(stringExtra, "w1w-personal-msg-chat-list", b18));
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    arrayList2.add(intent);
                    java.util.Collections.reverse(arrayList2);
                    z17 = false;
                    yj0.a.d(context, arrayList2.toArray(), "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvClickListener", "enterSayHiChatListPage", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList2.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvClickListener", "enterSayHiChatListPage", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } catch (java.lang.Exception e17) {
                    z17 = false;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("W1w.W1wPersonalMsgConvClickListener", e17.getMessage());
                }
                c18980x270fd319.K0(vu4.d.f521836s, mr4.a.a((gVar.f69052xa35b5abb <= 0 || gVar.f69046x9b4f418d != 0) ? "hello_window:hello_window" : "reddot_hello_window:reddot_hello_window"), b18, gVar.f69048xbed8694c);
                gVar.f69046x9b4f418d = 1;
                kr4.m Bi = ((fr4.g0) i95.n0.c(fr4.g0.class)).Bi();
                if (Bi.m145258xce0038c9(gVar.f72763xa3c65b86, gVar, z17)) {
                    Bi.mo142179xf35bbb4(gVar.f69048xbed8694c, 1, gVar);
                }
            } else {
                java.lang.String b19 = mr4.a.b();
                if (gVar.f69052xa35b5abb > 0) {
                    ((fr4.g0) i95.n0.c(fr4.g0.class)).bj(com.p314xaae8f345.p2929xca247920.p2934x7ea5603f.p2935x30f5a8.C25536x34648872.f46693x191f6238, gVar.f69047x5568d387);
                }
                fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
                int Ri = g0Var.Ri(gVar.f69048xbed8694c);
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = gVar.Z;
                java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
                if (d17 == null) {
                    d17 = "";
                }
                g0Var.fj(d17, Di, new lr4.m(nVar, gVar, g0Var, Di, Ri, b19));
                c18980x270fd319.K0(vu4.d.f521826f, mr4.a.a(gVar.f69048xbed8694c + ":message_window"), b19, gVar.f69048xbed8694c);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
