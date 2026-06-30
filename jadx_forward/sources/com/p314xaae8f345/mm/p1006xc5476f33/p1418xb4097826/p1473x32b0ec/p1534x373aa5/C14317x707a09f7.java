package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/FinderLiveGameInfoView;", "Lcom/tencent/mm/magicbrush/plugin/scl/view/MagicSclViewContainer;", "Lmm2/c1;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Ljz5/f0;", "setup", "", "getFrameSetName", "Lik2/e;", "w", "Lik2/e;", "getSurfaceMgr", "()Lik2/e;", "setSurfaceMgr", "(Lik2/e;)V", "surfaceMgr", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.view.FinderLiveGameInfoView */
/* loaded from: classes3.dex */
public final class C14317x707a09f7 extends com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d {

    /* renamed from: x, reason: collision with root package name */
    public static long f197446x = java.lang.System.currentTimeMillis();

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f197447u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197448v;

    /* renamed from: w, reason: collision with root package name and from kotlin metadata */
    public ik2.e surfaceMgr;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C14317x707a09f7(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final void g(java.lang.String str) {
        hq0.e0 e0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveGameInfoView", "notifyGameData:" + str);
        ik2.e eVar = this.surfaceMgr;
        if (eVar == null || (e0Var = eVar.f373420c) == null) {
            return;
        }
        e0Var.a(str, null);
    }

    /* renamed from: getFrameSetName */
    public final java.lang.String m57330x45e62656() {
        return "portrait_game_outfits";
    }

    public final ik2.e getSurfaceMgr() {
        return this.surfaceMgr;
    }

    @Override // com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveGameInfoView", "onAttachedToWindow");
        super.onAttachedToWindow();
    }

    @Override // com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveGameInfoView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        this.f197448v = false;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent != null && motionEvent.getActionMasked() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1740, 3);
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p848x373aa5.C10867x3e50a04d, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        getMeasuredHeight();
        getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
    }

    /* renamed from: setSurfaceMgr */
    public final void m57332x9dd36c2d(ik2.e eVar) {
        this.surfaceMgr = eVar;
    }

    /* renamed from: setup */
    public final void m57333x6843a7d(mm2.c1 data) {
        jz5.f0 f0Var;
        hq0.e0 e0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f197448v) {
            return;
        }
        e(m57330x45e62656());
        fq0.x xVar = this.frameSet;
        if (xVar != null) {
            xVar.f347019j = false;
            pm0.v.X(new fq0.s(xVar, false));
        }
        ik2.e eVar = this.surfaceMgr;
        if (eVar != null) {
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            eVar.a(context, data.f410385o, ((mm2.e1) data.m147920xbba4bfc0(mm2.e1.class)).f410516m);
        }
        ik2.e eVar2 = this.surfaceMgr;
        if (eVar2 == null || (e0Var = eVar2.f373420c) == null) {
            f0Var = null;
        } else {
            a(e0Var);
            this.f197448v = true;
            f197446x = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
            g0Var.d(23423, "wx9e221f7828fa7482", 1, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()), java.lang.Long.valueOf(f197446x));
            java.lang.String str = this.f197447u;
            if (str != null) {
                g(str);
            }
            g0Var.A(1740, 1);
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FinderLiveGameInfoView", "root is null");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14317x707a09f7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
