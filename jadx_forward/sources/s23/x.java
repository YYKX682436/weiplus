package s23;

/* loaded from: classes4.dex */
public final class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final s23.o f483876d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ib6 f483877e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f483878f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.ImageButton f483879g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f483880h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f483881i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f483882m;

    /* renamed from: n, reason: collision with root package name */
    public int f483883n;

    /* renamed from: o, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f483884o;

    /* renamed from: p, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f483885p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.a f483886q;

    /* renamed from: r, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f483887r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.l f483888s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f483889t;

    /* renamed from: u, reason: collision with root package name */
    public k33.b f483890u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f483891v;

    public x(s23.o templateView, r45.ib6 ib6Var) {
        android.widget.LinearLayout linearLayout;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateView, "templateView");
        this.f483876d = templateView;
        this.f483877e = ib6Var;
        this.f483883n = 1;
        s23.n nVar = s23.n.f483842d;
        java.lang.Object mo3195x754a37bb = s23.n.f483852q.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb);
        this.f483884o = new p012xc85e97e9.p093xedfae76a.j0(java.lang.Integer.valueOf(((java.lang.Number) mo3195x754a37bb).intValue()));
        java.lang.Object mo3195x754a37bb2 = s23.n.f483853r.mo3195x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo3195x754a37bb2);
        this.f483885p = new p012xc85e97e9.p093xedfae76a.j0((java.lang.String) mo3195x754a37bb2);
        this.f483886q = s23.r.f483861d;
        p3325xe03a0797.p3326xc267989b.y0 a17 = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392101a);
        this.f483887r = a17;
        this.f483889t = s23.u.f483869d;
        this.f483891v = jz5.h.b(s23.v.f483870d);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo126862x19263085 = templateView.mo126862x19263085();
        this.f483878f = (android.widget.LinearLayout) mo126862x19263085.findViewById(com.p314xaae8f345.mm.R.id.o17);
        this.f483879g = (android.widget.ImageButton) mo126862x19263085.findViewById(com.p314xaae8f345.mm.R.id.f568787o12);
        this.f483880h = (android.widget.TextView) mo126862x19263085.findViewById(com.p314xaae8f345.mm.R.id.o1l);
        if (mo126862x19263085 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15671x6622f12e g86 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2) mo126862x19263085).g8();
            g86 = g86 instanceof android.view.View ? g86 : null;
            if (g86 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJTemplateUI", "initView: albumFooterBarDelegate null");
            }
            if (g86 != null) {
                this.f483878f = (android.widget.LinearLayout) g86.findViewById(com.p314xaae8f345.mm.R.id.o17);
                this.f483879g = (android.widget.ImageButton) g86.findViewById(com.p314xaae8f345.mm.R.id.f568787o12);
                this.f483880h = (android.widget.TextView) g86.findViewById(com.p314xaae8f345.mm.R.id.o1l);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "initView: albumFooterBarDelegate from SnsPostAlbumUI");
            }
        }
        android.widget.TextView textView = this.f483880h;
        if (textView != null) {
            textView.setTextSize(0, i65.a.f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        }
        this.f483881i = (android.widget.LinearLayout) mo126862x19263085.findViewById(com.p314xaae8f345.mm.R.id.f568785o10);
        this.f483882m = (android.widget.TextView) mo126862x19263085.findViewById(com.p314xaae8f345.mm.R.id.f568786o11);
        android.widget.ImageButton imageButton = this.f483879g;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f483880h;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (s23.n.f483856u) {
            android.widget.LinearLayout linearLayout2 = this.f483878f;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            }
            android.widget.ImageButton imageButton2 = this.f483879g;
            if (imageButton2 != null) {
                imageButton2.setSelected(d());
            }
            if (templateView.d() && !c()) {
                p3325xe03a0797.p3326xc267989b.l.d(a17, null, null, new s23.t(this, null), 3, null);
            }
        }
        if (!templateView.a() && (linearLayout = this.f483881i) != null) {
            linearLayout.setVisibility(8);
        }
        if (c()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            e(0, null);
        }
    }

    public final uy0.g a() {
        return (uy0.g) ((jz5.n) this.f483891v).mo141623x754a37bb();
    }

    public final void b(r45.d2 d2Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipPositiveEvent: selected=" + d());
        yz5.l lVar = this.f483888s;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Long.valueOf(d2Var.f453537m));
        }
    }

    public final boolean c() {
        r45.ib6 ib6Var = this.f483877e;
        return (ib6Var != null ? ib6Var.f458443e : null) != null;
    }

    public final boolean d() {
        java.lang.Integer num = (java.lang.Integer) this.f483884o.mo3195x754a37bb();
        s23.a[] aVarArr = s23.a.f483830d;
        return num == null || num.intValue() != 0;
    }

    public final void e(int i17, java.lang.Boolean bool) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f483884o;
        if (i17 == 0) {
            android.widget.ImageButton imageButton = this.f483879g;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            android.widget.ImageButton imageButton2 = this.f483879g;
            if (imageButton2 != null) {
                imageButton2.setEnabled(bool != null ? bool.booleanValue() : false);
            }
            android.widget.TextView textView = this.f483880h;
            if (textView != null) {
                textView.setClickable(false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED_NO_ENABLE_CHANGE.value");
            s23.a[] aVarArr = s23.a.f483830d;
            j0Var.mo523x53d8522f(2);
            this.f483883n = 2;
        } else if (d()) {
            android.widget.ImageButton imageButton3 = this.f483879g;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            android.widget.ImageButton imageButton4 = this.f483879g;
            if (imageButton4 != null) {
                imageButton4.setEnabled(bool != null ? bool.booleanValue() : true);
            }
            android.widget.TextView textView2 = this.f483880h;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJTemplateUI", "[updateTemplateView] selectTemplateState.value = MJTemplateHandleNew.TemplateSelectType.SELECTED.value");
            s23.a[] aVarArr2 = s23.a.f483830d;
            j0Var.mo523x53d8522f(1);
            this.f483883n = 1;
        }
        if (d()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568787o12) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.o1l)) != false) {
            if (!d() && !((java.lang.Boolean) this.f483886q.mo152xb9724478()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MJTemplateUI", "not enable to select");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            d();
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f483884o;
            if (d()) {
                s23.a[] aVarArr = s23.a.f483830d;
                i17 = 0;
            } else {
                s23.a[] aVarArr2 = s23.a.f483830d;
                i17 = 1;
            }
            j0Var.mo523x53d8522f(i17);
            android.widget.ImageButton imageButton = this.f483879g;
            if (imageButton != null) {
                imageButton.setSelected(d());
            }
            s23.n nVar = s23.n.f483842d;
            s23.n.f483857v = d() ? 1 : 0;
            if (d()) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
                ((s23.m) s23.n.f483860y).mo152xb9724478();
            }
            r45.d2 d2Var = (r45.d2) this.f483889t.mo152xb9724478();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkHitAliveActivityTemplateTip: ");
            sb6.append(d2Var != null ? java.lang.Long.valueOf(d2Var.f453537m) : null);
            sb6.append(", ");
            sb6.append(d());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", sb6.toString());
            if (d2Var == null || !d()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateUI", "hitActivityTipNegativeEvent: ");
                yz5.l lVar = this.f483888s;
                if (lVar != null) {
                    lVar.mo146xb9724478(0L);
                }
            } else {
                b(d2Var);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/refactor/MJTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
