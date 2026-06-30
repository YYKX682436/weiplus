package sb4;

/* loaded from: classes4.dex */
public abstract class e extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f486988d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f486990f;

    /* renamed from: g, reason: collision with root package name */
    public final sb4.v f486991g;

    /* renamed from: n, reason: collision with root package name */
    public boolean f486995n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f486996o;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f487000s;

    /* renamed from: u, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.s7 f487002u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.e8 f487003v;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f486989e = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f486992h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f486993i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.Map f486994m = new java.util.HashMap();

    /* renamed from: p, reason: collision with root package name */
    public int f486997p = 0;

    /* renamed from: q, reason: collision with root package name */
    public long f486998q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f486999r = 0;

    /* renamed from: t, reason: collision with root package name */
    public int f487001t = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f487004w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f487005x = Integer.MAX_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public int f487006y = 0;

    /* renamed from: z, reason: collision with root package name */
    public boolean f487007z = false;
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.b0 A = null;
    public final android.view.View.OnClickListener B = new sb4.g(this);

    public e(boolean z17, android.app.Activity activity, sb4.v vVar, java.lang.String str) {
        this.f486990f = "";
        this.f486995n = false;
        this.f487000s = "";
        this.f487003v = null;
        this.f486996o = z17;
        this.f487000s = str;
        this.f486988d = activity;
        this.f486991g = vVar;
        this.f487003v = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.pj();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        java.lang.String o17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.o(activity.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0), activity);
        if (o17.equals("zh_CN") || o17.equals("en") || o17.equals("zh_TW")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        } else {
            o17 = o17.equals("zh_HK") ? "zh_TW" : "en";
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("filterLan", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        }
        this.f486990f = o17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        gm0.j1.i();
        if (str.equals((java.lang.String) gm0.j1.u().c().l(2, null))) {
            this.f486995n = true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (this.f486995n) {
            this.f487002u = com.p314xaae8f345.mm.p2621x8fb0427b.s7.a();
            return;
        }
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || !n17.r2()) {
            this.f487002u = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_stranger");
        } else {
            this.f487002u = new com.p314xaae8f345.mm.p2621x8fb0427b.s7("album_friend");
        }
    }

    public static void a(sb4.e eVar, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$000", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        eVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSize", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = i17;
        layoutParams.height = i17;
        view.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSize", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$000", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract boolean A();

    public void B(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int intValue = ((java.lang.Integer) view.getTag()).intValue();
        if (view.getLayoutParams() instanceof android.widget.LinearLayout.LayoutParams) {
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) view.getLayoutParams();
            if (intValue == 1) {
                layoutParams.topMargin = 0;
                view.setLayoutParams(layoutParams);
            } else {
                layoutParams.topMargin = this.f486988d.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562148ab5);
                view.setLayoutParams(layoutParams);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetLayoutParams", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public boolean C(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 c19806x4c372b7, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490 c18408xcca3e490, boolean z17) {
        boolean z18;
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (c17933xe8d1b226 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return false;
        }
        ca4.e1 e1Var = ca4.f1.f121430a;
        boolean b17 = e1Var.b(c19806x4c372b7.f38967x15579d0d);
        if (this.f486995n && b17 && (str = this.f487000s) != null && str.equals(c17933xe8d1b226.m70374x6bf53a6c())) {
            if (z17) {
                c18408xcca3e490.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1.f252625d);
            } else {
                c18408xcca3e490.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1.f252625d);
            }
            c18408xcca3e490.setVisibility(0);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b226.m70362xf8db520e(), this.f486995n)) {
            if (z17) {
                c18408xcca3e490.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1.f252626e);
            } else {
                c18408xcca3e490.a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.c1.f252626e);
            }
            c18408xcca3e490.setVisibility(0);
            z18 = true;
        } else {
            z18 = false;
        }
        e1Var.j("MicroMsg.SnsSelfBaseAdapter", c19806x4c372b7, true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelfBaseAdapter", "setGroupIcon: isShowGroup:%b, snsId:%s, localId:%d, snsObjectId:%s, isShowPrivateIcon:%b", java.lang.Boolean.valueOf(b17), c17933xe8d1b226.m70367x7525eefd(), java.lang.Integer.valueOf(c17933xe8d1b226.f38324x142bbdc6), java.lang.String.valueOf(c19806x4c372b7.Id), java.lang.Boolean.valueOf(z18));
        boolean z19 = c18408xcca3e490.getVisibility() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setGroupIcon", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return z19;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x02d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(int r27, com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 r28, android.widget.TextView r29, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490 r30, android.widget.TextView r31, int r32, boolean r33, sb4.k r34, int r35) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.D(int, com.tencent.mm.ui.widget.QFadeImageView, android.widget.TextView, com.tencent.mm.plugin.sns.ui.widget.SnsAlbumThumbStateIconView, android.widget.TextView, int, boolean, sb4.k, int):void");
    }

    public void E(android.view.View view, android.view.View view2, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        view2.setContentDescription(str2);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            view.setContentDescription("");
        } else {
            view.setContentDescription(str + "," + str2);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setItemContentDescription", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public void F(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setLastClickSnsInfoLocalId", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        this.f487001t = i17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setLastClickSnsInfoLocalId", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void G(android.view.View view, android.view.View view2, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarAndLiveTagViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i17));
        if (j()) {
            if (f17.f38980x988ba8e == 1) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarAndLiveTagViewVisible", "(Landroid/view/View;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarAndLiveTagViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226);

    public void d(android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (this.f487004w <= 0) {
            textView.post(new sb4.f(this, textView));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calculateYearHeight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void f(android.widget.TextView textView, android.widget.TextView textView2, long j17) {
        java.lang.String str;
        java.lang.Object format;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("cerateTimeView", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        long j18 = 1000 * j17;
        java.lang.String str2 = this.f486990f;
        boolean z17 = !str2.equals("en");
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f251654a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
        java.util.GregorianCalendar gregorianCalendar = new java.util.GregorianCalendar();
        java.lang.CharSequence charSequence = "";
        android.app.Activity activity = this.f486988d;
        if (j18 < 3600000) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            str = "cerateTimeView";
            format = "";
        } else {
            str = "cerateTimeView";
            java.util.GregorianCalendar gregorianCalendar2 = new java.util.GregorianCalendar(gregorianCalendar.get(1), gregorianCalendar.get(2), gregorianCalendar.get(5));
            long timeInMillis = j18 - gregorianCalendar2.getTimeInMillis();
            if (timeInMillis <= 0 || timeInMillis > 86400000 || !z17) {
                long timeInMillis2 = (j18 - gregorianCalendar2.getTimeInMillis()) + 86400000;
                if (timeInMillis2 <= 0 || timeInMillis2 > 86400000 || !z17) {
                    new java.util.GregorianCalendar().setTimeInMillis(j18);
                    format = android.text.format.DateFormat.format(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573669fc3), j18);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                } else {
                    format = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fdi);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
                }
            } else {
                format = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("formatTimeInGrid", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            }
        }
        java.lang.String str3 = (java.lang.String) format;
        textView2.setTextSize(0, i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f562145aj2));
        textView.setTextSize(0, i65.a.f(activity, com.p314xaae8f345.mm.R.C30860x5b28f31.f562144aj1));
        if (str3.indexOf(":") > 0) {
            java.lang.String[] split = str3.split(":");
            if (split[1].length() < 2) {
                split[1] = "0" + split[1];
            }
            textView.setText(split[0]);
            textView2.setText(split[1]);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView2.setContentDescription(java.lang.String.format(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574726j91), split[0], split[1]));
        } else if (str3.indexOf("/") > 0) {
            java.lang.String[] split2 = str3.split("/");
            if (split2[1].length() < 2) {
                split2[1] = "0" + split2[1];
            }
            java.lang.String str4 = split2[0];
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            java.util.HashMap hashMap = (java.util.HashMap) com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.f251654a;
            if (hashMap.get(str2) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.g(activity, str2);
            }
            int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str4, 0);
            java.util.List list = (java.util.List) hashMap.get(str2);
            if (P >= list.size() || list.get(P) == null || ((java.lang.String) list.get(P)).equals("")) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.os.g(activity, str2);
            }
            java.util.List list2 = (java.util.List) hashMap.get(str2);
            if (P < list2.size()) {
                charSequence = (java.lang.String) list2.get(P);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMonth", "com.tencent.mm.plugin.sns.ui.SnsTimeUtil");
            }
            split2[0] = charSequence;
            textView.setText(charSequence);
            textView2.setText(split2[1]);
            textView2.setVisibility(0);
            textView.setVisibility(0);
            textView2.setContentDescription(java.lang.String.format(activity.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574726j91), split2[0], split2[1]));
        } else {
            textView2.setContentDescription(str3.concat(""));
            textView2.setVisibility(0);
            textView2.setText(str3.concat(""));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public final void g(android.view.View view, android.view.View view2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeDescAndLinkPadding", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (view.getVisibility() == 0) {
            int paddingTop = view.getPaddingTop();
            view2.setPadding(paddingTop, 0, paddingTop, paddingTop);
        } else {
            int h17 = i65.a.h(view2.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f562146aj3);
            view2.setPadding(h17, h17, h17, h17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeDescAndLinkPadding", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
    }

    public abstract boolean h(int i17, long j17);

    public abstract boolean j();

    public abstract void k(android.widget.TextView textView, int i17, int i18);

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0223, code lost:
    
        if (r42 != 1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x022e, code lost:
    
        if (r3.m70359xfb803656() == r4) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0cef  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0cfa  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0d1f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0d0f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0ca2  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0791  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x069a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0c5a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0c75  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View l(int r42, android.view.View r43) {
        /*
            Method dump skipped, instructions count: 3579
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.l(int, android.view.View):android.view.View");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    public android.view.View m(int i17, android.view.View view) {
        sb4.k kVar;
        android.view.View view2;
        int i18;
        boolean z17;
        boolean z18;
        int i19;
        boolean z19;
        ?? r122;
        android.view.View view3;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        sb4.v vVar = this.f486991g;
        android.app.Activity activity = this.f486988d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.k)) {
            sb4.k kVar2 = new sb4.k(this);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571048ct1, (android.view.ViewGroup) null);
            kVar2.f487037c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7u);
            kVar2.f487036b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n_7);
            kVar2.f487038d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568596nd4);
            kVar2.f487076l = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.haa);
            kVar2.f487077m = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.hab);
            kVar2.f487078n = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.hac);
            kVar2.f487079o = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.qqg);
            kVar2.f487080p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            kVar2.f487081q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.png);
            kVar2.f487082r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569274qy1);
            kVar2.f487083s = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569275qy2);
            kVar2.f487084t = inflate.findViewById(com.p314xaae8f345.mm.R.id.cuh);
            kVar2.f487041g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564266md);
            kVar2.f487039e = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i27);
            kVar2.f487040f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567228io4);
            kVar2.f487042h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3x);
            kVar2.f487043i = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567083i26);
            kVar2.f487079o.setOnClickListener(vVar.f487115e);
            kVar2.f487076l.setOnClickListener(vVar.f487115e);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx6);
            kVar2.F = findViewById;
            kVar2.C = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar2.f487090z = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar2.F.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx7);
            kVar2.G = findViewById2;
            kVar2.D = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar2.A = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar2.G.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx8);
            kVar2.H = findViewById3;
            kVar2.E = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar2.B = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar2.H.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            kVar2.f487086v = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okc);
            kVar2.f487087w = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okc);
            kVar2.f487088x = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okc);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9w);
            kVar2.f487089y = c17974x4f9963db;
            c17974x4f9963db.b(kVar2.f487076l);
            kVar2.f487044j = (com.p314xaae8f345.mm.ui.C21356x182ee98c) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566599gf5);
            inflate.setTag(kVar2);
            kVar = kVar2;
            view2 = inflate;
        } else {
            view2 = view;
            kVar = (sb4.k) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487076l);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487077m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487078n);
        java.util.Map map = this.f486992h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        kVar.a();
        kVar.f487038d.setTag(java.lang.Integer.valueOf(i17));
        kVar.f487089y.m70601x59285800(false);
        kVar.f487089y.setBackgroundResource(0);
        kVar.f487089y.setDescendantFocusability(131072);
        kVar.f487089y.setClickable(false);
        kVar.f487076l.m70598x59285800(true);
        kVar.f487076l.setClickable(true);
        kVar.f487089y.setOnClickListener(null);
        if (intValue >= this.f486997p || intValue == -1) {
            android.view.View view4 = view2;
            view4.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view4;
        }
        int i27 = intValue - 1;
        if (i27 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i27);
            i18 = c17933xe8d1b226.m70359xfb803656();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b226.m70362xf8db520e(), this.f486995n);
        } else {
            i18 = -1;
            z17 = false;
        }
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(intValue);
        c17933xe8d1b2262.m70371x485d7();
        if ((this.f486995n && i17 == v()) || i18 == -1 || c17933xe8d1b2262.m70359xfb803656() != i18) {
            if (h(i17, c17933xe8d1b2262.f68891x29d1292e)) {
                f(kVar.f487036b, kVar.f487037c, c17933xe8d1b2262.m70357x3fdd41df());
            }
            java.lang.String u17 = u(intValue, c17933xe8d1b2262.m70359xfb803656(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                kVar.f487041g.setText(u17);
                kVar.f487041g.setVisibility(0);
            }
            android.view.View view5 = kVar.f487043i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z18 = false;
        } else {
            z18 = z17;
        }
        k(kVar.f487038d, i18, c17933xe8d1b2262.m70359xfb803656());
        long j17 = this.f486998q;
        if (j17 == 0 || c17933xe8d1b2262.f68891x29d1292e != j17) {
            kVar.f487044j.setVisibility(8);
            kVar.f487039e.setVisibility(0);
        } else {
            kVar.f487044j.setVisibility(0);
            kVar.f487044j.c(y(), i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f574756jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$a
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$createViewHB$6", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view6);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f486988d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$createViewHB$6", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            kVar.f487039e.setVisibility(8);
        }
        if (this.f486995n) {
            z19 = true;
            if (i17 == 1) {
                kVar.f487079o.setVisibility(0);
                kVar.f487079o.setContentDescription(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574784jg2));
                kVar.f487076l.setVisibility(8);
                kVar.f487080p.b(this.f486999r == 1 ? activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh9) : "");
                kVar.f487080p.setVisibility(0);
                android.view.View view6 = kVar.f487084t;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                sb4.u uVar = new sb4.u();
                uVar.f487109b = -1;
                uVar.f487108a = -1;
                kVar.f487079o.setTag(uVar);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                return view2;
            }
            i19 = 8;
        } else {
            i19 = 8;
            z19 = true;
        }
        int i28 = i19;
        int i29 = intValue;
        sb4.k kVar3 = kVar;
        android.view.View view7 = view2;
        D(intValue, kVar.f487076l, kVar.f487081q, kVar.f487090z, kVar.f487086v, 1, z18, kVar, i17);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = kVar3.C;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setStarViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i29));
        if (!j()) {
            r122 = 0;
            view3 = view7;
        } else if (f17.f38980x988ba8e == 1) {
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(0);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(c22699x3dcdb352, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            view3 = view7;
            r122 = 0;
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            r122 = 0;
            view3 = view7;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i28));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(c22699x3dcdb352, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c22699x3dcdb352.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(c22699x3dcdb352, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "setStarViewVisible", "(Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setStarViewVisible", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (kVar3.f487090z.getVisibility() == 0 || kVar3.C.getVisibility() == 0) {
            android.view.View view8 = kVar3.F;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(java.lang.Integer.valueOf((int) r122));
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(r122)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view9 = kVar3.F;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(i28));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(r122)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewHB", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i29);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b2263.m70371x485d7().f39013x4c306a8a) && c17933xe8d1b2263.m70405x7b43eb28()) {
            kVar3.f487089y.setDescendantFocusability(393216);
            kVar3.f487089y.setClickable(true);
            kVar3.f487076l.setClickable(r122);
            kVar3.f487076l.m70598x59285800(r122);
            kVar3.f487089y.setOnClickListener(vVar.f487115e);
            kVar3.f487089y.m70601x59285800(true);
            int i37 = c17933xe8d1b2262.f38324x142bbdc6;
            sb4.u uVar2 = new sb4.u();
            uVar2.f487109b = i37;
            uVar2.f487110c = c17933xe8d1b2262.m70367x7525eefd();
            java.util.Map map2 = this.f486994m;
            if (((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null) {
                uVar2.f487108a = ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue();
            } else {
                uVar2.f487108a = r122;
            }
            kVar3.f487089y.setTag(uVar2);
        }
        c(c17933xe8d1b2263);
        android.view.View view10 = view3;
        view10.setDrawingCacheEnabled(r122);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewHB", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return view10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:87:0x0244, code lost:
    
        if (r3.m70359xfb803656() != r4) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x032b  */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View n(int r39, android.view.View r40) {
        /*
            Method dump skipped, instructions count: 1531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.n(int, android.view.View):android.view.View");
    }

    public android.view.View o(int i17, android.view.View view) {
        sb4.i iVar;
        android.view.View inflate;
        int i18;
        int i19;
        java.lang.String str;
        java.util.LinkedList linkedList;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.app.Activity activity = this.f486988d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.i)) {
            iVar = new sb4.i(this);
            inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.csz, (android.view.ViewGroup) null);
            iVar.f487035a = inflate.findViewById(com.p314xaae8f345.mm.R.id.chj);
            iVar.f487037c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7u);
            iVar.f487036b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n_7);
            iVar.f487038d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568596nd4);
            iVar.f487041g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564266md);
            iVar.f487043i = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567083i26);
            iVar.f487041g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564266md);
            iVar.f487039e = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i27);
            iVar.f487040f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567228io4);
            iVar.f487042h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3x);
            iVar.f487048l = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.cut);
            iVar.f487049m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) inflate.findViewById(com.p314xaae8f345.mm.R.id.jyi);
            iVar.f487051o = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567585k05);
            iVar.f487052p = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.jyl);
            iVar.f487050n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.jzb);
            iVar.f487035a.setOnClickListener(this.f486991g.f487114d);
            iVar.f487053q = inflate.findViewById(com.p314xaae8f345.mm.R.id.jdl);
            iVar.f487054r = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) inflate.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            iVar.f487055s = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            iVar.f487056t = inflate.findViewById(com.p314xaae8f345.mm.R.id.nh_);
            iVar.f487044j = (com.p314xaae8f345.mm.ui.C21356x182ee98c) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566599gf5);
            inflate.setTag(iVar);
        } else {
            iVar = (sb4.i) view.getTag();
            inflate = view;
        }
        iVar.f487038d.setTag(java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = (java.util.HashMap) this.f486992h;
        int intValue = hashMap.get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) hashMap.get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        iVar.a();
        if (intValue >= this.f486997p || intValue == -1) {
            inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            android.view.View view2 = inflate;
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return inflate;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        android.view.View view3 = inflate;
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i27 = intValue - 1;
        if (i27 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i27);
            int m70359xfb803656 = c17933xe8d1b226.m70359xfb803656();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b226.m70362xf8db520e(), this.f486995n);
            i18 = m70359xfb803656;
        } else {
            i18 = -1;
        }
        inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        android.view.View view4 = inflate;
        yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.HashMap hashMap2 = (java.util.HashMap) this.f486993i;
        if (hashMap2.get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(i17))).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(intValue);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
        if ((this.f486995n && i17 == v()) || i18 == -1 || c17933xe8d1b2262.m70359xfb803656() != i18) {
            if (h(i17, c17933xe8d1b2262.f68891x29d1292e)) {
                f(iVar.f487036b, iVar.f487037c, c17933xe8d1b2262.m70357x3fdd41df());
            }
            java.lang.String u17 = u(intValue, c17933xe8d1b2262.m70359xfb803656(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                iVar.f487041g.setText(u17);
                iVar.f487041g.setVisibility(0);
            }
            android.view.View view5 = iVar.f487043i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        k(iVar.f487038d, i18, c17933xe8d1b2262.m70359xfb803656());
        long j17 = this.f486998q;
        if (j17 == 0 || c17933xe8d1b2262.f68891x29d1292e != j17) {
            i19 = 8;
            iVar.f487044j.setVisibility(8);
            iVar.f487039e.setVisibility(0);
        } else {
            iVar.f487044j.setVisibility(0);
            iVar.f487044j.c(y(), i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f574756jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$d
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$createViewMusicMv$2", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList5 = new java.util.ArrayList();
                    arrayList5.add(view6);
                    java.lang.Object[] array = arrayList5.toArray();
                    arrayList5.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f486988d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$createViewMusicMv$2", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            i19 = 8;
            iVar.f487039e.setVisibility(8);
        }
        sb4.u uVar = new sb4.u();
        uVar.f487109b = c17933xe8d1b2262.f38324x142bbdc6;
        uVar.f487110c = c17933xe8d1b2262.m70367x7525eefd();
        java.util.HashMap hashMap3 = (java.util.HashMap) this.f486994m;
        if (hashMap3.get(java.lang.Integer.valueOf(i17)) != null) {
            uVar.f487108a = ((java.lang.Integer) hashMap3.get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            uVar.f487108a = 0;
        }
        iVar.f487035a.setTag(uVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m70371x485d7.f39013x4c306a8a)) {
            iVar.f487048l.setVisibility(i19);
        } else {
            iVar.f487048l.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = iVar.f487048l;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = m70371x485d7.f39013x4c306a8a;
            float m84164x40077844 = iVar.f487048l.m84164x40077844();
            ((ke0.e) xVar).getClass();
            c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, str2, m84164x40077844));
        }
        g(iVar.f487048l, iVar.f487053q);
        iVar.f487048l.m84175x8dd5167d(1);
        android.view.View view6 = iVar.f487053q;
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str3 = this.f487002u.f276845a;
        r45.a90 a90Var = m70371x485d7.f39014x86965dde;
        r45.jj4 jj4Var = (!(a90Var != null) || !true || (linkedList = a90Var.f451373h) == null || linkedList.isEmpty()) ? null : (r45.jj4) m70371x485d7.f39014x86965dde.f451373h.get(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        java.lang.String a17 = m21.s.a(m70371x485d7, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getShowCoverUrl", "com.tencent.mm.modelsns.SnsMusicShareObjectUtils");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsSelfBaseAdapter", "coverInfo, coverUrl: %s", a17);
        java.lang.String str4 = "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
            android.view.View view7 = iVar.f487053q;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view7, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view7.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            iVar.f487050n.setVisibility(0);
            iVar.f487050n.setPressed(false);
            android.view.View view8 = iVar.f487053q;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view8, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view8.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (jj4Var != null) {
                jj4Var.f459403s = c17933xe8d1b2262.f38324x142bbdc6;
                java.lang.String str5 = jj4Var.f459390f;
                str4 = jj4Var.f459397o;
                str = str5;
            } else {
                str = "";
            }
            iVar.f487051o.setVisibility(0);
            iVar.f487051o.setText(str4);
            iVar.f487051o.setMaxLines(1);
            iVar.f487051o.setTextColor(activity.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561048a62));
            r45.xs4 xs4Var = m70371x485d7.f39014x86965dde.f451385w;
            if (xs4Var != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var.m75945x2fec8307(4))) {
                iVar.f487052p.setVisibility(0);
                iVar.f487052p.setText(m70371x485d7.f39014x86965dde.f451385w.m75945x2fec8307(4));
            } else if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                iVar.f487052p.setVisibility(0);
                iVar.f487052p.setText(str);
            }
            ((dl4.m0) ((ff0.t) i95.n0.c(ff0.t.class))).bj(a17, iVar.f487049m, null);
            if (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.wm.b(m70371x485d7)) {
                iVar.f487050n.s(com.p314xaae8f345.mm.R.raw.f80237x5890f854, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                iVar.f487050n.setContentDescription(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfa));
            } else {
                iVar.f487050n.s(com.p314xaae8f345.mm.R.raw.f80264x8f433126, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
                iVar.f487050n.setContentDescription(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jdm));
            }
            iVar.f487050n.m82040x7541828(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            iVar.f487050n.setTag(m70371x485d7);
            iVar.f487050n.setOnClickListener(this.B);
            iVar.f487053q.setTag(m70371x485d7);
            r45.a90 a90Var2 = m70371x485d7.f39014x86965dde;
            if (a90Var2.f451385w == null) {
                a90Var2.f451385w = new r45.xs4();
            }
            r45.xs4 xs4Var2 = m70371x485d7.f39014x86965dde.f451385w;
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jcb));
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                stringBuffer.append(str4 + ",");
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(xs4Var2.m75945x2fec8307(4))) {
                stringBuffer.append(xs4Var2.m75945x2fec8307(4) + ",");
            }
            o25.s1 wi6 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).wi();
            java.lang.String str6 = m70371x485d7.f39012x33e0f24f.f472379d;
            ((com.p314xaae8f345.mm.app.o7) wi6).getClass();
            java.lang.String Zi = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).Zi(activity, str6);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(Zi)) {
                stringBuffer.append(Zi);
            }
            str4 = m70371x485d7.f39013x4c306a8a + "，" + ((java.lang.Object) stringBuffer);
        }
        E(iVar.f487042h, iVar.f487053q, x(iVar.f487037c), str4);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 t17 = t(c17933xe8d1b2262, intValue);
        if (t17 != null) {
            c17933xe8d1b2262 = t17;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b2262);
        if (j()) {
            if (f17.f38980x988ba8e == 1) {
                iVar.f487055s.setVisibility(0);
            } else {
                iVar.f487055s.setVisibility(i19);
            }
        }
        C(c17933xe8d1b2262, f17, iVar.f487054r, false);
        if (iVar.f487055s.getVisibility() == i19 && iVar.f487054r.getVisibility() == i19) {
            android.view.View view9 = iVar.f487056t;
            java.util.ArrayList arrayList8 = new java.util.ArrayList();
            arrayList8.add(java.lang.Integer.valueOf(i19));
            java.util.Collections.reverse(arrayList8);
            yj0.a.d(view9, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view9.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
            yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view10 = iVar.f487056t;
            java.util.ArrayList arrayList9 = new java.util.ArrayList();
            arrayList9.add(0);
            java.util.Collections.reverse(arrayList9);
            yj0.a.d(view10, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view10.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
            yj0.a.f(view10, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewMusicMv", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewMusicMv", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return inflate;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0564  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x052f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x054a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View p(int r34, android.view.View r35) {
        /*
            Method dump skipped, instructions count: 2287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sb4.e.p(int, android.view.View):android.view.View");
    }

    public android.view.View q(int i17, android.view.View view) {
        sb4.k kVar;
        android.view.View view2;
        int i18;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720;
        int i19;
        boolean z19;
        android.view.View view3;
        java.lang.String str;
        java.lang.String str2;
        android.app.Activity activity;
        int i27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        sb4.k kVar2;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17202;
        int i28;
        int i29;
        int i37;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262;
        sb4.k kVar3;
        android.app.Activity activity2;
        int i38;
        java.util.LinkedList linkedList;
        int i39;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        android.app.Activity activity3 = this.f486988d;
        sb4.v vVar = this.f486991g;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.k)) {
            sb4.k kVar4 = new sb4.k(this);
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(activity3).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571048ct1, (android.view.ViewGroup) null);
            kVar4.f487037c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7u);
            kVar4.f487036b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n_7);
            kVar4.f487038d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568596nd4);
            kVar4.f487076l = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.haa);
            kVar4.f487077m = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.hab);
            kVar4.f487078n = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.hac);
            kVar4.f487079o = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.qqg);
            kVar4.f487080p = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            kVar4.f487081q = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.png);
            kVar4.f487082r = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569274qy1);
            kVar4.f487083s = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569275qy2);
            kVar4.f487084t = inflate.findViewById(com.p314xaae8f345.mm.R.id.cuh);
            kVar4.f487085u = inflate.findViewById(com.p314xaae8f345.mm.R.id.jby);
            kVar4.f487041g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564266md);
            kVar4.f487039e = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i27);
            kVar4.f487040f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567228io4);
            kVar4.f487042h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3x);
            kVar4.f487043i = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567083i26);
            kVar4.f487079o.setOnClickListener(vVar.f487111a);
            kVar4.f487076l.setOnClickListener(vVar.f487111a);
            kVar4.f487077m.setOnClickListener(vVar.f487112b);
            kVar4.f487078n.setOnClickListener(vVar.f487113c);
            kVar4.f487076l.setOnLongClickListener(vVar.f487118h);
            kVar4.f487077m.setOnLongClickListener(vVar.f487118h);
            kVar4.f487078n.setOnLongClickListener(vVar.f487118h);
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx6);
            kVar4.F = findViewById;
            kVar4.C = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar4.f487090z = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar4.F.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            kVar4.I = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) kVar4.F.findViewById(com.p314xaae8f345.mm.R.id.s6z);
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx7);
            kVar4.G = findViewById2;
            kVar4.D = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar4.A = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar4.G.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            kVar4.f487075J = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) kVar4.G.findViewById(com.p314xaae8f345.mm.R.id.s6z);
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qx8);
            kVar4.H = findViewById3;
            kVar4.E = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            kVar4.B = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) kVar4.H.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            kVar4.K = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) kVar4.H.findViewById(com.p314xaae8f345.mm.R.id.s6z);
            kVar4.f487086v = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okc);
            kVar4.f487087w = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.okd);
            kVar4.f487088x = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.oke);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9w);
            kVar4.f487089y = c17974x4f9963db;
            c17974x4f9963db.b(kVar4.f487076l);
            kVar4.f487044j = (com.p314xaae8f345.mm.ui.C21356x182ee98c) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566599gf5);
            inflate.setTag(kVar4);
            kVar = kVar4;
            view2 = inflate;
        } else {
            view2 = view;
            kVar = (sb4.k) view.getTag();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487076l);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487077m);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(kVar.f487078n);
        java.util.Map map = this.f486992h;
        int intValue = ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue() : -1;
        kVar.a();
        kVar.f487038d.setTag(java.lang.Integer.valueOf(i17));
        kVar.f487089y.m70601x59285800(false);
        kVar.f487089y.setBackgroundResource(0);
        kVar.f487089y.setDescendantFocusability(131072);
        kVar.f487089y.setClickable(false);
        boolean z27 = this.f486996o;
        if (z27) {
            kVar.f487084t.setClickable(true);
            kVar.f487084t.setOnClickListener(vVar.f487117g);
        }
        kVar.f487076l.m70598x59285800(true);
        kVar.f487076l.setClickable(true);
        kVar.f487076l.setLongClickable(false);
        kVar.f487077m.setLongClickable(false);
        kVar.f487078n.setLongClickable(false);
        kVar.f487089y.setOnClickListener(null);
        kVar.f487089y.setOnLongClickListener(null);
        kVar.f487089y.setLongClickable(false);
        if (intValue >= this.f486997p || intValue == -1) {
            android.view.View view4 = view2;
            view4.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view4, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view4;
        }
        int i47 = intValue - 1;
        if (i47 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i47);
            i18 = c17933xe8d1b2263.m70359xfb803656();
            z17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b2263.m70362xf8db520e(), this.f486995n);
        } else {
            i18 = -1;
            z17 = false;
        }
        view2.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Map map2 = this.f486993i;
        int intValue2 = ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null ? ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue() : 1;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2264 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(intValue);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2264.m70371x485d7();
        if ((this.f486995n && i17 == v()) || i18 == -1 || c17933xe8d1b2264.m70359xfb803656() != i18) {
            c19807x593d1720 = m70371x485d7;
            if (h(i17, c17933xe8d1b2264.f68891x29d1292e)) {
                f(kVar.f487036b, kVar.f487037c, c17933xe8d1b2264.m70357x3fdd41df());
            }
            java.lang.String u17 = u(intValue, c17933xe8d1b2264.m70359xfb803656(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                i39 = 0;
            } else {
                kVar.f487041g.setText(u17);
                i39 = 0;
                kVar.f487041g.setVisibility(0);
            }
            android.view.View view5 = kVar.f487043i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(java.lang.Integer.valueOf(i39));
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view5, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            z18 = false;
        } else {
            z18 = z17;
            c19807x593d1720 = m70371x485d7;
        }
        long j17 = this.f486998q;
        int i48 = intValue2;
        int i49 = intValue;
        if (j17 == 0 || c17933xe8d1b2264.f68891x29d1292e != j17) {
            kVar.f487044j.setVisibility(8);
            i19 = 0;
            kVar.f487039e.setVisibility(0);
        } else {
            kVar.f487044j.setVisibility(0);
            kVar.f487044j.c(y(), i65.a.r(activity3, com.p314xaae8f345.mm.R.C30867xcad56011.f574756jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$g
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view6) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$createViewPhotos$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view6);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f486988d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$createViewPhotos$1", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            kVar.f487039e.setVisibility(8);
            i19 = 0;
        }
        if (z(i17) && A()) {
            kVar.f487079o.setVisibility(i19);
            kVar.f487079o.setContentDescription(activity3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574784jg2));
            kVar.f487076l.setVisibility(8);
            kVar.f487080p.b(this.f486999r == 1 ? activity3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jh9) : "");
            kVar.f487080p.setVisibility(0);
            android.view.View view6 = kVar.f487084t;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view6, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (z27) {
                android.view.View view7 = kVar.f487084t;
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(view7, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view7.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(view7, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            sb4.u uVar = new sb4.u();
            uVar.f487109b = -1;
            uVar.f487108a = -1;
            kVar.f487079o.setTag(uVar);
            E(kVar.f487042h, kVar.f487089y, x(kVar.f487037c), kVar.f487079o.getContentDescription() != null ? kVar.f487079o.getContentDescription().toString() : "");
            kVar.f487089y.setImportantForAccessibility(2);
            if (!this.f487007z) {
                xa4.b.f534354a.c(false, "view_exp", 2);
                this.f487007z = true;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewPhotos", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return view2;
        }
        k(kVar.f487038d, i18, c17933xe8d1b2264.m70359xfb803656());
        if (i48 >= 1) {
            str = "createViewPhotos";
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17203 = c19807x593d1720;
            i28 = 8;
            str2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter";
            activity = activity3;
            c17933xe8d1b226 = c17933xe8d1b2264;
            z19 = z27;
            i27 = i49;
            view3 = view2;
            D(i49, kVar.f487076l, kVar.f487081q, kVar.f487090z, kVar.f487086v, 1, z18, kVar, i17);
            kVar2 = kVar;
            G(kVar2.C, kVar2.I, i27);
            if (kVar2.C.getVisibility() == 0 || kVar2.f487090z.getVisibility() == 0 || kVar2.I.getVisibility() == 0) {
                c19807x593d17202 = c19807x593d17203;
                android.view.View view8 = kVar2.F;
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                arrayList6.add(0);
                java.util.Collections.reverse(arrayList6);
                yj0.a.d(view8, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view8.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
                yj0.a.f(view8, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view9 = kVar2.F;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                arrayList7.add(8);
                java.util.Collections.reverse(arrayList7);
                c19807x593d17202 = c19807x593d17203;
                yj0.a.d(view9, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view9.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
                yj0.a.f(view9, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i27));
            i29 = i48;
            i37 = 2;
        } else {
            z19 = z27;
            view3 = view2;
            str = "createViewPhotos";
            str2 = "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter";
            activity = activity3;
            i27 = i49;
            c17933xe8d1b226 = c17933xe8d1b2264;
            kVar2 = kVar;
            c19807x593d17202 = c19807x593d1720;
            i28 = 8;
            i29 = i48;
            i37 = 2;
        }
        if (i29 >= i37) {
            int i57 = i27 + 1;
            c17933xe8d1b2262 = c17933xe8d1b226;
            kVar3 = kVar2;
            D(i57, kVar2.f487077m, kVar2.f487082r, kVar2.A, kVar2.f487087w, 2, z18, kVar2, i17);
            G(kVar3.D, kVar3.f487075J, i57);
            if (kVar3.D.getVisibility() == 0 || kVar3.A.getVisibility() == 0 || kVar3.f487075J.getVisibility() == 0) {
                android.view.View view10 = kVar3.G;
                java.util.ArrayList arrayList8 = new java.util.ArrayList();
                arrayList8.add(0);
                java.util.Collections.reverse(arrayList8);
                yj0.a.d(view10, arrayList8.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view10.setVisibility(((java.lang.Integer) arrayList8.get(0)).intValue());
                yj0.a.f(view10, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view11 = kVar3.G;
                java.util.ArrayList arrayList9 = new java.util.ArrayList();
                arrayList9.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList9);
                yj0.a.d(view11, arrayList9.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view11.setVisibility(((java.lang.Integer) arrayList9.get(0)).intValue());
                yj0.a.f(view11, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i57));
        } else {
            c17933xe8d1b2262 = c17933xe8d1b226;
            kVar3 = kVar2;
        }
        if (i29 >= 3) {
            int i58 = i27 + 2;
            D(i58, kVar3.f487078n, kVar3.f487083s, kVar3.B, kVar3.f487088x, 3, z18, kVar3, i17);
            G(kVar3.E, kVar3.K, i58);
            if (kVar3.E.getVisibility() == 0 || kVar3.B.getVisibility() == 0 || kVar3.K.getVisibility() == 0) {
                android.view.View view12 = kVar3.H;
                java.util.ArrayList arrayList10 = new java.util.ArrayList();
                arrayList10.add(0);
                java.util.Collections.reverse(arrayList10);
                yj0.a.d(view12, arrayList10.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view12.setVisibility(((java.lang.Integer) arrayList10.get(0)).intValue());
                yj0.a.f(view12, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view13 = kVar3.H;
                java.util.ArrayList arrayList11 = new java.util.ArrayList();
                arrayList11.add(java.lang.Integer.valueOf(i28));
                java.util.Collections.reverse(arrayList11);
                yj0.a.d(view13, arrayList11.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view13.setVisibility(((java.lang.Integer) arrayList11.get(0)).intValue());
                yj0.a.f(view13, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewPhotos", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            c((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i58));
        }
        if (i29 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2265 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i27);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c17933xe8d1b2265.m70371x485d7().f39013x4c306a8a) && c17933xe8d1b2265.m70405x7b43eb28()) {
                if (!z19) {
                    kVar3.f487089y.setDescendantFocusability(393216);
                    kVar3.f487089y.setClickable(true);
                    kVar3.f487076l.setClickable(false);
                    kVar3.f487076l.m70598x59285800(false);
                    kVar3.f487089y.setOnClickListener(vVar.f487111a);
                    kVar3.f487089y.m70601x59285800(true);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2266 = c17933xe8d1b2262;
                int i59 = c17933xe8d1b2266.f38324x142bbdc6;
                sb4.u uVar2 = new sb4.u();
                uVar2.f487109b = i59;
                uVar2.f487110c = c17933xe8d1b2266.m70367x7525eefd();
                java.util.Map map3 = this.f486994m;
                if (((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17)) != null) {
                    uVar2.f487108a = ((java.lang.Integer) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17))).intValue();
                } else {
                    uVar2.f487108a = 0;
                }
                if (c17933xe8d1b2265.m70398x507e494d() && c17933xe8d1b2265.m70387x403f7b29()) {
                    kVar3.f487089y.setOnLongClickListener(vVar.f487118h);
                }
                kVar3.f487089y.setTag(uVar2);
            }
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d17204 = c19807x593d17202;
        r45.a90 a90Var = c19807x593d17204.f39014x86965dde;
        int max = (a90Var == null || (linkedList = a90Var.f451373h) == null) ? i29 : java.lang.Math.max(linkedList.size(), i29);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(c19807x593d17204.f39013x4c306a8a);
        sb6.append("，");
        if (max > 1) {
            i38 = com.p314xaae8f345.mm.R.C30867xcad56011.bku;
            activity2 = activity;
        } else {
            activity2 = activity;
            i38 = com.p314xaae8f345.mm.R.C30867xcad56011.bkt;
        }
        sb6.append(activity2.getString(i38));
        E(kVar3.f487042h, kVar3.f487089y, x(kVar3.f487037c), sb6.toString());
        android.view.View view14 = view3;
        view14.setDrawingCacheEnabled(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(str, str2);
        return view14;
    }

    public android.view.View r(int i17, android.view.View view) {
        sb4.l lVar;
        android.view.View inflate;
        int i18;
        int i19;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        sb4.v vVar = this.f486991g;
        android.app.Activity activity = this.f486988d;
        if (view == null || view.getTag() == null || !(view.getTag() instanceof sb4.l)) {
            lVar = new sb4.l(this);
            inflate = com.p314xaae8f345.mm.ui.id.b(activity).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ctm, (android.view.ViewGroup) null);
            lVar.f487037c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n7u);
            lVar.f487036b = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.n_7);
            lVar.f487038d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568596nd4);
            lVar.f487091l = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17972xe84284f4) inflate.findViewById(com.p314xaae8f345.mm.R.id.haa);
            lVar.f487095p = inflate.findViewById(com.p314xaae8f345.mm.R.id.nas);
            lVar.f487041g = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f564266md);
            lVar.f487039e = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i27);
            lVar.f487040f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567228io4);
            lVar.f487042h = (android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.i3x);
            lVar.f487043i = inflate.findViewById(com.p314xaae8f345.mm.R.id.f567083i26);
            lVar.f487091l.setOnClickListener(vVar.f487116f);
            lVar.f487096q = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2224xd1075a44.C18408xcca3e490) inflate.findViewById(com.p314xaae8f345.mm.R.id.gu8);
            lVar.f487097r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568620ng4);
            lVar.f487098s = inflate.findViewById(com.p314xaae8f345.mm.R.id.nax);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db c17974x4f9963db = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17974x4f9963db) inflate.findViewById(com.p314xaae8f345.mm.R.id.n9w);
            lVar.f487092m = c17974x4f9963db;
            c17974x4f9963db.b(lVar.f487091l);
            lVar.f487093n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565583cu2);
            lVar.f487094o = inflate.findViewById(com.p314xaae8f345.mm.R.id.cuh);
            lVar.f487044j = (com.p314xaae8f345.mm.ui.C21356x182ee98c) inflate.findViewById(com.p314xaae8f345.mm.R.id.f566599gf5);
            inflate.setTag(lVar);
        } else {
            lVar = (sb4.l) view.getTag();
            inflate = view;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().P(lVar.f487091l);
        java.util.Map map = this.f486992h;
        if (((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17)) != null) {
            i18 = ((java.lang.Integer) ((java.util.HashMap) map).get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            i18 = -1;
        }
        lVar.a();
        lVar.f487038d.setTag(java.lang.Integer.valueOf(i17));
        lVar.f487092m.m70601x59285800(false);
        lVar.f487092m.setBackgroundResource(0);
        lVar.f487092m.setDescendantFocusability(131072);
        lVar.f487092m.setClickable(false);
        lVar.f487092m.setOnClickListener(null);
        boolean z18 = this.f486996o;
        if (z18) {
            lVar.f487094o.setClickable(true);
            lVar.f487094o.setOnClickListener(vVar.f487117g);
        }
        lVar.f487091l.m70598x59285800(true);
        lVar.f487091l.setClickable(true);
        if (i18 >= this.f486997p || i18 == -1) {
            inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, 1));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return inflate;
        }
        int i27 = i18 - 1;
        if (i27 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i27);
            int m70359xfb803656 = c17933xe8d1b226.m70359xfb803656();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.i(c17933xe8d1b226.m70362xf8db520e(), this.f486995n);
            i19 = m70359xfb803656;
        } else {
            i19 = -1;
        }
        inflate.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        int i28 = i19;
        yj0.a.d(inflate, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.Map map2 = this.f486993i;
        if (((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17)) != null) {
            ((java.lang.Integer) ((java.util.HashMap) map2).get(java.lang.Integer.valueOf(i17))).intValue();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2262 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i18);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7 = c17933xe8d1b2262.m70371x485d7();
        if ((this.f486995n && i17 == v()) || i28 == -1 || c17933xe8d1b2262.m70359xfb803656() != i28) {
            if (h(i17, c17933xe8d1b2262.f68891x29d1292e)) {
                f(lVar.f487036b, lVar.f487037c, c17933xe8d1b2262.m70357x3fdd41df());
            }
            java.lang.String u17 = u(i18, c17933xe8d1b2262.m70359xfb803656(), new com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(u17)) {
                lVar.f487041g.setText(u17);
                lVar.f487041g.setVisibility(0);
            }
            android.view.View view2 = lVar.f487043i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        k(lVar.f487038d, i28, c17933xe8d1b2262.m70359xfb803656());
        long j17 = this.f486998q;
        if (j17 == 0 || c17933xe8d1b2262.f68891x29d1292e != j17) {
            lVar.f487044j.setVisibility(8);
            lVar.f487039e.setVisibility(0);
        } else {
            lVar.f487044j.setVisibility(0);
            lVar.f487044j.c(y(), i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f574756jd2), new android.view.View.OnClickListener() { // from class: sb4.e$$f
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view3) {
                    sb4.e eVar = sb4.e.this;
                    eVar.getClass();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$createViewSight$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    arrayList4.add(view3);
                    java.lang.Object[] array = arrayList4.toArray();
                    arrayList4.clear();
                    yj0.a.b("com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", eVar, array);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("enter_scene", 2);
                    j45.l.j(eVar.f486988d, "setting", ".ui.setting.SettingsPrivacyUI", intent, null);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14098, 8);
                    yj0.a.h(eVar, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$createViewSight$0", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                }
            });
            lVar.f487039e.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.s7 s7Var = new com.p314xaae8f345.mm.p2621x8fb0427b.s7(this.f487002u.f276845a);
        s7Var.f276846b = c17933xe8d1b2262.f68883xac3be4e;
        lVar.f487091l.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.hj().g0(c17933xe8d1b2262.m70367x7525eefd(), m70371x485d7.f39014x86965dde.f451373h, lVar.f487091l, activity.hashCode(), com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.z1.IMG_SCENE_SNSUSER, s7Var);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b2263 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 t17 = t(c17933xe8d1b2263, i18);
        if (t17 != null) {
            c17933xe8d1b2263 = t17;
        }
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19806x4c372b7 f17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.s5.f(c17933xe8d1b2263);
        java.lang.String str = c17933xe8d1b2263.m70371x485d7().f39013x4c306a8a;
        if (j()) {
            z17 = true;
            if (f17.f38980x988ba8e == 1) {
                lVar.f487097r.setVisibility(0);
            } else {
                lVar.f487097r.setVisibility(8);
            }
        } else {
            z17 = true;
        }
        if (C(c17933xe8d1b2263, f17, lVar.f487096q, z17) || lVar.f487097r.getVisibility() == 0) {
            android.view.View view3 = lVar.f487098s;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View view4 = lVar.f487098s;
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(view4, arrayList5.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (str != null && !str.equals("")) {
            android.view.View view5 = lVar.f487094o;
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(0);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(view5, arrayList6.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.f487093n.setVisibility(0);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = lVar.f487093n;
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            float m84164x40077844 = lVar.f487093n.m84164x40077844();
            ((ke0.e) xVar).getClass();
            c22624x85d69039.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(activity, str, m84164x40077844));
        } else if (z18) {
            android.view.View view6 = lVar.f487094o;
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(0);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(view6, arrayList7.toArray(), "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view6.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(view6, "com/tencent/mm/plugin/sns/ui/adapter/SnsSelfBaseAdapter", "createViewSight", "(ILandroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            lVar.f487093n.setVisibility(4);
        }
        lVar.f487092m.setDescendantFocusability(393216);
        lVar.f487091l.setClickable(false);
        lVar.f487091l.m70598x59285800(false);
        int i29 = c17933xe8d1b2262.f38324x142bbdc6;
        sb4.u uVar = new sb4.u();
        uVar.f487109b = i29;
        uVar.f487110c = c17933xe8d1b2262.m70367x7525eefd();
        java.util.Map map3 = this.f486994m;
        if (((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17)) != null) {
            uVar.f487108a = ((java.lang.Integer) ((java.util.HashMap) map3).get(java.lang.Integer.valueOf(i17))).intValue();
        } else {
            uVar.f487108a = 0;
        }
        if (z18) {
            lVar.f487091l.setClickable(z17);
            lVar.f487091l.m70598x59285800(z17);
            lVar.f487091l.setTag(uVar);
            lVar.f487094o.setTag(uVar);
        } else {
            lVar.f487092m.setClickable(z17);
            lVar.f487092m.setOnClickListener(vVar.f487116f);
            lVar.f487092m.m70601x59285800(z17);
            lVar.f487092m.setTag(uVar);
        }
        inflate.setDrawingCacheEnabled(false);
        c(c17933xe8d1b2263);
        lVar.f487093n.setImportantForAccessibility(2);
        E(lVar.f487042h, lVar.f487092m, x(lVar.f487037c), m70371x485d7.f39013x4c306a8a + "," + activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bkv));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createViewSight", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return inflate;
    }

    public int s() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getEdTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int i17 = this.f487006y;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getEdTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return i17;
    }

    public abstract com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 t(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226, int i17);

    public final java.lang.String u(int i17, int i18, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 m70371x485d7;
        r45.ed4 ed4Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        java.lang.String str = "";
        while (i17 < ((java.util.ArrayList) this.f486989e).size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226) getItem(i17);
            if (c17933xe8d1b226.m70359xfb803656() != i18) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
                return str;
            }
            c19767x257d7f.f38864x6ac9171++;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (ed4Var = (m70371x485d7 = c17933xe8d1b226.m70371x485d7()).f39016x752a03d5) != null) {
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ed4Var.f454847g);
                r45.ed4 ed4Var2 = m70371x485d7.f39016x752a03d5;
                java.lang.String str2 = K0 ? ed4Var2.f454846f : ed4Var2.f454847g;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    str = str2;
                }
            }
            i17++;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getNextShowLocation", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return str;
    }

    public abstract int v();

    public int w() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getStTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        int i17 = this.f487005x;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getStTime", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return i17;
    }

    public final java.lang.String x(android.view.View view) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getTimeDesc", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (view.getContentDescription() != null) {
            str = view.getContentDescription().toString();
            view.setContentDescription("");
        } else {
            str = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getTimeDesc", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return str;
    }

    public final java.lang.String y() {
        r45.cb6 cb6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        if (p94.w0.c() != null) {
            cb6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.e2) p94.w0.c()).b1(this.f487000s);
        } else {
            cb6Var = null;
        }
        android.app.Activity activity = this.f486988d;
        java.lang.String r17 = i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f574755jd1);
        if (cb6Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SnsSelfBaseAdapter", "userinfo is null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
            return r17;
        }
        int i17 = cb6Var.f452964g;
        int i18 = cb6Var.f452965h;
        if (i18 == 4320 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.ly_);
        } else if (i18 == 72 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.lya);
        } else if (i18 == 720 && (i17 & 4096) > 0) {
            r17 = i65.a.r(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f574797ni);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getUserSelfTips", "com.tencent.mm.plugin.sns.ui.adapter.SnsSelfBaseAdapter");
        return r17;
    }

    public abstract boolean z(int i17);
}
