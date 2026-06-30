package r23;

/* loaded from: classes4.dex */
public final class c implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f450343d;

    /* renamed from: e, reason: collision with root package name */
    public final r45.ib6 f450344e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f450345f;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.j0 f450346g;

    /* renamed from: h, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.g0 f450347h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.LinearLayout f450348i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.ImageButton f450349m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f450350n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.LinearLayout f450351o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f450352p;

    /* renamed from: q, reason: collision with root package name */
    public int f450353q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.a f450354r;

    public c(java.lang.ref.WeakReference weakReference, r45.ib6 ib6Var) {
        android.widget.LinearLayout linearLayout;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd;
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd2;
        android.content.Intent intent;
        this.f450343d = weakReference;
        this.f450344e = ib6Var;
        boolean booleanExtra = (weakReference == null || (activityC15653x403456cd2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference.get()) == null || (intent = activityC15653x403456cd2.getIntent()) == null) ? false : intent.getBooleanExtra("key_sns_publish_template", false);
        this.f450345f = booleanExtra;
        r23.a[] aVarArr = r23.a.f450341d;
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0(0);
        this.f450346g = j0Var;
        this.f450347h = j0Var;
        this.f450353q = 1;
        this.f450354r = r23.b.f450342d;
        java.lang.ref.WeakReference weakReference2 = this.f450343d;
        if (weakReference2 != null && (activityC15653x403456cd = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd) weakReference2.get()) != null) {
            this.f450348i = (android.widget.LinearLayout) activityC15653x403456cd.findViewById(com.p314xaae8f345.mm.R.id.o17);
            this.f450349m = (android.widget.ImageButton) activityC15653x403456cd.findViewById(com.p314xaae8f345.mm.R.id.f568787o12);
            this.f450350n = (android.widget.TextView) activityC15653x403456cd.findViewById(com.p314xaae8f345.mm.R.id.o1l);
            if (activityC15653x403456cd instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1730x373aa5.C15671x6622f12e g86 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15657x27c936d2) activityC15653x403456cd).g8();
                g86 = g86 instanceof android.view.View ? g86 : null;
                if (g86 != null) {
                    this.f450348i = (android.widget.LinearLayout) g86.findViewById(com.p314xaae8f345.mm.R.id.o17);
                    this.f450349m = (android.widget.ImageButton) g86.findViewById(com.p314xaae8f345.mm.R.id.f568787o12);
                    this.f450350n = (android.widget.TextView) g86.findViewById(com.p314xaae8f345.mm.R.id.o1l);
                }
            }
            android.widget.TextView textView = this.f450350n;
            if (textView != null) {
                textView.setTextSize(0, i65.a.f(activityC15653x403456cd, com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
            }
            this.f450351o = (android.widget.LinearLayout) activityC15653x403456cd.findViewById(com.p314xaae8f345.mm.R.id.f568785o10);
            this.f450352p = (android.widget.TextView) activityC15653x403456cd.findViewById(com.p314xaae8f345.mm.R.id.f568786o11);
        }
        android.widget.ImageButton imageButton = this.f450349m;
        if (imageButton != null) {
            imageButton.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f450350n;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        if (booleanExtra && (linearLayout = this.f450348i) != null) {
            linearLayout.setVisibility(0);
        }
        if ((ib6Var != null ? ib6Var.f458443e : null) != null) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            b(0);
        }
    }

    public final boolean a() {
        java.lang.Integer num = (java.lang.Integer) this.f450347h.mo3195x754a37bb();
        r23.a[] aVarArr = r23.a.f450341d;
        return num == null || num.intValue() != 0;
    }

    public final void b(int i17) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f450346g;
        if (i17 == 0) {
            android.widget.ImageButton imageButton = this.f450349m;
            if (imageButton != null) {
                imageButton.setSelected(true);
            }
            android.widget.ImageButton imageButton2 = this.f450349m;
            if (imageButton2 != null) {
                imageButton2.setEnabled(false);
            }
            android.widget.TextView textView = this.f450350n;
            if (textView != null) {
                textView.setClickable(false);
            }
            r23.a[] aVarArr = r23.a.f450341d;
            j0Var.mo523x53d8522f(2);
            this.f450353q = 2;
        } else if (a()) {
            android.widget.ImageButton imageButton3 = this.f450349m;
            if (imageButton3 != null) {
                imageButton3.setSelected(true);
            }
            android.widget.ImageButton imageButton4 = this.f450349m;
            if (imageButton4 != null) {
                imageButton4.setEnabled(true);
            }
            android.widget.TextView textView2 = this.f450350n;
            if (textView2 != null) {
                textView2.setClickable(true);
            }
            r23.a[] aVarArr2 = r23.a.f450341d;
            j0Var.mo523x53d8522f(1);
            this.f450353q = 1;
        }
        if (a()) {
            ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if ((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f568787o12) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.o1l)) {
            java.lang.Integer num = (java.lang.Integer) this.f450347h.mo3195x754a37bb();
            r23.a[] aVarArr = r23.a.f450341d;
            if (num != null && num.intValue() == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryTemplateUI", "onClick: not enable to change");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            if (!a() && !((java.lang.Boolean) this.f450354r.mo152xb9724478()).booleanValue()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryTemplateUI", "not enable to select");
                yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = this.f450346g;
            if (a()) {
                r23.a[] aVarArr2 = r23.a.f450341d;
                i17 = 0;
            } else {
                r23.a[] aVarArr3 = r23.a.f450341d;
                i17 = 1;
            }
            j0Var.mo523x53d8522f(i17);
            android.widget.ImageButton imageButton = this.f450349m;
            if (imageButton != null) {
                imageButton.setSelected(a());
            }
            if (a()) {
                ((ez0.i) ((uy0.h) i95.n0.c(uy0.h.class))).Ai(true);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/gallery/mjtemplate/AlbumTemplateUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
