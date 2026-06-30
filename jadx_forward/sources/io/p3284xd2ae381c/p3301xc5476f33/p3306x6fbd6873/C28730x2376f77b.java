package io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873;

/* renamed from: io.flutter.plugin.platform.PlatformViewsController2 */
/* loaded from: classes15.dex */
public class C28730x2376f77b implements io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218 {
    private static final java.lang.String TAG = "PlatformViewsController2";

    /* renamed from: androidTouchProcessor */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842 f71836xd973d862;

    /* renamed from: context */
    private android.content.Context f71838x38b735af;

    /* renamed from: flutterView */
    private io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 f71840xe28578e1;

    /* renamed from: platformViewsChannel */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a f71847x496caac8;

    /* renamed from: registry */
    private io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28720x6bffe9f5 f71848xd6dc303d;

    /* renamed from: textInputPlugin */
    private io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 f71849x69758830;

    /* renamed from: flutterJNI */
    private io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 f71839x2014a1e9 = null;

    /* renamed from: overlayerSurface */
    private android.view.Surface f71843x6293e0f0 = null;

    /* renamed from: overlaySurfaceControl */
    private android.view.SurfaceControl f71842x5bd52860 = null;

    /* renamed from: channelHandler */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler f71837xf8a558c7 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler() { // from class: io.flutter.plugin.platform.PlatformViewsController2.1
        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: clearFocus */
        public void mo138287xd2ef968b(int i17) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71846x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Clearing focus on an unknown view with id: " + i17);
                return;
            }
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.clearFocus();
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Clearing focus on a null view with id: " + i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: createPlatformView */
        public void mo138288x800200d4(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewCreationRequest platformViewCreationRequest) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.m138783x8fa1558(platformViewCreationRequest);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: dispose */
        public void mo138289x63a5261f(int i17) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71846x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Disposing unknown platform view with id: " + i17);
                return;
            }
            if (interfaceC28717x1311f9d8.mo31848xfb86a31b() != null) {
                android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo31848xfb86a31b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(mo31848xfb86a31b);
                }
            }
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71846x1f8e11bb.remove(i17);
            try {
                interfaceC28717x1311f9d8.mo31847x63a5261f();
            } catch (java.lang.RuntimeException e17) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Disposing platform view threw an exception", e17);
            }
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71845x74817082.get(i17);
            if (c28621x2bcb4b4b != null) {
                c28621x2bcb4b4b.removeAllViews();
                c28621x2bcb4b4b.m137963x388a4537();
                android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) c28621x2bcb4b4b.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c28621x2bcb4b4b);
                }
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71845x74817082.remove(i17);
            }
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: isSurfaceControlEnabled */
        public boolean mo138290x2cc8f227() {
            if (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71839x2014a1e9 == null) {
                return false;
            }
            return io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71839x2014a1e9.m137640xe695ca07();
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: onTouch */
        public void mo138291xb05cb4a0(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewTouch platformViewTouch) {
            int i17 = platformViewTouch.f71443xcf532ea0;
            float f17 = io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71838x38b735af.getResources().getDisplayMetrics().density;
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71846x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Sending touch to an unknown view with id: " + i17);
                return;
            }
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.dispatchTouchEvent(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.m138802x97f17309(f17, platformViewTouch));
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Sending touch to a null view with id: " + i17);
        }

        @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewsHandler
        /* renamed from: setDirection */
        public void mo138292x2261393d(int i17, int i18) {
            io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8) io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.f71846x1f8e11bb.get(i17);
            if (interfaceC28717x1311f9d8 == null) {
                io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Setting direction to an unknown view with id: " + i17);
                return;
            }
            android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.setLayoutDirection(i18);
                return;
            }
            io.p3284xd2ae381c.Log.e(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.TAG, "Setting direction to a null view with id: " + i17);
        }
    };

    /* renamed from: accessibilityEventsDelegate */
    private final io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c f71834xf53d26ac = new io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28705xcb1b0e8c();

    /* renamed from: platformViews */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8> f71846x1f8e11bb = new android.util.SparseArray<>();

    /* renamed from: platformViewParent */
    private final android.util.SparseArray<io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b> f71845x74817082 = new android.util.SparseArray<>();

    /* renamed from: pendingTransactions */
    private final java.util.ArrayList<android.view.SurfaceControl.Transaction> f71844xab58bc8c = new java.util.ArrayList<>();

    /* renamed from: activeTransactions */
    private final java.util.ArrayList<android.view.SurfaceControl.Transaction> f71835x7240037b = new java.util.ArrayList<>();

    /* renamed from: motionEventTracker */
    private final io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34 f71841x28a1ee14 = io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.m137338x9cf0d20b();

    /* renamed from: diposeAllViews */
    private void m138763xa5c5d603() {
        while (this.f71846x1f8e11bb.size() > 0) {
            this.f71837xf8a558c7.mo138289x63a5261f(this.f71846x1f8e11bb.keyAt(0));
        }
    }

    /* renamed from: getDisplayDensity */
    private float m138764xabf0e2bc() {
        return this.f71838x38b735af.getResources().getDisplayMetrics().density;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$initializePlatformViewIfNeeded$0 */
    public /* synthetic */ void m138765x7dd6d003(int i17, android.view.View view, boolean z17) {
        if (z17) {
            this.f71847x496caac8.m138279x5027fd7a(i17);
            return;
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71849x69758830;
        if (c28701x2e084010 != null) {
            c28701x2e084010.m138546x90d0b4d0(i17);
        }
    }

    /* renamed from: lockInputConnection */
    private void m138766xc363959d(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71849x69758830;
        if (c28701x2e084010 == null) {
            return;
        }
        c28701x2e084010.m138555x859f2945();
        c28742x12d6aa53.m138850x6ba43ad3();
    }

    /* renamed from: maybeInvokeOnFlutterViewAttached */
    private void m138767x4472c226(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8) {
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1 = this.f71840xe28578e1;
        if (c28553x45ef20c1 == null) {
            io.p3284xd2ae381c.Log.i(TAG, "null flutterView");
        } else {
            interfaceC28717x1311f9d8.mo65795x5e3a4146(c28553x45ef20c1);
        }
    }

    /* renamed from: parsePointerCoords */
    private static android.view.MotionEvent.PointerCoords m138768x978f3cc8(java.lang.Object obj, float f17) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerCoords pointerCoords = new android.view.MotionEvent.PointerCoords();
        pointerCoords.orientation = (float) ((java.lang.Double) list.get(0)).doubleValue();
        pointerCoords.pressure = (float) ((java.lang.Double) list.get(1)).doubleValue();
        pointerCoords.size = (float) ((java.lang.Double) list.get(2)).doubleValue();
        double d17 = f17;
        pointerCoords.toolMajor = (float) (((java.lang.Double) list.get(3)).doubleValue() * d17);
        pointerCoords.toolMinor = (float) (((java.lang.Double) list.get(4)).doubleValue() * d17);
        pointerCoords.touchMajor = (float) (((java.lang.Double) list.get(5)).doubleValue() * d17);
        pointerCoords.touchMinor = (float) (((java.lang.Double) list.get(6)).doubleValue() * d17);
        pointerCoords.x = (float) (((java.lang.Double) list.get(7)).doubleValue() * d17);
        pointerCoords.y = (float) (((java.lang.Double) list.get(8)).doubleValue() * d17);
        return pointerCoords;
    }

    /* renamed from: parsePointerCoordsList */
    private static java.util.List<android.view.MotionEvent.PointerCoords> m138769x90b7bd86(java.lang.Object obj, float f17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m138768x978f3cc8(it.next(), f17));
        }
        return arrayList;
    }

    /* renamed from: parsePointerProperties */
    private static android.view.MotionEvent.PointerProperties m138770x4d2c40dd(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.view.MotionEvent.PointerProperties pointerProperties = new android.view.MotionEvent.PointerProperties();
        pointerProperties.id = ((java.lang.Integer) list.get(0)).intValue();
        pointerProperties.toolType = ((java.lang.Integer) list.get(1)).intValue();
        return pointerProperties;
    }

    /* renamed from: parsePointerPropertiesList */
    private static java.util.List<android.view.MotionEvent.PointerProperties> m138771x695aaf1b(java.lang.Object obj) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(m138770x4d2c40dd(it.next()));
        }
        return arrayList;
    }

    /* renamed from: toLogicalPixels */
    private int m138773x7813dd5b(double d17, float f17) {
        return (int) java.lang.Math.round(d17 / f17);
    }

    /* renamed from: toPhysicalPixels */
    private int m138774xf10575bf(double d17) {
        return (int) java.lang.Math.round(d17 * m138764xabf0e2bc());
    }

    /* renamed from: translateMotionEvent */
    private static void m138775xcc9a9e56(android.view.MotionEvent motionEvent, android.view.MotionEvent.PointerCoords[] pointerCoordsArr) {
        if (pointerCoordsArr.length < 1) {
            return;
        }
        motionEvent.offsetLocation(pointerCoordsArr[0].x - motionEvent.getX(), pointerCoordsArr[0].y - motionEvent.getY());
    }

    /* renamed from: unlockInputConnection */
    private void m138776xcd5e664(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28742x12d6aa53 c28742x12d6aa53) {
        io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010 = this.f71849x69758830;
        if (c28701x2e084010 == null) {
            return;
        }
        c28701x2e084010.m138562x8df3878c();
        c28742x12d6aa53.m138851x9518646c();
    }

    /* renamed from: validateDirection */
    private static boolean m138777x5f44e709(int i17) {
        return i17 == 0 || i17 == 1;
    }

    /* renamed from: applyTransactions */
    public void m138778x13f0abe3() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        for (int i17 = 0; i17 < this.f71844xab58bc8c.size(); i17++) {
            transaction = transaction.merge(this.f71844xab58bc8c.get(i17));
        }
        transaction.apply();
        this.f71844xab58bc8c.clear();
    }

    /* renamed from: attach */
    public void m138779xac1eee45(android.content.Context context, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3288x2eef7f.C28604xeb2eb192 c28604xeb2eb192) {
        if (this.f71838x38b735af != null) {
            throw new java.lang.AssertionError("A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
        }
        this.f71838x38b735af = context;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a c28665x5109fe4a = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a(c28604xeb2eb192);
        this.f71847x496caac8 = c28665x5109fe4a;
        c28665x5109fe4a.m138280x6ecb7091(this.f71837xf8a558c7);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: attachAccessibilityBridge */
    public void mo138623x58b57ff2(io.p3284xd2ae381c.p3320x373aa5.C28974x81a86657 c28974x81a86657) {
        this.f71834xf53d26ac.m138579xdd693ab5(c28974x81a86657);
    }

    /* renamed from: attachTextInputPlugin */
    public void m138780x6ac05f2b(io.p3284xd2ae381c.p3301xc5476f33.p3303x8f77f598.C28701x2e084010 c28701x2e084010) {
        this.f71849x69758830 = c28701x2e084010;
    }

    /* renamed from: attachToFlutterRenderer */
    public void m138781x5489893f(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df) {
        this.f71836xd973d862 = new io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28537x46552842(c28641x1f60b8df, true);
    }

    /* renamed from: attachToView */
    public void m138782x805e5a65(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28553x45ef20c1 c28553x45ef20c1) {
        this.f71840xe28578e1 = c28553x45ef20c1;
        for (int i17 = 0; i17 < this.f71845x74817082.size(); i17++) {
            this.f71840xe28578e1.addView(this.f71845x74817082.valueAt(i17));
        }
        for (int i18 = 0; i18 < this.f71846x1f8e11bb.size(); i18++) {
            this.f71846x1f8e11bb.valueAt(i18).mo65795x5e3a4146(this.f71840xe28578e1);
        }
    }

    /* renamed from: createFlutterPlatformView */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 m138783x8fa1558(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewCreationRequest platformViewCreationRequest) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.AbstractC28718x54958c12 m138697xfcb86cd4 = this.f71848xd6dc303d.m138697xfcb86cd4(platformViewCreationRequest.f71429x4747637f);
        if (m138697xfcb86cd4 == null) {
            throw new java.lang.IllegalStateException("Trying to create a platform view of unregistered type: " + platformViewCreationRequest.f71429x4747637f);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 mo14572xaf65a0fc = m138697xfcb86cd4.mo14572xaf65a0fc(this.f71838x38b735af, platformViewCreationRequest.f71428xcf532ea0, platformViewCreationRequest.f71427xc4aaf986 != null ? m138697xfcb86cd4.m138695xe04fd67().mo138407x37439e39(platformViewCreationRequest.f71427xc4aaf986) : null);
        android.view.View mo31848xfb86a31b = mo14572xaf65a0fc.mo31848xfb86a31b();
        if (mo31848xfb86a31b == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        mo31848xfb86a31b.setLayoutDirection(platformViewCreationRequest.f71424xc6a0077f);
        this.f71846x1f8e11bb.put(platformViewCreationRequest.f71428xcf532ea0, mo14572xaf65a0fc);
        m138767x4472c226(mo14572xaf65a0fc);
        return mo14572xaf65a0fc;
    }

    /* renamed from: createOverlaySurface */
    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959 m138784x36e8ca59() {
        if (this.f71843x6293e0f0 == null) {
            android.view.SurfaceControl.Builder builder = new android.view.SurfaceControl.Builder();
            builder.setBufferSize(this.f71840xe28578e1.getWidth(), this.f71840xe28578e1.getHeight());
            builder.setFormat(1);
            builder.setName("Flutter Overlay Surface");
            builder.setOpaque(false);
            builder.setHidden(false);
            android.view.SurfaceControl build = builder.build();
            android.view.SurfaceControl.Transaction buildReparentTransaction = this.f71840xe28578e1.getRootSurfaceControl().buildReparentTransaction(build);
            buildReparentTransaction.setLayer(build, 1000);
            buildReparentTransaction.apply();
            this.f71843x6293e0f0 = new android.view.Surface(build);
            this.f71842x5bd52860 = build;
        }
        return new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28589x102bb959(0, this.f71843x6293e0f0);
    }

    /* renamed from: createTransaction */
    public android.view.SurfaceControl.Transaction m138785xacbfa442() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        this.f71844xab58bc8c.add(transaction);
        return transaction;
    }

    /* renamed from: destroyOverlaySurface */
    public void m138786x3cb5b4d7() {
        android.view.Surface surface = this.f71843x6293e0f0;
        if (surface != null) {
            surface.release();
            this.f71843x6293e0f0 = null;
            this.f71842x5bd52860 = null;
        }
    }

    /* renamed from: detach */
    public void m138787xb06a1793() {
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a c28665x5109fe4a = this.f71847x496caac8;
        if (c28665x5109fe4a != null) {
            c28665x5109fe4a.m138280x6ecb7091(null);
        }
        m138786x3cb5b4d7();
        this.f71847x496caac8 = null;
        this.f71838x38b735af = null;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: detachAccessibilityBridge */
    public void mo138634x212f07e4() {
        this.f71834xf53d26ac.m138579xdd693ab5(null);
    }

    /* renamed from: detachFromView */
    public void m138788xa95a1a22() {
        for (int i17 = 0; i17 < this.f71845x74817082.size(); i17++) {
            this.f71840xe28578e1.removeView(this.f71845x74817082.valueAt(i17));
        }
        m138786x3cb5b4d7();
        this.f71840xe28578e1 = null;
        for (int i18 = 0; i18 < this.f71846x1f8e11bb.size(); i18++) {
            this.f71846x1f8e11bb.valueAt(i18).mo65796x7c604f14();
        }
    }

    /* renamed from: detachTextInputPlugin */
    public void m138789xfe0fb01d() {
        this.f71849x69758830 = null;
    }

    /* renamed from: disposePlatformView */
    public void m138790x7c0be977(int i17) {
        this.f71837xf8a558c7.mo138289x63a5261f(i17);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: getPlatformViewById */
    public android.view.View mo138639xbd854120(int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = this.f71846x1f8e11bb.get(i17);
        if (interfaceC28717x1311f9d8 == null) {
            return null;
        }
        return interfaceC28717x1311f9d8.mo31848xfb86a31b();
    }

    /* renamed from: getRegistry */
    public io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 m138791x52b66db3() {
        return this.f71848xd6dc303d;
    }

    /* renamed from: hideOverlaySurface */
    public void m138792xc75a141f() {
        if (this.f71842x5bd52860 == null) {
            return;
        }
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        transaction.setVisibility(this.f71842x5bd52860, false);
        transaction.apply();
    }

    /* renamed from: initializePlatformViewIfNeeded */
    public boolean m138793xcab320ba(final int i17) {
        io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28717x1311f9d8 interfaceC28717x1311f9d8 = this.f71846x1f8e11bb.get(i17);
        if (interfaceC28717x1311f9d8 == null) {
            return false;
        }
        if (this.f71845x74817082.get(i17) != null) {
            return true;
        }
        android.view.View mo31848xfb86a31b = interfaceC28717x1311f9d8.mo31848xfb86a31b();
        if (mo31848xfb86a31b == null) {
            throw new java.lang.IllegalStateException("PlatformView#getView() returned null, but an Android view reference was expected.");
        }
        if (mo31848xfb86a31b.getParent() != null) {
            throw new java.lang.IllegalStateException("The Android view returned from PlatformView#getView() was already added to a parent view.");
        }
        android.content.Context context = this.f71838x38b735af;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b(context, context.getResources().getDisplayMetrics().density, this.f71836xd973d862);
        c28621x2bcb4b4b.m137962xe6831cde(new android.view.View.OnFocusChangeListener() { // from class: io.flutter.plugin.platform.PlatformViewsController2$$a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(android.view.View view, boolean z17) {
                io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28730x2376f77b.this.m138765x7dd6d003(i17, view, z17);
            }
        });
        this.f71845x74817082.put(i17, c28621x2bcb4b4b);
        mo31848xfb86a31b.setImportantForAccessibility(4);
        c28621x2bcb4b4b.addView(mo31848xfb86a31b);
        this.f71840xe28578e1.addView(c28621x2bcb4b4b);
        return true;
    }

    /* renamed from: onDetachedFromJNI */
    public void m138794x3d3e7ea() {
        m138763xa5c5d603();
    }

    /* renamed from: onDisplayPlatformView */
    public void m138795x77ae573b(int i17, int i18, int i19, int i27, int i28, int i29, int i37, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28622x9672b4db c28622x9672b4db) {
        if (m138793xcab320ba(i17)) {
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3291xac626b97.C28621x2bcb4b4b c28621x2bcb4b4b = this.f71845x74817082.get(i17);
            c28621x2bcb4b4b.m137961xb0c5df64(c28622x9672b4db, i18, i19, i27, i28);
            c28621x2bcb4b4b.setVisibility(0);
            c28621x2bcb4b4b.bringToFront();
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i29, i37);
            android.view.View mo31848xfb86a31b = this.f71846x1f8e11bb.get(i17).mo31848xfb86a31b();
            if (mo31848xfb86a31b != null) {
                mo31848xfb86a31b.setLayoutParams(layoutParams);
                mo31848xfb86a31b.bringToFront();
            }
        }
    }

    /* renamed from: onEndFrame */
    public void m138796xa92a451() {
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        for (int i17 = 0; i17 < this.f71835x7240037b.size(); i17++) {
            transaction = transaction.merge(this.f71835x7240037b.get(i17));
        }
        this.f71835x7240037b.clear();
        this.f71840xe28578e1.invalidate();
        this.f71840xe28578e1.getRootSurfaceControl().applyTransactionOnDraw(transaction);
    }

    /* renamed from: onPreEngineRestart */
    public void m138797x89b45f89() {
        m138763xa5c5d603();
    }

    /* renamed from: setFlutterJNI */
    public void m138798x3c79a7eb(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28586x96e67e09 c28586x96e67e09) {
        this.f71839x2014a1e9 = c28586x96e67e09;
    }

    /* renamed from: setRegistry */
    public void m138799x4d6ecebf(io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28719xf67d3635 interfaceC28719xf67d3635) {
        this.f71848xd6dc303d = (io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.C28720x6bffe9f5) interfaceC28719xf67d3635;
    }

    /* renamed from: showOverlaySurface */
    public void m138800xeba6ee9a() {
        if (this.f71842x5bd52860 == null) {
            return;
        }
        android.view.SurfaceControl.Transaction transaction = new android.view.SurfaceControl.Transaction();
        transaction.setVisibility(this.f71842x5bd52860, true);
        transaction.apply();
    }

    /* renamed from: swapTransactions */
    public synchronized void m138801x86262a88() {
        this.f71835x7240037b.clear();
        for (int i17 = 0; i17 < this.f71844xab58bc8c.size(); i17++) {
            this.f71835x7240037b.add(this.f71844xab58bc8c.get(i17));
        }
        this.f71844xab58bc8c.clear();
    }

    /* renamed from: toMotionEvent */
    public android.view.MotionEvent m138802x97f17309(float f17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3300xf67ef6ff.C28665x5109fe4a.PlatformViewTouch platformViewTouch) {
        android.view.MotionEvent pop = this.f71841x28a1ee14.pop(io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28566x9665aa34.MotionEventId.m137343x3017aa(platformViewTouch.f71438x8b2b1cbf));
        android.view.MotionEvent.PointerCoords[] pointerCoordsArr = (android.view.MotionEvent.PointerCoords[]) m138769x90b7bd86(platformViewTouch.f71440x9789e573, f17).toArray(new android.view.MotionEvent.PointerCoords[platformViewTouch.f71439x8bb380d2]);
        if (pop != null) {
            m138775xcc9a9e56(pop, pointerCoordsArr);
            return pop;
        }
        return android.view.MotionEvent.obtain(platformViewTouch.f71433x550fca8f.longValue(), platformViewTouch.f71435x1df5c87.longValue(), platformViewTouch.f71430xab2f7e36, platformViewTouch.f71439x8bb380d2, (android.view.MotionEvent.PointerProperties[]) m138771x695aaf1b(platformViewTouch.f71441xc1e37cc6).toArray(new android.view.MotionEvent.PointerProperties[platformViewTouch.f71439x8bb380d2]), pointerCoordsArr, platformViewTouch.f71437xbf9ab98c, platformViewTouch.f71431x96785c7f, platformViewTouch.f71444xa7d85ae6, platformViewTouch.f71445x9c21cc05, platformViewTouch.f71432x421cea11, platformViewTouch.f71434xbfd9eca, platformViewTouch.f71442xca90681b, platformViewTouch.f71436x5cfee87);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3306x6fbd6873.InterfaceC28723x24b38218
    /* renamed from: usesVirtualDisplay */
    public boolean mo138654x756fc223(int i17) {
        return false;
    }

    /* renamed from: toLogicalPixels */
    private int m138772x7813dd5b(double d17) {
        return m138773x7813dd5b(d17, m138764xabf0e2bc());
    }
}
