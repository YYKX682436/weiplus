package com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1;

/* renamed from: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl */
/* loaded from: classes9.dex */
public class C3358x144888c2 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac {
    private static final java.lang.String TAG = "MicroMsg.kinda.UIModalFuncDelegateImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f13254x7f11beae;

    /* renamed from: onKeyboardShowCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f f13255xef66d468;

    /* renamed from: weakFragment */
    public java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010> f13256x7bb9ede8;

    public C3358x144888c2(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        this.f13256x7bb9ede8 = new java.lang.ref.WeakReference<>(abstractViewOnAttachStateChangeListenerC21400xb429b010);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac
    /* renamed from: endEditing */
    public void mo27147x9d07683d() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78661x36654fab();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085() != null) {
            android.view.View m27150x11932cb7 = m27150x11932cb7();
            if (m27150x11932cb7 != null && m27150x11932cb7.isShown()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m27150x11932cb7, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m27150x11932cb7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m27150x11932cb7, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 m27151xe37fbe8d = m27151xe37fbe8d();
            if (m27151xe37fbe8d == null || (abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) this.f13256x7bb9ede8.get()) == null) {
                return;
            }
            abstractViewOnTouchListenerC3283x43ef4061.m26084xd5cb7021();
            android.widget.EditText editText = m27151xe37fbe8d.f295354y;
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac
    /* renamed from: fragmentShow */
    public void mo27148x71f0896d(boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "show fragment.");
            p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085().mo7595x9cdc264().m7630xb2c12e75();
            m7630xb2c12e75.n(abstractViewOnAttachStateChangeListenerC21400xb429b010);
            m7630xb2c12e75.e();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hide fragment.");
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e752 = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085().mo7595x9cdc264().m7630xb2c12e75();
        m7630xb2c12e752.i(abstractViewOnAttachStateChangeListenerC21400xb429b010);
        m7630xb2c12e752.e();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac
    /* renamed from: genSnapshotImpl */
    public void mo27149x92559574(boolean z17, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "show snapshot.");
            android.view.View mo26077x4ff8c0f0 = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11497xe7814c81);
            android.widget.ImageView imageView = (android.widget.ImageView) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11632x476a1840);
            int width = mo26077x4ff8c0f0.getWidth();
            int height = mo26077x4ff8c0f0.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            mo26077x4ff8c0f0.draw(new android.graphics.Canvas(createBitmap));
            imageView.setImageBitmap(createBitmap);
            imageView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(mo26077x4ff8c0f0, arrayList2.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(mo26077x4ff8c0f0, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.3
                @Override // java.lang.Runnable
                public void run() {
                    abstractC3623x3b485619.mo25801x2e7a5e();
                }
            });
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hide snapshot.");
        android.view.View mo26077x4ff8c0f02 = abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11497xe7814c81);
        final android.widget.ImageView imageView2 = (android.widget.ImageView) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11632x476a1840);
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) {
            float mo27600x3740a07b = (int) ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) abstractViewOnAttachStateChangeListenerC21400xb429b010).m25481xfb83cb05().mo27600x3740a07b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cutPosDp %s", java.lang.Float.valueOf(mo27600x3740a07b));
            if (mo27600x3740a07b > 0.0f) {
                int a17 = i65.a.a(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), mo27600x3740a07b);
                int width2 = mo26077x4ff8c0f02.getWidth();
                int height2 = mo26077x4ff8c0f02.getHeight();
                android.graphics.Bitmap.Config config2 = android.graphics.Bitmap.Config.ARGB_8888;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(config2);
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList3.add(java.lang.Integer.valueOf(height2));
                arrayList3.add(java.lang.Integer.valueOf(width2));
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj2, arrayList3.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList3.get(0)).intValue(), ((java.lang.Integer) arrayList3.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList3.get(2));
                yj0.a.e(obj2, createBitmap2, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
                mo26077x4ff8c0f02.draw(new android.graphics.Canvas(createBitmap2));
                int width3 = mo26077x4ff8c0f02.getWidth();
                int height3 = mo26077x4ff8c0f02.getHeight() - a17;
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
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(mo26077x4ff8c0f02, arrayList5.toArray(), "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo26077x4ff8c0f02.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(mo26077x4ff8c0f02, "com/tencent/kinda/framework/widget/base/UIModalFuncDelegateImpl", "genSnapshotImpl", "(ZLcom/tencent/kinda/gen/VoidCallback;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        imageView2.post(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }

    /* renamed from: getKBLayout */
    public android.view.View m27150x11932cb7() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        return null;
    }

    /* renamed from: getWcPayKeyboard */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 m27151xe37fbe8d() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11642x2e4f831);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        return null;
    }

    /* renamed from: onKeyboardShow */
    public void m27152x81b60303(final boolean z17, final int i17) {
        if (this.f13255xef66d468 != null) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.widget.base.UIModalFuncDelegateImpl.4
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.C3358x144888c2.this.f13255xef66d468.mo28436x2e7a5e(z17, i17);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac
    /* renamed from: refreshNavigationBar */
    public void mo27153xc5b52a44() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f13256x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else if (abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3157xfaf573fd) abstractViewOnAttachStateChangeListenerC21400xb429b010).m25483xc5b52a44();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3413x5796dcac
    /* renamed from: setKeyBoardShowCallbackImpl */
    public void mo27154xb0a99c0b(com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f abstractC3619x576eb74f) {
        this.f13255xef66d468 = abstractC3619x576eb74f;
    }
}
