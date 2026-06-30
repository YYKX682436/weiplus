package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView;", "Landroid/widget/FrameLayout;", "Lh22/f;", "getDefaultBannerConfig", "Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "getDefaultLayoutManger", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getNoLoopLayoutManager", "Landroidx/recyclerview/widget/f2;", "getCurrentAdapter", "getCurrentBannerConfig", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getCurrentBannerLayoutManager", "Li22/w;", "m", "Li22/w;", "getSizeResolver", "()Li22/w;", "setSizeResolver", "(Li22/w;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "h22/g", "h22/h", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerView */
/* loaded from: classes15.dex */
public final class C13370x510fae49 extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final h22.g f180020q = new h22.g(null);

    /* renamed from: d, reason: collision with root package name */
    public h22.f f180021d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff f180022e;

    /* renamed from: f, reason: collision with root package name */
    public final h22.e f180023f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f180024g;

    /* renamed from: h, reason: collision with root package name */
    public h22.h f180025h;

    /* renamed from: i, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f180026i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public i22.w sizeResolver;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f180028n;

    /* renamed from: o, reason: collision with root package name */
    public float f180029o;

    /* renamed from: p, reason: collision with root package name */
    public float f180030p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13370x510fae49(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f180021d = m54862x5ce38b39();
        this.f180022e = m54863xb56ac12f();
        this.f180023f = new h22.e();
        this.f180028n = "MicroMsg.EmojiStoreV3BannerView";
        android.view.View findViewById = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8c, (android.view.ViewGroup) this, true).findViewById(com.p314xaae8f345.mm.R.id.f564883af2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f180026i = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
    }

    public final void a(int i17) {
        h22.f f180021d = getF180021d();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f180024g;
        if (f2Var != null) {
            if (i17 >= 2 && i17 < f2Var.mo1894x7e414b06()) {
                f180021d.f359831c = false;
                f180021d.f359830b = true;
                f180021d.f359829a = false;
            } else if (i17 >= f2Var.mo1894x7e414b06()) {
                f180021d.f359831c = false;
                f180021d.f359830b = false;
                f180021d.f359829a = false;
            } else {
                f180021d.f359831c = true;
                f180021d.f359830b = true;
                f180021d.f359829a = true;
            }
            d(f180021d);
        }
    }

    public final void b(h22.f bannerConfig, p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bannerConfig, "bannerConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        d(bannerConfig);
        this.f180024g = adapter;
        this.f180026i.mo7960x6cab2c8d(adapter);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180028n, "banner setUp, adapter hash: " + adapter.hashCode());
    }

    public final void c() {
        h22.h hVar;
        h22.h hVar2 = this.f180025h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        h22.f fVar = this.f180021d;
        if (!fVar.f359831c || (hVar = this.f180025h) == null) {
            return;
        }
        hVar.sendEmptyMessageDelayed(1, fVar.f359832d);
    }

    public final void d(h22.f bannerConfig) {
        h22.h hVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bannerConfig, "bannerConfig");
        this.f180021d = bannerConfig;
        h22.h hVar2 = this.f180025h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        if (bannerConfig.f359831c && (hVar = this.f180025h) != null) {
            hVar.sendEmptyMessageDelayed(1, this.f180021d.f359832d);
        }
        boolean z17 = bannerConfig.f359829a;
        h22.e eVar = this.f180023f;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f180026i;
        if (!z17) {
            eVar.b(null);
            c1163xf1deaba4.mo7967x900dcbe1(m54864xe9f625e8());
            if (c1163xf1deaba4.m7950x883dc776() == 0) {
                c1163xf1deaba4.N(new h22.d(bannerConfig.f359835g));
                return;
            }
            return;
        }
        eVar.b(c1163xf1deaba4);
        eVar.f359826g = this.f180021d.f359834f;
        boolean z18 = bannerConfig.f359829a;
        eVar.f359825f = z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff c13369xdedd0dff = this.f180022e;
        c13369xdedd0dff.f180015g = z18;
        c13369xdedd0dff.f180014f = bannerConfig.f359833e;
        c13369xdedd0dff.f180016h = bannerConfig.f359835g;
        c13369xdedd0dff.f180019n = bannerConfig.f359830b;
        c1163xf1deaba4.mo7967x900dcbe1(c13369xdedd0dff);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        h22.h hVar;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            requestDisallowInterceptTouchEvent(true);
            if (this.f180021d.f359831c && (hVar = this.f180025h) != null) {
                hVar.removeCallbacksAndMessages(null);
            }
            this.f180029o = motionEvent.getX();
            this.f180030p = motionEvent.getY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f180021d.f359831c) {
                c();
            }
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (java.lang.Math.abs(this.f180029o - x17) >= java.lang.Math.abs(this.f180030p - y17)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            java.lang.Math.abs(this.f180029o - x17);
            java.lang.Math.abs(this.f180030p - y17);
            if (!this.f180021d.f359830b) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getCurrentAdapter, reason: from getter */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 getF180024g() {
        return this.f180024g;
    }

    /* renamed from: getCurrentBannerConfig, reason: from getter */
    public final h22.f getF180021d() {
        return this.f180021d;
    }

    /* renamed from: getCurrentBannerLayoutManager */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager m54861xc38fab14() {
        return this.f180026i.getLayoutManager();
    }

    /* renamed from: getDefaultBannerConfig */
    public final h22.f m54862x5ce38b39() {
        return new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
    }

    /* renamed from: getDefaultLayoutManger */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff m54863xb56ac12f() {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff();
    }

    /* renamed from: getNoLoopLayoutManager */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de m54864xe9f625e8() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false);
    }

    public final i22.w getSizeResolver() {
        return this.sizeResolver;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f180025h == null) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper, "getMainLooper(...)");
            this.f180025h = new h22.h(this, mainLooper);
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h22.h hVar = this.f180025h;
        if (hVar != null) {
            hVar.removeCallbacksAndMessages(null);
        }
        h22.h hVar2 = this.f180025h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
            hVar2.f359836a.clear();
        }
        this.f180025h = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f180028n, "onSizeChanged w:" + i17 + ", h:" + i18 + ", oldw::" + i19 + ", oldH:" + i27);
        i22.w wVar = this.sizeResolver;
        if (wVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiStoreV3ItemSizeResolver", "setParentWidth: " + i17);
            if (i17 > 0) {
                wVar.f369592a = i17;
                wVar.d();
            }
            a(wVar.f369593b);
        }
    }

    /* renamed from: setSizeResolver */
    public final void m54866xf757fca9(i22.w wVar) {
        this.sizeResolver = wVar;
    }
}
