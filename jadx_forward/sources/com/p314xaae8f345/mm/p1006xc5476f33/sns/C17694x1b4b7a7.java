package com.p314xaae8f345.mm.p1006xc5476f33.sns;

/* renamed from: com.tencent.mm.plugin.sns.SnsStarListUIC */
/* loaded from: classes4.dex */
public final class C17694x1b4b7a7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f244074d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6 f244075e;

    /* renamed from: f, reason: collision with root package name */
    public sb4.w f244076f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 f244077g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f244078h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f244079i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f244080m;

    /* renamed from: n, reason: collision with root package name */
    public int f244081n;

    /* renamed from: o, reason: collision with root package name */
    public int f244082o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.d6 f244083p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f244084q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 f244085r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f244086s;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f244087t;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f244088u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17694x1b4b7a7(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f244074d = jz5.h.b(new n34.j4(this));
        this.f244075e = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17969xa50b38d6(activity);
        this.f244079i = "";
        this.f244084q = "";
        this.f244085r = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f244087t = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListUIC$musicPlayerListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
            
                if (r5 != 7) goto L22;
             */
            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 r5) {
                /*
                    r4 = this;
                    java.lang.String r0 = "callback"
                    java.lang.String r1 = "com.tencent.mm.plugin.sns.SnsStarListUIC$musicPlayerListener$1"
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
                    com.tencent.mm.autogen.events.MusicPlayerEvent r5 = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4) r5
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
                    java.lang.String r2 = "event"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r2)
                    am.jk r5 = r5.f136045g
                    int r5 = r5.f88569b
                    com.tencent.mm.plugin.sns.SnsStarListUIC r2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.this
                    if (r5 == 0) goto L4c
                    r3 = 1
                    if (r5 == r3) goto L4c
                    r3 = 2
                    if (r5 == r3) goto L4c
                    r3 = 3
                    if (r5 == r3) goto L4c
                    r3 = 4
                    if (r5 == r3) goto L29
                    r3 = 7
                    if (r5 == r3) goto L4c
                    goto L55
                L29:
                    java.lang.String r5 = "MicroMsg.SnsStarListUIC"
                    java.lang.String r3 = "musicPlayerListener error"
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r5, r3)
                    sb4.w r5 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(r2)
                    if (r5 == 0) goto L3a
                    r5.notifyDataSetChanged()
                L3a:
                    androidx.appcompat.app.AppCompatActivity r5 = r2
                    r3 = 2131772157(0x7f1042fd, float:1.9175665E38)
                    java.lang.String r5 = r5.getString(r3)
                    java.lang.String r3 = "getString(...)"
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r3)
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.T6(r2, r5)
                    goto L55
                L4c:
                    sb4.w r5 = com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.Q6(r2)
                    if (r5 == 0) goto L55
                    r5.notifyDataSetChanged()
                L55:
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
                    r5 = 0
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.C17696xf08e750a.mo1xf5bc2045(com.tencent.mm.sdk.event.IEvent):boolean");
            }
        };
        this.f244088u = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5>(a0Var) { // from class: com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1
            {
                this.f39173x3fe91575 = -1443570203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 event = c5721xb5961bd5;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "musicCheckErrorListener check error");
                am.ik ikVar = event.f136044g;
                if (ikVar.f88489a == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsStarListUIC", "musicCheckErrorListener, must has error.");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                } else {
                    java.lang.String string = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ikVar.f88490b) ? ikVar.f88490b : p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112.this.getString(com.p314xaae8f345.mm.R.C30867xcad56011.h4e);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7.T6(this, string);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("callback", "com.tencent.mm.plugin.sns.SnsStarListUIC$musicCheckErrorListener$1");
                return false;
            }
        };
    }

    public static final /* synthetic */ java.lang.String O6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getAlbumSessionId$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String str = c17694x1b4b7a7.f244084q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getAlbumSessionId$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return str;
    }

    public static final /* synthetic */ android.widget.ListView P6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        android.widget.ListView U6 = c17694x1b4b7a7.U6();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return U6;
    }

    public static final /* synthetic */ sb4.w Q6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getStarListAdapter$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        sb4.w wVar = c17694x1b4b7a7.f244076f;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getStarListAdapter$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return wVar;
    }

    public static final /* synthetic */ java.lang.String R6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String str = c17694x1b4b7a7.f244079i;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getUserName$p", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return str;
    }

    public static final void S6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        c17694x1b4b7a7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clickFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        if (c17933xe8d1b226 != null) {
            java.lang.String s07 = ca4.z0.s0(c17933xe8d1b226.f68891x29d1292e);
            java.util.ArrayList arrayList2 = ta4.h1.f498284b;
            if (!arrayList2.contains(s07)) {
                arrayList2.add(s07);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clickFeed", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 b0Var = c17694x1b4b7a7.f244077g;
        if (b0Var != null) {
            b0Var.b(c17933xe8d1b226);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$onFeedClick", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    public static final void T6(com.p314xaae8f345.mm.p1006xc5476f33.sns.C17694x1b4b7a7 c17694x1b4b7a7, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        c17694x1b4b7a7.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        db5.t7.g(c17694x1b4b7a7.m158354x19263085(), str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$processPlayError", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    public final android.widget.ListView U6() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f244074d).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        android.widget.ListView listView = (android.widget.ListView) mo141623x754a37bb;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsSlotLv", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return listView;
    }

    public final java.lang.Object V6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showEndFooterView", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new n34.i4(this, null), interfaceC29045xdcb5ca57);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showEndFooterView", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        return g17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onActivityResult", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        super.mo2273x9d4787cb(i17, i18, intent);
        if (i18 == -1 && i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsStarListUIC", "from gallery return in list UI");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 c17865x2b459880 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880) intent.getParcelableExtra("sns_cmd_list") : null;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            if (c17865x2b459880 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            } else {
                java.util.List<java.lang.Integer> c17 = c17865x2b459880.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c17);
                boolean z17 = !c17.isEmpty();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2161x2eefaa.C17865x2b459880 c17865x2b4598802 = this.f244085r;
                if (z17) {
                    java.util.List c18 = c17865x2b4598802.c();
                    for (java.lang.Integer num : c17) {
                        java.util.LinkedList linkedList = (java.util.LinkedList) c18;
                        if (!linkedList.contains(num)) {
                            linkedList.add(num);
                        }
                    }
                }
                java.util.List<java.lang.Integer> b17 = c17865x2b459880.b();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
                if (true ^ b17.isEmpty()) {
                    java.util.List b18 = c17865x2b4598802.b();
                    for (java.lang.Integer num2 : b17) {
                        java.util.LinkedList linkedList2 = (java.util.LinkedList) b18;
                        if (!linkedList2.contains(num2)) {
                            linkedList2.add(num2);
                        }
                    }
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateCmdList", "com.tencent.mm.plugin.sns.SnsStarListUIC");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onActivityResult", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onCreate", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("initData", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("KEY_USER_NAME");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f244079i = stringExtra;
        this.f244080m = m158359x1e885992().getBooleanExtra("KEY_IS_SELF", false);
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra("INTENT_ALBUM_COMMENT_SESSION_ID");
        this.f244084q = stringExtra2 != null ? stringExtra2 : "";
        this.f244081n = m158359x1e885992().getIntExtra("KEY_SNS_SOURCE", 0);
        this.f244083p = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj();
        this.f244078h = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_moments_interaction_enabled_v2, true);
        this.f244076f = new sb4.w(this.f244078h, new n34.f4(this), m158354x19263085(), this.f244079i);
        U6().setAdapter((android.widget.ListAdapter) this.f244076f);
        U6().addFooterView(this.f244075e);
        U6().setOnScrollListener(new n34.g4(this));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("initData", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onCreate", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Kj().b(this.f244079i);
        java.util.ArrayList arrayList = ta4.h1.f498283a;
        java.lang.String albumSessionId = this.f244084q;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(albumSessionId, "albumSessionId");
        ta4.h1.f498285c.f142305e = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.s0.f246470k0.y().f142305e;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d = ta4.h1.f498285c;
        c6912x2cb3987d.f142325y = 2L;
        c6912x2cb3987d.f142326z = c6912x2cb3987d.b("albumSessionid", albumSessionId, true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d2 = ta4.h1.f498285c;
        java.util.ArrayList arrayList2 = ta4.h1.f498283a;
        c6912x2cb3987d2.f142308h = arrayList2.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d3 = ta4.h1.f498285c;
        java.util.ArrayList arrayList3 = ta4.h1.f498284b;
        c6912x2cb3987d3.f142309i = arrayList3.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d4 = ta4.h1.f498285c;
        c6912x2cb3987d4.f142319s = c6912x2cb3987d4.b("AlbumClickFeedListStr", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList3, "|"), true);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d5 = ta4.h1.f498285c;
        c6912x2cb3987d5.f142310j = ta4.h1.f498291i;
        java.util.ArrayList arrayList4 = ta4.h1.f498286d;
        c6912x2cb3987d5.f142312l = arrayList4.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d6 = ta4.h1.f498285c;
        java.util.ArrayList arrayList5 = ta4.h1.f498287e;
        c6912x2cb3987d6.f142313m = arrayList5.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d7 = ta4.h1.f498285c;
        c6912x2cb3987d7.f142314n = ta4.h1.f498293k;
        java.util.ArrayList arrayList6 = ta4.h1.f498288f;
        c6912x2cb3987d7.f142315o = arrayList6.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d8 = ta4.h1.f498285c;
        java.util.ArrayList arrayList7 = ta4.h1.f498289g;
        c6912x2cb3987d8.f142316p = arrayList7.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d c6912x2cb3987d9 = ta4.h1.f498285c;
        long j17 = ta4.h1.f498295m;
        c6912x2cb3987d9.f142317q = j17;
        c6912x2cb3987d9.f142318r = ta4.h1.f498291i + ta4.h1.f498293k + j17;
        c6912x2cb3987d9.k();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("reset", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        arrayList2.clear();
        arrayList3.clear();
        arrayList4.clear();
        arrayList5.clear();
        arrayList6.clear();
        arrayList7.clear();
        ta4.h1.f498290h = 0L;
        ta4.h1.f498291i = 0L;
        ta4.h1.f498292j = 0L;
        ta4.h1.f498293k = 0L;
        ta4.h1.f498294l = 0L;
        ta4.h1.f498295m = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("reset", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        ta4.h1.f498285c = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6912x2cb3987d();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.report.SnsStarListReporter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDestroy", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        super.mo2281xb01dfb57();
        this.f244088u.mo48814x2efc64();
        this.f244087t.mo48814x2efc64();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.SnsStarListUIC");
        this.f244087t.mo48813x58998cd();
        this.f244088u.mo48813x58998cd();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.SnsStarListUIC");
    }
}
