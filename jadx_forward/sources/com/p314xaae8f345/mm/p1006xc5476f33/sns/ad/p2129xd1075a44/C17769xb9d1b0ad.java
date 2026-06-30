package com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2129xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/sns/ad/widget/FullCardContentBackgroundView;", "Landroid/view/View;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView */
/* loaded from: classes4.dex */
public final class C17769xb9d1b0ad extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f244790d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f244791e;

    /* renamed from: f, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f244792f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.GradientDrawable f244793g;

    public C17769xb9d1b0ad(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.onDraw(canvas);
        android.view.View view = this.f244790d;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopLayer");
            throw null;
        }
        if (view.getHeight() > 0) {
            android.graphics.drawable.GradientDrawable gradientDrawable = this.f244792f;
            if (gradientDrawable != null) {
                android.view.View view2 = this.f244790d;
                if (view2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopLayer");
                    throw null;
                }
                int width = view2.getWidth();
                android.view.View view3 = this.f244790d;
                if (view3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mTopLayer");
                    throw null;
                }
                gradientDrawable.setBounds(0, 0, width, view3.getHeight());
            }
            android.graphics.drawable.GradientDrawable gradientDrawable2 = this.f244792f;
            if (gradientDrawable2 != null) {
                gradientDrawable2.draw(canvas);
            }
        }
        android.view.View view4 = this.f244791e;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomLayer");
            throw null;
        }
        if (view4.getHeight() > 0) {
            int height = getHeight();
            android.view.View view5 = this.f244791e;
            if (view5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomLayer");
                throw null;
            }
            int height2 = height - view5.getHeight();
            android.graphics.drawable.GradientDrawable gradientDrawable3 = this.f244793g;
            if (gradientDrawable3 != null) {
                android.view.View view6 = this.f244791e;
                if (view6 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomLayer");
                    throw null;
                }
                gradientDrawable3.setBounds(0, height2, view6.getWidth(), getHeight());
            }
            android.graphics.drawable.GradientDrawable gradientDrawable4 = this.f244793g;
            if (gradientDrawable4 != null) {
                gradientDrawable4.draw(canvas);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ad.widget.FullCardContentBackgroundView");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17769xb9d1b0ad(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
    }
}
