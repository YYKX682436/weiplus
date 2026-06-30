package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI */
/* loaded from: classes12.dex */
public class ActivityC15588x58c11aee extends com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f219402p1 = 0;
    public android.widget.TextView A;
    public android.widget.TextView B;
    public android.widget.TextView C;
    public android.widget.TextView D;
    public android.view.View E;
    public android.view.View F;
    public android.widget.ImageView G;
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f219403J;
    public boolean K;
    public boolean L;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.ViewOnClickListenerC15621xc82ac57 N;
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j S;
    public long T;
    public r45.iw5 V;
    public int W;
    public int X;
    public java.lang.String Y;

    /* renamed from: l1, reason: collision with root package name */
    public long f219404l1;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f219405p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f219407q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f219408r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f219409s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f219410t;

    /* renamed from: u, reason: collision with root package name */
    public android.view.View f219411u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f219412v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f219413w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.LinearLayout f219414x;

    /* renamed from: x0, reason: collision with root package name */
    public android.app.Dialog f219415x0;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.ImageView f219416y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f219418z;
    public int M = 1;
    public java.lang.String P = "";
    public java.lang.String Q = "";
    public boolean R = false;
    public su4.p1 U = null;
    public final com.p314xaae8f345.mm.p944x882e457a.u0 Z = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.u(this);

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f219406p0 = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.v(this);

    /* renamed from: y0, reason: collision with root package name */
    public int f219417y0 = -1;

    public static void f7(final com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee, int i17) {
        if (activityC15588x58c11aee.W == 0 || activityC15588x58c11aee.X == 0) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.m(activityC15588x58c11aee));
        boolean z17 = i17 > 0;
        if (z17 && "yuanbao".equals(activityC15588x58c11aee.f219443n) && com.p314xaae8f345.mm.p2621x8fb0427b.z3.L3(x51.j1.g(activityC15588x58c11aee.V.f458889d))) {
            r45.iw5 iw5Var = activityC15588x58c11aee.V;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "[+] setYuanBaoGuardianPage: user search yuanbao account, show guardian page first.");
            activityC15588x58c11aee.h7();
            android.view.View view = activityC15588x58c11aee.f219409s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = activityC15588x58c11aee.f219407q;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view3 = activityC15588x58c11aee.E;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setYuanBaoGuardianPage", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            final java.lang.String g17 = x51.j1.g(iw5Var.f458889d);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_yuanbao_ai_suc", bm5.i0.a(new java.util.HashMap(16), new m3.d("chat_name", g17)), 34004);
            activityC15588x58c11aee.F.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    java.lang.String str = g17;
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f219402p1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee2 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.this;
                    activityC15588x58c11aee2.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(str);
                    arrayList4.add(view4);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC15588x58c11aee2, array);
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC15588x58c11aee2.f219443n)) {
                        activityC15588x58c11aee2.L = true;
                        su4.k3.c(activityC15588x58c11aee2.f219443n, activityC15588x58c11aee2.M, 1, 16);
                    }
                    ((vh0.f3) ((vh0.n1) i95.n0.c(vh0.n1.class))).aj(activityC15588x58c11aee2, 16, str, false, null, null);
                    yj0.a.h(activityC15588x58c11aee2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            java.lang.String g18 = x51.j1.g(iw5Var.f458890e);
            java.lang.String str = iw5Var.f458897o;
            activityC15588x58c11aee.H.setText(g18);
            if (android.text.TextUtils.isEmpty(str)) {
                activityC15588x58c11aee.I.setVisibility(8);
                activityC15588x58c11aee.I.setText("");
            } else {
                activityC15588x58c11aee.I.setVisibility(0);
                activityC15588x58c11aee.I.setText(str);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(activityC15588x58c11aee.G, g17, null);
            activityC15588x58c11aee.f219403J.setVisibility(0);
            activityC15588x58c11aee.f219403J.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.fts.ui.FTSAddFriendUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view4) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.f219402p1;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee activityC15588x58c11aee2 = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.ActivityC15588x58c11aee.this;
                    activityC15588x58c11aee2.getClass();
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view4);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", activityC15588x58c11aee2, array);
                    activityC15588x58c11aee2.g7(activityC15588x58c11aee2.f219443n, 0);
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("yuanbao_search_wx_account", "view_clk", java.util.Collections.emptyMap(), 34004);
                    yj0.a.h(activityC15588x58c11aee2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            return;
        }
        if (!activityC15588x58c11aee.isFinishing()) {
            y13.n nVar = (y13.n) activityC15588x58c11aee.m80391xac8f1cfd(y13.n.class);
            java.lang.String str2 = activityC15588x58c11aee.f219443n;
            if (!((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) nVar.f540430m).mo141623x754a37bb()).i("do_not_show_yuanbao_ad", false)) {
                jz5.g gVar = nVar.f540424d;
                if (z17 && kz5.z.G(vh0.k2.f518425a, str2)) {
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put("view_id", "add_fri_yuanbao_btn");
                    ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 34004);
                    java.lang.Object mo141623x754a37bb = ((jz5.n) gVar).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
                    ((android.widget.LinearLayout) mo141623x754a37bb).setVisibility(0);
                } else {
                    java.lang.Object mo141623x754a37bb2 = ((jz5.n) gVar).mo141623x754a37bb();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb2, "getValue(...)");
                    ((android.widget.LinearLayout) mo141623x754a37bb2).setVisibility(8);
                }
            }
        }
        int i18 = activityC15588x58c11aee.W;
        if (i18 > 0 && activityC15588x58c11aee.X < 0) {
            activityC15588x58c11aee.L = true;
            activityC15588x58c11aee.j7();
            return;
        }
        if (i18 > 0) {
            r45.iw5 iw5Var2 = activityC15588x58c11aee.V;
            activityC15588x58c11aee.i7();
            if ("yuanbao".equals(activityC15588x58c11aee.Y)) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_yuanbao_real_suc", java.util.Collections.emptyMap(), 34004);
            }
            java.lang.String g19 = x51.j1.g(iw5Var2.f458889d);
            java.lang.String g27 = x51.j1.g(iw5Var2.f458890e);
            java.lang.String str3 = iw5Var2.f458897o;
            activityC15588x58c11aee.f219436d.setVisibility(8);
            android.view.View view4 = activityC15588x58c11aee.f219407q;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view5 = activityC15588x58c11aee.f219408r;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15588x58c11aee.f219412v.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.s(activityC15588x58c11aee));
            activityC15588x58c11aee.f219418z.setText(g27);
            activityC15588x58c11aee.A.setText(str3);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(activityC15588x58c11aee.f219416y, g19, null);
            android.view.View view6 = activityC15588x58c11aee.f219409s;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view6, arrayList6.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view7 = activityC15588x58c11aee.f219410t;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view7, arrayList7.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view8 = activityC15588x58c11aee.f219411u;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(8);
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view8, arrayList8.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasContactLayout", "(Lcom/tencent/mm/protocal/protobuf/SearchContactResponse;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15588x58c11aee.N.setVisibility(8);
        } else {
            activityC15588x58c11aee.h7();
        }
        if (activityC15588x58c11aee.X <= 0) {
            activityC15588x58c11aee.i7();
            android.view.View view9 = activityC15588x58c11aee.f219410t;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList9.add(8);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view9, arrayList9.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view10 = activityC15588x58c11aee.f219411u;
            java.util.ArrayList arrayList10 = new java.util.ArrayList();
            arrayList10.add(8);
            java.util.Collections.reverse(arrayList10);
            yj0.a.d(view10, arrayList10.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15588x58c11aee.N.setVisibility(8);
            return;
        }
        activityC15588x58c11aee.i7();
        if (su4.r2.l()) {
            return;
        }
        activityC15588x58c11aee.M = 2;
        android.view.View view11 = activityC15588x58c11aee.E;
        java.util.ArrayList arrayList11 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
        arrayList11.add(8);
        java.util.Collections.reverse(arrayList11);
        yj0.a.d(view11, arrayList11.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view11.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
        yj0.a.f(view11, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setHasSearchContentLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!activityC15588x58c11aee.R) {
            android.widget.TextView textView = activityC15588x58c11aee.B;
            java.lang.String string = activityC15588x58c11aee.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573703fh0);
            java.lang.String str4 = activityC15588x58c11aee.f219443n;
            textView.setText(o13.q.d(string, "", p13.i.a(str4, str4, false, false)).f432638a);
            android.view.View view12 = activityC15588x58c11aee.f219410t;
            java.util.ArrayList arrayList12 = new java.util.ArrayList();
            arrayList12.add(0);
            java.util.Collections.reverse(arrayList12);
            yj0.a.d(view12, arrayList12.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view12.setVisibility(((java.lang.Integer) arrayList12.get(0)).intValue());
            yj0.a.f(view12, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view13 = activityC15588x58c11aee.f219411u;
            java.util.ArrayList arrayList13 = new java.util.ArrayList();
            arrayList13.add(0);
            java.util.Collections.reverse(arrayList13);
            yj0.a.d(view13, arrayList13.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view13.setVisibility(((java.lang.Integer) arrayList13.get(0)).intValue());
            yj0.a.f(view13, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setSearchContent", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            activityC15588x58c11aee.f219411u.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.q(activityC15588x58c11aee));
            return;
        }
        activityC15588x58c11aee.f219413w.setVisibility(0);
        activityC15588x58c11aee.f219414x.removeAllViews();
        android.widget.ImageView imageView = (android.widget.ImageView) activityC15588x58c11aee.f219413w.findViewById(com.p314xaae8f345.mm.R.id.f568135uy1);
        if (j62.e.g().l("clicfg_android_use_search_global_sug_feedback", false, true, true)) {
            imageView.setVisibility(0);
            imageView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.r(activityC15588x58c11aee));
        }
        java.lang.String str5 = activityC15588x58c11aee.f219443n;
        if (activityC15588x58c11aee.U != null) {
            gm0.j1.d().d(activityC15588x58c11aee.U);
            activityC15588x58c11aee.U = null;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        r45.g55 g55Var = new r45.g55();
        g55Var.f456422d = str5;
        g55Var.f456425g = java.lang.Long.toString(currentTimeMillis);
        g55Var.f456424f = su4.r2.f(16);
        g55Var.f456427i = 1;
        g55Var.f456428m = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5);
        g55Var.f456433r = com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0);
        g55Var.f456434s = 6;
        activityC15588x58c11aee.mo55332x76847179().getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0);
        float b17 = j65.c.b(activityC15588x58c11aee.mo55332x76847179());
        r45.x50 x50Var = new r45.x50();
        x50Var.f471321d = "fontSize";
        x50Var.f471323f = java.lang.Float.toString(b17);
        java.util.LinkedList linkedList = g55Var.f456436u;
        linkedList.add(x50Var);
        r45.x50 x50Var2 = new r45.x50();
        x50Var2.f471321d = "screenWidth";
        x50Var2.f471322e = com.p314xaae8f345.mm.ui.zk.b(activityC15588x58c11aee.mo55332x76847179(), com.p314xaae8f345.mm.ui.bl.b(activityC15588x58c11aee.mo55332x76847179()).y);
        linkedList.add(x50Var2);
        activityC15588x58c11aee.U = new su4.p1(g55Var);
        gm0.j1.d().g(activityC15588x58c11aee.U);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.m
    public void C3(java.lang.String str, java.lang.String str2, java.util.List list, tj5.o oVar) {
        super.C3(str, str2, list, oVar);
        this.K = false;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.n
    public boolean G0() {
        g7(this.f219443n, 1);
        mo48674x36654fab();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.f0 U6(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0 w0Var) {
        if (this.S == null) {
            this.S = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.j(w0Var);
        }
        return this.S;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void d7() {
        super.d7();
        android.view.View view = this.f219407q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "startSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca
    public void e7() {
        super.e7();
        android.view.View view = this.f219407q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "stopSearch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g7(java.lang.String str, int i17) {
        this.K = true;
        this.L = false;
        this.M = 1;
        if (str == null || str.length() == 0 || str.trim().length() == 0) {
            return;
        }
        this.f219417y0 = java.lang.Character.isDigit(str.charAt(0)) ? 15 : 3;
        this.W = 0;
        this.X = 0;
        gm0.j1.d().a(106, this.f219406p0);
        tg3.r1 r1Var = new tg3.r1(str, 1, 3, false, i17);
        gm0.j1.d().g(r1Var);
        this.f219415x0 = db5.e1.Q(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), getString(com.p314xaae8f345.mm.R.C30867xcad56011.icm), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.k(this, r1Var));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("add_friends_sessionid", this.P);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("search_trigger", hashMap, 33926);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bbs;
    }

    public final void h7() {
        i7();
        this.f219436d.setVisibility(8);
        android.view.View view = this.f219407q;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = this.f219408r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = this.f219409s;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view4 = this.f219410t;
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view4, arrayList4.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view5 = this.f219411u;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(8);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view5, arrayList5.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view5.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view5, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoContactLayout", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.N.setVisibility(8);
    }

    public final void i7() {
        android.view.View view = this.E;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoYuanBaoGuardianPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/fts/ui/FTSAddFriendUI", "setNoYuanBaoGuardianPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        this.f219403J.setVisibility(8);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.HashSet hashSet = new java.util.HashSet(super.mo43419xa59964ef());
        hashSet.add(x13.a.class);
        hashSet.add(y13.n.class);
        return hashSet;
    }

    public final void j7() {
        java.lang.String g17 = x51.j1.g(this.V.f458889d);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (g17 == null) {
            g17 = "";
        }
        if (g17.length() > 0) {
            int i17 = this.V.K;
            if (2 == i17) {
                this.f219417y0 = 15;
            } else if (1 == i17) {
                this.f219417y0 = 1;
            }
            android.content.Intent intent = new android.content.Intent();
            ((c01.j0) ((qk.o6) i95.n0.c(qk.o6.class))).Ai(intent, this.V, this.f219417y0);
            if (this.f219417y0 == 15 && 2 == this.V.K) {
                intent.putExtra("Contact_Search_Mobile", this.Y);
            }
            intent.putExtra("add_more_friend_search_scene", 2);
            j45.l.j(this, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, tj5.n
    /* renamed from: onClickClearTextBtn */
    public void mo56570x81f2906b(android.view.View view) {
        super.mo56570x81f2906b(view);
        if (this.f219440h.m80997xdc5215a6().k()) {
            return;
        }
        this.f219440h.m80997xdc5215a6().m();
        mo26063x7b383410();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        o13.p.f423783c = o13.n.g(16);
        android.transition.Transition inflateTransition = android.transition.TransitionInflater.from(this).inflateTransition(android.R.transition.fade);
        inflateTransition.excludeTarget(getWindow().getDecorView().findViewById(com.p314xaae8f345.mm.R.id.f563968ei), true);
        inflateTransition.excludeTarget(android.R.id.statusBarBackground, true);
        getWindow().setEnterTransition(inflateTransition);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        this.f219441i = mo55332x76847179().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bka);
        this.f219440h.m80997xdc5215a6().m80989x764b0e09(W6());
        this.R = ((sg0.u3) ((tg0.w1) i95.n0.c(tg0.w1.class))).cj();
        this.f219405p = findViewById(com.p314xaae8f345.mm.R.id.ago);
        this.f219407q = findViewById(com.p314xaae8f345.mm.R.id.cag);
        this.f219408r = findViewById(com.p314xaae8f345.mm.R.id.f566745gx3);
        this.f219412v = findViewById(com.p314xaae8f345.mm.R.id.cah);
        this.f219409s = findViewById(com.p314xaae8f345.mm.R.id.f567676kc2);
        this.f219410t = findViewById(com.p314xaae8f345.mm.R.id.ji8);
        this.f219411u = findViewById(com.p314xaae8f345.mm.R.id.mdu);
        this.N = (com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.ViewOnClickListenerC15621xc82ac57) findViewById(com.p314xaae8f345.mm.R.id.lts);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.uxz);
        this.f219413w = linearLayout;
        this.f219414x = (android.widget.LinearLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.ltc);
        this.f219416y = (android.widget.ImageView) findViewById(com.p314xaae8f345.mm.R.id.ca7);
        this.f219418z = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cfq);
        this.A = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cal);
        this.B = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mfm);
        this.C = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.cam);
        this.D = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.mdw);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.spi);
        this.E = findViewById;
        this.F = findViewById.findViewById(com.p314xaae8f345.mm.R.id.spg);
        this.G = (android.widget.ImageView) this.E.findViewById(com.p314xaae8f345.mm.R.id.spf);
        this.H = (android.widget.TextView) this.E.findViewById(com.p314xaae8f345.mm.R.id.spj);
        this.I = (android.widget.TextView) this.E.findViewById(com.p314xaae8f345.mm.R.id.sph);
        this.f219403J = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.v1k);
        try {
            java.lang.String optString = su4.o2.d("webSearchBar").optString("wording");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSAddFriendUI", "set searchNetworkTips %s", optString);
            this.D.setText(optString);
        } catch (java.lang.Exception unused) {
        }
        m78513xc2a54588().postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n(this), 128L);
        this.f219405p.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.o(this));
        this.f219407q.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p(this));
        this.P = getIntent().getStringExtra("report_add_friends_sessionid");
        gm0.j1.d().a(1076, this.Z);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.d().q(1076, this.Z);
        gm0.j1.d().q(106, this.f219406p0);
        if (!this.K || this.L) {
            return;
        }
        su4.k3.c(this.f219443n, this.M, 3, 16);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        su4.r2.o();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.AbstractActivityC15594x3d6ad6ca, com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.w0
    public void x6(android.view.View view, u13.g gVar, boolean z17) {
        if (!(gVar instanceof e23.c) || java.lang.System.currentTimeMillis() - this.T <= 1000) {
            return;
        }
        this.T = java.lang.System.currentTimeMillis();
        g7(gVar.i(), 1);
    }
}
