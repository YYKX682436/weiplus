package k22;

/* loaded from: classes12.dex */
public final class g implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public long A;
    public int B;
    public java.lang.String C;
    public final java.lang.String D;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f385016d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 f385017e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f385018f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f385019g;

    /* renamed from: h, reason: collision with root package name */
    public final int f385020h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f385021i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f385022m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f385023n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f385024o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f385025p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f385026q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f385027r;

    /* renamed from: s, reason: collision with root package name */
    public z12.o f385028s;

    /* renamed from: t, reason: collision with root package name */
    public z12.q f385029t;

    /* renamed from: u, reason: collision with root package name */
    public final android.view.View f385030u;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View f385031v;

    /* renamed from: w, reason: collision with root package name */
    public yz5.a f385032w;

    /* renamed from: x, reason: collision with root package name */
    public yz5.a f385033x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f385034y;

    /* renamed from: z, reason: collision with root package name */
    public int f385035z;

    public g(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 emojiInfo, boolean z17, long j17, java.lang.String str, java.lang.String sdkRequestID, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkRequestID, "sdkRequestID");
        this.f385016d = context;
        this.f385017e = emojiInfo;
        this.f385018f = z17;
        this.f385019g = sdkRequestID;
        this.f385020h = i17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 3, 1);
        this.f385021i = z2Var;
        p3325xe03a0797.p3326xc267989b.z0.b();
        this.f385030u = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbw, (android.view.ViewGroup) null);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a6n, (android.view.ViewGroup) null);
        this.f385031v = inflate;
        this.D = "MicroMsg.EmojiStoreV3SingleProductHalfDialog";
        ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.b0.class)).getClass();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 u17 = com.p314xaae8f345.mm.p2621x8fb0427b.n5.f().c().u1(emojiInfo.f68671x4b6e68b9);
        if (u17 != null) {
            long j18 = emojiInfo.f68658xff1c8bcd;
            this.f385017e = u17;
            u17.f68658xff1c8bcd = j18;
        }
        this.f385027r = this.f385017e.f68653x95b20dd4 == 81;
        c();
        android.view.View view = z2Var.f293591g;
        if (view != null) {
            dy1.a.i(view, "emoticon_album_halfpanel");
        }
        android.view.View view2 = z2Var.f293591g;
        if (view2 != null) {
            dy1.a.d(view2, 32, 10, false);
        }
        android.view.View view3 = z2Var.f293591g;
        if (view3 != null) {
            dy1.a.k(view3, b());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = z2Var.f293604w;
        if (c22661xa3a2b3c0 != null) {
            dy1.a.i(c22661xa3a2b3c0, "emoticon_album_halfshare");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = z2Var.f293604w;
        if (c22661xa3a2b3c02 != null) {
            dy1.a.k(c22661xa3a2b3c02, b());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c03 = z2Var.f293604w;
        if (c22661xa3a2b3c03 != null) {
            dy1.a.d(c22661xa3a2b3c03, 8, 10, false);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c04 = z2Var.f293603v;
        if (c22661xa3a2b3c04 != null) {
            dy1.a.i(c22661xa3a2b3c04, "emoticon_album_halfadd");
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c05 = z2Var.f293603v;
        if (c22661xa3a2b3c05 != null) {
            dy1.a.k(c22661xa3a2b3c05, b());
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c06 = z2Var.f293603v;
        if (c22661xa3a2b3c06 != null) {
            dy1.a.d(c22661xa3a2b3c06, 8, 10, false);
        }
        k22.a aVar = new k22.a(this);
        k22.b bVar = new k22.b(this);
        z2Var.D = aVar;
        z2Var.E = bVar;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.dbb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = (com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9) findViewById;
        this.f385022m = abstractC10447x8c9cf7d9;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.s(abstractC10447x8c9cf7d9, 2);
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d92 = this.f385022m;
        if (abstractC10447x8c9cf7d92 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
            throw null;
        }
        abstractC10447x8c9cf7d92.m43715x36e51bc8(new k22.c(this));
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d93 = this.f385022m;
        if (abstractC10447x8c9cf7d93 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiView");
            throw null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f385017e;
        abstractC10447x8c9cf7d93.m43712xc040f7d2(c21053xdbf1e5f4);
        java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
        s25.a wi6 = ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo42933xb5885648)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3SingleProductHalfDialog", "no desc, emojiInfo md5 error");
        } else {
            java.lang.String field_custom_meaning = ((y12.h) wi6).v(mo42933xb5885648);
            field_custom_meaning = field_custom_meaning == null ? "" : field_custom_meaning;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(field_custom_meaning) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.H2)) {
                field_custom_meaning = c21053xdbf1e5f4.H2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_custom_meaning, "meaning");
            }
            if ((field_custom_meaning.length() == 0) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f4.f68656xc887dd14)) {
                field_custom_meaning = c21053xdbf1e5f4.f68656xc887dd14;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_custom_meaning, "field_custom_meaning");
            }
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dba);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
            this.f385023n = (android.widget.TextView) findViewById2;
            d(field_custom_meaning);
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.t7l);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            this.f385024o = (android.widget.TextView) findViewById3;
            long j19 = 16;
            boolean z18 = (((c21053xdbf1e5f4.f68658xff1c8bcd & j19) > 0L ? 1 : ((c21053xdbf1e5f4.f68658xff1c8bcd & j19) == 0L ? 0 : -1)) != 0) || (j17 & j19) != 0;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.f179066a;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_emoticon_original_label_android, false)).booleanValue() || java.lang.Boolean.valueOf(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2528x5c28046.C20140xee5b0ad8()) == 1).booleanValue());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "isEmoticonShowOriginalAllowed(...)");
            if (valueOf.booleanValue() && z18) {
                android.widget.TextView textView = this.f385024o;
                if (textView == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalTipsTv");
                    throw null;
                }
                textView.setVisibility(0);
                android.widget.TextView textView2 = this.f385024o;
                if (textView2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalTipsTv");
                    throw null;
                }
                textView2.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a_9));
            } else {
                android.widget.TextView textView3 = this.f385024o;
                if (textView3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("originalTipsTv");
                    throw null;
                }
                textView3.setVisibility(8);
            }
            android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.dbe);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
            this.f385026q = findViewById4;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById4, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = this.f385026q;
                if (view4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                    throw null;
                }
                android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.lt6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
                this.f385025p = (android.widget.TextView) findViewById5;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById4, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById4.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById4, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "initViews", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            z2Var.j(inflate);
            z2Var.l(new k22.d(this));
        }
        gm0.j1.n().f354821b.a(521, this);
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f42 = this.f385017e;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f42.f68663x861009b5)) {
            gm0.j1.n().f354821b.g(new z12.p(c21053xdbf1e5f42.f68663x861009b5));
        }
        if (z17) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f42.f68663x861009b5)) {
                gm0.j1.n().f354821b.a(412, this);
                this.f385029t = new z12.q(c21053xdbf1e5f42.f68663x861009b5, 1, -1);
                gm0.j1.n().f354821b.g(this.f385029t);
            } else {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21053xdbf1e5f42.f68657xb76d85ab)) {
                    return;
                }
                gm0.j1.n().f354821b.a(239, this);
                this.f385028s = new z12.o(c21053xdbf1e5f42.f68657xb76d85ab);
                gm0.j1.n().f354821b.g(this.f385028s);
            }
        }
    }

    public static final void a(k22.g gVar, java.lang.String str) {
        java.lang.String str2 = gVar.C;
        if (str2 == null || str2.length() == 0) {
            return;
        }
        try {
            org.json.JSONObject optJSONObject = new org.json.JSONObject(gVar.C).optJSONObject(str);
            if (optJSONObject == null) {
                return;
            }
            java.lang.String optString = optJSONObject.optString("actionType");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
            java.lang.String optString2 = optJSONObject.optString("eleId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString2, "optString(...)");
            java.lang.String optString3 = optJSONObject.optString("eleInfo");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
            java.lang.String optString4 = optJSONObject.optString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14352x3a8c965e);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
            java.lang.String optString5 = optJSONObject.optString("pageId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
            j22.a.c(optString, optString2, optString3, optString4, optString5);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.D, "reportLiteAppAction error: " + e17);
        }
    }

    public final java.util.Map b() {
        java.util.HashMap hashMap = new java.util.HashMap();
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f385017e;
        java.lang.String str = c21053xdbf1e5f4.f68663x861009b5;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        hashMap.put("pid", str);
        java.lang.String mo42933xb5885648 = c21053xdbf1e5f4.mo42933xb5885648();
        hashMap.put("emoticon_md5", mo42933xb5885648 != null ? mo42933xb5885648 : "");
        hashMap.put("emoticon_type", 1);
        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f385020h));
        java.lang.String str2 = this.f385019g;
        hashMap.put("emoticon_sessionid", str2);
        hashMap.put("requestid", str2);
        return hashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r1.isEnabled() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            com.tencent.mm.ui.widget.dialog.z2 r0 = r6.f385021i
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f293604w
            android.content.Context r2 = r6.f385016d
            if (r1 != 0) goto L9
            goto L17
        L9:
            android.content.res.Resources r3 = r2.getResources()
            r4 = 2131760195(0x7f101443, float:1.9151404E38)
            java.lang.String r3 = r3.getString(r4)
            r1.setText(r3)
        L17:
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f293603v
            boolean r3 = r6.f385027r
            if (r1 != 0) goto L1e
            goto L3a
        L1e:
            java.lang.String r4 = "getString(...)"
            if (r3 == 0) goto L2d
            r5 = 2131755473(0x7f1001d1, float:1.9141826E38)
            java.lang.String r2 = i65.a.r(r2, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
            goto L37
        L2d:
            r5 = 2131760392(0x7f101508, float:1.9151803E38)
            java.lang.String r2 = i65.a.r(r2, r5)
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r4)
        L37:
            r1.setText(r2)
        L3a:
            if (r3 == 0) goto L65
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f293603v
            r2 = 0
            if (r1 == 0) goto L49
            boolean r1 = r1.isEnabled()
            r3 = 1
            if (r1 != r3) goto L49
            goto L4a
        L49:
            r3 = r2
        L4a:
            if (r3 == 0) goto L65
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f293603v
            if (r1 == 0) goto L56
            r3 = 2131690843(0x7f0f055b, float:1.9010741E38)
            r1.m81544x764b6bfb(r3)
        L56:
            com.tencent.mm.ui.widget.button.WeButton r1 = r0.f293603v
            if (r1 != 0) goto L5b
            goto L5e
        L5b:
            r1.setEnabled(r2)
        L5e:
            com.tencent.mm.ui.widget.button.WeButton r0 = r0.f293603v
            if (r0 == 0) goto L65
            r0.setBackgroundColor(r2)
        L65:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k22.g.c():void");
    }

    public final void d(java.lang.String newDesc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newDesc, "newDesc");
        android.widget.TextView textView = this.f385023n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
        textView.setVisibility(newDesc.length() == 0 ? 8 : 0);
        android.widget.TextView textView2 = this.f385023n;
        if (textView2 != null) {
            textView2.setText(newDesc);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("descTv");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        o11.g gVar;
        r45.zj0 zj0Var;
        java.lang.String str2 = this.D;
        if (m1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "netScene null");
            return;
        }
        int mo808xfb85f7b0 = m1Var.mo808xfb85f7b0();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onSceneEnd: sceneType:" + mo808xfb85f7b0 + ", errType:" + i17 + ", errCode:" + i18);
        if (mo808xfb85f7b0 == 239 || mo808xfb85f7b0 == 412 || mo808xfb85f7b0 == 521) {
            gm0.j1.n().f354821b.q(521, this);
        }
        android.content.Context context = this.f385016d;
        boolean z17 = this.f385018f;
        com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = this.f385017e;
        if (mo808xfb85f7b0 == 239) {
            if (i18 == 0 && (m1Var instanceof z12.o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f385028s)) {
                r45.ee3 H = ((z12.o) m1Var).H();
                r45.v75 v75Var = H != null ? H.f454890d : null;
                if (z17) {
                    if (v75Var == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateDesignerRelativeInfo error, PersonalDesigner error, md5:" + c21053xdbf1e5f4.mo42933xb5885648());
                        return;
                    }
                    java.lang.String str3 = v75Var.f469498e;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateDesignerRelativeInfo error, designerName null, md5:" + c21053xdbf1e5f4.mo42933xb5885648());
                        android.view.View view = this.f385026q;
                        if (view == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                            throw null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(4);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        return;
                    }
                    j22.a.d(this.f385017e, 3, this.f385035z, this.A, this.f385020h);
                    android.widget.TextView textView = this.f385025p;
                    if (textView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView.setText(str3);
                    android.widget.TextView textView2 = this.f385025p;
                    if (textView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView2.setOnClickListener(new k22.e(this, v75Var));
                    android.view.View view2 = this.f385026q;
                    if (view2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                        throw null;
                    }
                    android.widget.TextView textView3 = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.lt7);
                    if (textView3 != null) {
                        textView3.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bxk));
                    }
                    java.lang.String str4 = v75Var.f469500g;
                    boolean z18 = str4 != null && str4.length() > 0;
                    android.view.View view3 = this.f385026q;
                    if (view3 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                        throw null;
                    }
                    ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view3.findViewById(com.p314xaae8f345.mm.R.id.qw9)).setVisibility(z18 ? 0 : 8);
                    android.view.View view4 = this.f385026q;
                    if (view4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                        throw null;
                    }
                    android.widget.ImageView imageView = (android.widget.ImageView) view4.findViewById(com.p314xaae8f345.mm.R.id.f568133lt5);
                    java.lang.String str5 = v75Var.f469499f;
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str5)) {
                        if (imageView == null) {
                            return;
                        }
                        imageView.setVisibility(8);
                        return;
                    }
                    if (imageView != null) {
                        imageView.setVisibility(0);
                    }
                    n11.a b17 = n11.a.b();
                    java.lang.String str6 = c21053xdbf1e5f4.f68663x861009b5;
                    int i19 = y12.f.f540392a;
                    java.lang.String o17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.o(n22.m.g(), str6, str5);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o17)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiImageLoaderManager", "get emoji loader options failed. path is null.");
                        gVar = null;
                    } else {
                        o11.f fVar = new o11.f();
                        fVar.f423610a = true;
                        fVar.f423611b = true;
                        fVar.f423615f = o17;
                        fVar.f423629t = true;
                        gVar = fVar.a();
                    }
                    b17.h(str5, imageView, gVar);
                    android.view.View view5 = this.f385026q;
                    if (view5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                        throw null;
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view5, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateDesignerRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/PersonalDesigner;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                return;
            }
            return;
        }
        if (mo808xfb85f7b0 != 412) {
            if (mo808xfb85f7b0 == 521 && i18 == 0) {
                java.lang.String v17 = ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).v(c21053xdbf1e5f4.mo42933xb5885648());
                java.lang.String str7 = v17 != null ? v17 : "";
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str7)) {
                    return;
                }
                d(str7);
                return;
            }
            return;
        }
        if (i18 == 0 && (m1Var instanceof z12.q) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, this.f385029t)) {
            new r45.qj0();
            r45.qj0 qj0Var = ((r45.se3) ((z12.q) m1Var).f550883d.f152244b.f152233a).f467185d;
            if (qj0Var == null) {
                zj0Var = null;
            } else {
                zj0Var = new r45.zj0();
                zj0Var.f473669o = qj0Var.f465575q;
                zj0Var.f473662e = qj0Var.f465566e;
                zj0Var.f473663f = qj0Var.f465567f;
                zj0Var.f473668n = qj0Var.f465572n;
                zj0Var.f473664g = qj0Var.f465568g;
                zj0Var.f473670p = qj0Var.f465576r;
                zj0Var.f473667m = qj0Var.f465571m;
                zj0Var.f473666i = qj0Var.f465570i;
                zj0Var.f473674t = qj0Var.f465578t;
                zj0Var.f473675u = qj0Var.f465579u;
                zj0Var.f473661d = qj0Var.f465565d;
                zj0Var.B = qj0Var.I;
                zj0Var.A = qj0Var.H;
            }
            if (z17) {
                if (zj0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateEmotionRelativeInfo error, EmotionSummary error, md5:" + c21053xdbf1e5f4.mo42933xb5885648());
                    return;
                }
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(zj0Var.f473663f)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "updateEmotionRelativeInfo error, emotion pack name null, md5:" + c21053xdbf1e5f4.mo42933xb5885648());
                    android.view.View view6 = this.f385026q;
                    if (view6 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                        throw null;
                    }
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(4);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view6, arrayList3.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view6.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view6, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    return;
                }
                j22.a.d(this.f385017e, 3, this.f385035z, this.A, this.f385020h);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(zj0Var.f473661d, c21053xdbf1e5f4.f68663x861009b5)) {
                    android.widget.TextView textView4 = this.f385025p;
                    if (textView4 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView4.setText(zj0Var.f473663f);
                    android.widget.TextView textView5 = this.f385025p;
                    if (textView5 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoTv");
                        throw null;
                    }
                    textView5.setOnClickListener(new k22.f(this, zj0Var));
                }
                android.view.View view7 = this.f385026q;
                if (view7 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                    throw null;
                }
                android.widget.TextView textView6 = (android.widget.TextView) view7.findViewById(com.p314xaae8f345.mm.R.id.lt7);
                if (textView6 != null) {
                    textView6.setText(i65.a.r(context, com.p314xaae8f345.mm.R.C30867xcad56011.bxl));
                }
                android.view.View view8 = this.f385026q;
                if (view8 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                    throw null;
                }
                ((android.widget.ImageView) view8.findViewById(com.p314xaae8f345.mm.R.id.qw9)).setVisibility(8);
                java.lang.String str8 = zj0Var.f473662e;
                android.view.View view9 = this.f385026q;
                if (view9 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                    throw null;
                }
                android.widget.ImageView imageView2 = (android.widget.ImageView) view9.findViewById(com.p314xaae8f345.mm.R.id.f568133lt5);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str8)) {
                    if (imageView2 != null) {
                        imageView2.setVisibility(0);
                    }
                    if (n22.l.b(zj0Var.f473661d)) {
                        n11.a.b().g("", imageView2);
                        if (imageView2 != null) {
                            imageView2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f78061x1bf83724);
                        }
                    } else {
                        n11.a b18 = n11.a.b();
                        java.lang.String str9 = zj0Var.f473662e;
                        b18.h(str9, imageView2, y12.f.b(zj0Var.f473661d, str9));
                    }
                } else if (imageView2 != null) {
                    imageView2.setVisibility(8);
                }
                android.view.View view10 = this.f385026q;
                if (view10 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("relativeInfoRoot");
                    throw null;
                }
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal4 = zj0.c.f554818a;
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view10, arrayList4.toArray(), "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/emoji/ui/v3/widget/EmojiStoreV3SingleProductHalfDialog", "updateEmotionRelativeInfo", "(Lcom/tencent/mm/protocal/protobuf/EmotionSummary;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }
}
