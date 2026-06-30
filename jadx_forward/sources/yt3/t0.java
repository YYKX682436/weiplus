package yt3;

/* loaded from: classes3.dex */
public final class t0 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f547204d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f547205e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f547206f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f547207g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f547208h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Button f547209i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f547210m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f547211n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e f547212o;

    /* renamed from: p, reason: collision with root package name */
    public yt3.q0 f547213p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f547214q;

    public t0(android.view.ViewGroup view, ju3.d0 status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f547204d = view;
        this.f547205e = status;
        this.f547206f = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.ghn);
        this.f547207g = (android.view.ViewGroup) view.findViewById(com.p314xaae8f345.mm.R.id.cmw);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cmt);
        this.f547208h = button;
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.cmv);
        this.f547209i = button2;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565522cn1);
        this.f547210m = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cmz);
        this.f547211n = imageView2;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.d6p);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e c22611x654ca43e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22611x654ca43e) findViewById;
        this.f547212o = c22611x654ca43e;
        this.f547213p = yt3.q0.f547136f;
        this.f547214q = view.getContext();
        c22611x654ca43e.setPadding(0, 0, 0, com.p314xaae8f345.mm.ui.bl.c(view.getContext()) + c22611x654ca43e.getPaddingBottom());
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79941xc854cbfc, -1));
        imageView2.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(view.getContext(), com.p314xaae8f345.mm.R.raw.f79895x1486a73, -1));
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        a();
    }

    public final void a() {
        this.f547213p = yt3.q0.f547135e;
        this.f547206f.setVisibility(0);
        this.f547207g.setVisibility(4);
    }

    @Override // yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        if (this.f547213p != yt3.q0.f547134d) {
            return false;
        }
        this.f547213p = yt3.q0.f547136f;
        ju3.d0.k(this.f547205e, ju3.c0.R1, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f547207g;
        android.view.ViewGroup viewGroup2 = this.f547206f;
        ju3.d0 d0Var = this.f547205e;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmt) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.R1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmv) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            this.f547213p = yt3.q0.f547135e;
            ju3.d0.k(d0Var, ju3.c0.S1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565522cn1) {
            ju3.d0.k(d0Var, ju3.c0.U1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.cmz) {
            ju3.d0.k(d0Var, ju3.c0.T1, null, 2, null);
            this.f547211n.announceForAccessibility(i65.a.r(this.f547204d.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f571507h3));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.ViewGroup viewGroup = this.f547204d;
        if (viewGroup.getVisibility() == i17) {
            return;
        }
        viewGroup.setVisibility(i17);
        viewGroup.clearAnimation();
        android.content.Context context = this.f547214q;
        if (i17 == 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559256k);
            loadAnimation.setAnimationListener(new yt3.r0(this, i17));
            viewGroup.startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.p314xaae8f345.mm.R.C30854x2dc211.f559257l);
            loadAnimation2.setAnimationListener(new yt3.s0(this, i17));
            viewGroup.startAnimation(loadAnimation2);
        }
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        this.f547212o.m81287x8e9e4560(configProvider.M.getBoolean("key_forbit_edit_inset_layout", false));
    }
}
