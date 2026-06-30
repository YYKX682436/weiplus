package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013B!\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0012\u0010\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R$\u0010\r\u001a\u0004\u0018\u00010\u00068\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderStrokeShadowTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/view/ViewGroup$LayoutParams;", "params", "Ljz5/f0;", "setLayoutParams", "Landroid/widget/TextView;", "g", "Landroid/widget/TextView;", "getStrokeShadowTextView", "()Landroid/widget/TextView;", "setStrokeShadowTextView", "(Landroid/widget/TextView;)V", "strokeShadowTextView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderStrokeShadowTextView */
/* loaded from: classes4.dex */
public class C15349x8740c70 extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public android.widget.TextView strokeShadowTextView;

    /* renamed from: h, reason: collision with root package name */
    public float f213018h;

    /* renamed from: i, reason: collision with root package name */
    public int f213019i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15349x8740c70(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.strokeShadowTextView = new android.widget.TextView(context);
        b(attrs, 0);
    }

    public void b(android.util.AttributeSet attrs, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        android.content.res.TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, li0.a.f400285f, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f213018h = obtainStyledAttributes.getFloat(1, 0.0f);
        this.f213019i = obtainStyledAttributes.getColor(0, getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
    }

    public final android.widget.TextView getStrokeShadowTextView() {
        return this.strokeShadowTextView;
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.widget.TextView textView = this.strokeShadowTextView;
        if (textView != null) {
            int width = canvas.getWidth();
            int height = canvas.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/plugin/finder/view/FinderStrokeShadowTextView", "drawStrokeShadowText", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/plugin/finder/view/FinderStrokeShadowTextView", "drawStrokeShadowText", "(Landroid/graphics/Canvas;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas2 = new android.graphics.Canvas(createBitmap);
            textView.getPaint().setShadowLayer(this.f213018h, 0.0f, 0.0f, this.f213019i);
            textView.setGravity(getGravity());
            textView.setTextColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
            textView.setTextSize(0, getTextSize());
            textView.draw(canvas2);
            textView.getPaint().reset();
            textView.setGravity(getGravity());
            textView.setTextSize(0, getTextSize());
            textView.getPaint().setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
            textView.draw(canvas2);
            textView.getPaint().reset();
            canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (android.graphics.Paint) null);
        }
        super.onDraw(canvas);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        android.widget.TextView textView = this.strokeShadowTextView;
        if (textView != null) {
            textView.layout(i17, i18, i19, i27);
        }
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        android.widget.TextView textView = this.strokeShadowTextView;
        if (textView != null) {
            textView.measure(i17, i18);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.TextView textView = this.strokeShadowTextView;
        if (textView != null) {
            textView.setLayoutParams(layoutParams);
        }
        super.setLayoutParams(layoutParams);
    }

    /* renamed from: setStrokeShadowTextView */
    public final void m62390x78a63e8c(android.widget.TextView textView) {
        this.strokeShadowTextView = textView;
    }

    @Override // android.widget.TextView
    public void setText(java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        android.widget.TextView textView = this.strokeShadowTextView;
        if (textView != null) {
            textView.setText(charSequence);
        }
        super.setText(charSequence, bufferType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15349x8740c70(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
        this.strokeShadowTextView = new android.widget.TextView(context);
        b(attrs, i17);
    }
}
