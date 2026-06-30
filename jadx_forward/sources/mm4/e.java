package mm4;

/* loaded from: classes14.dex */
public final class e extends mm4.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f411221a;

    /* renamed from: b, reason: collision with root package name */
    public int f411222b;

    /* renamed from: c, reason: collision with root package name */
    public final int f411223c;

    /* renamed from: d, reason: collision with root package name */
    public final int f411224d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f411225e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f411226f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f411227g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f411228h;

    public e(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : i17;
        i18 = (i27 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c : i18;
        i19 = (i27 & 8) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.b6y : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f411221a = context;
        this.f411222b = i17;
        this.f411223c = i18;
        this.f411224d = i19;
        this.f411225e = z17;
        this.f411226f = jz5.h.b(new mm4.d(this));
        this.f411227g = jz5.h.b(new mm4.b(this));
        jz5.h.b(new mm4.c(this));
    }

    @Override // mm4.g
    public android.view.View a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f411228h;
        android.content.Context context = this.f411221a;
        if (view == null) {
            this.f411228h = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571112d15, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f411228h;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1)) != null) {
            findViewById2.setBackgroundResource(this.f411224d);
        }
        android.view.View view3 = this.f411228h;
        boolean z17 = this.f411225e;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f411222b));
        }
        android.view.View view4 = this.f411228h;
        if (view4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.gxz)) != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(this.f411223c));
        }
        return this.f411228h;
    }

    @Override // mm4.g
    public void d(lm4.b0 layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.g gVar = this.f411226f;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f411221a, 4);
        view.setLayoutParams(layoutParams);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f411227g).mo141623x754a37bb()).setAlpha(0.0f);
    }

    @Override // mm4.g
    public void e(lm4.b0 layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.e(layout, f17, source);
        if (this.f411225e) {
            float m72231x9c78005c = layout.m72231x9c78005c();
            float m72231x9c78005c2 = layout.m72231x9c78005c();
            android.content.Context context = this.f411221a;
            float b17 = (f17 - m72231x9c78005c) / ((m72231x9c78005c2 + i65.a.b(context, 56)) - m72231x9c78005c);
            float f18 = (b17 - 0.5f) * 2.0f;
            if (f18 < 0.0f) {
                f18 = 0.0f;
            }
            if (f18 > 1.0f) {
                f18 = 1.0f;
            }
            if (b17 > 1.0f) {
                b17 = 1.0f;
            }
            float f19 = 0.0f < b17 ? b17 : 0.0f;
            int b18 = i65.a.b(context, 16);
            int b19 = i65.a.b(context, 4);
            jz5.g gVar = this.f411226f;
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f411227g).mo141623x754a37bb()).setAlpha(f18);
        }
    }

    public final void f(int i17) {
        android.view.View findViewById;
        this.f411222b = i17;
        android.view.View view = this.f411228h;
        if (view == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.gxy)) == null) {
            return;
        }
        findViewById.setBackgroundColor(this.f411221a.getResources().getColor(i17));
    }
}
