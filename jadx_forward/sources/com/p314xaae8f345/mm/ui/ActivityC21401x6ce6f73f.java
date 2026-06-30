package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.MMFragmentActivity */
/* loaded from: classes14.dex */
public class ActivityC21401x6ce6f73f extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae implements al5.z2, al5.f3, im5.b {

    /* renamed from: ANIMATION_DURATION */
    public static final long f39352xc29cd40f = 260;

    /* renamed from: EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM */
    public static final java.lang.String f39353x639dcc24 = "extra_use_system_default_enter_exit_anim";
    private static final java.lang.String TAG = "MicroMsg.MMFragmentActivity";

    /* renamed from: WIDTH_SETTLE_FACT */
    public static final float f39354xb0e363c7 = 2.5f;

    /* renamed from: WIDTH_SETTLE_FACT_FOR_CHATTING */
    public static final float f39355xc96fda94 = 2.5f;

    /* renamed from: aMonitor */
    public static uk5.c f39356x93b55b9;

    /* renamed from: aReporter */
    public static uk5.f f39357x18545862;

    /* renamed from: interceptors */
    private static java.util.List<com.p314xaae8f345.mm.ui.ad> f39358xbc71beee;

    /* renamed from: _hellAccFlag_ */
    private byte f39359x7f11beae;

    /* renamed from: className */
    java.lang.String f39360xff691c23;

    /* renamed from: customResources */
    private android.content.res.Resources f39361x2f3fa1b4;

    /* renamed from: mForceBaseResources */
    private android.content.res.Resources f39366x47724876;

    /* renamed from: mForceNewResources */
    private android.content.res.Resources f39367xaab86603;

    /* renamed from: mForceOldResources */
    private android.content.res.Resources f39368xa337895c;

    /* renamed from: mIsPaused */
    private boolean f39369x11d73285;

    /* renamed from: mSwipeBackLayout */
    private com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab f39371x13746d9e;

    /* renamed from: mSwiping */
    private boolean f39372x3292284a;

    /* renamed from: record */
    java.util.ArrayList<java.lang.ref.WeakReference<com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010>> f39376xc8466c51 = new java.util.ArrayList<>();

    /* renamed from: mLifeCycleKeeper */
    private dm5.a f39370x6a185eaf = new dm5.a();

    /* renamed from: onActResult */
    private com.p314xaae8f345.mm.ui.xc f39373xe2323430 = null;

    /* renamed from: onActResults */
    private java.util.List<com.p314xaae8f345.mm.ui.xc> f39374x64145243 = new java.util.LinkedList();

    /* renamed from: onRequestResults */
    private java.util.List<com.p314xaae8f345.mm.ui.yc> f39375x1965a26 = new java.util.LinkedList();

    /* renamed from: inflateXMLInfo */
    public yn5.l f39362x7310015e = new yn5.l(getClass().getSimpleName());

    /* renamed from: mActivityAnimStyle */
    private com.p314xaae8f345.mm.ui.uc f39363x83fcc2e4 = new com.p314xaae8f345.mm.ui.uc();

    /* renamed from: updateResource */
    private boolean f39378x1f8987f7 = false;

    /* renamed from: updateForceResource */
    private boolean f39377x8fdcddd0 = false;

    /* renamed from: mContentViewForSwipeBack */
    private android.view.View f39364x75804329 = null;

    /* renamed from: mDispatchedTouchListeners */
    private java.util.List<com.p314xaae8f345.mm.ui.wc> f39365x7c619e46 = new java.util.ArrayList();

    static {
        vj5.n.f519252l = new com.p314xaae8f345.mm.ui.C21402x11bed842();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = new java.util.concurrent.CopyOnWriteArrayList();
        f39358xbc71beee = copyOnWriteArrayList;
        copyOnWriteArrayList.add(new com.p314xaae8f345.mm.ui.tc());
        int i17 = uk5.f.f510083a;
        f39357x18545862 = uk5.e.f510082a;
        int i18 = uk5.c.f510081a;
        f39356x93b55b9 = uk5.b.f510080a;
    }

    /* renamed from: addInterceptor */
    public static void m78728x967536c4(com.p314xaae8f345.mm.ui.ad adVar) {
        f39358xbc71beee.add(adVar);
    }

    /* renamed from: isVASActivity */
    public static boolean m78729x75b0ecd(android.content.Intent intent) {
        return intent != null && lk5.s.d(intent, 1);
    }

    public final boolean R6(android.content.Context context, java.lang.String str, android.content.Intent intent, int i17, com.p314xaae8f345.mm.ui.x7 x7Var) {
        java.util.Iterator<com.p314xaae8f345.mm.ui.ad> it = f39358xbc71beee.iterator();
        while (it.hasNext()) {
            if (it.next().b(context, str, intent, i17, x7Var)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: addDispatchedTouchListener */
    public void m78730xd9026919(com.p314xaae8f345.mm.ui.wc wcVar) {
        boolean z17;
        for (com.p314xaae8f345.mm.ui.wc wcVar2 : this.f39365x7c619e46) {
            if (wcVar2 == wcVar || wcVar2.key().equals(wcVar.key())) {
                z17 = true;
                break;
            }
        }
        z17 = false;
        if (z17) {
            return;
        }
        this.f39365x7c619e46.add(wcVar);
    }

    /* renamed from: appendMemLog */
    public java.lang.String m78731x4356b8e9() {
        long j17 = java.lang.Runtime.getRuntime().totalMemory();
        long freeMemory = java.lang.Runtime.getRuntime().freeMemory();
        return java.lang.String.format("Runtime: [%s:%s:%s] Native: [%s:%s:%s] ", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(freeMemory), java.lang.Long.valueOf(j17 - freeMemory), java.lang.Long.valueOf(android.os.Debug.getNativeHeapSize()), java.lang.Long.valueOf(android.os.Debug.getNativeHeapAllocatedSize()), java.lang.Long.valueOf(android.os.Debug.getNativeHeapFreeSize()));
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
        fp.q.f346763a.e(this);
    }

    /* renamed from: convertActivityFromTranslucent */
    public boolean mo44290xd3d2670d() {
        return true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        zk3.c Ai;
        if (keyEvent.getKeyCode() == 4 && (Ai = ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Ai(this)) != null && ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) Ai).S6(keyEvent)) {
            return true;
        }
        if (getF147381t()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
            if (keyEvent.getKeyCode() == 4 && m78735x28280f95 != null) {
                m78735x28280f95.a();
                if (m78735x28280f95.f292974v) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ashutest", "ashutest::IS SwipeBack ING, ignore KeyBack Event");
                    return true;
                }
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        java.util.Iterator<com.p314xaae8f345.mm.ui.wc> it = this.f39365x7c619e46.iterator();
        while (it.hasNext()) {
            it.next().a(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: enableActivityAnimation */
    public boolean mo56573xa904b9f2() {
        android.content.Intent intent = getIntent();
        return !(intent != null ? com.p314xaae8f345.mm.sdk.p2603x2137b148.c2.c(intent, f39353x639dcc24, false) : false);
    }

    /* renamed from: enableEdge2Edge */
    public boolean mo60885x863d972f() {
        return true;
    }

    /* renamed from: enableEdgeToEdgeWrapperLayout */
    public boolean m78732xefeb73a5() {
        return !((db5.f.e(getClass()) & 4096) != 0) && mo60885x863d972f();
    }

    /* renamed from: enableFixNavigationBarForApi35 */
    public boolean m78733xa84e24c0() {
        return !((db5.f.e(getClass()) & 512) != 0);
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.app.Activity
    public <T extends android.view.View> T findViewById(int i17) {
        T t17 = (T) super.findViewById(i17);
        int i18 = ih5.c.f373136a;
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return t17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void finish() {
        super.finish();
        mo50392x5138328b();
    }

    /* renamed from: forceRemoveNoMatchOnPath */
    public boolean mo2324x9a379939() {
        return false;
    }

    /* renamed from: getActionBarHeightFromTheme */
    public int mo74405xf4b5b091() {
        return fp.a.c(this);
    }

    /* renamed from: getCurrentFragmet */
    public com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 mo78445x6b9fafe7() {
        com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 abstractViewOnAttachStateChangeListenerC21400xb429b010;
        int size = this.f39376xc8466c51.size();
        if (size == 0 || (abstractViewOnAttachStateChangeListenerC21400xb429b010 = this.f39376xc8466c51.get(size - 1).get()) == null || !abstractViewOnAttachStateChangeListenerC21400xb429b010.m78398x58a9c73b()) {
            return null;
        }
        return abstractViewOnAttachStateChangeListenerC21400xb429b010;
    }

    @Override // android.app.Activity
    public android.content.Intent getIntent() {
        android.content.Intent intent = super.getIntent();
        if (intent != null) {
            lk5.d.f400556a.f(intent);
        }
        return intent;
    }

    /* renamed from: getOriginalResources */
    public final android.content.res.Resources m78734x1800569e() {
        return super.getResources();
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e == null) {
            return super.getResources();
        }
        if (!this.f39378x1f8987f7 || this.f39361x2f3fa1b4 == null) {
            android.content.res.Resources resources = getBaseContext().getResources();
            android.content.res.Resources resources2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e;
            this.f39361x2f3fa1b4 = resources2;
            if ((resources2 instanceof j65.j) && resources != null) {
                j65.j jVar = (j65.j) resources2;
                android.content.res.Configuration b17 = jVar.f379494e.b(resources.getConfiguration());
                j65.m.c(b17, com.p314xaae8f345.mm.ui.bk.E(this.f39361x2f3fa1b4));
                jVar.getConfiguration().updateFrom(b17);
                this.f39361x2f3fa1b4 = jVar;
                this.f39378x1f8987f7 = true;
            }
        }
        return this.f39361x2f3fa1b4;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
    /* renamed from: getSupportActionBar */
    public p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264() {
        return al5.p0.N(super.mo2533x106ab264());
    }

    /* renamed from: getSwipeBackLayout */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95() {
        return this.f39371x13746d9e;
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (("clipboard".equals(str) || "power".equals(str)) && getApplicationContext() != null) {
            return getApplicationContext().getSystemService(str);
        }
        java.lang.Object systemService = super.getSystemService(str);
        return "layout_inflater".equals(str) ? com.p314xaae8f345.mm.ui.id.c((android.view.LayoutInflater) systemService) : systemService;
    }

    @Override // android.app.Activity
    public android.view.WindowManager getWindowManager() {
        if (!isDestroyed()) {
            return super.getWindowManager();
        }
        try {
            java.lang.StackTraceElement[] stackTrace = new java.lang.Throwable().getStackTrace();
            if (stackTrace != null && stackTrace.length >= 2 && stackTrace[1].getMethodName().equals("handleDestroyActivity")) {
                return tp.a.a(super.getWindowManager());
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, th6.getMessage());
        }
        return super.getWindowManager();
    }

    /* renamed from: hideVKB */
    public void mo48674x36654fab() {
        android.view.View currentFocus = getCurrentFocus();
        if (currentFocus == null) {
            mo53060x36654fab(getWindow().getDecorView());
        } else {
            mo53060x36654fab(currentFocus);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if ((getResources().getConfiguration().orientation == 1) == false) goto L18;
     */
    /* renamed from: initActivityCloseAnimation */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo50392x5138328b() {
        /*
            r3 = this;
            boolean r0 = r3.mo56573xa904b9f2()
            if (r0 == 0) goto L58
            java.lang.Class r0 = r3.getClass()
            int r0 = db5.f.e(r0)
            r0 = r0 & 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L16
            r0 = r1
            goto L17
        L16:
            r0 = r2
        L17:
            if (r0 == 0) goto L41
            boolean r0 = com.p314xaae8f345.mm.ui.bk.y()
            if (r0 == 0) goto L39
            boolean r0 = com.p314xaae8f345.mm.ui.bk.A()
            if (r0 == 0) goto L35
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r0 = r0.orientation
            if (r0 != r1) goto L32
            goto L33
        L32:
            r1 = r2
        L33:
            if (r1 != 0) goto L39
        L35:
            super.overridePendingTransition(r2, r2)
            goto L58
        L39:
            int r0 = com.p314xaae8f345.mm.ui.uc.f292617g
            int r1 = com.p314xaae8f345.mm.ui.uc.f292618h
            super.overridePendingTransition(r0, r1)
            goto L58
        L41:
            java.lang.Class r0 = r3.getClass()
            int r0 = db5.f.e(r0)
            r0 = r0 & 4
            if (r0 == 0) goto L4e
            goto L4f
        L4e:
            r1 = r2
        L4f:
            if (r1 != 0) goto L55
            db5.f.k(r3)
            goto L58
        L55:
            db5.f.h(r3)
        L58:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.mo50392x5138328b():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:7|(1:9)(1:68)|10|(10:63|64|13|(3:15|(1:17)(1:21)|(1:19))|22|23|(1:25)(1:59)|26|(1:28)(1:58)|(4:30|(4:32|(2:34|(1:36))|38|39)|40|41)(6:42|43|(1:45)(1:54)|46|(1:48)|(2:50|51)(2:52|53)))|12|13|(0)|22|23|(0)(0)|26|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:
    
        if ((getResources().getConfiguration().orientation == 1) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0060, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0061, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ActivityUtil", r1, "", new java.lang.Object[0]);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ActivityUtil", "Class %s not found in dex", r9);
        r1 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0075  */
    /* renamed from: initActivityOpenAnimation */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo51655xf502a5b(android.content.Intent r9) {
        /*
            r8 = this;
            boolean r0 = r8.mo56573xa904b9f2()
            if (r0 == 0) goto Lcf
            r0 = 0
            if (r9 != 0) goto Lb
            r9 = r0
            goto Lf
        Lb:
            android.content.ComponentName r9 = r9.getComponent()
        Lf:
            if (r9 == 0) goto Lcf
            java.lang.String r1 = r9.getClassName()
            java.lang.String r2 = r9.getPackageName()
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L24
            java.lang.String r9 = r9.getClassName()
            goto L28
        L24:
            java.lang.String r9 = r9.getClassName()
        L28:
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r2 = "Class %s not found in dex"
            java.lang.String r3 = ""
            java.lang.String r4 = "MicroMsg.ActivityUtil"
            r5 = 0
            if (r1 == 0) goto L37
        L35:
            r1 = r0
            goto L4a
        L37:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> L3c
            goto L4a
        L3c:
            r1 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r3, r6)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r2, r1)
            goto L35
        L4a:
            r6 = 1
            if (r1 == 0) goto L5b
            int r1 = db5.f.e(r1)
            r1 = r1 & 64
            if (r1 == 0) goto L57
            r1 = r6
            goto L58
        L57:
            r1 = r5
        L58:
            if (r1 == 0) goto L5b
            return
        L5b:
            java.lang.Class r1 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> L60
            goto L6e
        L60:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r3, r7)
            java.lang.Object[] r1 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r2, r1)
            r1 = r0
        L6e:
            if (r1 == 0) goto L75
            int r1 = db5.f.e(r1)
            goto L76
        L75:
            r1 = r5
        L76:
            r1 = r1 & 2
            if (r1 != 0) goto L7c
            r1 = r6
            goto L7d
        L7c:
            r1 = r5
        L7d:
            if (r1 == 0) goto La7
            boolean r9 = com.p314xaae8f345.mm.ui.bk.y()
            if (r9 == 0) goto L9f
            boolean r9 = com.p314xaae8f345.mm.ui.bk.A()
            if (r9 == 0) goto L9b
            android.content.res.Resources r9 = r8.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            int r9 = r9.orientation
            if (r9 != r6) goto L98
            goto L99
        L98:
            r6 = r5
        L99:
            if (r6 != 0) goto L9f
        L9b:
            super.overridePendingTransition(r5, r5)
            goto Lcf
        L9f:
            int r9 = com.p314xaae8f345.mm.ui.uc.f292615e
            int r0 = com.p314xaae8f345.mm.ui.uc.f292616f
            super.overridePendingTransition(r9, r0)
            goto Lcf
        La7:
            java.lang.Class r0 = java.lang.Class.forName(r9)     // Catch: java.lang.ClassNotFoundException -> Lac
            goto Lb9
        Lac:
            r1 = move-exception
            java.lang.Object[] r7 = new java.lang.Object[r5]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r4, r1, r3, r7)
            java.lang.Object[] r9 = new java.lang.Object[]{r9}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r2, r9)
        Lb9:
            if (r0 == 0) goto Lc0
            int r9 = db5.f.e(r0)
            goto Lc1
        Lc0:
            r9 = r5
        Lc1:
            r9 = r9 & 4
            if (r9 == 0) goto Lc6
            r5 = r6
        Lc6:
            if (r5 != 0) goto Lcc
            db5.f.i(r8)
            goto Lcf
        Lcc:
            db5.f.h(r8)
        Lcf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.mo51655xf502a5b(android.content.Intent):void");
    }

    /* renamed from: initNavigationSwipeBack */
    public boolean mo52921x858d605d() {
        if (db5.f.g()) {
            if (!((db5.f.e(getClass()) & 1) == 0) || !mo44290xd3d2670d()) {
                if (((db5.f.e(getClass()) & 16) != 0) && com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                    db5.f.b(this);
                }
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e()) {
                db5.f.b(this);
            }
        }
        if (!getF147381t()) {
            return false;
        }
        mo64511xb83ef811();
        return true;
    }

    /* renamed from: initSwipeBack */
    public void mo64511xb83ef811() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) getWindow().getDecorView();
        int i17 = 0;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab) android.view.LayoutInflater.from(this).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cxh, viewGroup, false);
        this.f39371x13746d9e = c22649x858f5ab;
        c22649x858f5ab.c();
        getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        android.view.View childAt = viewGroup.getChildAt(0);
        if (childAt.findViewById(android.R.id.content) == null) {
            int childCount = viewGroup.getChildCount();
            while (true) {
                if (i17 >= childCount) {
                    break;
                }
                android.view.View childAt2 = viewGroup.getChildAt(i17);
                if ((childAt2 instanceof android.view.ViewGroup) && childAt2.findViewById(android.R.id.content) != null) {
                    childAt = childAt2;
                    break;
                }
                i17++;
            }
        }
        childAt.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e);
        viewGroup.removeView(childAt);
        this.f39371x13746d9e.addView(childAt);
        this.f39371x13746d9e.m81446x590ab8fc(childAt);
        viewGroup.addView(this.f39371x13746d9e);
        this.f39371x13746d9e.m81457xeb590ed6(this);
    }

    /* renamed from: isCallSuperOnSaveInstanceState */
    public boolean mo52915xa8181dad() {
        return false;
    }

    /* renamed from: isHideStatusBar */
    public boolean getP() {
        return (db5.f.e(getClass()) & 32) != 0;
    }

    /* renamed from: isPaused */
    public boolean mo78538xecd98af8() {
        return this.f39369x11d73285;
    }

    /* renamed from: isSupportNavigationSwipeBack */
    public boolean getF147381t() {
        if (db5.f.g() && ep.a.a() && mo52922x430f73e()) {
            return (db5.f.e(getClass()) & 1) == 0;
        }
        return false;
    }

    /* renamed from: isSwiping */
    public boolean m78736x71eabced() {
        return this.f39372x3292284a;
    }

    /* renamed from: keep */
    public void mo46316x322b85(im5.a aVar) {
        this.f39370x6a185eaf.f323292a.mo46316x322b85(aVar);
    }

    /* renamed from: lifeCycleKeeperOnCreate */
    public void m78737x89606eb7() {
        this.f39370x6a185eaf.getClass();
    }

    /* renamed from: lifeCycleKeeperOnDestroy */
    public void m78738xc232899f() {
        this.f39370x6a185eaf.f323292a.mo10668x2efc64();
    }

    /* renamed from: lifeCycleKeeperOnPause */
    public void m78739x893f34db() {
        this.f39370x6a185eaf.f323293b.mo10668x2efc64();
    }

    /* renamed from: lifeCycleKeeperOnResume */
    public void m78740xa24895e8() {
        this.f39370x6a185eaf.getClass();
    }

    /* renamed from: lifeCycleKeeperOnStart */
    public void m78741x8971d347() {
        this.f39370x6a185eaf.getClass();
    }

    /* renamed from: lifeCycleKeeperOnStop */
    public void m78742x46f087d() {
        this.f39370x6a185eaf.f323294c.mo10668x2efc64();
    }

    public void m6() {
        mo48674x36654fab();
    }

    /* renamed from: mmStartActivityForResult */
    public void m78743x70d84175(com.p314xaae8f345.mm.ui.xc xcVar, android.content.Intent intent, int i17) {
        this.f39373xe2323430 = xcVar;
        startActivityForResult(intent, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.p314xaae8f345.mm.ui.xc xcVar = this.f39373xe2323430;
        this.f39373xe2323430 = null;
        if (xcVar != null) {
            xcVar.mo9729x757c998b(i17, i18, intent);
        }
        java.util.Iterator<com.p314xaae8f345.mm.ui.xc> it = this.f39374x64145243.iterator();
        while (it.hasNext()) {
            it.next().mo9729x757c998b(i17, i18, intent);
        }
    }

    /* renamed from: onCancel */
    public void mo2293x3d6f0539() {
        this.f39372x3292284a = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        android.view.ViewGroup viewGroup;
        android.view.View findViewById;
        super.onConfigurationChanged(configuration);
        if (mo2533x106ab264() == null || (viewGroup = (android.view.ViewGroup) findViewById(com.p314xaae8f345.mm.R.id.crd)) == null || (findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f563965ef)) == null || !(findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b)) {
            return;
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b c0102x1f44235b = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById;
        android.view.ViewGroup.LayoutParams layoutParams = c0102x1f44235b.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = mo74405xf4b5b091();
        }
        c0102x1f44235b.setLayoutParams(layoutParams);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        android.view.Window window;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(bundle);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V", this, array);
        f39356x93b55b9.b(this);
        java.lang.String name = getClass().getName();
        this.f39360xff691c23 = name;
        com.p314xaae8f345.mm.ui.zj.a(3, name);
        super.onCreate(bundle);
        if (m78732xefeb73a5() && (window = getWindow()) != null && getWindow() != null && com.p314xaae8f345.mm.ui.b4.c(this)) {
            try {
                window.getDecorView();
                n3.h2.a(window, false);
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                int i17 = android.os.Build.VERSION.SDK_INT;
                if (i17 >= 28) {
                    int i18 = i17 < 30 ? 1 : 3;
                    android.view.WindowManager.LayoutParams attributes = window.getAttributes();
                    if (attributes.layoutInDisplayCutoutMode != i18) {
                        attributes.layoutInDisplayCutoutMode = i18;
                        window.setAttributes(attributes);
                    }
                }
                if (i17 >= 29) {
                    window.setStatusBarContrastEnforced(false);
                    window.setNavigationBarContrastEnforced(false);
                }
            } catch (java.lang.RuntimeException e17) {
                e17.toString();
            }
        }
        m78737x89606eb7();
        android.content.Intent intent = getIntent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "getIntent(...)");
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("KEY_LIFE_CYCLE_OBSERVER");
        android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
        com.p314xaae8f345.mm.ui.C21408x6accf9f5 c21408x6accf9f5 = resultReceiver != null ? new com.p314xaae8f345.mm.ui.C21408x6accf9f5(resultReceiver) : null;
        if (c21408x6accf9f5 != null) {
            mo273xed6858b4().a(c21408x6accf9f5);
        }
        java.lang.String simpleName = getClass().getSimpleName();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(getTaskId());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "checktask onCreate:%s#0x%x, taskid:%d, task:%s appendMemLog:%s", simpleName, valueOf, valueOf2, new com.p314xaae8f345.mm.sdk.p2603x2137b148.q8(this), m78731x4356b8e9());
        yj0.a.h(this, "com/tencent/mm/ui/MMFragmentActivity", "com/tencent/mm/ui/MMFragmentActivity", "onCreate", "(Landroid/os/Bundle;)V");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(6:3|(5:5|6|(1:8)|9|(1:11))|15|(1:17)|19|20)|14|15|(0)|19|20) */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0093 A[Catch: all -> 0x00af, TRY_LEAVE, TryCatch #1 {all -> 0x00af, blocks: (B:15:0x0089, B:17:0x0093), top: B:14:0x0089 }] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDestroy() {
        /*
            r8 = this;
            java.lang.String r0 = "com/tencent/mm/ui/MMFragmentActivity"
            java.lang.String r1 = "onDestroy"
            java.lang.String r2 = "()V"
            yj0.a.a(r0, r0, r1, r2, r8)
            uk5.c r3 = com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.f39356x93b55b9
            yn5.l r4 = r8.f39362x7310015e
            r3.a(r4)
            java.lang.Class r3 = r8.getClass()
            java.lang.String r3 = r3.getSimpleName()
            int r4 = r8.hashCode()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a
            com.tencent.mm.sdk.platformtools.q8 r5 = new com.tencent.mm.sdk.platformtools.q8
            r5.<init>(r8)
            java.lang.String r6 = r8.m78731x4356b8e9()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r4, r5, r6}
            java.lang.String r4 = "MicroMsg.MMFragmentActivity"
            java.lang.String r5 = "checktask onDestroy:%s#0x%x task:%s appendMemLog:%s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r5, r3)
            r8.m78738xc232899f()
            java.util.List<com.tencent.mm.ui.wc> r3 = r8.f39365x7c619e46
            r3.clear()
            super.onDestroy()
            um0.b.a(r8)
            java.lang.String r3 = "HUAWEI"
            java.lang.String r4 = android.os.Build.MANUFACTURER
            boolean r3 = r3.equalsIgnoreCase(r4)
            java.lang.String r4 = "mContext"
            r5 = 1
            if (r3 != 0) goto L52
            goto L89
        L52:
            int r3 = android.os.Build.VERSION.SDK_INT
            r6 = 24
            if (r3 == r6) goto L59
            goto L89
        L59:
            java.lang.Class r3 = um0.c.f510235a     // Catch: java.lang.Throwable -> L89
            if (r3 != 0) goto L7b
            java.lang.String r3 = "android.gestureboost.GestureBoostManager"
            java.lang.Class r3 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L89
            um0.c.f510235a = r3     // Catch: java.lang.Throwable -> L89
            java.lang.String r6 = "sGestureBoostManager"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r6)     // Catch: java.lang.Throwable -> L89
            um0.c.f510236b = r3     // Catch: java.lang.Throwable -> L89
            r3.setAccessible(r5)     // Catch: java.lang.Throwable -> L89
            java.lang.Class r3 = um0.c.f510235a     // Catch: java.lang.Throwable -> L89
            java.lang.reflect.Field r3 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L89
            um0.c.f510237c = r3     // Catch: java.lang.Throwable -> L89
            r3.setAccessible(r5)     // Catch: java.lang.Throwable -> L89
        L7b:
            java.lang.reflect.Field r3 = um0.c.f510236b     // Catch: java.lang.Throwable -> L89
            r6 = 0
            java.lang.Object r3 = r3.get(r6)     // Catch: java.lang.Throwable -> L89
            if (r3 == 0) goto L89
            java.lang.reflect.Field r7 = um0.c.f510237c     // Catch: java.lang.Throwable -> L89
            r7.set(r3, r6)     // Catch: java.lang.Throwable -> L89
        L89:
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "samsung"
            boolean r3 = r3.equalsIgnoreCase(r6)     // Catch: java.lang.Throwable -> Laf
            if (r3 == 0) goto Laf
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> Laf
            java.lang.String r6 = "com.samsung.android.content.clipboard.SemClipboardManager"
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Object r3 = r3.getSystemService(r6)     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r6 = r3.getClass()     // Catch: java.lang.Throwable -> Laf
            java.lang.reflect.Field r4 = r6.getDeclaredField(r4)     // Catch: java.lang.Throwable -> Laf
            r4.setAccessible(r5)     // Catch: java.lang.Throwable -> Laf
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Throwable -> Laf
            r4.set(r3, r5)     // Catch: java.lang.Throwable -> Laf
        Laf:
            yj0.a.h(r8, r0, r0, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f.onDestroy():void");
    }

    /* renamed from: onDrag */
    public void mo2294xc398a7b3() {
        this.f39372x3292284a = true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        com.p314xaae8f345.mm.ui.zj.a(2, this.f39360xff691c23);
        this.f39369x11d73285 = true;
        super.onPause();
        if (getF147381t()) {
            if (m78735x28280f95() != null) {
                m78735x28280f95().m81450x8e764904(false);
            }
            if (!isFinishing()) {
                al5.a3.d(this);
            }
        }
        m78739x893f34db();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i17, strArr, iArr);
        java.util.Iterator<com.p314xaae8f345.mm.ui.yc> it = this.f39375x1965a26.iterator();
        while (it.hasNext()) {
            it.next().a(i17, strArr, iArr);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        android.content.res.Resources resources;
        com.p314xaae8f345.mm.ui.zj.a(1, this.f39360xff691c23);
        this.f39369x11d73285 = false;
        super.onResume();
        if (com.p314xaae8f345.mm.ui.bk.U() && (resources = this.f39361x2f3fa1b4) != null && (resources instanceof j65.j)) {
            ((j65.j) resources).updateConfiguration(resources.getConfiguration(), ((j65.j) this.f39361x2f3fa1b4).f379494e.e());
        }
        if (getF147381t()) {
            al5.a3.c(this);
            mo2326xb052149b(1.0f);
            if (m78735x28280f95() != null) {
                m78735x28280f95().m81450x8e764904(true);
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = m78735x28280f95();
                m78735x28280f95.f292974v = false;
                m78735x28280f95.F = false;
            }
        }
        m78740xa24895e8();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        if (mo52915xa8181dad()) {
            super.onSaveInstanceState(bundle);
        }
    }

    /* renamed from: onSettle */
    public void mo2325x58f7e80a(boolean z17, int i17, boolean z18) {
        if (z18) {
            if (this.f39364x75804329 == null) {
                this.f39364x75804329 = com.p314xaae8f345.mm.ui.bk.b(getWindow(), mo2533x106ab264().j());
            }
            android.view.View view = this.f39364x75804329;
            if (z17) {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(view, i17 <= 0 ? 260L : 130L, 0.0f, 0.0f, null);
            } else {
                com.p314xaae8f345.mm.ui.p2740x696c9db.l5.a(view, i17 <= 0 ? 260L : 130L, (view.getWidth() * (-1)) / 2.5f, 0.0f, null);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, android.app.Activity
    public void onStart() {
        super.onStart();
        m78741x8971d347();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        m78742x46f087d();
        super.onStop();
    }

    /* renamed from: onSwipe */
    public void mo2326xb052149b(float f17) {
        if (this.f39364x75804329 == null) {
            this.f39364x75804329 = com.p314xaae8f345.mm.ui.bk.b(getWindow(), mo2533x106ab264() != null ? mo2533x106ab264().j() : null);
        }
        android.view.View view = this.f39364x75804329;
        if (java.lang.Float.compare(1.0f, f17) <= 0) {
            com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(view, 0.0f, 0.0f);
        } else {
            com.p314xaae8f345.mm.ui.p2740x696c9db.l5.c(view, (view.getWidth() / 2.5f) * (1.0f - f17) * (-1.0f), 0.0f);
            view.postInvalidateOnAnimation();
        }
    }

    /* renamed from: onSwipeBack */
    public void mo2295x59cfc822() {
        if (!isFinishing()) {
            finish();
        }
        android.view.View decorView = getWindow().getDecorView();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(decorView, arrayList.toArray(), "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        decorView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(decorView, "com/tencent/mm/ui/MMFragmentActivity", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        overridePendingTransition(0, 0);
        this.f39372x3292284a = false;
    }

    @Override // android.app.Activity
    public void onTopResumedActivityChanged(boolean z17) {
        android.content.res.Resources resources;
        super.onTopResumedActivityChanged(z17);
        if (com.p314xaae8f345.mm.ui.bk.U() && z17 && (resources = this.f39361x2f3fa1b4) != null && (resources instanceof j65.j)) {
            ((j65.j) resources).updateConfiguration(resources.getConfiguration(), ((j65.j) this.f39361x2f3fa1b4).f379494e.e());
        }
    }

    /* renamed from: popBackStackImmediate */
    public boolean m78744x96eafb01() {
        if (this.f39376xc8466c51.size() == 0) {
            return false;
        }
        this.f39376xc8466c51.remove(r0.size() - 1);
        return mo7595x9cdc264().m7705x96eafb01();
    }

    /* renamed from: putActivityCloseAnimation */
    public void m78745x6788674a(int i17, int i18) {
        if (mo56573xa904b9f2()) {
            com.p314xaae8f345.mm.ui.uc.f292617g = i17;
            com.p314xaae8f345.mm.ui.uc.f292618h = i18;
        }
        super.overridePendingTransition(i17, i18);
    }

    /* renamed from: putActivityOpenAnimation */
    public void m78746x49d6e1bc(int i17, int i18) {
        if (mo56573xa904b9f2()) {
            com.p314xaae8f345.mm.ui.uc.f292615e = i17;
            com.p314xaae8f345.mm.ui.uc.f292616f = i18;
        }
        super.overridePendingTransition(i17, i18);
    }

    /* renamed from: registerMMOnFragmentActivityResult */
    public void m78747x6b661de(com.p314xaae8f345.mm.ui.xc xcVar) {
        if (this.f39374x64145243.contains(xcVar)) {
            return;
        }
        this.f39374x64145243.add(xcVar);
    }

    /* renamed from: registerMMOnRequestPermissionsResult */
    public void m78748xe414e1d4(com.p314xaae8f345.mm.ui.yc ycVar) {
        if (this.f39375x1965a26.contains(ycVar)) {
            return;
        }
        this.f39375x1965a26.add(ycVar);
    }

    /* renamed from: removeDispatchedTouchListener */
    public void m78749x9dbb9d6(com.p314xaae8f345.mm.ui.wc wcVar) {
        this.f39365x7c619e46.remove(wcVar);
    }

    /* renamed from: setMMOnFragmentActivityResult */
    public void m78750xc5512edd(com.p314xaae8f345.mm.ui.xc xcVar) {
        this.f39373xe2323430 = xcVar;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i17) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.d.a(this, i17)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "AndroidOSafety.safety false ignore setRequestedOrientation %s for activity %s", java.lang.Integer.valueOf(i17), this);
            return;
        }
        try {
            super.setRequestedOrientation(i17);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, th6, "AndroidOSafety.safety uncaught", new java.lang.Object[0]);
        }
    }

    /* renamed from: showVKB */
    public void mo26063x7b383410() {
        android.view.View currentFocus;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method");
        if (inputMethodManager == null || (currentFocus = getCurrentFocus()) == null || currentFocus.getWindowToken() == null) {
            return;
        }
        inputMethodManager.toggleSoftInput(0, 2);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr, android.os.Bundle bundle) {
        if (com.p314xaae8f345.mm.ui.b2.a(this, this.f39369x11d73285, intentArr, bundle)) {
            return;
        }
        super.startActivities(intentArr, bundle);
        mo51655xf502a5b(null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (R6(this, className == null ? "" : className, intent, 0, null)) {
            return;
        }
        super.startActivity(intent);
        mo51655xf502a5b(intent);
    }

    @Override // p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17) {
        super.startActivityForResult(intent, i17);
        mo51655xf502a5b(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f
    /* renamed from: startActivityFromFragment */
    public void mo7603xcc5c304b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (R6(this, className == null ? "" : className, intent, i17, null)) {
            return;
        }
        super.mo7603xcc5c304b(componentCallbacksC1101xa17d4670, intent, i17);
        mo51655xf502a5b(intent);
    }

    /* renamed from: startVASActivityForResult */
    public void m78753xde151931(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        try {
            lk5.q0.e(this, java.lang.Class.forName(intent.getComponent().getClassName()), intent, bundle, i17);
        } catch (java.lang.Throwable unused) {
        }
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f
    /* renamed from: supportInvalidateOptionsMenu */
    public void mo2548x55429c53() {
        if (mo78445x6b9fafe7() == null || !mo78445x6b9fafe7().m78663xee30fa35()) {
            super.mo2548x55429c53();
        }
    }

    /* renamed from: supportNavigationSwipeBack */
    public boolean mo52922x430f73e() {
        return true;
    }

    /* renamed from: switchFragment */
    public void m78754x4ab889a4(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, boolean z17, boolean z18, int i18, int i19) {
        if (componentCallbacksC1101xa17d4670 == null || i17 == 0) {
            return;
        }
        p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d mo7595x9cdc264 = mo7595x9cdc264();
        p012xc85e97e9.p087x9da2e250.app.i2 m7630xb2c12e75 = mo7595x9cdc264.m7630xb2c12e75();
        if (z18) {
            m7630xb2c12e75.l(i18, i19, 0, 0);
        }
        if (mo7595x9cdc264.m7664x6f4c869b(i17) == null) {
            m7630xb2c12e75.h(i17, componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7469xb5887064(), 1);
        } else if (componentCallbacksC1101xa17d4670.m7483xdf9b8f74()) {
            m7630xb2c12e75.n(componentCallbacksC1101xa17d4670);
        }
        if (z17) {
            m7630xb2c12e75.c(null);
        }
        m7630xb2c12e75.d();
        mo7595x9cdc264.m7662x588126d7();
    }

    /* renamed from: switchFragmentActivity */
    public void m78755x4f1cfcd3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        m78756x4f1cfcd3(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7448x5db1b11());
    }

    /* renamed from: switchFragmentInternalBackwardWithAnim */
    public void m78757x987ba39b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        m78758x987ba39b(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7448x5db1b11());
    }

    /* renamed from: switchFragmentInternalBackwardWithAnimLeftSelfView */
    public void m78760x64996c73(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.view.View view) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        m78759x64996c73(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7448x5db1b11(), view);
    }

    /* renamed from: switchFragmentInternalFarwardWithAnim */
    public void m78761x1bc22469(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        m78762x1bc22469(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7448x5db1b11());
    }

    /* renamed from: switchFragmentInternalWithoutAnim */
    public void m78763xcd62bfb8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670) {
        if (componentCallbacksC1101xa17d4670 == null) {
            return;
        }
        m78764xcd62bfb8(componentCallbacksC1101xa17d4670, componentCallbacksC1101xa17d4670.m7448x5db1b11());
    }

    /* renamed from: theCreate */
    public im5.b m78765xba1c74cd() {
        return this.f39370x6a185eaf.f323292a;
    }

    /* renamed from: theResume */
    public im5.b m78766xd3049bfe() {
        return this.f39370x6a185eaf.f323293b;
    }

    /* renamed from: theStart */
    public im5.b m78767x40b1b271() {
        return this.f39370x6a185eaf.f323293b;
    }

    /* renamed from: unregisterMMOnFragmentActivityResult */
    public void m78768x58bd8a37(com.p314xaae8f345.mm.ui.xc xcVar) {
        this.f39374x64145243.remove(xcVar);
    }

    /* renamed from: unregisterMMOnRequestPermissionsResult */
    public void m78769xd0f357ed(com.p314xaae8f345.mm.ui.yc ycVar) {
        this.f39375x1965a26.remove(ycVar);
    }

    /* renamed from: switchFragmentActivity */
    public void m78756x4f1cfcd3(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        m78754x4ab889a4(componentCallbacksC1101xa17d4670, i17, true, true, com.p314xaae8f345.mm.R.C30854x2dc211.f559376d1, com.p314xaae8f345.mm.R.C30854x2dc211.f559381d6);
        this.f39376xc8466c51.add(new java.lang.ref.WeakReference<>((com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010) componentCallbacksC1101xa17d4670));
    }

    /* renamed from: switchFragmentInternalBackwardWithAnim */
    public void m78758x987ba39b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        m78754x4ab889a4(componentCallbacksC1101xa17d4670, i17, false, true, com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
    }

    /* renamed from: switchFragmentInternalBackwardWithAnimLeftSelfView */
    public void m78759x64996c73(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17, android.view.View view) {
        m78754x4ab889a4(componentCallbacksC1101xa17d4670, i17, false, true, 0, com.p314xaae8f345.mm.R.C30854x2dc211.f559422ed);
        if (view == null) {
            return;
        }
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this, com.p314xaae8f345.mm.R.C30854x2dc211.f559413e4);
        if (loadAnimation != null) {
            view.startAnimation(loadAnimation);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/ui/MMFragmentActivity", "switchFragmentInternalBackwardWithAnimLeftSelfView", "(Landroidx/fragment/app/Fragment;ILandroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: switchFragmentInternalFarwardWithAnim */
    public void m78762x1bc22469(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        m78754x4ab889a4(componentCallbacksC1101xa17d4670, i17, false, true, com.p314xaae8f345.mm.R.C30854x2dc211.f559419ea, com.p314xaae8f345.mm.R.C30854x2dc211.f559415e6);
    }

    /* renamed from: switchFragmentInternalWithoutAnim */
    public void m78764xcd62bfb8(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, int i17) {
        m78754x4ab889a4(componentCallbacksC1101xa17d4670, i17, false, false, 0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void startActivityForResult(android.content.Intent intent, int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.ui.dd ddVar;
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (R6(this, className == null ? "" : className, intent, i17, null)) {
            return;
        }
        if (com.p314xaae8f345.mm.ui.b2.a(this, this.f39369x11d73285, new android.content.Intent[]{intent}, java.lang.Integer.valueOf(i17), bundle)) {
            android.os.Parcelable parcelableExtra = intent.getParcelableExtra("KEY_START_ACTIVITY_OBSERVER");
            android.os.ResultReceiver resultReceiver = parcelableExtra instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra : null;
            ddVar = resultReceiver != null ? new com.p314xaae8f345.mm.ui.dd(resultReceiver) : null;
            if (ddVar == null) {
                return;
            }
            ddVar.f289867a.send(1, new android.os.Bundle());
            intent.removeExtra("KEY_START_ACTIVITY_OBSERVER");
            return;
        }
        boolean m78729x75b0ecd = m78729x75b0ecd(intent);
        f39357x18545862.b(intent, this, m78729x75b0ecd);
        lk5.d.f400556a.g(intent);
        if (m78729x75b0ecd) {
            m78753xde151931(intent, i17, bundle);
        } else {
            super.startActivityForResult(intent, i17, bundle);
        }
        mo51655xf502a5b(intent);
        android.os.Parcelable parcelableExtra2 = intent.getParcelableExtra("KEY_START_ACTIVITY_OBSERVER");
        android.os.ResultReceiver resultReceiver2 = parcelableExtra2 instanceof android.os.ResultReceiver ? (android.os.ResultReceiver) parcelableExtra2 : null;
        ddVar = resultReceiver2 != null ? new com.p314xaae8f345.mm.ui.dd(resultReceiver2) : null;
        if (ddVar == null) {
            return;
        }
        ddVar.f289867a.send(0, new android.os.Bundle());
        intent.removeExtra("KEY_START_ACTIVITY_OBSERVER");
    }

    /* renamed from: hideVKB */
    public void mo53060x36654fab(android.view.View view) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        if (view == null || (inputMethodManager = (android.view.inputmethod.InputMethodManager) getSystemService("input_method")) == null || (windowToken = view.getWindowToken()) == null) {
            return;
        }
        try {
            inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
        } catch (java.lang.IllegalArgumentException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "hide VKB(View) exception %s", e17);
        }
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivities(android.content.Intent[] intentArr) {
        super.startActivities(intentArr);
        mo51655xf502a5b(null);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        super.startActivity(intent, bundle);
        mo51655xf502a5b(intent);
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f
    /* renamed from: startActivityFromFragment */
    public void mo7604xcc5c304b(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17, android.os.Bundle bundle) {
        java.lang.String className = intent.getComponent() != null ? intent.getComponent().getClassName() : "";
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (R6(this, className == null ? "" : className, intent, i17, null) || com.p314xaae8f345.mm.ui.b2.a(this, this.f39369x11d73285, new android.content.Intent[]{intent}, componentCallbacksC1101xa17d4670, java.lang.Integer.valueOf(i17))) {
            return;
        }
        super.mo7604xcc5c304b(componentCallbacksC1101xa17d4670, intent, i17, bundle);
    }

    /* renamed from: startActivityForResult */
    public com.p314xaae8f345.mm.ui.vc m78751x5dc77fb5(android.content.Intent intent) {
        return m78752x5dc77fb5(intent, (android.os.Bundle) null);
    }

    /* renamed from: startActivityForResult */
    public com.p314xaae8f345.mm.ui.vc m78752x5dc77fb5(android.content.Intent intent, android.os.Bundle bundle) {
        if (bundle != null) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundle);
        }
        com.p314xaae8f345.mm.ui.bd bdVar = new com.p314xaae8f345.mm.ui.bd();
        p012xc85e97e9.p013x9d4bf30f.p014xc84dc81d.c e17 = mo2507xfe541f5f().e(java.lang.String.valueOf(java.lang.System.currentTimeMillis()), new h.f(), bdVar);
        bdVar.f279411b = e17;
        e17.a(intent, null);
        return bdVar;
    }
}
