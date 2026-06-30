package bh5;

/* loaded from: classes14.dex */
public final class f extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout f20930a;

    public f(com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout) {
        this.f20930a = halfScreenPullDownCloseLayout;
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int b(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        if (i17 >= 0) {
            return i17;
        }
        return 0;
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View child) {
        int mDialogHeight;
        kotlin.jvm.internal.o.g(child, "child");
        mDialogHeight = this.f20930a.getMDialogHeight();
        return mDialogHeight;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // androidx.customview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(android.view.View r2, int r3, int r4, int r5, int r6) {
        /*
            r1 = this;
            java.lang.String r3 = "changedView"
            kotlin.jvm.internal.o.g(r2, r3)
            com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout r3 = r1.f20930a
            boolean r5 = r3.isRecordDragPosition
            if (r5 == 0) goto L12
            bh5.g r5 = new bh5.g
            r5.<init>(r2)
            r3.f208797n = r5
        L12:
            bh5.e r5 = r3.getPullDownCallback()
            if (r5 == 0) goto L2c
            bh5.q0 r5 = (bh5.q0) r5
            com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment r5 = r5.f20956a
            int r6 = r5.f208818v
            int r6 = r6 - r4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r5.D = r0
            int r0 = r5.f208818v
            bh5.a0 r5 = r5.f208819w
            r5.b(r6, r0)
        L2c:
            android.view.View r5 = r3.f208792f
            if (r2 != r5) goto L38
            int r2 = com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout.a(r3)
            if (r4 < r2) goto L38
            r2 = 1
            goto L39
        L38:
            r2 = 0
        L39:
            if (r2 == 0) goto L3e
            r1.l()
        L3e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bh5.f.i(android.view.View, int, int, int, int):void");
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        float mSlideHeight;
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        float top = releasedChild.getTop();
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = this.f20930a;
        mSlideHeight = halfScreenPullDownCloseLayout.getMSlideHeight();
        boolean z17 = top <= mSlideHeight;
        bh5.e pullDownCallback = halfScreenPullDownCloseLayout.getPullDownCallback();
        if (pullDownCallback != null) {
            bh5.q0 q0Var = (bh5.q0) pullDownCallback;
            if (!z17) {
                com.tencent.mm.ui.halfscreen.MMHalfScreenDialogFragment mMHalfScreenDialogFragment = q0Var.f20956a;
                mMHalfScreenDialogFragment.getClass();
                ((jz5.n) mMHalfScreenDialogFragment.B).getValue();
            }
        }
        if (z17) {
            androidx.customview.widget.l lVar = halfScreenPullDownCloseLayout.f208794h;
            if (lVar != null) {
                lVar.s(0, 0);
            }
        } else {
            l();
        }
        halfScreenPullDownCloseLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        int i18 = com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout.f208789p;
        this.f20930a.getClass();
        return true;
    }

    public final void l() {
        android.app.Activity activity;
        com.tencent.mm.ui.halfscreen.HalfScreenPullDownCloseLayout halfScreenPullDownCloseLayout = this.f20930a;
        if (halfScreenPullDownCloseLayout.f208795i) {
            return;
        }
        halfScreenPullDownCloseLayout.f208795i = true;
        yz5.a dragFinishInterceptor = halfScreenPullDownCloseLayout.getDragFinishInterceptor();
        if ((dragFinishInterceptor != null && ((java.lang.Boolean) dragFinishInterceptor.invoke()).booleanValue()) || (activity = halfScreenPullDownCloseLayout.f208793g) == null) {
            return;
        }
        activity.finish();
    }
}
