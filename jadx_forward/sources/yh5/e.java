package yh5;

/* loaded from: classes3.dex */
public final class e extends lf3.n implements lf3.i {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f543958d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f543959e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.CheckBox f543960f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f543961g;

    /* renamed from: h, reason: collision with root package name */
    public yh5.g f543962h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f543963i;

    /* renamed from: m, reason: collision with root package name */
    public int f543964m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f543964m = -1;
    }

    @Override // lf3.n, lf3.o
    public int T6() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e2w;
    }

    public void V6(float f17) {
        android.view.View view = this.f543958d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBackgroundAlphaChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBackgroundAlphaChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    public void W6(float f17) {
        android.view.View view = this.f543958d;
        if (view != null) {
            float f18 = 1 - f17;
            if (f18 < view.getAlpha()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(f18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onExitProgressChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onExitProgressChanged", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    public final void X6(boolean z17) {
        this.f543961g = z17;
        android.widget.CheckBox checkBox = this.f543960f;
        if (checkBox != null && checkBox.isChecked() == z17) {
            return;
        }
        this.f543963i = true;
        android.widget.CheckBox checkBox2 = this.f543960f;
        if (checkBox2 != null) {
            checkBox2.setChecked(z17);
        }
        this.f543963i = false;
    }

    public final void Y6(int i17) {
        java.lang.Integer S;
        if (i17 < 0) {
            return;
        }
        this.f543964m = i17;
        yh5.g gVar = this.f543962h;
        boolean z17 = false;
        if (gVar != null) {
            if ((i17 >= 0 && (S = kz5.z.S(gVar.f543966e, i17)) != null) ? gVar.f543967f.get(S.intValue()) : false) {
                z17 = true;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanGalleryToolbarComponent", "updateSelectionForPosition position=" + i17 + " selected=" + z17);
        X6(z17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBeforeFinish */
    public void mo2275x62f76871(android.content.Intent intent) {
        android.view.ViewPropertyAnimator animate;
        android.view.View view = this.f543958d;
        if (view != null && (animate = view.animate()) != null) {
            animate.alpha(0.0f);
            animate.setDuration(200L);
            animate.start();
        }
        super.mo2275x62f76871(intent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onBeforeFinishAfterTransition */
    public void mo72291x8d1ceba0() {
        super.mo72291x8d1ceba0();
        android.view.View view = this.f543958d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBeforeFinishAfterTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/clean/CleanGalleryToolbarComponent", "onBeforeFinishAfterTransition", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f543958d = null;
    }

    @Override // lf3.o, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        this.f543958d = contentView;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanGalleryToolbarComponent", "onViewCreated");
        contentView.setClickable(true);
        contentView.setOnClickListener(yh5.b.f543955d);
        this.f543959e = contentView.findViewById(com.p314xaae8f345.mm.R.id.vg6);
        this.f543960f = (android.widget.CheckBox) contentView.findViewById(com.p314xaae8f345.mm.R.id.vg7);
        android.view.View view = this.f543959e;
        if (view != null) {
            view.setOnClickListener(new yh5.c(this));
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f543962h = (yh5.g) pf5.z.f435481a.a(activity).a(yh5.g.class);
        lf3.j jVar = (lf3.j) U6(lf3.j.class);
        if (jVar != null) {
            jVar.N3(this);
        }
        android.widget.CheckBox checkBox = this.f543960f;
        if (checkBox != null) {
            checkBox.setOnCheckedChangeListener(new yh5.d(this));
        }
        X6(this.f543961g);
    }
}
