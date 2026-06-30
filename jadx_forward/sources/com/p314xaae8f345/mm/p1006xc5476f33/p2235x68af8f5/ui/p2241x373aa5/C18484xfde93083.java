package com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\u001fB\u001b\b\u0016\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR6\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/story/ui/view/StoryMsgInputView;", "Lcom/tencent/mm/ui/widget/InputPanelFrameLayout;", "", "visible", "Ljz5/f0;", "setKeyboardVisibility", "", "getContent", "", "p", "I", "getInputType", "()I", "setInputType", "(I)V", "inputType", "Lkotlin/Function2;", "", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Lyz5/p;", "getCommentInputCallback", "()Lyz5/p;", "setCommentInputCallback", "(Lyz5/p;)V", "commentInputCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-story_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.story.ui.view.StoryMsgInputView */
/* loaded from: classes5.dex */
public final class C18484xfde93083 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f253517x = 0;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f253518f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f253519g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f253520h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f253521i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f253522m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f253523n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 f253524o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public int inputType;

    /* renamed from: q, reason: collision with root package name */
    public boolean f253526q;

    /* renamed from: r, reason: collision with root package name */
    public int f253527r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f253528s;

    /* renamed from: t, reason: collision with root package name */
    public final int f253529t;

    /* renamed from: u, reason: collision with root package name */
    public final int f253530u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    public yz5.p commentInputCallback;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Runnable f253532w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18484xfde93083(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.inputType = -1;
        android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.cwz, this);
        setClickable(true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.nko);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) findViewById;
        this.f253518f = frameLayout;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.nkq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById2;
        this.f253519g = c22621x7603e017;
        c22621x7603e017.mo81358x8f2956f(true);
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.nkn);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById3;
        this.f253520h = imageView;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.nkv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f253521i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.nku);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.View findViewById6 = findViewById(com.p314xaae8f345.mm.R.id.nkx);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "findViewById(...)");
        this.f253522m = findViewById6;
        android.view.View findViewById7 = findViewById(com.p314xaae8f345.mm.R.id.nkt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        this.f253523n = findViewById7;
        this.f253529t = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561061a80);
        this.f253530u = getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
        com.p314xaae8f345.mm.api.AbstractC4989x9e6071f3 c17 = qk.w9.c(context, true);
        this.f253524o = c17;
        this.f253527r = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        frameLayout.addView(c17, new android.widget.FrameLayout.LayoutParams(-1, this.f253527r));
        c17.mo75342x4b0766b2(this.f253527r);
        int i18 = com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291.f271298e;
        c17.mo75331xef640234(0);
        c17.mo75345x9e226965(6);
        c17.c();
        c17.setVisibility(0);
        c17.mo75350x625ff6a7(true);
        c17.i();
        c17.mo75339x5e04422d(new rf4.l1(this));
        c22621x7603e017.addTextChangedListener(new rf4.h1(this));
        findViewById6.setOnClickListener(new rf4.i1(this, context));
        imageView.setOnClickListener(new rf4.j1(this, context));
        c22621x7603e017.setOnEditorActionListener(new rf4.k1(this));
        imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
        this.f253528s = false;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        this.f253532w = new rf4.m1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setKeyboardVisibility */
    public final void m71437x7a40225b(boolean z17) {
        java.lang.Runnable runnable = this.f253532w;
        if (z17) {
            post(runnable);
            return;
        }
        removeCallbacks(runnable);
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.C22606xbb21161d, al5.e0
    public void J2(boolean z17, int i17) {
        super.J2(z17, i17);
        this.f253526q = z17;
        android.widget.FrameLayout frameLayout = this.f253518f;
        if (z17) {
            this.inputType = 2;
            frameLayout.setVisibility(4);
        } else if (this.inputType == 0) {
            frameLayout.setVisibility(0);
        } else {
            frameLayout.setVisibility(8);
            this.inputType = -1;
        }
        if (this.f253527r == i17 || i17 == 0) {
            return;
        }
        this.f253527r = i17;
        fp.w.m(getContext(), i17);
        int g17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.d2.g(getContext());
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19636xc6b37291 abstractC19636xc6b37291 = this.f253524o;
        abstractC19636xc6b37291.mo75342x4b0766b2(g17);
        android.view.ViewGroup.LayoutParams layoutParams = abstractC19636xc6b37291.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = g17;
        }
    }

    public final void b() {
        int i17 = this.inputType;
        if (i17 == 0) {
            this.f253518f.setVisibility(8);
        } else if (i17 == 2) {
            c();
        }
        this.inputType = -1;
    }

    public final void c() {
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    public final void d(java.lang.CharSequence charSequence, java.lang.String toUser, boolean z17) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f253519g;
        float textSize = c22621x7603e017.getTextSize();
        ((ke0.e) xVar).getClass();
        c22621x7603e017.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, charSequence, textSize));
        if (charSequence != null) {
            c22621x7603e017.mo81549xf579a34a(charSequence.length());
        }
        if (z17) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jn_), "getString(...)");
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(toUser, true);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jn9));
            sb6.append(' ');
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context2 = c22621x7603e017.getContext();
            java.lang.String g27 = n17 != null ? n17.g2() : null;
            if (g27 == null) {
                g27 = "";
            }
            float textSize2 = c22621x7603e017.getTextSize();
            ((ke0.e) xVar2).getClass();
            sb6.append((java.lang.Object) com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context2, g27, textSize2));
            str = sb6.toString();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlr), "getString(...)");
            java.lang.String string = getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            str = string;
        }
        c22621x7603e017.setHint(str);
    }

    public final void e(int i17, boolean z17) {
        if (z17 && i17 == 0) {
            this.f253519g.requestFocus();
            this.inputType = 2;
            this.f253520h.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79915x64991f25, -1));
            this.f253518f.setVisibility(4);
            m71437x7a40225b(true);
        }
        setVisibility(i17);
        if (z17) {
            return;
        }
        clearFocus();
    }

    public final yz5.p getCommentInputCallback() {
        return this.commentInputCallback;
    }

    /* renamed from: getContent */
    public final java.lang.CharSequence m71439x76847043() {
        android.text.Editable text = this.f253519g.getText();
        if (text != null) {
            return text.toString();
        }
        return null;
    }

    public final int getInputType() {
        return this.inputType;
    }

    /* renamed from: setCommentInputCallback */
    public final void m71441x2a433192(yz5.p pVar) {
        this.commentInputCallback = pVar;
    }

    /* renamed from: setInputType */
    public final void m71442xc17f97e2(int i17) {
        this.inputType = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C18484xfde93083(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
