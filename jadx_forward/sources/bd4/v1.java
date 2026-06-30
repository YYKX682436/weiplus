package bd4;

/* loaded from: classes4.dex */
public final class v1 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bd4.f2 f100935d;

    public v1(bd4.f2 f2Var) {
        this.f100935d = f2Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onContextClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onContextClick", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDoubleTap", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDoubleTap detected  selectContent:");
        bd4.f2 f2Var = this.f100935d;
        sb6.append((java.lang.Object) bd4.f2.d(f2Var));
        sb6.append("  text:");
        sb6.append((java.lang.Object) wl5.y.o(bd4.f2.a(f2Var)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f100875w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        bd4.f2.g(f2Var, 3);
        if (!f2Var.A(e17)) {
            f2Var.B(e17);
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDoubleTap", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GestureDetector.onDown rawX=");
        sb6.append(e17.getRawX());
        sb6.append(" rawY=");
        sb6.append(e17.getRawY());
        sb6.append(" textView.isAttachedToWindow=");
        bd4.f2 f2Var = this.f100935d;
        sb6.append(bd4.f2.a(f2Var).isAttachedToWindow());
        sb6.append(" textView.visibility=");
        sb6.append(bd4.f2.a(f2Var).getVisibility());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDown", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent e17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("GestureDetector.onLongPress triggered, rawX=");
        sb6.append(e17.getRawX());
        sb6.append(" rawY=");
        sb6.append(e17.getRawY());
        sb6.append(" selectContent=");
        bd4.f2 f2Var = this.f100935d;
        sb6.append((java.lang.Object) bd4.f2.d(f2Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Improve.SnsSelectableTextHelper", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        f2Var.f100875w = true;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setIgnoreNextGlobalClick$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
        if (f2Var.r(e17.getRawX(), e17.getRawY())) {
            bd4.f2.g(f2Var, 2);
            if (!f2Var.A(e17)) {
                f2Var.B(e17);
            }
            wl5.x m17 = f2Var.m();
            android.util.Pair e18 = m17 != null ? m17.e() : null;
            java.lang.Integer num = e18 != null ? (java.lang.Integer) e18.first : null;
            int intValue = num == null ? 0 : num.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f100878z = intValue;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            java.lang.Integer num2 = e18 != null ? (java.lang.Integer) e18.second : null;
            int intValue2 = num2 == null ? 0 : num2.intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.A = intValue2;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            int i17 = f2Var.A;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressRightOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            int i18 = f2Var.f100878z;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getLongPressLeftOffset$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            boolean z17 = i18 >= 0 && i18 < i17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            f2Var.f100877y = z17;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLongPressing$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            if (bd4.f2.c(f2Var)) {
                f2Var.p();
                bd4.f2.a(f2Var).getLocationOnScreen(new int[2]);
                float rawX = e17.getRawX() - r2[0];
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                f2Var.B = rawX;
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setLongPressFingerXInView$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                f2Var.f100854b.post(new bd4.b2(f2Var, android.view.MotionEvent.obtain(e17)));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$showMagnifierOnNextDraw", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
            }
        } else {
            bd4.f2.g(f2Var, 2);
            if (!f2Var.A(e17)) {
                bd4.f2.g(f2Var, 1);
                f2Var.z();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getTouchHandler$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getTouchHandler$p", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                bd4.a aVar = f2Var.f100858f;
                if (aVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446 c18267x4e51b446 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446) aVar;
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onViewLongCLickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18277x17b0cea c18277x17b0cea = c18267x4e51b446.f250662u;
                    if (c18277x17b0cea == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("opTv");
                        throw null;
                    }
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18277x17b0cea.getTag(), 2)) {
                        c18267x4e51b446.v(new bd4.t(c18267x4e51b446));
                        bd4.f2 f2Var2 = c18267x4e51b446.B;
                        if (f2Var2 != null) {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                            f2Var2.C(false, -1);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setCollapsedState$default", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper");
                        }
                    }
                    bd4.f2 f2Var3 = c18267x4e51b446.B;
                    if (f2Var3 != null) {
                        bd4.f2.H(f2Var3, false, 1, null);
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onViewLongCLickListener", "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView");
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(if1.m.f69928x24728b, "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
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
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            java.lang.String r2 = "e"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r2)
            bd4.f2 r2 = r12.f100935d
            java.lang.CharSequence r3 = bd4.f2.d(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L29
            float r3 = r13.getRawX()
            float r13 = r13.getRawY()
            boolean r13 = r2.r(r3, r13)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r13
        L29:
            float r3 = r13.getRawX()
            float r4 = r13.getRawY()
            boolean r3 = r2.r(r3, r4)
            r4 = 1
            if (r3 == 0) goto L3c
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        L3c:
            java.lang.String r3 = "access$performClickSpanAtPosition"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r3, r5)
            java.lang.String r6 = "performClickSpanAtPosition"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r6, r5)
            android.view.View r7 = r2.f100854b
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
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r5)
            goto La5
        L5e:
            r9 = 2
            int[] r9 = new int[r9]
            android.view.View r10 = r2.f100854b
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
            android.view.View r9 = r2.f100854b
            int r13 = wl5.y.k(r9, r10, r13)
            java.lang.Class<android.text.style.ClickableSpan> r9 = android.text.style.ClickableSpan.class
            java.lang.Object[] r13 = r7.getSpans(r13, r13, r9)
            android.text.style.ClickableSpan[] r13 = (android.text.style.ClickableSpan[]) r13
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r13)
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
            android.view.View r7 = r2.f100854b
            r13.onClick(r7)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r5)
            r13 = r4
            goto La6
        La2:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r6, r5)
        La5:
            r13 = r8
        La6:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r3, r5)
            if (r13 == 0) goto Laf
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r4
        Laf:
            java.lang.String r13 = "access$getTouchHandler$p"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r13, r5)
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r13, r5)
            bd4.a r13 = r2.f100858f
            if (r13 == 0) goto Lcb
            com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView r13 = (com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.p2197x373aa5.C18267x4e51b446) r13
            java.lang.String r2 = "onViewClickListener"
            java.lang.String r3 = "com.tencent.mm.plugin.sns.ui.improve.view.ImproveContentView"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r3)
            r13.q()
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r3)
        Lcb:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: bd4.v1.onSingleTapConfirmed(android.view.MotionEvent):boolean");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/sns/ui/improve/view/SnsSelectableTextHelper$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onSingleTapUp", "com.tencent.mm.plugin.sns.ui.improve.view.SnsSelectableTextHelper$mGestureDetector$1");
        return onSingleTapUp;
    }
}
