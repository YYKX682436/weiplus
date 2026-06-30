package at2;

/* loaded from: classes3.dex */
public final class n1 extends com.tencent.mm.plugin.finder.live.plugin.h {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f13714p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f13715q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f13716r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f13717s;

    /* renamed from: t, reason: collision with root package name */
    public final jz5.g f13718t;

    /* renamed from: u, reason: collision with root package name */
    public final jz5.g f13719u;

    /* renamed from: v, reason: collision with root package name */
    public final jz5.g f13720v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.Runnable f13721w;

    /* renamed from: x, reason: collision with root package name */
    public kotlinx.coroutines.r2 f13722x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f13723y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(android.view.ViewGroup root, qo0.c statusMonitor) {
        super(root, statusMonitor, null);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f13714p = "ReplayTransitionLazyPlugin";
        this.f13715q = jz5.h.b(new at2.l1(root));
        this.f13716r = jz5.h.b(new at2.k1(root));
        this.f13717s = jz5.h.b(new at2.i1(root));
        this.f13718t = jz5.h.b(new at2.a1(root));
        this.f13719u = jz5.h.b(new at2.z0(root));
        this.f13720v = jz5.h.b(new at2.f1(root));
        com.tencent.mars.xlog.Log.i("ReplayTransitionLazyPlugin", "ReplayTransition0,init root:" + root.hashCode());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t1(at2.n1 r8, kotlin.coroutines.Continuation r9) {
        /*
            r8.getClass()
            boolean r0 = r9 instanceof at2.h1
            if (r0 == 0) goto L16
            r0 = r9
            at2.h1 r0 = (at2.h1) r0
            int r1 = r0.f13682g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f13682g = r1
            goto L1b
        L16:
            at2.h1 r0 = new at2.h1
            r0.<init>(r8, r9)
        L1b:
            java.lang.Object r9 = r0.f13680e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f13682g
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r8 = r0.f13679d
            at2.n1 r8 = (at2.n1) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L80
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.lang.Object r8 = r0.f13679d
            at2.n1 r8 = (at2.n1) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L59
        L42:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = r8.f13714p
            java.lang.String r2 = "ReplayTransition2.2:playReplay"
            com.tencent.mars.xlog.Log.i(r9, r2)
            r0.f13679d = r8
            r0.f13682g = r4
            r6 = 1200(0x4b0, double:5.93E-321)
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r6, r0)
            if (r9 != r1) goto L59
            goto L8f
        L59:
            com.tencent.mm.plugin.finder.live.view.k0 r9 = r8.R0()
            ws2.u0 r2 = ws2.k1.f449066r
            ws2.k1 r2 = r2.a()
            zs2.c r2 = r2.f449070b
            if (r2 == 0) goto L6c
            km2.m r2 = r2.a()
            goto L6d
        L6c:
            r2 = 0
        L6d:
            kotlin.jvm.internal.o.d(r2)
            r9.activate(r2, r5, r5)
            r0.f13679d = r8
            r0.f13682g = r3
            r2 = 800(0x320, double:3.953E-321)
            java.lang.Object r9 = kotlinx.coroutines.k1.b(r2, r0)
            if (r9 != r1) goto L80
            goto L8f
        L80:
            r8.O0()
            java.lang.Class<ct2.j> r9 = ct2.j.class
            androidx.lifecycle.c1 r8 = r8.P0(r9)
            ct2.j r8 = (ct2.j) r8
            r8.D = r5
            jz5.f0 r1 = jz5.f0.f302826a
        L8f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: at2.n1.t1(at2.n1, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static void y1(at2.n1 n1Var, android.widget.TextView textView, java.lang.String str, java.util.List list, long j17, int i17, java.lang.Object obj) {
        kotlinx.coroutines.r2 r2Var;
        long j18 = (i17 & 8) != 0 ? 500L : j17;
        n1Var.getClass();
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        java.lang.String string = textView.getContext().getResources().getString(com.tencent.mm.R.string.d9y);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str2 = string + str;
        textView.setText(str2);
        boolean z17 = false;
        textView.measure(android.view.View.MeasureSpec.makeMeasureSpec(0, 0), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = textView.getMeasuredWidth();
        textView.setText(string);
        if (measuredWidth > 0) {
            textView.setMinWidth(measuredWidth);
        }
        com.tencent.mars.xlog.Log.i(n1Var.f13714p, "playAppendAnim minWidth:" + measuredWidth + " for text:" + str2);
        kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
        kotlinx.coroutines.r2 r2Var2 = n1Var.f13722x;
        if (r2Var2 != null && ((kotlinx.coroutines.a) r2Var2).a()) {
            z17 = true;
        }
        if (z17 && (r2Var = n1Var.f13722x) != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        n1Var.f13722x = kotlinx.coroutines.l.d(n1Var.R0().getViewScope(), null, null, new at2.g1(n1Var, f0Var, textView, string, list, size, j18, null), 3, null);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return false;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        com.tencent.mars.xlog.Log.i(this.f13714p, "ReplayTransition100:unMount");
        z1();
        this.f365323d.setVisibility(8);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return true;
    }

    public final android.view.View u1() {
        java.lang.Object value = ((jz5.n) this.f13720v).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.view.View) value;
    }

    public final android.widget.TextView v1() {
        java.lang.Object value = ((jz5.n) this.f13717s).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final android.widget.TextView w1() {
        java.lang.Object value = ((jz5.n) this.f13716r).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (android.widget.TextView) value;
    }

    public final com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget x1() {
        java.lang.Object value = ((jz5.n) this.f13715q).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.plugin.finder.view.FinderLiveOnliveWidget) value;
    }

    public final void z1() {
        java.lang.Runnable runnable = this.f13721w;
        if (runnable != null) {
            this.f365323d.removeCallbacks(runnable);
        }
        this.f13721w = null;
        kotlinx.coroutines.r2 r2Var = this.f13722x;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f13722x = null;
        this.f13723y = false;
        android.view.View u17 = u1();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(u17, arrayList.toArray(), "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "unInitUIUpdateTask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        u17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(u17, "com/tencent/mm/plugin/finder/replay/plugin/ReplayTransitionLazyPlugin", "unInitUIUpdateTask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
