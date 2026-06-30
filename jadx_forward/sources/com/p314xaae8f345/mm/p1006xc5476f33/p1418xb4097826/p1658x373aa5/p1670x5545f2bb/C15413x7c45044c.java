package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fB#\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001e\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006#"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout;", "Lcom/tencent/mm/plugin/finder/view/landscape/FinderLandscapePreviewLayout;", "Lcom/tencent/mm/plugin/finder/video/FinderThumbPlayerProxy;", "videoView", "Ljz5/f0;", "setupSpeedGestureDetectorCallbacks", "Landroid/graphics/Rect;", "getSpeedLockAreaRect", "Lpx2/v0;", "Q", "Lpx2/v0;", "getCallback", "()Lpx2/v0;", "setCallback", "(Lpx2/v0;)V", "callback", "Landroid/view/View;", "R", "Landroid/view/View;", "getBulletStubView", "()Landroid/view/View;", "bulletStubView", "", "getEnableVerticalDistanceLock", "()Z", "enableVerticalDistanceLock", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.landscape.FinderVideoLandscapePreviewLayout */
/* loaded from: classes2.dex */
public final class C15413x7c45044c extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd {
    public static final /* synthetic */ int C1 = 0;
    public long A1;
    public long B1;

    /* renamed from: Q, reason: from kotlin metadata */
    public px2.v0 callback;

    /* renamed from: R, reason: from kotlin metadata */
    public final android.view.View bulletStubView;
    public final android.view.View S;
    public final android.view.View T;
    public final android.view.View U;
    public final android.widget.TextView V;
    public final ow2.h W;

    /* renamed from: l1, reason: collision with root package name */
    public final android.view.View f214114l1;

    /* renamed from: p0, reason: collision with root package name */
    public ow2.a f214115p0;

    /* renamed from: p1, reason: collision with root package name */
    public float f214116p1;

    /* renamed from: x0, reason: collision with root package name */
    public float f214117x0;

    /* renamed from: x1, reason: collision with root package name */
    public boolean f214118x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f214119y0;

    /* renamed from: y1, reason: collision with root package name */
    public long f214120y1;

    /* renamed from: z1, reason: collision with root package name */
    public long f214121z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15413x7c45044c(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214117x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9m, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.g3_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7h, (android.view.ViewGroup) null);
        this.f214114l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f214116p1 = 1.0f;
    }

    /* renamed from: getEnableVerticalDistanceLock */
    private final boolean m62820xd568836f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        return ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.L3).mo141623x754a37bb()).r()).booleanValue();
    }

    /* renamed from: getSpeedLockAreaRect */
    private final android.graphics.Rect m62821xe406078d() {
        return new android.graphics.Rect(0, (getHeight() * 3) / 4, getWidth(), getHeight());
    }

    /* renamed from: setupSpeedGestureDetectorCallbacks */
    private final void m62822x3dc10f49(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd) {
        ow2.a aVar;
        if (!(this.f214117x0 == 1.0f) && (aVar = this.f214115p0) != null) {
            aVar.f430903g = new px2.q0(this, c15188xd8bd4bd);
        }
        ow2.a aVar2 = this.f214115p0;
        if (aVar2 != null) {
            aVar2.f430904h = new px2.r0(this);
        }
        if (aVar2 != null) {
            aVar2.f430905i = new px2.s0(this);
        }
        if (aVar2 == null) {
            return;
        }
        aVar2.f430906j = new px2.t0(this, c15188xd8bd4bd);
    }

    public final android.view.View getBulletStubView() {
        return this.bulletStubView;
    }

    public final px2.v0 getCallback() {
        return this.callback;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd
    public void k(boolean z17) {
        if (!z17) {
            z(false, 2.0f, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e);
            return;
        }
        px2.v0 v0Var = this.callback;
        android.view.KeyEvent.Callback callback = v0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b.f217146n : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) callback : null;
        float playSpeedRatio = c15188xd8bd4bd != null ? c15188xd8bd4bd.getPlaySpeedRatio() : 1.0f;
        if (playSpeedRatio == 1.0f) {
            return;
        }
        px2.v0 v0Var2 = this.callback;
        if (v0Var2 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var2).f215336b.f217149q != null) {
            z(true, playSpeedRatio, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al.f213186e);
        }
        this.f214117x0 = playSpeedRatio;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd
    public void l() {
        android.content.Context context;
        px2.v0 v0Var = this.callback;
        android.view.KeyEvent.Callback callback = v0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b.f217146n : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = callback instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) callback : null;
        if (c15188xd8bd4bd != null) {
            if (v0Var == null || (context = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215335a) == null) {
                context = getContext();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class)).R6(c15188xd8bd4bd);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd
    public boolean m(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        ow2.a aVar = this.f214115p0;
        if (aVar != null) {
            aVar.a(event);
        }
        return this.f214095r;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        x();
        super.onDetachedFromWindow();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd
    public void q(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        px2.v0 v0Var = this.callback;
        android.view.View view = v0Var != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b.f217146n : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = view instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd) view : null;
        if (c15188xd8bd4bd != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(m62799x68422f5c());
            arrayList.add(getIconLayout());
            android.view.View m62800xf586e84d = m62800xf586e84d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m62800xf586e84d, "<get-playIconLayout>(...)");
            arrayList.add(m62800xf586e84d);
            arrayList.add(m62805xf9d8c5ab());
            arrayList.add(m62792x89f3bfad());
            android.content.Context context = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15477xbd78f833.class)).Z6(holder, arrayList, c15188xd8bd4bd, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.k60.f216458e, new px2.u0(this, c15188xd8bd4bd), this.W);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
            r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            cw2.wa f212289y = c15188xd8bd4bd.getF212289y();
            if (f212289y != null) {
                jSONObject.put("feedid", pm0.v.u(f212289y.f305632f.getFeedId()));
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "accelerate_play", 1, jSONObject, false, null, 48, null);
        }
    }

    /* renamed from: setCallback */
    public final void m62825x6c4ebec7(px2.v0 v0Var) {
        this.callback = v0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.AbstractGestureDetectorOnGestureListenerC15410x706991fd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean u(boolean r33, android.view.MotionEvent r34) {
        /*
            Method dump skipped, instructions count: 719
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1670x5545f2bb.C15413x7c45044c.u(boolean, android.view.MotionEvent):boolean");
    }

    public final java.util.HashMap w(r45.qt2 qt2Var, long j17, float f17, long j18, long j19, long j27, long j28, int i17, boolean z17, boolean z18, boolean z19) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        jz5.l lVar = z19 ? new jz5.l(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - this.A1), java.lang.Long.valueOf(this.B1)) : new jz5.l(java.lang.Long.valueOf(j18), java.lang.Long.valueOf(j27));
        long longValue = ((java.lang.Number) lVar.f384366d).longValue();
        long longValue2 = ((java.lang.Number) lVar.f384367e).longValue();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.lang.String str2 = "";
        if (qt2Var == null || (str = qt2Var.m75945x2fec8307(2)) == null) {
            str = "";
        }
        hashMap.put("finder_tab_context_id", str);
        if (qt2Var != null && (m75945x2fec8307 = qt2Var.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        hashMap.put("finder_context_id", str2);
        hashMap.put("comment_scene", java.lang.Integer.valueOf(qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        hashMap.put("feed_id", pm0.v.u(j17));
        hashMap.put("session_buffer", ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).ek(j17, null, qt2Var != null ? qt2Var.m75939xb282bd08(5) : 0));
        hashMap.put("accelerate_type", java.lang.Float.valueOf(f17));
        hashMap.put("screen_type", 1);
        hashMap.put("accelerate_duration", java.lang.Long.valueOf(longValue));
        hashMap.put("video_duration_time", java.lang.Long.valueOf(j19));
        hashMap.put("time_point_before_lpa", java.lang.Long.valueOf(longValue2));
        hashMap.put("time_point_after_lpa", java.lang.Long.valueOf(j28));
        hashMap.put("lpa_play_times", java.lang.Integer.valueOf(i17));
        if (z17) {
            hashMap.put("accelerate_leave_type", java.lang.Integer.valueOf(z18 ? 1 : 2));
        }
        return hashMap;
    }

    public final void x() {
        ow2.h hVar = this.W;
        if (hVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15348xd72dc333 e17 = hVar.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15306x6c158642 c15306x6c158642 = e17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15306x6c158642 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15306x6c158642) e17 : null;
            if (c15306x6c158642 != null) {
                c15306x6c158642.i();
            }
        }
    }

    public final void y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HorizontalVideoPreviewLayout", "hideLockSpeedArea");
        android.view.View view = this.U;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "hideLockSpeedArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "hideLockSpeedArea", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void z(boolean z17, float f17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.al alVar) {
        in5.s0 s0Var;
        px2.v0 v0Var = this.callback;
        if (v0Var == null || (s0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.at) v0Var).f215336b.f217149q) == null) {
            return;
        }
        android.view.View view = this.T;
        ow2.h hVar = this.W;
        if (z17) {
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            if (hVar != null) {
                hVar.j(s0Var, f17, alVar, true);
                return;
            }
            return;
        }
        if (hVar != null) {
            hVar.f(s0Var, true);
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "showSpeedIndicatorWithAnim", "(ZFLcom/tencent/mm/plugin/finder/view/FinderSpeedIndicatorView$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15413x7c45044c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214117x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9m, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.g3_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7h, (android.view.ViewGroup) null);
        this.f214114l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f214116p1 = 1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15413x7c45044c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f214117x0 = 2.0f;
        int dimension = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(dimension, dimension);
        layoutParams.topMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        layoutParams.setMarginStart((int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        layoutParams.gravity = 8388611;
        getIconLayout().setLayoutParams(layoutParams);
        getIconLayout().setOnClickListener(new px2.k0(this));
        getIconLayout();
        float f17 = dimension / 2.0f;
        getIconLayout().setPivotX(f17);
        getIconLayout().setPivotY(f17);
        android.view.View view = new android.view.View(getContext());
        this.bulletStubView = view;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, 1);
        layoutParams2.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        addView(view, layoutParams2);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b9m, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.S = inflate;
        addView(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.g3_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.ui.fk.a((android.widget.TextView) findViewById);
        android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.eed, (android.view.ViewGroup) null);
        this.T = inflate2;
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams3.gravity = 49;
        layoutParams3.topMargin = getContext().getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        addView(inflate2, layoutParams3);
        if (inflate2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate2, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(inflate2, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7u, (android.view.ViewGroup) null);
        this.U = inflate3;
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams4.gravity = 80;
        addView(inflate3, layoutParams4);
        if (inflate3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(inflate3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            inflate3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(inflate3, "com/tencent/mm/plugin/finder/view/landscape/FinderVideoLandscapePreviewLayout", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.V = inflate3 != null ? (android.widget.TextView) inflate3.findViewById(com.p314xaae8f345.mm.R.id.tfs) : null;
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        this.W = new ow2.h(context2, inflate2, new px2.l0(this));
        getIconLayout().bringToFront();
        android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7h, (android.view.ViewGroup) null);
        this.f214114l1 = inflate4;
        android.widget.FrameLayout.LayoutParams layoutParams5 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams5.gravity = 81;
        addView(inflate4, layoutParams5);
        this.f214116p1 = 1.0f;
    }
}
