package com.tencent.mm.plugin.appbrand.widget.actionbar;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000bB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/widget/actionbar/AppBrandCapsuleFrameLayoutWithHotspot;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "al1/r", "luggage-wxa-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public class AppBrandCapsuleFrameLayoutWithHotspot extends android.widget.FrameLayout {

    /* renamed from: g, reason: collision with root package name */
    public static final al1.r f91027g = new al1.r(null);

    /* renamed from: h, reason: collision with root package name */
    public static final nf.r f91028h = new nf.r(java.lang.Boolean.FALSE);

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f91029d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f91030e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f91031f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandCapsuleFrameLayoutWithHotspot(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f91031f = true;
        a();
    }

    private final void a() {
        if (f91027g.a()) {
            setWillNotDraw(false);
            post(new al1.s(this));
        }
    }

    public final void d() {
        if (this.f91031f) {
            this.f91031f = false;
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.f482517go);
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f482516gn);
            android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f482512gk);
            if (findViewById == null || findViewById2 == null || findViewById3 == null) {
                return;
            }
            android.graphics.Rect rect = new android.graphics.Rect();
            getHitRect(rect);
            android.graphics.Rect rect2 = new android.graphics.Rect();
            findViewById3.getHitRect(rect2);
            android.graphics.Rect rect3 = new android.graphics.Rect();
            findViewById.getHitRect(rect3);
            android.graphics.Rect rect4 = new android.graphics.Rect();
            findViewById2.getHitRect(rect4);
            rect4.offset(rect2.left, rect2.top);
            rect3.offset(rect2.left, rect2.top);
            int i17 = rect.right;
            int i18 = rect2.right;
            int i19 = i17 - i18;
            int i27 = rect2.top;
            int i28 = i27 - rect.top;
            int i29 = rect.bottom;
            int i37 = rect2.bottom;
            int i38 = i29 - i37;
            if (i19 > 0) {
                rect2.left -= i19;
                rect2.right = i18 + i19;
                rect3.left -= i19;
                rect4.right += i19;
            }
            if (i38 > 0) {
                rect2.bottom = i37 + i38;
                rect3.bottom += i38;
                rect4.bottom += i38;
            }
            if (i28 > 0) {
                rect2.top = i27 - i28;
                rect3.top -= i28;
                rect4.top -= i28;
            }
            java.util.List list = this.f91029d;
            al1.r rVar = f91027g;
            if (list == null) {
                this.f91029d = new java.util.ArrayList();
                if (rVar.a()) {
                    this.f91030e = new java.util.ArrayList();
                }
            }
            if (rVar.a()) {
                java.util.List list2 = this.f91030e;
                kotlin.jvm.internal.o.d(list2);
                list2.add(new android.graphics.Rect(rect3));
                java.util.List list3 = this.f91030e;
                kotlin.jvm.internal.o.d(list3);
                list3.add(new android.graphics.Rect(rect4));
                invalidate();
            }
            java.util.List list4 = this.f91029d;
            kotlin.jvm.internal.o.d(list4);
            list4.add(new android.view.TouchDelegate(rect3, findViewById));
            java.util.List list5 = this.f91029d;
            kotlin.jvm.internal.o.d(list5);
            list5.add(new android.view.TouchDelegate(rect4, findViewById2));
        }
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.List<android.graphics.Rect> list;
        kotlin.jvm.internal.o.g(canvas, "canvas");
        super.onDraw(canvas);
        if (!f91027g.a() || (list = this.f91030e) == null) {
            return;
        }
        for (android.graphics.Rect rect : list) {
            canvas.save();
            canvas.clipRect(rect);
            canvas.drawColor(b3.l.getColor(getContext(), com.tencent.mm.R.color.aat));
            canvas.restore();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (z17) {
            this.f91031f = true;
            java.util.List list = this.f91029d;
            if (list != null) {
                ((java.util.ArrayList) list).clear();
            }
            if (f91027g.a()) {
                java.util.List list2 = this.f91030e;
                if (list2 != null) {
                    ((java.util.ArrayList) list2).clear();
                    invalidate();
                }
                post(new al1.t(this));
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        boolean onTouchEvent = super.onTouchEvent(event);
        if (onTouchEvent) {
            return onTouchEvent;
        }
        d();
        java.util.List list = this.f91029d;
        if (list == null) {
            return onTouchEvent;
        }
        java.util.Iterator it = ((java.util.ArrayList) list).iterator();
        while (it.hasNext()) {
            if (((android.view.TouchDelegate) it.next()).onTouchEvent(event)) {
                return true;
            }
        }
        return onTouchEvent;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandCapsuleFrameLayoutWithHotspot(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f91031f = true;
        a();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBrandCapsuleFrameLayoutWithHotspot(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f91031f = true;
        a();
    }
}
