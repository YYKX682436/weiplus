package com.tencent.mm.plugin.emoji.ui.v3.banner;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0003\u0002\u001b\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0006J\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerView;", "Landroid/widget/FrameLayout;", "Lh22/f;", "getDefaultBannerConfig", "Lcom/tencent/mm/plugin/emoji/ui/v3/banner/EmojiStoreV3BannerLayoutManager;", "getDefaultLayoutManger", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getNoLoopLayoutManager", "Landroidx/recyclerview/widget/f2;", "getCurrentAdapter", "getCurrentBannerConfig", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "getCurrentBannerLayoutManager", "Li22/w;", "m", "Li22/w;", "getSizeResolver", "()Li22/w;", "setSizeResolver", "(Li22/w;)V", "sizeResolver", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "h22/g", "h22/h", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class EmojiStoreV3BannerView extends android.widget.FrameLayout {

    /* renamed from: q, reason: collision with root package name */
    public static final h22.g f98487q = new h22.g(null);

    /* renamed from: d, reason: collision with root package name */
    public h22.f f98488d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager f98489e;

    /* renamed from: f, reason: collision with root package name */
    public final h22.e f98490f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f98491g;

    /* renamed from: h, reason: collision with root package name */
    public h22.h f98492h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.recyclerview.widget.RecyclerView f98493i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public i22.w sizeResolver;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f98495n;

    /* renamed from: o, reason: collision with root package name */
    public float f98496o;

    /* renamed from: p, reason: collision with root package name */
    public float f98497p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmojiStoreV3BannerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f98488d = getDefaultBannerConfig();
        this.f98489e = getDefaultLayoutManger();
        this.f98490f = new h22.e();
        this.f98495n = "MicroMsg.EmojiStoreV3BannerView";
        android.view.View findViewById = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.a8c, (android.view.ViewGroup) this, true).findViewById(com.tencent.mm.R.id.f483350af2);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f98493i = (androidx.recyclerview.widget.RecyclerView) findViewById;
    }

    public final void a(int i17) {
        h22.f f98488d = getF98488d();
        androidx.recyclerview.widget.f2 f2Var = this.f98491g;
        if (f2Var != null) {
            if (i17 >= 2 && i17 < f2Var.getItemCount()) {
                f98488d.f278298c = false;
                f98488d.f278297b = true;
                f98488d.f278296a = false;
            } else if (i17 >= f2Var.getItemCount()) {
                f98488d.f278298c = false;
                f98488d.f278297b = false;
                f98488d.f278296a = false;
            } else {
                f98488d.f278298c = true;
                f98488d.f278297b = true;
                f98488d.f278296a = true;
            }
            d(f98488d);
        }
    }

    public final void b(h22.f bannerConfig, androidx.recyclerview.widget.f2 adapter) {
        kotlin.jvm.internal.o.g(bannerConfig, "bannerConfig");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        d(bannerConfig);
        this.f98491g = adapter;
        this.f98493i.setAdapter(adapter);
        com.tencent.mars.xlog.Log.i(this.f98495n, "banner setUp, adapter hash: " + adapter.hashCode());
    }

    public final void c() {
        h22.h hVar;
        h22.h hVar2 = this.f98492h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        h22.f fVar = this.f98488d;
        if (!fVar.f278298c || (hVar = this.f98492h) == null) {
            return;
        }
        hVar.sendEmptyMessageDelayed(1, fVar.f278299d);
    }

    public final void d(h22.f bannerConfig) {
        h22.h hVar;
        kotlin.jvm.internal.o.g(bannerConfig, "bannerConfig");
        this.f98488d = bannerConfig;
        h22.h hVar2 = this.f98492h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
        }
        if (bannerConfig.f278298c && (hVar = this.f98492h) != null) {
            hVar.sendEmptyMessageDelayed(1, this.f98488d.f278299d);
        }
        boolean z17 = bannerConfig.f278296a;
        h22.e eVar = this.f98490f;
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f98493i;
        if (!z17) {
            eVar.b(null);
            recyclerView.setLayoutManager(getNoLoopLayoutManager());
            if (recyclerView.getItemDecorationCount() == 0) {
                recyclerView.N(new h22.d(bannerConfig.f278302g));
                return;
            }
            return;
        }
        eVar.b(recyclerView);
        eVar.f278293g = this.f98488d.f278301f;
        boolean z18 = bannerConfig.f278296a;
        eVar.f278292f = z18;
        com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager emojiStoreV3BannerLayoutManager = this.f98489e;
        emojiStoreV3BannerLayoutManager.f98482g = z18;
        emojiStoreV3BannerLayoutManager.f98481f = bannerConfig.f278300e;
        emojiStoreV3BannerLayoutManager.f98483h = bannerConfig.f278302g;
        emojiStoreV3BannerLayoutManager.f98486n = bannerConfig.f278297b;
        recyclerView.setLayoutManager(emojiStoreV3BannerLayoutManager);
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
            if (this.f98488d.f278298c && (hVar = this.f98492h) != null) {
                hVar.removeCallbacksAndMessages(null);
            }
            this.f98496o = motionEvent.getX();
            this.f98497p = motionEvent.getY();
        } else if (action == 1) {
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.f98488d.f278298c) {
                c();
            }
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            if (java.lang.Math.abs(this.f98496o - x17) >= java.lang.Math.abs(this.f98497p - y17)) {
                getParent().requestDisallowInterceptTouchEvent(true);
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            java.lang.Math.abs(this.f98496o - x17);
            java.lang.Math.abs(this.f98497p - y17);
            if (!this.f98488d.f278297b) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: getCurrentAdapter, reason: from getter */
    public final androidx.recyclerview.widget.f2 getF98491g() {
        return this.f98491g;
    }

    /* renamed from: getCurrentBannerConfig, reason: from getter */
    public final h22.f getF98488d() {
        return this.f98488d;
    }

    public final androidx.recyclerview.widget.RecyclerView.LayoutManager getCurrentBannerLayoutManager() {
        return this.f98493i.getLayoutManager();
    }

    public final h22.f getDefaultBannerConfig() {
        return new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
    }

    public final com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager getDefaultLayoutManger() {
        return new com.tencent.mm.plugin.emoji.ui.v3.banner.EmojiStoreV3BannerLayoutManager();
    }

    public final androidx.recyclerview.widget.LinearLayoutManager getNoLoopLayoutManager() {
        return new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 0, false);
    }

    public final i22.w getSizeResolver() {
        return this.sizeResolver;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f98492h == null) {
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            kotlin.jvm.internal.o.f(mainLooper, "getMainLooper(...)");
            this.f98492h = new h22.h(this, mainLooper);
            c();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h22.h hVar = this.f98492h;
        if (hVar != null) {
            hVar.removeCallbacksAndMessages(null);
        }
        h22.h hVar2 = this.f98492h;
        if (hVar2 != null) {
            hVar2.removeCallbacksAndMessages(null);
            hVar2.f278303a.clear();
        }
        this.f98492h = null;
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        com.tencent.mars.xlog.Log.i(this.f98495n, "onSizeChanged w:" + i17 + ", h:" + i18 + ", oldw::" + i19 + ", oldH:" + i27);
        i22.w wVar = this.sizeResolver;
        if (wVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EmojiStoreV3ItemSizeResolver", "setParentWidth: " + i17);
            if (i17 > 0) {
                wVar.f288059a = i17;
                wVar.d();
            }
            a(wVar.f288060b);
        }
    }

    public final void setSizeResolver(i22.w wVar) {
        this.sizeResolver = wVar;
    }
}
