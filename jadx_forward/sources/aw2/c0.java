package aw2;

/* loaded from: classes10.dex */
public final class c0 implements ya2.r1, com.p314xaae8f345.mm.ui.p2740x696c9db.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f96257d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f96258e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f96259f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f96260g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f96261h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f96262i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f96263m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f96264n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f96265o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f96266p;

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00b4, code lost:
    
        if (r13 == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf r12, com.p314xaae8f345.mm.ui.p2740x696c9db.f5 r13) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aw2.c0.<init>(com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.tools.f5):void");
    }

    public static final void a(aw2.c0 c0Var) {
        c0Var.f96258e.d();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 d17 = c0Var.d();
        java.lang.String highlightTopic = c0Var.f96265o;
        d17.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(highlightTopic, "highlightTopic");
        d17.setVisibility(0);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = d17.f212661f;
        c22621x7603e017.setText(highlightTopic);
        c22621x7603e017.requestFocus();
        c22621x7603e017.mo81549xf579a34a(highlightTopic.length());
        c0Var.d().post(new aw2.x(c0Var));
    }

    public final void b() {
        this.f96258e.f();
        ((com.p314xaae8f345.mm.ui.p2740x696c9db.f5) ((jz5.n) this.f96259f).mo141623x754a37bb()).d();
        this.f96257d.mo48674x36654fab();
        d().setVisibility(8);
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.bottomMargin = 0;
        d().setLayoutParams(layoutParams2);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786) this.f96260g.mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0 d() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15295xb55935d0) ((jz5.n) this.f96262i).mo141623x754a37bb();
    }

    public final void e(java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHighlightTopicWidget", "setHighlightTopic highlightTopic" + str);
        this.f96265o = str;
        if (str.length() == 0) {
            c().b();
            return;
        }
        java.lang.String string = this.f96257d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573526m16, str);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c17 = c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "<get-chooseView>(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(c17, string, false, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.c5
    public void w2(int i17, boolean z17) {
        android.view.ViewGroup.LayoutParams layoutParams = d().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHighlightTopicWidget", "show: bottomMargin:" + layoutParams2.bottomMargin + " keyboardHeight:" + i17);
        if (layoutParams2.bottomMargin != i17) {
            aw2.z zVar = new aw2.z(this, i17);
            if (i17 != 0) {
                zVar.setDuration(200L);
            } else {
                zVar.setDuration(300L);
            }
            d().startAnimation(zVar);
        }
        d().setVisibility(0);
    }
}
