package com.p314xaae8f345.mm.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.ui.HomeUI */
/* loaded from: classes11.dex */
public class C21374x812c2fd3 implements com.p314xaae8f345.mm.ui.n8, com.p314xaae8f345.mm.ui.p8, com.p314xaae8f345.mm.ui.o8, hh4.a {

    /* renamed from: a0, reason: collision with root package name */
    public static java.lang.Boolean f278271a0;

    /* renamed from: b0, reason: collision with root package name */
    public static java.lang.Boolean f278272b0;

    /* renamed from: c0, reason: collision with root package name */
    public static boolean f278273c0;
    public android.view.View A;
    public android.view.View B;
    public android.widget.ImageView C;
    public android.view.View D;
    public android.widget.ImageView E;
    public android.view.MenuItem F;
    public android.view.MenuItem G;
    public android.view.View K;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d L;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d M;
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d N;
    public final android.os.MessageQueue.IdleHandler O;
    public java.lang.String P;
    public final java.lang.Runnable Q;
    public int R;
    public long S;
    public final java.util.LinkedList T;
    public final vg3.d4 U;
    public long V;
    public long W;
    public long X;
    public long Y;
    public long Z;

    /* renamed from: c, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.app.b f278277c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f278278d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f278279e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f278280f;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278282h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f278283i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f278284j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.rg f278285k;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f f278291q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.m8 f278292r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.o7 f278293s;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21374x812c2fd3.PlusActionView f278298x;

    /* renamed from: y, reason: collision with root package name */
    public android.view.View f278299y;

    /* renamed from: z, reason: collision with root package name */
    public android.widget.ImageView f278300z;

    /* renamed from: a, reason: collision with root package name */
    public boolean f278275a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f278276b = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f278281g = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f278286l = true;

    /* renamed from: m, reason: collision with root package name */
    public int f278287m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f278288n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f278289o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus f278290p = com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_CREATE;

    /* renamed from: t, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.C21410x67d80e90 f278294t = new com.p314xaae8f345.mm.ui.C21410x67d80e90();

    /* renamed from: u, reason: collision with root package name */
    public boolean f278295u = false;

    /* renamed from: v, reason: collision with root package name */
    public final android.view.View.OnLayoutChangeListener f278296v = new android.view.View.OnLayoutChangeListener(this) { // from class: com.tencent.mm.ui.HomeUI.6
        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        }
    };

    /* renamed from: w, reason: collision with root package name */
    public final boolean f278297w = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.j();
    public boolean H = true;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public long f278274J = 0;

    /* renamed from: com.tencent.mm.ui.HomeUI$1, reason: invalid class name */
    /* loaded from: classes11.dex */
    class AnonymousClass1 implements com.p314xaae8f345.mm.ui.fe {
        public AnonymousClass1() {
        }
    }

    /* renamed from: com.tencent.mm.ui.HomeUI$ActivityStatus */
    /* loaded from: classes11.dex */
    public enum ActivityStatus {
        ACTIVITY_CREATE,
        ACTIVITY_RESUME,
        ACTIVITY_PAUSE
    }

    /* renamed from: com.tencent.mm.ui.HomeUI$PlusActionView */
    /* loaded from: classes5.dex */
    public class PlusActionView implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {
        public PlusActionView(int i17, int i18) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
            android.view.View inflate = android.view.LayoutInflater.from(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569446bf, (android.view.ViewGroup) null);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y = inflate;
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278300z = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.A = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.findViewById(com.p314xaae8f345.mm.R.id.o_w);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.setLayoutParams(layoutParams);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.setMinimumHeight(i18);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.setMinimumWidth(i17);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278300z.setImageResource(com.p314xaae8f345.mm.R.raw.f79996xebd1f109);
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.setContentDescription(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.l(com.p314xaae8f345.mm.R.C30867xcad56011.jzq));
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.PlusActionView.1
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68478xbd3cda5f(10919, "0");
                    ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                    rn3.i.Di().a(3);
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.PlusActionView plusActionView = com.p314xaae8f345.mm.ui.C21374x812c2fd3.PlusActionView.this;
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                    java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                    c21374x812c2fd3.o();
                    if (com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0.booleanValue()) {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                        c21374x812c2fd32.p(bool2, bool2);
                    }
                    if (com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278272b0.booleanValue()) {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.p(java.lang.Boolean.TRUE, java.lang.Boolean.FALSE);
                    }
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b) {
                        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd33 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        if (currentTimeMillis - c21374x812c2fd33.f278274J > com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d) {
                            c21374x812c2fd33.f278274J = currentTimeMillis;
                            c21374x812c2fd33.I = 1;
                        } else {
                            int i19 = c21374x812c2fd33.I + 1;
                            c21374x812c2fd33.I = i19;
                            if (i19 >= 5) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "Switch to MonkeyEnv now.");
                                com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274507b = true;
                            }
                        }
                    }
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$PlusActionView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.PlusActionView.2
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q.mo2548x55429c53();
                }

                /* renamed from: toString */
                public java.lang.String m78432x9616526c() {
                    return super.toString() + "|supportInvalidateOptionsMenu";
                }
            });
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean T1(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean W5() {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean Y3(boolean z17) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean Z3(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(this, rVar, z17);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        /* renamed from: getPath */
        public java.lang.String mo54844xfb83cc9b() {
            return "plus";
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public android.view.View h() {
            return com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278299y;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean o0(boolean z17) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(z17, this);
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean q3(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean u6(boolean z17, r45.pm6 pm6Var) {
            return false;
        }

        @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
        public boolean y(boolean z17) {
            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
            if (z17) {
                android.view.View view = c21374x812c2fd3.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            android.view.View view2 = c21374x812c2fd3.A;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
    }

    static {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        f278271a0 = bool;
        f278272b0 = bool;
        f278273c0 = true;
    }

    public C21374x812c2fd3() {
        new java.util.HashMap();
        com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.L = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.18
            {
                this.f39173x3fe91575 = -443124368;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5313xa7be6d80 c5313xa7be6d80) {
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                android.view.View view = c21374x812c2fd3.f278299y;
                if (view != null) {
                    view.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.18.1
                        @Override // java.lang.Runnable
                        public void run() {
                            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd32 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                            java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                            c21374x812c2fd32.u(true);
                        }

                        /* renamed from: toString */
                        public java.lang.String m78423x9616526c() {
                            return super.toString() + "|updatePlusMenuNewTips";
                        }
                    });
                }
                com.p314xaae8f345.mm.ui.he heVar = c21374x812c2fd3.f278294t.f278455b;
                heVar.getClass();
                nm.j.f419976g.a(new com.p314xaae8f345.mm.ui.we(heVar));
                return false;
            }
        };
        this.M = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5764x5d346639>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.19
            {
                this.f39173x3fe91575 = 871897161;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5764x5d346639 c5764x5d346639) {
                final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5764x5d346639 c5764x5d3466392 = c5764x5d346639;
                android.widget.TextView textView = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278279e;
                if (textView == null) {
                    return false;
                }
                textView.post(new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.19.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                        boolean z17 = c5764x5d3466392.f136081g.f89551a;
                        java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                        c21374x812c2fd3.i(z17);
                    }

                    /* renamed from: toString */
                    public java.lang.String m78424x9616526c() {
                        return super.toString() + "|updateMultiTaskIcon";
                    }
                });
                return false;
            }
        };
        this.N = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da>(a0Var) { // from class: com.tencent.mm.ui.HomeUI.20
            {
                this.f39173x3fe91575 = 2077291978;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da c5724xdcb7b1da) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da c5724xdcb7b1da2 = c5724xdcb7b1da;
                if (c5724xdcb7b1da2 instanceof com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5724xdcb7b1da) {
                    boolean z17 = c5724xdcb7b1da2.f136047g.f88782a;
                    boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                    boolean z18 = j65.e.b() && j65.e.g();
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = c21374x812c2fd3.f278280f;
                    if (c22699x3dcdb352 != null && !mo168058x74219ae7 && z18 && c21374x812c2fd3.f278294t.f278458e == 0) {
                        c22699x3dcdb352.setVisibility(z17 ? 8 : 0);
                    }
                }
                return false;
            }
        };
        this.O = new android.os.MessageQueue.IdleHandler() { // from class: com.tencent.mm.ui.HomeUI.21
            @Override // android.os.MessageQueue.IdleHandler
            public boolean queueIdle() {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1((java.lang.Integer) c01.d9.b().p().l(15, null)) == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "not init finish , do not post sync task");
                    return false;
                }
                java.lang.String a17 = c01.b9.f118602c.a("login_user_name", "");
                if (c01.d9.h() || !a17.equals("")) {
                    c01.d9.e().g(new c01.ra(new com.p314xaae8f345.mm.ui.C21383xf15a531(), "launch normal"));
                }
                s75.d.b(new com.p314xaae8f345.mm.p642xad8b531f.d3(new com.p314xaae8f345.mm.p642xad8b531f.e3(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q)), "StartupReport_report");
                android.content.SharedPreferences sharedPreferences = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("mm_proc_startup", 0);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("mm_proc_startup");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.Z(sharedPreferences, R);
                java.lang.String[] split = R.getString("startup_info", "").split("=");
                if (split != null && split.length > 0) {
                    com.p314xaae8f345.mm.p642xad8b531f.p2 p2Var = new com.p314xaae8f345.mm.p642xad8b531f.p2();
                    if (p2Var.a(split[split.length - 1])) {
                        p2Var.f145084e = android.os.Process.myPid();
                        split[split.length - 1] = p2Var.m43428x9616526c();
                    }
                }
                int myPid = android.os.Process.myPid();
                int i17 = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
                java.lang.String b17 = com.p314xaae8f345.mm.p642xad8b531f.q2.b(split);
                java.lang.String format = java.lang.String.format("%d,%d,%d,%d,%d", 2, 1, java.lang.Integer.valueOf(myPid), java.lang.Integer.valueOf(i17), 0);
                if (b17.length() > 0) {
                    format = b17 + "=" + format;
                }
                R.putString("startup_info", format);
                com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.getClass();
                ((ku5.t0) ku5.t0.f394148d).g(new java.lang.Runnable(this) { // from class: com.tencent.mm.ui.HomeUI.21.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.c0.c();
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "loadFilesToReport error message : " + th6.getMessage());
                        }
                    }
                });
                android.os.Looper.myQueue().removeIdleHandler(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.O);
                return false;
            }
        };
        this.P = null;
        this.Q = new java.lang.Runnable() { // from class: com.tencent.mm.ui.HomeUI.22
            @Override // java.lang.Runnable
            public void run() {
                ((ty3.e) i95.n0.c(ty3.e.class)).getClass();
                int j17 = iq.b.j();
                if (j17 != 0) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(27693, java.lang.Integer.valueOf(j17), 14);
                }
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                if ((!iq.b.g(c21374x812c2fd3.f278291q) || iq.b.v(c21374x812c2fd3.f278291q)) && !iq.b.c(c21374x812c2fd3.f278291q, true)) {
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("BaseScanUI_select_scan_mode", 1);
                    intent.putExtra("GetFriendQRCodeUI.INTENT_FROM_ACTIVITY", 0);
                    intent.putExtra("key_enable_multi_code", true);
                    intent.putExtra("key_scan_goods_enable_dynamic_wording", true);
                    intent.putExtra("key_enable_scan_code_product_merge", true);
                    intent.putExtra("key_scan_report_enter_scene", 14);
                    java.lang.String str = c21374x812c2fd3.P;
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    if (str == null) {
                        str = "";
                    }
                    intent.putExtra("key_scan_launch_referrer", str);
                    intent.setFlags(65536);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11409, new java.lang.Object[0]);
                    j45.l.j(c21374x812c2fd3.f278291q, "scanner", ".ui.BaseScanUI", intent, null);
                    c21374x812c2fd3.P = null;
                }
            }
        };
        this.R = 0;
        this.S = android.os.SystemClock.elapsedRealtime();
        this.T = new java.util.LinkedList();
        this.U = new vg3.d4() { // from class: com.tencent.mm.ui.HomeUI.35
            @Override // vg3.d4
            public void h0(java.lang.String str, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (!(str == null ? "" : str).equals("showprivacypolicy") || map == null) {
                    return;
                }
                java.lang.String str2 = (java.lang.String) map.get(".sysmsg.showprivacypolicy.device_id");
                java.lang.String str3 = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_content");
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                c21374x812c2fd3.f278282h = str3;
                c21374x812c2fd3.f278283i = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_ok");
                c21374x812c2fd3.f278284j = (java.lang.String) map.get(".sysmsg.showprivacypolicy.doublecheck_cancel");
                boolean equals = "yes".equals(map.get(".sysmsg.showprivacypolicy.needbirthday"));
                boolean equals2 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needopenplatform"));
                boolean equals3 = "yes".equals(map.get(".sysmsg.showprivacypolicy.needconfirm"));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_BIRTHDAY_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_OPENPLATFORM_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals2));
                gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_NEED_CONFIRM_BOOLEAN_SYNC, java.lang.Boolean.valueOf(equals3));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "showprivacypolicy onNewXmlReceived, doubleCheckContent:%s, doubleCheckOk:%s, doubleCheckCancel:%s, needBirthday:%s, needOpenPlatform:%s, needConfirm:%s", c21374x812c2fd3.f278282h, c21374x812c2fd3.f278283i, c21374x812c2fd3.f278284j, java.lang.Boolean.valueOf(equals), java.lang.Boolean.valueOf(equals2), java.lang.Boolean.valueOf(equals3));
                if (!ot5.h.f430410a.a(str2, wo.w0.k(), "showprivacypolicy", false)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "device id not match");
                    return;
                }
                java.lang.String obj = gm0.j1.u().c().l(274436, "").toString();
                java.lang.String string = c21374x812c2fd3.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbc, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d(), obj, "login", 1, java.lang.Integer.valueOf(equals2 ? 1 : 0));
                if (u11.c.f(obj)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "eu true, needconfirm: %s", java.lang.Boolean.valueOf(equals3));
                    if (equals3) {
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.e(c21374x812c2fd3, string, 22722, c21374x812c2fd3.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573772fr2, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
                    } else {
                        android.os.Bundle bundle = new android.os.Bundle();
                        bundle.putString("close_dialog_msg", c21374x812c2fd3.f278282h);
                        bundle.putString("close_dialog_cancel", c21374x812c2fd3.f278284j);
                        bundle.putString("close_dialog_ok", c21374x812c2fd3.f278283i);
                        bundle.putBoolean("close_dialog_ok_close", false);
                        com.p314xaae8f345.mm.ui.C21374x812c2fd3.d(c21374x812c2fd3, string, 22722, bundle);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "eu false");
                    android.os.Bundle bundle2 = new android.os.Bundle();
                    bundle2.putString("close_dialog_msg", c21374x812c2fd3.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gb9));
                    bundle2.putString("close_dialog_cancel", c21374x812c2fd3.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.git));
                    bundle2.putString("close_dialog_ok", c21374x812c2fd3.f278291q.getString(com.p314xaae8f345.mm.R.C30867xcad56011.gbb));
                    bundle2.putBoolean("close_dialog_ok_close", false);
                    com.p314xaae8f345.mm.ui.C21374x812c2fd3.d(c21374x812c2fd3, string, 22722, bundle2);
                }
                db5.f.h(c21374x812c2fd3.f278291q);
            }
        };
        this.V = 8589934591L;
        this.W = 8589934591L;
        this.X = 8589934591L;
        this.Y = 8589934591L;
        this.Z = 8589934591L;
    }

    public static void d(com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3, java.lang.String str, int i17, android.os.Bundle bundle) {
        c21374x812c2fd3.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (bundle != null) {
            intent.putExtra("key_close_action", 1);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        if (i17 > 0) {
            j45.l.n(c21374x812c2fd3.f278291q, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(c21374x812c2fd3.f278291q, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void e(com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3, java.lang.String str, int i17, java.lang.String str2) {
        c21374x812c2fd3.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        intent.putExtra("show_bottom", false);
        intent.putExtra("needRedirect", false);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            intent.putExtra("key_close_action", 2);
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("close_jump_url", str2);
            bundle.putInt("close_jump_url_request_code", 206);
            intent.putExtra("key_close_data", bundle);
        }
        intent.putExtra("hardcode_jspermission", com.p314xaae8f345.mm.p2496xc50a8ce6.C19775x58fd37b3.f273711h);
        intent.putExtra("hardcode_general_ctrl", com.p314xaae8f345.mm.p2496xc50a8ce6.C19774x1007d35e.f273708e);
        if (i17 > 0) {
            j45.l.n(c21374x812c2fd3.f278291q, "webview", ".ui.tools.WebViewUI", intent, i17);
        } else {
            j45.l.j(c21374x812c2fd3.f278291q, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }

    public static void f(final android.app.Activity activity) {
        final android.view.View findViewById = activity.findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, actionBarContainer == null");
            return;
        }
        if (!com.p314xaae8f345.mm.ui.b4.c(activity)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, below 35, skip");
            return;
        }
        n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.ui.HomeUI$$e
            @Override // n3.k0
            public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, onApplyWindowInsetsListener");
                com.p314xaae8f345.mm.ui.C21374x812c2fd3.s(activity, view);
                return g3Var;
            }
        };
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.a1.u(findViewById, k0Var);
        yz5.l lVar = new yz5.l() { // from class: com.tencent.mm.ui.HomeUI$$f
            @Override // yz5.l
            /* renamed from: invoke */
            public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, requestApplyInsets");
                android.app.Activity activity2 = activity;
                android.view.View view = findViewById;
                com.p314xaae8f345.mm.ui.C21374x812c2fd3.s(activity2, view);
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                n3.y0.c(view);
                return jz5.f0.f384359a;
            }
        };
        if (n3.x0.b(findViewById)) {
            lVar.mo146xb9724478(findViewById);
        } else {
            findViewById.addOnAttachStateChangeListener(new n3.x1(findViewById, lVar));
        }
    }

    public static void s(android.app.Activity activity, android.view.View view) {
        int h17 = com.p314xaae8f345.mm.ui.bl.h(activity);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, statusBarHeight: %d", java.lang.Integer.valueOf(h17));
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "actionBarContainerMarginTarget35Fix, already adjusted, skip");
            return;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        marginLayoutParams.topMargin = h17;
        view.setLayoutParams(marginLayoutParams);
    }

    @Override // hh4.a
    public void a(float f17, int i17, int i18) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 g17 = m78421xefd35ffa().g();
        if (g17 != null) {
            if (g17 instanceof com.p314xaae8f345.mm.ui.C21417xe2e4fa74) {
                q(this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                return;
            }
            if (g17 instanceof com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) {
                q(i17);
            } else {
                q(this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
            }
            if (i18 > 10) {
                k(this.D, false);
                k(this.f278299y, false);
            } else {
                k(this.D, true);
                k(this.f278299y, true);
            }
        }
    }

    @Override // hh4.a
    public void b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "updateStatusBar show: %b", java.lang.Boolean.valueOf(z17));
        v(this.f278291q.getResources().getColor(z17 ? com.p314xaae8f345.mm.R.C30859x5a72f63.a07 : com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    @Override // hh4.a
    public void c(float f17, int i17, int i18) {
        com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90;
        android.widget.TextView textView;
        if (i17 != 0 && (textView = this.f278279e) != null) {
            long j17 = i17;
            if (this.X != j17) {
                textView.setTextColor(i17);
                this.X = j17;
            }
        }
        android.widget.ImageView imageView = this.E;
        if (imageView != null) {
            long j18 = i18;
            if (this.Y != j18) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f278291q, com.p314xaae8f345.mm.R.raw.f78356x618865ad, i18));
                this.Y = j18;
            }
        }
        if (com.p314xaae8f345.mm.ui.t7.f291414a.a() && (c21410x67d80e90 = this.f278294t) != null && c21410x67d80e90.f278458e == 1) {
            android.widget.ImageView imageView2 = this.C;
            if (imageView2 != null) {
                long j19 = i18;
                if (this.Z != j19) {
                    imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f278291q, com.p314xaae8f345.mm.R.raw.f80835x8a27baa1, i18));
                    this.Z = j19;
                    return;
                }
                return;
            }
            return;
        }
        android.widget.ImageView imageView3 = this.f278300z;
        if (imageView3 != null) {
            long j27 = i18;
            if (this.Z != j27) {
                imageView3.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(this.f278291q, com.p314xaae8f345.mm.R.raw.f79996xebd1f109, i18));
                this.Z = j27;
            }
        }
    }

    public final void g() {
        if (com.p314xaae8f345.mm.ui.t7.f291414a.a() && this.G != null) {
            if (m78421xefd35ffa() == null || m78421xefd35ffa().f278458e != 1 || this.B == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "bindPlusItemActionView plusActionView");
                this.G.setActionView(this.f278299y);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "bindPlusItemActionView addFriendActionView");
                this.G.setActionView(this.B);
            }
        }
    }

    /* renamed from: getMainTabUI */
    public com.p314xaae8f345.mm.ui.C21410x67d80e90 m78421xefd35ffa() {
        return this.f278294t;
    }

    public final void h() {
        android.view.MenuItem menuItem;
        if (com.p314xaae8f345.mm.ui.t7.f291414a.a()) {
            if (m78421xefd35ffa() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "checkIfHideMenuItem getMainTabUI null");
                return;
            }
            int i17 = m78421xefd35ffa().f278458e;
            if (i17 != 2) {
                if ((i17 == 0 || i17 == 1) && (menuItem = this.F) != null) {
                    menuItem.setVisible(false);
                    return;
                }
                return;
            }
            if (((java.lang.Boolean) ((jz5.n) com.p314xaae8f345.mm.ui.t7.f291416c).mo141623x754a37bb()).booleanValue()) {
                return;
            }
            android.view.MenuItem menuItem2 = this.F;
            if (menuItem2 != null) {
                menuItem2.setVisible(false);
            }
            if (this.G == null || m78421xefd35ffa() == null || m78421xefd35ffa().f278458e != 2) {
                return;
            }
            this.G.setVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(boolean r25) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21374x812c2fd3.i(boolean):void");
    }

    public void j() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d c22376x88ed722d;
        yf5.j0 j0Var;
        com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = this.f278294t;
        if (this.f278275a && (c22376x88ed722d = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) c21410x67d80e90.f278468o.get(0)) != null && (j0Var = c22376x88ed722d.f288912v) != null) {
            yf5.w0 w0Var = (yf5.w0) j0Var;
            if (w0Var.f543524w) {
                w0Var.f543524w = false;
            }
        }
        com.p314xaae8f345.mm.ui.he heVar = c21410x67d80e90.f278455b;
        heVar.getClass();
        if (gm0.j1.a()) {
            c01.d9.b().p().e(heVar.f290407r);
            ((l75.a1) c01.d9.b().r()).e(heVar);
            ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
            bk0.a.g().m(heVar.f290406q);
            heVar.f290409t.mo48814x2efc64();
            heVar.f290403n.mo48814x2efc64();
            heVar.f290404o.mo48814x2efc64();
        }
        zy2.ka kaVar = heVar.f290398f;
        if (kaVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.g) kaVar).f187066g.mo48814x2efc64();
        }
        com.p314xaae8f345.mm.ui.af afVar = heVar.f290405p;
        java.lang.String str = null;
        if (afVar != null) {
            afVar.f278666a = null;
            heVar.f290405p = null;
        }
        mv.a0 a0Var = (mv.a0) i95.n0.c(mv.a0.class);
        mv.z listener = heVar.f290408s;
        nv.v1 v1Var = (nv.v1) a0Var;
        synchronized (v1Var) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
            v1Var.f421935e.remove(listener);
        }
        com.p314xaae8f345.mm.ui.o7 o7Var = this.f278293s;
        if (o7Var != null && o7Var.f290991i != null) {
            c01.d9.e().q(255, o7Var.f290991i);
            c01.d9.e().q(384, o7Var.f290991i);
            o7Var.f290991i = null;
        }
        z65.c.f551988a = false;
        this.f278290p = com.p314xaae8f345.mm.ui.C21374x812c2fd3.ActivityStatus.ACTIVITY_PAUSE;
        if (!(c01.d9.f118638b == null)) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).k(false);
        }
        com.p314xaae8f345.mm.ui.m8 m8Var = this.f278292r;
        boolean k17 = m8Var != null ? ((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) m8Var).k() : false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "edw onPause, chatting is show " + k17);
        if (!k17) {
            pf0.u uVar = (pf0.u) i95.n0.c(pf0.u.class);
            int i17 = this.f278294t.f278458e;
            kn4.i0 i0Var = (kn4.i0) uVar;
            i0Var.getClass();
            if (i17 == 0) {
                str = "MainUI";
            } else if (i17 == 1) {
                str = "AddressUI";
            } else if (i17 == 2) {
                str = "FindMoreFriendUI";
            } else if (i17 == 3) {
                str = "MoreTabUI";
            }
            if (str != null) {
                i0Var.Ai(str, 4);
            }
        }
        if (!this.f278291q.isFinishing()) {
            al5.a3.d(this.f278291q);
        }
        if (this.f278275a) {
            nm.j jVar = nm.j.f419976g;
            synchronized (jVar) {
                jVar.f419980d = true;
                if (jVar.f419978b) {
                    jVar.b();
                }
            }
            if (gm0.j1.a()) {
                this.L.mo48814x2efc64();
            }
        }
        com.p314xaae8f345.mm.ui.rg rgVar = this.f278285k;
        if (rgVar == null || !rgVar.c()) {
            return;
        }
        this.f278285k.a();
    }

    public final void k(android.view.View view, boolean z17) {
        if (view != null) {
            if (z17) {
                view.setClickable(true);
            } else {
                view.setClickable(false);
                view.setBackground(null);
            }
        }
    }

    public java.lang.String l(int i17) {
        return this.f278291q.getString(i17);
    }

    public final void m() {
        android.widget.TextView textView;
        if (((com.p314xaae8f345.mm.ui.C21427xe5bb8a3) this.f278292r).k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] isChattingForeground True!");
            return;
        }
        if (this.f278277c == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "[initActionBar] mActionBar == null");
            return;
        }
        this.f278281g = com.p314xaae8f345.mm.ui.bk.C();
        this.f278277c.I(new android.graphics.drawable.ColorDrawable(this.f278291q.getResources().getColor(android.R.color.transparent)));
        this.f278277c.F(false);
        this.f278277c.B(false);
        this.f278277c.E(false);
        this.f278277c.D(true);
        this.f278277c.y(com.p314xaae8f345.mm.ui.id.b(this.f278291q).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569452bl, (android.view.ViewGroup) new android.widget.LinearLayout(this.f278291q), false));
        android.widget.ImageView imageView = (android.widget.ImageView) this.f278277c.j().findViewById(com.p314xaae8f345.mm.R.id.f78239x65c2f76a);
        if (imageView != null) {
            imageView.setImageResource(((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ai() ? com.p314xaae8f345.mm.R.raw.f79989x906fa3af : com.p314xaae8f345.mm.R.raw.f80201x151107e6);
            imageView.getDrawable().setColorFilter(this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832), android.graphics.PorterDuff.Mode.SRC_ATOP);
        }
        imageView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.23
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/HomeUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.m0 Ni = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1) ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.l0.class))).Ni();
                java.lang.Boolean bool = java.lang.Boolean.FALSE;
                Ni.j(bool, bool);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q)).l7(true, 2);
                yj0.a.h(this, "com/tencent/mm/ui/HomeUI$23", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if ((bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20257x5b375031()) == 1) && (textView = (android.widget.TextView) this.f278277c.j().findViewById(android.R.id.text1)) != null) {
            textView.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.24
                @Override // android.view.View.OnClickListener
                public void onClick(android.view.View view) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/ui/HomeUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                    new ul5.x(com.p314xaae8f345.mm.ui.C21374x812c2fd3.this.f278291q).show();
                    yj0.a.h(this, "com/tencent/mm/ui/HomeUI$24", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f278277c;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278291q;
        bVar.w(com.p314xaae8f345.mm.ui.uk.e(activityC21401x6ce6f73f, com.p314xaae8f345.mm.R.C30859x5a72f63.f560394j7, activityC21401x6ce6f73f.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30)));
        w(true);
        this.f278277c.j().findViewById(com.p314xaae8f345.mm.R.id.f564078hb).setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.HomeUI.25
            @Override // android.view.View.OnClickListener
            public void onClick(android.view.View view) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
                long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                if (elapsedRealtime - c21374x812c2fd3.S < 300) {
                    java.util.Iterator it = c21374x812c2fd3.T.iterator();
                    while (it.hasNext()) {
                        ((java.lang.Runnable) it.next()).run();
                    }
                }
                c21374x812c2fd3.S = android.os.SystemClock.elapsedRealtime();
                yj0.a.h(this, "com/tencent/mm/ui/HomeUI$25", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
    }

    public final void n() {
        int i17 = this.f278294t.f278458e;
        if (i17 == 0) {
            ((com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22376x88ed722d) m78421xefd35ffa().g()).getClass();
        }
        ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).Bi(this.f278291q, i17);
    }

    public final void o() {
        if (this.f278285k == null || !gm0.j1.a()) {
            return;
        }
        if (this.f278285k.c()) {
            this.f278285k.a();
            return;
        }
        com.p314xaae8f345.mm.ui.rg rgVar = this.f278285k;
        com.p314xaae8f345.mm.ui.gg ggVar = rgVar.f291276v;
        int i17 = 0;
        ggVar.a(false);
        android.util.SparseArray sparseArray = ggVar.f290230e;
        int size = sparseArray.size();
        android.content.Context context = rgVar.f291274t;
        if (size != 0) {
            rgVar.f291273s = sparseArray;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "dyna plus config is null, we use default one");
            android.util.SparseArray sparseArray2 = rgVar.f291273s;
            if (sparseArray2 != null) {
                sparseArray2.clear();
            } else {
                rgVar.f291273s = new android.util.SparseArray();
            }
            int i18 = 0;
            for (int i19 : com.p314xaae8f345.mm.sdk.p2603x2137b148.f9.HomeMoreFeedback.h() ? com.p314xaae8f345.mm.ui.rg.f291270z : com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P0(context) ? com.p314xaae8f345.mm.ui.rg.f291269y : com.p314xaae8f345.mm.ui.rg.f291268x) {
                com.p314xaae8f345.mm.ui.pg f17 = com.p314xaae8f345.mm.ui.rg.f(i19);
                com.p314xaae8f345.mm.ui.og ogVar = new com.p314xaae8f345.mm.ui.og(f17);
                if (f17 != null) {
                    rgVar.f291273s.put(i18, ogVar);
                }
                i18++;
            }
        }
        if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_open_pay_entry_default_logic, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "clicfg_android_open_pay_entry_default_logic is false");
        } else if (rgVar.f291273s == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "menuDataMap is null");
        } else if (c01.e2.a0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "wechat user, ignore");
        } else {
            int intValue = ((java.lang.Integer) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_REGION_TYPE_INT_SYNC, 0)).intValue();
            boolean z17 = true;
            if (intValue > 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "walletRegion is " + intValue + ", not chain mainland wallet, ignore");
            } else {
                int i27 = 0;
                while (true) {
                    if (i27 >= rgVar.f291273s.size()) {
                        z17 = false;
                        break;
                    }
                    com.p314xaae8f345.mm.ui.pg pgVar = ((com.p314xaae8f345.mm.ui.og) rgVar.f291273s.get(i27)).f291009b;
                    if (pgVar != null && pgVar.f291041c == 20) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "has offline pay entry in menuDataMap");
                        break;
                    }
                    i27++;
                }
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PlusSubMenuHelper", "offline pay entry not in menuDataMap, manual add it");
                    jx3.f.INSTANCE.mo68478xbd3cda5f(34167, "1");
                    com.p314xaae8f345.mm.ui.pg f18 = com.p314xaae8f345.mm.ui.rg.f(20);
                    com.p314xaae8f345.mm.ui.og ogVar2 = new com.p314xaae8f345.mm.ui.og(f18);
                    if (f18 != null) {
                        android.util.SparseArray sparseArray3 = rgVar.f291273s;
                        sparseArray3.put(sparseArray3.size(), ogVar2);
                    }
                }
            }
        }
        try {
            if (((java.lang.Boolean) c01.d9.b().p().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SUBMENU_SHOW_TIT_BOOLEAN, java.lang.Boolean.FALSE)).booleanValue()) {
                while (i17 < rgVar.f291273s.size() && ((com.p314xaae8f345.mm.ui.og) rgVar.f291273s.get(i17)).f291009b.f291041c != 2147483646) {
                    i17++;
                }
                if (i17 == rgVar.f291273s.size()) {
                    com.p314xaae8f345.mm.ui.pg f19 = com.p314xaae8f345.mm.ui.rg.f(2147483646);
                    com.p314xaae8f345.mm.ui.og ogVar3 = new com.p314xaae8f345.mm.ui.og(f19);
                    if (f19 != null) {
                        android.util.SparseArray sparseArray4 = rgVar.f291273s;
                        sparseArray4.put(sparseArray4.size(), ogVar3);
                    }
                }
            }
        } catch (java.lang.Exception unused) {
        }
        com.p314xaae8f345.mm.ui.mg mgVar = rgVar.f291272r;
        if (mgVar != null) {
            mgVar.notifyDataSetChanged();
        }
        rgVar.d(com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.afe));
    }

    public final void p(java.lang.Boolean bool, java.lang.Boolean bool2) {
    }

    public final void q(int i17) {
        p012xc85e97e9.p016x746ad0e3.app.b bVar = this.f278277c;
        if (bVar != null) {
            long j17 = i17;
            if (this.V != j17) {
                if (i17 != 0) {
                    bVar.w(new android.graphics.drawable.ColorDrawable(i17));
                    android.view.View j18 = this.f278277c.j();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(j18, arrayList.toArray(), "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(j18, "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                } else {
                    bVar.w(null);
                    android.view.View j19 = this.f278277c.j();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(8);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(j19, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    j19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(j19, "com/tencent/mm/ui/HomeUI", "setActionBarColor", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                this.V = j17;
            }
        }
        android.view.View view = this.f278278d;
        if (view != null) {
            long j27 = i17;
            if (this.W != j27) {
                if (i17 != 0) {
                    view.setBackgroundColor(i17);
                } else {
                    view.setBackground(null);
                }
                this.W = j27;
            }
        }
    }

    public final void r() {
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = this.f278291q;
        if (activityC21401x6ce6f73f != null) {
            try {
                activityC21401x6ce6f73f.moveTaskToBack(true);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
            }
        }
        if (gm0.j1.a()) {
            gm0.j1.e().k(new java.lang.Runnable(this) { // from class: com.tencent.mm.ui.HomeUI.29
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17;
                    if (!gm0.j1.a() || (p17 = c01.d9.b().p()) == null) {
                        return;
                    }
                    p17.i(true);
                }
            }, 500L);
        }
        if (com.p314xaae8f345.mm.app.i5.f134989c == null) {
            com.p314xaae8f345.mm.app.i5.f134989c = new com.p314xaae8f345.mm.app.i5();
        }
        com.p314xaae8f345.mm.app.i5 i5Var = com.p314xaae8f345.mm.app.i5.f134989c;
        i5Var.f134990a = false;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = i5Var.f134991b;
        n3Var.mo50303x856b99f0(-1999);
        n3Var.mo50303x856b99f0(-2999);
        n3Var.mo50307xb9e94560(-1999, 3000L);
        n3Var.mo50307xb9e94560(-2999, 30000L);
    }

    public void t() {
        boolean z17 = this.f278291q.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).getBoolean("settings_landscape_mode", false);
        boolean Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this.f278291q)).Y6();
        if (!z17 || Y6) {
            com.p314xaae8f345.mm.ui.ee.c(0);
            this.f278291q.setRequestedOrientation(1);
        } else {
            com.p314xaae8f345.mm.ui.ee.c(1);
            this.f278291q.setRequestedOrientation(-1);
        }
    }

    public final void u(boolean z17) {
        if (this.f278285k == null || this.f278299y == null || this.f278298x == null) {
            return;
        }
        if (!gm0.j1.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LauncherUI.HomeUI", "want update more menu new tips, but mmcore not ready");
            return;
        }
        this.f278285k.f291276v.a(z17);
        com.p314xaae8f345.mm.ui.C21374x812c2fd3.PlusActionView plusActionView = this.f278298x;
        com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.l(c21374x812c2fd3.f278285k.f291276v.f290226a > 0, plusActionView)) {
            if (c21374x812c2fd3.f278285k.f291276v.f290226a > 0) {
                android.view.View view = c21374x812c2fd3.A;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                android.view.View view2 = c21374x812c2fd3.A;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/HomeUI$PlusActionView", "compatCallBack", "()Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.i.b(plusActionView, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT, c21374x812c2fd3.f278285k.f291276v.f290226a > 0);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a();
        am.a00 a00Var = c6200xc9d0535a.f136454g;
        a00Var.f87646a = 2;
        a00Var.f87648c = this.f278285k.f291276v.f290226a > 0;
        c6200xc9d0535a.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x002f, code lost:
    
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(r4.f278291q)).Y6() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v(int r5) {
        /*
            r4 = this;
            fp.m.e()
            com.tencent.mm.ui.LauncherUI r0 = com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54.m78443x9cf0d20b()
            if (r0 == 0) goto L3e
            com.tencent.mm.ui.MainTabUI r1 = r0.f7()
            if (r1 == 0) goto L3e
            com.tencent.mm.ui.MainTabUI r0 = r0.f7()
            boolean r0 = r0.j()
            if (r0 != 0) goto L31
            java.lang.Class<ia0.n> r0 = ia0.n.class
            i95.m r0 = i95.n0.c(r0)
            ia0.n r0 = (ia0.n) r0
            com.tencent.mm.ui.MMFragmentActivity r1 = r4.f278291q
            ia0.o r0 = (ia0.o) r0
            zk3.c r0 = r0.Ai(r1)
            com.tencent.mm.plugin.multitask.ui.uic.MultiTaskUIC r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) r0
            boolean r0 = r0.Y6()
            if (r0 == 0) goto L3e
        L31:
            com.tencent.mm.ui.MMFragmentActivity r5 = r4.f278291q
            android.content.res.Resources r5 = r5.getResources()
            r0 = 2131102543(0x7f060b4f, float:1.7817527E38)
            int r5 = r5.getColor(r0)
        L3e:
            int r0 = r4.R
            int r0 = r0 - r5
            int r0 = java.lang.Math.abs(r0)
            r1 = 50000(0xc350, float:7.0065E-41)
            if (r0 < r1) goto L65
            com.tencent.mm.ui.MMFragmentActivity r0 = r4.f278291q     // Catch: java.lang.NullPointerException -> L54
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.NullPointerException -> L54
            r0.setStatusBarColor(r5)     // Catch: java.lang.NullPointerException -> L54
            goto L65
        L54:
            r0 = move-exception
            java.lang.Integer r1 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r2 = "MicroMsg.LauncherUI.HomeUI"
            java.lang.String r3 = "updateStatusBar %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r0, r3, r1)
        L65:
            r4.R = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.C21374x812c2fd3.v(int):void");
    }

    public final void w(boolean z17) {
        android.view.MenuItem menuItem;
        android.view.MenuItem menuItem2;
        if (this.f278286l) {
            com.p314xaae8f345.mm.ui.C21410x67d80e90 c21410x67d80e90 = this.f278294t;
            int i17 = c21410x67d80e90.f278458e;
            java.lang.String l17 = l(com.p314xaae8f345.mm.R.C30867xcad56011.f572028wp);
            if (i17 == 0) {
                if (c21410x67d80e90.i() > 0) {
                    if (!this.f278297w) {
                        l17 = ((java.lang.Object) l17) + " ";
                    }
                    l17 = ((java.lang.Object) l17) + "(" + c21410x67d80e90.i() + ")";
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a c6200xc9d0535a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6200xc9d0535a();
                am.a00 a00Var = c6200xc9d0535a.f136454g;
                a00Var.f87646a = 1;
                a00Var.f87647b = l17.toString();
                c6200xc9d0535a.e();
            } else if (i17 == 1) {
                l17 = l(com.p314xaae8f345.mm.R.C30867xcad56011.gpx);
            } else if (i17 == 2) {
                l17 = l(com.p314xaae8f345.mm.R.C30867xcad56011.gpv);
            } else if (i17 == 3) {
                l17 = l(com.p314xaae8f345.mm.R.C30867xcad56011.gqv);
            }
            if (i17 == 3) {
                int color = this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
                v(color);
                boolean z18 = (!bi4.v1.g() ? false : ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).aj(en1.a.a())) || com.p314xaae8f345.mm.ui.bk.C();
                android.view.View decorView = this.f278291q.getWindow().getDecorView();
                int systemUiVisibility = decorView.getSystemUiVisibility();
                int i18 = z18 ? systemUiVisibility & (-8193) : systemUiVisibility | 8192;
                if (systemUiVisibility != i18) {
                    decorView.setSystemUiVisibility(i18);
                }
                q(color);
                this.H = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI.HomeUI", "updateSettingTitle");
            } else {
                int color2 = this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07);
                v(color2);
                boolean z19 = this.f278281g;
                android.view.View decorView2 = this.f278291q.getWindow().getDecorView();
                int systemUiVisibility2 = decorView2.getSystemUiVisibility();
                int i19 = z19 ? systemUiVisibility2 & (-8193) : systemUiVisibility2 | 8192;
                if (systemUiVisibility2 != i19) {
                    decorView2.setSystemUiVisibility(i19);
                }
                q(color2);
                this.H = true;
                if ((this.f278287m == 2 && this.f278288n == 2) && (menuItem2 = this.F) != null && !menuItem2.isVisible()) {
                    this.F.setVisible(true);
                    h();
                }
                if ((this.f278287m == 2 && this.f278288n == 2) && (menuItem = this.G) != null && !menuItem.isVisible()) {
                    this.G.setVisible(true);
                    h();
                }
            }
            this.f278277c.G(0.0f);
            this.f278277c.p();
            this.f278279e = (android.widget.TextView) this.f278277c.j().findViewById(android.R.id.text1);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f278277c.j().findViewById(com.p314xaae8f345.mm.R.id.h0y);
            this.f278280f = c22699x3dcdb352;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setVisibility(8);
            }
            android.widget.TextView textView = this.f278279e;
            if (textView != null) {
                textView.setText(l17);
                if (z17) {
                    la5.c cVar = la5.b.f399133a;
                    l17.getClass();
                    cVar.getClass();
                }
                if (i17 == 0) {
                    ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yz5.a() { // from class: com.tencent.mm.ui.HomeUI$$c
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                            c21374x812c2fd3.getClass();
                            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).pj(c21374x812c2fd3.f278279e, en1.a.a(), bi4.c.PLANET, bi4.d.OUTLINED);
                            return null;
                        }
                    });
                } else {
                    ((zh4.k) i95.n0.c(zh4.k.class)).wi(new yz5.a() { // from class: com.tencent.mm.ui.HomeUI$$d
                        @Override // yz5.a
                        /* renamed from: invoke */
                        public final java.lang.Object mo152xb9724478() {
                            java.lang.Boolean bool = com.p314xaae8f345.mm.ui.C21374x812c2fd3.f278271a0;
                            com.p314xaae8f345.mm.ui.C21374x812c2fd3 c21374x812c2fd3 = com.p314xaae8f345.mm.ui.C21374x812c2fd3.this;
                            c21374x812c2fd3.getClass();
                            xe0.l0 l0Var = (xe0.l0) i95.n0.c(xe0.l0.class);
                            android.widget.TextView textView2 = c21374x812c2fd3.f278279e;
                            java.lang.String a17 = en1.a.a();
                            ((we0.j1) l0Var).getClass();
                            if (textView2 == null) {
                                return null;
                            }
                            if (a17 == null || r26.n0.N(a17)) {
                                return null;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusFeatureService", "clearTextStatus: " + a17);
                            ej4.c0.f334868a.a(a17, textView2);
                            return null;
                        }
                    });
                }
                boolean mo168058x74219ae7 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = this.f278280f;
                if (c22699x3dcdb3522 != null && mo168058x74219ae7 && i17 == 0) {
                    c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f80339xd9eb969c);
                    this.f278280f.setVisibility(0);
                }
                boolean z27 = j65.e.b() && j65.e.g() && !j65.e.h();
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3523 = this.f278280f;
                if (c22699x3dcdb3523 != null && !mo168058x74219ae7 && z27 && i17 == 0) {
                    c22699x3dcdb3523.setImageResource(com.p314xaae8f345.mm.R.raw.f80350xb902fbc6);
                    this.f278280f.setVisibility(0);
                }
                if (this.f278287m == 3 && this.f278288n == 3) {
                    this.f278279e.setVisibility(8);
                } else {
                    this.f278279e.setVisibility(0);
                }
                if (com.p314xaae8f345.mm.ui.f.a()) {
                    com.p314xaae8f345.mm.ui.f.b(this.f278279e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
                    android.view.View findViewById = this.f278277c.j().findViewById(com.p314xaae8f345.mm.R.id.o3d);
                    if (findViewById instanceof android.widget.TextView) {
                        com.p314xaae8f345.mm.ui.f.b((android.widget.TextView) findViewById, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
                    }
                } else {
                    float f17 = i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561092b);
                    if (this.f278279e.getTextSize() != f17) {
                        this.f278279e.setTextSize(0, f17);
                    }
                }
                int color3 = this.f278291q.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.by);
                if (this.f278281g && this.f278279e.getCurrentTextColor() != color3) {
                    this.f278279e.setTextColor(color3);
                }
                com.p314xaae8f345.mm.ui.bk.r0(this.f278279e.getPaint(), 0.8f);
            }
            i(true);
        }
    }

    /* renamed from: com.tencent.mm.ui.HomeUI$FitSystemWindowLayoutView */
    /* loaded from: classes11.dex */
    public static class FitSystemWindowLayoutView extends android.widget.FrameLayout {

        /* renamed from: d, reason: collision with root package name */
        public int f278346d;

        /* renamed from: e, reason: collision with root package name */
        public final android.graphics.Rect f278347e;

        /* renamed from: f, reason: collision with root package name */
        public android.view.ViewGroup f278348f;

        public FitSystemWindowLayoutView(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f278347e = new android.graphics.Rect();
            this.f278348f = null;
        }

        @Override // android.view.View
        public boolean fitSystemWindows(android.graphics.Rect rect) {
            java.lang.Object obj;
            boolean fitSystemWindows;
            java.lang.Object[] objArr = new java.lang.Object[4];
            boolean z17 = false;
            objArr[0] = rect.toString();
            objArr[1] = java.lang.Integer.valueOf(this.f278346d);
            objArr[2] = java.lang.Integer.valueOf(hashCode());
            if (rect.height() == 0) {
                boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                obj = new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3();
            } else {
                obj = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2;
            }
            objArr[3] = obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "fitSystemWindows beg %s, cacheInsetsTop:%d, hashCode:%d stack:%s", objArr);
            int i17 = rect.top;
            if (i17 > 0) {
                this.f278346d = i17;
            }
            android.view.ViewGroup viewGroup = this.f278348f;
            if (viewGroup != null && (viewGroup.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.f278348f.getLayoutParams();
                int i18 = marginLayoutParams.bottomMargin;
                int i19 = marginLayoutParams.rightMargin;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "try to setFitSystemWindowsBottomRightPadding: %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f567019u90);
                if (viewGroup2 == null) {
                    int i27 = 0;
                    while (true) {
                        if (i27 >= getChildCount()) {
                            break;
                        }
                        android.view.View childAt = getChildAt(i27);
                        if (childAt instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) {
                            com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = (com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) childAt;
                            if (java.lang.Float.compare(i18, i65.a.b(c22559x35245a10.getContext(), 48) * 2.0f) > 0 || i18 < 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TestTimeForChatting", "ERROR bottom padding %d", java.lang.Integer.valueOf(i18));
                                c22559x35245a10.f291796f = 0;
                            } else {
                                c22559x35245a10.f291796f = i18;
                            }
                            if (java.lang.Float.compare(i19, i65.a.b(c22559x35245a10.getContext(), 48) * 2.0f) > 0 || i19 < 0) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TestTimeForChatting", "ERROR right padding %d", java.lang.Integer.valueOf(i18));
                                c22559x35245a10.f291797g = 0;
                            } else {
                                c22559x35245a10.f291797g = i19;
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "setFitSystemWindowsUseActionBarContainer: %d %d OK", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        } else {
                            i27++;
                        }
                    }
                } else {
                    int i28 = 0;
                    while (true) {
                        if (i28 >= viewGroup2.getChildCount()) {
                            break;
                        }
                        android.view.View childAt2 = viewGroup2.getChildAt(i28);
                        if (childAt2 instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19679x7ac6cb44 c19679x7ac6cb44 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19679x7ac6cb44) childAt2.findViewById(com.p314xaae8f345.mm.R.id.bkb);
                            if (c19679x7ac6cb44 != null) {
                                if (java.lang.Float.compare(i18, i65.a.b(c19679x7ac6cb44.getContext(), 48) * 2.0f) > 0 || i18 < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUILayout", "ERROR bottom padding %d", java.lang.Integer.valueOf(i18));
                                    c19679x7ac6cb44.f271670n = 0;
                                } else {
                                    c19679x7ac6cb44.f271670n = i18;
                                }
                                if (java.lang.Float.compare(i19, i65.a.b(c19679x7ac6cb44.getContext(), 48) * 2.0f) > 0 || i19 < 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingUILayout", "ERROR right padding %d", java.lang.Integer.valueOf(i18));
                                    c19679x7ac6cb44.f271671o = 0;
                                } else {
                                    c19679x7ac6cb44.f271671o = i19;
                                }
                            }
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "[chattingFragmentView]setFitSystemWindowsUseActionBarContainer: %d %d OK", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        } else {
                            i28++;
                        }
                    }
                }
                com.p314xaae8f345.mm.ui.bk.f279511a.set(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
            }
            android.graphics.Rect rect2 = this.f278347e;
            rect2.set(rect);
            if (fp.h.c(14)) {
                android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.f567019u90);
                if (viewGroup3 == null) {
                    for (int i29 = 0; i29 < getChildCount(); i29++) {
                        android.view.View childAt3 = getChildAt(i29);
                        if (childAt3 instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) {
                            childAt3.setFitsSystemWindows(true);
                            fitSystemWindows = ((com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) childAt3).fitSystemWindows(rect);
                            childAt3.setFitsSystemWindows(false);
                            z17 = fitSystemWindows;
                            break;
                        }
                    }
                } else {
                    int i37 = 0;
                    while (true) {
                        if (i37 >= viewGroup3.getChildCount()) {
                            break;
                        }
                        android.view.View childAt4 = viewGroup3.getChildAt(i37);
                        if (childAt4 instanceof com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10) {
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19679x7ac6cb44 c19679x7ac6cb442 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19679x7ac6cb44) childAt4.findViewById(com.p314xaae8f345.mm.R.id.bkb);
                            if (c19679x7ac6cb442 != null) {
                                c19679x7ac6cb442.setFitsSystemWindows(true);
                                fitSystemWindows = c19679x7ac6cb442.fitSystemWindows(rect);
                                c19679x7ac6cb442.setFitsSystemWindows(false);
                            }
                        } else {
                            i37++;
                        }
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LauncherUI", "ashu::fitSystemWindows child ret %B, ApiLevel %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(android.os.Build.VERSION.SDK_INT));
            return super.fitSystemWindows(rect2);
        }

        /* renamed from: getCacheInsetsTop */
        public int m78430xdf3aaa13() {
            return this.f278346d;
        }

        @Override // android.widget.FrameLayout, android.view.View
        public void onMeasure(int i17, int i18) {
            try {
                super.onMeasure(i17, i18);
            } catch (java.lang.ClassCastException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LauncherUI.HomeUI", e17, "", new java.lang.Object[0]);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "my layout params %s %s", getLayoutParams(), getLayoutParams().getClass());
                int childCount = getChildCount();
                for (int i19 = 0; i19 < childCount; i19++) {
                    android.view.View childAt = getChildAt(i19);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", java.lang.Integer.valueOf(i19), childAt, childAt.getLayoutParams(), childAt.getLayoutParams().getClass());
                }
                for (int i27 = 0; i27 < childCount; i27++) {
                    android.view.View childAt2 = getChildAt(i27);
                    if ((childAt2 instanceof android.widget.ImageView) && childAt2.getId() == com.p314xaae8f345.mm.R.id.l3_ && childAt2.getLayoutParams() != null && (childAt2.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams) && !(childAt2.getLayoutParams() instanceof android.widget.FrameLayout.LayoutParams)) {
                        childAt2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(childAt2.getLayoutParams()));
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LauncherUI.HomeUI", "my child %s %s layout params %s %s", java.lang.Integer.valueOf(i27), childAt2, childAt2.getLayoutParams(), childAt2.getLayoutParams().getClass());
                }
                super.onMeasure(i17, i18);
            }
        }

        /* renamed from: setActionBarContainer */
        public void m78431x6229eb06(android.view.ViewGroup viewGroup) {
            this.f278348f = viewGroup;
            com.p314xaae8f345.mm.ui.C21374x812c2fd3.f((android.app.Activity) getContext());
        }

        public FitSystemWindowLayoutView(android.content.Context context) {
            super(context);
            this.f278347e = new android.graphics.Rect();
            this.f278348f = null;
        }
    }
}
