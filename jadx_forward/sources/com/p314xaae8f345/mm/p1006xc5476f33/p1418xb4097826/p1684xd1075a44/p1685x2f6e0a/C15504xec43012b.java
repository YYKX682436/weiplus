package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0002B\u001d\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B%\b\u0016\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0012J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u0006\u0010\n\u001a\u00020\t¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/finder/widget/edit/FinderEditFooter;", "Lcom/tencent/mm/ui/widget/InputPanelLinearLayout;", "Lqy2/a;", "alignModeChangeListener", "Ljz5/f0;", "setAlignModeChangeListener", "Lcom/tencent/mm/pluginsdk/ui/k0;", "smileyTextListener", "setSmileyTextOperationListener", "", "getCurrentAlignMode", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.widget.edit.FinderEditFooter */
/* loaded from: classes5.dex */
public final class C15504xec43012b extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f218473p = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f218474g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageButton f218475h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f218476i;

    /* renamed from: m, reason: collision with root package name */
    public int f218477m;

    /* renamed from: n, reason: collision with root package name */
    public qy2.a f218478n;

    /* renamed from: o, reason: collision with root package name */
    public int f218479o;

    public C15504xec43012b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f218477m = 101;
        this.f218479o = 201;
        f();
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22607x763d2049, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        if (!z17) {
            if (this.f218479o == 201) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f218476i;
                if (abstractC19636xc6b37291 != null) {
                    abstractC19636xc6b37291.setVisibility(8);
                    return;
                } else {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
                    throw null;
                }
            }
            return;
        }
        this.f218479o = 201;
        android.widget.ImageButton imageButton = this.f218474g;
        if (imageButton == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("emojiBtn");
            throw null;
        }
        imageButton.setImageResource(com.p314xaae8f345.mm.R.raw.f80094x8ea8d5ee);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f218476i;
        if (abstractC19636xc6b372912 != null) {
            abstractC19636xc6b372912.setVisibility(0);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }

    public final void f() {
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.ag9, this);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.m7o);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d_r);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.ImageButton imageButton = (android.widget.ImageButton) findViewById;
        this.f218474g = imageButton;
        imageButton.setOnClickListener(new qy2.b(this));
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.f564471sc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.ImageButton imageButton2 = (android.widget.ImageButton) findViewById2;
        this.f218475h = imageButton2;
        imageButton2.setOnClickListener(new qy2.c(this));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 wi6 = ((g30.c0) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.i6.a()).wi(getContext());
        this.f218476i = wi6;
        wi6.mo75331xef640234(0);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f218476i;
        if (abstractC19636xc6b37291 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b37291.mo75345x9e226965(4);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372912 = this.f218476i;
        if (abstractC19636xc6b372912 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372912.setVisibility(8);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372913 = this.f218476i;
        if (abstractC19636xc6b372913 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372913.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562677lt);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372914 = this.f218476i;
        if (abstractC19636xc6b372914 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
        abstractC19636xc6b372914.c();
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b372915 = this.f218476i;
        if (abstractC19636xc6b372915 != null) {
            linearLayout.addView(abstractC19636xc6b372915, -1, g17);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }

    /* renamed from: getCurrentAlignMode, reason: from getter */
    public final int getF218477m() {
        return this.f218477m;
    }

    /* renamed from: setAlignModeChangeListener */
    public final void m63436x2d08422a(qy2.a alignModeChangeListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignModeChangeListener, "alignModeChangeListener");
        this.f218478n = alignModeChangeListener;
    }

    /* renamed from: setSmileyTextOperationListener */
    public final void m63437xf9b941db(com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 smileyTextListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(smileyTextListener, "smileyTextListener");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f218476i;
        if (abstractC19636xc6b37291 != null) {
            abstractC19636xc6b37291.mo75339x5e04422d(smileyTextListener);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("smileyPanel");
            throw null;
        }
    }

    public C15504xec43012b(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f218477m = 101;
        this.f218479o = 201;
        f();
    }
}
