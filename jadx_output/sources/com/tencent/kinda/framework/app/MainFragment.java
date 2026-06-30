package com.tencent.kinda.framework.app;

@ul5.d(0)
/* loaded from: classes9.dex */
public class MainFragment extends com.tencent.kinda.framework.widget.base.BaseFragment {
    public static final java.lang.String TAG = "MicroMsg.MainFragment";
    private boolean hasInvokedOnBack = false;
    private com.tencent.kinda.gen.IUIPage page;
    private com.tencent.kinda.framework.widget.base.MMKViewLayout root;

    private void initPage() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.setPlatformFuncDelegate(this.pagePlatformFuncDelegate);
            this.page.setPlatformDelegate(this.pagePlatformDelegate);
            covertPlatformData(getActivity().getIntent().getBundleExtra("key_platform_data"));
            initWithNavigationBarConfig(this.page.defaultNavigationBarConfig());
            if (this.page.fullPageMode() && getController().G != null) {
                com.tencent.mars.xlog.Log.i(TAG, "UIPage is fullPageMode, so hide Actionbar.");
                getController().G.o();
            }
            com.tencent.mars.xlog.Log.i(TAG, "finish init page");
        }
    }

    private void setSystemUIByFullMode() {
        int colorByMode = (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.page.defaultNavigationBarConfig().mBackgroundColor);
        setActionBarColor(colorByMode);
        getController().E0(colorByMode);
    }

    public void attachPage(com.tencent.kinda.gen.IUIPage iUIPage) {
        this.page = iUIPage;
        this.mReportUrl = getReportUrl();
    }

    public void finalize() {
        super.finalize();
        com.tencent.mars.xlog.Log.i(TAG, "finalize " + this.page);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.kinda.framework.R.layout.kinda_main_container_layout_with_keyboard;
    }

    public com.tencent.kinda.gen.IUIPage getPage() {
        return this.page;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public java.lang.String getReportUrl() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        return iUIPage != null ? iUIPage.getReportUrl() : "";
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public java.lang.String getTagName() {
        return TAG;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean inVisibleOnRecently() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            return iUIPage.inVisibleOnRecently();
        }
        return false;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void initOnCreate() {
        initPage();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onCreate();
            initPageView();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void initPagePlatformDelegate() {
        super.initPagePlatformDelegate();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.setPlatformFuncDelegate(this.pagePlatformFuncDelegate);
            this.page.setPlatformDelegate(this.pagePlatformDelegate);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public boolean onBackPressed() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage == null) {
            return false;
        }
        iUIPage.onClickAndroidBack();
        return true;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.kinda.gen.IUIPage iUIPage;
        if (this.mCustomActioinBarController != null && (iUIPage = this.page) != null && iUIPage.forceShowInLightMode()) {
            this.mCustomActioinBarController.f208641e0 = false;
        }
        super.onCreate(bundle);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onCreateLayout(com.tencent.kinda.framework.widget.PlatformWrapLayout platformWrapLayout) {
        this.root = platformWrapLayout;
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onCreateLayout(platformWrapLayout);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null && !iUIPage.getReportUrl().equals("liteApp")) {
            if (!this.hasInvokedOnBack) {
                this.page.onBack();
                this.hasInvokedOnBack = true;
            }
            this.page.onDestroy();
        }
        this.page = null;
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onFirstLayoutFinished() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onFirstLayoutFinished();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnPause() {
        super.onFragmentOnPause();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onPause();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnResume() {
        super.onFragmentOnResume();
        setSystemUIByFullMode();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onWillVisible();
            this.page.onResume();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void onKeyboardShow(boolean z17, int i17) {
        com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl uIPagePlatformFuncDelegateImpl = this.pagePlatformFuncDelegate;
        if (uIPagePlatformFuncDelegateImpl != null) {
            uIPagePlatformFuncDelegateImpl.onKeyboardShow(z17, i17);
        }
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            if (z17) {
                iUIPage.keyboardWillShow(i17);
            } else {
                iUIPage.keyboardWillHide();
            }
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.mm.ui.MMFragment
    public void onSwipeBack() {
        super.onSwipeBack();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage == null || this.hasInvokedOnBack) {
            return;
        }
        iUIPage.onBack();
        this.hasInvokedOnBack = true;
    }

    public void refreshNavigationBar() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            initWithNavigationBarConfig(iUIPage.defaultNavigationBarConfig());
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void setTopRightBtnImage(java.lang.String str) {
        this.pagePlatformFuncDelegate.setTopRightBtnImage(str);
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void setTopRightBtnTitle(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor) {
        this.pagePlatformFuncDelegate.setTopRightBtnTitle(str, com.tencent.kinda.framework.widget.tools.MMKViewUtil.colorToString(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor)));
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment, com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage == null) {
            return false;
        }
        return iUIPage.enableInteractivePop();
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void willActive() {
        super.willActive();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onVisible();
        }
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(true);
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.BaseFragment
    public void willDeActive() {
        super.willDeActive();
        com.tencent.kinda.gen.IUIPage iUIPage = this.page;
        if (iUIPage != null) {
            iUIPage.onInvisible();
            hideKeyboard();
        }
        if (getSwipeBackLayout() != null) {
            getSwipeBackLayout().setEnableGesture(false);
        }
    }
}
