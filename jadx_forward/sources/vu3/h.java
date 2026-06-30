package vu3;

/* loaded from: classes5.dex */
public final class h extends vu3.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f521762b;

    /* renamed from: c, reason: collision with root package name */
    public final int f521763c;

    /* renamed from: d, reason: collision with root package name */
    public final int f521764d;

    /* renamed from: e, reason: collision with root package name */
    public final int f521765e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f521766f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f521767g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f521768h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f521769i;

    public h(android.content.Context context, int i17, int i18, int i19, boolean z17, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560435ac1 : i17;
        i18 = (i27 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c : i18;
        i19 = (i27 & 8) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.cjy : i19;
        z17 = (i27 & 16) != 0 ? true : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f521762b = context;
        this.f521763c = i17;
        this.f521764d = i18;
        this.f521765e = i19;
        this.f521766f = z17;
        this.f521767g = jz5.h.b(new vu3.g(this));
        this.f521768h = jz5.h.b(new vu3.e(this));
        jz5.h.b(new vu3.f(this));
    }

    @Override // vu3.c
    public android.view.View a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f521769i;
        android.content.Context context = this.f521762b;
        if (view == null) {
            this.f521769i = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dbr, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f521769i;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1)) != null) {
            findViewById2.setBackgroundResource(this.f521765e);
        }
        android.view.View view3 = this.f521769i;
        boolean z17 = this.f521766f;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
            if (!z17) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f521763c));
        }
        android.view.View view4 = this.f521769i;
        if (view4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.gxz)) != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(this.f521764d));
        }
        return this.f521769i;
    }

    @Override // vu3.c
    public void e(uu3.u layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.g gVar = this.f521767g;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f521762b, 4);
        view.setLayoutParams(layoutParams);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f521768h).mo141623x754a37bb()).setAlpha(0.0f);
    }

    @Override // vu3.c
    public void f(uu3.u layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.f(layout, f17, source);
        if (this.f521766f) {
            float m68103x9c78005c = layout.m68103x9c78005c();
            float m68103x9c78005c2 = layout.m68103x9c78005c();
            android.content.Context context = this.f521762b;
            float b17 = (f17 - m68103x9c78005c) / ((m68103x9c78005c2 + i65.a.b(context, 56)) - m68103x9c78005c);
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
            jz5.g gVar = this.f521767g;
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f521768h).mo141623x754a37bb()).setAlpha(f18);
        }
    }
}
