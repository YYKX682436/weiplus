package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class r7 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f286943a;

    /* renamed from: b, reason: collision with root package name */
    public yb5.d f286944b;

    public r7(boolean z17) {
        this.f286943a = z17;
    }

    public final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o7 o7Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, yb5.d ui6, rd5.d msgData, java.lang.String str) {
        java.lang.String m75945x2fec8307;
        java.lang.String str2;
        java.lang.String str3;
        zy2.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        if (o7Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveThemeDelegate", "filling not AppMsgFinderLiveThemeHolder");
            return;
        }
        this.f286944b = ui6;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        r45.hd2 hd2Var = (v17 == null || (dVar = (zy2.d) v17.y(zy2.d.class)) == null) ? null : dVar.f558904b;
        android.widget.TextView textView = o7Var.f286676f;
        if (textView != null) {
            textView.setMaxLines(3);
        }
        android.widget.TextView textView2 = o7Var.f286676f;
        java.lang.String str4 = "";
        if (textView2 != null) {
            if (hd2Var == null || (str3 = hd2Var.m75945x2fec8307(1)) == null) {
                str3 = "";
            }
            textView2.setText(str3);
        }
        android.widget.TextView textView3 = o7Var.f286682l;
        if (textView3 != null) {
            textView3.setMaxLines(2);
        }
        android.widget.TextView textView4 = o7Var.f286682l;
        if (textView4 != null) {
            textView4.setVisibility(0);
        }
        android.widget.TextView textView5 = o7Var.f286682l;
        if (textView5 != null) {
            if (hd2Var == null || (str2 = hd2Var.m75945x2fec8307(0)) == null) {
                str2 = "";
            }
            textView5.setText(str2);
        }
        o11.f fVar = new o11.f();
        fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78435x7b83bce4;
        fVar.f423634y = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.k();
        fVar.f423612c = true;
        fVar.f423616g = tv.a.a();
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        int b17 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        int b18 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50);
        fVar.f423619j = b17;
        fVar.f423620k = b18;
        fVar.f423610a = true;
        fVar.f423629t = true;
        fVar.f423630u = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 1);
        n11.a b19 = n11.a.b();
        if (hd2Var != null && (m75945x2fec8307 = hd2Var.m75945x2fec8307(2)) != null) {
            str4 = m75945x2fec8307;
        }
        b19.h(str4, o7Var.f286674d, fVar.a());
        o7Var.b(o7Var.f286675e);
        android.widget.TextView textView6 = o7Var.f286676f;
        if (textView6 != null) {
            textView6.setTextColor(ui6.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.t_));
        }
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = o7Var.f286674d;
        if (c21405x85fc1ce0 != null) {
            c21405x85fc1ce0.setVisibility(0);
        }
        android.widget.RelativeLayout relativeLayout = o7Var.f286693w;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        android.widget.TextView textView7 = o7Var.f286676f;
        if (textView7 != null) {
            textView7.setVisibility(0);
        }
        o7Var.b(o7Var.f286684n);
        o7Var.b(o7Var.f286686p);
        o7Var.b(o7Var.f286685o);
        o7Var.b(o7Var.f286695y);
        o7Var.b(o7Var.f286696z);
        o7Var.b(o7Var.f286679i);
        o7Var.b(o7Var.f286680j);
        android.view.View view = o7Var.f286694x;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "filling", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItem;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$AppMsgFinderLiveThemeHolder;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        o7Var.b(o7Var.B);
        o7Var.b(o7Var.C);
        o7Var.m80053x54fd00d3(o7Var.f39493x8ad70635, ((java.lang.Number) ((jz5.n) o7Var.D).mo141623x754a37bb()).intValue());
        o7Var.b(o7Var.A);
        android.view.View view2 = o7Var.f286694x;
        int i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi;
        boolean z17 = this.f286943a;
        if (view2 != null) {
            view2.setBackgroundResource(z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562715mi : com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob);
        }
        android.view.View view3 = o7Var.f39493x8ad70635;
        if (view3 != null) {
            if (!z17) {
                i17 = com.p314xaae8f345.mm.R.C30861xcebc809e.f562777ob;
            }
            view3.setBackgroundResource(i17);
        }
        android.view.View view4 = o7Var.f286694x;
        if (view4 != null) {
            view4.setPadding(0, ui6.g().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx), 0, 0);
        }
        o7Var.b(o7Var.f286681k);
        o7Var.b(o7Var.f286677g);
        o7Var.b(o7Var.f286678h);
        o7Var.b(o7Var.f286688r);
        android.widget.ImageView imageView = o7Var.f286687q;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        o7Var.b(o7Var.f286687q);
        android.widget.LinearLayout linearLayout = o7Var.f286690t;
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        o7Var.b(o7Var.f286683m);
        android.widget.LinearLayout linearLayout2 = o7Var.f286692v;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
        }
        o7Var.b(o7Var.f286691u);
        o7Var.b(o7Var.f286689s);
        o7Var.f39493x8ad70635.setOnClickListener(chattingItem.w(ui6));
        o7Var.f39493x8ad70635.setOnLongClickListener(chattingItem.u(ui6));
        android.view.View view5 = o7Var.f39493x8ad70635;
        sb5.z zVar = (sb5.z) ui6.f542241c.a(sb5.z.class);
        view5.setOnTouchListener(zVar != null ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) zVar).B1 : null);
        o7Var.f39493x8ad70635.setTag(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(msgData, ui6.D(), o7Var, null));
        android.widget.ImageView imageView2 = o7Var.f286673c;
        if (imageView2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView2);
            imageView2.setVisibility(8);
        }
        chattingItem.Z(o7Var, f9Var.P0() < 2, true);
    }

    public final android.view.View b(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view != null && view.getTag() != null) {
            return view;
        }
        boolean z17 = this.f286943a;
        android.view.View xgVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, z17 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e1h : com.p314xaae8f345.mm.R.C30864xbddafb2a.e1w);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o7 o7Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.o7();
        o7Var.a(xgVar, !z17);
        xgVar.setTag(o7Var);
        return xgVar;
    }

    public final boolean c(android.view.MenuItem menuItem, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 msg) {
        ot0.q v17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (menuItem == null || dVar == null || menuItem.getItemId() != 111) {
            return false;
        }
        android.app.Activity g17 = dVar.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(msg.j()) && (v17 = ot0.q.v(msg.j())) != null) {
            android.content.Intent intent = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_Id", msg.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", msg.Q0());
            intent.putExtra("Retr_Msg_Type", 38);
            intent.putExtra("Multi_Retr", true);
            intent.putExtra("Retr_Msg_content", ot0.q.u(v17, null, null));
            intent.putExtra("Retr_go_to_chattingUI", false);
            intent.putExtra("Retr_show_success_tips", true);
            intent.putExtra("scene_from", 17);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(g17, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            g17.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(g17, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgFinderLiveTheme$FinderLiveThemeDelegate", "retransmit", "(Landroid/app/Activity;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        return true;
    }

    public final boolean d(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 chattingItem, db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingItem, "chattingItem");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar != null ? dVar.f475787d.f526833b : null;
        if (g4Var == null || view == null) {
            return false;
        }
        yb5.d dVar2 = this.f286944b;
        if (dVar2 != null) {
            if (this.f286943a) {
                java.lang.Object tag = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d17 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag).d();
                if (f9Var != null && !c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                    g4Var.c(d17, 111, 0, dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                }
            } else {
                java.lang.Object tag2 = view.getTag();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.viewitems.ItemDataTag");
                int d18 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag2).d();
                if (f9Var != null) {
                    if (!c01.ia.A(f9Var) && !c01.ia.x(f9Var)) {
                        g4Var.c(d18, 111, 0, dVar2.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
                    }
                    if ((f9Var.P0() == 2 || f9Var.P0() == 3 || f9Var.h2() == 1) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.L(f9Var, dVar2) && com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0.J(f9Var.Q0()) && !dVar2.A()) {
                        g4Var.c(d18, 123, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572402b40), com.p314xaae8f345.mm.R.raw.f79868x8752620f);
                    }
                }
            }
        }
        return true;
    }
}
