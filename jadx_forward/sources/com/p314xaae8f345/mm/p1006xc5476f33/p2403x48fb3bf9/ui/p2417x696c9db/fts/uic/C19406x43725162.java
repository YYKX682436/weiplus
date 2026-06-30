package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.uic;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/fts/uic/FTSTeachScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.webview.ui.tools.fts.uic.FTSTeachScrollView */
/* loaded from: classes7.dex */
public final class C19406x43725162 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public float f266183d;

    /* renamed from: e, reason: collision with root package name */
    public float f266184e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f266185f;

    /* renamed from: g, reason: collision with root package name */
    public final int f266186g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f266187h;

    /* renamed from: i, reason: collision with root package name */
    public float f266188i;

    /* renamed from: m, reason: collision with root package name */
    public float f266189m;

    /* renamed from: n, reason: collision with root package name */
    public long f266190n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C19406x43725162(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        int actionMasked = ev6.getActionMasked();
        if (actionMasked == 0) {
            this.f266183d = ev6.getX();
            this.f266184e = ev6.getY();
            this.f266185f = false;
            this.f266188i = ev6.getX();
            this.f266189m = ev6.getY();
            this.f266190n = ev6.getDownTime();
            this.f266187h = false;
            super.onInterceptTouchEvent(ev6);
            return false;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float abs = java.lang.Math.abs(ev6.getX() - this.f266183d);
                float abs2 = java.lang.Math.abs(ev6.getY() - this.f266184e);
                if (!this.f266185f && abs2 > this.f266186g / 2 && abs2 > abs) {
                    this.f266185f = true;
                    this.f266187h = true;
                    return true;
                }
                boolean onInterceptTouchEvent = super.onInterceptTouchEvent(ev6);
                if (onInterceptTouchEvent) {
                    this.f266185f = true;
                }
                return onInterceptTouchEvent;
            }
            if (actionMasked != 3) {
                return super.onInterceptTouchEvent(ev6);
            }
        }
        this.f266185f = false;
        this.f266187h = false;
        return super.onInterceptTouchEvent(ev6);
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (ev6.getActionMasked() == 0) {
            this.f266188i = ev6.getX();
            this.f266189m = ev6.getY();
            this.f266190n = ev6.getDownTime();
            this.f266187h = false;
        }
        if (this.f266187h && ev6.getActionMasked() == 2) {
            this.f266187h = false;
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(this.f266190n, ev6.getEventTime() - 1, 0, this.f266188i, this.f266189m, ev6.getMetaState());
            super.onTouchEvent(obtain);
            obtain.recycle();
        }
        return super.onTouchEvent(ev6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19406x43725162(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f266186g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
