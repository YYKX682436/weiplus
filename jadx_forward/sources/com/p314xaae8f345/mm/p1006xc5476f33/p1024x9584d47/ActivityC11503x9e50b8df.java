package com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47;

@db5.a(m123858x6ac9171 = 512)
/* renamed from: com.tencent.mm.plugin.announcement.ChatroomNoticeUI */
/* loaded from: classes12.dex */
public class ActivityC11503x9e50b8df extends com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: p1, reason: collision with root package name */
    public static final /* synthetic */ int f156208p1 = 0;
    public java.lang.String K;
    public java.lang.String L;
    public int M;
    public android.widget.LinearLayout N;
    public android.view.View P;
    public gh5.a Q;
    public boolean R;
    public boolean S;
    public java.lang.String T;
    public java.lang.String U;
    public java.lang.String V;
    public long W;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 X;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f156211x0;
    public boolean Y = false;
    public int Z = 0;

    /* renamed from: p0, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f156210p0 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f>(this) { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI.1
        {
            this.f39173x3fe91575 = 675629679;
        }

        @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
        /* renamed from: callback */
        public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f) {
            java.util.Map d17;
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5945xdd67bc5f c5945xdd67bc5f2 = c5945xdd67bc5f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c5945xdd67bc5f2.f136246g.f87932f)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.this;
                if (!activityC11503x9e50b8df.Y && (d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(activityC11503x9e50b8df.U, "favitem", null)) != null && c5945xdd67bc5f2.f136246g.f87932f.equalsIgnoreCase((java.lang.String) d17.get(".favitem.announcement_id"))) {
                    android.content.Intent intent = activityC11503x9e50b8df.getIntent();
                    intent.putExtra("annoucement_revoke", true);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df2 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.this;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activityC11503x9e50b8df2, arrayList.toArray(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activityC11503x9e50b8df2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activityC11503x9e50b8df2, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI$1", "callback", "(Lcom/tencent/mm/autogen/events/RevokeMsgEvent;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            }
            return false;
        }
    };

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.Boolean f156212y0 = null;

    /* renamed from: l1, reason: collision with root package name */
    public java.lang.String f156209l1 = null;

    public static void m7(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df) {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) activityC11503x9e50b8df.findViewById(com.p314xaae8f345.mm.R.id.f563789i);
        c1095x65355f89.s(0 - c1095x65355f89.getScrollX(), activityC11503x9e50b8df.N.getHeight() - c1095x65355f89.getScrollY(), 100, false);
        c1095x65355f89.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.g(activityC11503x9e50b8df, c1095x65355f89), 100L);
        activityC11503x9e50b8df.mo60878xf6b21fea(0, activityC11503x9e50b8df.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
        activityC11503x9e50b8df.m78615xdf8a9a94(0, com.p314xaae8f345.mm.ui.fb.GREEN);
        activityC11503x9e50b8df.m78501x43e00957(false);
        activityC11503x9e50b8df.r7(3);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void U3() {
        m78500x43e00957(0, true);
        this.f156211x0 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1
    public long X6() {
        return 4580249617L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1
    public r45.jq0 Y6(o72.r2 r2Var) {
        java.lang.String r17 = c01.z1.r();
        r45.jq0 jq0Var = new r45.jq0();
        jq0Var.e(r17);
        jq0Var.j(this.K);
        jq0Var.g(r2Var.f67651x76e81a5a);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        jq0Var.c(java.lang.System.currentTimeMillis());
        jq0Var.i(n7());
        return jq0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void b5() {
        mo48674x36654fab();
        super.b5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1
    public void b7(java.lang.String str, java.lang.String str2, boolean z17) {
        this.T = str;
        java.lang.String replace = str2.replace("<favitem", "<group_notice_item");
        this.U = replace;
        this.U = replace.replace("favitem>", "group_notice_item>");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomNoticeUI", "onContentSave. digest:%b, content:%b, isPureText:%b", java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)), java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)), java.lang.Boolean.valueOf(z17));
        r45.v16 v16Var = new r45.v16();
        v16Var.f469339d = this.K;
        v16Var.f469340e = this.T;
        v16Var.f469342g = this.U;
        v16Var.f469345m = z17 ? 1 : 0;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = uc1.z1.f76950x366c91de;
        lVar.f152199c = "/cgi-bin/micromsg-bin/setchatroomannouncement";
        lVar.f152197a = v16Var;
        lVar.f152198b = new r45.w16();
        com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
        iVar.p(a17);
        iVar.l().f(this).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.b(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void d5(int i17) {
        super.d5(i17);
        m78500x43e00957(0, true);
        this.f156211x0 = true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, kx1.a
    public void f3(android.widget.TextView textView) {
        gm0.j1.i();
        android.os.Bundle a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(true, k01.d.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.K, true).d1()));
        a17.putInt("geta8key_scene", 31);
        a17.putString("geta8key_username", this.K);
        a17.putString("msgUsername", this.V);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        le0.r rVar = le0.x.P0;
        ((ke0.e) xVar).getClass();
        java.util.LinkedList linkedList = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.f272724a;
        if (textView == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMSpanManager", "spanForTextView, textView cannot be null!");
            new android.text.SpannableString("");
            return;
        }
        android.content.Context context = textView.getContext();
        int textSize = (int) textView.getTextSize();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 j1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1(context);
        j1Var.f272763i = true;
        j1Var.f272759e = true;
        j1Var.f272760f = true;
        j1Var.f272762h = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.d();
        j1Var.f272779y = 1;
        j1Var.f272764j = true;
        j1Var.f272767m = false;
        j1Var.B = true;
        j1Var.g(textView);
        j1Var.H = a17;
        j1Var.C = null;
        j1Var.f272765k = true;
        j1Var.f272768n = true;
        ((le0.v) rVar).a(context, j1Var);
        j1Var.e(textView.getText(), textSize, true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569945sl;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void i0(int i17, int i18) {
        super.i0(i17, i18);
        m78500x43e00957(0, true);
        this.f156211x0 = true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        super.mo43517x10010bd5();
        mo56582xbf7c1df6(com.p314xaae8f345.mm.R.C30867xcad56011.i5r);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw)));
        m78494xd9193382(0, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571914te), new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.h(this), null, com.p314xaae8f345.mm.ui.fb.BLACK);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.m1.a(true, k01.d.a(((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(this.K, true).d1())).putInt("geta8key_scene", 31);
        boolean p76 = p7();
        boolean booleanExtra = getIntent().getBooleanExtra("room_notice_reedit", false);
        boolean z17 = this.R;
        if ((!z17 && !this.S) || (!p76 && !booleanExtra)) {
            if (!z17 && !this.S && p76) {
                android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.m76);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/announcement/ChatroomNoticeUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            m78551x8f8ecf18(0);
        }
        final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f563789i);
        final android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        if (c1095x65355f89 != null && findViewById2 != null) {
            c1095x65355f89.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$b
                @Override // java.lang.Runnable
                public final void run() {
                    int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.f156208p1;
                    int[] iArr = new int[2];
                    p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f892 = p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89.this;
                    c1095x65355f892.getLocationOnScreen(iArr);
                    int i18 = iArr[1];
                    int[] iArr2 = new int[2];
                    android.view.View view = findViewById2;
                    view.getLocationOnScreen(iArr2);
                    int height = iArr2[1] + view.getHeight();
                    if (i18 < height) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) c1095x65355f892.getLayoutParams();
                        marginLayoutParams.topMargin = height - i18;
                        c1095x65355f892.setLayoutParams(marginLayoutParams);
                    }
                }
            });
        }
        if (booleanExtra) {
            ((ku5.t0) ku5.t0.f394148d).q(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.i(this));
        }
        this.N = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.gyx);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T)) {
            this.N.setVisibility(8);
        } else {
            android.widget.TextView textView = (android.widget.TextView) this.N.findViewById(com.p314xaae8f345.mm.R.id.kfj);
            if (this.W != 0) {
                textView.setVisibility(0);
                textView.setText(k35.m1.d("yyyy-MM-dd HH:mm", this.W));
            } else {
                textView.setVisibility(8);
            }
            android.widget.TextView textView2 = (android.widget.TextView) this.N.findViewById(com.p314xaae8f345.mm.R.id.kfe);
            tg3.v0 v0Var = (tg3.v0) i95.n0.c(tg3.v0.class);
            java.lang.String str = this.V;
            ((sg3.a) v0Var).getClass();
            java.lang.String e17 = c01.a2.e(str);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this, e17, textSize));
            android.widget.ImageView imageView = (android.widget.ImageView) this.N.findViewById(com.p314xaae8f345.mm.R.id.kfd);
            java.lang.String str2 = this.V;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                imageView.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bhm);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            }
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.T) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.U)) {
            mo60878xf6b21fea(0, mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571974v5));
            m78615xdf8a9a94(0, com.p314xaae8f345.mm.ui.fb.GREEN);
            if (this.f156211x0) {
                m78501x43e00957(true);
            } else {
                m78501x43e00957(false);
            }
        }
        ((ku5.t0) ku5.t0.f394148d).a(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.k(this));
        this.P = findViewById(com.p314xaae8f345.mm.R.id.c2m);
        final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f892 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f563789i);
        getWindow().getDecorView().post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.announcement.ChatroomNoticeUI$$a
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.f156208p1;
                com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df activityC11503x9e50b8df = com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.ActivityC11503x9e50b8df.this;
                android.view.View decorView = activityC11503x9e50b8df.getWindow().getDecorView();
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.g3 a17 = n3.b1.a(decorView);
                activityC11503x9e50b8df.Z = a17 != null ? a17.f415871a.h(2).f328580d : 0;
                p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f893 = c1095x65355f892;
                if (c1095x65355f893 != null) {
                    c1095x65355f893.setPadding(c1095x65355f893.getPaddingLeft(), c1095x65355f893.getPaddingTop(), c1095x65355f893.getPaddingRight(), activityC11503x9e50b8df.Z);
                }
            }
        });
        this.Q = new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.l(this);
        gh5.b a17 = gh5.d.a(this);
        a17.f353511i = 1;
        android.view.View view = this.P;
        if (view != null) {
            a17.f353508f.addIfAbsent(new java.lang.ref.WeakReference(view));
        }
        a17.f(this.Q);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void j3(int i17, long j17) {
        super.j3(i17, j17);
        m78500x43e00957(0, true);
        this.f156211x0 = true;
    }

    public final java.lang.String n7() {
        if (this.f156209l1 == null) {
            this.f156209l1 = kk.k.g((c01.z1.r() + this.K + java.lang.System.currentTimeMillis()).getBytes());
        }
        return this.f156209l1;
    }

    public final void o7() {
        if (!this.R && !this.S) {
            setResult(0);
            finish();
            return;
        }
        if (!this.f156211x0) {
            setResult(0);
            finish();
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(this);
        u1Var.g(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3s));
        u1Var.m(com.p314xaae8f345.mm.R.C30867xcad56011.i3u);
        u1Var.l(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.a(this));
        u1Var.j(getString(com.p314xaae8f345.mm.R.C30867xcad56011.i3t));
        u1Var.i(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.p(this));
        u1Var.q(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        long j17;
        this.K = getIntent().getStringExtra("RoomInfo_Id");
        this.T = getIntent().getStringExtra("room_notice");
        java.lang.String stringExtra = getIntent().getStringExtra("room_notice_xml");
        this.U = stringExtra;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            this.U = this.T;
        }
        java.lang.String str = this.U;
        if (str == null) {
            str = "";
        }
        this.U = str;
        this.V = getIntent().getStringExtra("room_notice_editor");
        this.W = getIntent().getLongExtra("room_notice_publish_time", 0L);
        this.L = getIntent().getStringExtra("room_name");
        this.M = getIntent().getIntExtra("room_member_count", 0);
        this.R = getIntent().getBooleanExtra("Is_RoomOwner", false);
        this.S = getIntent().getBooleanExtra("Is_RoomManager", false);
        getIntent().putExtra("KEY_EDITABLE", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.U));
        java.lang.String replace = this.U.replace("<group_notice_item", "<favitem");
        this.U = replace;
        this.U = replace.replace("group_notice_item>", "favitem>");
        getIntent().putExtra("KEY_CONTENT_XML", this.U);
        getIntent().putExtra("KEY_CONTENT_PURE_TEXT", !this.U.trim().startsWith("<favitem"));
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 0L, 1L, true);
        mo43517x10010bd5();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.m(this));
        if (getF147381t()) {
            m78735x28280f95().m81450x8e764904(false);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe c7002x3df26ffe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe();
        c7002x3df26ffe.f143167d = c7002x3df26ffe.b("ChatName", this.K, true);
        c7002x3df26ffe.f143169f = this.M;
        boolean z17 = this.R;
        if (z17) {
            j17 = 1;
        } else {
            j17 = z17 ? 2 : 0;
        }
        c7002x3df26ffe.f143168e = j17;
        c7002x3df26ffe.f143171h = c7002x3df26ffe.b("NoticeId", "" + this.W, true);
        c7002x3df26ffe.f143170g = 1L;
        c7002x3df26ffe.k();
        this.f156210p0.mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.Q = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.X;
        if (u3Var == null || !u3Var.isShowing()) {
            return;
        }
        this.X.dismiss();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            super.onKeyDown(i17, keyEvent);
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomNoticeUI", "press back.");
        o7();
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        if (getIntent().getBooleanExtra("annoucement_revoke", false)) {
            db5.e1.E(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571534i3), null, getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572040x1), false, new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.n(this));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89;
        super.onResume();
        android.view.View decorView = getWindow().getDecorView();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(decorView);
        int i17 = a17 != null ? a17.f415871a.h(2).f328580d : 0;
        if (i17 != this.Z) {
            this.Z = i17;
            if (gh5.d.b(this) || (c1095x65355f89 = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) findViewById(com.p314xaae8f345.mm.R.id.f563789i)) == null) {
                return;
            }
            c1095x65355f89.setPadding(c1095x65355f89.getPaddingLeft(), c1095x65355f89.getPaddingTop(), c1095x65355f89.getPaddingRight(), this.Z);
        }
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() == 993) {
            q7(i17, i18, str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomNoticeUI", "error cgi type callback:[%d]", java.lang.Integer.valueOf(m1Var.mo808xfb85f7b0()));
        }
    }

    public final boolean p7() {
        java.lang.Boolean bool = this.f156212y0;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.String g17 = c01.v1.g(this.K);
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(this.U, "favitem", null);
        if (d17 == null) {
            this.f156212y0 = java.lang.Boolean.TRUE;
            return true;
        }
        java.lang.String str = (java.lang.String) d17.get(".favitem.source.$sourceid");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) && g17.contains(str)) {
            this.f156212y0 = java.lang.Boolean.TRUE;
            return true;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f156212y0 = java.lang.Boolean.FALSE;
            return false;
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(java.lang.Math.abs(c01.v1.f(this.K) - this.W) < 5);
        this.f156212y0 = valueOf;
        return valueOf.booleanValue();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void q0(long j17) {
        long j18;
        int i17 = j17 == 1 ? 4 : j17 == 16 ? 1 : j17 == 65536 ? 2 : j17 == 4096 ? 3 : 0;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6640xcd39939a c6640xcd39939a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6640xcd39939a();
        c6640xcd39939a.f139922d = c6640xcd39939a.b("ChatName", this.K, true);
        if (this.R) {
            j18 = 1;
        } else {
            j18 = this.S ? 2 : 3;
        }
        c6640xcd39939a.f139923e = j18;
        c6640xcd39939a.f139924f = this.M;
        c6640xcd39939a.f139925g = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.U) ? 1L : 2L;
        c6640xcd39939a.f139926h = c6640xcd39939a.b("NoticeId", n7(), true);
        c6640xcd39939a.f139927i = i17;
        c6640xcd39939a.k();
    }

    public final void q7(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.X;
        if (u3Var != null && u3Var.isShowing()) {
            this.X.dismiss();
        }
        if (i17 != 0 || i18 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomNoticeUI", "dz[handleSetNoticeFailed:%s]", str);
            tm.a b17 = tm.a.b(str);
            if (b17 != null) {
                b17.d(this, new com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.f(this));
            } else {
                db5.e1.T(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.i68));
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement failed:%d %d %s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChatroomNoticeUI", "dz[onSceneEnd : set announcement successfully!]");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(219L, 15L, 1L, true);
        db5.t7.h(this, getString(com.p314xaae8f345.mm.R.C30867xcad56011.i66));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("room_name", this.L);
        intent.putExtra("room_notice", this.T);
        setResult(-1, intent);
        finish();
    }

    public final void r7(int i17) {
        long j17;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe c7002x3df26ffe = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7002x3df26ffe();
        c7002x3df26ffe.f143167d = c7002x3df26ffe.b("ChatName", this.K, true);
        c7002x3df26ffe.f143169f = this.M;
        if (this.R) {
            j17 = 1;
        } else {
            j17 = this.S ? 2 : 3;
        }
        c7002x3df26ffe.f143168e = j17;
        c7002x3df26ffe.f143171h = c7002x3df26ffe.b("NoticeId", "" + this.W, true);
        c7002x3df26ffe.f143170g = (long) i17;
        c7002x3df26ffe.k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet hashSet) {
        super.mo43518x5e67c7ca(hashSet);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1024x9584d47.r.class);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.AbstractActivityC13156x6363e8e1, mx1.a
    public void x1(int i17) {
        super.x1(i17);
        m78500x43e00957(0, true);
        this.f156211x0 = true;
    }
}
