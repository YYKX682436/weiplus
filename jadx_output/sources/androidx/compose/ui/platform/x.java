package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class x extends n3.c {
    public static final int[] D = {com.tencent.mm.R.id.f482350c5, com.tencent.mm.R.id.f482351c6, com.tencent.mm.R.id.f482361cg, com.tencent.mm.R.id.f482372cr, com.tencent.mm.R.id.f482375cu, com.tencent.mm.R.id.f482376cv, com.tencent.mm.R.id.f482377cw, com.tencent.mm.R.id.f482378cx, com.tencent.mm.R.id.f482379cy, com.tencent.mm.R.id.f482380cz, com.tencent.mm.R.id.f482352c7, com.tencent.mm.R.id.f482353c8, com.tencent.mm.R.id.f482354c9, com.tencent.mm.R.id.c_, com.tencent.mm.R.id.f482355ca, com.tencent.mm.R.id.f482356cb, com.tencent.mm.R.id.f482357cc, com.tencent.mm.R.id.f482358cd, com.tencent.mm.R.id.f482359ce, com.tencent.mm.R.id.f482360cf, com.tencent.mm.R.id.f482362ch, com.tencent.mm.R.id.f482363ci, com.tencent.mm.R.id.f482364cj, com.tencent.mm.R.id.f482365ck, com.tencent.mm.R.id.f482366cl, com.tencent.mm.R.id.f482367cm, com.tencent.mm.R.id.f482368cn, com.tencent.mm.R.id.f482369co, com.tencent.mm.R.id.f482370cp, com.tencent.mm.R.id.f482371cq, com.tencent.mm.R.id.f482373cs, com.tencent.mm.R.id.f482374ct};
    public final java.lang.Runnable A;
    public final java.util.List B;
    public final yz5.l C;

    /* renamed from: e, reason: collision with root package name */
    public final androidx.compose.ui.platform.AndroidComposeView f10787e;

    /* renamed from: f, reason: collision with root package name */
    public int f10788f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.accessibility.AccessibilityManager f10789g;

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f10790h;

    /* renamed from: i, reason: collision with root package name */
    public final o3.p f10791i;

    /* renamed from: m, reason: collision with root package name */
    public int f10792m;

    /* renamed from: n, reason: collision with root package name */
    public final x.o f10793n;

    /* renamed from: o, reason: collision with root package name */
    public final x.o f10794o;

    /* renamed from: p, reason: collision with root package name */
    public int f10795p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.Integer f10796q;

    /* renamed from: r, reason: collision with root package name */
    public final x.d f10797r;

    /* renamed from: s, reason: collision with root package name */
    public final u26.w f10798s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f10799t;

    /* renamed from: u, reason: collision with root package name */
    public androidx.compose.ui.platform.c0 f10800u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.Map f10801v;

    /* renamed from: w, reason: collision with root package name */
    public final x.d f10802w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Map f10803x;

    /* renamed from: y, reason: collision with root package name */
    public androidx.compose.ui.platform.d0 f10804y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10805z;

    public x(androidx.compose.ui.platform.AndroidComposeView view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f10787e = view;
        this.f10788f = Integer.MIN_VALUE;
        java.lang.Object systemService = view.getContext().getSystemService("accessibility");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        }
        this.f10789g = (android.view.accessibility.AccessibilityManager) systemService;
        this.f10790h = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f10791i = new o3.p(new androidx.compose.ui.platform.b0(this));
        this.f10792m = Integer.MIN_VALUE;
        this.f10793n = new x.o();
        this.f10794o = new x.o();
        this.f10795p = -1;
        this.f10797r = new x.d(0);
        this.f10798s = u26.z.a(-1, null, null, 6, null);
        this.f10799t = true;
        kz5.q0 q0Var = kz5.q0.f314001d;
        this.f10801v = q0Var;
        this.f10802w = new x.d(0);
        this.f10803x = new java.util.LinkedHashMap();
        this.f10804y = new androidx.compose.ui.platform.d0(view.getSemanticsOwner().a(), q0Var);
        view.addOnAttachStateChangeListener(new androidx.compose.ui.platform.y(this));
        this.A = new java.lang.Runnable() { // from class: androidx.compose.ui.platform.x$$a
            /* JADX WARN: Code restructure failed: missing block: B:165:0x04aa, code lost:
            
                if ((!r1.isEmpty()) != false) goto L195;
             */
            /* JADX WARN: Code restructure failed: missing block: B:180:0x04e7, code lost:
            
                if (r2 != null) goto L190;
             */
            /* JADX WARN: Code restructure failed: missing block: B:182:0x04ec, code lost:
            
                if (r2 == null) goto L190;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 1627
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x$$a.run():void");
            }
        };
        this.B = new java.util.ArrayList();
        this.C = new androidx.compose.ui.platform.g0(this);
    }

    public static final boolean l(y1.j jVar, float f17) {
        return (f17 < 0.0f && ((java.lang.Number) jVar.f458745a.invoke()).floatValue() > 0.0f) || (f17 > 0.0f && ((java.lang.Number) jVar.f458745a.invoke()).floatValue() < ((java.lang.Number) jVar.f458746b.invoke()).floatValue());
    }

    public static final float m(float f17, float f18) {
        if (java.lang.Math.signum(f17) == java.lang.Math.signum(f18)) {
            return java.lang.Math.abs(f17) < java.lang.Math.abs(f18) ? f17 : f18;
        }
        return 0.0f;
    }

    public static final boolean n(y1.j jVar) {
        float floatValue = ((java.lang.Number) jVar.f458745a.invoke()).floatValue();
        boolean z17 = jVar.f458747c;
        return (floatValue > 0.0f && !z17) || (((java.lang.Number) jVar.f458745a.invoke()).floatValue() < ((java.lang.Number) jVar.f458746b.invoke()).floatValue() && z17);
    }

    public static final boolean o(y1.j jVar) {
        float floatValue = ((java.lang.Number) jVar.f458745a.invoke()).floatValue();
        float floatValue2 = ((java.lang.Number) jVar.f458746b.invoke()).floatValue();
        boolean z17 = jVar.f458747c;
        return (floatValue < floatValue2 && !z17) || (((java.lang.Number) jVar.f458745a.invoke()).floatValue() > 0.0f && z17);
    }

    public static /* synthetic */ boolean s(androidx.compose.ui.platform.x xVar, int i17, int i18, java.lang.Integer num, java.util.List list, int i19, java.lang.Object obj) {
        if ((i19 & 4) != 0) {
            num = null;
        }
        if ((i19 & 8) != 0) {
            list = null;
        }
        return xVar.r(i17, i18, num, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:12:0x0033, B:14:0x0069, B:19:0x007e, B:21:0x0086, B:24:0x0093, B:26:0x0098, B:28:0x00a7, B:30:0x00ae, B:31:0x00b7, B:40:0x004d), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c8 -> B:13:0x0036). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[LOOP:0: B:14:0x004a->B:45:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(boolean r10, int r11, long r12) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.x.b(boolean, int, long):boolean");
    }

    public final android.view.accessibility.AccessibilityEvent c(int i17, int i18) {
        android.view.accessibility.AccessibilityEvent obtain = android.view.accessibility.AccessibilityEvent.obtain(i18);
        kotlin.jvm.internal.o.f(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        androidx.compose.ui.platform.AndroidComposeView androidComposeView = this.f10787e;
        obtain.setPackageName(androidComposeView.getContext().getPackageName());
        obtain.setSource(androidComposeView, i17);
        androidx.compose.ui.platform.z3 z3Var = (androidx.compose.ui.platform.z3) g().get(java.lang.Integer.valueOf(i17));
        if (z3Var != null) {
            obtain.setPassword(z3Var.f10832a.f().d(y1.i0.f458742x));
        }
        return obtain;
    }

    public final android.view.accessibility.AccessibilityEvent d(int i17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent c17 = c(i17, 8192);
        if (num != null) {
            c17.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            c17.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            c17.setItemCount(num3.intValue());
        }
        if (str != null) {
            c17.getText().add(str);
        }
        return c17;
    }

    public final int e(y1.y yVar) {
        y1.l lVar = yVar.f458799e;
        y1.o0 o0Var = y1.i0.f458719a;
        if (!lVar.d(y1.i0.f458719a)) {
            y1.o0 o0Var2 = y1.i0.f458738t;
            y1.l lVar2 = yVar.f458799e;
            if (lVar2.d(o0Var2)) {
                return a2.m1.c(((a2.m1) lVar2.e(o0Var2)).f783a);
            }
        }
        return this.f10795p;
    }

    public final int f(y1.y yVar) {
        y1.l lVar = yVar.f458799e;
        y1.o0 o0Var = y1.i0.f458719a;
        if (!lVar.d(y1.i0.f458719a)) {
            y1.o0 o0Var2 = y1.i0.f458738t;
            y1.l lVar2 = yVar.f458799e;
            if (lVar2.d(o0Var2)) {
                return (int) (((a2.m1) lVar2.e(o0Var2)).f783a >> 32);
            }
        }
        return this.f10795p;
    }

    public final java.util.Map g() {
        if (this.f10799t) {
            y1.a0 semanticsOwner = this.f10787e.getSemanticsOwner();
            kotlin.jvm.internal.o.g(semanticsOwner, "<this>");
            y1.y a17 = semanticsOwner.a();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            u1.w wVar = a17.f458801g;
            if (wVar.A && wVar.x()) {
                android.graphics.Region region = new android.graphics.Region();
                region.set(e1.t0.a(a17.d()));
                androidx.compose.ui.platform.h0.d(region, a17, linkedHashMap, a17);
            }
            this.f10801v = linkedHashMap;
            this.f10799t = false;
        }
        return this.f10801v;
    }

    @Override // n3.c
    public o3.p getAccessibilityNodeProvider(android.view.View host) {
        kotlin.jvm.internal.o.g(host, "host");
        return this.f10791i;
    }

    public final java.lang.String h(y1.y yVar) {
        a2.d dVar;
        if (yVar == null) {
            return null;
        }
        y1.o0 o0Var = y1.i0.f458719a;
        y1.o0 o0Var2 = y1.i0.f458719a;
        y1.l lVar = yVar.f458799e;
        if (lVar.d(o0Var2)) {
            return z0.w.a((java.util.List) lVar.e(o0Var2), ",", null, null, 0, null, null, 62, null);
        }
        if (androidx.compose.ui.platform.h0.e(yVar)) {
            a2.d i17 = i(lVar);
            if (i17 != null) {
                return i17.f681d;
            }
            return null;
        }
        java.util.List list = (java.util.List) y1.m.a(lVar, y1.i0.f458736r);
        if (list == null || (dVar = (a2.d) kz5.n0.Z(list)) == null) {
            return null;
        }
        return dVar.f681d;
    }

    public final a2.d i(y1.l lVar) {
        y1.o0 o0Var = y1.i0.f458719a;
        return (a2.d) y1.m.a(lVar, y1.i0.f458737s);
    }

    public final boolean j() {
        android.view.accessibility.AccessibilityManager accessibilityManager = this.f10789g;
        return accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled();
    }

    public final void k(u1.w wVar) {
        if (this.f10797r.add(wVar)) {
            ((u26.o) this.f10798s).e(jz5.f0.f302826a);
        }
    }

    public final int p(int i17) {
        if (i17 == this.f10787e.getSemanticsOwner().a().f458800f) {
            return -1;
        }
        return i17;
    }

    public final boolean q(android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (!j()) {
            return false;
        }
        android.view.View view = this.f10787e;
        return view.getParent().requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public final boolean r(int i17, int i18, java.lang.Integer num, java.util.List list) {
        if (i17 == Integer.MIN_VALUE || !j()) {
            return false;
        }
        android.view.accessibility.AccessibilityEvent c17 = c(i17, i18);
        if (num != null) {
            c17.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            c17.setContentDescription(z0.w.a(list, ",", null, null, 0, null, null, 62, null));
        }
        return q(c17);
    }

    public final void t(int i17, int i18, java.lang.String str) {
        android.view.accessibility.AccessibilityEvent c17 = c(p(i17), 32);
        c17.setContentChangeTypes(i18);
        if (str != null) {
            c17.getText().add(str);
        }
        q(c17);
    }

    public final void u(int i17) {
        androidx.compose.ui.platform.c0 c0Var = this.f10800u;
        if (c0Var != null) {
            y1.y yVar = c0Var.f10521a;
            if (i17 != yVar.f458800f) {
                return;
            }
            if (android.os.SystemClock.uptimeMillis() - c0Var.f10526f <= 1000) {
                android.view.accessibility.AccessibilityEvent c17 = c(p(yVar.f458800f), 131072);
                c17.setFromIndex(c0Var.f10524d);
                c17.setToIndex(c0Var.f10525e);
                c17.setAction(c0Var.f10522b);
                c17.setMovementGranularity(c0Var.f10523c);
                c17.getText().add(h(yVar));
                q(c17);
            }
        }
        this.f10800u = null;
    }

    public final void v(y1.y yVar, androidx.compose.ui.platform.d0 d0Var) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.List h17 = yVar.h();
        int size = h17.size();
        int i17 = 0;
        while (true) {
            u1.w wVar = yVar.f458801g;
            if (i17 >= size) {
                java.util.Iterator it = d0Var.f10536b.iterator();
                while (it.hasNext()) {
                    if (!linkedHashSet.contains(java.lang.Integer.valueOf(((java.lang.Number) it.next()).intValue()))) {
                        k(wVar);
                        return;
                    }
                }
                java.util.List h18 = yVar.h();
                int size2 = h18.size();
                for (int i18 = 0; i18 < size2; i18++) {
                    y1.y yVar2 = (y1.y) h18.get(i18);
                    if (g().containsKey(java.lang.Integer.valueOf(yVar2.f458800f))) {
                        java.lang.Object obj = ((java.util.LinkedHashMap) this.f10803x).get(java.lang.Integer.valueOf(yVar2.f458800f));
                        kotlin.jvm.internal.o.d(obj);
                        v(yVar2, (androidx.compose.ui.platform.d0) obj);
                    }
                }
                return;
            }
            y1.y yVar3 = (y1.y) h17.get(i17);
            if (g().containsKey(java.lang.Integer.valueOf(yVar3.f458800f))) {
                java.util.Set set = d0Var.f10536b;
                int i19 = yVar3.f458800f;
                if (!set.contains(java.lang.Integer.valueOf(i19))) {
                    k(wVar);
                    return;
                }
                linkedHashSet.add(java.lang.Integer.valueOf(i19));
            }
            i17++;
        }
    }

    public final void w(u1.w wVar, x.d dVar) {
        y1.n d17;
        y1.l c17;
        if (wVar.x() && !this.f10787e.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().containsKey(wVar)) {
            y1.n d18 = y1.z.d(wVar);
            u1.w wVar2 = null;
            if (d18 == null) {
                u1.w p17 = wVar.p();
                while (true) {
                    if (p17 == null) {
                        p17 = null;
                        break;
                    } else {
                        if (java.lang.Boolean.valueOf(y1.z.d(p17) != null).booleanValue()) {
                            break;
                        } else {
                            p17 = p17.p();
                        }
                    }
                }
                d18 = p17 != null ? y1.z.d(p17) : null;
                if (d18 == null) {
                    return;
                }
            }
            if (!d18.c().f458767e) {
                u1.w p18 = wVar.p();
                while (true) {
                    if (p18 == null) {
                        break;
                    }
                    y1.n d19 = y1.z.d(p18);
                    if (java.lang.Boolean.valueOf((d19 == null || (c17 = d19.c()) == null || !c17.f458767e) ? false : true).booleanValue()) {
                        wVar2 = p18;
                        break;
                    }
                    p18 = p18.p();
                }
                if (wVar2 != null && (d17 = y1.z.d(wVar2)) != null) {
                    d18 = d17;
                }
            }
            int i17 = ((y1.q) ((y1.o) d18.f423655e)).f458786d;
            if (dVar.add(java.lang.Integer.valueOf(i17))) {
                s(this, p(i17), 2048, 1, null, 8, null);
            }
        }
    }

    public final boolean x(y1.y yVar, int i17, int i18, boolean z17) {
        java.lang.String h17;
        y1.l lVar = yVar.f458799e;
        y1.o0 o0Var = y1.k.f458749a;
        y1.o0 o0Var2 = y1.k.f458755g;
        if (lVar.d(o0Var2) && androidx.compose.ui.platform.h0.a(yVar)) {
            yz5.q qVar = (yz5.q) ((y1.a) yVar.f458799e.e(o0Var2)).f458693b;
            if (qVar != null) {
                return ((java.lang.Boolean) qVar.invoke(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17))).booleanValue();
            }
            return false;
        }
        if ((i17 == i18 && i18 == this.f10795p) || (h17 = h(yVar)) == null) {
            return false;
        }
        if (i17 < 0 || i17 != i18 || i18 > h17.length()) {
            i17 = -1;
        }
        this.f10795p = i17;
        boolean z18 = h17.length() > 0;
        int i19 = yVar.f458800f;
        q(d(p(i19), z18 ? java.lang.Integer.valueOf(this.f10795p) : null, z18 ? java.lang.Integer.valueOf(this.f10795p) : null, z18 ? java.lang.Integer.valueOf(h17.length()) : null, h17));
        u(i19);
        return true;
    }

    public final java.lang.CharSequence y(java.lang.CharSequence charSequence, int i17) {
        boolean z17 = true;
        if (!(i17 > 0)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        if (charSequence != null && charSequence.length() != 0) {
            z17 = false;
        }
        if (z17 || charSequence.length() <= i17) {
            return charSequence;
        }
        int i18 = i17 - 1;
        if (java.lang.Character.isHighSurrogate(charSequence.charAt(i18)) && java.lang.Character.isLowSurrogate(charSequence.charAt(i17))) {
            i17 = i18;
        }
        return charSequence.subSequence(0, i17);
    }

    public final void z(int i17) {
        int i18 = this.f10788f;
        if (i18 == i17) {
            return;
        }
        this.f10788f = i17;
        s(this, i17, 128, null, null, 12, null);
        s(this, i18, 256, null, null, 12, null);
    }
}
