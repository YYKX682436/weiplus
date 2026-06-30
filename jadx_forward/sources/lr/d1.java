package lr;

/* loaded from: classes15.dex */
public final class d1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.ImageView f402040d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f402041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lr.f1 f402042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(lr.f1 f1Var, android.view.View view) {
        super(view);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        this.f402042f = f1Var;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.n0v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f402040d = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.n0u);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f402041e = (android.widget.ImageView) findViewById2;
        view.setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View v17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        lr.c1 c1Var = this.f402042f.f402051f;
        if (c1Var != null) {
            int m8183xf806b362 = m8183xf806b362();
            com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.d dVar = ((com.p314xaae8f345.mm.p2776x373aa5.p2783x31c90fad.f) c1Var).f295191a;
            ir.y0 x17 = dVar.f295174q.x(m8183xf806b362);
            if (x17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "tab is null. ignore click action.");
            } else {
                ir.r rVar = x17.f375452a;
                int i17 = rVar.f375428a;
                if (i17 == 2) {
                    j45.l.j(v17.getContext(), "emoji", ".ui.EmojiMineUI", new android.content.Intent(), null);
                } else if (i17 != 3) {
                    ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.o2) ((ty.g0) i95.n0.c(ty.g0.class))).wi();
                    int i18 = x17.f375453b;
                    java.lang.String c17 = rVar.c();
                    nr.h hVar = dVar.R;
                    hVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18231, java.lang.Long.valueOf(hVar.f420580a), java.lang.Integer.valueOf(hVar.f420581b), java.lang.Integer.valueOf(hVar.f420582c), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Integer.valueOf(i18 + 1), c17);
                    hVar.f420582c++;
                    dVar.k(i18, true);
                    p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = dVar.f295163f;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i18));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(c1163xf1deaba4, arrayList2.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                    c1163xf1deaba4.a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(c1163xf1deaba4, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "Undefined", "scrollToPosition", "(I)V");
                    mr.i iVar = dVar.f295166i;
                    if (iVar.f412358m != i18) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CenterPagerSnapHelper", "updateSnapPosition from " + iVar.f412358m + " to " + i18);
                        iVar.f412358m = i18;
                    }
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.j0 j0Var = dVar.L;
                    if (j0Var != null) {
                        java.lang.String str = dVar.f295160c;
                        java.lang.String str2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662.I1;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18037xf8026662 c18037xf8026662 = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C18042x1f48f243) j0Var).f248652a;
                        c18037xf8026662.getClass();
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$setSmileyInitTab$9", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCommentFooter", "smiley tab change productId: %s", str);
                        c18037xf8026662.f248645y1 = str;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$setSmileyInitTab$9", "com.tencent.mm.plugin.sns.ui.SnsCommentFooter");
                    }
                    if (rVar.c().equals("capture") && dVar.f295175r.f375381g) {
                        if (((km0.c) gm0.j1.p().a()).a()) {
                            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_CAPTURE_TAB_RED_DOT_BOOLEAN, java.lang.Boolean.TRUE);
                        }
                        android.view.View findViewById = v17.findViewById(com.p314xaae8f345.mm.R.id.n0u);
                        if (findViewById != null) {
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            arrayList3.add(8);
                            java.util.Collections.reverse(arrayList3);
                            yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                            yj0.a.f(findViewById, "com/tencent/mm/view/manager/SmileyPanelManager$10", "onItemClick", "(ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        }
                    }
                } else if (w75.a.a() && com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
                    dVar.l(v17.getContext(), dVar.H, null);
                } else {
                    android.content.Context context = v17.getContext();
                    qk.z zVar = new qk.z();
                    zVar.f445646i = 17;
                    zVar.f445688a = 13;
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(dVar.f295178u)) {
                        java.lang.String str3 = dVar.f295178u;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
                        zVar.f445647j = str3;
                    }
                    com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6 p6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.p6.class);
                    if (p6Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.emoji.SmileyPanel.SmileyPanelManager", "unable to get emoticon liteapp feature service");
                    } else {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.f4) p6Var).wi(context, zVar);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.d(11594, 2);
                    g0Var.d(12065, 8);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/emoji/panel/adapter/SmileyTabAdapter$ViewHolder", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
