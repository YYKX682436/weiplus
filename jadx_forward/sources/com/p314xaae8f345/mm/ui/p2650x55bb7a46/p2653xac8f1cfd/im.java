package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public class im extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a implements yn.e {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f280770e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f280771f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f280772g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f280773h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.z4 f280774i = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hm(this);

    public final void m0(java.lang.Boolean bool, java.lang.Boolean bool2) {
        android.view.View view = this.f280770e;
        if (view != null) {
            view.clearAnimation();
            android.view.View view2 = this.f280770e;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/chatting/component/TipsBubbleComponent", "removeTipsBubble", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (bool2.booleanValue()) {
                if (bool.booleanValue()) {
                    c01.d9.b().p().w(340228, java.lang.Boolean.TRUE);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(232L, 1L, 1L, false);
                    return;
                }
                return;
            }
            if (bool.booleanValue()) {
                c01.d9.b().p().w(340229, java.lang.Boolean.TRUE);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(232L, 2L, 1L, false);
            }
        }
    }

    public final void n0(java.lang.Boolean bool) {
        android.widget.FrameLayout.LayoutParams layoutParams;
        android.view.View view;
        this.f280771f = (android.view.ViewGroup) this.f280113d.c(com.p314xaae8f345.mm.R.id.bki);
        android.view.View inflate = android.view.View.inflate(this.f280113d.g(), com.p314xaae8f345.mm.R.C30864xbddafb2a.c7t, null);
        this.f280770e = inflate;
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.k_7);
        if (bool.booleanValue()) {
            textView.setText(this.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iib));
            this.f280770e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ccf);
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 85);
        } else {
            textView.setText(this.f280113d.g().getString(com.p314xaae8f345.mm.R.C30867xcad56011.iig));
            this.f280770e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cce);
            layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2, 83);
        }
        android.view.ViewGroup viewGroup = this.f280771f;
        if (viewGroup == null || (view = this.f280770e) == null) {
            return;
        }
        viewGroup.addView(view, layoutParams);
        this.f280770e.startAnimation(android.view.animation.AnimationUtils.loadAnimation(this.f280113d.g(), com.p314xaae8f345.mm.R.C30854x2dc211.f559407dy));
        this.f280770e.setOnClickListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gm(this, bool));
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void x() {
        if (c01.z1.H().booleanValue()) {
            if (!this.f280113d.u().k2()) {
                boolean n17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340228, null));
                this.f280772g = n17;
                if (!n17 && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q2) ((sb5.n) this.f280113d.f542241c.a(sb5.n.class))).u0() && !((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a) ((sb5.f) this.f280113d.f542241c.a(sb5.f.class))).P) {
                    n0(java.lang.Boolean.TRUE);
                }
                this.f280773h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1((java.lang.Boolean) c01.d9.b().p().l(340229, null));
                long currentTimeMillis = java.lang.System.currentTimeMillis() - com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1((java.lang.Long) c01.d9.b().p().l(340240, null), 0L);
                if (this.f280772g && !this.f280773h && currentTimeMillis >= 259200000) {
                    n0(java.lang.Boolean.FALSE);
                }
            }
            if (((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e != null) {
                ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) ((sb5.s0) this.f280113d.f542241c.a(sb5.s0.class))).f280796e.m75515x1f8fa23c(this.f280774i);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.a, yn.l
    public void y() {
        if (this.f280113d.u().k2() || !c01.z1.H().booleanValue()) {
            return;
        }
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        m0(bool, bool);
    }
}
