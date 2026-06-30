package hx2;

/* loaded from: classes2.dex */
public final class g extends hx2.i {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f367180b;

    /* renamed from: c, reason: collision with root package name */
    public final int f367181c;

    /* renamed from: d, reason: collision with root package name */
    public final int f367182d;

    /* renamed from: e, reason: collision with root package name */
    public final int f367183e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f367184f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f367185g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f367186h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f367187i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f367188j;

    public /* synthetic */ g(android.content.Context context, int i17, int i18, int i19, boolean z17, boolean z18, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(context, (i27 & 2) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f : i17, (i27 & 4) != 0 ? com.p314xaae8f345.mm.R.C30859x5a72f63.f77645xad7ef2c : i18, (i27 & 8) != 0 ? com.p314xaae8f345.mm.R.C30861xcebc809e.abt : i19, (i27 & 16) != 0 ? true : z17, (i27 & 32) != 0 ? false : z18);
    }

    @Override // hx2.i
    public android.view.View a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        android.view.View findViewById;
        android.view.View findViewById2;
        android.view.View view = this.f367188j;
        android.content.Context context = this.f367180b;
        if (view == null) {
            this.f367188j = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b6j, (android.view.ViewGroup) null);
        }
        android.view.View view2 = this.f367188j;
        if (view2 != null && (findViewById2 = view2.findViewById(com.p314xaae8f345.mm.R.id.f566749gy1)) != null) {
            findViewById2.setBackgroundResource(this.f367183e);
        }
        android.view.View view3 = this.f367188j;
        boolean z17 = this.f367184f;
        if (view3 != null && (findViewById = view3.findViewById(com.p314xaae8f345.mm.R.id.gxy)) != null) {
            if (!z17 && !this.f367185g) {
                findViewById.getLayoutParams().height = -2;
            }
            findViewById.setBackgroundColor(context.getResources().getColor(this.f367181c));
        }
        android.view.View view4 = this.f367188j;
        if (view4 != null && (c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view4.findViewById(com.p314xaae8f345.mm.R.id.gxz)) != null) {
            c22699x3dcdb352.setVisibility(z17 ? 0 : 8);
            c22699x3dcdb352.m82040x7541828(context.getResources().getColor(this.f367182d));
        }
        return this.f367188j;
    }

    @Override // hx2.i
    public void e(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        jz5.g gVar = this.f367186h;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
        layoutParams.height = i65.a.b(this.f367180b, 4);
        view.setLayoutParams(layoutParams);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f367187i).mo141623x754a37bb()).setAlpha(0.0f);
    }

    @Override // hx2.i
    public void g(gx2.q layout, float f17, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.g(layout, f17, source);
        if (this.f367184f) {
            float m62616x9c78005c = layout.m62616x9c78005c();
            float m62616x9c78005c2 = layout.m62616x9c78005c();
            android.content.Context context = this.f367180b;
            float b17 = (f17 - m62616x9c78005c) / ((m62616x9c78005c2 + i65.a.b(context, 56)) - m62616x9c78005c);
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
            jz5.g gVar = this.f367186h;
            android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
            android.view.ViewGroup.LayoutParams layoutParams = ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).getLayoutParams();
            layoutParams.height = (int) (b19 + (f19 * (b18 - b19)));
            view.setLayoutParams(layoutParams);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) this.f367187i).mo141623x754a37bb()).setAlpha(f18);
        }
    }

    public g(android.content.Context context, int i17, int i18, int i19, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f367180b = context;
        this.f367181c = i17;
        this.f367182d = i18;
        this.f367183e = i19;
        this.f367184f = z17;
        this.f367185g = z18;
        this.f367186h = jz5.h.b(new hx2.f(this));
        this.f367187i = jz5.h.b(new hx2.d(this));
        jz5.h.b(new hx2.e(this));
    }
}
