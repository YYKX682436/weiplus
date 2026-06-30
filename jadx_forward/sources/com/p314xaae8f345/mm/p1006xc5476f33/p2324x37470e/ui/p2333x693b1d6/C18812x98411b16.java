package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B!\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0015\u0010\u0016B\u001b\b\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0015\u0010\u0017R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/tencent/mm/plugin/vlog/ui/thumb/NestedLimitScrollView;", "Landroid/widget/FrameLayout;", "Ln3/g0;", "", "", "f", "I", "getLeftLimit", "()I", "setLeftLimit", "(I)V", "leftLimit", "g", "getRightLimit", "setRightLimit", "rightLimit", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.vlog.ui.thumb.NestedLimitScrollView */
/* loaded from: classes3.dex */
public final class C18812x98411b16 extends android.widget.FrameLayout implements n3.g0, xn5.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f257578d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f257579e;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int leftLimit;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public int rightLimit;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18812x98411b16(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f257578d = "MicroMsg.ThumbCropView";
        this.f257579e = getChildCount() > 0 ? getChildAt(0) : null;
    }

    @Override // n3.g0
    public boolean B(android.view.View child, android.view.View target, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257578d, "onStartNestedScroll: ");
        return i17 == 1;
    }

    public final int getLeftLimit() {
        return this.leftLimit;
    }

    public final int getRightLimit() {
        return this.rightLimit;
    }

    @Override // n3.g0
    public void h(android.view.View child, android.view.View target, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257578d, "onNestedScrollAccepted: ");
    }

    @Override // n3.g0
    public void j(android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257578d, "onStopNestedScroll: ");
    }

    @Override // n3.g0
    public void l(android.view.View target, int i17, int i18, int i19, int i27, int i28) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257578d, "onNestedScroll: " + i17 + ", " + i19 + ", " + getScrollX());
        int scrollX = getScrollX() + i19;
        int i29 = this.rightLimit;
        if (scrollX > i29) {
            setScrollX(i29);
            return;
        }
        int scrollX2 = getScrollX() + i19;
        int i37 = this.leftLimit;
        if (scrollX2 < (-i37)) {
            setScrollX(-i37);
        } else {
            setScrollX(getScrollX() + i19);
        }
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        this.f257579e = getChildCount() > 0 ? getChildAt(0) : null;
        super.onFinishInflate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        android.view.View view = this.f257579e;
        if (view != null) {
            view.getWidth();
        }
    }

    /* renamed from: setLeftLimit */
    public final void m72646xc284d9b2(int i17) {
        this.leftLimit = i17;
    }

    /* renamed from: setRightLimit */
    public final void m72647xc89e9101(int i17) {
        this.rightLimit = i17;
    }

    @Override // n3.g0
    public void t(android.view.View target, int i17, int i18, int[] comsumed, int i19) {
        int scrollX;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comsumed, "comsumed");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f257578d, "onNestedPreScroll: " + i17 + ", " + getScrollX());
        if (i17 <= 0 || getScrollX() >= 0) {
            if (i17 >= 0 || getScrollX() <= 0) {
                i17 = 0;
            } else if (getScrollX() + i17 < 0) {
                scrollX = getScrollX();
                i17 = -scrollX;
            }
        } else if (getScrollX() + i17 > 0) {
            scrollX = getScrollX();
            i17 = -scrollX;
        }
        comsumed[0] = i17;
        setScrollX(getScrollX() + comsumed[0]);
        comsumed[1] = i18;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18812x98411b16(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
