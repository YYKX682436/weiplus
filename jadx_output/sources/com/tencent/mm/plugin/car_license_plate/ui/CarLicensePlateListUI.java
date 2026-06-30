package com.tencent.mm.plugin.car_license_plate.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI;", "Lcom/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateBaseActivity;", "<init>", "()V", "rt1/r0", "rt1/s0", "rt1/t0", "rt1/u0", "plugin-car-license-plate_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class CarLicensePlateListUI extends com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel f94616e;

    /* renamed from: f, reason: collision with root package name */
    public rt1.z0 f94617f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView f94618g;

    /* renamed from: h, reason: collision with root package name */
    public rt1.r0 f94619h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f94620i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f94621m;

    /* renamed from: n, reason: collision with root package name */
    public final rt1.y0 f94622n = new rt1.y0(this);

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f94616e;
        if (carLicensePlateListViewContract$ViewModel != null) {
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo = carLicensePlateListViewContract$ViewModel.f94623d;
            intent.putExtra("RESULT_KEY_UPDATED_LIST", mMCarLicensePlateInfo != null ? mMCarLicensePlateInfo.f94604d : null);
            setResult(-1, intent);
        }
        super.finish();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return -1;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public void onPostCreate(android.os.Bundle bundle) {
        super.onPostCreate(bundle);
        setMMTitle(getString(com.tencent.mm.R.string.f490780ar2));
        setActionbarColor(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        setBackBtn(new rt1.v0(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        setBackBtnColorFilter(com.tencent.mm.R.color.f478599bx);
        getContentView().setBackgroundColor(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getController().E0(b3.l.getColor(this, com.tencent.mm.R.color.aaw));
        getIntent().setExtrasClassLoader(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel.class.getClassLoader());
        this.f94616e = (com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel) getIntent().getParcelableExtra("INTENT_KEY_VIEW_MODEL");
        rt1.p1 p1Var = new rt1.p1(qt1.g.f366525f);
        this.f94617f = p1Var;
        rt1.y0 y0Var = this.f94622n;
        y0Var.getClass();
        final com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI carLicensePlateListUI = y0Var.f399498a;
        android.view.View contentView = carLicensePlateListUI.getContentView();
        kotlin.jvm.internal.o.e(contentView, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) contentView;
        android.view.LayoutInflater.from(carLicensePlateListUI).inflate(com.tencent.mm.R.layout.f488266ok, viewGroup, true);
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.b6w);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        carLicensePlateListUI.f94620i = findViewById;
        findViewById.findViewById(com.tencent.mm.R.id.azw).setOnClickListener(new rt1.w0(carLicensePlateListUI));
        android.view.LayoutInflater.from(carLicensePlateListUI).inflate(com.tencent.mm.R.layout.f488269on, viewGroup, true);
        android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.b6x);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        carLicensePlateListUI.f94621m = findViewById2;
        com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase carPlateListRecyclerViewBase = new com.tencent.mm.plugin.car_license_plate.ui.CarPlateListRecyclerViewBase(carLicensePlateListUI);
        viewGroup.addView(carPlateListRecyclerViewBase, new android.view.ViewGroup.LayoutParams(-1, -1));
        carPlateListRecyclerViewBase.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(carLicensePlateListUI) { // from class: com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListUI$viewCallback$1$init$1$2$1
            {
                super(carLicensePlateListUI, 1, false);
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public int scrollVerticallyBy(int i17, androidx.recyclerview.widget.z2 z2Var, androidx.recyclerview.widget.h3 h3Var) {
                try {
                    return super.scrollVerticallyBy(i17, z2Var, h3Var);
                } catch (java.lang.IndexOutOfBoundsException unused) {
                    return 0;
                }
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean supportsPredictiveItemAnimations() {
                return false;
            }
        });
        carPlateListRecyclerViewBase.setPadding(0, carPlateListRecyclerViewBase.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479672c9), 0, 0);
        android.view.View inflate = android.view.LayoutInflater.from(carLicensePlateListUI).inflate(com.tencent.mm.R.layout.f488267ol, (android.view.ViewGroup) carPlateListRecyclerViewBase, false);
        inflate.setOnClickListener(new rt1.x0(carLicensePlateListUI));
        carPlateListRecyclerViewBase.addFooterView(inflate);
        carLicensePlateListUI.f94618g = carPlateListRecyclerViewBase;
        carPlateListRecyclerViewBase.setItemAnimator(new rt1.t0(carLicensePlateListUI));
        rt1.r0 r0Var = new rt1.r0(carLicensePlateListUI);
        r0Var.setHasStableIds(true);
        carLicensePlateListUI.f94619h = r0Var;
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView = carLicensePlateListUI.f94618g;
        if (mRecyclerView == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        mRecyclerView.setAdapter(r0Var);
        android.view.View view = carLicensePlateListUI.f94620i;
        if (view == null) {
            kotlin.jvm.internal.o.o("emptyView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/car_license_plate/ui/CarLicensePlateListUI$viewCallback$1", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.plugin.appbrand.widget.recyclerview.MRecyclerView mRecyclerView2 = carLicensePlateListUI.f94618g;
        if (mRecyclerView2 == null) {
            kotlin.jvm.internal.o.o("recyclerView");
            throw null;
        }
        mRecyclerView2.setVisibility(8);
        p1Var.f399473b = y0Var;
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel = this.f94616e;
        if (carLicensePlateListViewContract$ViewModel != null) {
            rt1.z0 z0Var = this.f94617f;
            if (z0Var == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            ((rt1.p1) z0Var).c(carLicensePlateListViewContract$ViewModel);
        } else {
            rt1.z0 z0Var2 = this.f94617f;
            if (z0Var2 == null) {
                kotlin.jvm.internal.o.o("presenter");
                throw null;
            }
            ((rt1.p1) z0Var2).c(new com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel(null, false, null, false));
        }
        rt1.z0 z0Var3 = this.f94617f;
        if (z0Var3 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        this.f94616e = ((rt1.p1) z0Var3).b();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPostCreate, viewModel.callbackAfterCreated:");
        com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel2 = this.f94616e;
        sb6.append(carLicensePlateListViewContract$ViewModel2 != null && carLicensePlateListViewContract$ViewModel2.f94624e);
        com.tencent.mars.xlog.Log.i("MicroMsg.CarLicensePlateListUI", sb6.toString());
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View provideCustomActivityContentView() {
        return new com.tencent.mm.view.TouchableLayout(this);
    }
}
