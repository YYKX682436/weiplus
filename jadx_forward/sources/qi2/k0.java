package qi2;

/* loaded from: classes10.dex */
public final class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final zh2.c f445086h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f445087i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f445088m;

    /* renamed from: n, reason: collision with root package name */
    public android.view.View f445089n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f445090o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f445091p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f445092q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f445093r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f445094s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f445095t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(android.content.Context context, zh2.e userInterface, zh2.c pluginAbility) {
        super(context, false, null, false, 12, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInterface, "userInterface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        this.f445086h = pluginAbility;
        android.view.ViewGroup.LayoutParams layoutParams = this.f199917g.f526370d.getLayoutParams();
        if (layoutParams != null) {
            android.view.View view = this.f445087i;
            if (view != null) {
                layoutParams.height = (com.p314xaae8f345.mm.ui.bl.b(view.getContext()).y * 3) / 4;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dnx;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int l() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View m(android.view.ViewGroup root, zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        zl2.w4 w4Var = zl2.w4.f555550a;
        zl2.u4 u4Var = zl2.u4.f555523f;
        android.content.Context context = this.f199914d;
        return w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnx, root, false, u4Var, context, com.p314xaae8f345.mm.ui.id.b(context));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorWaitingPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f563868bp) {
            a();
            qo0.c.a(this.f445086h.f(), qo0.b.f446974y4, null, 2, null);
        } else {
            android.content.Context context = this.f199914d;
            fj2.j jVar = fj2.j.f344707a;
            if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.b5i) {
                this.f445091p = jVar.a(this.f445091p, context, new qi2.i0(this));
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565781r61) {
                fj2.s.c(fj2.s.f344716a, ml2.q2.D, null, null, 0, 0, 30, null);
                this.f445092q = jVar.c(this.f445092q, context, new qi2.j0(this));
            } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f6c) {
                a();
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/pk/FinderLiveAnchorWaitingPkPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f445087i = rootView;
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.hqq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f445094s = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f6c);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f445095t = findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.p314xaae8f345.mm.R.id.r9o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f445093r = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f563868bp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f445088m = findViewById4;
        android.view.View findViewById5 = rootView.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f445089n = findViewById5;
        android.view.View findViewById6 = rootView.findViewById(com.p314xaae8f345.mm.R.id.f565781r61);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f445090o = findViewById6;
        android.view.View view = this.f445088m;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("acceptBtn");
            throw null;
        }
        view.setOnClickListener(this);
        android.view.View view2 = this.f445089n;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cancelBtn");
            throw null;
        }
        view2.setOnClickListener(this);
        android.view.View view3 = this.f445095t;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("leftLayout");
            throw null;
        }
        view3.setOnClickListener(this);
        android.view.View view4 = this.f445090o;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("exitMicBtn");
            throw null;
        }
        view4.setOnClickListener(this);
        android.widget.TextView textView = this.f445094s;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerTitleText");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        android.widget.TextView textView2 = this.f445093r;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("waittingTextView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.f6b)).m82040x7541828(this.f199914d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560639q5));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) rootView.findViewById(com.p314xaae8f345.mm.R.id.r8y)).s(com.p314xaae8f345.mm.R.raw.f80329xebdaa825, com.p314xaae8f345.mm.R.C30859x5a72f63.f77716xe690c4ac);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w() {
        /*
            Method dump skipped, instructions count: 705
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qi2.k0.w():void");
    }
}
