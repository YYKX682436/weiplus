package mh2;

/* loaded from: classes10.dex */
public final class n0 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f407953d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.x0 f407954e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f407955f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f407956g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Boolean f407957h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f407953d = pluginAbility;
        this.f407954e = service;
        this.f407955f = jz5.h.b(new mh2.m0(context, this));
        this.f407956g = jz5.h.b(new mh2.l0(context, this));
        setClipChildren(false);
        m147308x8a25ce30().setVisibility(0);
        m147309xf5d3869b().setVisibility(0);
    }

    /* renamed from: getAnchorCoverWidget */
    private final qh2.d m147308x8a25ce30() {
        return (qh2.d) ((jz5.n) this.f407956g).mo141623x754a37bb();
    }

    /* renamed from: getAudioCoverWidget */
    private final qh2.i m147309xf5d3869b() {
        return (qh2.i) ((jz5.n) this.f407955f).mo141623x754a37bb();
    }

    public final void a(java.lang.String sdkUserId, r45.xn1 xn1Var) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        android.view.ViewGroup.LayoutParams layoutParams4;
        android.view.ViewGroup.LayoutParams layoutParams5;
        android.view.ViewGroup.LayoutParams layoutParams6;
        android.view.ViewGroup.LayoutParams layoutParams7;
        android.view.ViewGroup.LayoutParams layoutParams8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sdkUserId, "sdkUserId");
        this.f407957h = null;
        lj2.v0 v0Var = this.f407953d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(v0Var.a0().p(), sdkUserId)) {
            b(m147308x8a25ce30(), sdkUserId, xn1Var);
        } else {
            b(m147309xf5d3869b(), sdkUserId, xn1Var);
        }
        boolean v17 = v0Var.a0().v();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f407957h, java.lang.Boolean.valueOf(v17))) {
            this.f407957h = java.lang.Boolean.valueOf(v17);
            qh2.i m147309xf5d3869b = m147309xf5d3869b();
            if (v17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = m147309xf5d3869b.Q;
                if (c14246xaa893502 != null && (layoutParams8 = c14246xaa893502.getLayoutParams()) != null) {
                    int b17 = i65.a.b(m147309xf5d3869b.getContext(), 72);
                    layoutParams8.width = b17;
                    layoutParams8.height = b17;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935022 = m147309xf5d3869b.Q;
                    if (c14246xaa8935022 != null) {
                        c14246xaa8935022.m56877x290db7c4(i65.a.b(m147309xf5d3869b.getContext(), 24));
                    }
                }
                android.widget.ImageView m160158x4e6f0963 = m147309xf5d3869b.m160158x4e6f0963();
                if (m160158x4e6f0963 != null && (layoutParams7 = m160158x4e6f0963.getLayoutParams()) != null) {
                    int b18 = i65.a.b(m147309xf5d3869b.getContext(), 48);
                    layoutParams7.width = b18;
                    layoutParams7.height = b18;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935023 = m147309xf5d3869b.Q;
                if (c14246xaa8935023 != null && (layoutParams2 = c14246xaa8935023.getLayoutParams()) != null) {
                    int b19 = i65.a.b(m147309xf5d3869b.getContext(), 116);
                    layoutParams2.width = b19;
                    layoutParams2.height = b19;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa8935024 = m147309xf5d3869b.Q;
                    if (c14246xaa8935024 != null) {
                        c14246xaa8935024.m56877x290db7c4(i65.a.b(m147309xf5d3869b.getContext(), 40));
                    }
                }
                android.widget.ImageView m160158x4e6f09632 = m147309xf5d3869b.m160158x4e6f0963();
                if (m160158x4e6f09632 != null && (layoutParams = m160158x4e6f09632.getLayoutParams()) != null) {
                    int b27 = i65.a.b(m147309xf5d3869b.getContext(), 80);
                    layoutParams.width = b27;
                    layoutParams.height = b27;
                }
            }
            qh2.d m147308x8a25ce30 = m147308x8a25ce30();
            if (v17) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab4 = m147308x8a25ce30.m151491x9fd65ab4();
                if (m151491x9fd65ab4 != null && (layoutParams6 = m151491x9fd65ab4.getLayoutParams()) != null) {
                    int b28 = i65.a.b(m147308x8a25ce30.getContext(), 72);
                    layoutParams6.width = b28;
                    layoutParams6.height = b28;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab42 = m147308x8a25ce30.m151491x9fd65ab4();
                    if (m151491x9fd65ab42 != null) {
                        m151491x9fd65ab42.m56877x290db7c4(i65.a.b(m147308x8a25ce30.getContext(), 24));
                    }
                }
                android.widget.ImageView m151488x4e6f0963 = m147308x8a25ce30.m151488x4e6f0963();
                if (m151488x4e6f0963 != null && (layoutParams5 = m151488x4e6f0963.getLayoutParams()) != null) {
                    int b29 = i65.a.b(m147308x8a25ce30.getContext(), 48);
                    layoutParams5.width = b29;
                    layoutParams5.height = b29;
                }
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab43 = m147308x8a25ce30.m151491x9fd65ab4();
                if (m151491x9fd65ab43 != null && (layoutParams4 = m151491x9fd65ab43.getLayoutParams()) != null) {
                    int b37 = i65.a.b(m147308x8a25ce30.getContext(), 114);
                    layoutParams4.width = b37;
                    layoutParams4.height = b37;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 m151491x9fd65ab44 = m147308x8a25ce30.m151491x9fd65ab4();
                    if (m151491x9fd65ab44 != null) {
                        m151491x9fd65ab44.m56877x290db7c4(i65.a.b(m147308x8a25ce30.getContext(), 40));
                    }
                }
                android.widget.ImageView m151488x4e6f09632 = m147308x8a25ce30.m151488x4e6f0963();
                if (m151488x4e6f09632 != null && (layoutParams3 = m151488x4e6f09632.getLayoutParams()) != null) {
                    int b38 = i65.a.b(m147308x8a25ce30.getContext(), 80);
                    layoutParams3.width = b38;
                    layoutParams3.height = b38;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSingerLayout", "bindData sdkUserId: ".concat(sdkUserId));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v0 xh2.a, still in use, count: 3, list:
          (r2v0 xh2.a) from 0x00cb: MOVE (r44v0 xh2.a) = (r2v0 xh2.a)
          (r2v0 xh2.a) from 0x00b9: MOVE (r44v2 xh2.a) = (r2v0 xh2.a)
          (r2v0 xh2.a) from 0x003f: MOVE (r44v4 xh2.a) = (r2v0 xh2.a)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public final void b(wj2.w r47, java.lang.String r48, r45.xn1 r49) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh2.n0.b(wj2.w, java.lang.String, r45.xn1):void");
    }

    public final void c() {
        km2.q qVar;
        qh2.i m147309xf5d3869b = m147309xf5d3869b();
        xh2.a m145852x5565c7c2 = m147309xf5d3869b.m145852x5565c7c2();
        if (m145852x5565c7c2 == null || (qVar = m145852x5565c7c2.f536053a) == null) {
            return;
        }
        m147309xf5d3869b.f(qVar.f390716n, qVar.f390724v, false);
    }

    /* renamed from: getPluginAbility */
    public final lj2.v0 m147310x3a33aac1() {
        return this.f407953d;
    }

    /* renamed from: getService */
    public final lj2.x0 m147311xb411027f() {
        return this.f407954e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSingerLayout", "onAttachedToWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("KTVSingerLayout", "onDetachedFromWindow");
    }
}
