package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1488x6c222b6a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/controller/gamependant/GamePendantContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer */
/* loaded from: classes3.dex */
public final class C14198xcf03f077 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193118d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f193119e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f193120f;

    /* renamed from: g, reason: collision with root package name */
    public float f193121g;

    /* renamed from: h, reason: collision with root package name */
    public float f193122h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14198xcf03f077(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f193118d = "Finder.GamePendantContainer";
        this.f193119e = new java.util.ArrayList();
        this.f193120f = new java.util.ArrayList();
        this.f193121g = -1.0f;
        this.f193122h = -1.0f;
    }

    public final android.graphics.RectF a(android.graphics.RectF rectF) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rectF, "<this>");
        return new android.graphics.RectF(i65.a.a(getContext(), rectF.left), i65.a.a(getContext(), rectF.top), i65.a.a(getContext(), rectF.right), i65.a.a(getContext(), rectF.bottom));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.lang.Object obj;
        java.lang.Object obj2;
        if (motionEvent == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        java.util.ArrayList arrayList = this.f193119e;
        java.util.ArrayList arrayList2 = this.f193120f;
        java.lang.String str = this.f193118d;
        java.lang.Object obj3 = null;
        if (action == 0) {
            this.f193121g = motionEvent.getX();
            this.f193122h = motionEvent.getY();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "down:" + motionEvent.getX() + ", " + motionEvent.getY());
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((android.graphics.RectF) obj).contains(motionEvent.getX(), motionEvent.getY())) {
                    break;
                }
            }
            if (obj == null) {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it6.next();
                    if (((android.graphics.RectF) obj2).contains(motionEvent.getX(), motionEvent.getY())) {
                        break;
                    }
                }
                if (obj2 == null) {
                    requestDisallowInterceptTouchEvent(false);
                }
            }
            requestDisallowInterceptTouchEvent(true);
        }
        if (motionEvent.getAction() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resetTouchPosition");
            this.f193121g = -1.0f;
            this.f193122h = -1.0f;
            requestDisallowInterceptTouchEvent(false);
        }
        if (motionEvent.getAction() == 2 && this.f193121g >= 0.0f && this.f193122h >= 0.0f) {
            float abs = java.lang.Math.abs(motionEvent.getX() - this.f193121g);
            float abs2 = java.lang.Math.abs(motionEvent.getY() - this.f193122h);
            int scaledTouchSlop = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop() / 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "distanceX:" + abs + ", distanceY:" + abs2 + ", slop:" + scaledTouchSlop + ", ev.x:" + motionEvent.getX() + ", ev.y:" + motionEvent.getY());
            float f17 = (float) scaledTouchSlop;
            if (abs > f17 || abs2 > f17) {
                if (abs > abs2) {
                    java.util.Iterator it7 = arrayList2.iterator();
                    while (true) {
                        if (!it7.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it7.next();
                        if (((android.graphics.RectF) next).contains(motionEvent.getX(), motionEvent.getY())) {
                            obj3 = next;
                            break;
                        }
                    }
                    android.graphics.RectF rectF = (android.graphics.RectF) obj3;
                    if (rectF != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitHorizontalRect:" + rectF);
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                } else {
                    java.util.Iterator it8 = arrayList.iterator();
                    while (true) {
                        if (!it8.hasNext()) {
                            break;
                        }
                        java.lang.Object next2 = it8.next();
                        if (((android.graphics.RectF) next2).contains(motionEvent.getX(), motionEvent.getY())) {
                            obj3 = next2;
                            break;
                        }
                    }
                    android.graphics.RectF rectF2 = (android.graphics.RectF) obj3;
                    if (rectF2 != null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "hitVerticalRect:" + rectF2);
                    } else {
                        requestDisallowInterceptTouchEvent(false);
                    }
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "resetTouchPosition");
                this.f193121g = -1.0f;
                this.f193122h = -1.0f;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        super.requestDisallowInterceptTouchEvent(z17);
        android.view.ViewParent parent = getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.requestDisallowInterceptTouchEvent(z17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14198xcf03f077(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f193118d = "Finder.GamePendantContainer";
        this.f193119e = new java.util.ArrayList();
        this.f193120f = new java.util.ArrayList();
        this.f193121g = -1.0f;
        this.f193122h = -1.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14198xcf03f077(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.f193118d = "Finder.GamePendantContainer";
        this.f193119e = new java.util.ArrayList();
        this.f193120f = new java.util.ArrayList();
        this.f193121g = -1.0f;
        this.f193122h = -1.0f;
    }
}
