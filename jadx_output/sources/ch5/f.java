package ch5;

/* loaded from: classes14.dex */
public final class f extends androidx.customview.widget.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout f41563a;

    public f(com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout) {
        this.f41563a = circleToSearchDraggableLayout;
    }

    public static void l(ch5.f fVar, int i17, int i18, yz5.l lVar, yz5.a aVar, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            lVar = null;
        }
        if ((i19 & 8) != 0) {
            aVar = null;
        }
        fVar.getClass();
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.setDuration(200L);
        ch5.d dVar = new ch5.d(fVar.f41563a, lVar);
        ch5.c cVar = new ch5.c(aVar, ofInt, dVar);
        ofInt.addUpdateListener(dVar);
        ofInt.addListener(cVar);
        ofInt.start();
    }

    @Override // androidx.customview.widget.k
    public int a(android.view.View child, int i17, int i18) {
        kotlin.jvm.internal.o.g(child, "child");
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // androidx.customview.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(android.view.View r1, int r2, int r3) {
        /*
            r0 = this;
            java.lang.String r3 = "child"
            kotlin.jvm.internal.o.g(r1, r3)
            r1 = 0
            if (r2 < 0) goto L12
            com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout r3 = r0.f41563a
            int r3 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout.a(r3)
            if (r2 > r3) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = r1
        L13:
            if (r3 == 0) goto L16
            goto L17
        L16:
            r2 = r1
        L17:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ch5.f.b(android.view.View, int, int):int");
    }

    @Override // androidx.customview.widget.k
    public int d(android.view.View child) {
        int mDialogHeight;
        kotlin.jvm.internal.o.g(child, "child");
        mDialogHeight = this.f41563a.getMDialogHeight();
        return mDialogHeight;
    }

    @Override // androidx.customview.widget.k
    public void h(int i17) {
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout;
        yz5.p dragStatusBlock;
        if (i17 != 1 || (dragStatusBlock = (circleToSearchDraggableLayout = this.f41563a).getDragStatusBlock()) == null) {
            return;
        }
        dragStatusBlock.invoke("STATE_WILL_CHANGE_HEIGHT", java.lang.String.valueOf(circleToSearchDraggableLayout.getCurVisiblePercent()));
    }

    @Override // androidx.customview.widget.k
    public void i(android.view.View changedView, int i17, int i18, int i19, int i27) {
        int mDialogHeight;
        int mDialogHeight2;
        kotlin.jvm.internal.o.g(changedView, "changedView");
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41563a;
        if (kotlin.jvm.internal.o.b(changedView, circleToSearchDraggableLayout.f208829f)) {
            circleToSearchDraggableLayout.f208833m = i18;
            yz5.l dragTranslationListener = circleToSearchDraggableLayout.getDragTranslationListener();
            if (dragTranslationListener != null) {
                mDialogHeight = circleToSearchDraggableLayout.getMDialogHeight();
                mDialogHeight2 = circleToSearchDraggableLayout.getMDialogHeight();
                dragTranslationListener.invoke(java.lang.Float.valueOf((mDialogHeight - i18) / mDialogHeight2));
            }
        }
    }

    @Override // androidx.customview.widget.k
    public void j(android.view.View releasedChild, float f17, float f18) {
        int mDialogHeight;
        int mDialogHeight2;
        int mDialogHeight3;
        int mDialogHeight4;
        kotlin.jvm.internal.o.g(releasedChild, "releasedChild");
        int top = releasedChild.getTop();
        double d17 = top;
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41563a;
        mDialogHeight = circleToSearchDraggableLayout.getMDialogHeight();
        if (d17 <= mDialogHeight * 0.2d) {
            l(this, top, 0, null, new ch5.a(circleToSearchDraggableLayout), 4, null);
        } else {
            mDialogHeight2 = circleToSearchDraggableLayout.getMDialogHeight();
            if (d17 < mDialogHeight2 * 0.8d) {
                mDialogHeight3 = circleToSearchDraggableLayout.getMDialogHeight();
                l(this, top, (int) (mDialogHeight3 * 0.35d), null, new ch5.b(circleToSearchDraggableLayout), 4, null);
            } else if (!circleToSearchDraggableLayout.f208832i) {
                circleToSearchDraggableLayout.f208832i = true;
                ch5.e eVar = new ch5.e(circleToSearchDraggableLayout);
                android.view.View view = circleToSearchDraggableLayout.f208829f;
                if (view != null) {
                    int top2 = view.getTop();
                    mDialogHeight4 = circleToSearchDraggableLayout.getMDialogHeight();
                    l(this, top2, mDialogHeight4, null, eVar, 4, null);
                }
            }
        }
        circleToSearchDraggableLayout.invalidate();
    }

    @Override // androidx.customview.widget.k
    public boolean k(android.view.View child, int i17) {
        kotlin.jvm.internal.o.g(child, "child");
        int i18 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout.f208826q;
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41563a;
        circleToSearchDraggableLayout.getClass();
        return kotlin.jvm.internal.o.b(child, circleToSearchDraggableLayout.f208829f);
    }
}
