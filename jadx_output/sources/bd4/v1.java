package bd4;

/* loaded from: classes4.dex */
public final class v1 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f19402d;

    public v1(bd4.f2 f2Var) {
        this.f19402d = f2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onContextClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onContextClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap detected  selectContent:");
        bd4.f2 f2Var = this.f19402d;
        sb6.append((java.lang.Object) bd4.f2.d(f2Var));
        sb6.append("  text:");
        sb6.append((java.lang.Object) wl5.y.o(bd4.f2.a(f2Var)));
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f19342w = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2.g(f2Var, 3);
        if (!f2Var.A(e17)) {
            f2Var.B(e17);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDoubleTap", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GestureDetector.onDown rawX=");
        sb6.append(e17.getRawX());
        sb6.append(" rawY=");
        sb6.append(e17.getRawY());
        sb6.append(" textView.isAttachedToWindow=");
        bd4.f2 f2Var = this.f19402d;
        sb6.append(bd4.f2.a(f2Var).isAttachedToWindow());
        sb6.append(" textView.visibility=");
        sb6.append(bd4.f2.a(f2Var).getVisibility());
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V", this, array);
        kotlin.jvm.internal.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GestureDetector.onLongPress triggered, rawX=");
        sb6.append(e17.getRawX());
        sb6.append(" rawY=");
        sb6.append(e17.getRawY());
        sb6.append(" selectContent=");
        bd4.f2 f2Var = this.f19402d;
        sb6.append((java.lang.Object) bd4.f2.d(f2Var));
        com.tencent.mars.xlog.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f19342w = true;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (f2Var.r(e17.getRawX(), e17.getRawY())) {
            bd4.f2.g(f2Var, 2);
            if (!f2Var.A(e17)) {
                f2Var.B(e17);
            }
            wl5.x m17 = f2Var.m();
            android.util.Pair e18 = m17 != null ? m17.e() : null;
            java.lang.Integer num = e18 != null ? (java.lang.Integer) e18.first : null;
            int intValue = num == null ? 0 : num.intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f19345z = intValue;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            java.lang.Integer num2 = e18 != null ? (java.lang.Integer) e18.second : null;
            int intValue2 = num2 == null ? 0 : num2.intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.A = intValue2;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            int i17 = f2Var.A;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            int i18 = f2Var.f19345z;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean z17 = i18 >= 0 && i18 < i17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f19344y = z17;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (bd4.f2.c(f2Var)) {
                f2Var.p();
                bd4.f2.a(f2Var).getLocationOnScreen(new int[2]);
                float rawX = e17.getRawX() - r2[0];
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$setLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                f2Var.B = rawX;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$setLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                f2Var.f19321b.post(new bd4.b2(f2Var, android.view.MotionEvent.obtain(e17)));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            }
        } else {
            bd4.f2.g(f2Var, 2);
            if (!f2Var.A(e17)) {
                bd4.f2.g(f2Var, 1);
                f2Var.z();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTouchHandler$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTouchHandler$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                bd4.a aVar = f2Var.f19325f;
                if (aVar != null) {
                    com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView improveContentView = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView) aVar;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onViewLongCLickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    com.tencent.mm.plugin.sns.ui.improve.view.ImproveTextView improveTextView = improveContentView.f169129u;
                    if (improveTextView == null) {
                        kotlin.jvm.internal.o.o("opTv");
                        throw null;
                    }
                    if (kotlin.jvm.internal.o.b(improveTextView.getTag(), 2)) {
                        improveContentView.v(new bd4.t(improveContentView));
                        bd4.f2 f2Var2 = improveContentView.B;
                        if (f2Var2 != null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            f2Var2.C(false, -1);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                        }
                    }
                    bd4.f2 f2Var3 = improveContentView.B;
                    if (f2Var3 != null) {
                        bd4.f2.H(f2Var3, false, 1, null);
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onViewLongCLickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.NAME, "(Landroid/view/MotionEvent;)V");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(if1.m.NAME, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onSingleTapConfirmed(android.view.MotionEvent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "onSingleTapConfirmed"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            java.lang.String r2 = "e"
            kotlin.jvm.internal.o.g(r13, r2)
            bd4.f2 r2 = r12.f19402d
            java.lang.CharSequence r3 = bd4.f2.d(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L29
            float r3 = r13.getRawX()
            float r13 = r13.getRawY()
            boolean r13 = r2.r(r3, r13)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r13
        L29:
            float r3 = r13.getRawX()
            float r4 = r13.getRawY()
            boolean r3 = r2.r(r3, r4)
            r4 = 1
            if (r3 == 0) goto L3c
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        L3c:
            java.lang.String r3 = "access$performClickSpanAtPosition"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r3, r5)
            java.lang.String r6 = "performClickSpanAtPosition"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r6, r5)
            android.view.View r7 = r2.f19321b
            java.lang.CharSequence r7 = wl5.y.o(r7)
            boolean r8 = r7 instanceof android.text.Spannable
            if (r8 == 0) goto L56
            android.text.Spannable r7 = (android.text.Spannable) r7
            goto L57
        L56:
            r7 = 0
        L57:
            r8 = 0
            if (r7 != 0) goto L5e
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            goto La5
        L5e:
            r9 = 2
            int[] r9 = new int[r9]
            android.view.View r10 = r2.f19321b
            r10.getLocationOnScreen(r9)
            float r10 = r13.getRawX()
            r11 = r9[r8]
            float r11 = (float) r11
            float r10 = r10 - r11
            int r10 = (int) r10
            float r13 = r13.getRawY()
            r9 = r9[r4]
            float r9 = (float) r9
            float r13 = r13 - r9
            int r13 = (int) r13
            android.view.View r9 = r2.f19321b
            int r13 = wl5.y.k(r9, r10, r13)
            java.lang.Class<android.text.style.ClickableSpan> r9 = android.text.style.ClickableSpan.class
            java.lang.Object[] r13 = r7.getSpans(r13, r13, r9)
            android.text.style.ClickableSpan[] r13 = (android.text.style.ClickableSpan[]) r13
            kotlin.jvm.internal.o.d(r13)
            int r7 = r13.length
            if (r7 != 0) goto L8e
            r7 = r4
            goto L8f
        L8e:
            r7 = r8
        L8f:
            r7 = r7 ^ r4
            if (r7 == 0) goto La2
            java.lang.Object r13 = kz5.z.f0(r13)
            android.text.style.ClickableSpan r13 = (android.text.style.ClickableSpan) r13
            android.view.View r7 = r2.f19321b
            r13.onClick(r7)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
            r13 = r4
            goto La6
        La2:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r6, r5)
        La5:
            r13 = r8
        La6:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r3, r5)
            if (r13 == 0) goto Laf
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r4
        Laf:
            java.lang.String r13 = "access$getTouchHandler$p"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r13, r5)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r13, r5)
            bd4.a r13 = r2.f19325f
            if (r13 == 0) goto Lcb
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r13 = (com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView) r13
            java.lang.String r2 = "onViewClickListener"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r2, r3)
            r13.q()
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r2, r3)
        Lcb:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bd4.v1.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return onSingleTapUp;
    }
}
