package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes.dex */
public final class v9 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.u8 {
    public int A;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f199018d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f199019e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f199020f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f199021g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ProgressBar f199022h;

    /* renamed from: i, reason: collision with root package name */
    public rl5.r f199023i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f199024m;

    /* renamed from: n, reason: collision with root package name */
    public bm2.h8 f199025n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f199026o;

    /* renamed from: p, reason: collision with root package name */
    public int f199027p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f199028q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.LinkedList f199029r;

    /* renamed from: s, reason: collision with root package name */
    public int f199030s;

    /* renamed from: t, reason: collision with root package name */
    public long f199031t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f199032u;

    /* renamed from: v, reason: collision with root package name */
    public int f199033v;

    /* renamed from: w, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f199034w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f199035x;

    /* renamed from: y, reason: collision with root package name */
    public int f199036y;

    /* renamed from: z, reason: collision with root package name */
    public long f199037z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v9(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f199018d = "FinderLiveVisitorRoleUIC";
        this.f199020f = true;
        this.f199026o = new int[2];
        this.f199029r = new java.util.LinkedList();
        this.f199030s = 1;
        this.f199031t = Long.MIN_VALUE;
        this.f199032u = true;
        this.f199033v = 1;
        this.f199034w = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.q1.f392103c));
        this.f199035x = true;
    }

    public final android.content.Intent O6() {
        zl2.r4.f555483a.W2(this.f199029r, this.f199030s, this.f199031t);
        android.content.Intent intent = new android.content.Intent();
        int i17 = this.f199027p;
        if (i17 == 1) {
            intent.putExtra("KEY_IS_FROM_SETTING", this.f199028q);
        } else if (i17 == 2) {
            intent.putExtra("KEY_HAS_CHANGE_ROLE", this.f199033v != this.f199030s);
        }
        return intent;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P6(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r18) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.v9.P6(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void Q6(int i17) {
        boolean z17 = zl2.q4.f555466a.E() ? true : this.f199031t - ((long) c01.id.e()) <= 0;
        zl2.r4.f555483a.F(this.f199029r);
        bm2.h8 h8Var = this.f199025n;
        if (h8Var != null) {
            h8Var.x(i17, this.f199029r, z17);
        }
        bm2.h8 h8Var2 = this.f199025n;
        if (h8Var2 != null) {
            h8Var2.m8146xced61ae5();
        }
    }

    public final void R6() {
        java.lang.String str = "before removeAliasInfo size:" + this.f199029r.size();
        java.lang.String str2 = this.f199018d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        java.util.Iterator it = this.f199029r.iterator();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it, "iterator(...)");
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
            r45.of1 of1Var = (r45.of1) next;
            if (of1Var.m75939xb282bd08(2) == 2) {
                it.remove();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "removeAliasInfo:" + pm0.b0.g(of1Var));
                break;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "after removeAliasInfo size:" + this.f199029r.size());
        zl2.r4.f555483a.U2(this.f199029r);
    }

    public final void S6() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199018d, "setActivityResult fromSetting:" + this.f199028q + ", " + zl2.r4.f555483a.O2(this.f199018d, this.f199029r, this.f199030s, this.f199031t));
        m158354x19263085().setResult(-1, O6());
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String stringExtra;
        if (i17 == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f199018d, "requestCode:" + i17 + ",resultCode:" + i18 + ",data:" + intent);
            if (i18 == -1) {
                java.lang.String str3 = "";
                if (intent == null || (str = intent.getStringExtra("KEY_ALIAS_VISITOR_NICKNAME")) == null) {
                    str = "";
                }
                if (intent == null || (str2 = intent.getStringExtra("KEY_ALIAS_VISITOR_AVATAR")) == null) {
                    str2 = "";
                }
                if (intent != null && (stringExtra = intent.getStringExtra("KEY_ALIAS_VISITOR_USERNAME")) != null) {
                    str3 = stringExtra;
                }
                r45.of1 of1Var = new r45.of1();
                of1Var.set(0, str);
                of1Var.set(1, str2);
                of1Var.set(3, str3);
                of1Var.set(2, 2);
                R6();
                if (this.f199029r.size() > 0) {
                    this.f199029r.add(1, of1Var);
                } else {
                    this.f199029r.add(of1Var);
                }
                bm2.h8 h8Var = this.f199025n;
                if (h8Var != null) {
                    h8Var.x(this.f199030s, this.f199029r, true);
                }
                bm2.h8 h8Var2 = this.f199025n;
                if (h8Var2 != null) {
                    h8Var2.m8146xced61ae5();
                }
                zl2.r4.f555483a.U2(this.f199029r);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    public boolean mo2274xbdc3c5dc() {
        int i17;
        if (this.f199020f && ((i17 = this.f199027p) == 1 || i17 == 2)) {
            S6();
        }
        m158354x19263085().finish();
        if (this.f199027p != 0) {
            m158354x19263085().overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559410e1);
        }
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.View view;
        this.f199019e = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ief);
        this.f199022h = (android.widget.ProgressBar) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.imc);
        boolean g17 = zl2.q4.f555466a.g();
        this.f199020f = g17;
        if (g17) {
            android.view.View view2 = this.f199019e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else {
            android.view.View view3 = this.f199019e;
            if (view3 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ProgressBar progressBar = this.f199022h;
            if (progressBar != null) {
                progressBar.setVisibility(8);
            }
        }
        if (m158359x1e885992().getBooleanExtra("intent_status_from_privacy_to_video_setting", false) && (view = this.f199019e) != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveVisitorRoleUIC", "onCreate", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f199021g = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.p4b);
        bm2.h8 h8Var = new bm2.h8();
        this.f199025n = h8Var;
        h8Var.f103484d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.j9(this);
        h8Var.f103485e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.k9(this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f199021g;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 1, false));
            c1163xf1deaba4.mo7960x6cab2c8d(this.f199025n);
            c1163xf1deaba4.P(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.l9(this));
        }
        this.f199027p = m158359x1e885992().getIntExtra("KEY_SOURCE", 0);
        this.f199028q = m158359x1e885992().getBooleanExtra("KEY_IS_FROM_SETTING", true);
        this.f199032u = m158359x1e885992().getBooleanExtra("KEY_CAN_MODEI_ALIAS", true);
        if (this.f199028q || this.f199027p == 2) {
            this.f199029r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a.a();
            g92.b bVar = g92.b.f351302e;
            this.f199030s = bVar.k2().m75939xb282bd08(4);
            this.f199031t = bVar.k2().m75942xfb822ef2(5);
        } else {
            java.io.Serializable serializableExtra = m158359x1e885992().getSerializableExtra("KEY_VISITOR_ROLE_LIST");
            java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
            if (list != null) {
                zl2.r4 r4Var = zl2.r4.f555483a;
                java.util.LinkedList linkedList = this.f199029r;
                if (linkedList == null) {
                    linkedList = new java.util.LinkedList();
                } else {
                    linkedList.clear();
                }
                for (byte[] bArr : list) {
                    r45.of1 of1Var = new r45.of1();
                    of1Var.mo11468x92b714fd(bArr);
                    linkedList.add(of1Var);
                }
            }
            this.f199030s = m158359x1e885992().getIntExtra("KEY_VISITOR_ROLE", 1);
            this.f199031t = m158359x1e885992().getLongExtra("KEY_MODIFY_TIME", Long.MIN_VALUE);
        }
        if (this.f199029r.size() > 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_LIVE_ALIAS_GUIDE_SHOW_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        }
        this.f199033v = this.f199030s;
        java.lang.String str = "parseInten fromSetting:" + this.f199028q + ',' + zl2.r4.f555483a.O2(this.f199018d, this.f199029r, this.f199030s, this.f199031t);
        java.lang.String str2 = this.f199018d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        Q6(this.f199030s);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "onCreate enableVisitorRoleEntrance:" + this.f199020f);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.z0.e(this.f199034w, null, 1, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).getClass();
        ((c61.l7) i95.n0.c(c61.l7.class)).P.e(65536, 9);
    }
}
