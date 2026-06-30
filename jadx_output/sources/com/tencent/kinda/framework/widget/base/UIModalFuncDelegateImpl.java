package com.tencent.kinda.framework.widget.base;

/* loaded from: classes9.dex */
public class UIModalFuncDelegateImpl implements com.tencent.kinda.gen.IUIModalPlatformFuncDelegate {
    private static final java.lang.String TAG = "MicroMsg.kinda.UIModalFuncDelegateImpl";
    private byte _hellAccFlag_;
    private com.tencent.kinda.gen.VoidBoolI32Callback onKeyboardShowCallback;
    public java.lang.ref.WeakReference<com.tencent.mm.ui.MMFragment> weakFragment;

    public UIModalFuncDelegateImpl(com.tencent.mm.ui.MMFragment mMFragment) {
        this.weakFragment = new java.lang.ref.WeakReference<>(mMFragment);
    }

    @Override // com.tencent.kinda.gen.IUIModalPlatformFuncDelegate
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
                yj0.a.d(kBLayout, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                kBLayout.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(kBLayout, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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

    @Override // com.tencent.kinda.gen.IUIModalPlatformFuncDelegate
    public void fragmentShow(boolean z17) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(TAG, "show fragment.");
            androidx.fragment.app.i2 beginTransaction = mMFragment.getActivity().getSupportFragmentManager().beginTransaction();
            beginTransaction.n(mMFragment);
            beginTransaction.e();
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "hide fragment.");
        androidx.fragment.app.i2 beginTransaction2 = mMFragment.getActivity().getSupportFragmentManager().beginTransaction();
        beginTransaction2.i(mMFragment);
        beginTransaction2.e();
    }

    @Override // com.tencent.kinda.gen.IUIModalPlatformFuncDelegate
    public void genSnapshotImpl(boolean z17, final com.tencent.kinda.gen.VoidCallback voidCallback) {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
            return;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i(TAG, "show snapshot.");
            android.view.View findViewById = mMFragment.findViewById(com.tencent.kinda.framework.R.id.container);
            android.widget.ImageView imageView = (android.widget.ImageView) mMFragment.findViewById(com.tencent.kinda.framework.R.id.snapshot_view);
            int width = findViewById.getWidth();
            int height = findViewById.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            findViewById.draw(new android.graphics.Canvas(createBitmap));
            imageView.setImageBitmap(createBitmap);
            imageView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    voidCallback.call();
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "hide snapshot.");
        android.view.View findViewById2 = mMFragment.findViewById(com.tencent.kinda.framework.R.id.container);
        final android.widget.ImageView imageView2 = (android.widget.ImageView) mMFragment.findViewById(com.tencent.kinda.framework.R.id.snapshot_view);
        if (mMFragment instanceof com.tencent.kinda.framework.app.ModalFragment) {
            float animationCutLinePosition = (int) ((com.tencent.kinda.framework.app.ModalFragment) mMFragment).getPage().animationCutLinePosition();
            com.tencent.mars.xlog.Log.i(TAG, "cutPosDp %s", java.lang.Float.valueOf(animationCutLinePosition));
            if (animationCutLinePosition > 0.0f) {
                int a17 = i65.a.a(mMFragment.getContext(), animationCutLinePosition);
                int width2 = findViewById2.getWidth();
                int height2 = findViewById2.getHeight();
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList3.add(java.lang.Integer.valueOf(height2));
                arrayList3.add(java.lang.Integer.valueOf(width2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                yj0.a.e(obj2, createBitmap2, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                findViewById2.draw(new android.graphics.Canvas(createBitmap2));
                int width3 = findViewById2.getWidth();
                int height3 = findViewById2.getHeight() - a17;
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(java.lang.Integer.valueOf(height3));
                arrayList4.add(java.lang.Integer.valueOf(width3));
                arrayList4.add(java.lang.Integer.valueOf(a17));
                arrayList4.add(0);
                arrayList4.add(createBitmap2);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList4);
                yj0.a.d(obj3, arrayList4.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap3 = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList4.get(0), ((java.lang.Integer) arrayList4.get(1)).intValue(), ((java.lang.Integer) arrayList4.get(2)).intValue(), ((java.lang.Integer) arrayList4.get(3)).intValue(), ((java.lang.Integer) arrayList4.get(4)).intValue());
                yj0.a.e(obj3, createBitmap3, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                imageView2.setImageBitmap(createBitmap3);
                imageView2.postDelayed(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.1
                    @Override // java.lang.Runnable
                    public void run() {
                        imageView2.setVisibility(4);
                    }
                }, 200L);
            } else {
                imageView2.setVisibility(4);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(findViewById2, arrayList5.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView2.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                voidCallback.call();
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
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.this.onKeyboardShowCallback.call(z17, i17);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    @Override // com.tencent.kinda.gen.IUIModalPlatformFuncDelegate
    public void refreshNavigationBar() {
        com.tencent.mm.ui.MMFragment mMFragment = this.weakFragment.get();
        if (mMFragment == null) {
            com.tencent.mars.xlog.Log.i(TAG, "activity == null.");
        } else if (mMFragment instanceof com.tencent.kinda.framework.app.ModalFragment) {
            ((com.tencent.kinda.framework.app.ModalFragment) mMFragment).refreshNavigationBar();
        }
    }

    @Override // com.tencent.kinda.gen.IUIModalPlatformFuncDelegate
    public void setKeyBoardShowCallbackImpl(com.tencent.kinda.gen.VoidBoolI32Callback voidBoolI32Callback) {
        this.onKeyboardShowCallback = voidBoolI32Callback;
    }
}
