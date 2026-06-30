package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView */
/* loaded from: classes7.dex */
public class C12795x70ccad8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12793xdbae90e1 {

    /* renamed from: v, reason: collision with root package name */
    public static final l01.r f173392v = new l01.n0();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f173393g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf f173394h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r f173395i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.FrameLayout f173396m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f173397n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f173398o;

    /* renamed from: p, reason: collision with root package name */
    public android.animation.ObjectAnimator f173399p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 f173400q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f173401r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f173402s;

    /* renamed from: t, reason: collision with root package name */
    public r45.a60 f173403t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.Object f173404u;

    public C12795x70ccad8(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f173393g = new java.util.ArrayList();
        this.f173399p = null;
        this.f173400q = null;
        this.f173401r = "";
        this.f173402s = false;
        this.f173404u = new java.lang.Object();
        e();
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8, java.util.List list, boolean z17) {
        c12795x70ccad8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "setData list size:%s, exposeCommonUsed:%b", java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
        java.util.ArrayList arrayList = c12795x70ccad8.f173393g;
        arrayList.clear();
        if (list.isEmpty()) {
            c12795x70ccad8.setVisibility(8);
        } else {
            arrayList.addAll(list);
            c12795x70ccad8.f173394h.setVisibility(0);
            c12795x70ccad8.f173395i.m8146xced61ae5();
            if (z17) {
                c12795x70ccad8.c();
            }
            c12795x70ccad8.g();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "stopLoading");
        c12795x70ccad8.f173399p.cancel();
        c12795x70ccad8.f173396m.setVisibility(8);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "setData size:%d", java.lang.Integer.valueOf(list.size()));
        c12795x70ccad8.f173390e.e(2, "" + list.size(), "", android.net.Uri.encode(c12795x70ccad8.m53615xf04ce124()));
    }

    public static void b(final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8 c12795x70ccad8, r45.rs3 rs3Var, final boolean z17) {
        r45.z50 z50Var;
        java.util.LinkedList linkedList;
        c12795x70ccad8.getClass();
        if (!((rs3Var == null || (z50Var = rs3Var.f466706e) == null || (linkedList = z50Var.f473254d) == null || linkedList.isEmpty()) ? false : true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common_use is empty");
            c12795x70ccad8.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView$$b
                @Override // java.lang.Runnable
                public final void run() {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.this.setVisibility(8);
                }
            });
            return;
        }
        c12795x70ccad8.f173403t = rs3Var.f466706e.f473255e;
        final java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common_use list:%d", java.lang.Integer.valueOf(rs3Var.f466706e.f473254d.size()));
        java.util.Iterator it = rs3Var.f466706e.f473254d.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            r45.pc7 pc7Var = (r45.pc7) it.next();
            r45.hd7 hd7Var = pc7Var.f464483m;
            java.lang.String str = "";
            java.lang.String str2 = hd7Var != null ? hd7Var.f457605g : "";
            java.lang.String str3 = hd7Var != null ? hd7Var.f457606h : "";
            java.lang.String str4 = hd7Var != null ? hd7Var.f457607i : "";
            int i18 = hd7Var != null ? hd7Var.f457602d : 0;
            java.lang.String str5 = str3;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4(pc7Var.f464477d, str2, pc7Var.f464479f, 0, str5, str5, str4, false, 0L, 0L, false, "");
            java.lang.String str6 = hd7Var != null ? hd7Var.f457604f : "";
            r45.a60 a60Var = c12795x70ccad8.f173403t;
            if (a60Var != null) {
                java.util.LinkedList linkedList2 = a60Var.f451289d;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(linkedList2)) {
                    java.util.Iterator it6 = linkedList2.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            break;
                        }
                        r45.fn5 fn5Var = (r45.fn5) it6.next();
                        if (fn5Var.f456000d == i18) {
                            str = fn5Var.f456001e;
                            break;
                        }
                    }
                }
            }
            c11714x918fd2e4.f157907t = str;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43 c11709x5a897c43 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11709x5a897c43();
            c11709x5a897c43.f157872f = str6;
            c11714x918fd2e4.f157908u = c11709x5a897c43;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0 z0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0(c11714x918fd2e4, 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "common used appId:%s, nickName:%s, username:%s, commUseReferLabel:%s", str2, str5, pc7Var.f464477d, str);
            i17++;
            if (i17 > c12795x70ccad8.m53614xc82f626c()) {
                break;
            } else {
                arrayList.add(z0Var);
            }
        }
        c12795x70ccad8.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.widget.recent.AppBrandCommonUsedTaskView$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.this, arrayList, z17);
            }
        });
    }

    /* renamed from: getCommonUsedMaxShowCount */
    private int m53614xc82f626c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.y0.b() ? 4 : 8;
    }

    /* renamed from: getExtraData */
    private java.lang.String m53615xf04ce124() {
        r45.a60 a60Var = this.f173403t;
        return a60Var != null ? a60Var.f451299q : "";
    }

    public void c() {
        java.util.Iterator it = this.f173393g.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0 z0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.z0) it.next();
            this.f173390e.e(5, z0Var.f173625a.f157894d, "" + i17, android.net.Uri.encode(z0Var.f173625a.f157908u.f157872f));
            i17++;
        }
    }

    public void d() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "fetchCommonUsedDataFromServer");
        synchronized (this.f173404u) {
            if (this.f173402s) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "is fetching data from server");
                return;
            }
            this.f173402s = true;
            r45.id7 id7Var = new r45.id7();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.C11714x918fd2e4 c11714x918fd2e4 = this.f173400q;
            if (c11714x918fd2e4 != null) {
                id7Var.f458491e = this.f173401r;
                id7Var.f458490d = c11714x918fd2e4.f157895e;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j3 j3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.j3(103, "", id7Var);
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(j3Var.f152179f, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.q(this));
        }
    }

    public void e() {
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dyz, (android.view.ViewGroup) null);
        addView(linearLayout, new android.widget.FrameLayout.LayoutParams(-1, -2));
        this.f173394h = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12803xc1f7abcf) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.sdx);
        this.f173396m = (android.widget.FrameLayout) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.im7);
        this.f173397n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.f567216im4);
        this.f173398o = (android.widget.TextView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.obc);
        f();
        this.f173394h.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.n(this, getContext(), 4, 1, false));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r rVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.r(this);
        this.f173395i = rVar;
        this.f173394h.mo7960x6cab2c8d(rVar);
        this.f173394h.g1(getContext(), i65.a.B(getContext()));
        this.f173394h.m53635xbbc97b80(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv));
    }

    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView", "startLoading");
        this.f173396m.setVisibility(0);
        if (this.f173399p == null) {
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f173397n, "rotation", 0.0f, 360.0f);
            ofFloat.setDuration(2000L);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setInterpolator(new android.view.animation.LinearInterpolator());
            this.f173399p = ofFloat;
        }
        this.f173399p.start();
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
            r45.a60 r0 = r5.f173403t
            java.lang.String r1 = "MicroMsg.AppBrandTask.AppBrandCommonUsedTaskView"
            if (r0 == 0) goto L78
            r45.b60 r0 = r0.f451301s
            if (r0 == 0) goto L78
            android.content.Context r2 = r5.getContext()
            java.lang.String r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(r2)
            java.lang.String r3 = "updateTitle curLang：%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r2}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r3, r4)
            java.lang.String r3 = "zh_CN"
            boolean r3 = r2.equalsIgnoreCase(r3)
            r4 = 0
            if (r3 == 0) goto L36
            java.lang.String r3 = r0.f452069d
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L36
            android.widget.TextView r2 = r5.f173398o
            java.lang.String r0 = r0.f452069d
            r2.setText(r0)
            goto L79
        L36:
            java.lang.String r3 = "zh_TW"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L4f
            java.lang.String r3 = r0.f452071f
            boolean r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r3)
            if (r3 != 0) goto L4f
            android.widget.TextView r2 = r5.f173398o
            java.lang.String r0 = r0.f452071f
            r2.setText(r0)
            goto L79
        L4f:
            java.lang.String r3 = "zh_HK"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L68
            java.lang.String r2 = r0.f452070e
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L68
            android.widget.TextView r2 = r5.f173398o
            java.lang.String r0 = r0.f452070e
            r2.setText(r0)
            goto L79
        L68:
            java.lang.String r2 = r0.f452072g
            boolean r2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r2)
            if (r2 != 0) goto L78
            android.widget.TextView r2 = r5.f173398o
            java.lang.String r0 = r0.f452072g
            r2.setText(r0)
            goto L79
        L78:
            r4 = 1
        L79:
            if (r4 == 0) goto L89
            java.lang.String r0 = "updateTitle use default title"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            android.widget.TextView r0 = r5.f173398o
            r1 = 2131755936(0x7f1003a0, float:1.9142765E38)
            r0.setText(r1)
        L89:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1230xc846465b.C12795x70ccad8.g():void");
    }

    public C12795x70ccad8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f173393g = new java.util.ArrayList();
        this.f173399p = null;
        this.f173400q = null;
        this.f173401r = "";
        this.f173402s = false;
        this.f173404u = new java.lang.Object();
        e();
    }
}
