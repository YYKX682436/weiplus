package com.tencent.mm.plugin.appbrand.widget.recent;

/* loaded from: classes7.dex */
public class AppBrandCommonUsedTaskView extends com.tencent.mm.plugin.appbrand.widget.recent.AppBrandBaseTaskView {

    /* renamed from: v, reason: collision with root package name */
    public static final l01.r f91859v = new l01.n0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f91860g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView f91861h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recent.r f91862i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f91863m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f91864n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f91865o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.ObjectAnimator f91866p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo f91867q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f91868r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f91869s;

    /* renamed from: t, reason: collision with root package name */
    public r45.a60 f91870t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f91871u;

    public AppBrandCommonUsedTaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91860g = new java.util.ArrayList();
        this.f91866p = null;
        this.f91867q = null;
        this.f91868r = "";
        this.f91869s = false;
        this.f91871u = new java.lang.Object();
        e();
    }

    public static void a(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView, java.util.List list, boolean z17) {
        appBrandCommonUsedTaskView.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "setData list size:%s, exposeCommonUsed:%b", java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
        java.util.ArrayList arrayList = appBrandCommonUsedTaskView.f91860g;
        arrayList.clear();
        if (list.isEmpty()) {
            appBrandCommonUsedTaskView.setVisibility(8);
        } else {
            arrayList.addAll(list);
            appBrandCommonUsedTaskView.f91861h.setVisibility(0);
            appBrandCommonUsedTaskView.f91862i.notifyDataSetChanged();
            if (z17) {
                appBrandCommonUsedTaskView.c();
            }
            appBrandCommonUsedTaskView.g();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "stopLoading");
        appBrandCommonUsedTaskView.f91866p.cancel();
        appBrandCommonUsedTaskView.f91863m.setVisibility(8);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "setData size:%d", java.lang.Integer.valueOf(list.size()));
        appBrandCommonUsedTaskView.f91857e.e(2, "" + list.size(), "", android.net.Uri.encode(appBrandCommonUsedTaskView.getExtraData()));
    }

    public static void b(final com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView appBrandCommonUsedTaskView, r45.rs3 rs3Var, final boolean z17) {
        r45.z50 z50Var;
        java.util.LinkedList linkedList;
        appBrandCommonUsedTaskView.getClass();
        if (!((rs3Var == null || (z50Var = rs3Var.f385173e) == null || (linkedList = z50Var.f391721d) == null || linkedList.isEmpty()) ? false : true)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common_use is empty");
            appBrandCommonUsedTaskView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.this.setVisibility(8);
                }
            });
            return;
        }
        appBrandCommonUsedTaskView.f91870t = rs3Var.f385173e.f391722e;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common_use list:%d", java.lang.Integer.valueOf(rs3Var.f385173e.f391721d.size()));
        java.util.Iterator it = rs3Var.f385173e.f391721d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.pc7 pc7Var = (r45.pc7) it.next();
            r45.hd7 hd7Var = pc7Var.f382950m;
            java.lang.String str = "";
            java.lang.String str2 = hd7Var != null ? hd7Var.f376072g : "";
            java.lang.String str3 = hd7Var != null ? hd7Var.f376073h : "";
            java.lang.String str4 = hd7Var != null ? hd7Var.f376074i : "";
            int i18 = hd7Var != null ? hd7Var.f376069d : 0;
            java.lang.String str5 = str3;
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = new com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo(pc7Var.f382944d, str2, pc7Var.f382946f, 0, str5, str5, str4, false, 0L, 0L, false, "");
            java.lang.String str6 = hd7Var != null ? hd7Var.f376071f : "";
            r45.a60 a60Var = appBrandCommonUsedTaskView.f91870t;
            if (a60Var != null) {
                java.util.LinkedList linkedList2 = a60Var.f369756d;
                if (!com.tencent.mm.sdk.platformtools.t8.L0(linkedList2)) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        r45.fn5 fn5Var = (r45.fn5) it6.next();
                        if (fn5Var.f374467d == i18) {
                            str = fn5Var.f374468e;
                            break;
                        }
                    }
                }
            }
            localUsageInfo.f76374t = str;
            com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo appBrandCommUseInfo = new com.tencent.mm.plugin.appbrand.appusage.AppBrandCommUseInfo();
            appBrandCommUseInfo.f76339f = str6;
            localUsageInfo.f76375u = appBrandCommUseInfo;
            com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var = new com.tencent.mm.plugin.appbrand.widget.recent.z0(localUsageInfo, 2);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common used appId:%s, nickName:%s, username:%s, commUseReferLabel:%s", str2, str5, pc7Var.f382944d, str);
            i17++;
            if (i17 > appBrandCommonUsedTaskView.getCommonUsedMaxShowCount()) {
                break;
            } else {
                arrayList.add(z0Var);
            }
        }
        appBrandCommonUsedTaskView.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.a(com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.this, arrayList, z17);
            }
        });
    }

    private int getCommonUsedMaxShowCount() {
        return com.tencent.mm.plugin.appbrand.widget.recent.y0.b() ? 4 : 8;
    }

    private java.lang.String getExtraData() {
        r45.a60 a60Var = this.f91870t;
        return a60Var != null ? a60Var.f369766q : "";
    }

    public void c() {
        java.util.Iterator it = this.f91860g.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.tencent.mm.plugin.appbrand.widget.recent.z0 z0Var = (com.tencent.mm.plugin.appbrand.widget.recent.z0) it.next();
            this.f91857e.e(5, z0Var.f92092a.f76361d, "" + i17, android.net.Uri.encode(z0Var.f92092a.f76375u.f76339f));
            i17++;
        }
    }

    public void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer");
        synchronized (this.f91871u) {
            if (this.f91869s) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "is fetching data from server");
                return;
            }
            this.f91869s = true;
            r45.id7 id7Var = new r45.id7();
            com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo localUsageInfo = this.f91867q;
            if (localUsageInfo != null) {
                id7Var.f376958e = this.f91868r;
                id7Var.f376957d = localUsageInfo.f76362e;
            }
            com.tencent.mm.plugin.appbrand.appusage.j3 j3Var = new com.tencent.mm.plugin.appbrand.appusage.j3(103, "", id7Var);
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(j3Var.f70646f, new com.tencent.mm.plugin.appbrand.widget.recent.q(this));
        }
    }

    public void e() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.dyz, (android.view.ViewGroup) null);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f91861h = (com.tencent.mm.plugin.appbrand.widget.recent.AppBrandTaskRecyclerView) linearLayout.findViewById(com.tencent.mm.R.id.sdx);
        this.f91863m = (android.widget.FrameLayout) linearLayout.findViewById(com.tencent.mm.R.id.im7);
        this.f91864n = (com.tencent.mm.ui.widget.imageview.WeImageView) linearLayout.findViewById(com.tencent.mm.R.id.f485683im4);
        this.f91865o = (android.widget.TextView) linearLayout.findViewById(com.tencent.mm.R.id.obc);
        f();
        this.f91861h.setLayoutManager(new com.tencent.mm.plugin.appbrand.widget.recent.n(this, getContext(), 4, 1, false));
        com.tencent.mm.plugin.appbrand.widget.recent.r rVar = new com.tencent.mm.plugin.appbrand.widget.recent.r(this);
        this.f91862i = rVar;
        this.f91861h.setAdapter(rVar);
        this.f91861h.g1(getContext(), i65.a.B(getContext()));
        this.f91861h.setLineGap(i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv));
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "startLoading");
        this.f91863m.setVisibility(0);
        if (this.f91866p == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f91864n, "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(2000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f91866p = ofFloat;
        }
        this.f91866p.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            r5 = this;
            r45.a60 r0 = r5.f91870t
            java.lang.String r1 = "MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView"
            if (r0 == 0) goto L78
            r45.b60 r0 = r0.f369768s
            if (r0 == 0) goto L78
            android.content.Context r2 = r5.getContext()
            java.lang.String r2 = com.tencent.mm.sdk.platformtools.m2.f(r2)
            java.lang.String r3 = "updateTitle curLang：%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            com.tencent.mars.xlog.Log.i(r1, r3, r4)
            java.lang.String r3 = "zh_CN"
            boolean r3 = r2.equalsIgnoreCase(r3)
            r4 = 0
            if (r3 == 0) goto L36
            java.lang.String r3 = r0.f370536d
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L36
            android.widget.TextView r2 = r5.f91865o
            java.lang.String r0 = r0.f370536d
            r2.setText(r0)
            goto L79
        L36:
            java.lang.String r3 = "zh_TW"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L4f
            java.lang.String r3 = r0.f370538f
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L4f
            android.widget.TextView r2 = r5.f91865o
            java.lang.String r0 = r0.f370538f
            r2.setText(r0)
            goto L79
        L4f:
            java.lang.String r3 = "zh_HK"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L68
            java.lang.String r2 = r0.f370537e
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L68
            android.widget.TextView r2 = r5.f91865o
            java.lang.String r0 = r0.f370537e
            r2.setText(r0)
            goto L79
        L68:
            java.lang.String r2 = r0.f370539g
            boolean r2 = com.tencent.mm.sdk.platformtools.t8.K0(r2)
            if (r2 != 0) goto L78
            android.widget.TextView r2 = r5.f91865o
            java.lang.String r0 = r0.f370539g
            r2.setText(r0)
            goto L79
        L78:
            r4 = 1
        L79:
            if (r4 == 0) goto L89
            java.lang.String r0 = "updateTitle use default title"
            com.tencent.mars.xlog.Log.i(r1, r0)
            android.widget.TextView r0 = r5.f91865o
            r1 = 2131755936(0x7f1003a0, float:1.9142765E38)
            r0.setText(r1)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView.g():void");
    }

    public AppBrandCommonUsedTaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91860g = new java.util.ArrayList();
        this.f91866p = null;
        this.f91867q = null;
        this.f91868r = "";
        this.f91869s = false;
        this.f91871u = new java.lang.Object();
        e();
    }
}
