package dz4;

/* loaded from: classes5.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.j0 f326807d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f326808e;

    public h0(dz4.j0 j0Var, int i17) {
        this.f326807d = j0Var;
        this.f326808e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.app.Activity activity;
        dz4.j0 j0Var = this.f326807d;
        ih0.p pVar = j0Var.f326842a;
        if (pVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterWeNoteNativeHelperImpl", "startVoiceInputAsync: holder null");
            return;
        }
        dz4.k1 k1Var = (dz4.k1) ((jz5.n) ((ez4.u) pVar).f339488n).mo141623x754a37bb();
        k1Var.getClass();
        dz4.o callback = j0Var.f326845d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ih0.p pVar2 = k1Var.f326850a;
        ez4.u uVar = (ez4.u) pVar2;
        java.lang.ref.WeakReference weakReference = uVar.f339477c;
        android.app.Activity activity2 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        java.lang.String str = k1Var.f326851b;
        if (activity2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleShowVoiceInputPanel: activity is null");
            return;
        }
        int i17 = this.f326808e;
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleShowVoiceInputPanel: invalid panelHeight[" + i17 + ']');
            return;
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        boolean a17 = j35.u.a(activity2, "android.permission.RECORD_AUDIO", 80, null, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleShowVoiceInputPanel checkPermission checkMicrophone[%b]", java.lang.Boolean.valueOf(a17));
        if (a17) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) activity2.findViewById(com.p314xaae8f345.mm.R.id.f565684d61);
            android.view.ViewGroup viewGroup2 = viewGroup;
            if (viewGroup == null) {
                viewGroup2 = (android.view.ViewGroup) activity2.findViewById(android.R.id.content);
            }
            if (viewGroup2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "handleShowVoiceInputPanel: parent container not found");
                return;
            }
            int i18 = ((int) (i17 * activity2.getResources().getDisplayMetrics().density)) - 2;
            k1Var.f326853d = i18;
            if (k1Var.f326852c == null) {
                if (activity2.isFinishing() || activity2.isDestroyed()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "createAndShowVoiceInputPanel: activity invalid, abort");
                    return;
                }
                try {
                    k1Var.a();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib(activity2, false, null);
                    ibVar.m75550x9f36c276(true);
                    if (viewGroup2 instanceof android.widget.FrameLayout) {
                        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, i18);
                        layoutParams2.gravity = 80;
                        layoutParams2.bottomMargin = activity2.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561432ic);
                        layoutParams = layoutParams2;
                    } else {
                        layoutParams = new android.view.ViewGroup.LayoutParams(-1, i18);
                    }
                    viewGroup2.addView(ibVar, layoutParams);
                    ibVar.m75547x6c4ebec7(new dz4.h1(k1Var, callback, i18, ibVar));
                    k1Var.f326852c = ibVar;
                    k1Var.d(i18);
                    k1Var.c(new dz4.i1(callback));
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "createAndShowVoiceInputPanel: error creating panel", e17);
                    k1Var.f326852c = null;
                    return;
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "handleShowVoiceInputPanel: panel already exists, showing existing panel");
            int i19 = k1Var.f326853d;
            java.lang.ref.WeakReference weakReference2 = uVar.f339477c;
            android.app.Activity activity3 = weakReference2 != null ? (android.app.Activity) weakReference2.get() : null;
            if (activity3 == null || activity3.isFinishing() || activity3.isDestroyed()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showExistingPanel: activity invalid, cleanup");
                k1Var.a();
                return;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.ib ibVar2 = k1Var.f326852c;
            if (ibVar2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "showExistingPanel: panel is null");
                return;
            }
            try {
                android.view.ViewGroup.LayoutParams layoutParams3 = ibVar2.getLayoutParams();
                if (layoutParams3 != null) {
                    java.lang.ref.WeakReference weakReference3 = ((ez4.u) pVar2).f339477c;
                    if (weakReference3 != null && (activity = (android.app.Activity) weakReference3.get()) != null) {
                        if (layoutParams3 instanceof android.widget.FrameLayout.LayoutParams) {
                            ((android.widget.FrameLayout.LayoutParams) layoutParams3).gravity = 80;
                            ((android.widget.FrameLayout.LayoutParams) layoutParams3).bottomMargin = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561432ic);
                            layoutParams3.height = i19;
                            ibVar2.setLayoutParams(layoutParams3);
                        } else if (layoutParams3 instanceof android.view.ViewGroup.MarginLayoutParams) {
                            ((android.view.ViewGroup.MarginLayoutParams) layoutParams3).topMargin = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561432ic);
                            layoutParams3.height = i19;
                            ibVar2.setLayoutParams(layoutParams3);
                        } else {
                            layoutParams3.height = i19;
                            ibVar2.setLayoutParams(layoutParams3);
                        }
                    }
                    return;
                }
                k1Var.d(i19);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "showExistingPanel: error showing panel", e18);
                k1Var.a();
            }
        }
    }
}
