package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class FinderActivityParticipateUIC extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f101813g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f101814h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f101815i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f101816m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.FrameLayout f101817n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.FrameLayout f101818o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f101819p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f101820q;

    /* renamed from: r, reason: collision with root package name */
    public int f101821r;

    /* renamed from: s, reason: collision with root package name */
    public final sr2.l5 f101822s;

    /* renamed from: t, reason: collision with root package name */
    public sr2.c f101823t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f101824u;

    /* renamed from: v, reason: collision with root package name */
    public final int f101825v;

    /* renamed from: w, reason: collision with root package name */
    public final long f101826w;

    /* renamed from: x, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$removeEvent$1 f101827x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$removeEvent$1] */
    public FinderActivityParticipateUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f101824u = jz5.h.b(new com.tencent.mm.plugin.finder.activity.uic.q(this));
        this.f101825v = 11;
        this.f101826w = java.lang.System.currentTimeMillis();
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f101827x = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivityFeedRemoveEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC$removeEvent$1
            {
                this.__eventId = -478908231;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ActivityFeedRemoveEvent activityFeedRemoveEvent) {
                com.tencent.mm.autogen.events.ActivityFeedRemoveEvent event = activityFeedRemoveEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.activity.uic.r(com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.this));
                return false;
            }
        };
        jz5.h.b(com.tencent.mm.plugin.finder.activity.uic.p.f101934d);
        this.f101822s = new sr2.l5(activity);
    }

    @Override // x92.r
    public void Q6() {
        super.Q6();
        alive();
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        d7((r45.r03) this.f452719d);
        this.f101817n = (android.widget.FrameLayout) getContext().findViewById(com.tencent.mm.R.id.f482616jf);
        this.f101818o = (android.widget.FrameLayout) getContext().findViewById(com.tencent.mm.R.id.f482617jg);
    }

    @Override // x92.r
    public void T6(com.tencent.mm.protobuf.f fVar) {
        r45.e21 e21Var;
        r45.f21 f21Var;
        r45.zi2 zi2Var;
        super.T6((r45.r03) fVar);
        d7((r45.r03) this.f452719d);
        r45.r03 r03Var = (r45.r03) this.f452719d;
        this.f101821r = r03Var != null ? r03Var.getInteger(2) : 0;
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        if (r03Var2 == null || (e21Var = (r45.e21) r03Var2.getCustom(16)) == null || (f21Var = (r45.f21) e21Var.getCustom(25)) == null || (zi2Var = (r45.zi2) f21Var.getCustom(0)) == null) {
            return;
        }
        sr2.c cVar = new sr2.c(getActivity());
        this.f101823t = cVar;
        com.tencent.mm.plugin.finder.activity.uic.g0 g0Var = new com.tencent.mm.plugin.finder.activity.uic.g0(this);
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).getClass();
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        audioCacheInfo.f155711e = (int) java.lang.System.currentTimeMillis();
        audioCacheInfo.f155712f = zi2Var.getString(5);
        java.lang.String c17 = com.tencent.mm.plugin.finder.assist.e9.f102132a.c(zi2Var);
        audioCacheInfo.f155715i = c17;
        if (c17 == null) {
            c17 = "";
        }
        cVar.f411522d = c17;
        cVar.f411525g = g0Var;
        ((pc0.k2) ((qc0.i1) i95.n0.c(qc0.i1.class))).wi(cVar.getContext(), audioCacheInfo, new sr2.b(cVar));
    }

    @Override // x92.r
    public void U6() {
        r45.e21 e21Var;
        r45.e21 e21Var2;
        r45.h21 h21Var;
        int i17;
        z5();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        if (r03Var != null && (e21Var = (r45.e21) r03Var.getCustom(16)) != null) {
            boolean z17 = (e21Var.getLong(17) & 8) != 8;
            android.widget.LinearLayout linearLayout = this.f101814h;
            java.lang.String str = null;
            if (linearLayout != null) {
                if (z17) {
                    s92.g gVar = s92.g.f405006a;
                    android.app.Activity context = getContext();
                    r45.r03 r03Var2 = (r45.r03) this.f452719d;
                    s92.g.c(gVar, context, "join_activity_publish", 0, 0, 0, r03Var2 != null ? (r45.e21) r03Var2.getCustom(16) : null, null, 88, null);
                    i17 = 0;
                } else {
                    i17 = 8;
                }
                linearLayout.setVisibility(i17);
            }
            if (z17) {
                if (W6(e21Var.getInteger(12), e21Var.getLong(13))) {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101815i;
                    if (weImageView != null) {
                        weImageView.setVisibility(8);
                    }
                    android.widget.TextView textView = this.f101816m;
                    if (textView != null) {
                        textView.setText(V6());
                    }
                } else {
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f101815i;
                    if (weImageView2 != null) {
                        weImageView2.setVisibility(0);
                    }
                    android.widget.TextView textView2 = this.f101816m;
                    if (textView2 != null) {
                        r45.r03 r03Var3 = (r45.r03) this.f452719d;
                        if (r03Var3 != null && (e21Var2 = (r45.e21) r03Var3.getCustom(16)) != null && (h21Var = (r45.h21) e21Var2.getCustom(18)) != null) {
                            str = h21Var.getString(3);
                        }
                        if (str == null) {
                            str = getContext().getResources().getString(com.tencent.mm.R.string.f491256cj4);
                            kotlin.jvm.internal.o.f(str, "getString(...)");
                        }
                        textView2.setText(str);
                    }
                }
                android.widget.TextView textView3 = this.f101816m;
                if (textView3 != null) {
                    com.tencent.mm.ui.bk.r0(textView3.getPaint(), 0.8f);
                }
            }
        }
        r45.r03 r03Var4 = (r45.r03) this.f452719d;
        c7(r03Var4 != null ? r03Var4.getInteger(2) : 0);
    }

    public final java.lang.String V6() {
        r45.e21 e21Var;
        r45.h21 h21Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.String string = (r03Var == null || (e21Var = (r45.e21) r03Var.getCustom(16)) == null || (h21Var = (r45.h21) e21Var.getCustom(18)) == null) ? null : h21Var.getString(7);
        if (string != null) {
            return string;
        }
        java.lang.String string2 = getContext().getResources().getString(com.tencent.mm.R.string.civ);
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        return string2;
    }

    public final boolean W6(int i17, long j17) {
        return i17 > 0 || (j17 != 0 && j17 * ((long) 1000) < c01.id.c());
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00e9, code lost:
    
        if (com.tencent.mm.sdk.platformtools.z.f193115k != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fc, code lost:
    
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ri(e42.d0.clicfg_finder_maas_event_show_post_entry, bm5.h0.RepairerConfig_Maas_ShowEventEntry_Int, 1) == 1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean X6() {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.X6():boolean");
    }

    public final void Y6() {
        r45.e21 e21Var;
        r45.sz6 sz6Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        java.lang.Integer num = null;
        r45.e21 e21Var2 = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        r45.sz6 sz6Var2 = e21Var2 != null ? (r45.sz6) e21Var2.getCustom(26) : null;
        if (sz6Var2 == null) {
            com.tencent.mars.xlog.Log.w("FinderActivityParticipateUIC", "maasTemplatePost: videoTemplateProto is null");
            return;
        }
        int integer = sz6Var2.getInteger(1);
        if (integer == 1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_maas_entrance", 3);
            intent.putExtra("key_finder_post_router", 16);
            a7(intent);
            return;
        }
        if (integer == 2) {
            com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "error event >> MaasTemplateCamera");
            return;
        }
        if (integer != 3) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("participate error for type:");
            r45.r03 r03Var2 = (r45.r03) this.f452719d;
            if (r03Var2 != null && (e21Var = (r45.e21) r03Var2.getCustom(16)) != null && (sz6Var = (r45.sz6) e21Var.getCustom(26)) != null) {
                num = java.lang.Integer.valueOf(sz6Var.getInteger(1));
            }
            sb6.append(num);
            com.tencent.mars.xlog.Log.e("FinderActivityParticipateUIC", sb6.toString());
            return;
        }
        r45.q23 q23Var = new r45.q23();
        q23Var.f383585d = sz6Var2.getString(2);
        q23Var.f383586e = sz6Var2.getInteger(1);
        q23Var.f383595q = 2;
        q23Var.f383596r = 0;
        r45.xy6 xy6Var = new r45.xy6();
        r45.el6 el6Var = (r45.el6) sz6Var2.getCustom(0);
        xy6Var.f390601f = el6Var != null ? el6Var.getInteger(2) : 0;
        r45.el6 el6Var2 = (r45.el6) sz6Var2.getCustom(0);
        xy6Var.f390602g = el6Var2 != null ? el6Var2.getInteger(2) : 0;
        q23Var.f383590i = xy6Var;
        android.content.Intent intent2 = new android.content.Intent();
        e7(intent2);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).tj(getContext(), q23Var, intent2, 11);
    }

    public final void Z6() {
        r45.j84 j84Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
        boolean z17 = false;
        long j17 = e21Var != null ? e21Var.getLong(0) : 0L;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        o3Var.Dk(2L, 1L, j17, nyVar != null ? nyVar.V6() : null);
        java.lang.String str = gm0.j1.b().j() + '_' + java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
        p2Var.W(p2Var.i(getActivity(), 9, false));
        p2Var.R(str);
        r45.sz6 sz6Var = e21Var != null ? (r45.sz6) e21Var.getCustom(26) : null;
        if (X6()) {
            if ((sz6Var != null ? sz6Var.getInteger(3) : 0) == 0) {
                com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "participate: template direct");
                Y6();
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("FinderActivityParticipateUIC", "participate: show bottom sheet");
        if (e21Var != null && (j84Var = (r45.j84) e21Var.getCustom(30)) != null && j84Var.getBoolean(0)) {
            z17 = true;
        }
        if (z17) {
            g7(e21Var);
        } else {
            f7(e21Var);
        }
    }

    public final void a7(android.content.Intent intent) {
        e7(intent);
        com.tencent.mars.xlog.Log.i("Finder.ActivityParamStore", "save");
        if (s92.b.f404991b == null) {
            s92.b.f404991b = new android.content.Intent();
        }
        android.content.Intent intent2 = s92.b.f404991b;
        if (intent2 != null) {
            s92.b.f404990a.b(intent, intent2);
        }
        java.lang.String stringExtra = getIntent().getStringExtra("key_udf_kv");
        if (stringExtra == null) {
            stringExtra = "";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra);
        java.lang.String str = null;
        try {
            if (jSONObject.has("vst_id")) {
                str = jSONObject.getString("vst_id");
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.sdk.platformtools.Log.a("safeGetString", "", e17);
        }
        intent.putExtra("vst_id", str);
        intent.putExtra("post_entry_type", 1);
        java.lang.String stringExtra2 = getIntent().getStringExtra("CLIENT_KV_REPORTINFO");
        if (stringExtra2 != null) {
            intent.putExtra("CLIENT_KV_REPORTINFO", stringExtra2);
        }
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).gk(getContext(), intent);
    }

    @Override // x92.r, x92.q
    public void b2() {
        r45.e21 e21Var;
        r45.h21 h21Var;
        r45.e21 e21Var2;
        r45.e21 e21Var3;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        int integer = (r03Var == null || (e21Var3 = (r45.e21) r03Var.getCustom(16)) == null) ? 0 : e21Var3.getInteger(12);
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        boolean W6 = W6(integer, (r03Var2 == null || (e21Var2 = (r45.e21) r03Var2.getCustom(16)) == null) ? 0L : e21Var2.getLong(13));
        android.widget.TextView textView = this.f101813g;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_5));
        }
        if (W6) {
            android.widget.LinearLayout linearLayout = this.f101814h;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481514va);
            }
            android.widget.TextView textView2 = this.f101816m;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.BW_100_Alpha_0_3));
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.f101814h;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundResource(com.tencent.mm.R.drawable.v_);
        }
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.f478553an);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101815i;
        if (weImageView != null) {
            weImageView.setIconColor(color);
            r45.r03 r03Var3 = (r45.r03) this.f452719d;
            java.lang.String string = (r03Var3 == null || (e21Var = (r45.e21) r03Var3.getCustom(16)) == null || (h21Var = (r45.h21) e21Var.getCustom(18)) == null) ? null : h21Var.getString(12);
            if (!(string == null || string.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(string, null, 2, null), weImageView, g1Var.h(mn2.f1.f329965s));
            }
        }
        android.widget.TextView textView3 = this.f101816m;
        if (textView3 != null) {
            textView3.setTextColor(color);
        }
    }

    public final void b7(com.tencent.mm.plugin.finder.activity.uic.y1 y1Var) {
        s92.g gVar = s92.g.f405006a;
        android.app.Activity context = getContext();
        r45.r03 r03Var = (r45.r03) this.f452719d;
        s92.g.c(gVar, context, "join_activity_publish", 1, 0, 0, r03Var != null ? (r45.e21) r03Var.getCustom(16) : null, y1Var, 24, null);
        android.app.Activity context2 = getContext();
        android.content.Intent intent = getIntent();
        kotlin.jvm.internal.o.g(context2, "context");
        kotlin.jvm.internal.o.g(intent, "intent");
        long longExtra = intent.getLongExtra("key_feed_ref_id", 0L);
        java.lang.String stringExtra = intent.getStringExtra("key_feed_ref_dup_flag");
        int intExtra = intent.getIntExtra("key_from_comment_scene", 0);
        intent.putExtra("key_ref_feed_id", longExtra);
        intent.putExtra("key_ref_feed_dup_flag", stringExtra);
        intent.putExtra("key_ref_comment_scene", intExtra);
        com.tencent.mm.plugin.finder.report.p2.N(com.tencent.mm.plugin.finder.report.p2.f125237a, context2, 60, null, 0L, 0, 28, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r1 == null) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c7(int r7) {
        /*
            r6 = this;
            com.tencent.mm.protobuf.f r0 = r6.f452719d
            r45.r03 r0 = (r45.r03) r0
            r1 = 0
            if (r0 == 0) goto L10
            r2 = 16
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.e21 r0 = (r45.e21) r0
            goto L11
        L10:
            r0 = r1
        L11:
            r2 = 18
            if (r0 == 0) goto L1c
            com.tencent.mm.protobuf.f r3 = r0.getCustom(r2)
            r45.h21 r3 = (r45.h21) r3
            goto L1d
        L1c:
            r3 = r1
        L1d:
            boolean r3 = hc2.a0.b(r3)
            if (r3 == 0) goto L9e
            r3 = 11
            if (r0 == 0) goto L34
            com.tencent.mm.protobuf.f r4 = r0.getCustom(r2)
            r45.h21 r4 = (r45.h21) r4
            if (r4 == 0) goto L34
            java.lang.String r4 = r4.getString(r3)
            goto L35
        L34:
            r4 = r1
        L35:
            r5 = 0
            if (r4 == 0) goto L41
            int r4 = r4.length()
            if (r4 != 0) goto L3f
            goto L41
        L3f:
            r4 = r5
            goto L42
        L41:
            r4 = 1
        L42:
            if (r4 == 0) goto L7f
            r1 = 2
            java.lang.String r7 = com.tencent.mm.plugin.finder.assist.w2.g(r1, r7)
            if (r0 == 0) goto L6a
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r2)
            r45.h21 r0 = (r45.h21) r0
            if (r0 == 0) goto L6a
            java.lang.String r0 = r0.getString(r1)
            if (r0 == 0) goto L6a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r7)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L8d
        L6a:
            android.app.Activity r0 = r6.getContext()
            r1 = 2131761581(0x7f1019ad, float:1.9154215E38)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = r0.getString(r1, r7)
            java.lang.String r7 = "getString(...)"
            kotlin.jvm.internal.o.f(r1, r7)
            goto L8d
        L7f:
            if (r0 == 0) goto L8d
            com.tencent.mm.protobuf.f r7 = r0.getCustom(r2)
            r45.h21 r7 = (r45.h21) r7
            if (r7 == 0) goto L8d
            java.lang.String r1 = r7.getString(r3)
        L8d:
            android.widget.TextView r7 = r6.f101813g
            if (r7 != 0) goto L92
            goto L95
        L92:
            r7.setText(r1)
        L95:
            android.widget.TextView r7 = r6.f101813g
            if (r7 != 0) goto L9a
            goto La8
        L9a:
            r7.setVisibility(r5)
            goto La8
        L9e:
            android.widget.TextView r7 = r6.f101813g
            if (r7 != 0) goto La3
            goto La8
        La3:
            r0 = 8
            r7.setVisibility(r0)
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.activity.uic.FinderActivityParticipateUIC.c7(int):void");
    }

    public final void d7(r45.r03 r03Var) {
        r45.j84 j84Var;
        r45.sz6 sz6Var;
        r45.sz6 sz6Var2;
        java.lang.String str = null;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        if ((e21Var != null ? (r45.g21) e21Var.getCustom(29) : null) != null) {
            android.widget.FrameLayout frameLayout = this.f452720e;
            this.f101813g = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.f482607j6) : null;
            android.widget.FrameLayout frameLayout2 = this.f452720e;
            this.f101814h = frameLayout2 != null ? (android.widget.LinearLayout) frameLayout2.findViewById(com.tencent.mm.R.id.f482604j3) : null;
            android.widget.FrameLayout frameLayout3 = this.f452720e;
            this.f101815i = frameLayout3 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout3.findViewById(com.tencent.mm.R.id.f482606j5) : null;
            android.widget.FrameLayout frameLayout4 = this.f452720e;
            this.f101816m = frameLayout4 != null ? (android.widget.TextView) frameLayout4.findViewById(com.tencent.mm.R.id.f482609j8) : null;
            android.widget.FrameLayout frameLayout5 = this.f101818o;
            if (frameLayout5 != null) {
                frameLayout5.setVisibility(0);
            }
            android.widget.FrameLayout frameLayout6 = this.f101817n;
            if (frameLayout6 != null) {
                frameLayout6.setVisibility(8);
            }
        } else {
            android.widget.FrameLayout frameLayout7 = this.f452720e;
            this.f101813g = frameLayout7 != null ? (android.widget.TextView) frameLayout7.findViewById(com.tencent.mm.R.id.f482602j1) : null;
            android.widget.FrameLayout frameLayout8 = this.f452720e;
            this.f101814h = frameLayout8 != null ? (android.widget.LinearLayout) frameLayout8.findViewById(com.tencent.mm.R.id.f482603j2) : null;
            android.widget.FrameLayout frameLayout9 = this.f452720e;
            this.f101815i = frameLayout9 != null ? (com.tencent.mm.ui.widget.imageview.WeImageView) frameLayout9.findViewById(com.tencent.mm.R.id.f482605j4) : null;
            android.widget.FrameLayout frameLayout10 = this.f452720e;
            this.f101816m = frameLayout10 != null ? (android.widget.TextView) frameLayout10.findViewById(com.tencent.mm.R.id.f482608j7) : null;
            android.widget.FrameLayout frameLayout11 = this.f101818o;
            if (frameLayout11 != null) {
                frameLayout11.setVisibility(8);
            }
            android.widget.FrameLayout frameLayout12 = this.f101817n;
            if (frameLayout12 != null) {
                frameLayout12.setVisibility(0);
            }
        }
        android.widget.LinearLayout linearLayout = this.f101814h;
        if (linearLayout != null) {
            linearLayout.setOnClickListener(new com.tencent.mm.plugin.finder.activity.uic.t(this));
            java.lang.String u17 = pm0.v.u(e21Var != null ? e21Var.getLong(0) : 0L);
            com.tencent.mm.plugin.finder.report.p2 p2Var = com.tencent.mm.plugin.finder.report.p2.f125237a;
            jz5.l[] lVarArr = new jz5.l[4];
            lVarArr[0] = new jz5.l("page_activityid", u17);
            lVarArr[1] = new jz5.l("activityid", u17);
            lVarArr[2] = new jz5.l("template_type", (e21Var == null || (sz6Var2 = (r45.sz6) e21Var.getCustom(26)) == null) ? null : java.lang.Integer.valueOf(sz6Var2.getInteger(1)));
            if (e21Var != null && (sz6Var = (r45.sz6) e21Var.getCustom(26)) != null) {
                str = sz6Var.getString(2);
            }
            lVarArr[3] = new jz5.l("templateid", str);
            com.tencent.mm.plugin.finder.report.p2.O(p2Var, linearLayout, "participate_activity_button", 0, kz5.c1.k(lVarArr), null, 20, null);
            if ((e21Var == null || (j84Var = (r45.j84) e21Var.getCustom(30)) == null || !j84Var.getBoolean(0)) ? false : true) {
                ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(1, this.f101825v, this.f101826w, null);
            }
        }
    }

    public final void e7(android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.util.ArrayList arrayList;
        r45.f21 f21Var;
        java.lang.String str4;
        r45.h21 h21Var;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        r45.sz6 sz6Var;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        byte[] bArr = null;
        r45.e21 e21Var = r03Var != null ? (r45.e21) r03Var.getCustom(16) : null;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.b().j());
        sb6.append('_');
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        intent.putExtra("key_finder_post_id", sb6.toString());
        intent.putExtra("key_finder_post_from", 9);
        intent.putExtra("key_activity_camera_position", (e21Var == null || (sz6Var = (r45.sz6) e21Var.getCustom(26)) == null) ? 1 : sz6Var.getInteger(4));
        intent.putExtra("saveActivity", true);
        intent.putExtra("key_activity_type", 102);
        java.lang.String str5 = "";
        if (e21Var == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str = finderContact3.getUsername()) == null) {
            str = "";
        }
        intent.putExtra("key_user_name", str);
        if (e21Var == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str2 = finderContact2.getNickname()) == null) {
            str2 = "";
        }
        intent.putExtra("key_nick_name", str2);
        if (e21Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1)) == null || (str3 = finderContact.getHeadUrl()) == null) {
            str3 = "";
        }
        intent.putExtra("key_avatar_url", str3);
        intent.putExtra("key_cover_url", d2());
        intent.putExtra("key_activity_display_mask", e21Var != null ? e21Var.getLong(17) : 0L);
        boolean z18 = false;
        intent.putExtra("key_topic_id", e21Var != null ? java.lang.Long.valueOf(e21Var.getLong(0)) : null);
        intent.putExtra("key_activity_name", e21Var != null ? e21Var.getString(2) : null);
        intent.putExtra("key_activity_desc", e21Var != null ? e21Var.getString(3) : null);
        intent.putExtra("key_activity_end_time", e21Var != null ? java.lang.Long.valueOf(e21Var.getLong(13)) : null);
        intent.putExtra("key_activity_post_wording", e21Var != null ? e21Var.getString(23) : null);
        java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderJumpInfo> list = e21Var != null ? e21Var.getList(22) : null;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo : list) {
                if (finderJumpInfo != null) {
                    arrayList.add(finderJumpInfo.toByteArray());
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            intent.putExtra("key_activity_jump_info_list", arrayList);
        }
        intent.putExtra("key_activity_src_type", "key_scene_from_profile");
        if (e21Var != null) {
            intent.putExtra("KEY_POST_EVENT_TOPIC_ID", e21Var.getLong(0));
            r45.sz6 sz6Var2 = (r45.sz6) e21Var.getCustom(26);
            if (sz6Var2 != null) {
                try {
                    bArr = sz6Var2.toByteArray();
                } catch (java.io.IOException unused) {
                }
            }
            kotlin.jvm.internal.o.d(intent.putExtra("KEY_POST_VIDEO_TEMPLATE_INFO", bArr));
        }
        if (e21Var != null && (h21Var = (r45.h21) e21Var.getCustom(18)) != null) {
            intent.putExtra("key_wording_info", h21Var.toByteArray());
        }
        if (e21Var != null && (f21Var = (r45.f21) e21Var.getCustom(25)) != null) {
            r45.zi2 zi2Var = (r45.zi2) f21Var.getCustom(0);
            if (zi2Var != null) {
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_ID", zi2Var.getString(0));
                sr2.c cVar = this.f101823t;
                if (cVar != null && (str4 = cVar.f411522d) != null) {
                    str5 = str4;
                }
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_PATH", str5);
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_INFO", zi2Var.toByteArray());
                intent.putExtra("KEY_FINDER_POST_ORIGIN_BGM_URL", zi2Var.getString(10));
                intent.putExtra("KEY_FINDER_POST_ORIGIN_MUSIC_NAME", zi2Var.getString(2));
            }
            java.lang.String e17 = xy2.c.e(getActivity());
            java.util.LinkedList list2 = f21Var.getList(1);
            if (list2 != null) {
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    if (e17.equals(((com.tencent.mm.protocal.protobuf.FinderContact) it.next()).getUsername())) {
                        z18 = true;
                    }
                }
            }
            intent.putExtra("KEY_FINDER_POST_BGM_IF_ORIGIN", z18);
        }
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).yk(getContext(), intent, 134, 11);
    }

    public final void f7(r45.e21 e21Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        if (this.f101819p == null) {
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.ui.widget.dialog.k0 kg6 = w40.e.kg((w40.e) c17, getContext(), null, 9, 2, null);
            kg6.f211872n = new com.tencent.mm.plugin.finder.activity.uic.w(this, e21Var);
            kg6.f211881s = new com.tencent.mm.plugin.finder.activity.uic.x(this);
            kg6.f211854d = new com.tencent.mm.plugin.finder.activity.uic.y(this);
            this.f101819p = kg6;
        }
        boolean z17 = false;
        sr2.l5 l5Var = this.f101822s;
        if (l5Var != null && !l5Var.Q6(new com.tencent.mm.plugin.finder.activity.uic.z(this, e21Var), new com.tencent.mm.plugin.finder.activity.uic.a0(this))) {
            z17 = true;
        }
        if (z17 || (k0Var = this.f101819p) == null || k0Var.i()) {
            return;
        }
        k0Var.v();
    }

    public final void g7(r45.e21 e21Var) {
        com.tencent.mm.ui.widget.dialog.k0 k0Var;
        if (this.f101820q == null) {
            ra0.x xVar = (ra0.x) i95.n0.c(ra0.x.class);
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("activity_enter_source", (java.lang.String) ((jz5.n) this.f101824u).getValue());
            lVarArr[1] = new jz5.l("page_activityid", pm0.v.u(e21Var != null ? e21Var.getLong(0) : 0L));
            lVarArr[2] = new jz5.l("view_id", "participate_activity_button");
            ((nn3.f) xVar).Ni("view_clk", null, kz5.c1.k(lVarArr), false);
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            com.tencent.mm.ui.widget.dialog.k0 kg6 = w40.e.kg((w40.e) c17, getContext(), null, 9, 2, null);
            kg6.f211872n = new com.tencent.mm.plugin.finder.activity.uic.b0(e21Var, this);
            kg6.f211881s = new com.tencent.mm.plugin.finder.activity.uic.c0(this, e21Var);
            kg6.f211854d = new com.tencent.mm.plugin.finder.activity.uic.d0(this);
            this.f101820q = kg6;
        }
        sr2.l5 l5Var = this.f101822s;
        if (((l5Var == null || l5Var.Q6(new com.tencent.mm.plugin.finder.activity.uic.e0(this, e21Var), new com.tencent.mm.plugin.finder.activity.uic.f0(this))) ? false : true) || (k0Var = this.f101820q) == null || k0Var.i()) {
            return;
        }
        ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Ui(2, this.f101825v, this.f101826w, null);
        k0Var.v();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i18 == -1 && i17 == 20000) {
            Z6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        pf5.e.launchUI$default(this, null, null, new com.tencent.mm.plugin.finder.activity.uic.s(this, null), 3, null);
        sr2.l5 l5Var = this.f101822s;
        if (l5Var != null) {
            l5Var.onResume();
        }
    }

    @Override // x92.r, x92.q
    public void setNormalStyle() {
        r45.e21 e21Var;
        r45.h21 h21Var;
        r45.e21 e21Var2;
        r45.e21 e21Var3;
        r45.r03 r03Var = (r45.r03) this.f452719d;
        int integer = (r03Var == null || (e21Var3 = (r45.e21) r03Var.getCustom(16)) == null) ? 0 : e21Var3.getInteger(12);
        r45.r03 r03Var2 = (r45.r03) this.f452719d;
        boolean W6 = W6(integer, (r03Var2 == null || (e21Var2 = (r45.e21) r03Var2.getCustom(16)) == null) ? 0L : e21Var2.getLong(13));
        android.widget.TextView textView = this.f101813g;
        if (textView != null) {
            textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_1));
        }
        if (W6) {
            android.widget.LinearLayout linearLayout = this.f101814h;
            if (linearLayout != null) {
                linearLayout.setBackgroundResource(com.tencent.mm.R.drawable.f481516vc);
            }
            android.widget.TextView textView2 = this.f101816m;
            if (textView2 != null) {
                textView2.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_2));
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout2 = this.f101814h;
        if (linearLayout2 != null) {
            linearLayout2.setBackgroundResource(com.tencent.mm.R.drawable.abg);
        }
        int color = getContext().getResources().getColor(com.tencent.mm.R.color.f478553an);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f101815i;
        if (weImageView != null) {
            weImageView.setIconColor(color);
            r45.r03 r03Var3 = (r45.r03) this.f452719d;
            java.lang.String string = (r03Var3 == null || (e21Var = (r45.e21) r03Var3.getCustom(16)) == null || (h21Var = (r45.h21) e21Var.getCustom(18)) == null) ? null : h21Var.getString(12);
            if (!(string == null || string.length() == 0)) {
                mn2.g1 g1Var = mn2.g1.f329975a;
                g1Var.a().c(new mn2.n(string, null, 2, null), weImageView, g1Var.h(mn2.f1.f329965s));
            }
        }
        android.widget.TextView textView3 = this.f101816m;
        if (textView3 != null) {
            textView3.setTextColor(color);
        }
    }
}
