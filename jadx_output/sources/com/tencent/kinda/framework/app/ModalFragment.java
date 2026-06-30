package com.tencent.kinda.framework.app;

@ul5.d(0)
/* loaded from: classes9.dex */
public class ModalFragment extends com.tencent.kinda.framework.widget.base.BaseFragment {
    public static final java.lang.String TAG = "MicroMsg.ModalFragment";
    private byte _hellAccFlag_;
    private androidx.fragment.app.Fragment mPreFragment;
    private android.view.View mViewCenterPadding;
    private int orientationOnCreate = 0;
    private com.tencent.kinda.gen.IUIModal page;

    private int getBlackMaskColorRes() {
        return com.tencent.mm.ui.bk.C() ? com.tencent.mm.R.color.a_m : com.tencent.mm.R.color.a_n;
    }

    private void initCenterPaddingView(android.view.View view) {
        if (view != null) {
            this.mViewCenterPadding = view.findViewById(com.tencent.kinda.framework.R.id.view_center_padding);
            int p17 = com.tencent.mm.ui.bk.p(getContext());
            android.view.View view2 = this.mViewCenterPadding;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/kinda/framework/app/ModalFragment", "initCenterPaddingView", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewGroup.LayoutParams layoutParams = this.mViewCenterPadding.getLayoutParams();
            layoutParams.height = p17;
            this.mViewCenterPadding.setLayoutParams(layoutParams);
        }
    }

    private void initPage() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.setPlatformDelegate(this.pagePlatformDelegate);
            this.page.setFuncDelegate(this.uiModalFuncDelegate);
            covertPlatformData(getActivity().getIntent().getBundleExtra("key_platform_data"));
            if (useKeyboardCoverMode()) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.tencent.kinda.framework.R.id.kinda_main_container);
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) findViewById(com.tencent.kinda.framework.R.id.container_layout);
                android.view.View findViewById = findViewById(com.tencent.mm.R.id.o1v);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/kinda/framework/app/ModalFragment", "initPage", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                viewGroup.removeView(findViewById);
                android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
                layoutParams.gravity = 80;
                viewGroup2.addView(findViewById, layoutParams);
            }
            com.tencent.mars.xlog.Log.i(TAG, "finish init page");
        }
    }

    private void setCenterPaddingColor(int i17) {
        android.view.View view = this.mViewCenterPadding;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    private void setupActionAndStatusBarColor() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal == null || iUIModal.statusbarColor() == null || this.page.statusbarColor().mNormalColor <= 0) {
            com.tencent.mars.xlog.Log.w(TAG, "uimodal should override statusbarColor");
            androidx.fragment.app.Fragment prevFragment = getPrevFragment();
            this.mPreFragment = prevFragment;
            if (prevFragment == null) {
                int color = getContext().getResources().getColor(getBlackMaskColorRes());
                setActionBarColor(color);
                setCenterPaddingColor(color);
            } else if (prevFragment instanceof com.tencent.kinda.framework.app.ModalFragment) {
                ((com.tencent.kinda.framework.app.ModalFragment) prevFragment).getController().u();
                setCenterPaddingColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
                setActionBarColor(0);
            } else if (prevFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
                int u17 = ((com.tencent.kinda.framework.app.MainFragment) prevFragment).getController().u();
                int color2 = getContext().getResources().getColor(getBlackMaskColorRes());
                setActionBarColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.MergeColors(u17, color2));
                setCenterPaddingColor(color2);
            }
        } else {
            setActionBarColor((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.page.statusbarColor()));
        }
        refreshNavigationBar();
    }

    public void attachModal(com.tencent.kinda.gen.IUIModal iUIModal) {
        this.page = iUIModal;
        this.mReportUrl = getReportUrl();
    }

    public void finalize() {
        super.finalize();
        com.tencent.mars.xlog.Log.i(TAG, "finalize " + this.page);
    }

    public com.tencent.kinda.gen.IUIModal getPage() {
        return this.page;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public java.lang.String getReportUrl() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        return iUIModal != null ? iUIModal.getReportUrl() : "";
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public java.lang.String getTagName() {
        return TAG;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean inVisibleOnRecently() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.inVisibleOnRecently();
        }
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void initOnCreate() {
        getController().G.o();
        initPage();
        if (this.page != null) {
            initPageView();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean onBackPressed() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal == null) {
            return false;
        }
        iUIModal.onClickAndroidBack();
        return true;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.kinda.gen.IUIModal iUIModal;
        super.onConfigurationChanged(configuration);
        if (configuration.orientation != this.orientationOnCreate && (iUIModal = this.page) != null) {
            iUIModal.viewDidTransitionToNewSize();
        }
        this.orientationOnCreate = configuration.orientation;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onCreateLayout(com.tencent.kinda.framework.widget.PlatformWrapLayout platformWrapLayout) {
        this.page.onCreateLayout(platformWrapLayout);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        android.view.View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (getContext() != null && this.page.IsShowAndroidCenterPadding()) {
            initCenterPaddingView(onCreateView);
        }
        this.orientationOnCreate = getMMResources().getConfiguration().orientation;
        return onCreateView;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.onDestroy();
        }
        this.page = null;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onFirstRenderFinish() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            iUIModal.onFirstRenderFinish();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnResume() {
        super.onFragmentOnResume();
        setupActionAndStatusBarColor();
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onKeyboardShow(boolean z17, int i17) {
        com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl uIPagePlatformFuncDelegateImpl = this.pagePlatformFuncDelegate;
        if (uIPagePlatformFuncDelegateImpl != null) {
            uIPagePlatformFuncDelegateImpl.onKeyboardShow(z17, i17);
        }
        com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl uIModalFuncDelegateImpl = this.uiModalFuncDelegate;
        if (uIModalFuncDelegateImpl != null) {
            uIModalFuncDelegateImpl.onKeyboardShow(z17, i17);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (this.page == null || !getIsEnterBackground()) {
            return;
        }
        this.page.onModalEnterForeground();
        setIsEnterBackground(false);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (this.page == null || getWillBeRemoved()) {
            return;
        }
        this.page.onModalEnterBackground();
        setIsEnterBackground(true);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        super.onViewCreated(view, bundle);
        setupActionAndStatusBarColor();
    }

    public void refreshNavigationBar() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal == null || iUIModal.navigationBarColor() == null || this.page.navigationBarColor().mNormalColor <= 0) {
            return;
        }
        getController().E0((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByModeNoCompat(this.page.navigationBarColor()));
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void restoreActionBarColor() {
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void setTopRightBtnImage(java.lang.String str) {
        this.pagePlatformFuncDelegate.setTopRightBtnImage(str);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void setTopRightBtnTitle(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.pagePlatformFuncDelegate.setTopRightBtnTitle(str, com.tencent.kinda.framework.widget.tools.MMKViewUtil.colorToString(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean useImmediateKeyboardAnimation() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.useImmediateKeyboardAnimation();
        }
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean useKeyboardCoverMode() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.useKeyboardCoverMode();
        }
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean usePanelModalMode() {
        com.tencent.kinda.gen.IUIModal iUIModal = this.page;
        if (iUIModal != null) {
            return iUIModal.usePanelModalMode();
        }
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void willActive() {
        super.willActive();
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void willDeActive() {
        super.willDeActive();
    }
}
