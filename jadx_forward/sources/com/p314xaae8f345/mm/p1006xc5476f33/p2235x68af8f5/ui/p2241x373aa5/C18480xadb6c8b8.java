package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0018\u0010\u0019B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0018\u0010\u001aR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentColorSelector;", "Landroid/widget/LinearLayout;", "", "m", "I", "getSelectedColor", "()I", "setSelectedColor", "(I)V", "selectedColor", "Lkotlin/Function1;", "Ljz5/f0;", "n", "Lyz5/l;", "getOnColorSelected", "()Lyz5/l;", "setOnColorSelected", "(Lyz5/l;)V", "onColorSelected", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryCommentColorSelector */
/* loaded from: classes13.dex */
public final class C18480xadb6c8b8 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final int f253461d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f253462e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f253463f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f253464g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f253465h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f253466i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int selectedColor;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    public yz5.l onColorSelected;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18480xadb6c8b8(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.selectedColor = -1;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cw9, this);
        setOrientation(0);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nkk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        this.f253463f = imageView;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nkg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById2;
        this.f253464g = imageView2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nki);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f253465h = (android.widget.ImageView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nkh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.nkj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        this.f253466i = (android.widget.TextView) findViewById5;
        imageView.setOnClickListener(new rf4.w(this));
        imageView2.setOnClickListener(new rf4.x(this));
        ((android.widget.LinearLayout) findViewById4).setOnClickListener(new rf4.y(this));
        int b17 = i65.a.b(context, 2);
        this.f253461d = b17;
        int b18 = i65.a.b(context, 4);
        android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
        gradientDrawable.setColors(new int[]{-372399, -352965, -15616, -7220480, -16268960, -15683841, -15432210, -10197008, -372399});
        gradientDrawable.setGradientType(2);
        gradientDrawable.setStroke(b17, -1);
        gradientDrawable.setShape(1);
        this.f253462e = new android.graphics.drawable.InsetDrawable((android.graphics.drawable.Drawable) gradientDrawable, b18);
        a();
    }

    public final void a() {
        int i17 = this.selectedColor;
        android.graphics.drawable.Drawable drawable = this.f253462e;
        android.widget.TextView textView = this.f253466i;
        android.widget.ImageView imageView = this.f253465h;
        android.widget.ImageView imageView2 = this.f253464g;
        android.widget.ImageView imageView3 = this.f253463f;
        if (i17 == -16777216) {
            imageView3.setSelected(false);
            imageView2.setSelected(true);
            imageView.setImageDrawable(drawable);
            textView.setVisibility(8);
        } else if (i17 != -1) {
            imageView3.setSelected(false);
            imageView2.setSelected(false);
            int i18 = this.selectedColor;
            android.graphics.drawable.GradientDrawable gradientDrawable = new android.graphics.drawable.GradientDrawable();
            gradientDrawable.setColor(i18);
            gradientDrawable.setStroke(this.f253461d, -1);
            gradientDrawable.setShape(1);
            imageView.setImageDrawable(gradientDrawable);
            textView.setVisibility(0);
        } else {
            imageView3.setSelected(true);
            imageView2.setSelected(false);
            imageView.setImageDrawable(drawable);
            textView.setVisibility(8);
        }
        yz5.l lVar = this.onColorSelected;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(this.selectedColor));
        }
    }

    public final yz5.l getOnColorSelected() {
        return this.onColorSelected;
    }

    public final int getSelectedColor() {
        return this.selectedColor;
    }

    /* renamed from: setOnColorSelected */
    public final void m71418xeea6c2bd(yz5.l lVar) {
        this.onColorSelected = lVar;
    }

    /* renamed from: setSelectedColor */
    public final void m71419xa57ad846(int i17) {
        this.selectedColor = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18480xadb6c8b8(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
