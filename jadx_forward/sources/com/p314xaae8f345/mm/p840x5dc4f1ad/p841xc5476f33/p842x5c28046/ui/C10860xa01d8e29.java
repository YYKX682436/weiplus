package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.p842x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R(\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/emoji/ui/MEHolderView;", "Landroid/widget/FrameLayout;", "Landroid/graphics/RectF;", "rect", "Ljz5/f0;", "setBoundingBox", "Lkotlin/Function0;", "g", "Lyz5/a;", "getClickHandler", "()Lyz5/a;", "setClickHandler", "(Lyz5/a;)V", "clickHandler", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mb-plugin-magic-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.magicbrush.plugin.emoji.ui.MEHolderView */
/* loaded from: classes7.dex */
public final class C10860xa01d8e29 extends android.widget.FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final android.graphics.RectF f150179h = new android.graphics.RectF(0.0f, 0.0f, 0.0f, 0.0f);

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.RectF f150180d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f150181e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f150182f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public yz5.a clickHandler;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10860xa01d8e29(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f150180d = f150179h;
        this.clickHandler = bq0.a.f105082d;
    }

    public final android.widget.FrameLayout a(boolean z17) {
        int childCount;
        android.widget.FrameLayout frameLayout;
        if (z17) {
            frameLayout = this.f150182f;
            childCount = 0;
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(getContext());
                this.f150182f = frameLayout;
            }
        } else {
            childCount = getChildCount();
            frameLayout = this.f150181e;
            if (frameLayout == null) {
                frameLayout = new android.widget.FrameLayout(getContext());
                this.f150181e = frameLayout;
            }
        }
        if (!frameLayout.isAttachedToWindow()) {
            addView(frameLayout, childCount, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        return frameLayout;
    }

    public final yz5.a getClickHandler() {
        return this.clickHandler;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f150180d, f150179h)) {
            return false;
        }
        float x17 = event.getX();
        float y17 = event.getY();
        int action = event.getAction();
        if (action != 0) {
            if (action == 1) {
                if (!this.f150180d.contains(x17, y17)) {
                    return false;
                }
                this.clickHandler.mo152xb9724478();
                return true;
            }
            if (action != 2) {
                return false;
            }
        }
        return this.f150180d.contains(x17, y17);
    }

    /* renamed from: setBoundingBox */
    public final void m46574x250227c5(android.graphics.RectF rect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rect, "rect");
        this.f150180d = rect;
    }

    /* renamed from: setClickHandler */
    public final void m46575xe1a1ee24(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.clickHandler = aVar;
    }
}
