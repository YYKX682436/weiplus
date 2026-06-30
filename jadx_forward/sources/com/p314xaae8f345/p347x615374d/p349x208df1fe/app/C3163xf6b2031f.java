package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl */
/* loaded from: classes9.dex */
public class C3163xf6b2031f implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68 {
    private static final java.lang.String TAG = "UIPagePlatformFuncDelegateImpl";

    /* renamed from: _hellAccFlag_ */
    private byte f12173x7f11beae;

    /* renamed from: mAndroidBug5497Workaround */
    private com.p314xaae8f345.mm.ui.r0 f12174x2ec3484d;

    /* renamed from: onKeyboardShowCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f f12177xef66d468;

    /* renamed from: topLeftBtnCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12178xcd25f625;

    /* renamed from: topRightBtnCallback */
    private com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 f12180xd7af5e7a;

    /* renamed from: topRightBtnColor */
    private java.lang.String f12181x5feea54e;

    /* renamed from: topRightBtnTitle */
    private java.lang.String f12184x60db9843;

    /* renamed from: weakFragment */
    private java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010> f12185x7bb9ede8;

    /* renamed from: topRightBtnResId */
    private int f12183x60bd8fc6 = -1;

    /* renamed from: topRightBtnIsGreen */
    private boolean f12182x610b2324 = false;

    /* renamed from: topLeftBtnTitle */
    private java.lang.String f12179xc0d1878 = "";

    /* renamed from: mmTitle */
    private java.lang.String f12176x44d8a898 = "";

    /* renamed from: mTipDialog */
    private android.app.Dialog f12175xe3cdd3d6 = null;

    /* renamed from: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl$8, reason: invalid class name */
    /* loaded from: classes9.dex */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: $SwitchMap$com$tencent$kinda$gen$AndroidWindowAdjustMode */
        static final /* synthetic */ int[] f12198x620f0c44;

        static {
            int[] iArr = new int[com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651.m27384xcee59d22().length];
            f12198x620f0c44 = iArr;
            try {
                iArr[com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651.RESIZE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                f12198x620f0c44[com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651.PAN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                f12198x620f0c44[com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651.NOTHING.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
        }
    }

    public C3163xf6b2031f(com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010) {
        this.f12185x7bb9ede8 = new java.lang.ref.WeakReference<>(abstractViewOnAttachStateChangeListenerC21400xb429b010);
    }

    /* renamed from: recreateTopRightBtn */
    private void m25512x40374ea6() {
        android.graphics.drawable.Drawable drawable;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.m78679x39037dd1();
        if (this.f12183x60bd8fc6 > 0) {
            drawable = abstractViewOnAttachStateChangeListenerC21400xb429b010.m7460x893a2f6f().getDrawable(this.f12183x60bd8fc6);
            if (drawable != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12181x5feea54e)) {
                try {
                    drawable.setColorFilter(android.graphics.Color.parseColor(this.f12181x5feea54e), android.graphics.PorterDuff.Mode.SRC_ATOP);
                } catch (java.lang.Exception unused) {
                }
            }
        } else {
            drawable = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12184x60db9843) && drawable == null) {
            return;
        }
        android.view.MenuItem.OnMenuItemClickListener onMenuItemClickListener = new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.5
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12180xd7af5e7a == null) {
                    return false;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12180xd7af5e7a.mo25801x2e7a5e();
                return true;
            }
        };
        if (drawable != null) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78631x84f07bce(1, this.f12184x60db9843, drawable, onMenuItemClickListener);
        } else if (this.f12182x610b2324) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78635xd9193382(1, this.f12184x60db9843, onMenuItemClickListener, null, com.p314xaae8f345.mm.ui.fb.GREEN);
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78631x84f07bce(1, this.f12184x60db9843, drawable, onMenuItemClickListener);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: addReportInfo */
    public void mo25513x744b3383(com.p314xaae8f345.p347x615374d.gen.C3615xcb2a198e c3615xcb2a198e) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) this.f12185x7bb9ede8.get();
        if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
            java.lang.String str = c3615xcb2a198e.f13891x1ebf556d;
            boolean z17 = c3615xcb2a198e.f13888x74401b07;
            boolean z18 = c3615xcb2a198e.f13886x8aff5fc3;
            boolean z19 = c3615xcb2a198e.f13887xbbc03788;
            int i17 = c3615xcb2a198e.f13885x91e2c8f1;
            int i18 = com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11564x313a4cad;
            com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) abstractViewOnTouchListenerC3283x43ef4061.mo7430x19263085();
            com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6 enumC3595x5349f5a6 = c3615xcb2a198e.f13890xbe03be2d;
            if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.CUSTOM) {
                abstractViewOnTouchListenerC3283x43ef4061.m26073xd2c986f4(c3615xcb2a198e.f13889xdac56341, new n05.a(z17, z18, 300L, null, 0, str, activityC21401x6ce6f73f, z19, i17, i18));
            } else if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.CREATE) {
                abstractViewOnTouchListenerC3283x43ef4061.m26074xe1643a3d(m05.n.f404110d, new n05.a(z17, z18, 300L, null, 0, str, activityC21401x6ce6f73f, z19, i17, i18));
            } else if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.RESUME) {
                abstractViewOnTouchListenerC3283x43ef4061.m26074xe1643a3d(m05.n.f404112f, new n05.a(z17, z18, 300L, null, 0, str, activityC21401x6ce6f73f, z19, i17, i18));
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: beginIgnoringInteractionEvents */
    public void mo25514x58ec5ed3() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78395x3622fee6().addFlags(16);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: closeUI */
    public void mo25515x33a64a8c(boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) {
            com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) abstractViewOnAttachStateChangeListenerC21400xb429b010;
            if (abstractViewOnTouchListenerC3283x43ef4061.f12622x8f371677 && abstractViewOnTouchListenerC3283x43ef4061.f12637xfac09f17 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).Bi(abstractViewOnTouchListenerC3283x43ef4061.f12637xfac09f17, "", -1, false);
            } else if (abstractViewOnTouchListenerC3283x43ef4061.f12623x7ba4fdde && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractViewOnTouchListenerC3283x43ef4061.f12641x46724e4a) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(abstractViewOnTouchListenerC3283x43ef4061.f12642xb944ac9b)) {
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_kinda_close_webui, true)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda close webui enable, fromKindaId is %s", abstractViewOnTouchListenerC3283x43ef4061.f12641x46724e4a);
                    final android.app.Activity m27311x9a46aed0 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27311x9a46aed0(abstractViewOnTouchListenerC3283x43ef4061.f12642xb944ac9b, abstractViewOnTouchListenerC3283x43ef4061.f12641x46724e4a);
                    if (m27311x9a46aed0 != null) {
                        ku5.u0 u0Var = ku5.t0.f394148d;
                        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.1
                            @Override // java.lang.Runnable
                            public void run() {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.TAG, "find target webui, close by kinda");
                                m27311x9a46aed0.finish();
                            }
                        };
                        ku5.t0 t0Var = (ku5.t0) u0Var;
                        t0Var.getClass();
                        t0Var.z(runnable, 100L, false);
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "kinda close webui not enable");
                }
            }
            abstractViewOnTouchListenerC3283x43ef4061.m26096x8f5417c1();
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: endEditing */
    public void mo25516x9d07683d() {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78661x36654fab();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085() != null) {
            android.view.View m25518x11932cb7 = m25518x11932cb7();
            if (m25518x11932cb7 != null && m25518x11932cb7.isShown()) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(m25518x11932cb7, arrayList.toArray(), "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                m25518x11932cb7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(m25518x11932cb7, "com/tencent/kinda/framework/app/UIPagePlatformFuncDelegateImpl", "endEditing", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 m25520xe37fbe8d = m25520xe37fbe8d();
            if (m25520xe37fbe8d == null || (abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) this.f12185x7bb9ede8.get()) == null) {
                return;
            }
            abstractViewOnTouchListenerC3283x43ef4061.m26084xd5cb7021();
            android.widget.EditText editText = m25520xe37fbe8d.f295354y;
            if (editText != null) {
                editText.clearFocus();
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: endIgnoringInteractionEvents */
    public void mo25517xf4c38ae1() {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.2
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = (com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12185x7bb9ede8.get();
                if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.TAG, "activity == null.");
                } else {
                    abstractViewOnAttachStateChangeListenerC21400xb429b010.m78395x3622fee6().clearFlags(16);
                }
            }
        });
    }

    /* renamed from: getKBLayout */
    public android.view.View m25518x11932cb7() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.o1v);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: getTitle */
    public java.lang.String mo25519x7531c8a2() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return "";
        }
        return ((java.lang.Object) abstractViewOnAttachStateChangeListenerC21400xb429b010.m78655x4c0ad082()) + "";
    }

    /* renamed from: getWcPayKeyboard */
    public com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223 m25520xe37fbe8d() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 != null) {
            return (com.p314xaae8f345.mm.p2802xd031a825.p2803x1e0673e7.C22894x55bf3223) abstractViewOnAttachStateChangeListenerC21400xb429b010.mo26077x4ff8c0f0(com.p314xaae8f345.p347x615374d.p349x208df1fe.R.id.f11642x2e4f831);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        return null;
    }

    /* renamed from: onKeyboardShow */
    public void m25521x81b60303(final boolean z17, final int i17) {
        if (this.f12177xef66d468 != null) {
            ku5.u0 u0Var = ku5.t0.f394148d;
            java.lang.Runnable runnable = new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.6
                @Override // java.lang.Runnable
                public void run() {
                    com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12177xef66d468.mo28436x2e7a5e(z17, i17);
                }
            };
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(runnable, 100L, false);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: refreshNavigationBar */
    public void mo25522xc5b52a44() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 instanceof com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3156x441ad749) abstractViewOnAttachStateChangeListenerC21400xb429b010).m25468xc5b52a44();
        }
    }

    /* renamed from: reset */
    public void m25523x6761d4f() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        abstractViewOnAttachStateChangeListenerC21400xb429b010.m78689xd2a3374e();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f12176x44d8a898)) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78695xbf7c1df6(this.f12176x44d8a898);
        }
        m25512x40374ea6();
        com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619 = this.f12178xcd25f625;
        if (abstractC3623x3b485619 != null) {
            mo25533x4d6a0a00(abstractC3623x3b485619);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setBackBtnVisible */
    public void mo25524xe21cbbf(boolean z17) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78684xe21cbbf(z17);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setBackgroundColor */
    public void mo25525x67f06213(com.p314xaae8f345.p347x615374d.gen.C3392x2ae78284 c3392x2ae78284) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setKeyBoardShowCallbackImpl */
    public void mo25526xb0a99c0b(com.p314xaae8f345.p347x615374d.gen.AbstractC3619x576eb74f abstractC3619x576eb74f) {
        this.f12177xef66d468 = abstractC3619x576eb74f;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setScreenBrightness */
    public void mo25527xaf7a2e5f(float f17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setScreenKeepOn */
    public void mo25528x24aca152(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setSubTitle */
    public void mo25529xf9fefa7a(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78691x3f86539a(str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setSubTitleDefaultColor */
    public void mo25530x6d45913c() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78692x31241be9(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setSubTitleVisibility */
    public void mo25531x4a93e92c(com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852 enumC3616x7f0a8852) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (enumC3616x7f0a8852 == com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.GONE) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78693xb2165a4c(8);
        } else if (enumC3616x7f0a8852 == com.p314xaae8f345.p347x615374d.gen.EnumC3616x7f0a8852.VISIBLE) {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78693xb2165a4c(0);
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.m78693xb2165a4c(4);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTitle */
    public void mo25532x53bfe316(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78695xbf7c1df6(str);
            this.f12176x44d8a898 = str;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopLeftBackBtnCallbackImpl */
    public void mo25533x4d6a0a00(final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12178xcd25f625 = abstractC3623x3b485619;
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
        } else {
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo78682x9c8c0d33(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.3
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public boolean onMenuItemClick(android.view.MenuItem menuItem) {
                    com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b4856192 = abstractC3623x3b485619;
                    if (abstractC3623x3b4856192 == null) {
                        return false;
                    }
                    abstractC3623x3b4856192.mo25801x2e7a5e();
                    return true;
                }
            });
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopLeftBtnTitleAndCallbackImpl */
    public void mo25534x59efa0e6(java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010;
        if (str == null || (abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get()) == null) {
            return;
        }
        this.f12179xc0d1878 = str;
        abstractViewOnAttachStateChangeListenerC21400xb429b010.m78688xdcff9c56(this.f12179xc0d1878, abstractC3623x3b485619 == null ? null : new java.lang.Runnable() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.4
            @Override // java.lang.Runnable
            public void run() {
                abstractC3623x3b485619.mo25801x2e7a5e();
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightBtnBgIsGreen */
    public void mo25535xf06113e1(boolean z17) {
        this.f12182x610b2324 = z17;
        m25512x40374ea6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightBtnDone */
    public void mo25536xaab42f75() {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightBtnImage */
    public void mo25537xac171bc8(java.lang.String str) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (str == null) {
            return;
        }
        if (str.isEmpty()) {
            this.f12183x60bd8fc6 = -1;
        } else {
            int m27366xffdf924f = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27366xffdf924f(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), str);
            this.f12183x60bd8fc6 = m27366xffdf924f;
            if (m27366xffdf924f <= 0) {
                this.f12183x60bd8fc6 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.m27370x7513c025(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7438x76847179(), str, com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463);
            }
        }
        m25512x40374ea6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightBtnTitle */
    public void mo25538xacb094c5(java.lang.String str, java.lang.String str2) {
        this.f12184x60db9843 = str;
        this.f12181x5feea54e = str2;
        m25512x40374ea6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightCallbackImpl */
    public void mo25539x2a8bb6ee(com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
        this.f12180xd7af5e7a = abstractC3623x3b485619;
        m25512x40374ea6();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setTopRightFull */
    public void mo25540x9cea8678(boolean z17) {
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: setWindowSoftInputAdjustMode */
    public void mo25541xac66ab60(com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651 enumC3379x39eda651) {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f12185x7bb9ede8.get();
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "activity == null.");
            return;
        }
        if (abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085().getWindow() != null) {
            int i17 = com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.AnonymousClass8.f12198x620f0c44[enumC3379x39eda651.ordinal()];
            abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085().getWindow().setSoftInputMode((i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : 48 : 32 : 16) | 3);
            if (enumC3379x39eda651 == com.p314xaae8f345.p347x615374d.gen.EnumC3379x39eda651.RESIZE) {
                this.f12174x2ec3484d = new com.p314xaae8f345.mm.ui.r0(abstractViewOnAttachStateChangeListenerC21400xb429b010.mo7430x19263085(), false);
                return;
            }
            com.p314xaae8f345.mm.ui.r0 r0Var = this.f12174x2ec3484d;
            if (r0Var != null) {
                android.view.View view = r0Var.f291113d;
                view.getViewTreeObserver().removeOnGlobalLayoutListener(r0Var.f291118i);
                r0Var.f291115f.height = -1;
                view.requestLayout();
            }
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: startLoading */
    public void mo25542xc0d627a(java.lang.String str, boolean z17) {
        android.app.Dialog dialog = this.f12175xe3cdd3d6;
        if (dialog != null) {
            dialog.show();
            return;
        }
        android.app.Activity m27313x7608d9c4 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.m27313x7608d9c4();
        if (m27313x7608d9c4 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "IUIPagePlatformFuncDelegate can't startLoading because the activity is null!");
            return;
        }
        android.app.Dialog c17 = com.p314xaae8f345.mm.p2802xd031a825.ui.b2.c(m27313x7608d9c4, m27313x7608d9c4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kvq), true, new android.content.DialogInterface.OnCancelListener() { // from class: com.tencent.kinda.framework.app.UIPagePlatformFuncDelegateImpl.7
            @Override // android.content.DialogInterface.OnCancelListener
            public void onCancel(android.content.DialogInterface dialogInterface) {
                if (com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12175xe3cdd3d6 == null || !com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12175xe3cdd3d6.isShowing()) {
                    return;
                }
                com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3163xf6b2031f.this.f12175xe3cdd3d6.dismiss();
            }
        });
        this.f12175xe3cdd3d6 = c17;
        c17.setCancelable(false);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: stopLoading */
    public void mo25543xc77ccada() {
        android.app.Dialog dialog = this.f12175xe3cdd3d6;
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        this.f12175xe3cdd3d6.dismiss();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3417x6dcc3b68
    /* renamed from: triggerReport */
    public void mo25544x9f6b6d0c(com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6 enumC3595x5349f5a6, java.lang.String str) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061 abstractViewOnTouchListenerC3283x43ef4061 = (com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p359x2e06d1.AbstractViewOnTouchListenerC3283x43ef4061) this.f12185x7bb9ede8.get();
        if (abstractViewOnTouchListenerC3283x43ef4061 != null) {
            if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.CUSTOM) {
                abstractViewOnTouchListenerC3283x43ef4061.m26101x9f6b6d0c(m05.n.f404113g, str);
            } else if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.CREATE) {
                abstractViewOnTouchListenerC3283x43ef4061.m26101x9f6b6d0c(m05.n.f404110d, "");
            } else if (enumC3595x5349f5a6 == com.p314xaae8f345.p347x615374d.gen.EnumC3595x5349f5a6.RESUME) {
                abstractViewOnTouchListenerC3283x43ef4061.m26101x9f6b6d0c(m05.n.f404112f, "");
            }
        }
    }
}
