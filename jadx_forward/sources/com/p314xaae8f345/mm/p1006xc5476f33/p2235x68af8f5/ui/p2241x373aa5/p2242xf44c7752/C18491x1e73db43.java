package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryHolderView;", "Landroid/widget/RelativeLayout;", "", "visibility", "Ljz5/f0;", "setVisibility", "h", "I", "getInitMargin", "()I", "setInitMargin", "(I)V", "initMargin", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "attr", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.gallery.GalleryHolderView */
/* loaded from: classes3.dex */
public final class C18491x1e73db43 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f253571d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f253572e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f253573f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f253574g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public int initMargin;

    /* renamed from: i, reason: collision with root package name */
    public float f253576i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18491x1e73db43(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cwm, this);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nnx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById;
        this.f253571d = linearLayout;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nnw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nnz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f253572e = imageView;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.f568677no1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById4;
        this.f253573f = textView;
        linearLayout.setVisibility(4);
        android.graphics.drawable.Drawable drawable = context.getResources().getDrawable(com.p314xaae8f345.mm.R.raw.f79656xe6e7503d);
        com.p314xaae8f345.mm.ui.uk.f(drawable, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7x));
        ((android.widget.ImageView) findViewById2).setImageDrawable(drawable);
        linearLayout.setOnClickListener(sf4.g.f489012d);
        setBackgroundColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7r));
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_STORY_FIRST_PULL_DOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
        boolean booleanValue = ((java.lang.Boolean) m17).booleanValue();
        this.f253574g = booleanValue;
        if (booleanValue) {
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7f));
            java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmv);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            int color = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7f);
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context2, com.p314xaae8f345.mm.R.raw.f81154xdf66ab32, color);
            e17.setBounds(0, 0, i65.a.b(context2, 14), i65.a.b(context2, 20));
            al5.w wVar = new al5.w(e17, 1);
            android.text.SpannableString spannableString = new android.text.SpannableString("#" + ((java.lang.Object) string));
            spannableString.setSpan(wVar, 0, 1, 17);
            textView.setText(spannableString);
        } else {
            textView.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a7s));
            textView.setText(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jmu));
        }
        if (bf4.f.f101248b.f()) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        this.f253576i = 1.0f;
    }

    public final int getInitMargin() {
        return this.initMargin;
    }

    /* renamed from: setInitMargin */
    public final void m71476x208bd0e0(int i17) {
        this.initMargin = i17;
    }

    @Override // android.view.View
    public void setVisibility(int i17) {
        super.setVisibility(i17);
        if (i17 == 0) {
            boolean f17 = bf4.f.f101248b.f();
            android.widget.ImageView imageView = this.f253572e;
            if (f17) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18491x1e73db43(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
