package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment;", "Lcom/tencent/mm/plugin/game/ui/chat_tab/AbsGameRoomFragment;", "<init>", "()V", "plugin-game_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.game.ui.chat_tab.GameMsgNoticeFragment */
/* loaded from: classes8.dex */
public final class C16005x8451a937 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.AbstractC15992x49ab61cf {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f222663s = 0;

    /* renamed from: e, reason: collision with root package name */
    public o43.a f222665e;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 f222667g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a f222668h;

    /* renamed from: i, reason: collision with root package name */
    public g63.b f222669i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 f222670m;

    /* renamed from: n, reason: collision with root package name */
    public int f222671n;

    /* renamed from: o, reason: collision with root package name */
    public int f222672o;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f222664d = "InteractiveMsg";

    /* renamed from: f, reason: collision with root package name */
    public boolean f222666f = true;

    /* renamed from: p, reason: collision with root package name */
    public int f222673p = 15;

    /* renamed from: q, reason: collision with root package name */
    public final int f222674q = 15;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f222675r = "";

    public final java.lang.String j0(java.lang.Integer num) {
        int intValue = num != null ? num.intValue() : 0;
        java.util.HashMap hashMap = new java.util.HashMap();
        if (intValue > 0) {
            hashMap.put("RedDot", "1");
        } else {
            hashMap.put("RedDot", "2");
        }
        hashMap.put("TotalNum", java.lang.String.valueOf(intValue));
        java.lang.String b17 = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "genExtInfo(...)");
        return b17;
    }

    public final void l0(g63.b holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        x4.a aVar = holder.f374656g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        a63.b bVar = (a63.b) aVar;
        android.view.View view = holder.f3639x46306858;
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.c0(view, this));
        bVar.f83272b.setImageResource(com.p314xaae8f345.mm.R.raw.f79457x85f9ab6c);
        itemView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562839q2);
        bVar.f83273c.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fny);
        android.widget.TextView textView = bVar.f83274d;
        textView.setVisibility(0);
        bVar.f83278h.setVisibility(8);
        bVar.f83277g.setVisibility(0);
        android.view.View view2 = bVar.f83275e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = bVar.f83276f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/game/ui/chat_tab/GameMsgNoticeFragment", "onBindHeaderViewHolder", "(Lcom/tencent/mm/plugin/gamelife/ui/GameLifeConversationAdapter$ConversationViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2);
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(Bi));
        android.widget.ImageView imageView = bVar.f83281k;
        if (Bi > 0) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var = this.f222670m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var2 = null;
        if (e1Var == null || e1Var.f68480x991217c != 2) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.foq);
            android.database.Cursor i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().i1(2);
            if (i17 != null) {
                if (i17.moveToFirst()) {
                    e1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1();
                    e1Var2.mo9015xbf5d97fd(i17);
                }
                i17.close();
            }
            if (e1Var2 != null) {
                e1Var2.t0();
                string = e1Var2.f221812d2.f221945c;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    string = e1Var2.f221814f2.f221934b;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flm);
                }
                int u17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(2);
                if (u17 > 1) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fnz, java.lang.Integer.valueOf(u17), string);
                }
            }
            textView.setText(string);
        } else {
            e1Var.t0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var3 = this.f222670m;
            if (e1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("messageByGameMsgId");
                throw null;
            }
            java.lang.String mDesc = e1Var3.f221812d2.f221945c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mDesc, "mText");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mDesc)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.e1 e1Var4 = this.f222670m;
                if (e1Var4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("messageByGameMsgId");
                    throw null;
                }
                mDesc = e1Var4.f221814f2.f221934b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mDesc, "mDesc");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mDesc)) {
                mDesc = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.flm);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mDesc, "getString(...)");
            }
            textView.setText(mDesc);
        }
        if (this.f222666f) {
            this.f222666f = false;
            com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 21, 2101, 2, 1, (int) e63.a.f331350a, j0(java.lang.Integer.valueOf(Bi)));
        }
    }

    public final void m0() {
        g63.b bVar = this.f222669i;
        if (bVar == null) {
            return;
        }
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerHolder");
            throw null;
        }
        x4.a aVar = bVar.f374656g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar, "null cannot be cast to non-null type com.tencent.mm.plugin.gamelife.databinding.GamelifeConversationNormalItemBinding");
        ((a63.b) aVar).f83281k.setVisibility(0);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreate */
    public void mo7398x3e5a77bb(android.os.Bundle bundle) {
        super.mo7398x3e5a77bb(bundle);
        if (bundle != null) {
            this.f222672o = bundle.getInt("fromScene", 0);
        }
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onCreateView */
    public android.view.View mo7503x18bad100(android.view.LayoutInflater inflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inflater, "inflater");
        android.view.View inflate = inflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bbl, viewGroup, false);
        int i17 = com.p314xaae8f345.mm.R.id.dfk;
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.dfk);
        if (linearLayout != null) {
            i17 = com.p314xaae8f345.mm.R.id.gm_;
            android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gm_);
            if (frameLayout != null) {
                i17 = com.p314xaae8f345.mm.R.id.gma;
                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.gma);
                if (c16016x82ee182a != null) {
                    android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) inflate;
                    android.widget.ImageView imageView = (android.widget.ImageView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.h8d);
                    if (imageView != null) {
                        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ilk);
                        if (c22851x22587864 != null) {
                            android.widget.TextView textView = (android.widget.TextView) x4.b.a(inflate, com.p314xaae8f345.mm.R.id.ilo);
                            if (textView != null) {
                                this.f222665e = new o43.a(linearLayout2, linearLayout, frameLayout, c16016x82ee182a, linearLayout2, imageView, c22851x22587864, textView);
                                a63.b a17 = a63.b.a(inflater, viewGroup, false);
                                android.widget.LinearLayout linearLayout3 = a17.f83271a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout3, "getRoot(...)");
                                g63.b bVar = new g63.b(linearLayout3, a17);
                                this.f222669i = bVar;
                                android.view.View itemView = bVar.f3639x46306858;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                                this.f222671n = ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().u1(1);
                                g63.b bVar2 = this.f222669i;
                                if (bVar2 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerHolder");
                                    throw null;
                                }
                                l0(bVar2);
                                o43.a aVar = this.f222665e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
                                android.view.View findViewById = aVar.f424371a.findViewById(com.p314xaae8f345.mm.R.id.gma);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a) findViewById;
                                this.f222668h = c16016x82ee182a2;
                                c16016x82ee182a2.m53684x77114253(itemView);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a3 = this.f222668h;
                                if (c16016x82ee182a3 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                c16016x82ee182a3.m64813x498822e4(mo7438x76847179());
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a4 = this.f222668h;
                                if (c16016x82ee182a4 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                c16016x82ee182a4.m64814x2468bef7(this.f222672o);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a5 = this.f222668h;
                                if (c16016x82ee182a5 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                c16016x82ee182a5.m64811x5f9238b0(this.f222675r);
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a6 = this.f222668h;
                                if (c16016x82ee182a6 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c16016x82ee182a6.mo7946xf939df19();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df19);
                                if (mo7946xf939df19.mo1894x7e414b06() <= 1) {
                                    o43.a aVar2 = this.f222665e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar2);
                                    aVar2.f424372b.setVisibility(0);
                                }
                                com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a7 = this.f222668h;
                                if (c16016x82ee182a7 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                                    throw null;
                                }
                                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df192 = c16016x82ee182a7.mo7946xf939df19();
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7946xf939df192);
                                mo7946xf939df192.mo8163xed962dec(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.d0(this));
                                if (com.p314xaae8f345.mm.ui.bk.C()) {
                                    o43.a aVar3 = this.f222665e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
                                    ((android.widget.ImageView) aVar3.f424372b.findViewById(com.p314xaae8f345.mm.R.id.h8d)).setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c6g);
                                } else {
                                    o43.a aVar4 = this.f222665e;
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar4);
                                    ((android.widget.ImageView) aVar4.f424372b.findViewById(com.p314xaae8f345.mm.R.id.h8d)).setImageResource(com.p314xaae8f345.mm.R.raw.f79451x113e62a3);
                                }
                                o43.a aVar5 = this.f222665e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar5);
                                android.view.View findViewById2 = aVar5.f424371a.findViewById(com.p314xaae8f345.mm.R.id.ilk);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
                                com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById2;
                                this.f222667g = c22851x225878642;
                                mn5.a aVar6 = new mn5.a();
                                aVar6.f411724a = 0.5f;
                                aVar6.f411725b = 300;
                                aVar6.f411726c = true;
                                aVar6.f411728e = true;
                                aVar6.f411729f = true;
                                aVar6.f411730g = true;
                                aVar6.f411731h = false;
                                aVar6.f411732i = false;
                                aVar6.f411733j = true;
                                aVar6.f411734k = true;
                                aVar6.f411735l = true;
                                aVar6.f411736m = false;
                                aVar6.f411737n = false;
                                aVar6.f411738o = true;
                                aVar6.f411739p = false;
                                aVar6.f411740q = false;
                                c22851x225878642.m82934x82b4ca8f(aVar6);
                                com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878643 = this.f222667g;
                                if (c22851x225878643 == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("refreshLayout");
                                    throw null;
                                }
                                c22851x225878643.m82945xba09cf09(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1756x55b2162e.b0(this));
                                o43.a aVar7 = this.f222665e;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar7);
                                android.widget.LinearLayout linearLayout4 = aVar7.f424371a;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout4, "getRoot(...)");
                                return linearLayout4;
                            }
                            i17 = com.p314xaae8f345.mm.R.id.ilo;
                        } else {
                            i17 = com.p314xaae8f345.mm.R.id.ilk;
                        }
                    } else {
                        i17 = com.p314xaae8f345.mm.R.id.h8d;
                    }
                }
            }
        }
        throw new java.lang.NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i17)));
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onDestroyView */
    public void mo7399xa6664a60() {
        if (this.f222669i != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = this.f222668h;
            if (c16016x82ee182a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
                throw null;
            }
            android.os.Handler handler = c16016x82ee182a.f223035o2;
            if (handler != null) {
                java.lang.Runnable runnable = c16016x82ee182a.f223033m2;
                if (runnable != null) {
                    handler.removeCallbacks(runnable);
                }
                c16016x82ee182a.f223035o2 = null;
            }
        }
        super.mo7399xa6664a60();
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tab", "1");
        hashMap.put("newmsg", java.lang.String.valueOf(this.f222671n));
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.c(mo7438x76847179(), 13, 1300, 0, 1, this.f222672o, com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.l.b(hashMap));
        this.f222671n = 0;
        g63.b bVar = this.f222669i;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerHolder");
            throw null;
        }
        l0(bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.C16016x82ee182a c16016x82ee182a = this.f222668h;
        if (c16016x82ee182a == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameInteractiveMsgView");
            throw null;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.ui.p1758x38eb0007.v(c16016x82ee182a));
    }
}
