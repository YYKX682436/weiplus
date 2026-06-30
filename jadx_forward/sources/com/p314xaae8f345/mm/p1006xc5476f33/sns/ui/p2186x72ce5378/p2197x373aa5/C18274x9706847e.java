package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B#\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0003¢\u0006\u0004\b\u0018\u0010\u001bR0\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/improve/view/ImproveOverScrollView;", "Landroid/widget/RelativeLayout;", "Lkotlin/Function1;", "", "Ljz5/f0;", "g", "Lyz5/l;", "getRefreshCallback", "()Lyz5/l;", "setRefreshCallback", "(Lyz5/l;)V", "refreshCallback", "Lbd4/u0;", "p", "Lbd4/u0;", "getDispatchTouchListener", "()Lbd4/u0;", "setDispatchTouchListener", "(Lbd4/u0;)V", "dispatchTouchListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bd4/v0", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView */
/* loaded from: classes4.dex */
public final class C18274x9706847e extends android.widget.RelativeLayout {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f250687y = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f250688d;

    /* renamed from: e, reason: collision with root package name */
    public final int f250689e;

    /* renamed from: f, reason: collision with root package name */
    public final int f250690f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.l refreshCallback;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f250692h;

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f250693i;

    /* renamed from: m, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f250694m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 f250695n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2192x5a753b7.C18254x4f9faaa1 f250696o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public bd4.u0 dispatchTouchListener;

    /* renamed from: q, reason: collision with root package name */
    public boolean f250698q;

    /* renamed from: r, reason: collision with root package name */
    public float f250699r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f250700s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f250701t;

    /* renamed from: u, reason: collision with root package name */
    public android.animation.ObjectAnimator f250702u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f250703v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f250704w;

    /* renamed from: x, reason: collision with root package name */
    public float f250705x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18274x9706847e(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250688d = new java.util.ArrayList();
        if (pc4.d.f434943a.y()) {
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
        } else {
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
        }
        this.f250689e = f17;
        this.f250690f = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.a2t);
        this.f250693i = new android.graphics.Rect();
    }

    public final void a(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3 = this.f250695n;
        if (c22637x66bb02b3 != null) {
            c22637x66bb02b3.setTranslationY(this.f250689e);
        }
        c();
        yz5.l lVar = this.refreshCallback;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("directShowTopLoading", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.OverScrollView", "hideTopLoadingView: ");
        this.f250703v = true;
        this.f250704w = false;
        android.animation.ObjectAnimator objectAnimator = this.f250701t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        this.f250701t = null;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f250695n, "translationY", this.f250690f);
        this.f250702u = ofFloat;
        if (ofFloat != null) {
            ofFloat.addListener(new bd4.w0(this));
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f250702u;
        if (objectAnimator2 != null) {
            objectAnimator2.setDuration(700L);
        }
        android.animation.ObjectAnimator objectAnimator3 = this.f250702u;
        if (objectAnimator3 != null) {
            objectAnimator3.setInterpolator(new android.view.animation.LinearInterpolator());
        }
        android.animation.ObjectAnimator objectAnimator4 = this.f250702u;
        if (objectAnimator4 != null) {
            objectAnimator4.start();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        if (this.f250701t != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3 = this.f250695n;
        if (c22637x66bb02b3 != null) {
            c22637x66bb02b3.setTranslationY(this.f250689e);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b32 = this.f250695n;
        if (c22637x66bb02b32 != null) {
            c22637x66bb02b32.clearAnimation();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.OverScrollView", "showTopLoadingView");
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f250695n, "rotation", 0.0f, 360.0f);
        this.f250701t = ofFloat;
        if (ofFloat != null) {
            ofFloat.setDuration(700L);
        }
        android.animation.ObjectAnimator objectAnimator = this.f250701t;
        if (objectAnimator != null) {
            objectAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f250701t;
        if (objectAnimator2 != null) {
            objectAnimator2.setRepeatCount(-1);
        }
        android.animation.ObjectAnimator objectAnimator3 = this.f250701t;
        if (objectAnimator3 != null) {
            objectAnimator3.start();
        }
        this.f250704w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showTopLoadingView", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    public final void d(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateTopLoadingImgPositionWithAbsOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3 = this.f250695n;
        if (c22637x66bb02b3 != null) {
            c22637x66bb02b3.clearAnimation();
        }
        android.animation.ObjectAnimator objectAnimator = this.f250702u;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        android.animation.ObjectAnimator objectAnimator2 = this.f250701t;
        if (objectAnimator2 != null) {
            if (objectAnimator2 != null) {
                objectAnimator2.cancel();
            }
            this.f250701t = null;
            this.f250704w = true;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b32 = this.f250695n;
        if (c22637x66bb02b32 != null) {
            c22637x66bb02b32.setRotation((-f17) * 3);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b33 = this.f250695n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22637x66bb02b33);
        float translationY = c22637x66bb02b33.getTranslationY() + ((f17 - this.f250705x) * 0.8f);
        int i17 = this.f250689e;
        if (translationY > i17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b34 = this.f250695n;
            if (c22637x66bb02b34 != null) {
                c22637x66bb02b34.setTranslationY(i17);
            }
        } else {
            int i18 = this.f250690f;
            if (translationY < i18) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b35 = this.f250695n;
                if (c22637x66bb02b35 != null) {
                    c22637x66bb02b35.setTranslationY(i18);
                }
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b36 = this.f250695n;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22637x66bb02b36);
                c22637x66bb02b36.setTranslationY(translationY);
            }
        }
        this.f250705x = f17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateTopLoadingImgPositionWithAbsOffset", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00d8  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r20) {
        /*
            Method dump skipped, instructions count: 861
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18274x9706847e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: getDispatchTouchListener */
    public final bd4.u0 m71023x5268ad03() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        bd4.u0 u0Var = this.dispatchTouchListener;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        return u0Var;
    }

    /* renamed from: getRefreshCallback */
    public final yz5.l m71024x2a83de0a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        yz5.l lVar = this.refreshCallback;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        return lVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onFinishInflate();
        this.f250692h = getChildAt(0);
        this.f250694m = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.hbs);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b3 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3) findViewById(com.p314xaae8f345.mm.R.id.nak);
        this.f250695n = c22637x66bb02b3;
        if (c22637x66bb02b3 != null) {
            c22637x66bb02b3.m81429xebd28962(al5.q2.MATRIX);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22637x66bb02b3 c22637x66bb02b32 = this.f250695n;
        if (c22637x66bb02b32 != null) {
            c22637x66bb02b32.m81425x8d516947(com.p314xaae8f345.mm.R.raw.f79411xe8f6bc49);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setupTopLoadingImg", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        java.util.ArrayList arrayList = this.f250688d;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        arrayList.add(zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.C18226x595adb9d.class));
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        pf5.z zVar2 = pf5.z.f435481a;
        if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        arrayList.add(zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2188xac8f1cfd.a2.class));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onFinishInflate", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f250692h;
        if (view != null) {
            this.f250693i.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onLayout", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* renamed from: setDispatchTouchListener */
    public final void m71025x227b5f77(bd4.u0 u0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        this.dispatchTouchListener = u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setDispatchTouchListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* renamed from: setRefreshCallback */
    public final void m71026x615a777e(yz5.l lVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
        this.refreshCallback = lVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setRefreshCallback", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveOverScrollView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18274x9706847e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        int f17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f250688d = new java.util.ArrayList();
        if (pc4.d.f434943a.y()) {
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561192bw);
        } else {
            f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561203c7);
        }
        this.f250689e = f17;
        this.f250690f = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.a2t);
        this.f250693i = new android.graphics.Rect();
    }
}
