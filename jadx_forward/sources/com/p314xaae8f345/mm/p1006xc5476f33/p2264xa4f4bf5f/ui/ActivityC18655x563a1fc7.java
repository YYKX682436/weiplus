package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/ui/TextStatusNewLabelUI;", "Lcom/tencent/mm/plugin/sns/ui/visiblerange/BaseSelectVisibleRangeUI;", "Lzd4/p;", "<init>", "()V", "com/tencent/mm/plugin/textstatus/ui/qd", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI */
/* loaded from: classes11.dex */
public final class ActivityC18655x563a1fc7 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c implements zd4.p {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f255188J = 0;
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.qd G;
    public final java.lang.String E = "MicroMsg.TextStatusNewLabelUI";
    public final jz5.g F = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.sd(this));
    public final jz5.g H = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.rd(this));
    public final jz5.g I = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.td(this));

    @Override // zd4.p
    public boolean A6() {
        boolean r27;
        boolean z17;
        boolean r28;
        android.content.Intent intent = getIntent();
        b7();
        int intExtra = intent.getIntExtra("KLabel_range_index", 0);
        java.lang.String stringExtra = intent.getStringExtra("Kother_user_name_list");
        java.lang.String str = this.f252206d;
        java.util.List<java.lang.String> O1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.O1(stringExtra, str);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra == null) {
            stringArrayListExtra = new java.util.ArrayList<>();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c.X6(stringArrayListExtra);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(O1);
        l7();
        this.f252218s = intExtra;
        this.f252216q.f253077o.clear();
        if (intExtra == 2) {
            this.f252216q.f253076n.clear();
            for (java.lang.String str2 : stringArrayListExtra) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    z17 = false;
                } else {
                    java.util.List j17 = ((b93.b) c93.a.a()).j(java.lang.String.valueOf(str2));
                    z17 = (j17 != null ? j17.size() : 0) > 0;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidLabel", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (z17) {
                    this.f252216q.f253076n.add(str2);
                }
            }
            java.util.ArrayList mIncludeLabel = this.f252216q.f253076n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mIncludeLabel, "mIncludeLabel");
            if (!mIncludeLabel.isEmpty()) {
                this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253076n, str);
            }
            this.f252216q.e();
            for (java.lang.String str3 : O1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    r27 = false;
                } else {
                    r27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str3, true).r2();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (r27) {
                    this.f252216q.f253078p.add(str3);
                }
            }
            this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253078p, str);
        } else if (intExtra == 3) {
            java.util.Iterator<java.lang.String> it = stringArrayListExtra.iterator();
            while (it.hasNext()) {
                this.f252216q.f253077o.add(it.next().toString());
            }
            java.util.ArrayList mExcludeLabel = this.f252216q.f253077o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mExcludeLabel, "mExcludeLabel");
            if (!mExcludeLabel.isEmpty()) {
                this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253077o, str);
            }
            this.f252216q.d();
            for (java.lang.String str4 : O1) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str4)) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                    r28 = false;
                } else {
                    r28 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str4, true).r2();
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isValidContact", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
                }
                if (r28) {
                    this.f252216q.f253079q.add(str4);
                }
            }
            this.f252212m = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253079q, str);
        }
        return true;
    }

    @Override // zd4.p
    public boolean C6() {
        return ((java.lang.Boolean) ((jz5.n) this.F).mo141623x754a37bb()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x016b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0156  */
    @Override // zd4.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean I3() {
        /*
            Method dump skipped, instructions count: 479
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18655x563a1fc7.I3():boolean");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.x6 Y6(android.content.Context context, zd4.o resCollector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resCollector, "resCollector");
        return o7();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public zd4.o Z6() {
        android.content.Intent intent = getIntent();
        b7();
        int intExtra = intent.getIntExtra("KLabel_range_index", 0);
        b7();
        java.lang.CharSequence charSequence = "";
        if (intExtra != 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.eg(-1, "");
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        java.util.ArrayList<java.lang.String> lastRangeUserList = p7().f255717c;
        java.util.ArrayList<java.lang.String> lastRangeLabelIdList = p7().f255716b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastRangeUserList, "lastRangeUserList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lastRangeLabelIdList, "lastRangeLabelIdList");
        if (!lastRangeUserList.isEmpty() || !lastRangeLabelIdList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.HashSet hashSet = new java.util.HashSet();
            int min = java.lang.Math.min(lastRangeLabelIdList.size() + lastRangeUserList.size(), 20);
            for (java.lang.String str : lastRangeLabelIdList) {
                if (arrayList.size() >= min) {
                    break;
                }
                if (!hashSet.contains(str) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    java.lang.String g17 = ((b93.b) c93.a.a()).g(str);
                    if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(((b93.b) c93.a.a()).j(str))) {
                        g17 = "";
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(g17);
                        arrayList.add(0, g17);
                        hashSet.add(str);
                    }
                }
            }
            for (java.lang.String username : lastRangeUserList) {
                if (arrayList.size() >= min) {
                    break;
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                java.lang.String a17 = c01.a2.a(username);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(username, true);
                    a17 = (n17 == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.f2())) ? "" : n17.f2();
                }
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
                    arrayList.add(a17);
                }
            }
            java.lang.String c17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(arrayList, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.jbm));
            java.lang.String string = mo55332x76847179.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jfk);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{c17}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            ((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).getClass();
            charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(mo55332x76847179, format);
        }
        return new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.eg(p7().f255715a, charSequence);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public void a7(android.content.Intent intent) {
        if (intent != null) {
            intent.putExtra("k_last_range_user_clicked", o7().C);
        }
        super.a7(intent);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public android.content.Intent c7() {
        android.content.Intent c76 = super.c7();
        c76.putExtra("contact_select_label_from_scene", 2);
        return c76;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c
    public boolean i7(android.widget.ExpandableListView expandableListView, android.view.View view, int i17, long j17) {
        int i18 = this.f252217r.i(this.f252216q.f253073k);
        int n17 = this.f252217r.n(i17);
        boolean i76 = super.i7(expandableListView, view, i17, j17);
        if (n17 == 5) {
            int i19 = p7().f255715a;
            java.util.ArrayList arrayList = p7().f255716b;
            java.util.ArrayList arrayList2 = p7().f255717c;
            boolean o17 = this.f252217r.o(i19, 2);
            java.util.ArrayList arrayList3 = this.f252211i;
            java.lang.String str = this.f252206d;
            if (o17) {
                arrayList3.addAll(arrayList);
                this.f252216q.f253076n.clear();
                this.f252216q.f253076n.addAll(arrayList);
                this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253076n, str);
                this.f252216q.e();
                this.f252216q.f253078p = arrayList2;
            } else if (this.f252217r.o(i19, 3)) {
                arrayList3.addAll(arrayList);
                this.f252216q.f253077o.clear();
                this.f252216q.f253077o.addAll(arrayList);
                this.f252210h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(this.f252216q.f253077o, str);
                this.f252216q.d();
                this.f252216q.f253079q = arrayList2;
            }
            int i27 = this.f252217r.i(p7().f255715a);
            o7().C = true;
            boolean isGroupExpanded = this.f252207e.isGroupExpanded(i27);
            o7().f253073k = p7().f255715a;
            java.lang.String str2 = "handleOnGroupClick: last group visibleState:" + p7().f255715a + ", pos:" + i27 + ", hadExpand:" + isGroupExpanded;
            java.lang.String str3 = this.E;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
            int i28 = p7().f255715a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "checkEnableOptionMenu: targetState=" + i28);
            if (i28 == 2) {
                m78501x43e00957(k7());
            } else if (i28 != 3) {
                m78501x43e00957(true);
            } else {
                m78501x43e00957(j7());
            }
            if (!isGroupExpanded) {
                if (i18 != i27 && this.f252207e.isGroupExpanded(i18)) {
                    this.f252207e.c(i18);
                }
                this.f252207e.d(i27);
                return true;
            }
            o7().notifyDataSetChanged();
        }
        return i76;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.oc o7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.oc) ((jz5.n) this.H).mo141623x754a37bb();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        this.f252225z = this;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDynamicChangeVisibleRange", "com.tencent.mm.plugin.sns.ui.visiblerange.BaseSelectVisibleRangeUI");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.E, "onCreate: isFromFeedEditUI " + ((java.lang.Boolean) ((jz5.n) this.F).mo141623x754a37bb()).booleanValue());
        super.onCreate(bundle);
        this.G = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.qd(new java.lang.ref.WeakReference(this));
        gm0.j1.n().f354821b.a(5293, this.G);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2223xf2e0c00b.AbstractActivityC18396x51e3f06c, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        gm0.j1.n().f354821b.q(5293, this.G);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q p7() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q) ((jz5.n) this.I).mo141623x754a37bb();
    }
}
