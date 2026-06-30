package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes8.dex */
public final class km implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f285894d;

    public km(yb5.d ui6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        this.f285894d = ui6;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        java.lang.String str;
        java.lang.String string;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
            erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag;
        } else {
            erVar = null;
        }
        if (erVar == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        sb5.k1 k1Var = (sb5.k1) this.f285894d.f542241c.a(sb5.k1.class);
        java.lang.String str2 = erVar.f285439b;
        android.os.Bundle bundle = erVar.f285437J;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.li liVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.li) k1Var;
        liVar.getClass();
        com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1 c11207x71c7a1c1 = new com.p314xaae8f345.mm.p983xc3c3c8ee.api.C11207x71c7a1c1();
        yb5.d dVar = liVar.f280113d;
        c11207x71c7a1c1.f153805d = dVar != null ? dVar.g() : null;
        c11207x71c7a1c1.f153807f = 2;
        c11207x71c7a1c1.f153809h = j41.f0.a(2);
        c11207x71c7a1c1.f153820v = true;
        c11207x71c7a1c1.f153816r = true;
        c11207x71c7a1c1.f153814p = true;
        android.content.Context context = c11207x71c7a1c1.f153805d;
        java.lang.String str3 = "";
        if (context == null || (str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hez)) == null) {
            str = "";
        }
        c11207x71c7a1c1.f153815q = str;
        r45.s4 s4Var = new r45.s4();
        if (bundle != null && (string = bundle.getString("kefu_card_ticket", "")) != null) {
            str3 = string;
        }
        s4Var.f467021f = str3;
        s4Var.f467023h = str2;
        c11207x71c7a1c1.f153810i = s4Var;
        c11207x71c7a1c1.f153806e = java.lang.System.currentTimeMillis();
        android.content.Intent intent = new android.content.Intent();
        android.os.Handler m77777x504cd8a2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.n3.m77777x504cd8a2(android.os.Looper.getMainLooper());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m77777x504cd8a2, "createFreeHandler(...)");
        intent.putExtra("key_result_receiver", new com.p314xaae8f345.mm.p983xc3c3c8ee.p984x633fb29.ResultReceiverC11209x6faff39d(m77777x504cd8a2, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ji(liVar)));
        c11207x71c7a1c1.f153821w = intent;
        j41.z zVar = (j41.z) i95.n0.c(j41.z.class);
        if (zVar != null) {
            ((l41.g2) zVar).Bi(c11207x71c7a1c1);
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemOpenIMKefuNameCard$CardOnClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
