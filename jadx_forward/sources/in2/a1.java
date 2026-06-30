package in2;

/* loaded from: classes10.dex */
public final class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f374327d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f374328e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f374329f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f374330g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f374331h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.p f374332i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.q f374333m;

    /* renamed from: n, reason: collision with root package name */
    public yz5.p f374334n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.l f374335o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f374336p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f374337q;

    /* renamed from: r, reason: collision with root package name */
    public int f374338r;

    /* renamed from: s, reason: collision with root package name */
    public final int f374339s;

    public a1(gk2.e liveData, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f374327d = liveData;
        this.f374328e = context;
        this.f374329f = "FinderLiveAnchorSingSongListAdapter";
        this.f374330g = "finder_live_sing_song_play.pag";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f374331h = arrayList;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f374336p = true;
        this.f374337q = "-";
        this.f374339s = 8;
        zl2.q4.f555466a.R("FinderLiveAnchorSingSongListAdapter");
        arrayList.addAll(((mm2.m6) liveData.a(mm2.m6.class)).f410774f.f315586b);
    }

    public final void B(boolean z17) {
        java.util.ArrayList<dk2.yg> arrayList = this.f374331h;
        if (z17) {
            java.util.LinkedList linkedList = ((mm2.m6) this.f374327d.a(mm2.m6.class)).f410780o;
            for (dk2.yg ygVar : arrayList) {
                if (!linkedList.contains(ygVar.f315926a)) {
                    ygVar.f315930e = true;
                }
            }
        } else {
            int i17 = 0;
            for (java.lang.Object obj : arrayList) {
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                dk2.yg ygVar2 = (dk2.yg) obj;
                ygVar2.f315930e = false;
                ygVar2.f315927b = 0L;
                ygVar2.f315933h = "";
                if (ygVar2.f315928c == 4) {
                    z(i17, ygVar2);
                }
                i17 = i18;
            }
        }
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f374331h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((dk2.yg) this.f374331h.get(i17)).f315928c;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        in2.w0 holder = (in2.w0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        y(holder, i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.View.inflate(parent.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ana, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new in2.w0(this, inflate);
    }

    public final void x(in2.w0 holder, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        android.content.Context context = this.f374328e;
        android.widget.TextView textView = holder.f374456i;
        if (z17) {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.p1m));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            textView.setBackground(textView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f563227a06));
        } else {
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ef_));
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
            textView.setBackground(textView.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.a07));
        }
    }

    public final void y(in2.w0 w0Var, int i17) {
        java.lang.CharSequence charSequence;
        int i18;
        java.util.ArrayList arrayList = this.f374331h;
        java.lang.Object obj = arrayList.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        dk2.yg ygVar = (dk2.yg) obj;
        dk2.yg ygVar2 = (dk2.yg) arrayList.get(i17);
        if (ygVar2.f315930e && ygVar2.a()) {
            w0Var.f374453f.setAlpha(1.0f);
            w0Var.f374454g.setAlpha(1.0f);
            w0Var.f374455h.setAlpha(1.0f);
            w0Var.f374459o.setAlpha(1.0f);
        } else {
            w0Var.f374453f.setAlpha(0.3f);
            w0Var.f374454g.setAlpha(0.3f);
            w0Var.f374455h.setAlpha(0.3f);
            w0Var.f374459o.setAlpha(0.3f);
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        java.lang.String str = ygVar.f315926a;
        android.widget.TextView textView = w0Var.f374454g;
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
        long j17 = ygVar.f315927b;
        java.lang.String str2 = this.f374337q;
        android.widget.TextView textView2 = w0Var.f374459o;
        if (j17 > 0) {
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String valueOf = java.lang.String.valueOf(ygVar.f315927b);
            float textSize2 = textView2.getTextSize();
            ((ke0.e) xVar2).getClass();
            charSequence = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, valueOf, textSize2);
        } else {
            charSequence = str2;
        }
        textView2.setText(charSequence);
        java.lang.String str3 = ygVar.f315933h;
        boolean z17 = str3 == null || str3.length() == 0;
        android.widget.TextView textView3 = w0Var.f374455h;
        if (z17) {
            textView3.setVisibility(8);
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.lang.String str4 = ygVar.f315933h;
            float textSize3 = textView3.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context3, str4, textSize3));
            textView3.setVisibility(0);
        }
        boolean a86 = ((mm2.c1) this.f374327d.a(mm2.c1.class)).a8();
        android.widget.FrameLayout frameLayout = w0Var.f374451d;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = w0Var.f374458n;
        android.widget.TextView textView4 = w0Var.f374453f;
        if (a86) {
            frameLayout.setVisibility(0);
            android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a787.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i65.a.b(w0Var.f3639x46306858.getContext(), 8);
            android.widget.TextView textView5 = w0Var.f374456i;
            if (textView5.getVisibility() == 8) {
                textView2.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = w0Var.f374452e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22789xd23e9a9b, "<get-singSongIcon>(...)");
            int i19 = ygVar.f315928c;
            boolean z18 = this.f374336p;
            if (i19 != 4) {
                if (z18) {
                    c22789xd23e9a9b.n();
                }
                c22789xd23e9a9b.setVisibility(8);
            } else if (z18) {
                c22789xd23e9a9b.setVisibility(0);
                if (!c22789xd23e9a9b.f()) {
                    c22789xd23e9a9b.g();
                }
            } else {
                c22789xd23e9a9b.setVisibility(8);
            }
            textView4.setText(java.lang.String.valueOf((i17 + 1) - this.f374338r));
            if (((dk2.yg) arrayList.get(i17)).f315928c == 4) {
                x(w0Var, false);
            } else {
                x(w0Var, true);
            }
            if (ygVar.f315928c == 4) {
                c22789xd23e9a9b.setVisibility(0);
                textView4.setVisibility(8);
                textView2.setVisibility(8);
                textView5.setVisibility(0);
                textView.setTextColor(w0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
                textView3.setTextColor(w0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77748x91fa628d));
            } else {
                c22789xd23e9a9b.setVisibility(8);
                textView4.setVisibility(0);
                textView2.setVisibility(0);
                textView5.setVisibility(8);
                textView.setTextColor(w0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                textView3.setTextColor(w0Var.f3639x46306858.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560755ta));
            }
            if (ygVar.f315931f) {
                textView4.setText(str2);
            }
            zl2.r4 r4Var = zl2.r4.f555483a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView5, "<get-singSongClickBtn>(...)");
            zl2.r4.c3(r4Var, textView5, 0, 0, 6, null);
            textView5.setOnClickListener(new in2.x0(ygVar, this, i17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView5, "<get-singSongClickBtn>(...)");
            com.p314xaae8f345.mm.ui.fk.a(textView5);
            w0Var.f3639x46306858.setOnClickListener(new in2.y0(this, ygVar, i17));
        } else {
            android.view.ViewGroup.LayoutParams layoutParams2 = c1073x7e08a787.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = i65.a.b(w0Var.f3639x46306858.getContext(), 16);
            frameLayout.setVisibility(8);
            textView3.setVisibility(8);
            textView2.setVisibility(8);
        }
        android.widget.TextView textView6 = w0Var.f374460p;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView6, "<get-auditStatus>(...)");
        in2.b1.a(textView6, ygVar);
        if (ygVar.a()) {
            i18 = 8;
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView2, "<get-singSongHeat>(...)");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            i18 = 8;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView4, "<get-singSongRank>(...)");
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(textView4, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(textView4, "com/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter", "onBindSingSongHolder", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/legacypanel/FinderLiveAnchorSingSongListAdapter$SingSongViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int i27 = this.f374339s;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = w0Var.f374457m;
        if (i17 < i27 || i17 != arrayList.size() - 1) {
            c1073x7e08a7872.setVisibility(i18);
        } else {
            c1073x7e08a7872.setVisibility(0);
        }
        w0Var.f3639x46306858.setOnLongClickListener(new in2.z0(this, i17, ygVar));
    }

    public final void z(int i17, dk2.yg songItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songItem, "songItem");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f374329f, ((dk2.yg) this.f374331h.get(i17)).f315926a + ", MUSIC_DEFAULT}");
        yz5.p pVar = this.f374334n;
        if (pVar != null) {
            pVar.mo149xb9724478(java.lang.Integer.valueOf(i17), songItem);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo8157xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17, java.util.List payloads) {
        in2.w0 holder = (in2.w0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        if (payloads.isEmpty()) {
            y(holder, i17);
            return;
        }
        if (((dk2.yg) this.f374331h.get(i17)).f315928c != 4) {
            for (java.lang.Object obj : payloads) {
                if (obj instanceof java.lang.Boolean) {
                    java.lang.Boolean bool = (java.lang.Boolean) obj;
                    holder.f374456i.setVisibility(bool.booleanValue() ? 0 : 8);
                    holder.f374459o.setVisibility(bool.booleanValue() ? 8 : 0);
                }
            }
        }
    }
}
