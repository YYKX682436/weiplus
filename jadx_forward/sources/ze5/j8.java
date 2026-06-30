package ze5;

/* loaded from: classes11.dex */
public class j8 extends ze5.w8 {

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f553569s;

    public static final v11.n0 k0(ze5.j8 j8Var, java.lang.String str, long j17) {
        j8Var.getClass();
        dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
        boolean Vi = jVar != null ? ((eh0.o) jVar).Vi(str, j17) : false;
        boolean Ui = jVar != null ? ((eh0.o) jVar).Ui(str, j17) : false;
        boolean Ri = jVar != null ? ((eh0.o) jVar).Ri(str, j17) : false;
        return (Vi && Ri) ? v11.n0.f513980f : Vi ? v11.n0.f513979e : (Ui && Ri) ? v11.n0.f513981g : Ri ? v11.n0.f513982h : v11.n0.f513978d;
    }

    public static final void l0(ze5.j8 j8Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17) {
        yb5.d dVar = j8Var.f553569s;
        if (dVar == null || com.p314xaae8f345.mm.ui.tk.f291489c.a() || j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20023xe406ef3d()) != 1) {
            return;
        }
        android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22354xed546315.class);
        pf5.j0.a(intent, com.p314xaae8f345.mm.ui.p2650x55bb7a46.tb.class);
        intent.putExtra("Chat_Msg_Id", f9Var.m124847x74d37ac6());
        intent.putExtra("Chat_User", f9Var.Q0());
        intent.putExtra("key_markdown_preview_enter_source", "bubble_double_tap");
        if (i17 >= 0) {
            intent.putExtra("Markdown_Source_Codepoint_Offset", i17);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom", "goPreviewMarkdown", "(Lcom/tencent/mm/storage/MsgInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        dVar.a0((android.content.Intent) arrayList.get(0));
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/mvvmitem/ChattingItemMarkdownMvvm$ChattingItemMarkdownFrom", "goPreviewMarkdown", "(Lcom/tencent/mm/storage/MsgInfo;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem item, yb5.d ui6, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ui6, "ui");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        int itemId = item.getItemId();
        if (itemId != 102) {
            if (itemId != 111) {
                return false;
            }
            ze5.e8 e8Var = new ze5.e8(ui6, f9Var);
            android.app.Activity g17 = ui6.g();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getContext(...)");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2668x31c90fad.t.a(f9Var, g17, e8Var);
            return false;
        }
        ot0.q v17 = ot0.q.v(c01.w9.l(ui6.C(), f9Var.j(), f9Var.A0()));
        java.lang.String str = v17 != null ? v17.f430187f : null;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(str);
        w04.a.INSTANCE.A9(1, java.lang.String.valueOf(f9Var.I0()), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.o0(str));
        db5.e1.T(ui6.g(), ui6.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        return false;
    }

    @Override // ze5.w8, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 menu, android.view.View v17, rd5.d msgData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        android.content.Context context = v17.getContext();
        java.lang.Object tag = v17.getTag();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = tag instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er ? (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) tag : null;
        int d17 = erVar != null ? erVar.d() : 0;
        yb5.d dVar = this.f553569s;
        if (dVar == null) {
            return true;
        }
        if (!c01.ia.x(f9Var)) {
            int i17 = d17;
            menu.c(i17, 102, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3m), com.p314xaae8f345.mm.R.raw.f79692xc84ca28d);
            menu.c(i17, 111, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
            j45.l.g("favorite");
            menu.c(d17, 116, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        if (c01.ia.A(f9Var)) {
            menu.clear();
        }
        if (!dVar.F()) {
            menu.c(d17, 100, 0, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.l6
    public void d(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
    }

    @Override // ze5.w8
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 d0(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = q31.r.f441452c1;
        i95.m c17 = i95.n0.c(q31.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((q31.t) ((q31.r) c17)).Ai();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b(context, null, 0, 6, null);
        c22094xdaed490b.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bzp);
        c22094xdaed490b.setLayoutParams(new android.widget.FrameLayout.LayoutParams((int) (com.p314xaae8f345.mm.ui.gk.b() * e06.p.e(0.875f, 0.0f, 1.0f)), -2));
        c22094xdaed490b.setPadding(i65.a.b(context, 18), i65.a.b(context, 10), i65.a.b(context, 12), i65.a.b(context, 10));
        c22094xdaed490b.m80122x67b46793(new ze5.v7(this, c22094xdaed490b));
        return c22094xdaed490b;
    }

    @Override // ze5.w8
    public java.util.List g0(ze5.n8 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return kz5.b0.c(ze5.y8.a(ze5.x7.f553831d, new ze5.c8(this), ze5.d8.f553417d));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0209 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01f9  */
    @Override // ze5.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h0(ze5.n8 r19, yb5.d r20, com.p314xaae8f345.mm.p2621x8fb0427b.f9 r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 580
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.j8.h0(ze5.n8, yb5.d, com.tencent.mm.storage.f9, java.lang.String):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public com.p314xaae8f345.mm.p2621x8fb0427b.a9 i(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, yb5.q qVar, yb5.a aVar) {
        return new ze5.w7(this, f9Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007e A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #4 {Exception -> 0x009a, blocks: (B:11:0x0054, B:14:0x0061, B:16:0x006a, B:18:0x0072, B:23:0x007e), top: B:10:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0133  */
    @Override // ze5.w8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q31.p i0(yb5.d r30, rd5.d r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ze5.j8.i0(yb5.d, rd5.d, java.lang.String):q31.p");
    }

    public final boolean m0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        try {
            dh0.j jVar = (dh0.j) i95.n0.c(dh0.j.class);
            if (jVar == null) {
                return false;
            }
            java.lang.String Q0 = f9Var.Q0();
            if (Q0 == null) {
                Q0 = "";
            }
            return ((eh0.o) jVar).Ui(Q0, f9Var.I0());
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemMarkdownMvvm", "[STREAM_DIFF] checkIsStreaming failed: " + e17.getMessage());
            return false;
        }
    }

    public final void n0(long j17, java.lang.String callBackBuf, java.lang.String str, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.C22094xdaed490b c22094xdaed490b, v11.h hVar) {
        df5.l lVar = c22094xdaed490b.f286185p;
        if (lVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactOptionsView");
            throw null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeClawCallbackManager", "setPendingCallback: msgSvrId=%d", java.lang.Long.valueOf(j17));
        qy4.e.f449320a = j17;
        lVar.postDelayed(lVar.f313694q, 30000L);
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callBackBuf, "callBackBuf");
            r45.us usVar = new r45.us();
            usVar.f469139d = j17;
            usVar.f469140e = callBackBuf;
            com.p314xaae8f345.mm.p944x882e457a.l lVar2 = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar2.f152200d = 7427;
            lVar2.f152199c = "/cgi-bin/micromsg-bin/callbackbuttonclick";
            lVar2.f152197a = usVar;
            lVar2.f152198b = new r45.vs();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar2.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            iVar.l().K(new ze5.i8(c22094xdaed490b));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingItemMarkdownMvvm", e17, "sendCallbackButtonClick error", new java.lang.Object[0]);
            df5.l lVar3 = c22094xdaed490b.f286185p;
            if (lVar3 != null) {
                lVar3.d();
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("interactOptionsView");
                throw null;
            }
        }
    }
}
