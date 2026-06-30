package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001:\u0001\u001eB!\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u001cB\u001b\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001dJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0016R\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0015\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0014\u0010\u0010¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/ui/widget/button/WeButton;", "Lcom/tencent/mm/view/x2c/X2CAppCompatButton;", "", "resId", "Ljz5/f0;", "setIcon", "radius", "setRadius", "color", nd1.s0.f72974x24728b, "setTextColor", "m", "I", "getHorizontalPadding", "()I", "setHorizontalPadding", "(I)V", "horizontalPadding", "n", "getContentWidth", "setContentWidth", "contentWidth", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "el5/a", "weui-native-android-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.button.WeButton */
/* loaded from: classes5.dex */
public class C22661xa3a2b3c0 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22860x975aa22c {

    /* renamed from: f, reason: collision with root package name */
    public int f293076f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293077g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f293078h;

    /* renamed from: i, reason: collision with root package name */
    public final int f293079i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int horizontalPadding;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public int contentWidth;

    /* renamed from: o, reason: collision with root package name */
    public int f293082o;

    /* renamed from: p, reason: collision with root package name */
    public int f293083p;

    /* renamed from: q, reason: collision with root package name */
    public final int f293084q;

    /* renamed from: r, reason: collision with root package name */
    public int f293085r;

    /* renamed from: s, reason: collision with root package name */
    public int f293086s;

    /* renamed from: t, reason: collision with root package name */
    public final int f293087t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22661xa3a2b3c0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.lang.Integer num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        new android.graphics.Path();
        if (attributeSet != null) {
            android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, yl5.a.f544647u);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes, "obtainStyledAttributes(...)");
            android.content.res.TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yl5.a.f544630d);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtainStyledAttributes2, "obtainStyledAttributes(...)");
            this.f293076f = obtainStyledAttributes.getDimensionPixelSize(3, 0);
            this.f293077g = obtainStyledAttributes2.getDrawable(2);
            this.f293079i = (int) (obtainStyledAttributes.getDimensionPixelSize(2, 0) * com.p314xaae8f345.mm.ui.zk.f294171b);
            this.f293084q = obtainStyledAttributes.getColor(0, 0);
            this.f293087t = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            obtainStyledAttributes2.recycle();
        }
        setClipToOutline(true);
        setOutlineProvider(new el5.a(this.f293076f));
        android.graphics.drawable.Drawable background = getBackground();
        if (background != null) {
            num = java.lang.Integer.valueOf(background instanceof android.graphics.drawable.ColorDrawable ? ((android.graphics.drawable.ColorDrawable) background).getColor() : 0);
        } else {
            num = null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        this.f293082o = intValue;
        if (com.p314xaae8f345.mm.ui.dl.f289879b) {
            if (intValue == getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19)) {
                intValue = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77735xecb83677);
            } else if (intValue == getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23)) {
                intValue = getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77882xcbbe5cad);
            }
        }
        this.f293082o = intValue;
        this.f293083p = com.p314xaae8f345.mm.ui.uk.b(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abv), this.f293082o);
        com.p314xaae8f345.mm.ui.dl.i(getPaint());
        this.f293085r = getCurrentTextColor();
        this.f293086s = com.p314xaae8f345.mm.ui.uk.b(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abv), getCurrentTextColor());
        a();
    }

    public final void a() {
        android.graphics.drawable.Drawable drawable = this.f293077g;
        if (drawable != null) {
            int i17 = this.f293079i;
            if (drawable != null) {
                drawable.setBounds(0, 0, i17, i17);
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/widget/button/WeButton", "updateicon", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/ui/widget/button/WeButton", "updateicon", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            android.graphics.drawable.Drawable drawable2 = this.f293077g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i17, i17);
                drawable2.draw(canvas);
            }
            android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(getContext().getResources(), createBitmap);
            this.f293078h = bitmapDrawable;
            bitmapDrawable.setBounds(0, 0, i17, i17);
            android.graphics.drawable.Drawable drawable3 = this.f293078h;
            if (drawable3 != null) {
                drawable3.setColorFilter(this.f293085r, android.graphics.PorterDuff.Mode.SRC_ATOP);
            }
            setCompoundDrawables(this.f293078h, null, null, null);
            android.graphics.Rect rect = new android.graphics.Rect();
            getPaint().getTextBounds(getText().toString(), 0, getText().length(), rect);
            float width = rect.width();
            getContext();
            this.contentWidth = i17 + com.p314xaae8f345.mm.ui.zk.e(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561117am0) + ((int) (width * com.p314xaae8f345.mm.ui.zk.f294171b));
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        int width;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        super.draw(canvas);
        if (getWidth() <= 0 || this.f293077g == null || (width = (int) ((getWidth() / 2.0d) - (this.contentWidth / 2.0d))) == this.horizontalPadding || width <= getPaddingLeft()) {
            return;
        }
        this.horizontalPadding = width;
        setPadding(width, 0, width, 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0080x3ada79f5, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int i17 = this.f293082o;
        if (i17 != 0) {
            int i18 = this.f293085r;
            if (isPressed()) {
                i17 = this.f293083p;
                i18 = this.f293086s;
            } else if (!isEnabled()) {
                i17 = this.f293084q;
                i18 = this.f293087t;
            }
            super.setBackgroundColor(i17);
            super.setTextColor(i18);
            android.graphics.drawable.Drawable drawable = this.f293078h;
            if (drawable != null) {
                com.p314xaae8f345.mm.ui.uk.f(drawable, i18);
            }
        }
    }

    public final int getContentWidth() {
        return this.contentWidth;
    }

    public final int getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean post(java.lang.Runnable runnable) {
        return super.post(runnable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        if (this.f293082o != i17) {
            this.f293082o = i17;
            this.f293083p = com.p314xaae8f345.mm.ui.uk.b(getContext().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abv), this.f293082o);
        }
        super.setBackgroundColor(i17);
    }

    /* renamed from: setContentWidth */
    public final void m81542xc85a7a4f(int i17) {
        this.contentWidth = i17;
    }

    /* renamed from: setHorizontalPadding */
    public final void m81543x49d2ab0b(int i17) {
        this.horizontalPadding = i17;
    }

    /* renamed from: setIcon */
    public final void m81544x764b6bfb(int i17) {
        this.f293077g = getContext().getDrawable(i17);
        a();
    }

    /* renamed from: setRadius */
    public final void m81545x205ac394(int i17) {
        this.f293076f = i17;
        setClipToOutline(true);
        setOutlineProvider(new el5.a(i17));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i17) {
        if (this.f293085r != i17) {
            this.f293085r = i17;
            this.f293086s = com.p314xaae8f345.mm.ui.uk.b(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abv), this.f293085r);
        }
        super.setTextColor(i17);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22661xa3a2b3c0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
