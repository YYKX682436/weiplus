package rr;

/* loaded from: classes13.dex */
public final class z implements com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f480690d;

    /* renamed from: e, reason: collision with root package name */
    public final rr.y f480691e;

    /* renamed from: f, reason: collision with root package name */
    public final int f480692f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f480693g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f480694h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f480695i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f480696m;

    public z(android.content.Context context, android.view.View rootView, rr.y callback, int i17, java.lang.String guideStr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(guideStr, "guideStr");
        this.f480690d = rootView;
        this.f480691e = callback;
        this.f480692f = i17;
        this.f480693g = guideStr;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.plm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f480694h = linearLayout;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.plo);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f480695i = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.pln);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f480696m = findViewById3;
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.p Di = rn3.i.Di();
        linearLayout.setOnClickListener(new rr.w(this, Di, context));
        Di.k(this);
        linearLayout.addOnAttachStateChangeListener(new rr.x(this, Di));
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

    public final int a() {
        int i17 = this.f480692f;
        if (i17 != 3) {
            return i17 != 6 ? 49 : 54;
        }
        return 47;
    }

    public final boolean b() {
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        android.util.Pair c17 = rn3.i.Di().c(new vn3.c(a()));
        return c17.first == com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r.MMNEWTIPS_SHOWTYPE_REDPOINT && c17.second != null;
    }

    public final void c(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "refresh %s", java.lang.Boolean.valueOf(z17));
        android.widget.LinearLayout linearLayout = this.f480694h;
        if (!z17) {
            if (linearLayout.getVisibility() == 0) {
                linearLayout.setVisibility(8);
                return;
            }
            return;
        }
        ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
        rn3.i.Di().n(a());
        linearLayout.setVisibility(0);
        this.f480695i.setText(this.f480693g);
        boolean b17 = b();
        lr.i1 i1Var = (lr.i1) this.f480691e;
        i1Var.getClass();
        jz5.g gVar = rr.c.f480657a;
        rr.a config = i1Var.f402062a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CustomEmojiWetypeHelper", "onShown");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6383x36aab795 c6383x36aab795 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6383x36aab795();
        c6383x36aab795.f137294d = 8L;
        c6383x36aab795.f137296f = b17 ? 1L : 0L;
        c6383x36aab795.f137295e = c6383x36aab795.b("tips", config.f480651a, true);
        c6383x36aab795.f137297g = b17 ? 2L : 0L;
        c6383x36aab795.k();
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        c17.x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_WETYPE_AD_SHOW_TIME_LONG_SYNC, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_WETYPE_AD_SHOW_COUNT_INT_SYNC;
        c17.x(u3Var, java.lang.Integer.valueOf(c17.r(u3Var, 0) + 1));
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_WETYPE_AD_FIRST_SHOW_TIME_LONG_SYNC;
        if (c17.t(u3Var2, -1L) == -1) {
            c17.x(u3Var2, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void c1(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public void e5(com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.r rVar, boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        int i17 = this.f480692f;
        return i17 != 3 ? i17 != 6 ? "fulltext_input_wxkeyboard" : "custom_emoji_wetype" : "attach_voiceinput_wxkeyboard";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f480690d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean o0(boolean z17) {
        return false;
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WetypeGuideHolder", "showRedPoint: " + z17);
        if (z17) {
            android.view.View view = this.f480696m;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return true;
        }
        android.view.View view2 = this.f480696m;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/emoji/util/WetypeGuideHolder", "showRedPoint", "(Z)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }
}
