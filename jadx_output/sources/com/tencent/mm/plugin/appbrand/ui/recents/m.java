package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public abstract class m extends com.tencent.mm.plugin.appbrand.ui.recents.c implements android.view.View.OnClickListener {

    /* renamed from: e, reason: collision with root package name */
    public final androidx.fragment.app.FragmentActivity f90117e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f90118f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f90119g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f90120h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f90121i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.plugin.gif.MMAnimateView f90122m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f90123n;

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View f90124o;

    /* renamed from: p, reason: collision with root package name */
    public r45.fl0 f90125p;

    public m(androidx.fragment.app.FragmentActivity fragmentActivity, android.view.ViewGroup viewGroup) {
        super(fragmentActivity, viewGroup);
        this.f90117e = fragmentActivity;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) android.view.LayoutInflater.from(fragmentActivity).inflate(com.tencent.mm.R.layout.f488082gh, viewGroup, false);
        this.f90118f = viewGroup2;
        viewGroup2.setOnClickListener(this);
        ((android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.obc)).setText(m());
        this.f90119g = (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.f483108ws);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) viewGroup2.findViewById(com.tencent.mm.R.id.h5n);
        this.f90124o = viewGroup2.findViewById(com.tencent.mm.R.id.lqe);
        if (weImageView != null) {
            j(weImageView);
        }
        this.f90120h = viewGroup2.findViewById(com.tencent.mm.R.id.mvv);
        this.f90121i = (android.widget.ImageView) viewGroup2.findViewById(com.tencent.mm.R.id.mvw);
        this.f90122m = (com.tencent.mm.plugin.gif.MMAnimateView) viewGroup2.findViewById(com.tencent.mm.R.id.mvx);
        this.f90123n = (android.widget.TextView) viewGroup2.findViewById(com.tencent.mm.R.id.mvy);
    }

    public void a(r45.fl0 fl0Var) {
        n(fl0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public android.view.View c() {
        return this.f90118f;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void e() {
        l(true);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void f() {
        this.f90122m.y();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void g() {
        this.f90122m.pause();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void h() {
        n(this.f90125p);
        this.f90122m.resume();
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void i(int i17) {
        android.widget.ImageView imageView = this.f90119g;
        if (imageView != null) {
            imageView.setVisibility(i17);
        }
        android.view.ViewGroup viewGroup = this.f90118f;
        android.widget.TextView textView = (android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.obc);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = viewGroup.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f480067n3);
        textView.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void k(int i17) {
        this.f90118f.setBackgroundResource(i17);
    }

    public abstract java.lang.String m();

    public void n(r45.fl0 fl0Var) {
        com.tencent.mm.plugin.appbrand.appusage.t6 t6Var;
        if (fl0Var == null) {
            return;
        }
        this.f90125p = fl0Var;
        int i17 = fl0Var.f374420f;
        com.tencent.mm.plugin.appbrand.appusage.t6.f76572d.getClass();
        com.tencent.mm.plugin.appbrand.appusage.t6[] values = com.tencent.mm.plugin.appbrand.appusage.t6.values();
        int length = values.length;
        int i18 = 0;
        while (true) {
            if (i18 >= length) {
                t6Var = null;
                break;
            }
            t6Var = values[i18];
            if (i17 == t6Var.ordinal()) {
                break;
            } else {
                i18++;
            }
        }
        if (t6Var == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("AppBrandLauncherListHeaderFolderEntrance", "[showShowCaseView]  wording=" + fl0Var.f374421g + " icon_url=" + fl0Var.f374422h + " icon_url2=" + fl0Var.f374423i);
        com.tencent.mm.plugin.appbrand.ui.recents.l lVar = new com.tencent.mm.plugin.appbrand.ui.recents.l(fl0Var.f374422h, fl0Var.f374423i, new com.tencent.mm.plugin.appbrand.ui.recents.h(this, fl0Var, t6Var));
        java.lang.String str = lVar.f90109a;
        if (!android.text.TextUtils.isEmpty(str)) {
            l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.ui.recents.i(lVar), str, null);
        }
        java.lang.String str2 = lVar.f90110b;
        if (android.text.TextUtils.isEmpty(str2)) {
            return;
        }
        l01.d0.f314761a.o(str2, new com.tencent.mm.plugin.appbrand.ui.recents.j(lVar));
    }

    public final void o() {
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f90120h, "alpha", 0.0f, 1.0f);
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
