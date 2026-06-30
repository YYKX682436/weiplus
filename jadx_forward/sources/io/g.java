package io;

/* loaded from: classes10.dex */
public final class g implements q31.n {

    /* renamed from: a, reason: collision with root package name */
    public em.p0 f374929a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f374930b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f374931c;

    /* renamed from: d, reason: collision with root package name */
    public long f374932d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f374933e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.y4 f374934f;

    /* renamed from: g, reason: collision with root package name */
    public cc5.a f374935g;

    @Override // q31.n
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (this.f374929a == null) {
            this.f374929a = new em.p0(android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570730dn5, (android.view.ViewGroup) null));
            c(null, this.f374935g);
        }
        em.p0 p0Var = this.f374929a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p0Var);
        android.view.View view = p0Var.f336229a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "getInflateRootView(...)");
        return view;
    }

    @Override // q31.n
    public void b(q31.p pVar) {
        cc5.a aVar = (cc5.a) pVar;
        cc5.a aVar2 = this.f374935g;
        this.f374935g = aVar;
        c(aVar2, aVar);
    }

    public final void c(cc5.a aVar, cc5.a aVar2) {
        em.p0 p0Var;
        android.view.View.OnLongClickListener onLongClickListener;
        android.view.View view;
        android.view.View.OnClickListener onClickListener;
        em.p0 p0Var2;
        java.lang.CharSequence charSequence;
        em.p0 p0Var3;
        android.view.View view2;
        if (aVar2 == null || (p0Var = this.f374929a) == null) {
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd03243 = p0Var.f336230b;
        android.view.View view3 = p0Var.f336229a;
        if (c19694xdfd03243 == null) {
            p0Var.f336230b = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243) view3.findViewById(com.p314xaae8f345.mm.R.id.r1j);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2482x5c28046.C19694xdfd03243 c19694xdfd032432 = p0Var.f336230b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19694xdfd032432, "getVEmojiView(...)");
        java.lang.String str = aVar2.f122020f;
        long j17 = aVar2.f122018d;
        boolean z17 = aVar2.f122019e;
        com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var = aVar2.f122021g;
        java.lang.CharSequence charSequence2 = aVar2.f122022h;
        android.view.View.OnClickListener onClickListener2 = aVar2.f122023i;
        android.view.View.OnLongClickListener onLongClickListener2 = aVar2.f122024m;
        if (str == null) {
            p0Var3 = p0Var;
            view = view3;
        } else {
            if (!this.f374930b) {
                this.f374930b = true;
                c19694xdfd032432.a();
                c19694xdfd032432.addView(c19694xdfd032432.f272359m, new android.widget.FrameLayout.LayoutParams(-2, -2));
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, this.f374931c) && j17 == this.f374932d && z17 == this.f374933e) {
                java.lang.String d17 = y4Var != null ? y4Var.d() : null;
                if (d17 == null) {
                    d17 = "";
                }
                com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var2 = this.f374934f;
                java.lang.String d18 = y4Var2 != null ? y4Var2.d() : null;
                if (d18 == null) {
                    d18 = "";
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, d18)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingEmoticonView", "updateEmojiView, emoticon is the same,emoticonMd5: " + str + ", sessionId: " + j17 + ", isSend: " + z17 + ", emojiContent: " + y4Var);
                    onLongClickListener = onLongClickListener2;
                    p0Var2 = p0Var;
                    view = view3;
                    onClickListener = onClickListener2;
                    charSequence = charSequence2;
                    this.f374931c = str;
                    this.f374932d = j17;
                    this.f374933e = z17;
                    this.f374934f = y4Var;
                    c19694xdfd032432.setContentDescription(charSequence);
                    c19694xdfd032432.setOnClickListener(onClickListener);
                    c19694xdfd032432.setOnLongClickListener(onLongClickListener);
                    p0Var3 = p0Var2;
                }
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6 j6Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class);
            com.p314xaae8f345.mm.p2621x8fb0427b.y4 y4Var3 = y4Var == null ? new com.p314xaae8f345.mm.p2621x8fb0427b.y4("") : y4Var;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) j6Var).getClass();
            onLongClickListener = onLongClickListener2;
            view = view3;
            onClickListener = onClickListener2;
            p0Var2 = p0Var;
            charSequence = charSequence2;
            c19694xdfd032432.c(((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(str), j17, z17, y4Var3.f277888c);
            this.f374931c = str;
            this.f374932d = j17;
            this.f374933e = z17;
            this.f374934f = y4Var;
            c19694xdfd032432.setContentDescription(charSequence);
            c19694xdfd032432.setOnClickListener(onClickListener);
            c19694xdfd032432.setOnLongClickListener(onLongClickListener);
            p0Var3 = p0Var2;
        }
        if (p0Var3.f336232d == null) {
            view2 = view;
            p0Var3.f336232d = (android.widget.LinearLayout) view2.findViewById(com.p314xaae8f345.mm.R.id.qzb);
        } else {
            view2 = view;
        }
        android.widget.LinearLayout linearLayout = p0Var3.f336232d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(linearLayout, "getLlEmoticonCaptureTipsContainer(...)");
        int i17 = aVar2.f122025n;
        android.view.View.OnClickListener onClickListener3 = aVar2.f122026o;
        if (p0Var3.f336231c == null) {
            p0Var3.f336231c = (android.widget.ImageView) view2.findViewById(com.p314xaae8f345.mm.R.id.f566931qz3);
        }
        android.widget.ImageView imageView = p0Var3.f336231c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getIvEmoticonCaptureTipsIcon(...)");
        android.graphics.drawable.Drawable drawable = aVar2.f122027p;
        linearLayout.setVisibility(i17);
        linearLayout.setOnClickListener(onClickListener3);
        imageView.setImageDrawable(drawable);
    }

    @Override // q31.n
    /* renamed from: getViewModel */
    public q31.p mo130455xa0ab20ce() {
        return this.f374935g;
    }
}
