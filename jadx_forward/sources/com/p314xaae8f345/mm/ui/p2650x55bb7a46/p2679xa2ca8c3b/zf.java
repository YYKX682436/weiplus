package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class zf extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 {
    public static int A;
    public static int B;
    public static int C;
    public static int D;
    public static int E;

    /* renamed from: x, reason: collision with root package name */
    public static int f287664x;

    /* renamed from: y, reason: collision with root package name */
    public static int f287665y;

    /* renamed from: z, reason: collision with root package name */
    public static int f287666z;

    /* renamed from: s, reason: collision with root package name */
    public yb5.d f287667s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f287668t = false;

    /* renamed from: u, reason: collision with root package name */
    public int f287669u = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f287670v = 0;

    /* renamed from: w, reason: collision with root package name */
    public boolean f287671w = false;

    public static java.lang.String k0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, android.content.Context context, int i17) {
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: context is null");
            return null;
        }
        if (f9Var != null) {
            return ot0.g0.i(context, i17, f9Var.j(), f9Var.Q0(), f9Var.m124847x74d37ac6());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemBizFrom", "getReaderAppMsgContent: msg is null");
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public android.view.View F(android.view.LayoutInflater layoutInflater, android.view.View view) {
        if (view == null || view.getTag() == null) {
            view = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.xg(layoutInflater, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569997u1);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf();
            qfVar.f39500xcbecde0f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
            qfVar.f39495xb7c8f70e = view.findViewById(com.p314xaae8f345.mm.R.id.bm7);
            qfVar.f286884b = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.bkn);
            qfVar.f39492x5b9aa3a3 = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.bkf);
            qfVar.f39496x10665fb1 = view.findViewById(com.p314xaae8f345.mm.R.id.bpa);
            qfVar.f286887e = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bix);
            view.setTag(qfVar);
        }
        w0(layoutInflater.getContext());
        return view;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean M() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean O(android.view.MenuItem r11, final yb5.d r12, final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er r13) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf.O(android.view.MenuItem, yb5.d, com.tencent.mm.ui.chatting.viewitems.er):boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean P(android.view.MenuItem menuItem, yb5.d dVar, rd5.d dVar2) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar2.f475787d.f526833b;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean Q(db5.g4 g4Var, android.view.View view, rd5.d dVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar == null) {
            return false;
        }
        this.f287669u = erVar.B;
        int d17 = erVar.d();
        ot0.m0 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(f9Var.m124847x74d37ac6(), f9Var.j());
        this.f287671w = false;
        int i17 = this.f287669u;
        if (i17 >= 0) {
            java.util.LinkedList linkedList = Di.f430114i;
            if (i17 < linkedList.size() && k01.o.a(((ot0.s0) linkedList.get(this.f287669u)).f430308r)) {
                this.f287671w = true;
            }
        }
        if (!this.f287667s.F() && !com.p314xaae8f345.mm.ui.p2650x55bb7a46.n3.l(f9Var)) {
            g4Var.c(d17, 111, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574369i24), com.p314xaae8f345.mm.R.raw.f79902x4225bfc7);
        }
        boolean z17 = 19 == erVar.E;
        j45.l.g("favorite");
        if (!this.f287671w && !z17) {
            g4Var.c(d17, 126, 0, view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjg), com.p314xaae8f345.mm.R.raw.f79735x2a2da63f);
        }
        g4Var.c(d17, 100, 0, this.f287667s.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.b3p), com.p314xaae8f345.mm.R.raw.f79697xe8d412c3);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean R(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    public boolean b0() {
        return false;
    }

    public final void d0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar, ot0.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        int i17;
        android.os.Bundle bundle = new android.os.Bundle();
        int a17 = c01.h2.a(A(this.f287667s, f9Var), this.f287667s.x());
        if (a17 != 1) {
            i17 = 2;
            if (a17 != 2) {
                i17 = (a17 == 6 || a17 == 7) ? 5 : 0;
            }
        } else {
            i17 = 3;
        }
        bundle.putString("share_report_pre_msg_url", s0Var.f430295e);
        bundle.putString("share_report_pre_msg_title", s0Var.f430294d);
        bundle.putString("share_report_pre_msg_desc", s0Var.f430302n);
        bundle.putString("share_report_pre_msg_icon_url", ot0.g0.j(s0Var));
        bundle.putString("share_report_pre_msg_appid", "");
        bundle.putInt("share_report_from_scene", i17);
        if (i17 == 5) {
            bundle.putString("share_report_biz_username", this.f287667s.x());
        }
        erVar.D = bundle;
    }

    public final void e0(yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        boolean z17 = this.f287671w;
        if (!z17) {
            java.lang.String k07 = k0(f9Var, dVar.g(), this.f287669u);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k07)) {
                return;
            }
            android.content.Intent intent = new android.content.Intent(dVar.g(), (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
            intent.putExtra("Retr_Msg_content", k07);
            intent.putExtra("Retr_Msg_Type", 2);
            intent.putExtra("Retr_Biz_Msg_Selected_Msg_Index", this.f287669u);
            intent.putExtra("Retr_Msg_Id", f9Var.m124847x74d37ac6());
            intent.putExtra("Retr_MsgTalker", f9Var.Q0());
            intent.putExtra("Retr_MsgFromScene", 1);
            java.lang.String Q0 = f9Var.Q0();
            java.lang.String a17 = c01.n2.a("" + f9Var.I0());
            intent.putExtra("reportSessionId", a17);
            intent.putExtra("scene_from", 17);
            c01.l2 c17 = c01.n2.d().c(a17, true);
            c17.i("prePublishId", "msg_" + f9Var.I0());
            c17.i("preUsername", Q0);
            c17.i("preChatName", Q0);
            c17.i("preMsgIndex", java.lang.Integer.valueOf(this.f287669u));
            c17.i("sendAppMsgScene", 1);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            dVar.a0((android.content.Intent) arrayList.get(0));
            yj0.a.f(dVar, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "doRestransmit", "(Lcom/tencent/mm/ui/chatting/context/ChattingContext;Lcom/tencent/mm/storage/MsgInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingItemBizFrom", "transmitAppBrandMsg not AppBrandMsg!");
            return;
        }
        int i17 = this.f287669u;
        android.app.Activity g17 = dVar.g();
        java.lang.String j17 = f9Var.j();
        java.lang.String Q02 = f9Var.Q0();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        long I0 = f9Var.I0();
        java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.f287745a;
        ot0.m0 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(m124847x74d37ac6, j17);
        if (i17 >= 0) {
            java.util.LinkedList linkedList = Di.f430114i;
            if (i17 < linkedList.size()) {
                ot0.s0 s0Var = (ot0.s0) linkedList.get(i17);
                java.lang.String u17 = ot0.q.u(com.p314xaae8f345.mm.ui.p2650x55bb7a46.a4.a(Q02, s0Var), null, null);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                    return;
                }
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("desc", s0Var.f430302n);
                hashMap.put("type", 2);
                hashMap.put(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, s0Var.f430294d);
                hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, s0Var.f430312v);
                hashMap.put("pkg_type", java.lang.Integer.valueOf(s0Var.f430311u));
                hashMap.put("pkg_version", java.lang.Integer.valueOf(s0Var.f430310t));
                hashMap.put("img_url", s0Var.f430313w);
                hashMap.put("is_dynamic", java.lang.Boolean.FALSE);
                hashMap.put("cache_key", "");
                hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, s0Var.f430309s);
                android.content.Intent intent2 = new android.content.Intent(g17, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22567x42e895b8.class);
                intent2.putExtra("appbrand_params", hashMap);
                intent2.putExtra("Retr_Msg_content", u17);
                intent2.putExtra("Retr_Msg_Type", 2);
                intent2.putExtra("Retr_Biz_Msg_Selected_Msg_Index", i17);
                intent2.putExtra("Retr_Msg_Id", m124847x74d37ac6);
                intent2.putExtra("Retr_MsgTalker", Q02);
                intent2.putExtra("Retr_MsgFromScene", 3);
                java.lang.String a18 = c01.n2.a("" + I0);
                intent2.putExtra("reportSessionId", a18);
                intent2.putExtra("scene_from", 17);
                c01.l2 c18 = c01.n2.d().c(a18, true);
                c18.i("prePublishId", "msg_" + I0);
                c18.i("preUsername", Q02);
                c18.i("preChatName", Q02);
                c18.i("preMsgIndex", java.lang.Integer.valueOf(i17));
                c18.i("sendAppMsgScene", 1);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(intent2);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(g17, arrayList2.toArray(), "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                g17.startActivity((android.content.Intent) arrayList2.get(0));
                yj0.a.f(g17, "com/tencent/mm/ui/chatting/ChattingItemHelper", "transmitAppBrandMsg", "(ILandroid/content/Context;Ljava/lang/String;Ljava/lang/String;JJ)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            }
        }
    }

    public final void f0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, ot0.r0 r0Var) {
        eq1.h hVar = eq1.h.f337345a;
        ot0.q0 e17 = hVar.e(s0Var.M, 0);
        if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.D) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.N)) ? false : true)) {
            android.view.View view = qfVar.f286894l.f286958d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rf rfVar = qfVar.f286894l;
            android.view.View view2 = rfVar.f286966l;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSpecialLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar.f286961g.setText(e17.f430277m);
            android.widget.TextView textView = rfVar.f286961g;
            android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
            if (paint != null) {
                paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
            if (paint2 != null) {
                paint2.setStrokeWidth(0.8f);
            }
            rfVar.f286962h.setText(e17.f430271d);
            rfVar.f286963i.setText("");
            hVar.j(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(e17.f430274g), rfVar.f286964j, rfVar.f286965k);
            rfVar.f286796a.setTag(com.p314xaae8f345.mm.R.id.bph, e17.f430274g);
            hVar.f(e17.f430273f, e17.f430274g, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.bg(this, e17, qfVar));
            fq1.e.f347040a.g(rfVar.f286796a, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 6), true, r0Var.f430114i.size() <= 1);
            hVar.h(rfVar.f286960f, rfVar.f286959e, e17.f430283s, null);
            o0(qfVar, s0Var, dVar, qVar, r0Var, rfVar.f286796a);
            rfVar.f286796a.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.cg(this, i17, e17, r0Var));
            return;
        }
        android.view.View view3 = qfVar.f286894l.f286958d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.rf rfVar2 = qfVar.f286894l;
        android.view.View view4 = rfVar2.f286966l;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (i17 == 1) {
            android.view.View view5 = rfVar2.f286972r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view6 = rfVar2.f286969o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar2.f286973s.setText(s0Var.f430294d);
            rfVar2.f286974t.setVisibility(8);
            android.widget.TextView textView2 = rfVar2.f286970p;
            android.text.TextPaint paint3 = textView2 != null ? textView2.getPaint() : null;
            if (paint3 != null) {
                paint3.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            }
            android.text.TextPaint paint4 = textView2 != null ? textView2.getPaint() : null;
            if (paint4 != null) {
                paint4.setStrokeWidth(0.8f);
            }
            fq1.e.f347040a.g(rfVar2.f286972r, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4), false, true);
        } else {
            android.view.View view7 = rfVar2.f286972r;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = rfVar2.f286969o;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(0);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopMpLive", "(Lcom/tencent/mm/message/BizLiveXmlObject;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            rfVar2.f286970p.setText(s0Var.f430294d);
            rfVar2.f286971q.setVisibility(8);
        }
        hVar.l(rfVar2.f286968n, s0Var.N, null);
        p0(rfVar2.f286967m, E);
        fq1.e.f347040a.g(rfVar2.f286796a, i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 4), true, false);
        o0(qfVar, s0Var, dVar, qVar, r0Var, rfVar2.f286796a);
        hVar.j(((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).g(e17.f430274g), rfVar2.f286975u, rfVar2.f286976v);
        rfVar2.f286796a.setTag(com.p314xaae8f345.mm.R.id.bph, e17.f430274g);
        hVar.f(e17.f430273f, e17.f430274g, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ng(this, e17, qfVar, i17));
        rfVar2.f286796a.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ag(this, i17, e17, r0Var));
    }

    public final void g0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, ot0.r0 r0Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430294d)) {
            qfVar.f286892j.f286797b.setVisibility(8);
        } else {
            qfVar.f286892j.f286797b.setVisibility(0);
            android.widget.TextView textView = qfVar.f286892j.f286797b;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            android.app.Activity g17 = this.f287667s.g();
            java.lang.String str = s0Var.f430294d;
            ((ke0.e) xVar).getClass();
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(g17, str));
        }
        if (i17 > 1) {
            qfVar.f286892j.f286796a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562757np);
        } else {
            qfVar.f286892j.f286796a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bc9);
        }
        if (android.text.TextUtils.isEmpty(s0Var.A)) {
            qfVar.f286892j.f287052d.setVisibility(8);
        } else {
            qfVar.f286892j.f287052d.setVisibility(0);
            qfVar.f286892j.f287052d.setText(s0Var.A);
        }
        if (s0Var.B == 2) {
            qfVar.f286892j.f287055g.setImageResource(com.p314xaae8f345.mm.R.raw.f78801xaee8a62f);
        } else {
            qfVar.f286892j.f287055g.setImageResource(com.p314xaae8f345.mm.R.raw.f78810x3ca9ad8a);
        }
        s0(this.f287667s, qfVar.f286892j.f287054f, f9Var, 0, s0Var.f430299i);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.sf sfVar = qfVar.f286892j;
        o0(qfVar, s0Var, dVar, qVar, r0Var, sfVar.f286796a);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.j3.a(f9Var.m124847x74d37ac6(), 0).equals(te5.t.c(null))) {
            sfVar.f287054f.setImageResource(com.p314xaae8f345.mm.R.raw.f78804xc02b313e);
        } else {
            sfVar.f287054f.setImageResource(com.p314xaae8f345.mm.R.raw.f78807x2f87b5ae);
        }
        sfVar.f286798c.setVisibility(8);
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(qfVar);
        java.lang.String str2 = s0Var.f430299i;
        android.widget.ImageView imageView = sfVar.f287053e;
        int mo78013xfb85f7b0 = f9Var.mo78013xfb85f7b0();
        int i18 = B;
        l0(str2, imageView, mo78013xfb85f7b0, i18, i18, "@S", new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.kg(this, weakReference, f9Var));
    }

    public final void h0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, ot0.r0 r0Var) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uf ufVar;
        boolean z17;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        qfVar.f286885c.f287217h.setVisibility(i17 > 1 ? 8 : 0);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.uf ufVar2 = qfVar.f286885c;
        ufVar2.f287218i.setVisibility((i17 > 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430302n)) ? 8 : 0);
        ufVar2.f287216g.setVisibility(i17 > 1 ? 0 : 8);
        ufVar2.f287220k.setVisibility(8);
        if (i17 == 1) {
            ufVar2.f287219j.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562771o4);
            android.view.View view = ufVar2.f287215f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view2 = ufVar2.f287215f;
            int i18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430299i) ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar2.f287219j.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562772o5);
            ufVar2.f287216g.m84183x1c5c5ff4(this.f287667s.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560837vk));
            ufVar2.f287216g.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563514ap3);
            ufVar2.f287216g.m84162x74f59ea8().setFakeBoldText(true);
        }
        p0(ufVar2.f287214e, C);
        p0(ufVar2.f287219j, C);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430299i)) {
            ufVar = ufVar2;
            z17 = false;
            ufVar.f287218i.setMaxLines(100);
            android.view.View view3 = ufVar.f287214e;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar.f287217h.setVisibility(0);
            ufVar.f287218i.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430302n) ? 8 : 0);
            if (i17 == 1) {
                ufVar.f287215f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bc9);
            } else {
                ufVar.f287215f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562757np);
            }
            android.view.View view4 = ufVar.f287215f;
            int i19 = f287666z;
            view4.setPadding(i19, i19, i19, i19);
            ufVar.f287219j.setVisibility(8);
        } else {
            android.view.View view5 = ufVar2.f287214e;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "fillingTopSlot", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;ILcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/ui/chatting/mvvm/item/MvvmMsgInfo;Lcom/tencent/mm/ui/chatting/adapter/IChatHolder;Lcom/tencent/mm/message/BizMMReader;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ufVar = ufVar2;
            z17 = false;
            n0(s0Var.f430299i, ufVar2.f287213d, f9Var.mo78013xfb85f7b0(), true, false, false, 0, C, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ig(this, i17, qfVar));
            ufVar.f287215f.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562749nh);
            android.view.View view6 = ufVar.f287215f;
            int i27 = f287666z;
            view6.setPadding(i27, f287665y, i27, i27);
            ufVar.f287219j.setVisibility(0);
            ufVar.f287218i.setMaxLines(30);
        }
        ufVar.f287218i.setText(s0Var.f430302n);
        lr1.f fVar = lr1.f.f402190a;
        fVar.g(s0Var.f430294d, ufVar.f287217h, s0Var, 2);
        fVar.g(s0Var.f430294d, ufVar.f287216g, s0Var, 21);
        int i28 = s0Var.f430304p;
        if (i28 != 0 && i28 != 1) {
            ufVar.f287216g.setVisibility(4);
        }
        o0(qfVar, s0Var, dVar, qVar, r0Var, ufVar.f286796a);
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.P4(f9Var.Q0())) {
            if ((f9Var.F & 16384) != 0 ? true : z17) {
                return;
            }
            java.lang.String str = s0Var.f430295e;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c c7129xc57f051c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7129xc57f051c();
            c7129xc57f051c.f144444d = 1L;
            c7129xc57f051c.f144445e = 2L;
            c7129xc57f051c.f144446f = c7129xc57f051c.b("BizContent", str, true);
            c7129xc57f051c.k();
        }
    }

    public final void i0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17, ot0.s0 s0Var, rd5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, ot0.r0 r0Var) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430294d)) {
            qfVar.f286893k.f287384e.setVisibility(8);
        } else {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.T)) {
                qfVar.f286893k.f287383d.setVisibility(8);
                qfVar.f286893k.f287384e.m84177x53cacfd7(i65.a.b(this.f287667s.g(), 90));
            } else {
                qfVar.f286893k.f287383d.setVisibility(0);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vf vfVar = qfVar.f286893k;
                vfVar.f287383d.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(this.f287667s.g(), s0Var.T, (int) vfVar.f287383d.m84164x40077844()));
                vfVar.f287383d.m84162x74f59ea8().setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
                vfVar.f287383d.m84162x74f59ea8().setStrokeWidth(0.8f);
                vfVar.f287384e.m84177x53cacfd7(0);
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = qfVar.f286893k.f287384e;
            c22624x85d69039.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y(c22624x85d69039, new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this.f287667s.g())));
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vf vfVar2 = qfVar.f286893k;
            vfVar2.f287384e.setVisibility(0);
            vfVar2.f287384e.b(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).nj(this.f287667s.g(), s0Var.f430294d, (int) vfVar2.f287384e.m84164x40077844()));
            int e17 = fq1.e.f347040a.e(this.f287667s.g()) - ((int) (i65.a.g(this.f287667s.g()) * 80.0f));
            ks5.a i18 = vfVar2.f287384e.i(e17, Integer.MAX_VALUE);
            ks5.a i19 = vfVar2.f287383d.i(e17, Integer.MAX_VALUE);
            int i27 = i18 != null ? ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i18).L + 0 : 0;
            int min = i19 != null ? java.lang.Math.min(((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2839xbddafb2a.C23000xc9450414) i19).L, 2) + 0 : 0;
            int i28 = i27 + min;
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) vfVar2.f287384e.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = (android.widget.LinearLayout.LayoutParams) vfVar2.f287383d.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams3 = (android.widget.LinearLayout.LayoutParams) vfVar2.f287386g.getLayoutParams();
            if (i28 <= 5) {
                vfVar2.f287385f.setVisibility(8);
                layoutParams3.gravity = 16;
                vfVar2.f287386g.setLayoutParams(layoutParams3);
            } else {
                vfVar2.f287384e.m84175x8dd5167d(5 - min);
                vfVar2.f287385f.setVisibility(0);
                layoutParams3.gravity = 48;
                vfVar2.f287386g.setLayoutParams(layoutParams3);
                vfVar2.f287385f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.m79);
                vfVar2.f287385f.setClickable(false);
            }
            if (i28 <= 2) {
                vfVar2.f287384e.m84184x4ee3c29f(17);
                vfVar2.f287383d.m84184x4ee3c29f(17);
                layoutParams.gravity = 17;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.T)) {
                    layoutParams2.gravity = 17;
                }
            } else {
                vfVar2.f287384e.m84184x4ee3c29f(8388627);
                vfVar2.f287383d.m84184x4ee3c29f(8388627);
                layoutParams.gravity = 8388627;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.T)) {
                    layoutParams2.gravity = 8388627;
                }
            }
            vfVar2.f287384e.setLayoutParams(layoutParams);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.T)) {
                vfVar2.f287383d.setLayoutParams(layoutParams2);
            }
        }
        if (i17 > 1) {
            qfVar.f286893k.f286796a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562757np);
        } else {
            qfVar.f286893k.f286796a.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bc9);
        }
        o0(qfVar, s0Var, dVar, qVar, r0Var, qfVar.f286893k.f286796a);
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 j0() {
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
            return com.p314xaae8f345.mm.sdk.p2603x2137b148.c4.f274029b.f274030a;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0d46  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0dac  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0de1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0dfe  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0d83  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0cdd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0e4c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0e7e  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0f18 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x094c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0c05  */
    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 r50, yb5.d r51, rd5.d r52, java.lang.String r53) {
        /*
            Method dump skipped, instructions count: 3865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.zf.l(com.tencent.mm.ui.chatting.viewitems.g0, yb5.d, rd5.d, java.lang.String):void");
    }

    public final void l0(java.lang.String str, android.widget.ImageView imageView, int i17, int i18, int i19, java.lang.String str2, r35.l0 l0Var) {
        java.lang.String b17 = qk.c.b(str, 3, true);
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423634y = j0();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
        fVar.f423611b = true;
        fVar.f423619j = i18;
        fVar.f423620k = i19;
        fVar.A = new r35.n0(2);
        fVar.B = new r35.w(2);
        fVar.f423615f = tv.a.b(b17);
        b18.k(b17, imageView, fVar.a(), null, new r35.m0(2, 0, 0, null, l0Var));
    }

    public final void m0(java.lang.String str, android.widget.ImageView imageView, int i17, int i18) {
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423634y = j0();
        fVar.f423610a = true;
        fVar.f423624o = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
        fVar.f423619j = i17;
        fVar.f423620k = i18;
        fVar.f423618i = 4;
        b17.k(str, imageView, fVar.a(), null, new r35.m0(0, 0, null, null));
    }

    public final void n0(java.lang.String str, android.widget.ImageView imageView, int i17, boolean z17, boolean z18, boolean z19, int i18, int i19, r35.l0 l0Var) {
        java.lang.String b17 = qk.c.b(str, 3, true);
        int i27 = z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.bww : com.p314xaae8f345.mm.R.C30861xcebc809e.bwv;
        if (z18) {
            i27 = com.p314xaae8f345.mm.R.C30861xcebc809e.cig;
        } else if (z19) {
            i27 = com.p314xaae8f345.mm.R.C30861xcebc809e.cih;
        }
        boolean z27 = !z17;
        int i28 = z17 ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562507gs : com.p314xaae8f345.mm.R.C30861xcebc809e.f562506gr;
        float dimensionPixelSize = this.f287667s.g().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561766s4);
        if (z18 || z19) {
            dimensionPixelSize = this.f287667s.g().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.akv);
        }
        float f17 = dimensionPixelSize;
        int e17 = fq1.e.f347040a.e(imageView.getContext()) - ((int) (i65.a.g(imageView.getContext()) * (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f287667s.f542241c.a(sb5.z.class))).T ? 72 : 32)));
        if (i18 > 0) {
            e17 = i18;
        }
        n11.a b18 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f423626q = i28;
        fVar.f423611b = true;
        fVar.D = i27 + "";
        fVar.f423619j = e17;
        fVar.f423620k = i19;
        fVar.f423634y = j0();
        fVar.A = new r35.n0(2);
        fVar.B = new r35.w(2);
        fVar.f423615f = tv.a.b(b17);
        b18.k(b17, imageView, fVar.a(), null, new r35.m0(2, e17, i19, true, z27, f17, l0Var, j0(), z18, z19));
    }

    public final void o0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, ot0.s0 s0Var, rd5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.q qVar, ot0.r0 r0Var, android.view.View view) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        android.view.View view2;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = dVar.f475787d.f526833b;
        java.lang.String y07 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f287667s.f542241c.a(sb5.f.class))).y0(s0Var.f430295e);
        if (android.text.TextUtils.isEmpty(y07)) {
            erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar, false, qVar, s0Var.f430295e, false, this.f287667s.w(), r0Var.f430111f, r0Var.f430112g, s0Var.f430294d);
            d0(erVar, s0Var, f9Var);
            view.setOnClickListener(B(this.f287667s));
        } else {
            erVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er(dVar, false, qVar, s0Var.f430295e, false, this.f287667s.w(), r0Var.f430111f, r0Var.f430112g, s0Var.f430294d, y07, (java.lang.String) null, false, false);
            view.setOnClickListener(s(this.f287667s));
        }
        erVar.A = f9Var.I0();
        erVar.B = 0;
        erVar.E = s0Var.f430303o;
        erVar.F = s0Var.f430294d;
        erVar.G = ot0.g0.j(s0Var);
        view.setTag(erVar);
        if (k01.o.a(s0Var.f430308r)) {
            java.lang.String x17 = this.f287667s.x();
            java.util.Map map = com.p314xaae8f345.mm.ui.p2650x55bb7a46.w5.f287745a;
            view.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.s5(s0Var, x17));
        }
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        long I0 = f9Var.I0();
        if (5 == s0Var.f430303o) {
            view2 = view;
            view2.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.eg(this, s0Var, 0, m124847x74d37ac6, Q0, I0));
        } else {
            view2 = view;
        }
        view2.setOnLongClickListener(u(this.f287667s));
        view2.setOnTouchListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f287667s.f542241c.a(sb5.z.class))).B1);
    }

    public final void p0(android.view.View view, int i17) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
    }

    public final void q0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.of ofVar, int i17, int i18, int i19, java.util.List list) {
        int i27;
        if (i19 != 1 || (i17 != 5 && i17 != 8 && i17 != 0)) {
            android.view.View view = ofVar.f286722b;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (i19 > 1) {
                ot0.s0 s0Var = (ot0.s0) list.get(i19 - 1);
                ot0.s0 s0Var2 = (ot0.s0) list.get(i19);
                int i28 = s0Var.f430303o;
                if ((i28 == 7 || i28 == 5 || i28 == 6 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var.f430299i)) && ((i27 = s0Var2.f430303o) == 7 || i27 == 5 || i27 == 6 || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(s0Var2.f430299i))) {
                    t0(ofVar.f286722b, A);
                } else {
                    t0(ofVar.f286722b, f287666z);
                }
            } else {
                t0(ofVar.f286722b, f287666z);
            }
        } else if (i17 == 0 && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(((ot0.s0) list.get(0)).f430299i)) {
            android.view.View view2 = ofVar.f286722b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t0(ofVar.f286722b, f287666z);
        } else {
            android.view.View view3 = ofVar.f286722b;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setItemLineAndPadding", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;IIILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (i19 == 1) {
            if (i19 != i18 - 1) {
                ofVar.f286723c.setPadding(0, f287666z, 0, f287664x);
                return;
            }
            android.view.View view4 = ofVar.f286723c;
            int i29 = f287666z;
            view4.setPadding(0, i29, 0, i29);
            return;
        }
        if (i19 == i18 - 1) {
            ofVar.f286723c.setPadding(0, f287664x, 0, f287666z);
            return;
        }
        android.view.View view5 = ofVar.f286723c;
        int i37 = f287664x;
        view5.setPadding(0, i37, 0, i37);
    }

    public final void r0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.of ofVar, ot0.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, boolean z17) {
        android.view.View view = ofVar.f286730j;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i18 = s0Var.f430303o;
        if (i18 == 5) {
            ofVar.f286728h.setVisibility(0);
            if (z17) {
                ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562539i1);
            } else {
                ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562539i1);
            }
            ofVar.f286728h.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.dg(this, ofVar));
        } else if (i18 == 6) {
            ofVar.f286728h.setVisibility(0);
            if (z17) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.j3.a(f9Var.m124847x74d37ac6(), i17).equals(te5.t.c(null))) {
                    ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562738n4);
                } else {
                    ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562739n5);
                }
            } else if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.j3.a(f9Var.m124847x74d37ac6(), i17).equals(te5.t.c(null))) {
                ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.raw.f78804xc02b313e);
            } else {
                ofVar.f286728h.setImageResource(com.p314xaae8f345.mm.R.raw.f78807x2f87b5ae);
            }
            s0(this.f287667s, ofVar.f286728h, f9Var, i17, s0Var.f430299i);
        } else if (i18 == 7) {
            ofVar.f286728h.setVisibility(8);
            android.view.View view2 = ofVar.f286730j;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "setPlayIcon", "(Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizItemHolder;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommSlot;Lcom/tencent/mm/message/BizReaderItem;Lcom/tencent/mm/storage/MsgInfo;IZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.graphics.drawable.Drawable drawable = ofVar.f286729i.getDrawable();
            if (drawable instanceof android.graphics.drawable.AnimationDrawable) {
                android.graphics.drawable.AnimationDrawable animationDrawable = (android.graphics.drawable.AnimationDrawable) drawable;
                if (animationDrawable.isRunning()) {
                    animationDrawable.stop();
                }
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.j3.a(f9Var.m124847x74d37ac6(), i17).equals(te5.t.c(null))) {
                ofVar.f286729i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562541i3);
                if (ofVar.f286729i.getDrawable() instanceof android.graphics.drawable.AnimationDrawable) {
                    ((android.graphics.drawable.AnimationDrawable) ofVar.f286729i.getDrawable()).start();
                }
            } else {
                ofVar.f286729i.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562540i2);
            }
            s0(this.f287667s, ofVar.f286729i, f9Var, i17, s0Var.f430299i);
        } else {
            ofVar.f286728h.setVisibility(8);
        }
        int b17 = i65.a.b(this.f287667s.g(), 26);
        int i19 = s0Var.f430303o;
        if (i19 == 7) {
            b17 = i65.a.b(this.f287667s.g(), 32);
        } else if (i19 == 5) {
            b17 = i65.a.b(this.f287667s.g(), 24);
        }
        android.widget.ImageView imageView = ofVar.f286728h;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = b17;
        layoutParams.height = b17;
        imageView.setLayoutParams(layoutParams);
    }

    public final void s0(yb5.d dVar, android.widget.ImageView imageView, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, int i17, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d3 d3Var = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.d3();
        d3Var.f285291a = f9Var.m124847x74d37ac6();
        d3Var.f285292b = f9Var.I0();
        d3Var.f285298h = i17;
        d3Var.f285297g = f9Var.j();
        d3Var.f285293c = com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.j3.a(d3Var.f285291a, d3Var.f285298h);
        d3Var.f285296f = il4.l.d(A(dVar, f9Var));
        d3Var.f285301k = true;
        d3Var.f285302l = 2;
        d3Var.f285299i = A(dVar, f9Var);
        imageView.setTag(d3Var);
        imageView.setOnClickListener(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) this.f287667s.f542241c.a(sb5.z.class))).H1);
    }

    public final void t0(android.view.View view, int i17) {
        if (view.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams.rightMargin = i17;
            view.setLayoutParams(layoutParams);
        } else if (view.getLayoutParams() instanceof android.widget.RelativeLayout.LayoutParams) {
            android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.rightMargin = i17;
            view.setLayoutParams(layoutParams2);
        }
    }

    public final void u0(android.view.View view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.pf pfVar, boolean z17) {
        if (!z17) {
            android.view.View view2 = pfVar.f286796a;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        if (pfVar.f286796a == null) {
            pfVar.a(view);
        }
        android.view.View view3 = pfVar.f286796a;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$ChattingItemBizFrom", "showTopSlot", "(Landroid/view/View;Lcom/tencent/mm/ui/chatting/viewitems/ChattingItemBiz$BizCommTopSlot;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void v0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.qf qfVar, int i17, int i18, ot0.s0 s0Var) {
        boolean z17 = false;
        boolean z18 = i17 == 5;
        u0(qfVar.f286884b, qfVar.f286888f, z18);
        boolean z19 = i17 == 8 && s0Var.f430306p1 == 1 && s0Var.C >= 3;
        u0(qfVar.f286884b, qfVar.f286890h, z19);
        if (z19) {
            z18 = true;
        }
        boolean z27 = i17 == 8 && !z19;
        u0(qfVar.f286884b, qfVar.f286889g, z27);
        if (z27) {
            z18 = true;
        }
        boolean z28 = i17 == 7;
        u0(qfVar.f286884b, qfVar.f286891i, z28);
        if (z28) {
            z18 = true;
        }
        boolean z29 = i17 == 6;
        u0(qfVar.f286884b, qfVar.f286892j, z29);
        if (z29) {
            z18 = true;
        }
        boolean z37 = i17 == 10;
        u0(qfVar.f286884b, qfVar.f286893k, z37);
        if (z37) {
            z18 = true;
        }
        boolean z38 = i17 == 19 && eq1.h.f337345a.b(s0Var.M, 0);
        u0(qfVar.f286884b, qfVar.f286894l, z38);
        if (z38) {
            z18 = true;
        }
        android.widget.LinearLayout linearLayout = qfVar.f286884b;
        if (!z18 && i18 > 0) {
            z17 = true;
        }
        u0(linearLayout, qfVar.f286885c, z17);
    }

    public void w0(android.content.Context context) {
        if (f287664x == 0 || com.p314xaae8f345.mm.ui.bk.Q()) {
            f287664x = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561457j3);
            f287665y = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561417hx);
            f287666z = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
            B = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561763s1);
            A = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561761rz);
            com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
            int i17 = a17.f278668a;
            int i18 = a17.f278669b;
            int g17 = (i17 < i18 ? i17 : i18) - ((int) (i65.a.g(context) * 32.0f));
            C = (int) (g17 / 2.35d);
            int i19 = (int) (g17 / 1.7777778f);
            D = i19;
            E = i19;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemBizFrom", "updatePadding w:%d h:%d coverWidth:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g17));
        }
    }
}
