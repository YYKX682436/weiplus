package com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89;

/* loaded from: classes12.dex */
public class j2 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f269754m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f269755n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f269756o;

    /* renamed from: p, reason: collision with root package name */
    public final ih0.s f269757p;

    public j2(android.content.Context context) {
        super(context);
        this.f269754m = null;
        this.f269757p = new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.h2(this);
    }

    @Override // s35.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WNNoteBanner", "destroy: ");
        ih0.r rVar = (ih0.r) i95.n0.c(ih0.r.class);
        ih0.s listener = this.f269757p;
        dz4.s1 s1Var = (dz4.s1) rVar;
        s1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        s1Var.f326931f.remove(listener);
    }

    @Override // s35.b
    public int b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.d_c;
    }

    @Override // s35.b
    public int c() {
        return 0;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WNNoteBanner", "onInitializeView: ");
        ih0.r rVar = (ih0.r) i95.n0.c(ih0.r.class);
        ih0.s listener = this.f269757p;
        dz4.s1 s1Var = (dz4.s1) rVar;
        s1Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        s1Var.f326931f.add(listener);
        this.f269754m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.pl8);
        this.f269756o = view.findViewById(com.p314xaae8f345.mm.R.id.pl9);
        this.f269755n = view.findViewById(com.p314xaae8f345.mm.R.id.f564884af3);
        this.f269754m.setTextSize(0, i65.a.h(r0.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
        view.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.i2(this));
    }

    @Override // s35.b
    public boolean i() {
        try {
            if (mz4.b0.c().a() != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.mm.p2621x8fb0427b.n3 p17 = c01.d9.b().p();
                com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WENOTE_KEEP_TOP_DATA_LAST_REPORT_TIME_LONG_SYNC;
                if (currentTimeMillis - ((java.lang.Long) p17.m(u3Var, 0L)).longValue() > 86400000) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(18728, 1);
                    c01.d9.b().p().x(u3Var, java.lang.Long.valueOf(currentTimeMillis));
                }
            }
        } catch (java.lang.Throwable unused) {
        }
        iz4.r a17 = mz4.b0.c().a();
        boolean z17 = (a17 != null && a17.f377672d && a17.f377674f > 0 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(a17.f377678m)) || !(a17 == null || a17.f377672d || hz4.l.a(a17.f377673e) == null);
        if (!z17 && a17 != null) {
            mz4.b0.c().d(null);
        }
        if (z17) {
            f();
        } else if (!this.f484377i) {
            return false;
        }
        boolean z18 = this.f484372d;
        if (z18 && this.f484373e) {
            this.f269756o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563717b73);
            this.f269754m.setBackground(null);
        } else if (z18) {
            this.f269755n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f269756o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.c7z);
            this.f269754m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        } else if (this.f484373e) {
            this.f269755n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f269756o.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
            this.f269754m.setBackground(null);
        } else {
            this.f269755n.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aj6);
            this.f269756o.setBackground(null);
            this.f269754m.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.bfj);
        }
        if (!z17) {
            k(8);
            return false;
        }
        java.lang.String str = a17.f377677i;
        android.widget.TextView textView = this.f269754m;
        if (textView != null) {
            textView.setText(str);
        }
        k(0);
        return true;
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f484377i) {
            if (i17 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("WNNoteBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.widget.LinearLayout linearLayout = this.f484376h;
        if (linearLayout != null) {
            android.view.View findViewById = linearLayout.findViewById(com.p314xaae8f345.mm.R.id.pl9);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/wenote/ui/nativenote/WNNoteBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
