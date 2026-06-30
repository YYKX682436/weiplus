package cn1;

/* loaded from: classes14.dex */
public final class e extends cn1.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f124988a;

    /* renamed from: b, reason: collision with root package name */
    public int f124989b;

    /* renamed from: c, reason: collision with root package name */
    public final int f124990c;

    /* renamed from: d, reason: collision with root package name */
    public final int f124991d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f124992e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f124993f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f124994g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f124995h;

    public e(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c : i17;
        i18 = (i27 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c : i18;
        i19 = (i27 & 8) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.cxz : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f124988a = context;
        this.f124989b = i17;
        this.f124990c = i18;
        this.f124991d = i19;
        this.f124992e = z17;
        this.f124993f = jz5.h.b(new cn1.d(this));
        this.f124994g = jz5.h.b(new cn1.b(this));
        jz5.h.b(new cn1.c(this));
    }

    @Override // cn1.g
    public android.view.View a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f124995h;
        android.content.Context context = this.f124988a;
        if (view == null) {
            this.f124995h = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dz_, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f124995h;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1)) != null) {
            findViewById2.setBackgroundResource(this.f124991d);
        }
        android.view.View view3 = this.f124995h;
        boolean z17 = this.f124992e;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f124989b));
        }
        android.view.View view4 = this.f124995h;
        if (view4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.gxz)) != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(this.f124990c));
        }
        return this.f124995h;
    }

    @Override // cn1.g
    public void d(bn1.v layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.g gVar = this.f124993f;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f124988a, 4);
        view.setLayoutParams(layoutParams);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f124994g).mo141623x754a37bb()).setAlpha(0.0f);
    }

    @Override // cn1.g
    public void e(bn1.v layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.e(layout, f17, source);
        if (this.f124992e) {
            float m53896x9c78005c = layout.m53896x9c78005c();
            float m53896x9c78005c2 = layout.m53896x9c78005c();
            android.content.Context context = this.f124988a;
            float b17 = (f17 - m53896x9c78005c) / ((m53896x9c78005c2 + i65.a.b(context, 56)) - m53896x9c78005c);
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
            jz5.g gVar = this.f124993f;
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f124994g).mo141623x754a37bb()).setAlpha(f18);
        }
    }

    public final void f(int i17) {
        android.view.View findViewById;
        this.f124989b = i17;
        android.view.View view = this.f124995h;
        if (view == null || (findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.gxy)) == null) {
            return;
        }
        findViewById.setBackgroundColor(this.f124988a.getResources().getColor(i17));
    }
}
