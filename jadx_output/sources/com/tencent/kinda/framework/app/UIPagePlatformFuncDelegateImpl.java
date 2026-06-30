package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class UIPagePlatformFuncDelegateImpl implements com.tencent.kinda.gen.IUIPagePlatformFuncDelegate {
    private static final java.lang.String TAG = "UIPagePlatformFuncDelegateImpl";
    private byte _hellAccFlag_;
    private com.tencent.mm.ui.r0 mAndroidBug5497Workaround;
    private com.tencent.kinda.gen.VoidBoolI32Callback onKeyboardShowCallback;
    private com.tencent.kinda.gen.VoidCallback topLeftBtnCallback;
    private com.tencent.kinda.gen.VoidCallback topRightBtnCallback;
    private java.lang.String topRightBtnColor;
    private java.lang.String topRightBtnTitle;
    private java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment> weakFragment;
    private int topRightBtnResId = -1;
    private boolean topRightBtnIsGreen = false;
    private java.lang.String topLeftBtnTitle = "";
    private java.lang.String mmTitle = "";
    private android.app.Dialog mTipDialog = null;

    /* renamed from: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl$8, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass8 {
        static final /* synthetic */ int[] $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode;

        static {
            int[] iArr = new int[com.tencent.kinda.gen.AndroidWindowAdjustMode.values().length];
            $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode = iArr;
            try {
                iArr[com.tencent.kinda.gen.AndroidWindowAdjustMode.RESIZE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode[com.tencent.kinda.gen.AndroidWindowAdjustMode.PAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode[com.tencent.kinda.gen.AndroidWindowAdjustMode.NOTHING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public UIPagePlatformFuncDelegateImpl(com.tencent.mm.ui.MMFragment mMFragment) {
        this.weakFragment = new java.lang.ref.WeakReference<>(mMFragment);
    }

    private void recreateTopRightBtn() {
        android.graphics.drawable.Drawable drawable;
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        mMFragment.removeAllOptionMenu();
        if (this.topRightBtnResId > 0) {
            drawable = mMFragment.getResources().getDrawable(this.topRightBtnResId);
            if (drawable != null && !com.tencent.mm.sdk.platformtools.t8.K0(this.topRightBtnColor)) {
                try {
                    drawable.setColorFilter(android.graphics.Color.parseColor(this.topRightBtnColor), android.graphics.PorterDuff.Mode.SRC_ATOP);
                } catch (java.lang.Exception unused) {
                }
            }
        } else {
            drawable = null;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.topRightBtnTitle) && drawable == null) {
            return;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.5
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                if (com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.topRightBtnCallback == null) {
                    return false;
                }
                com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.topRightBtnCallback.call();
                return true;
            }
        };
        if (drawable != null) {
            mMFragment.addIconOptionMenu(1, this.topRightBtnTitle, drawable, onMenuItemClickListener);
        } else if (this.topRightBtnIsGreen) {
            mMFragment.addTextOptionMenu(1, this.topRightBtnTitle, onMenuItemClickListener, null, com.tencent.mm.ui.fb.GREEN);
        } else {
            mMFragment.addIconOptionMenu(1, this.topRightBtnTitle, drawable, onMenuItemClickListener);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void addReportInfo(com.tencent.kinda.gen.ViewReportStruct viewReportStruct) {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) this.weakFragment.get();
        if (baseFragment != null) {
            java.lang.String str = viewReportStruct.mViewId;
            boolean z17 = viewReportStruct.mCheckViewExposure;
            boolean z18 = viewReportStruct.mCheckBtnNoResponse;
            boolean z19 = viewReportStruct.mCheckColor;
            int i17 = viewReportStruct.mBgColor;
            int i18 = com.tencent.kinda.framework.R.id.kinda_main_container;
            com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = (com.tencent.mm.ui.MMFragmentActivity) baseFragment.getActivity();
            com.tencent.kinda.gen.ReportEvent reportEvent = viewReportStruct.mEvent;
            if (reportEvent == com.tencent.kinda.gen.ReportEvent.CUSTOM) {
                baseFragment.addCustomReportEvent(viewReportStruct.mCustomKey, new n05.a(z17, z18, 300L, null, 0, str, mMFragmentActivity, z19, i17, i18));
            } else if (reportEvent == com.tencent.kinda.gen.ReportEvent.CREATE) {
                baseFragment.addLifecycleReportEvent(m05.n.f322577d, new n05.a(z17, z18, 300L, null, 0, str, mMFragmentActivity, z19, i17, i18));
            } else if (reportEvent == com.tencent.kinda.gen.ReportEvent.RESUME) {
                baseFragment.addLifecycleReportEvent(m05.n.f322579f, new n05.a(z17, z18, 300L, null, 0, str, mMFragmentActivity, z19, i17, i18));
            }
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void beginIgnoringInteractionEvents() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.getWindow().addFlags(16);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void closeUI(boolean z17) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (mMFragment instanceof com.tencent.kinda.framework.widget.base.BaseFragment) {
            com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) mMFragment;
            if (baseFragment.isTinyApp && baseFragment.tinyAppUserName != null) {
                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Bi(baseFragment.tinyAppUserName, "", -1, false);
            } else if (baseFragment.isWebUI && !com.tencent.mm.sdk.platformtools.t8.K0(baseFragment.webFromKindaId) && !com.tencent.mm.sdk.platformtools.t8.K0(baseFragment.webRawUrl)) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_kinda_close_webui, true)) {
                    com.tencent.mars.xlog.Log.i(TAG, "kinda close webui enable, fromKindaId is %s", baseFragment.webFromKindaId);
                    final android.app.Activity targetWebUIActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTargetWebUIActivity(baseFragment.webRawUrl, baseFragment.webFromKindaId);
                    if (targetWebUIActivity != null) {
                        ku5.u0 u0Var = ku5.t0.f312615d;
                        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.TAG, "find target webui, close by kinda");
                                targetWebUIActivity.finish();
                            }
                        };
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(runnable, 100L, false);
                    }
                } else {
                    com.tencent.mars.xlog.Log.i(TAG, "kinda close webui not enable");
                }
            }
            baseFragment.popFragment();
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void endEditing() {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment;
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        mMFragment.hideVKB();
        if (mMFragment.getActivity() != null) {
            android.view.View kBLayout = getKBLayout();
            if (kBLayout != null && kBLayout.isShown()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(kBLayout, arrayList.toArray(), "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                kBLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(kBLayout, "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.wallet_core.keyboard.WcPayKeyboard wcPayKeyboard = getWcPayKeyboard();
            if (wcPayKeyboard == null || (baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) this.weakFragment.get()) == null) {
                return;
            }
            baseFragment.hideWcPayKeyboard();
            android.widget.EditText editText = wcPayKeyboard.f213821y;
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void endIgnoringInteractionEvents() {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                com.tencent.mm.ui.MMFragment mMFragment = (com.tencent.mm.ui.MMFragment) com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.weakFragment.get();
                if (mMFragment == null) {
                    com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.TAG, "activity == null.");
                } else {
                    mMFragment.getWindow().clearFlags(16);
                }
            }
        });
    }

    public android.view.View getKBLayout() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return mMFragment.findViewById(com.tencent.mm.R.id.o1v);
        }
        com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        return null;
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public java.lang.String getTitle() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return "";
        }
        return ((java.lang.Object) mMFragment.getMMTitle()) + "";
    }

    public com.tencent.mm.wallet_core.keyboard.WcPayKeyboard getWcPayKeyboard() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment != null) {
            return (com.tencent.mm.wallet_core.keyboard.WcPayKeyboard) mMFragment.findViewById(com.tencent.kinda.framework.R.id.wc_pay_keyboard);
        }
        com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        return null;
    }

    public void onKeyboardShow(final boolean z17, final int i17) {
        if (this.onKeyboardShowCallback != null) {
            ku5.u0 u0Var = ku5.t0.f312615d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.onKeyboardShowCallback.call(z17, i17);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void refreshNavigationBar() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment instanceof com.tencent.kinda.framework.app.MainFragment) {
            ((com.tencent.kinda.framework.app.MainFragment) mMFragment).refreshNavigationBar();
        }
    }

    public void reset() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        mMFragment.setMMNormalView();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.mmTitle)) {
            mMFragment.setMMTitle(this.mmTitle);
        }
        recreateTopRightBtn();
        com.tencent.kinda.gen.VoidCallback voidCallback = this.topLeftBtnCallback;
        if (voidCallback != null) {
            setTopLeftBackBtnCallbackImpl(voidCallback);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setBackBtnVisible(boolean z17) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.setBackBtnVisible(z17);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setKeyBoardShowCallbackImpl(com.tencent.kinda.gen.VoidBoolI32Callback voidBoolI32Callback) {
        this.onKeyboardShowCallback = voidBoolI32Callback;
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setScreenBrightness(float f17) {
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setScreenKeepOn(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setSubTitle(java.lang.String str) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.setMMSubTitle(str);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setSubTitleDefaultColor() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.setMMSubTitleColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.FG_1));
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setSubTitleVisibility(com.tencent.kinda.gen.Visible visible) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (visible == com.tencent.kinda.gen.Visible.GONE) {
            mMFragment.setMMSubTitleVisibility(8);
        } else if (visible == com.tencent.kinda.gen.Visible.VISIBLE) {
            mMFragment.setMMSubTitleVisibility(0);
        } else {
            mMFragment.setMMSubTitleVisibility(4);
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTitle(java.lang.String str) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.setMMTitle(str);
            this.mmTitle = str;
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopLeftBackBtnCallbackImpl(final com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.topLeftBtnCallback = voidCallback;
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else {
            mMFragment.setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.3
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.tencent.kinda.gen.VoidCallback voidCallback2 = voidCallback;
                    if (voidCallback2 == null) {
                        return false;
                    }
                    voidCallback2.call();
                    return true;
                }
            });
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopLeftBtnTitleAndCallbackImpl(java.lang.String str, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mm.ui.MMFragment mMFragment;
        if (str == null || (mMFragment = this.weakFragment.get()) == null) {
            return;
        }
        this.topLeftBtnTitle = str;
        mMFragment.setLeftText(this.topLeftBtnTitle, voidCallback == null ? null : new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.4
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
            }
        });
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightBtnBgIsGreen(boolean z17) {
        this.topRightBtnIsGreen = z17;
        recreateTopRightBtn();
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightBtnDone() {
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightBtnImage(java.lang.String str) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (str == null) {
            return;
        }
        if (str.isEmpty()) {
            this.topRightBtnResId = -1;
        } else {
            int drawableId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getDrawableId(mMFragment.getContext(), str);
            this.topRightBtnResId = drawableId;
            if (drawableId <= 0) {
                this.topRightBtnResId = com.tencent.kinda.framework.widget.tools.ResourcesUtils.getResId(mMFragment.getContext(), str, com.tencent.tinker.loader.shareutil.ShareConstants.DEXMODE_RAW);
            }
        }
        recreateTopRightBtn();
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightBtnTitle(java.lang.String str, java.lang.String str2) {
        this.topRightBtnTitle = str;
        this.topRightBtnColor = str2;
        recreateTopRightBtn();
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback) {
        this.topRightBtnCallback = voidCallback;
        recreateTopRightBtn();
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setTopRightFull(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void setWindowSoftInputAdjustMode(com.tencent.kinda.gen.AndroidWindowAdjustMode androidWindowAdjustMode) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (mMFragment.getActivity().getWindow() != null) {
            int i17 = com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.AnonymousClass8.$SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode[androidWindowAdjustMode.ordinal()];
            mMFragment.getActivity().getWindow().setSoftInputMode((i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : 48 : 32 : 16) | 3);
            if (androidWindowAdjustMode == com.tencent.kinda.gen.AndroidWindowAdjustMode.RESIZE) {
                this.mAndroidBug5497Workaround = new com.tencent.mm.ui.r0(mMFragment.getActivity(), false);
                return;
            }
            com.tencent.mm.ui.r0 r0Var = this.mAndroidBug5497Workaround;
            if (r0Var != null) {
                android.view.View view = r0Var.f209580d;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(r0Var.f209585i);
                r0Var.f209582f.height = -1;
                view.requestLayout();
            }
        }
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void startLoading(java.lang.String str, boolean z17) {
        android.app.Dialog dialog = this.mTipDialog;
        if (dialog != null) {
            dialog.show();
            return;
        }
        android.app.Activity topOrUIPageFragmentActivity = com.tencent.kinda.framework.widget.tools.KindaContext.getTopOrUIPageFragmentActivity();
        if (topOrUIPageFragmentActivity == null) {
            com.tencent.mars.xlog.Log.e(TAG, "IUIPagePlatformFuncDelegate can't startLoading because the activity is null!");
            return;
        }
        android.app.Dialog c17 = com.tencent.mm.wallet_core.ui.b2.c(topOrUIPageFragmentActivity, topOrUIPageFragmentActivity.getString(com.tencent.mm.R.string.kvq), true, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.7
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                if (com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.mTipDialog == null || !com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.mTipDialog.isShowing()) {
                    return;
                }
                com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.this.mTipDialog.dismiss();
            }
        });
        this.mTipDialog = c17;
        c17.setCancelable(false);
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void stopLoading() {
        android.app.Dialog dialog = this.mTipDialog;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.mTipDialog.dismiss();
    }

    @Override // com.tencent.kinda.gen.IUIPagePlatformFuncDelegate
    public void triggerReport(com.tencent.kinda.gen.ReportEvent reportEvent, java.lang.String str) {
        com.tencent.kinda.framework.widget.base.BaseFragment baseFragment = (com.tencent.kinda.framework.widget.base.BaseFragment) this.weakFragment.get();
        if (baseFragment != null) {
            if (reportEvent == com.tencent.kinda.gen.ReportEvent.CUSTOM) {
                baseFragment.triggerReport(m05.n.f322580g, str);
            } else if (reportEvent == com.tencent.kinda.gen.ReportEvent.CREATE) {
                baseFragment.triggerReport(m05.n.f322577d, "");
            } else if (reportEvent == com.tencent.kinda.gen.ReportEvent.RESUME) {
                baseFragment.triggerReport(m05.n.f322579f, "");
            }
        }
    }
}
