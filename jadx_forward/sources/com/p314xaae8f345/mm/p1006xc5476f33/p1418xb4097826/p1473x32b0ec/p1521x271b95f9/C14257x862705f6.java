package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001a\u0010\u001bB#\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001a\u0010\u001eJ\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004R#\u0010\f\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR#\u0010\u0011\u001a\n \u0007*\u0004\u0018\u00010\r0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/FinderLiveMultiStreamViewLayout;", "Landroid/widget/RelativeLayout;", "Lmn0/b0;", "getPlayer", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getPlayerView", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "e", "Ljz5/g;", "getBgView", "()Landroid/widget/ImageView;", "bgView", "Landroid/widget/ProgressBar;", "f", "getLoadingView", "()Landroid/widget/ProgressBar;", "loadingView", "liveTxLivePlayerPreview", "Lcom/tencent/mm/live/core/view/LiveVideoView;", "getLiveTxLivePlayerPreview", "()Lcom/tencent/mm/live/core/view/LiveVideoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.multistream.FinderLiveMultiStreamViewLayout */
/* loaded from: classes3.dex */
public final class C14257x862705f6 extends android.widget.RelativeLayout {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f193277m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193278d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final jz5.g bgView;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final jz5.g loadingView;

    /* renamed from: g, reason: collision with root package name */
    public uk2.b f193281g;

    /* renamed from: h, reason: collision with root package name */
    public tk2.a f193282h;

    /* renamed from: i, reason: collision with root package name */
    public mn0.b0 f193283i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14257x862705f6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193278d = "MultiStreamViewLayout_" + hashCode();
        this.bgView = jz5.h.b(new rk2.e(this));
        this.loadingView = jz5.h.b(new rk2.i(this));
    }

    /* renamed from: getBgView */
    private final android.widget.ImageView m56882x12263380() {
        return (android.widget.ImageView) this.bgView.mo141623x754a37bb();
    }

    /* renamed from: getLiveTxLivePlayerPreview */
    private final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 m56883xd51a1935() {
        return (com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614) findViewById(com.p314xaae8f345.mm.R.id.ig8);
    }

    /* renamed from: getLoadingView */
    private final android.widget.ProgressBar m56884xcc04d8cb() {
        return (android.widget.ProgressBar) this.loadingView.mo141623x754a37bb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, mn0.b0 b0Var, com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, uk2.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bindCurrentPlayer ");
        sb6.append(b0Var);
        sb6.append(" currentBindData: ");
        sb6.append(this.f193281g);
        sb6.append(" curView: ");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        sb6.append(" parent: ");
        sb6.append(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null ? scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getParent() : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f193278d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        d(false);
        if (b0Var == null || scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null) {
            c(data);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onPreDraw finish");
        this.f193281g = data;
        this.f193283i = b0Var;
        if (((pg2.j0) ((c50.s0) i95.n0.c(c50.s0.class))).wh()) {
            com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 m56883xd51a1935 = m56883xd51a1935();
            if (m56883xd51a1935 == null) {
                return;
            }
            pg2.j0 j0Var = (pg2.j0) i95.n0.c(pg2.j0.class);
            android.content.Context context = k0Var != null ? k0Var.getContext() : null;
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            long j17 = data.f510056c.f411306d;
            rk2.g gVar = new rk2.g(this, m56883xd51a1935, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            j0Var.getClass();
            ug5.v a17 = ug5.v.f509188g.a(java.lang.String.valueOf(j17));
            if (k0Var != null) {
                mn0.y yVar = (mn0.y) b0Var;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar.o(), m56883xd51a1935)) {
                    m56883xd51a1935.a(true);
                    yVar.O(m56883xd51a1935, new pg2.o(gVar, k0Var, activity, a17));
                }
            }
        } else {
            android.view.ViewParent parent = scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
            }
            if (viewGroup instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6) {
                android.content.Context context2 = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614(context2);
                c10850xc00cf614.setId(com.p314xaae8f345.mm.R.id.ig8);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6) viewGroup).addView(c10850xc00cf614, new android.widget.RelativeLayout.LayoutParams(-1, -1));
            }
            removeView(m56883xd51a1935());
            scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf.setId(com.p314xaae8f345.mm.R.id.ig8);
            addView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
        }
        uk2.b bVar = this.f193281g;
        if (bVar != null) {
            java.util.HashMap hashMap = rk2.d.f477983a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MultiStreamPlayerManager", "savePlayer key: " + bVar.a() + " player: " + b0Var);
            rk2.d.f477983a.put(bVar.a(), b0Var);
        }
        dk2.ef efVar = dk2.ef.f314905a;
        mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
        boolean z17 = pm0.v.z(c1Var != null ? c1Var.f410340g2 : 0, 524288);
        mn0.b0 b0Var2 = this.f193283i;
        if (b0Var2 != null) {
            tk2.a aVar = this.f193282h;
            ((mn0.y) b0Var2).G((aVar != null && ((mm2.w) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar).P0(mm2.w.class)).O6()) == true || efVar.z() || z17);
        }
    }

    public final void b(uk2.b data) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193278d, "bindViewData: " + data);
        this.f193281g = data;
        f(false);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197073a;
        tk2.a aVar = this.f193282h;
        if (aVar == null || (str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar).v1()) == null) {
            str = "";
        }
        android.widget.ImageView m56882x12263380 = m56882x12263380();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m56882x12263380, "<get-bgView>(...)");
        iVar.b(data.f510054a, str, m56882x12263380, rk2.h.f477990d);
    }

    public final void c(uk2.b data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f193281g = data;
        for (java.util.Map.Entry entry : rk2.d.f477983a.entrySet()) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(entry.getKey(), data.a())) {
                mn0.b0.C((mn0.b0) entry.getValue(), false, false, false, 6, null);
            }
        }
        mn0.b0 b0Var = this.f193283i;
        boolean z17 = b0Var != null && ((mn0.y) b0Var).b(false);
        java.lang.String str = this.f193278d;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onItemStartPlay: data: " + data.a() + " is playing");
            mn0.b0 b0Var2 = this.f193283i;
            if (b0Var2 != null) {
                tk2.a aVar = this.f193282h;
                ((mn0.y) b0Var2).G(aVar != null && ((mm2.w) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar).P0(mm2.w.class)).O6());
                return;
            }
            return;
        }
        d(true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onItemStartPlay: data: " + data.a() + " start play");
        e();
        mn0.b0 b0Var3 = this.f193283i;
        if (b0Var3 != null) {
            tk2.a aVar2 = this.f193282h;
            ((mn0.y) b0Var3).G(aVar2 != null && ((mm2.w) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar2).P0(mm2.w.class)).O6());
        }
    }

    public final void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193278d, "showCoverView isShow: " + z17);
        android.widget.ImageView m56882x12263380 = m56882x12263380();
        r1.intValue();
        java.lang.Integer num = z17 ? r1 : null;
        m56882x12263380.setVisibility(num != null ? num.intValue() : 8);
        android.widget.ProgressBar m56884xcc04d8cb = m56884xcc04d8cb();
        r1.intValue();
        r1 = z17 ? 0 : null;
        m56884xcc04d8cb.setVisibility(r1 != null ? r1.intValue() : 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14257x862705f6.e():void");
    }

    public final void f(boolean z17) {
        int i17;
        int i18;
        uk2.b bVar = this.f193281g;
        if (bVar != null) {
            android.view.ViewGroup.LayoutParams layoutParams = getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                r45.la4 la4Var = bVar.f510055b;
                r45.ka4 ka4Var = la4Var.f460806d;
                if (ka4Var != null && ka4Var.V >= ka4Var.W) {
                    if (((ka4Var == null || ka4Var.V == 0 || ka4Var.W == 0) ? false : true) && getContext().getResources().getConfiguration().orientation != 2) {
                        r45.ka4 ka4Var2 = la4Var.f460806d;
                        int i19 = ka4Var2.V;
                        int i27 = ka4Var2.W;
                        tk2.a aVar = this.f193282h;
                        if (aVar != null) {
                            int B0 = zl2.r4.f555483a.B0(i19, i27);
                            df2.nv nvVar = (df2.nv) ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar).U0(df2.nv.class);
                            i17 = B0 + (nvVar != null ? nvVar.f312423q : 0);
                        } else {
                            i17 = 0;
                        }
                        marginLayoutParams.topMargin = i17;
                        if (!com.p314xaae8f345.mm.ui.bk.Q() || z17) {
                            android.content.Context context = getContext();
                            if (context == null) {
                                context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            }
                            i18 = com.p314xaae8f345.mm.ui.bl.b(context).x;
                        } else {
                            tk2.a aVar2 = this.f193282h;
                            if (aVar2 != null) {
                                java.lang.Integer valueOf = java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) aVar2).f446856d.getWidth());
                                java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
                                if (num != null) {
                                    i18 = num.intValue();
                                }
                            }
                            android.content.Context context2 = getContext();
                            if (context2 == null) {
                                context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                            }
                            i18 = com.p314xaae8f345.mm.ui.bl.b(context2).x;
                        }
                        marginLayoutParams.width = i18;
                        marginLayoutParams.height = (int) (i18 / (i19 / i27));
                    }
                }
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
            }
            requestLayout();
        }
    }

    /* renamed from: getPlayer, reason: from getter */
    public final mn0.b0 getF193283i() {
        return this.f193283i;
    }

    /* renamed from: getPlayerView */
    public final com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 m56886x6b2da91c() {
        return m56883xd51a1935();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14257x862705f6(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193278d = "MultiStreamViewLayout_" + hashCode();
        this.bgView = jz5.h.b(new rk2.e(this));
        this.loadingView = jz5.h.b(new rk2.i(this));
    }
}
