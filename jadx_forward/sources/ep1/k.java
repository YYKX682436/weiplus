package ep1;

/* loaded from: classes14.dex */
public final class k implements pv.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f337182a = jz5.h.b(ep1.c.f337140d);

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ep1.k r2, android.view.View r3, fp1.b r4, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r5) {
        /*
            r2.getClass()
            boolean r3 = r5 instanceof ep1.a
            if (r3 == 0) goto L16
            r3 = r5
            ep1.a r3 = (ep1.a) r3
            int r4 = r3.f337134f
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L16
            int r4 = r4 - r0
            r3.f337134f = r4
            goto L1b
        L16:
            ep1.a r3 = new ep1.a
            r3.<init>(r2, r5)
        L1b:
            java.lang.Object r2 = r3.f337132d
            pz5.a r4 = pz5.a.f440719d
            int r3 = r3.f337134f
            jz5.f0 r4 = jz5.f0.f384359a
            if (r3 == 0) goto L37
            r4 = 1
            if (r3 != r4) goto L2f
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r2)
            android.view.View r2 = (android.view.View) r2
            r2 = 0
            throw r2
        L2f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r2.<init>(r3)
            throw r2
        L37:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ep1.k.a(ep1.k, android.view.View, fp1.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(ep1.k r29, int r30, android.view.View r31, pv.y r32, android.animation.AnimatorListenerAdapter r33) {
        /*
            Method dump skipped, instructions count: 671
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ep1.k.b(ep1.k, int, android.view.View, pv.y, android.animation.AnimatorListenerAdapter):void");
    }

    public void c(android.content.Intent intent, android.view.View view, fp1.b bVar, qn5.a aVar) {
        pv.y yVar = new pv.y();
        yVar.f440039c = intent;
        yVar.f440040d = view;
        d(yVar, bVar, aVar);
    }

    public void d(pv.y floatBallPageAnimationInfo, fp1.b bVar, qn5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatBallPageAnimationInfo, "floatBallPageAnimationInfo");
        android.view.View view = floatBallPageAnimationInfo.f440040d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationHelper", "enterPage contentView: %s", view);
        if (view == null) {
            j(aVar);
            return;
        }
        android.content.Intent intent = floatBallPageAnimationInfo.f440039c;
        if (!ep1.m.h(intent) && !floatBallPageAnimationInfo.f440037a) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPageAnimationHelper", "enterPage not enterFromFloatBallWithAnimation and ignore");
            j(aVar);
            return;
        }
        boolean z17 = true;
        if (!(intent != null && intent.getIntExtra("key_enter_orientation", 0) == 1) && !floatBallPageAnimationInfo.f440038b) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPageAnimationHelper", "enterPage orientation not portrait and ignore");
            j(aVar);
        } else {
            if (bVar != null && !bVar.b()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPageAnimationHelper", "enterPage pageAnimationAdapter needEnterAnimation false");
                j(aVar);
                return;
            }
            if (floatBallPageAnimationInfo.f440043g == null && !floatBallPageAnimationInfo.f440044h) {
                z17 = false;
            }
            floatBallPageAnimationInfo.f440044h = z17;
            i(view, 1, floatBallPageAnimationInfo, bVar, aVar);
        }
    }

    public boolean e(android.content.Intent intent, android.view.View view, android.graphics.Point point, fp1.b bVar, qn5.a aVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationHelper", "exitPage contentView: %s", view);
        if (view == null) {
            j(aVar);
            return false;
        }
        if (bVar != null && !bVar.c()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPageAnimationHelper", "exitPage pageAnimationAdapter needExitAnimation false");
            j(aVar);
            return false;
        }
        pv.y yVar = new pv.y();
        yVar.f440040d = view;
        yVar.f440041e = point;
        return i(view, 2, yVar, bVar, aVar);
    }

    public boolean f(pv.y floatBallPageAnimationInfo, fp1.b bVar, qn5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(floatBallPageAnimationInfo, "floatBallPageAnimationInfo");
        android.view.View view = floatBallPageAnimationInfo.f440040d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationHelper", "exitPage contentView: %s", view);
        if (view == null) {
            j(aVar);
            return false;
        }
        if (bVar == null || bVar.c()) {
            floatBallPageAnimationInfo.f440044h = floatBallPageAnimationInfo.f440043g != null || floatBallPageAnimationInfo.f440044h;
            return i(view, 2, floatBallPageAnimationInfo, bVar, aVar);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FloatBallPageAnimationHelper", "exitPage pageAnimationAdapter needExitAnimation false");
        j(aVar);
        return false;
    }

    public final android.graphics.Point g(android.view.View view, android.graphics.Point point, boolean z17) {
        gp1.v h17;
        if (!z17 && view.getWidth() > 0 && view.getHeight() > 0 && (h17 = h()) != null) {
            return h17.T(view.getWidth(), point);
        }
        return null;
    }

    public final gp1.v h() {
        return (gp1.v) ((jz5.n) this.f337182a).mo141623x754a37bb();
    }

    public final boolean i(android.view.View view, int i17, pv.y yVar, fp1.b bVar, qn5.a aVar) {
        gp1.v h17;
        boolean z17 = yVar.f440045i;
        android.graphics.Point point = yVar.f440041e;
        if (point == null) {
            point = (z17 || (h17 = h()) == null) ? null : h17.P();
        }
        android.graphics.Point point2 = point;
        if (point2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallSize invalid");
            j(aVar);
            return false;
        }
        android.graphics.Point point3 = yVar.f440042f;
        if (i17 == 1) {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ep1.d(this, view, bVar, null), 3, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimationHelper", "handlePageAnimation", "(Landroid/view/View;ILcom/tencent/mm/feature/ball/api/FloatBallPageAnimationInfo;Lcom/tencent/mm/plugin/ball/animation/api/IFloatBallPageAnimationAdapter;Lcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/ball/animation/FloatBallPageAnimationHelper", "handlePageAnimation", "(Landroid/view/View;ILcom/tencent/mm/feature/ball/api/FloatBallPageAnimationInfo;Lcom/tencent/mm/plugin/ball/animation/api/IFloatBallPageAnimationAdapter;Lcom/tencent/mm/view/refreshLayout/listener/MMAnimatorListenerAdapter;)Z", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.getViewTreeObserver().addOnGlobalLayoutListener(new ep1.g(view, point3, this, point2, z17, aVar, yVar, bVar, i17));
            return true;
        }
        android.graphics.Point g17 = point3 == null ? g(view, point2, z17) : point3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation contentView.width: %s, floatBallPosition: %s", java.lang.Integer.valueOf(view.getWidth()), g17);
        if (g17 == null || g17.x == -1 || g17.y == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FloatBallPageAnimationHelper", "handlePageAnimation floatBallPosition invalid");
            j(aVar);
            return false;
        }
        if (!z17) {
            pm0.v.X(new ep1.h(this));
        }
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new ep1.j(this, view, bVar, yVar, g17, point2, i17, aVar, null), 3, null);
        return true;
    }

    public final void j(qn5.a aVar) {
        if (aVar != null) {
            aVar.a(null);
        }
    }
}
