package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public abstract class BaseFragment extends com.tencent.kinda.framework.widget.base.LifecycleFragment implements android.view.View.OnTouchListener {
    public static final int SERVICE_SAFETY_ACTION_TYPE_DEFAULT = 0;
    public static final int SERVICE_SAFETY_ACTION_TYPE_REPORT_ELEMENT = 1;
    public static final int SERVICE_SAFETY_ACTION_TYPE_REPORT_NONE = 2;
    public static final int SERVICE_SAFETY_ACTION_TYPE_REPORT_NONE_AND_SHOW_DIALOG = 3;
    public static final java.lang.String TAG = "MicroMsg.BaseFragment";
    public static final java.lang.String URL_CHECK_PAY_PWD = "CheckPayPwd";
    public static final java.lang.String URL_PAY_DESK_MAIN = "payDeskMain";
    private byte _hellAccFlag_;
    protected com.tencent.kinda.framework.widget.base.IEventFragment fragEvent;
    private com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife life;
    private com.tencent.kinda.framework.widget.base.BaseFragment mCoveredFragment;
    private m05.p mReportUIC;
    protected java.lang.String mReportUrl;
    protected com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl pagePlatformDelegate;
    protected com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl pagePlatformFuncDelegate;
    protected android.view.ViewGroup rootLayout;
    protected android.widget.FrameLayout statusBarSpaceView;
    protected com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl uiModalFuncDelegate;
    private androidx.appcompat.widget.ActionBarContainer mActionBarContainer = null;
    public com.tencent.mm.ui.yb mCustomActioinBarController = null;
    private boolean isActive = false;
    private boolean willBeRemoved = false;
    private boolean isEnterBackground = false;
    public boolean isTinyApp = false;
    public java.lang.String tinyAppUserName = "";
    public boolean showSingleActionStWcKbWhenHide = false;
    private com.tencent.mm.sdk.platformtools.n3 wcpayKeyboardAnimationHandler = null;
    public boolean inVisibleOnRecentlyFromLast = false;
    public boolean isWebUI = false;
    public java.lang.String webRawUrl = "";
    public java.lang.String webFromKindaId = "";
    public int enterAnimStyle = 1;
    private long useTime = 0;
    private boolean hasCheckAccessibilitySecurityServiceList = false;
    private boolean needBlockAccessibility = false;
    private long statusBarColor = -1;

    public BaseFragment() {
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.didObjCreated(hashCode());
    }

    private void calculateStatusBarColor(int i17) {
        fp.m.e();
        this.statusBarSpaceView.setBackgroundColor(i17);
        getController().O0(com.tencent.mm.ui.uk.g(i17));
        getController().W0(getActivity(), 0);
        getController().E0(getResources().getColor(com.tencent.mm.R.color.f478489a));
    }

    private void doCheckAccessibilitySecure() {
        if (!isContainPassWordView()) {
            com.tencent.mars.xlog.Log.e(TAG, "[doCheckAccessibilitySecure] is not contain PassWordView, return ");
            return;
        }
        java.util.ArrayList Di = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Di(false);
        if (Di.size() <= 0) {
            com.tencent.mars.xlog.Log.e(TAG, "[doCheckAccessibilitySecure] localServiceList == null ||localServiceList.size() <= 0, return");
            return;
        }
        int Ni = ((pg0.p3) ((qg0.g0) i95.n0.c(qg0.g0.class))).Ni(Di, false);
        com.tencent.mars.xlog.Log.i(TAG, "[doCheckAccessibilitySecure] get action is %d", java.lang.Integer.valueOf(Ni));
        if (Ni == 0) {
            com.tencent.mars.xlog.Log.e(TAG, "[doCheckAccessibilitySecure] action is 0, return ");
            return;
        }
        if (this.rootLayout == null || getContext() == null || getContext().isDestroyed() || getContext().isFinishing()) {
            com.tencent.mars.xlog.Log.e(TAG, "[doCheckAccessibilitySecure] activity is destory, return ");
            return;
        }
        android.view.ViewGroup viewGroup = this.rootLayout;
        if (!(viewGroup instanceof com.tencent.kinda.framework.app.KindaPlatformLayout)) {
            com.tencent.mars.xlog.Log.e(TAG, "[doCheckAccessibilitySecure] rootLayout is not KindaPlatformLayout");
            return;
        }
        com.tencent.kinda.framework.app.KindaPlatformLayout kindaPlatformLayout = (com.tencent.kinda.framework.app.KindaPlatformLayout) viewGroup;
        if (Ni != 2) {
            this.needBlockAccessibility = false;
            kindaPlatformLayout.setBlockAccessibilityStatus(false);
        } else {
            this.needBlockAccessibility = true;
            kindaPlatformLayout.setBlockAccessibilityStatus(true);
        }
    }

    private boolean isInVisibleOnRecently() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_close_pay_vague, false);
        com.tencent.mars.xlog.Log.i(TAG, "clicfg_android_wxpay_close_pay_vague %s, inVisibleOnRecently:%s formLast:%s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(inVisibleOnRecently()), java.lang.Boolean.valueOf(this.inVisibleOnRecentlyFromLast));
        if (fj6) {
            return false;
        }
        return inVisibleOnRecently() || this.inVisibleOnRecentlyFromLast;
    }

    private boolean isSelfInVisibleOnRecently() {
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wxpay_close_pay_vague, false);
        com.tencent.mars.xlog.Log.i(TAG, "clicfg_android_wxpay_close_pay_vague %s, isSelfInVisibleOnRecently:%s ", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(inVisibleOnRecently()));
        if (fj6) {
            return false;
        }
        return inVisibleOnRecently();
    }

    public void addCustomReportEvent(java.lang.String str, n05.a aVar) {
        this.mReportUIC.O6(str, aVar);
    }

    public void addLifecycleReportEvent(m05.n nVar, n05.a aVar) {
        this.mReportUIC.P6(nVar, aVar);
    }

    public com.tencent.kinda.gen.ITransmitKvData covertPlatformData(android.os.Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
        for (java.lang.String str : bundle.keySet()) {
            java.lang.Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof java.lang.String) {
                    create.putString(str, (java.lang.String) obj);
                } else if (obj instanceof java.lang.Long) {
                    create.putLong(str, ((java.lang.Long) obj).longValue());
                } else if (obj instanceof java.lang.Integer) {
                    create.putInt(str, ((java.lang.Integer) obj).intValue());
                } else if (obj instanceof java.util.ArrayList) {
                    java.util.ArrayList<java.lang.String> arrayList = (java.util.ArrayList) obj;
                    if (arrayList.get(0) instanceof java.lang.String) {
                        create.putListString(str, arrayList);
                    } else if (arrayList.get(0) instanceof java.lang.Long) {
                        create.putListLong(str, arrayList);
                    } else if (arrayList.get(0) instanceof java.lang.Integer) {
                        create.putListInt(str, arrayList);
                    }
                }
            }
        }
        return create;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View view) {
        super.dealContentView(view);
        if (isSupportCustomActionBar()) {
            if (this.mActionBarContainer == null) {
                this.mActionBarContainer = (androidx.appcompat.widget.ActionBarContainer) ((android.view.ViewStub) view.findViewById(com.tencent.kinda.framework.R.id.kinda_custom_action_bar)).inflate();
            }
            this.mCustomActioinBarController.A0.f325237i = (android.view.ViewGroup) view;
        }
    }

    @Override // com.tencent.mm.ui.FragmentActivitySupport
    public android.view.View findViewById(int i17) {
        if (getView() != null) {
            return getView().findViewById(i17);
        }
        if (getActivity() != null) {
            return getActivity().findViewById(i17);
        }
        return null;
    }

    public com.tencent.kinda.framework.widget.base.BaseFragment getCoveredFragment() {
        return this.mCoveredFragment;
    }

    public boolean getIsEnterBackground() {
        return this.isEnterBackground;
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.kinda.framework.R.layout.kinda_main_container_layout_with_keyboard;
    }

    public androidx.fragment.app.Fragment getPrevFragment() {
        int indexOf;
        if (getFragmentManager() != null) {
            java.util.List<androidx.fragment.app.Fragment> fragments = getFragmentManager().getFragments();
            if (fragments.size() > 1 && (indexOf = fragments.indexOf(this) - 1) >= 0) {
                return fragments.get(indexOf);
            }
        }
        return null;
    }

    public abstract java.lang.String getReportUrl();

    public abstract java.lang.String getTagName();

    public com.tencent.mm.sdk.platformtools.n3 getWcpayKeyboardAnimationHandler() {
        if (this.wcpayKeyboardAnimationHandler == null) {
            this.wcpayKeyboardAnimationHandler = new com.tencent.mm.sdk.platformtools.n3();
        }
        return this.wcpayKeyboardAnimationHandler;
    }

    public boolean getWillBeRemoved() {
        return this.willBeRemoved;
    }

    public void hideKeyboard() {
        getController().K();
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.o1v);
        if (findViewById != null && (getActivity() instanceof com.tencent.kinda.framework.widget.base.BaseFrActivity)) {
            ((com.tencent.kinda.framework.widget.base.BaseFrActivity) getActivity()).hideTenpayKB(findViewById, new java.lang.ref.WeakReference<>(this));
        }
        hideWcPayKeyboard();
    }

    public void hideWcPayKeyboard() {
        com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) findViewById(com.tencent.kinda.framework.R.id.wc_pay_keyboard);
        if (wcPayKeyboard != null) {
            if (this.showSingleActionStWcKbWhenHide) {
                wcPayKeyboard.v();
            } else {
                wcPayKeyboard.i();
            }
        }
    }

    public abstract boolean inVisibleOnRecently();

    public abstract void initOnCreate();

    public void initPagePlatformDelegate() {
        this.pagePlatformDelegate = new com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl(getActivity());
        this.pagePlatformFuncDelegate = new com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl(this);
        this.uiModalFuncDelegate = new com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl(this);
    }

    public void initPageView() {
        com.facebook.yoga.android.YogaLayout yogaLayout = new com.facebook.yoga.android.YogaLayout(getActivity());
        yogaLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        ((android.view.ViewGroup) getView().findViewById(com.tencent.kinda.framework.R.id.container)).addView(yogaLayout);
        com.tencent.mars.xlog.Log.i(TAG, "initPageView rootLayout %s", yogaLayout);
        onCreateLayout(new com.tencent.kinda.framework.widget.PlatformWrapLayout(yogaLayout));
    }

    public void initWithNavigationBarConfig(com.tencent.kinda.gen.NavigationBarConfig navigationBarConfig) {
        boolean z17;
        com.tencent.mars.xlog.Log.i(TAG, "NavigationBarConfig: %s", navigationBarConfig);
        if (navigationBarConfig == null || getController().G == null) {
            return;
        }
        com.tencent.kinda.gen.DynamicColor dynamicColor = navigationBarConfig.mBackgroundColor;
        if (dynamicColor != null) {
            int colorByMode = (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor);
            getController().G.w(new android.graphics.drawable.ColorDrawable(colorByMode));
            calculateStatusBarColor(colorByMode);
            getController().E0(colorByMode);
        }
        java.lang.String str = navigationBarConfig.mBarTitle;
        if (str != null) {
            setMMTitle(str);
        }
        com.tencent.kinda.gen.DynamicColor dynamicColor2 = navigationBarConfig.mTitleColor;
        if (dynamicColor2 != null && dynamicColor2.mNormalColor != 0) {
            com.tencent.mm.ui.ga controller = getController();
            int i17 = (int) navigationBarConfig.mTitleColor.mNormalColor;
            if (controller.G != null) {
                controller.H.setTextColor(i17);
            }
        }
        com.tencent.kinda.gen.DynamicColor dynamicColor3 = navigationBarConfig.mLeftButtonColor;
        if (dynamicColor3 == null || dynamicColor3.getNormalColor() == 0) {
            z17 = false;
        } else {
            z17 = com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(navigationBarConfig.mLeftButtonColor.getNormalColor()) == -1;
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = getController().K;
            if (weImageView != null) {
                weImageView.clearColorFilter();
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = getController().K;
            if (weImageView2 != null) {
                weImageView2.setEnableColorFilter(false);
            }
        }
        androidx.appcompat.app.b bVar = getController().G;
        if (bVar != null) {
            bVar.G(0.0f);
        }
        com.tencent.kinda.gen.LeftBarButtonType leftBarButtonType = navigationBarConfig.mLeftBarButtonType;
        if (leftBarButtonType == com.tencent.kinda.gen.LeftBarButtonType.BACK) {
            setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.2
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.kinda.framework.widget.base.BaseFragment.this.popFragment();
                    return true;
                }
            }, z17 ? com.tencent.mm.R.raw.actionbar_icon_light_back : com.tencent.mm.R.raw.actionbar_icon_dark_back);
        } else if (leftBarButtonType == com.tencent.kinda.gen.LeftBarButtonType.CANCEL) {
            setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.3
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.kinda.framework.widget.base.BaseFragment.this.popFragment();
                    return true;
                }
            }, z17 ? com.tencent.mm.R.raw.actionbar_icon_light_close : com.tencent.mm.R.raw.actionbar_icon_dark_close);
        } else if (leftBarButtonType == com.tencent.kinda.gen.LeftBarButtonType.NONE) {
            getController().t0(false);
        }
        com.tencent.kinda.gen.DynamicColor dynamicColor4 = navigationBarConfig.mLeftButtonColor;
        if (dynamicColor4 != null && com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(dynamicColor4.getNormalColor()) != 0 && navigationBarConfig.mLeftButtonColor.getNormalColor() == navigationBarConfig.mRightButtonColor.getNormalColor()) {
            getController().q0(com.tencent.kinda.framework.widget.tools.MMKViewUtil.argbColor(com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(navigationBarConfig.mLeftButtonColor)));
        }
        java.lang.String str2 = navigationBarConfig.mRightButtonTitle;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(navigationBarConfig.mRightButtonImage) && com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            if (navigationBarConfig.mRightButtonImage.equals("kinda_icons_outlined_more")) {
                str2 = getString(com.tencent.kinda.framework.R.string.common_more);
            } else if (navigationBarConfig.mRightButtonImage.equals("kinda_icons_outlined_help")) {
                str2 = getString(com.tencent.kinda.framework.R.string.common_help);
            }
        }
        setTopRightBtnImage(navigationBarConfig.mRightButtonImage);
        setTopRightBtnTitle(str2, navigationBarConfig.mRightButtonColor);
    }

    public boolean isActive() {
        return this.isActive;
    }

    public boolean isContainPassWordView() {
        com.tencent.mars.xlog.Log.i(TAG, "[isContainPassWordView] mReportUrl : %s.", this.mReportUrl);
        return URL_PAY_DESK_MAIN.equals(this.mReportUrl);
    }

    public boolean isContainSecureView() {
        com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl uIPagePlatformDelegateImpl = this.pagePlatformDelegate;
        if (uIPagePlatformDelegateImpl == null) {
            return false;
        }
        int size = uIPagePlatformDelegateImpl.getSecureViews().size();
        com.tencent.mars.xlog.Log.i(TAG, "Fragment contains secure view size: %s.", java.lang.Integer.valueOf(size));
        return size > 0;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean isSupportCustomActionBar() {
        return true;
    }

    public boolean needBlockAccessibility() {
        return this.needBlockAccessibility;
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
        getTagName();
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onAttach(android.content.Context context) {
        super.onAttach(context);
        if (isSupportCustomActionBar()) {
            com.tencent.mm.ui.yb ybVar = new com.tencent.mm.ui.yb();
            this.mCustomActioinBarController = ybVar;
            ybVar.f212584y0 = this;
            ybVar.A0 = new ma5.e(thisActivity(), ybVar);
            setActivityController(this.mCustomActioinBarController);
        }
        this.mReportUIC = new m05.p(this);
    }

    public abstract boolean onBackPressed();

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mars.xlog.Log.i(TAG, "onCreate %s %s", getTagName(), this);
        super.onCreate(bundle);
    }

    public abstract void onCreateLayout(com.tencent.kinda.framework.widget.PlatformWrapLayout platformWrapLayout);

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.ui.FragmentActivitySupport, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        getTagName();
        this.pagePlatformDelegate = null;
        this.pagePlatformFuncDelegate = null;
        this.uiModalFuncDelegate = null;
        restoreActionBarColor();
        com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onDestroyView();
        }
        this.life = null;
    }

    @Override // com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        getTagName();
        super.onDetach();
        this.fragEvent = null;
    }

    public void onFirstLayoutFinished() {
    }

    public void onFirstRenderFinish() {
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public /* bridge */ /* synthetic */ void onFragmentOnCreate() {
        super.onFragmentOnCreate();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnDestroy() {
        super.onFragmentOnDestroy();
        this.pagePlatformFuncDelegate = null;
        this.mCustomActioinBarController = null;
        this.mReportUIC.onDestroy();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnPause() {
        super.onFragmentOnPause();
        if (isSelfInVisibleOnRecently()) {
            getActivity().getWindow().addFlags(8192);
            com.tencent.mars.xlog.Log.i(TAG, "FLAG_SECURE onFragmentOnPause, add flag class: %s ", toString());
        } else if (isContainSecureView()) {
            com.tencent.mars.xlog.Log.i(TAG, "FLAG_SECURE onFragmentOnPause, still contain secure view, keep flag class: %s ", toString());
        }
        this.mReportUIC.onPause();
        toString();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public void onFragmentOnResume() {
        com.tencent.kinda.framework.widget.base.IEventFragment iEventFragment;
        super.onFragmentOnResume();
        if (isContainSecureView()) {
            getActivity().getWindow().addFlags(8192);
            com.tencent.mars.xlog.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, add flag class: %s ", toString());
        } else if (isInVisibleOnRecently()) {
            getActivity().getWindow().clearFlags(8192);
            com.tencent.mars.xlog.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, clear flag class: %s", toString());
        } else {
            getActivity().getWindow().clearFlags(8192);
            com.tencent.mars.xlog.Log.i(TAG, "FLAG_SECURE onFragmentOnResume, default clear flag class: %s", toString());
        }
        if (!this.hasCheckAccessibilitySecurityServiceList) {
            this.hasCheckAccessibilitySecurityServiceList = true;
            doCheckAccessibilitySecure();
        }
        this.mReportUIC.onResume();
        toString();
        if (!isHidden() || (iEventFragment = this.fragEvent) == null) {
            return;
        }
        iEventFragment.fixOnResume(this);
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public /* bridge */ /* synthetic */ void onFragmentOnStart() {
        super.onFragmentOnStart();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.kinda.framework.widget.base.FragmentLifecycle
    public /* bridge */ /* synthetic */ void onFragmentOnStop() {
        super.onFragmentOnStop();
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z17) {
        super.onHiddenChanged(z17);
        com.tencent.mars.xlog.Log.i(TAG, "onHiddenChanged %s", java.lang.Boolean.valueOf(z17));
    }

    public abstract void onKeyboardShow(boolean z17, int i17);

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        getTagName();
        com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onPause();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        getTagName();
        super.onResume();
        com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onResume();
        }
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onStart() {
        super.onStart();
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public /* bridge */ /* synthetic */ void onStop() {
        super.onStop();
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onSwipeBack() {
        super.onSwipeBack();
        getTagName();
        this.fragEvent.popFragment(this);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        return true;
    }

    @Override // com.tencent.kinda.framework.widget.base.LifecycleFragment, com.tencent.mm.ui.MMFragment, androidx.fragment.app.Fragment
    public void onViewCreated(final android.view.View view, android.os.Bundle bundle) {
        this.useTime = java.lang.System.currentTimeMillis();
        super.onViewCreated(view, bundle);
        this.statusBarSpaceView = (android.widget.FrameLayout) view.findViewById(com.tencent.kinda.framework.R.id.kinda_status_bar_placeholder_view);
        int p17 = com.tencent.mm.ui.bk.p(getContext());
        android.view.ViewGroup.LayoutParams layoutParams = this.statusBarSpaceView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = p17;
            this.statusBarSpaceView.setLayoutParams(layoutParams);
        }
        this.rootLayout = (android.view.ViewGroup) view.findViewById(com.tencent.kinda.framework.R.id.kinda_main_container);
        com.tencent.mars.xlog.Log.i(TAG, "onViewCreated %s %s", getTagName(), this);
        this.pagePlatformDelegate = new com.tencent.kinda.framework.widget.base.UIPagePlatformDelegateImpl(getActivity());
        this.pagePlatformFuncDelegate = new com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl(this);
        this.uiModalFuncDelegate = new com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl(this);
        if (usePanelModalMode()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/kinda/framework/widget/base/BaseFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        initOnCreate();
        com.tencent.kinda.framework.animate.KindaAnimatorWatch.didViewCreated(hashCode());
        view.setOnTouchListener(this);
        view.setClickable(true);
        view.setImportantForAccessibility(2);
        view.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.BaseFragment.1
            private byte _hellAccFlag_;

            @Override // java.lang.Runnable
            public void run() {
                com.tencent.kinda.framework.widget.base.BaseFragment.this.useTime = java.lang.System.currentTimeMillis() - com.tencent.kinda.framework.widget.base.BaseFragment.this.useTime;
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.BaseFragment.TAG, "%s view created useTime: %sms", com.tencent.kinda.framework.widget.base.BaseFragment.this.getReportUrl(), java.lang.Long.valueOf(com.tencent.kinda.framework.widget.base.BaseFragment.this.useTime));
                com.tencent.kinda.framework.widget.base.BaseFragment.this.onFirstRenderFinish();
                com.tencent.kinda.framework.widget.base.BaseFragment.this.onFirstLayoutFinished();
                if (com.tencent.kinda.framework.widget.base.BaseFragment.this.usePanelModalMode()) {
                    android.view.View view2 = view;
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/kinda/framework/widget/base/BaseFragment$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
        });
        com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife iFrLife = this.life;
        if (iFrLife != null) {
            iFrLife.onViewCreate(bundle);
        }
        this.mReportUIC.onCreate(null);
    }

    public void popFragment() {
        com.tencent.kinda.framework.widget.base.IEventFragment iEventFragment = this.fragEvent;
        if (iEventFragment != null) {
            iEventFragment.popFragment(this);
        }
    }

    public void recordCoveredFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        this.mCoveredFragment = baseFragment;
    }

    public void restoreActionBarColor() {
    }

    public void setActionBarColor(int i17) {
        if (getContext() != null) {
            getController().G.w(new android.graphics.drawable.ColorDrawable(i17));
            calculateStatusBarColor(i17);
        }
    }

    public void setIsEnterBackground(boolean z17) {
        this.isEnterBackground = z17;
    }

    public abstract void setTopRightBtnImage(java.lang.String str);

    public abstract void setTopRightBtnTitle(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor);

    public void setWillBeRemoved(boolean z17) {
        this.willBeRemoved = z17;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean supportNavigationSwipeBack() {
        return false;
    }

    public void triggerReport(m05.n nVar, java.lang.String str) {
        this.mReportUIC.R6(nVar, str);
    }

    public boolean useImmediateKeyboardAnimation() {
        return false;
    }

    public boolean useKeyboardCoverMode() {
        return false;
    }

    public boolean usePanelModalMode() {
        return false;
    }

    public void watchLife(com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife iFrLife) {
        this.life = iFrLife;
    }

    public void willActive() {
        getTagName();
        this.isActive = true;
    }

    public void willDeActive() {
        this.isActive = false;
        getTagName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.Fragment
    public void onAttach(android.app.Activity activity) {
        getTagName();
        super.onAttach(activity);
        try {
            this.fragEvent = (com.tencent.kinda.framework.widget.base.IEventFragment) activity;
        } catch (java.lang.ClassCastException unused) {
            com.tencent.mars.xlog.Log.e(TAG, "error IEventFragment");
        }
    }
}
