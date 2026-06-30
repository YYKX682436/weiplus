package gk3;

/* loaded from: classes8.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk3.m f354034d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f354035e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f354036f;

    public g(gk3.m mVar, int i17, boolean z17) {
        this.f354034d = mVar;
        this.f354035e = i17;
        this.f354036f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ek3.d dVar;
        android.graphics.Rect rect;
        gk3.m mVar = this.f354034d;
        ek3.d dVar2 = mVar.f354060c;
        android.graphics.Rect rect2 = dVar2 != null ? dVar2.f335140v : null;
        int i17 = this.f354035e;
        if (rect2 == null) {
            kk3.d dVar3 = mVar.f354062e;
            if (dVar3 != null) {
                dVar3.e(i17);
                return;
            }
            return;
        }
        kk3.d dVar4 = mVar.f354062e;
        boolean z17 = this.f354036f;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "initMaskView, exitAnim:%b, enterAnim:%b, way:%d", java.lang.Boolean.valueOf(z17), java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17));
        if (mVar.c().mo2161x8c409d27() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page mask view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.c().mo2159xc2a54588() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page content view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.c().a() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page root view is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        if (mVar.f354063f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "isExitAnimating now!");
            return;
        }
        android.graphics.Bitmap mo2158x12501425 = mVar.c().mo2158x12501425();
        if (mo2158x12501425 == null || mo2158x12501425.isRecycled() || mo2158x12501425.getWidth() == 0 || mo2158x12501425.getHeight() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "doMaskAnimation, page get bitmap is null");
            if (dVar4 != null) {
                dVar4.e(i17);
                return;
            }
            return;
        }
        ek3.e eVar = mVar.f354061d;
        if (eVar == null || eVar.getParent() == null) {
            ek3.e eVar2 = new ek3.e(mVar.c().mo2157x19263085(), mo2158x12501425);
            mVar.f354061d = eVar2;
            eVar2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            android.view.ViewGroup a17 = mVar.c().a();
            if (a17 != null) {
                a17.addView(mVar.f354061d, a17.getChildCount());
            }
        }
        jk3.e eVar3 = mVar.f354059b;
        java.lang.String q17 = eVar3 != null ? ((jk3.b) eVar3).q(i17) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(q17)) {
            if (i17 == 4) {
                jk3.e eVar4 = mVar.f354059b;
                if (eVar4 != null) {
                    q17 = eVar4.e();
                }
                q17 = null;
            } else {
                jk3.e eVar5 = mVar.f354059b;
                if (eVar5 != null) {
                    q17 = eVar5.mo141063xa86cd69f();
                }
                q17 = null;
            }
        }
        if (q17 != null) {
            try {
                java.lang.String[] strArr = (java.lang.String[]) new r26.t(",").g(q17, 0).toArray(new java.lang.String[0]);
                if (strArr != null && strArr.length == 4 && (dVar = mVar.f354060c) != null) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(strArr[0]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf, "valueOf(...)");
                    int intValue = valueOf.intValue();
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(strArr[1]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf2, "valueOf(...)");
                    int intValue2 = valueOf2.intValue();
                    java.lang.Integer valueOf3 = java.lang.Integer.valueOf(strArr[2]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf3, "valueOf(...)");
                    int intValue3 = valueOf3.intValue();
                    java.lang.Integer valueOf4 = java.lang.Integer.valueOf(strArr[3]);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(valueOf4, "valueOf(...)");
                    dVar.f335140v = new android.graphics.Rect(new android.graphics.Rect(intValue, intValue2, intValue3, valueOf4.intValue()));
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTaskSwipeBackAndEnterAnimWrapperSS", "refreshPosition, get pos failed, %s", e17.getMessage());
            }
        }
        android.view.View mo2159xc2a54588 = mVar.c().mo2159xc2a54588();
        if (mo2159xc2a54588 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo2159xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo2159xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo2159xc2a54588, "com/tencent/mm/plugin/multitask/animation/swipeback/singlescene/MultiTaskSwipeBackAnimWrapperSS", "initMaskView", "(IZZLcom/tencent/mm/plugin/multitask/listener/OnMultiTaskFBTransformationListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (!z17) {
            if (dVar4 != null) {
                ek3.e eVar6 = mVar.f354061d;
                dVar4.d(eVar6 != null ? eVar6.m127794x8c4fcf52() : null, true, i17);
            }
            mVar.e();
            return;
        }
        mVar.f354063f = true;
        int width = (int) (mo2158x12501425.getWidth() * 1.0f);
        int height = (int) (mo2158x12501425.getHeight() * 1.0f);
        android.graphics.Rect rect3 = new android.graphics.Rect(0, 0, width, height);
        ek3.d dVar5 = mVar.f354060c;
        if (dVar5 == null || (rect = dVar5.f335140v) == null) {
            rect = new android.graphics.Rect();
        }
        android.graphics.Rect rect4 = rect;
        float width2 = rect4.width() / width;
        oa5.b.b(mVar.f354061d).m((r8 - (rect3.left + (rect3.width() / 2))) * width2).n((r9 - (rect3.top + (rect3.height() / 2))) * width2).e(width2).f(width2).k(new gk3.h(width, height, width2, rect4, mVar, rect4.left + (rect4.width() / 2), rect4.top + (rect4.height() / 2))).h(new android.view.animation.AccelerateInterpolator()).p(new gk3.i(mVar, dVar4, mo2158x12501425, i17)).o(new gk3.k(mVar, dVar4, mo2158x12501425, i17)).g(250L).l();
    }
}
