package tz4;

/* loaded from: classes12.dex */
public class i extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.ref.WeakReference f504879f;

    /* renamed from: g, reason: collision with root package name */
    public tz4.h f504880g;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f504877d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final tz4.u[] f504878e = {tz4.u.Bold, tz4.u.Highlight, tz4.u.Paragraph_OL, tz4.u.Paragraph_UL, tz4.u.Paragraph_Todo, tz4.u.Paragraph_Separator, tz4.u.CurrentTime};

    /* renamed from: h, reason: collision with root package name */
    public int f504881h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f504882i = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f504883m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f504884n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f504885o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f504886p = -1;

    public i(android.content.Context context, tz4.k kVar) {
        this.f504879f = new java.lang.ref.WeakReference(kVar);
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "WNToolBarAdapter created, layout calculation will be deferred to first bind", null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f504878e.length;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        boolean z17;
        tz4.j jVar = (tz4.j) k3Var;
        tz4.u[] uVarArr = this.f504878e;
        if (i17 >= uVarArr.length) {
            return;
        }
        if (!this.f504885o || (((z17 = this.f504883m) && this.f504882i <= 0) || (!z17 && this.f504881h <= 0))) {
            x(y(jVar.f3639x46306858.getContext()));
        }
        java.util.HashMap hashMap = this.f504877d;
        hashMap.put(uVarArr[i17], jVar.f504887d);
        int ordinal = uVarArr[i17].ordinal();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f c22698xdfbd289f = jVar.f504887d;
        switch (ordinal) {
            case 0:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80220x55ebe6ad);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_t));
                c22698xdfbd289f.setOnClickListener(new tz4.a(this));
                break;
            case 1:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80225xc71ab702);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyp));
                c22698xdfbd289f.setOnClickListener(new tz4.b(this));
                break;
            case 2:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80224x1bfb5019);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_u));
                c22698xdfbd289f.setOnClickListener(new tz4.c(this));
                break;
            case 3:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80223xc715ece8);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_x));
                c22698xdfbd289f.setOnClickListener(new tz4.d(this));
                break;
            case 4:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80221x225fd3dd);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_v));
                c22698xdfbd289f.setOnClickListener(new tz4.e(this));
                break;
            case 5:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80227xc71ada1b);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.l_w));
                c22698xdfbd289f.setOnClickListener(new tz4.f(this));
                break;
            case 6:
                c22698xdfbd289f.setImageResource(com.p314xaae8f345.mm.R.raw.f80226xc71ac4a2);
                c22698xdfbd289f.setContentDescription(c22698xdfbd289f.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.lyo));
                c22698xdfbd289f.setOnClickListener(new tz4.g(this));
                break;
        }
        android.view.ViewGroup.LayoutParams layoutParams = c22698xdfbd289f.getLayoutParams();
        if (this.f504883m) {
            if (layoutParams != null) {
                layoutParams.width = this.f504882i;
                c22698xdfbd289f.setLayoutParams(layoutParams);
                int f17 = (this.f504882i - i65.a.f(c22698xdfbd289f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz)) / 2;
                int f18 = i65.a.f(c22698xdfbd289f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                c22698xdfbd289f.setPadding(f17, f18, f17, f18);
            }
            jVar.f3639x46306858.setPadding(0, 0, 0, 0);
        } else {
            if (layoutParams != null) {
                layoutParams.width = i65.a.f(c22698xdfbd289f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aip);
                c22698xdfbd289f.setLayoutParams(layoutParams);
                int f19 = i65.a.f(c22698xdfbd289f.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                c22698xdfbd289f.setPadding(f19, f19, f19, f19);
            }
            jVar.f3639x46306858.setPadding(uVarArr[i17] == tz4.u.Bold ? i65.a.f(jVar.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.aiq) : this.f504881h, 0, this.f504881h, 0);
        }
        if (hashMap.size() == uVarArr.length) {
            java.lang.ref.WeakReference weakReference = this.f504879f;
            if (weakReference.get() != null) {
                mz4.j0 j0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) ((tz4.k) weakReference.get())).f269680m;
                j0Var.n(j0Var.b());
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup viewGroup, int i17) {
        return new tz4.j(android.view.LayoutInflater.from(viewGroup.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djx, viewGroup, false));
    }

    public final boolean x(int i17) {
        if (i17 <= 0) {
            java.lang.Object[] objArr = {java.lang.Integer.valueOf(i17)};
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: invalid parentWidth=%d, skip calculation", objArr);
            return false;
        }
        if (this.f504885o && this.f504886p == i17) {
            int i19 = rl.b.f478676a;
            return true;
        }
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.Object[] objArr2 = {java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.f504886p)};
        int i27 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: START parentWidth=%d, lastWidth=%d", objArr2);
        this.f504881h = 0;
        this.f504882i = 0;
        this.f504883m = false;
        this.f504884n = false;
        int f17 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aip);
        int f18 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aiq);
        int f19 = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.aio);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: baseBtnWidth=%d, marginToLeft=%d, averageThreshold=%d", java.lang.Integer.valueOf(f17), java.lang.Integer.valueOf(f18), java.lang.Integer.valueOf(f19));
        tz4.u[] uVarArr = this.f504878e;
        float length = i17 / (uVarArr.length + 1);
        if (length < f19) {
            int i28 = f18 * 2;
            if (((uVarArr.length + 1) * f17) + i28 > i17) {
                this.f504884n = true;
                int i29 = (int) ((i17 - (f17 * 1.5d)) - i28);
                int i37 = i29 / f17;
                int i38 = i29 - (f17 * i37);
                if (i38 <= 0 || i37 <= 0) {
                    this.f504881h = 0;
                } else {
                    this.f504881h = (i38 / i37) / 2;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: SCROLLABLE mode, visibleBtnCount=%d, btnMarginLeft=%d", java.lang.Integer.valueOf(i37), java.lang.Integer.valueOf(this.f504881h));
            } else {
                int length2 = (((i17 - (f17 * (uVarArr.length + 1))) - i28) / uVarArr.length) / 2;
                this.f504881h = length2;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: FIXED mode, btnMarginLeft=%d", java.lang.Integer.valueOf(length2));
            }
        } else {
            this.f504883m = true;
            int i39 = (int) length;
            this.f504882i = i39;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: AVERAGE_WIDTH mode, btnAverageWidth=%d", java.lang.Integer.valueOf(i39));
        }
        this.f504885o = true;
        this.f504886p = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WNToolBarAdapter", "calculateLayoutParams: DONE useAverageWidth=%b, scrollable=%b", java.lang.Boolean.valueOf(this.f504883m), java.lang.Boolean.valueOf(this.f504884n));
        tz4.h hVar = this.f504880g;
        if (hVar != null) {
            final boolean z17 = this.f504883m;
            final int i47 = this.f504882i;
            final tz4.l lVar = ((tz4.C30262x31a3f5) hVar).f504900a;
            lVar.f504891d.post(new java.lang.Runnable() { // from class: tz4.l$$b
                @Override // java.lang.Runnable
                public final void run() {
                    tz4.i iVar;
                    tz4.i iVar2;
                    tz4.l lVar2 = tz4.l.this;
                    lVar2.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "calculateLayoutParams: callback triggered");
                    android.view.View view = lVar2.f504888a;
                    if (view == null || view.getContext() == null || lVar2.f504891d == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: footView or recyclerView is null");
                        return;
                    }
                    android.content.Context context2 = lVar2.f504888a.getContext();
                    android.view.View findViewById = lVar2.f504888a.findViewById(com.p314xaae8f345.mm.R.id.qow);
                    android.view.View findViewById2 = lVar2.f504888a.findViewById(com.p314xaae8f345.mm.R.id.qox);
                    int f27 = i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.aip);
                    if (z17) {
                        int i48 = i47;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: AVERAGE mode, btnAverageWidth=%d", java.lang.Integer.valueOf(i48));
                        android.view.ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = i48;
                            findViewById.setLayoutParams(layoutParams);
                            android.view.View findViewById3 = lVar2.f504888a.findViewById(com.p314xaae8f345.mm.R.id.qmd);
                            if (findViewById3 != null && (findViewById3.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                                int i49 = (i48 - f27) / 2;
                                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) findViewById3.getLayoutParams();
                                marginLayoutParams.setMarginStart(i49);
                                marginLayoutParams.setMarginEnd(i49);
                                findViewById3.setLayoutParams(marginLayoutParams);
                            }
                        }
                        android.view.ViewGroup.LayoutParams layoutParams2 = lVar2.f504891d.getLayoutParams();
                        if (layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).setMargins(0, 0, i48, 0);
                            lVar2.f504891d.setLayoutParams(layoutParams2);
                        }
                        if (findViewById2 != null) {
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                            arrayList.add(8);
                            java.util.Collections.reverse(arrayList);
                            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            findViewById2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                            yj0.a.f(findViewById2, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                            return;
                        }
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: DEFAULT mode, defaultBtnWidth=%d", java.lang.Integer.valueOf(f27));
                    int f28 = i65.a.f(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561175bh);
                    android.view.ViewGroup.LayoutParams layoutParams3 = findViewById.getLayoutParams();
                    if (layoutParams3 != null && (iVar2 = lVar2.f504890c) != null) {
                        if (iVar2.f504884n) {
                            int i57 = f27 + f28;
                            layoutParams3.width = i57;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: scrollable=true, wrapWidth=%d (btn=%d + line=%d)", java.lang.Integer.valueOf(i57), java.lang.Integer.valueOf(f27), java.lang.Integer.valueOf(f28));
                        } else {
                            layoutParams3.width = f27;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: scrollable=false, wrapWidth=%d", java.lang.Integer.valueOf(f27));
                        }
                        findViewById.setLayoutParams(layoutParams3);
                        android.view.View findViewById4 = lVar2.f504888a.findViewById(com.p314xaae8f345.mm.R.id.qmd);
                        if (findViewById4 != null && (findViewById4.getLayoutParams() instanceof android.view.ViewGroup.MarginLayoutParams)) {
                            android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) findViewById4.getLayoutParams();
                            marginLayoutParams2.setMarginStart(0);
                            marginLayoutParams2.setMarginEnd(0);
                            findViewById4.setLayoutParams(marginLayoutParams2);
                        }
                    }
                    android.view.ViewGroup.LayoutParams layoutParams4 = lVar2.f504891d.getLayoutParams();
                    if ((layoutParams4 instanceof android.view.ViewGroup.MarginLayoutParams) && layoutParams3 != null) {
                        ((android.view.ViewGroup.MarginLayoutParams) layoutParams4).setMargins(0, 0, layoutParams3.width, 0);
                        lVar2.f504891d.setLayoutParams(layoutParams4);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: RecyclerView rightMargin=%d", java.lang.Integer.valueOf(layoutParams3.width));
                    }
                    if (findViewById2 == null || (iVar = lVar2.f504890c) == null) {
                        return;
                    }
                    boolean z18 = iVar.f504884n;
                    int i58 = z18 ? 0 : 8;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(java.lang.Integer.valueOf(i58));
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(findViewById2, "com/tencent/mm/plugin/wenote/ui/nativenote/toolview/WNToolViewHolder", "updateExtendButtonLayout", "(ZI)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    if (z18) {
                        findViewById.requestLayout();
                        android.view.ViewGroup.LayoutParams layoutParams5 = findViewById2.getLayoutParams();
                        if (layoutParams5 != null) {
                            layoutParams5.width = f28;
                            layoutParams5.height = i65.a.h(context2, com.p314xaae8f345.mm.R.C30860x5b28f31.f561238d0);
                            findViewById2.setLayoutParams(layoutParams5);
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: separateLine width=%d, height=%d", java.lang.Integer.valueOf(layoutParams5.width), java.lang.Integer.valueOf(layoutParams5.height));
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WNToolViewHolder", "updateExtendButtonLayout: separateLine visibility=%b", java.lang.Boolean.valueOf(z18));
                }
            });
        }
        return true;
    }

    public final int y(android.content.Context context) {
        android.graphics.Point h17 = com.p314xaae8f345.mm.ui.bk.h(context);
        int i17 = context.getResources().getDisplayMetrics().widthPixels;
        int i18 = rl.b.f478676a;
        int i19 = h17.x;
        if (i19 <= h17.y) {
            return i19;
        }
        android.util.DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        return java.lang.Math.max(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }
}
