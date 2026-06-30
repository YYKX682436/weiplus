package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes5.dex */
public class g2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 f271859d;

    public g2(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33) {
        this.f271859d = c19666xfd6e2f33;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        u35.b.f505965d = java.lang.System.currentTimeMillis();
        nr.b.f420565c = true;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33 = this.f271859d;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.k5 k5Var = c19666xfd6e2f33.f271623x0;
        if (k5Var != null) {
            k5Var.s(view);
        }
        if (c19666xfd6e2f33.f271503d2 == 2) {
            c19666xfd6e2f33.z1();
        } else {
            if (c19666xfd6e2f33.f271631y1) {
                c19666xfd6e2f33.v0();
            }
            c19666xfd6e2f33.x1();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f emojiBtn = c19666xfd6e2f33.C;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiBtn, "emojiBtn");
            u35.b.f505966e = true;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("chat_session_id", u35.b.f505962a);
            hashMap.put("last_mic_clk_ts", java.lang.Long.valueOf(u35.b.f505964c));
            hashMap.put("last_clk_btn_name", java.lang.Integer.valueOf(u35.b.f505963b));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.gk(emojiBtn, hashMap);
            aVar.ik(emojiBtn, 8, 35963);
            u35.b.f505963b = 2;
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CAPTURE_OUTER_EMOJI_BUTTON_RED_DOT_BOOLEAN;
            if (!c17.o(u3Var, false)) {
                gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
                android.view.View findViewById = c19666xfd6e2f33.f271508e.findViewById(com.p314xaae8f345.mm.R.id.bqs);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/chat/ChatFooter$39", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
