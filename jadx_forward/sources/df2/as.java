package df2;

/* loaded from: classes10.dex */
public final class as implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f311281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f311282e;

    public as(df2.lt ltVar, yz5.a aVar) {
        this.f311281d = ltVar;
        this.f311282e = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = this.f311281d.E;
        if (c1073x7e08a787 != null) {
            c1073x7e08a787.setVisibility(8);
        }
        yz5.a aVar = this.f311282e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00a5 A[LOOP:0: B:17:0x003b->B:23:0x00a5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00aa A[EDGE_INSN: B:24:0x00aa->B:27:0x00aa BREAK  A[LOOP:0: B:17:0x003b->B:23:0x00a5], SYNTHETIC] */
    @Override // android.animation.Animator.AnimatorListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onAnimationEnd(android.animation.Animator r17) {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = "p0"
            r2 = r17
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)
            df2.lt r0 = r1.f311281d
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.E
            if (r0 != 0) goto L10
            goto L15
        L10:
            r2 = 8
            r0.setVisibility(r2)
        L15:
            df2.lt r0 = r1.f311281d
            mm2.o6 r0 = r0.D
            if (r0 == 0) goto L24
            kotlinx.coroutines.f1 r0 = r0.f410873d
            if (r0 == 0) goto L24
            r2 = 0
            r3 = 1
            p3325xe03a0797.p3326xc267989b.p2.a(r0, r2, r3, r2)
        L24:
            df2.lt r0 = r1.f311281d
            java.lang.Object r2 = r0.f312246u
            monitor-enter(r2)
            java.util.ArrayList r3 = r0.f312250y     // Catch: java.lang.Throwable -> Lb3
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 <= 0) goto Laa
            java.util.ArrayList r3 = r0.f312250y     // Catch: java.lang.Throwable -> Lb3
            int r3 = r3.size()     // Catch: java.lang.Throwable -> Lb3
            if (r3 < 0) goto Laa
            r4 = 0
            r5 = r4
        L3b:
            int r6 = r0.f312245t     // Catch: java.lang.Throwable -> Lb3
            int r6 = r6 + r5
            boolean r7 = r0.r7(r6)     // Catch: java.lang.Throwable -> Lb3
            if (r7 == 0) goto La1
            r0.f312245t = r6     // Catch: java.lang.Throwable -> Lb3
            java.util.ArrayList r7 = r0.f312250y     // Catch: java.lang.Throwable -> Lb3
            int r8 = r7.size()     // Catch: java.lang.Throwable -> Lb3
            int r8 = r6 % r8
            java.lang.Object r7 = r7.get(r8)     // Catch: java.lang.Throwable -> Lb3
            in5.c r7 = (in5.c) r7     // Catch: java.lang.Throwable -> Lb3
            r0.f312243r = r7     // Catch: java.lang.Throwable -> Lb3
            com.tencent.mm.view.RecyclerHorizontalViewPager r7 = r0.f312239n     // Catch: java.lang.Throwable -> Lb3
            if (r7 == 0) goto La1
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb3
            r15.<init>()     // Catch: java.lang.Throwable -> Lb3
            java.lang.ThreadLocal r8 = zj0.c.f554818a     // Catch: java.lang.Throwable -> Lb3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lb3
            r15.add(r6)     // Catch: java.lang.Throwable -> Lb3
            java.util.Collections.reverse(r15)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object[] r9 = r15.toArray()     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r10 = "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$hideTipsAnimate$1$1$2"
            java.lang.String r11 = "onAnimationEnd"
            java.lang.String r12 = "(Landroid/animation/Animator;)V"
            java.lang.String r13 = "Undefined"
            java.lang.String r14 = "scrollToPosition"
            java.lang.String r6 = "(I)V"
            r8 = r7
            r17 = r0
            r0 = r15
            r15 = r6
            yj0.a.d(r8, r9, r10, r11, r12, r13, r14, r15)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> Lb3
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> Lb3
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> Lb3
            r7.a1(r0)     // Catch: java.lang.Throwable -> Lb3
            java.lang.String r9 = "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$hideTipsAnimate$1$1$2"
            java.lang.String r10 = "onAnimationEnd"
            java.lang.String r11 = "(Landroid/animation/Animator;)V"
            java.lang.String r12 = "Undefined"
            java.lang.String r13 = "scrollToPosition"
            java.lang.String r14 = "(I)V"
            r8 = r7
            yj0.a.f(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> Lb3
            goto La3
        La1:
            r17 = r0
        La3:
            if (r5 == r3) goto Laa
            int r5 = r5 + 1
            r0 = r17
            goto L3b
        Laa:
            monitor-exit(r2)
            yz5.a r0 = r1.f311282e
            if (r0 == 0) goto Lb2
            r0.mo152xb9724478()
        Lb2:
            return
        Lb3:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.as.onAnimationEnd(android.animation.Animator):void");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}
