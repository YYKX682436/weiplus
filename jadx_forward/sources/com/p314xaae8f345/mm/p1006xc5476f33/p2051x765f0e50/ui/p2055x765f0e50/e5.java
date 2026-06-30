package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes12.dex */
public class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f242510d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17401xed12d392 f242511e;

    public e5(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.C17401xed12d392 c17401xed12d392) {
        this.f242511e = c17401xed12d392;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f242510d;
        if (j17 > currentTimeMillis || currentTimeMillis - j17 > 300) {
            this.f242510d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f242510d = currentTimeMillis;
        android.content.Context context = this.f242511e.f279303d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f424562g;
        sb6.append(java.lang.String.format("[ver  ] %s %08X\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.b(context, i17, true), java.lang.Integer.valueOf(i17)));
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.z.a());
        sb6.append(java.lang.String.format("[storage] %s|%s\n", lp0.b.e0(), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2596x853f044d.h.a(lp0.b.c()) ? 1 : 0)));
        sb6.append(java.lang.String.format("[cid  ] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b)));
        sb6.append(java.lang.String.format("[target.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion)));
        sb6.append(java.lang.String.format("[s.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0))));
        sb6.append(java.lang.String.format("[t.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(6))));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1));
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).getClass();
        com.p314xaae8f345.p3210x3857dc.f1 f1Var = com.p314xaae8f345.p3210x3857dc.C27816xac2547f9.f301722m;
        sb6.append(java.lang.String.format("[l.ver] %d %s\n", valueOf, com.p314xaae8f345.p3210x3857dc.f1.WV_KIND_PINUS));
        sb6.append(java.lang.String.format("[w.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3))));
        sb6.append(java.lang.String.format("[box.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(2))));
        sb6.append(java.lang.String.format("[pardus.ver] %d\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5))));
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        sb6.append(java.lang.String.format("[ts.ver] %d\n", java.lang.Long.valueOf(bk4.i.a().o())));
        sb6.append(java.lang.String.format("[r.ver] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274658u));
        this.f242511e.getClass();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.p314xaae8f345.mm.p1006xc5476f33.p1389x2108cb94.i0.f181284a;
        sb6.append(java.lang.String.format("[exp.ver] %s\n", "disabled"));
        sb6.append(java.lang.String.format("[app.usrid] %s\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.b())));
        sb6.append(java.lang.String.format("[app.usrinfo] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.c(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        sb6.append(java.lang.String.format("[app.profile] %s\n", com.p314xaae8f345.mm.sdk.p2603x2137b148.c7.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        sb6.append(java.lang.String.format("[app.source] %s\n", pj.e.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)));
        sb6.append(java.lang.String.format("[application] %s\n", this.f242511e.f279303d.getPackageName()));
        sb6.append(java.lang.String.format("[brand] %d %s\n", java.lang.Integer.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.n9.f274417a), com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a));
        sb6.append(java.lang.String.format("[xweb] %s %s %s\n", java.lang.Integer.valueOf(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19), java.lang.Integer.valueOf(com.p314xaae8f345.p3210x3857dc.a3.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), java.lang.Integer.valueOf(com.p314xaae8f345.p3210x3857dc.a3.i().ordinal())));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.s9.f274508c) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) sh.c.n(view.getContext())).iterator();
            while (it.hasNext()) {
                java.lang.String g17 = ri.i.g((java.lang.String) ((m3.d) it.next()).f404626b);
                if (g17.length() > 10) {
                    g17 = g17.substring(g17.length() - 10);
                }
                arrayList2.add(g17);
            }
            sb6.append(java.lang.String.format("[proc] %s\n", u46.l.h(arrayList2, " ")));
        }
        java.lang.String Bi = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Bi();
        if (android.text.TextUtils.isEmpty(Bi)) {
            Bi = "";
        }
        sb6.append(Bi);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(this.f242511e.f279303d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
        final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f394148d;
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.setting.ui.setting.e5$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                long j18 = currentTimeMillis2;
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f5 f5Var = com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.f5.f242557a;
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SettingsAboutMMHeaderReporter", "do report: time = " + j18);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
                    g0Var.d(28255, java.lang.Long.valueOf(j18), com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274642e, java.lang.Integer.valueOf(com.p314xaae8f345.p3222x9cba06de.C27869xce2ad330.f61212x34eb0d19), java.lang.Integer.valueOf(org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.d()), ri.l0.b(f5Var.a(com.p314xaae8f345.p552xbf8d97c1.p590x36f002.C4720x9bbc2403.f134628p.a())), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(0)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(6)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(1)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(3)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(2)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.l2.a(5)), java.lang.Long.valueOf(bk4.i.a().o()));
                } catch (java.lang.Throwable th6) {
                    oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th6, "", new java.lang.Object[0]);
                }
                return f5Var;
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.u(callable, 0L, "SettingsAboutHeader");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
