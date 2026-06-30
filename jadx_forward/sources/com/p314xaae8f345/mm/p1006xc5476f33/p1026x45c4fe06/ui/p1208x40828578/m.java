package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public abstract class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f171650e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f171651f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f171652g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f171653h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f171654i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 f171655m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f171656n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f171657o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fl0 f171658p;

    public m(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, android.view.ViewGroup viewGroup) {
        super(activityC1102x9ee2d9f, viewGroup);
        this.f171650e = activityC1102x9ee2d9f;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(activityC1102x9ee2d9f).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569615gh, viewGroup, false);
        this.f171651f = viewGroup2;
        viewGroup2.setOnClickListener(this);
        ((android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(m());
        this.f171652g = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.f564641ws);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        this.f171657o = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.lqe);
        if (c22699x3dcdb352 != null) {
            j(c22699x3dcdb352);
        }
        this.f171653h = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mvv);
        this.f171654i = (android.widget.ImageView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mvw);
        this.f171655m = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mvx);
        this.f171656n = (android.widget.TextView) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.mvy);
    }

    public void a(r45.fl0 fl0Var) {
        n(fl0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public android.view.View c() {
        return this.f171651f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void e() {
        l(true);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void f() {
        this.f171655m.y();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void g() {
        this.f171655m.m64932x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void h() {
        n(this.f171658p);
        this.f171655m.m64933xc84dc82d();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void i(int i17) {
        android.widget.ImageView imageView = this.f171652g;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
        android.view.ViewGroup viewGroup = this.f171651f;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.obc);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = viewGroup.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561600n3);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void k(int i17) {
        this.f171651f.setBackgroundResource(i17);
    }

    public abstract java.lang.String m();

    public void n(r45.fl0 fl0Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t6 t6Var;
        if (fl0Var == null) {
            return;
        }
        this.f171658p = fl0Var;
        int i17 = fl0Var.f455953f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t6.f158105d.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t6[] m49826xcee59d22 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1034x46d13020.t6.m49826xcee59d22();
        int length = m49826xcee59d22.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                t6Var = null;
                break;
            }
            t6Var = m49826xcee59d22[i18];
            if (i17 == t6Var.ordinal()) {
                break;
            } else {
                i18++;
            }
        }
        if (t6Var == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AppBrandLauncherListHeaderFolderEntrance", "[showShowCaseView]  wording=" + fl0Var.f455954g + " icon_url=" + fl0Var.f455955h + " icon_url2=" + fl0Var.f455956i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l lVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.l(fl0Var.f455955h, fl0Var.f455956i, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.h(this, fl0Var, t6Var));
        java.lang.String str = lVar.f171642a;
        if (!android.text.TextUtils.isEmpty(str)) {
            l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.i(lVar), str, null);
        }
        java.lang.String str2 = lVar.f171643b;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        l01.d0.f396294a.o(str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.j(lVar));
    }

    public final void o() {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f171653h, "alpha", 0.0f, 1.0f);
        ofFloat.setDuration(30L);
        ofFloat.start();
    }

    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/ui/recents/AppBrandLauncherListHeaderFolderEntrance", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
