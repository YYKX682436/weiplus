package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI;", "Lcom/tencent/mm/wallet_core/ui/WalletBaseUI;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.wallet_core.ui.ledger.WalletLedgerMainUI */
/* loaded from: classes14.dex */
public final class ActivityC19138xce65e38f extends com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e {
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 A;
    public android.view.View B;
    public android.widget.TextView C;
    public ft4.u D;

    /* renamed from: e, reason: collision with root package name */
    public int f261962e;

    /* renamed from: f, reason: collision with root package name */
    public int f261963f;

    /* renamed from: g, reason: collision with root package name */
    public int f261964g;

    /* renamed from: h, reason: collision with root package name */
    public int f261965h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f261967m;

    /* renamed from: n, reason: collision with root package name */
    public ft4.k f261968n;

    /* renamed from: p, reason: collision with root package name */
    public int f261970p;

    /* renamed from: r, reason: collision with root package name */
    public ft4.u1 f261972r;

    /* renamed from: s, reason: collision with root package name */
    public gt4.s0 f261973s;

    /* renamed from: u, reason: collision with root package name */
    public ft4.i f261975u;

    /* renamed from: v, reason: collision with root package name */
    public android.app.Dialog f261976v;

    /* renamed from: w, reason: collision with root package name */
    public dt4.p f261977w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f261978x;

    /* renamed from: y, reason: collision with root package name */
    public android.widget.LinearLayout f261979y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.TextView f261980z;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f261961d = "";

    /* renamed from: i, reason: collision with root package name */
    public int f261966i = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f261969o = 2;

    /* renamed from: q, reason: collision with root package name */
    public int f261971q = 1;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f261974t = new java.util.ArrayList();
    public final ft4.x E = new ft4.x(this);
    public final ft4.h0 F = new ft4.h0(this);
    public final ft4.c0 G = new ft4.c0(this);
    public final android.content.DialogInterface.OnCancelListener H = new ft4.w(this);

    public static final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f activityC19138xce65e38f, int i17) {
        java.util.Collection collection;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(30027, 1, 1, 7, java.lang.Integer.valueOf(activityC19138xce65e38f.f261962e), java.lang.Integer.valueOf(activityC19138xce65e38f.f261963f));
        if (activityC19138xce65e38f.f261973s == null) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC19138xce65e38f.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            gt4.s0 s0Var = new gt4.s0(mo55332x76847179);
            activityC19138xce65e38f.f261973s = s0Var;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.C22705x7e16f613 c22705x7e16f613 = s0Var.f357074n;
            if (c22705x7e16f613 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("datePicker");
                throw null;
            }
            c22705x7e16f613.f293733o = false;
            c22705x7e16f613.f293734p = true;
            c22705x7e16f613.f293735q = true;
            java.lang.String format = new java.text.SimpleDateFormat("yyyy-MM-dd", java.util.Locale.CHINA).format(new java.util.Date());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
            java.util.List g17 = new r26.t("-").g(format, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f395529d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            gt4.s0 s0Var2 = activityC19138xce65e38f.f261973s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var2);
            s0Var2.h(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[2], 0));
            gt4.s0 s0Var3 = activityC19138xce65e38f.f261973s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var3);
            s0Var3.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[1], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[2], 0));
            if (activityC19138xce65e38f.f261964g > 0) {
                gt4.s0 s0Var4 = activityC19138xce65e38f.f261973s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var4);
                int i18 = activityC19138xce65e38f.f261964g;
                s0Var4.i(i18 / 10000, (i18 % 10000) / 100, 1);
            } else {
                gt4.s0 s0Var5 = activityC19138xce65e38f.f261973s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var5);
                s0Var5.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[0], 0), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(strArr[1], 0), 1);
            }
            if (i17 > 0) {
                gt4.s0 s0Var6 = activityC19138xce65e38f.f261973s;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var6);
                s0Var6.g(i17 / 10000, (i17 % 10000) / 100, i17 % 100);
            }
            gt4.s0 s0Var7 = activityC19138xce65e38f.f261973s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var7);
            s0Var7.L = new ft4.i0(activityC19138xce65e38f);
        }
        if (activityC19138xce65e38f.f261964g > 0) {
            gt4.s0 s0Var8 = activityC19138xce65e38f.f261973s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var8);
            int i19 = activityC19138xce65e38f.f261964g;
            s0Var8.i(i19 / 10000, (i19 % 10000) / 100, 1);
        }
        if (i17 > 0) {
            gt4.s0 s0Var9 = activityC19138xce65e38f.f261973s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var9);
            s0Var9.g(i17 / 10000, (i17 % 10000) / 100, i17 % 100);
        }
        gt4.s0 s0Var10 = activityC19138xce65e38f.f261973s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s0Var10);
        s0Var10.l();
    }

    public final int V6(java.util.List list, java.util.List list2) {
        ft4.k kVar = list2.isEmpty() ? null : ((ft4.j) kz5.n0.i0(list2)).f348165b;
        java.util.Iterator it = list.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            dt4.t tVar = (dt4.t) it.next();
            ft4.k kVar2 = new ft4.k();
            kVar2.f348169a = this.f261971q;
            kVar2.f348170b = tVar.f324820a;
            kVar2.f348171c = tVar.f324821b;
            kVar2.f348173e = tVar.f324822c;
            kVar2.f348172d = tVar.f324823d;
            int i18 = kVar != null ? kVar.f348175g : 0;
            kVar2.f348174f = i18;
            java.util.LinkedHashMap linkedHashMap = tVar.f324824e;
            kVar2.f348175g = i18 + linkedHashMap.size() + 1;
            i17 += linkedHashMap.size() + 1;
            list2.add(new ft4.j(1, kVar2, null));
            java.util.Iterator it6 = kz5.b1.g(linkedHashMap, new ft4.v()).entrySet().iterator();
            while (it6.hasNext()) {
                list2.add(new ft4.j(2, kVar2, (dt4.q) ((java.util.Map.Entry) it6.next()).getValue()));
            }
            kVar = kVar2;
        }
        return i17;
    }

    public final void W6(int i17) {
        java.util.List list = this.f261974t;
        if (i17 >= ((java.util.ArrayList) list).size() || i17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WalletLedgerMainUI", "jumpToIndex invalid index:" + i17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "jumpToIndex index:" + i17);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.A;
        if (c1163xf1deaba4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("listView");
            throw null;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c1163xf1deaba4.getLayoutManager();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "jumpToIndex", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
        yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "jumpToIndex", "(I)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        ft4.k kVar = ((ft4.j) ((java.util.ArrayList) list).get(i17)).f348165b;
        this.f261968n = kVar;
        ft4.u uVar = this.D;
        if (uVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
        int i18 = kVar.f348170b;
        ft4.k kVar2 = this.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar2);
        int i19 = kVar2.f348171c;
        ft4.k kVar3 = this.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar3);
        long j17 = kVar3.f348172d;
        ft4.k kVar4 = this.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar4);
        uVar.b(i18, i19, j17, kVar4.f348173e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0423, code lost:
    
        r2 = r36.f261979y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0427, code lost:
    
        if (r2 == null) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0429, code lost:
    
        r2.setVisibility(0);
        r2 = r36.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x042f, code lost:
    
        if (r2 == null) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0431, code lost:
    
        r2.setVisibility(8);
        r2 = r36.f261980z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0436, code lost:
    
        if (r2 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0438, code lost:
    
        r2.setVisibility(0);
        r4.clear();
        r2 = new ft4.k();
        r2.f348169a = r36.f261971q;
        r1 = r37 * 100;
        r2.f348170b = r1 + 1;
        r2.f348171c = r1 + 31;
        r4.add(new ft4.j(1, r2, null));
        r36.f261968n = r2;
        r1 = r36.B;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x045f, code lost:
    
        if (r1 == null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0461, code lost:
    
        r2 = new java.util.ArrayList();
        r3 = zj0.c.f554818a;
        r2.add(0);
        java.util.Collections.reverse(r2);
        yj0.a.d(r1, r2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "updateRecyclerView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r1.setVisibility(((java.lang.Integer) r2.get(0)).intValue());
        yj0.a.f(r1, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "updateRecyclerView", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        r2 = r36.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04a5, code lost:
    
        if (r2 == null) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04a7, code lost:
    
        r2.f348232c = r36.f261971q;
        r1 = r36.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r3 = r1.f348170b;
        r1 = r36.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r4 = r1.f348171c;
        r1 = r36.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r5 = r1.f348172d;
        r1 = r36.f261968n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1);
        r2.b(r3, r4, r5, r1.f348173e);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04cc, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x04d0, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04d1, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x04d5, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04d6, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04da, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x04db, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04df, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04e0, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04e4, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x03de, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "scrollToPosition total:" + r4.size() + " selectMonth:" + r37 + " targetIndex:" + r2 + " lastTradeMonth:" + r36.f261966i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x040e, code lost:
    
        if (r2 < 0) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0410, code lost:
    
        r1 = r36.f261980z;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0412, code lost:
    
        if (r1 == null) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0414, code lost:
    
        r1.setVisibility(8);
        W6(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x04ca, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x041e, code lost:
    
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0422, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X6(int r37) {
        /*
            Method dump skipped, instructions count: 1440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2372xbe09ad69.ActivityC19138xce65e38f.X6(int):void");
    }

    public final void Y6(int i17) {
        int i18 = this.f261969o;
        if (i18 == 1) {
            android.widget.TextView textView = this.C;
            if (textView != null) {
                textView.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2m));
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
                throw null;
            }
        }
        if (i18 != 2) {
            return;
        }
        android.widget.TextView textView2 = this.C;
        if (textView2 != null) {
            textView2.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2l));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f571155de3;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: hideLoading */
    public void mo48627xce38d9a() {
        android.app.Dialog dialog = this.f261976v;
        if (dialog != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
            if (dialog.isShowing()) {
                android.app.Dialog dialog2 = this.f261976v;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
                dialog2.dismiss();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: initView */
    public void mo43517x10010bd5() {
        int u17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.u(0L, "yyyyMM");
        int i17 = u17 * 100;
        this.f261962e = i17 + 1;
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(u17 / 100, (u17 % 100) - 1, 1);
        this.f261963f = i17 + calendar.getActualMaximum(5);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.pym);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.LinearLayout) findViewById).setOnClickListener(this.E);
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.pyo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f261978x = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f567062py5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f261979y = (android.widget.LinearLayout) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.q2v);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.A = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.qxw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById5;
        this.f261980z = textView;
        textView.setOnClickListener(new ft4.z(this));
        android.widget.TextView textView2 = this.f261980z;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("lastMonthBtn");
            throw null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView2);
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.qxx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById6;
        this.C = textView3;
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.d(textView3);
        android.widget.TextView textView4 = this.C;
        if (textView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("switchBtn");
            throw null;
        }
        textView4.setOnClickListener(new ft4.a0(this));
        Y6(this.f261969o);
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.q2n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.B = findViewById7;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        android.view.View view = this.B;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        ft4.u uVar = new ft4.u(mo55332x76847179, view);
        this.D = uVar;
        uVar.a(new ft4.b0(this));
        ft4.u uVar2 = this.D;
        if (uVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("header");
            throw null;
        }
        uVar2.f348232c = this.f261971q;
        android.view.View view2 = this.B;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerLayout");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/ledger/WalletLedgerMainUI", "initView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560402jf));
        mo78530x8b45058f();
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575073lh0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerMainUI", "onCreate");
        java.lang.String stringExtra = getIntent().getStringExtra("key_talker");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f261961d = stringExtra;
        mo43517x10010bd5();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(this);
        dt4.p a17 = dt4.p.f324799f.a(this.f261961d);
        this.f261977w = a17;
        a17.p(new ft4.y(weakReference));
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: showLoading */
    public void mo73913x2b33b77f() {
        android.app.Dialog dialog = this.f261976v;
        if (dialog == null) {
            this.f261976v = db5.e1.Q(this, "", getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggd), false, true, this.H);
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog);
        if (dialog.isShowing()) {
            return;
        }
        android.app.Dialog dialog2 = this.f261976v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dialog2);
        dialog2.show();
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a, com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: superImportUIComponents */
    public void mo43518x5e67c7ca(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        super.mo43518x5e67c7ca(set);
        set.add(or4.h.class);
    }
}
