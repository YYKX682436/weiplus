package com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/findmore/preference/ting/TingIconViewTipWithPlayStatePreference;", "Lcom/tencent/mm/ui/FinderIconViewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.findmore.preference.ting.TingIconViewTipWithPlayStatePreference */
/* loaded from: classes13.dex */
public final class C22404x242589c3 extends com.p314xaae8f345.mm.ui.C21363x65d29512 {

    /* renamed from: m3, reason: collision with root package name */
    public android.widget.TextView f290128m3;

    /* renamed from: n3, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f290129n3;

    /* renamed from: o3, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d f290130o3;

    /* renamed from: p3, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f290131p3;

    /* renamed from: q3, reason: collision with root package name */
    public bw5.lp0 f290132q3;

    /* renamed from: r3, reason: collision with root package name */
    public qk.ia f290133r3;

    /* renamed from: s3, reason: collision with root package name */
    public boolean f290134s3;

    public C22404x242589c3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void g1() {
        android.widget.TextView textView = this.f290128m3;
        if (textView != null) {
            textView.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = this.f290129n3;
        if (c22628xfde5d61d != null) {
            c22628xfde5d61d.setVisibility(8);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = this.f290130o3;
        if (c22628xfde5d61d2 != null) {
            c22628xfde5d61d2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f290131p3;
        if (c22789xd23e9a9b == null) {
            return;
        }
        c22789xd23e9a9b.setVisibility(8);
    }

    public final void h1(bw5.lp0 lp0Var, boolean z17, qk.ia tingPlayState) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tingPlayState, "tingPlayState");
        if (lp0Var != null) {
            rk4.j5.j(lp0Var);
        }
        tingPlayState.toString();
        android.view.View view = this.W1;
        android.view.View findViewById = view == null ? null : view.findViewById(android.R.id.widget_frame);
        android.view.ViewGroup viewGroup = findViewById instanceof android.view.ViewGroup ? (android.view.ViewGroup) findViewById : null;
        L0();
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingIconViewTipWithPlayStatePreference", "initWidgetFrame fail, widgetFrame null");
            z18 = false;
        } else {
            this.f278232k2 = viewGroup;
            if (viewGroup.getChildCount() != 1 || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b("tingPlayView", viewGroup.getChildAt(0).getTag())) {
                viewGroup.removeAllViews();
                android.view.View.inflate(this.Y1, com.p314xaae8f345.mm.R.C30864xbddafb2a.dvh, viewGroup).findViewById(com.p314xaae8f345.mm.R.id.s8t).setTag("tingPlayView");
            }
            this.f290128m3 = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s8r);
            this.f290129n3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s8q);
            this.f290130o3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s8p);
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s8s);
            this.f290131p3 = c22789xd23e9a9b;
            if (c22789xd23e9a9b != null) {
                c22789xd23e9a9b.o(bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20318xe9ce900a()) == 1);
            }
            z18 = true;
        }
        if (!z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingIconViewTipWithPlayStatePreference", "showTingPlayStateView initWidgetFrame failed");
            return;
        }
        this.f290132q3 = lp0Var;
        this.f290134s3 = z17;
        this.f290133r3 = tingPlayState;
        if (lp0Var == null) {
            w0(true);
            g1();
            a1(this.f278232k2, 8);
        } else if (z17) {
            w0(false);
            i1(lp0Var, true, tingPlayState);
        } else {
            w0(true);
            i1(lp0Var, false, tingPlayState);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showTingPlayStateView tingItem: ");
        sb6.append(lp0Var != null ? rk4.j5.j(lp0Var) : null);
        sb6.append(", show: ");
        sb6.append(z17);
        sb6.append(", widgetFrame: ");
        sb6.append(this.f278232k2.getVisibility() == 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingIconViewTipWithPlayStatePreference", sb6.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
    
        if (r26.i0.n(r5, "ting_discover_entry_play.pag", false) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bd, code lost:
    
        if (r26.i0.n(r5, "ting_discover_entry_play.pag", false) != false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i1(bw5.lp0 r7, boolean r8, qk.ia r9) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2702xd78fac8e.p2703xa8fcbcdb.p2704x3652ee.C22404x242589c3.i1(bw5.lp0, boolean, qk.ia):void");
    }

    @Override // com.p314xaae8f345.mm.ui.C21363x65d29512, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        qk.ia iaVar;
        super.t(view);
        view.toString();
        bw5.lp0 lp0Var = this.f290132q3;
        if (lp0Var != null) {
            rk4.j5.j(lp0Var);
        }
        bw5.lp0 lp0Var2 = this.f290132q3;
        if (lp0Var2 == null || (iaVar = this.f290133r3) == null) {
            return;
        }
        boolean z17 = this.f290134s3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iaVar);
        h1(lp0Var2, z17, iaVar);
    }

    @Override // com.p314xaae8f345.mm.ui.C21363x65d29512, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21557x1753ef1b, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        return super.u(viewGroup);
    }

    @Override // com.p314xaae8f345.mm.ui.C21363x65d29512
    public void w0(boolean z17) {
        android.view.ViewGroup viewGroup;
        super.w0(z17);
        if (z17 || (viewGroup = this.f278232k2) == null) {
            return;
        }
        a1(viewGroup.findViewById(com.p314xaae8f345.mm.R.id.s8t), 0);
    }

    public C22404x242589c3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }

    public C22404x242589c3(android.content.Context context) {
        super(context, null);
    }
}
