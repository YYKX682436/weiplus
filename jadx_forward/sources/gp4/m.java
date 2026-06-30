package gp4;

/* loaded from: classes10.dex */
public final class m extends android.widget.LinearLayout implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public yz5.a f355950d;

    /* renamed from: e, reason: collision with root package name */
    public yz5.a f355951e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.a f355952f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.a f355953g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f355954h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f355955i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.ViewGroup f355956m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.ViewGroup f355957n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.ViewGroup f355958o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f355959p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f355960q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f355961r;

    public m(android.content.Context context) {
        super(context);
        this.f355959p = true;
        this.f355960q = jz5.h.b(new gp4.l(this));
        this.f355961r = jz5.h.b(new gp4.k(this));
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d0l, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.hip);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById;
        this.f355955i = viewGroup;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.him);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.hin);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById3;
        this.f355956m = viewGroup2;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.hil);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) findViewById4;
        this.f355957n = viewGroup3;
        android.view.View findViewById5 = findViewById(com.p314xaae8f345.mm.R.id.hio);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        android.view.ViewGroup viewGroup4 = (android.view.ViewGroup) findViewById5;
        this.f355958o = viewGroup4;
        b(viewGroup, com.p314xaae8f345.mm.R.raw.f79932xc85445e5, com.p314xaae8f345.mm.R.C30867xcad56011.k8h);
        b((android.view.ViewGroup) findViewById2, com.p314xaae8f345.mm.R.raw.f79697xe8d412c3, com.p314xaae8f345.mm.R.C30867xcad56011.k8e);
        b(viewGroup2, com.p314xaae8f345.mm.R.raw.f79857xfd4f1a25, com.p314xaae8f345.mm.R.C30867xcad56011.k8f);
        b(viewGroup3, com.p314xaae8f345.mm.R.raw.f79661xf633afce, com.p314xaae8f345.mm.R.C30867xcad56011.k8d);
        b(viewGroup4, com.p314xaae8f345.mm.R.raw.f79919xc85427c4, com.p314xaae8f345.mm.R.C30867xcad56011.k8g);
    }

    /* renamed from: getDownDrawable */
    private final android.graphics.drawable.Drawable m131974x7a2d9d6() {
        return (android.graphics.drawable.Drawable) ((jz5.n) this.f355961r).mo141623x754a37bb();
    }

    /* renamed from: getUpDrawable */
    private final android.graphics.drawable.Drawable m131975x4458e04f() {
        return (android.graphics.drawable.Drawable) ((jz5.n) this.f355960q).mo141623x754a37bb();
    }

    public final void a() {
        setBackground(m131974x7a2d9d6());
    }

    public final void b(android.view.ViewGroup viewGroup, int i17, int i18) {
        ((android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(i65.a.r(getContext(), i18));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.h5n)).setImageResource(i17);
        android.widget.ImageView imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.bs7);
        if (imageView != null) {
            imageView.setImageDrawable(i65.a.i(getContext(), com.p314xaae8f345.mm.R.raw.f80881x4db40400));
        }
        viewGroup.setOnClickListener(this);
    }

    public final void c() {
        setBackground(m131975x4458e04f());
    }

    /* renamed from: getDeleteListener */
    public final yz5.a m131976xc476a075() {
        return this.f355951e;
    }

    /* renamed from: getEditCaptionListener */
    public final yz5.a m131977x87958e1a() {
        return this.f355953g;
    }

    /* renamed from: getEditContentListener */
    public final yz5.a m131978x366ee5ad() {
        return this.f355952f;
    }

    /* renamed from: getEditTimeListener */
    public final yz5.a m131979xe5e4c941() {
        return this.f355950d;
    }

    /* renamed from: getReadTextListener */
    public final yz5.a m131980x98a1552d() {
        return this.f355954h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        yz5.a aVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.him) {
            yz5.a aVar2 = this.f355951e;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hip) {
            yz5.a aVar3 = this.f355950d;
            if (aVar3 != null) {
                aVar3.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hin) {
            yz5.a aVar4 = this.f355952f;
            if (aVar4 != null) {
                aVar4.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hil) {
            yz5.a aVar5 = this.f355953g;
            if (aVar5 != null) {
                aVar5.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.hio && (aVar = this.f355954h) != null) {
            aVar.mo152xb9724478();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/TimeEditMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setDeleteListener */
    public final void m131981x8c6d0881(yz5.a aVar) {
        this.f355951e = aVar;
    }

    /* renamed from: setEditCaptionListener */
    public final void m131982xd5da4d8e(yz5.a aVar) {
        this.f355953g = aVar;
    }

    /* renamed from: setEditContentListener */
    public final void m131983x84b3a521(yz5.a aVar) {
        this.f355952f = aVar;
    }

    /* renamed from: setEditTimeListener */
    public final void m131984x89e15e4d(yz5.a aVar) {
        this.f355950d = aVar;
    }

    /* renamed from: setReadTextListener */
    public final void m131985x3c9dea39(yz5.a aVar) {
        this.f355954h = aVar;
    }
}
