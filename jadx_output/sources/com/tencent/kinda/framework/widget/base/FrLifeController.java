package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class FrLifeController {
    public static final java.lang.String HandleControlInfoAction = "handleControlInfo";
    public static final java.lang.String PageNotifyAction = "pageNotify";
    public static final java.lang.String TAG = "MicroMsg.FragmentController";
    private com.tencent.kinda.framework.widget.base.BaseFrActivity activity;
    private java.util.Stack<com.tencent.kinda.framework.widget.base.BaseFragment> mFragmentBackStack;
    private int fragmentCount = 0;
    private int webviewCount = 0;
    private int tinyappCount = 0;
    private int liteAppCount = 0;
    private boolean needTinyCallback = true;
    private com.tencent.kinda.framework.app.MainFragment webViewFragment = null;
    private com.tencent.kinda.framework.app.MainFragment tinyAppFragment = null;
    private com.tencent.kinda.framework.app.MainFragment liteAppFragment = null;

    /* loaded from: classes9.dex */
    public interface IFrLife {
        void onDestroyView();

        void onPause();

        void onResume();

        void onViewCreate(android.os.Bundle bundle);
    }

    public FrLifeController(com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity) {
        this.activity = baseFrActivity;
        androidx.fragment.app.FragmentManager.enableDebugLogging(true);
        this.activity.getSupportFragmentManager().addOnBackStackChangedListener(new androidx.fragment.app.p1() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.1
            @Override // androidx.fragment.app.p1
            public void onBackStackChanged() {
                androidx.fragment.app.FragmentManager supportFragmentManager = com.tencent.kinda.framework.widget.base.FrLifeController.this.activity.getSupportFragmentManager();
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "onBackstackChanged: %s, fragments: %s", java.lang.Integer.valueOf(supportFragmentManager.getBackStackEntryCount()), supportFragmentManager.getFragments());
            }
        });
        this.mFragmentBackStack = new java.util.Stack<>();
    }

    private void checkSwipeBackLayout() {
        if (this.activity.getF65848t()) {
            int size = this.mFragmentBackStack.size();
            com.tencent.mars.xlog.Log.i(TAG, "checkSwipeBackLayout %s %s", java.lang.Integer.valueOf(size), java.lang.Integer.valueOf(this.activity.getFragmentManager().getBackStackEntryCount()));
            if (size > 1) {
                this.activity.getSwipeBackLayout().setEnableGesture(false);
            } else {
                this.activity.getSwipeBackLayout().setEnableGesture(true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.tencent.kinda.framework.widget.base.BaseFragment getFragMent(int i17) {
        java.util.Stack<com.tencent.kinda.framework.widget.base.BaseFragment> stack = this.mFragmentBackStack;
        if (stack != null && stack.size() != 0) {
            if (i17 < 0) {
                int size = this.mFragmentBackStack.size() + i17;
                if (size < 0 || size >= this.mFragmentBackStack.size()) {
                    return null;
                }
                java.util.Stack<com.tencent.kinda.framework.widget.base.BaseFragment> stack2 = this.mFragmentBackStack;
                return stack2.get(stack2.size() + i17);
            }
            if (i17 < this.mFragmentBackStack.size()) {
                return this.mFragmentBackStack.get(i17);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAccessibilityState(boolean z17, int i17) {
        com.tencent.kinda.framework.widget.base.BaseFragment fragMent = getFragMent(i17);
        if (fragMent == null) {
            com.tencent.mars.xlog.Log.i(TAG, "fragment is null");
            return;
        }
        if (fragMent.getView() == null) {
            com.tencent.mars.xlog.Log.i(TAG, "fragment " + fragMent + " getView() is null");
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) fragMent.getView().findViewById(com.tencent.kinda.framework.R.id.kinda_main_container);
        if (viewGroup == null) {
            com.tencent.mars.xlog.Log.e(TAG, "fragment " + fragMent + " container is null");
            return;
        }
        if (!z17 || fragMent.needBlockAccessibility()) {
            viewGroup.setImportantForAccessibility(4);
        } else {
            viewGroup.setImportantForAccessibility(1);
        }
        fragMent.needBlockAccessibility();
    }

    private void showAllFragment() {
        if (this.mFragmentBackStack != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("\n");
            for (int size = this.mFragmentBackStack.size(); size > 0; size--) {
                com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = this.mFragmentBackStack.get(size - 1);
                sb6.append(java.lang.String.format("%s(hide:%s %s %s %s)\n", baseFragment.getReportUrl(), java.lang.Boolean.valueOf(baseFragment.isHidden()), java.lang.Boolean.valueOf(baseFragment.isFragmentVisible()), java.lang.Boolean.valueOf(baseFragment.isVisible()), baseFragment.toString()));
            }
            com.tencent.mars.xlog.Log.i(TAG, "fragment stack: %s", sb6.toString());
        }
    }

    private void watchLife(final com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        if (baseFragment != null) {
            baseFragment.watchLife(new com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.2
                @Override // com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife
                public void onDestroyView() {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "onDestroyView " + baseFragment);
                    if (com.tencent.kinda.framework.widget.base.FrLifeController.this.mFragmentBackStack.search(baseFragment) > 0) {
                        if (com.tencent.kinda.framework.widget.base.FrLifeController.this.getFragMent(-1) == baseFragment) {
                            com.tencent.kinda.framework.widget.base.FrLifeController.this.setAccessibilityState(true, -2);
                        } else {
                            com.tencent.kinda.framework.widget.base.FrLifeController.this.setAccessibilityState(true, -1);
                        }
                    }
                    com.tencent.kinda.framework.widget.base.BaseFragment coveredFragment = baseFragment.getCoveredFragment();
                    if (coveredFragment == null || !coveredFragment.equals(com.tencent.kinda.framework.widget.base.FrLifeController.this.getFragMent(-1))) {
                        return;
                    }
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "From onDestroyView, active covered fragment: " + coveredFragment);
                    coveredFragment.willActive();
                }

                @Override // com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife
                public void onPause() {
                }

                @Override // com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife
                public void onResume() {
                }

                @Override // com.tencent.kinda.framework.widget.base.FrLifeController.IFrLife
                public void onViewCreate(android.os.Bundle bundle) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "onViewCreate " + baseFragment);
                    if (!baseFragment.isActive()) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "From onResume, Active create view fragment: " + baseFragment);
                        baseFragment.willActive();
                    }
                    com.tencent.kinda.framework.widget.base.BaseFragment fragMent = com.tencent.kinda.framework.widget.base.FrLifeController.this.getFragMent(-2);
                    if (fragMent != null && (baseFragment instanceof com.tencent.kinda.framework.app.MainFragment) && fragMent.isActive()) {
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "From onCreateView, DeActive covered fragment: " + baseFragment);
                        fragMent.willDeActive();
                        baseFragment.recordCoveredFragment(fragMent);
                    }
                }
            });
            return;
        }
        java.lang.Throwable th6 = new java.lang.Throwable("Watch a null fragment!!");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mars.xlog.Log.e(TAG, com.tencent.mm.sdk.platformtools.z3.c(th6));
    }

    public boolean addFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        java.util.Stack<com.tencent.kinda.framework.widget.base.BaseFragment> stack = this.mFragmentBackStack;
        if (stack != null && stack.size() > 0) {
            com.tencent.kinda.framework.widget.base.BaseFragment lastElement = this.mFragmentBackStack.lastElement();
            baseFragment.inVisibleOnRecentlyFromLast = lastElement.inVisibleOnRecentlyFromLast || lastElement.inVisibleOnRecently();
        }
        this.fragmentCount++;
        androidx.fragment.app.i2 beginTransaction = this.activity.getSupportFragmentManager().beginTransaction();
        if (baseFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
            int i17 = baseFragment.enterAnimStyle;
            if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                beginTransaction.l(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477882e6, 0, 0);
            } else if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                beginTransaction.l(com.tencent.mm.R.anim.f477876e0, 0, 0, 0);
            }
        }
        beginTransaction.h(com.tencent.kinda.framework.R.id.fragment_content, baseFragment, null, 1);
        watchLife(baseFragment);
        this.mFragmentBackStack.add(baseFragment);
        beginTransaction.e();
        com.tencent.mars.xlog.Log.i(TAG, "fragment [" + baseFragment + "] has add! current fragmentCount: " + this.fragmentCount);
        showAllFragment();
        if (this.fragmentCount > 1) {
            setAccessibilityState(false, -2);
        }
        return true;
    }

    public void fixOnResume(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        int search;
        int size;
        if (baseFragment != null && (search = this.mFragmentBackStack.search(baseFragment)) > 0 && search <= this.mFragmentBackStack.size() && (this.mFragmentBackStack.size() - search) - 1 >= 0) {
            for (size = (this.mFragmentBackStack.size() - search) - 1; size >= 0; size--) {
                com.tencent.kinda.framework.widget.base.BaseFragment baseFragment2 = this.mFragmentBackStack.get(size);
                if (baseFragment2 != null && !baseFragment2.isHidden()) {
                    com.tencent.mars.xlog.Log.i(TAG, "fixOnResume:%s", baseFragment2);
                    baseFragment2.onFragmentOnResume();
                }
            }
        }
    }

    public com.tencent.kinda.framework.widget.base.BaseFragment getCurrent() {
        return com.tencent.kinda.framework.widget.base.BaseFrActivity.topShowFragmentOf(getFragmentList());
    }

    public java.util.List<androidx.fragment.app.Fragment> getFragmentList() {
        return this.mFragmentBackStack == null ? new java.util.ArrayList() : new java.util.ArrayList(this.mFragmentBackStack);
    }

    public int getFragmentListSize() {
        com.tencent.mars.xlog.Log.i(TAG, "getFragmentListSize: %d", java.lang.Integer.valueOf(this.fragmentCount));
        return this.fragmentCount;
    }

    public boolean hasOpenH5OrTinyApp() {
        com.tencent.mars.xlog.Log.i(TAG, "hasOpenH5OrTinyApp, webviewCount: %d, tinyappCount: %d", java.lang.Integer.valueOf(this.webviewCount), java.lang.Integer.valueOf(this.tinyappCount));
        return this.webviewCount > 0 || this.tinyappCount > 0 || this.liteAppCount > 0;
    }

    public void onActivityDestroy() {
        this.mFragmentBackStack.clear();
    }

    public boolean popFragment(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        com.tencent.mars.xlog.Log.i(TAG, "popFragment, fragmentCount: %d, isStateSaved: %b", java.lang.Integer.valueOf(this.fragmentCount), java.lang.Boolean.valueOf(this.activity.getSupportFragmentManager().isStateSaved()));
        if (this.fragmentCount > 1 && !this.activity.getSupportFragmentManager().isStateSaved()) {
            if (baseFragment == null) {
                baseFragment = com.tencent.kinda.framework.widget.base.BaseFrActivity.topShowFragmentOf(getFragmentList());
            }
            removeModal(baseFragment);
            com.tencent.mars.xlog.Log.i(TAG, "popFragment to remove, fragmentCount: %d", java.lang.Integer.valueOf(this.fragmentCount));
            showAllFragment();
            return this.fragmentCount > 0;
        }
        com.tencent.mars.xlog.Log.i(TAG, "NO popFragment before return, fragmentCount: %d", java.lang.Integer.valueOf(this.fragmentCount));
        showAllFragment();
        if (this.fragmentCount == 1) {
            if (baseFragment == null) {
                baseFragment = com.tencent.kinda.framework.widget.base.BaseFrActivity.topShowFragmentOf(getFragmentList());
            }
            if (baseFragment != null) {
                int i17 = baseFragment.enterAnimStyle;
                if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                    this.activity.getIntent().putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_EXIT_ANIMATION, com.tencent.mm.R.anim.f477889ed);
                } else if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                    this.activity.getIntent().putExtra(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_EXIT_ANIMATION, com.tencent.mm.R.anim.f477877e1);
                }
            }
        }
        return false;
    }

    public boolean processCallback(int i17) {
        com.tencent.kinda.framework.app.MainFragment mainFragment;
        com.tencent.kinda.framework.app.MainFragment mainFragment2;
        com.tencent.kinda.framework.app.MainFragment mainFragment3;
        if (i17 == 2 && this.webviewCount > 0 && (mainFragment3 = this.webViewFragment) != null) {
            mainFragment3.onDestroy();
            this.webViewFragment = null;
            this.webviewCount--;
            return true;
        }
        if (i17 == 3 && this.tinyappCount > 0 && (mainFragment2 = this.tinyAppFragment) != null && this.needTinyCallback) {
            mainFragment2.onDestroy();
            this.tinyAppFragment = null;
            this.tinyappCount--;
            return true;
        }
        if (i17 != 11 || this.liteAppCount <= 0 || (mainFragment = this.liteAppFragment) == null) {
            return false;
        }
        mainFragment.onDestroy();
        this.liteAppFragment = null;
        this.liteAppCount--;
        return true;
    }

    public boolean removeModal(com.tencent.kinda.framework.widget.base.BaseFragment baseFragment) {
        if (this.fragmentCount > 0) {
            if (baseFragment.isActive()) {
                baseFragment.willDeActive();
            }
            this.fragmentCount--;
            baseFragment.setWillBeRemoved(true);
            androidx.fragment.app.i2 beginTransaction = this.activity.getSupportFragmentManager().beginTransaction();
            if (baseFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
                int i17 = baseFragment.enterAnimStyle;
                if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_SLIDE) {
                    beginTransaction.l(com.tencent.mm.R.anim.f477886ea, com.tencent.mm.R.anim.f477889ed, 0, 0);
                } else if (i17 == com.tencent.kinda.framework.widget.tools.ConstantsKinda.ENTER_ANIMATE_STYLE_POP) {
                    beginTransaction.l(0, com.tencent.mm.R.anim.f477877e1, 0, 0);
                }
            }
            beginTransaction.j(baseFragment);
            beginTransaction.e();
            this.mFragmentBackStack.remove(baseFragment);
            setAccessibilityState(true, -1);
        }
        com.tencent.mars.xlog.Log.i(TAG, "removeModal [%s] before return, fragmentCount: %d", baseFragment, java.lang.Integer.valueOf(this.fragmentCount));
        return this.fragmentCount > 0;
    }

    public void setTinyCallbackTag(boolean z17) {
        this.needTinyCallback = z17;
    }

    public void startLiteAppUIPage(final android.os.Bundle bundle, com.tencent.kinda.framework.app.MainFragment mainFragment) {
        bundle.putInt("requestCode", 11);
        this.liteAppFragment = mainFragment;
        this.liteAppCount++;
        com.tencent.mm.plugin.lite.s sVar = new com.tencent.mm.plugin.lite.s();
        final com.tencent.kinda.gen.IUIPage page = mainFragment.getPage();
        page.setPlatformFuncDelegate(new com.tencent.kinda.gen.IUIPagePlatformFuncDelegate() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.3
            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void addReportInfo(com.tencent.kinda.gen.ViewReportStruct viewReportStruct) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void beginIgnoringInteractionEvents() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void closeUI(boolean z17) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "liteapp page closeUI");
                java.util.List tj6 = ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).tj(bundle.getString("appId"));
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "liteapp page closeUI appid=%s uuids=%s", bundle.getString("appId"), tj6);
                java.util.Iterator it = ((java.util.ArrayList) tj6).iterator();
                while (it.hasNext()) {
                    java.lang.Long l17 = (java.lang.Long) it.next();
                    android.content.Intent intent = new android.content.Intent();
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("animated", z17);
                        intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, jSONObject.toString());
                        com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.widget.base.FrLifeController.TAG, "liteapp page closeUI closeWindow");
                        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                        long longValue = l17.longValue();
                        ((com.tencent.mm.feature.lite.i) g0Var).getClass();
                        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(longValue, intent);
                    } catch (org.json.JSONException e17) {
                        throw new java.lang.RuntimeException(e17);
                    }
                }
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void endEditing() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void endIgnoringInteractionEvents() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public java.lang.String getTitle() {
                return null;
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void refreshNavigationBar() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setBackBtnVisible(boolean z17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setKeyBoardShowCallbackImpl(com.tencent.kinda.gen.VoidBoolI32Callback voidBoolI32Callback) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setScreenBrightness(float f17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setScreenKeepOn(boolean z17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setSubTitle(java.lang.String str) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setSubTitleDefaultColor() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setSubTitleVisibility(com.tencent.kinda.gen.Visible visible) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTitle(java.lang.String str) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopLeftBackBtnCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopLeftBtnTitleAndCallbackImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightBtnBgIsGreen(boolean z17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightBtnDone() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightBtnImage(java.lang.String str) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightBtnTitle(java.lang.String str, java.lang.String str2) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setTopRightFull(boolean z17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void setWindowSoftInputAdjustMode(com.tencent.kinda.gen.AndroidWindowAdjustMode androidWindowAdjustMode) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void startLoading(java.lang.String str, boolean z17) {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void stopLoading() {
            }

            @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
            public void triggerReport(com.tencent.kinda.gen.ReportEvent reportEvent, java.lang.String str) {
            }
        });
        sVar.f144167d = new com.tencent.mm.plugin.lite.r() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.4
            @Override // com.tencent.mm.plugin.lite.r
            public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
                if ((!str.equals(com.tencent.kinda.framework.widget.base.FrLifeController.HandleControlInfoAction) && !str.equals(com.tencent.kinda.framework.widget.base.FrLifeController.PageNotifyAction)) || !(obj instanceof org.json.JSONObject) || page == null) {
                    return true;
                }
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                dd.d.f228871a.b((org.json.JSONObject) obj, create);
                page.notify(create);
                return true;
            }
        };
        ((com.tencent.mm.feature.lite.i) ((q80.g0) i95.n0.c(q80.g0.class))).jk(this.activity, bundle, true, false, sVar, new q80.f0() { // from class: com.tencent.kinda.framework.widget.base.FrLifeController.5
            @Override // q80.f0
            public /* bridge */ /* synthetic */ void cancel() {
            }

            @Override // q80.f0
            public void fail() {
                com.tencent.kinda.framework.widget.base.FrLifeController.this.liteAppFragment.onDestroy();
                com.tencent.kinda.framework.widget.base.FrLifeController.this.liteAppFragment = null;
            }

            @Override // q80.f0
            public /* bridge */ /* synthetic */ boolean listenOnCreate() {
                return false;
            }

            @Override // q80.f0
            public /* bridge */ /* synthetic */ void onCreate(long j17, java.lang.String str) {
            }

            @Override // q80.f0
            public void success() {
            }
        });
    }

    public void startTinyAppUIPage(android.os.Bundle bundle, com.tencent.kinda.framework.app.MainFragment mainFragment) {
        java.lang.String string = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_USERNAME, "");
        java.lang.String string2 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_PATH, "");
        java.lang.String string3 = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_VERSION, "");
        int i17 = bundle.getInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_TYPE, 0);
        int i18 = bundle.getInt(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_SCENE, 0);
        boolean z17 = bundle.getBoolean(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_TINYAPP_TRANSPARENT, false);
        mainFragment.isTinyApp = true;
        mainFragment.tinyAppUserName = string;
        mainFragment.initPagePlatformDelegate();
        l81.b1 b1Var = new l81.b1();
        b1Var.f317012a = string;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        b1Var.f317022f = string2 != null ? string2 : "";
        if (z17) {
            com.tencent.mars.xlog.Log.i(TAG, "use transparent mode");
            b1Var.H = k91.z3.TRANSPARENT;
            k91.y3 y3Var = k91.y3.DISABLED;
            b1Var.S = y3Var;
            b1Var.T = y3Var;
            if (((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ni()) {
                com.tencent.mars.xlog.Log.i(TAG, "current device has issue on transparent mode.");
                try {
                    android.view.View decorView = this.activity.getWindow().getDecorView();
                    android.graphics.Bitmap d17 = uj5.g.d(decorView, decorView.getWidth(), decorView.getHeight(), false, android.graphics.Bitmap.Config.RGB_565);
                    if (d17 != null) {
                        com.tencent.mars.xlog.Log.i(TAG, "snap show ok, try save.");
                        java.lang.String str = com.tencent.mm.vfs.q7.c("wallet_temp") + "/image/tiny_app_transparent_mode_snapshot";
                        if (com.tencent.mm.vfs.w6.j(str)) {
                            com.tencent.mm.vfs.w6.h(str);
                        }
                        com.tencent.mm.sdk.platformtools.x.D0(d17, 100, android.graphics.Bitmap.CompressFormat.JPEG, str, true);
                        com.tencent.mars.xlog.Log.i(TAG, "snap shot path:".concat(str));
                        b1Var.I = str;
                    }
                } catch (java.lang.Throwable th6) {
                    com.tencent.mars.xlog.Log.printErrStackTrace(TAG, th6, "getSnapShot err", new java.lang.Object[0]);
                }
            }
        }
        if (i18 == 0) {
            b1Var.f317032k = 1034;
        } else {
            b1Var.f317032k = i18;
        }
        if (i17 == 0) {
            b1Var.f317016c = 0;
        } else {
            b1Var.f317016c = 2;
        }
        int P = com.tencent.mm.sdk.platformtools.t8.P(string3, 0);
        if (P > 0) {
            b1Var.f317018d = P;
        }
        b1Var.f317039q = 3;
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(this.activity, b1Var);
        this.tinyAppFragment = mainFragment;
        this.tinyappCount++;
        if (this.fragmentCount != 0) {
            this.needTinyCallback = true;
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "only tinyApp,dont need TinyCallback");
            this.needTinyCallback = false;
        }
    }

    public void startWebViewUIPage(android.os.Bundle bundle, com.tencent.kinda.framework.app.MainFragment mainFragment) {
        java.lang.String string = bundle.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_WEBVIEW_URL, "");
        java.lang.String str = c01.id.a() + "_fromKinda";
        mainFragment.isWebUI = true;
        mainFragment.webRawUrl = string;
        mainFragment.webFromKindaId = str;
        mainFragment.initPagePlatformDelegate();
        com.tencent.mars.xlog.Log.i(TAG, "jumpToH5， fromKindaId is %s", str);
        com.tencent.kinda.framework.widget.base.BaseFrActivity baseFrActivity = this.activity;
        java.util.regex.Pattern pattern = com.tencent.mm.wallet_core.ui.r1.f214222a;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", string);
        intent.putExtra("showShare", true);
        intent.putExtra("allow_mix_content_mode", false);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            intent.putExtra("kFromKindaId", str);
        }
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_web_new_task, false);
        boolean fj7 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_kinda_web_default_new_task, false);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(string) && string.contains("userroll/readtemplate");
        boolean z18 = !com.tencent.mm.sdk.platformtools.t8.K0(string) && string.contains("lingqiantong/lqtweb/trade");
        boolean c17 = fp.e0.c();
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] closeSwitch：%s , closeDefaultSwitch: %s, isHuawei: %s", java.lang.Boolean.valueOf(fj6), java.lang.Boolean.valueOf(fj7), java.lang.Boolean.valueOf(c17));
        com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] isPayBill: %s, isLQTBill: %s, url：%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), string);
        if (!fj6) {
            try {
                boolean z19 = android.provider.Settings.Global.getInt(baseFrActivity.getContentResolver(), "always_finish_activities") != 0;
                com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] settingSwitch: %s", java.lang.Boolean.valueOf(z19));
                if (z19) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] do add new task flag.");
                    intent.addFlags(268435456);
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WalletBaseUtil ", th6, "[jumpToH5FromKinda] check SettingSwitch fail", new java.lang.Object[0]);
                if (c17 && !fj7 && (z17 || z18)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.WalletBaseUtil ", "[jumpToH5FromKinda] default case：do add new task flag.");
                    intent.addFlags(268435456);
                }
            }
        }
        j45.l.n(baseFrActivity, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 2);
        this.webViewFragment = mainFragment;
        this.webviewCount++;
    }
}
