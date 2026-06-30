package com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/radar/ui/RadarSpecialSmoothScrollView;", "Landroid/widget/ScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "qs3/w", "plugin-radar_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.radar.ui.RadarSpecialSmoothScrollView */
/* loaded from: classes3.dex */
public class C16948x67c5bc73 extends android.widget.ScrollView {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 f236533d;

    /* renamed from: e, reason: collision with root package name */
    public float f236534e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Rect f236535f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.TranslateAnimation f236536g;

    /* renamed from: h, reason: collision with root package name */
    public final qs3.w f236537h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16948x67c5bc73(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f236535f = new android.graphics.Rect();
        this.f236537h = new qs3.w();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        if (getChildCount() > 0) {
            android.view.View childAt = getChildAt(0);
            this.f236533d = childAt instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5) childAt : null;
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (this.f236533d == null) {
            return super.onTouchEvent(ev6);
        }
        int action = ev6.getAction();
        if (action != 0) {
            android.graphics.Rect rect = this.f236535f;
            if (action == 1) {
                this.f236534e = 0.0f;
                if (!rect.isEmpty()) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f236533d);
                    android.view.animation.TranslateAnimation translateAnimation = new android.view.animation.TranslateAnimation(0.0f, 0.0f, r4.getTop() - rect.top, 0.0f);
                    this.f236536g = translateAnimation;
                    translateAnimation.setInterpolator(this.f236537h);
                    android.view.animation.TranslateAnimation translateAnimation2 = this.f236536g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(translateAnimation2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f236533d);
                    translateAnimation2.setDuration(java.lang.Math.abs(r2.getTop() - rect.top));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba5 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba5);
                    c16949x6f38aba5.startAnimation(this.f236536g);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba52 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba52);
                    int i17 = rect.left;
                    int i18 = rect.top;
                    int i19 = rect.right;
                    int i27 = rect.bottom;
                    c16949x6f38aba52.f236538d = true;
                    c16949x6f38aba52.layout(i17, i18, i19, i27);
                    rect.setEmpty();
                }
            } else if (action == 2) {
                float y17 = ev6.getY();
                if (this.f236534e == 0.0f) {
                    this.f236534e = y17;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba53 = this.f236533d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba53);
                int measuredHeight = c16949x6f38aba53.getMeasuredHeight() - getHeight();
                int scrollY = getScrollY();
                if (scrollY == 0 || scrollY == measuredHeight) {
                    int i28 = (int) (this.f236534e - y17);
                    scrollBy(0, i28);
                    if (rect.isEmpty()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba54 = this.f236533d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba54);
                        int left = c16949x6f38aba54.getLeft();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba55 = this.f236533d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba55);
                        int top = c16949x6f38aba55.getTop();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba56 = this.f236533d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba56);
                        int right = c16949x6f38aba56.getRight();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba57 = this.f236533d;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba57);
                        rect.set(left, top, right, c16949x6f38aba57.getBottom());
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba58 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba58);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba59 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba59);
                    int left2 = c16949x6f38aba59.getLeft();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba510 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba510);
                    int i29 = i28 / 2;
                    int top2 = c16949x6f38aba510.getTop() - i29;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba511 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba511);
                    int right2 = c16949x6f38aba511.getRight();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16949x6f38aba5 c16949x6f38aba512 = this.f236533d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16949x6f38aba512);
                    int bottom = c16949x6f38aba512.getBottom() - i29;
                    c16949x6f38aba58.f236538d = true;
                    c16949x6f38aba58.layout(left2, top2, right2, bottom);
                } else {
                    scrollBy(0, ((int) (this.f236534e - y17)) / 2);
                }
                this.f236534e = y17;
            }
        } else {
            this.f236534e = ev6.getY();
        }
        return super.onTouchEvent(ev6);
    }
}
