package au2;

@j95.b
/* loaded from: classes10.dex */
public final class q extends i95.w implements zy2.gb {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f14085i = kotlin.jvm.internal.i0.a(au2.q.class).d() + ".finder_shortcut_id";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f14086d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f14087e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f14088f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f14089g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f14090h = -1;

    public final void Ai(android.content.Context context) {
        com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer finderShortcutsDrawer;
        com.tencent.mm.ui.widget.dialog.j0 j0Var;
        kotlin.jvm.internal.o.g(context, "context");
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = context.getString(com.tencent.mm.R.string.o6i);
        e4Var.b(com.tencent.mm.R.raw.toast_ok);
        e4Var.c();
        java.lang.ref.WeakReference weakReference = this.f14086d;
        if (weakReference != null && (j0Var = (com.tencent.mm.ui.widget.dialog.j0) weakReference.get()) != null) {
            j0Var.dismiss();
        }
        this.f14086d = null;
        java.lang.ref.WeakReference weakReference2 = this.f14087e;
        if (weakReference2 != null && (finderShortcutsDrawer = (com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer) weakReference2.get()) != null) {
            com.tencent.mm.view.drawer.RecyclerViewDrawer.o(finderShortcutsDrawer, false, 1, null);
        }
        this.f14087e = null;
        i95.m c17 = i95.n0.c(cq.k.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        com.tencent.mm.sdk.platformtools.o4 o4Var = ((cq.k) c17).f221226g.f242284a;
        if (o4Var != null) {
            o4Var.G("kFinderIsShortcutsExistKey", true);
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:489)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:492)
        */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[LOOP:0: B:13:0x004e->B:42:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Bi(android.content.Context r10) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: au2.q.Bi(android.content.Context):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (r11.q() == true) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Di(android.app.Activity r11, boolean r12) {
        /*
            r10 = this;
            java.lang.Class<cq.k> r0 = cq.k.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            cq.k r0 = (cq.k) r0
            kotlin.jvm.internal.h0 r1 = new kotlin.jvm.internal.h0
            r1.<init>()
            android.view.Window r2 = r11.getWindow()
            r3 = 0
            if (r2 == 0) goto L24
            android.view.View r2 = r2.getDecorView()
            if (r2 == 0) goto L24
            android.view.View r2 = r2.getRootView()
            goto L25
        L24:
            r2 = r3
        L25:
            if (r2 == 0) goto L4f
            r4 = 2131305004(0x7f09222c, float:1.8228167E38)
            android.view.View r4 = r2.findViewById(r4)
            boolean r5 = r4 instanceof com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer
            if (r5 == 0) goto L35
            r3 = r4
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r3 = (com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer) r3
        L35:
            r1.f310123d = r3
            if (r3 != 0) goto L4f
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r3 = new com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r3
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r1.f310123d = r3
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r11.<init>(r4, r4)
            ym5.v6.c(r2, r3, r11)
        L4f:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            java.lang.Object r2 = r1.f310123d
            r11.<init>(r2)
            r10.f14087e = r11
            java.lang.Object r11 = r1.f310123d
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r11 = (com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer) r11
            if (r11 == 0) goto L66
            boolean r11 = r11.q()
            r2 = 1
            if (r11 != r2) goto L66
            goto L67
        L66:
            r2 = 0
        L67:
            if (r2 == 0) goto L6a
            return
        L6a:
            au2.p r11 = new au2.p
            dq.b r0 = r0.f221226g
            r11.<init>(r1, r12, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            pm0.v.V(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au2.q.Di(android.app.Activity, boolean):void");
    }

    public final void wi(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        if (Bi(context)) {
            Ai(context);
            return;
        }
        i95.m c17 = i95.n0.c(ae0.h.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ae0.e eVar = ae0.e.FINDER;
        ae0.g i17 = xp1.d.i(context, null, false, eVar, new zd0.e$$a());
        com.tencent.mm.ui.widget.dialog.j0 j0Var = i17.f3381c;
        if (j0Var != null) {
            this.f14086d = new java.lang.ref.WeakReference(j0Var);
        }
        pm0.v.K(null, new au2.m(this, context));
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return;
        }
        i95.m c18 = i95.n0.c(ae0.h.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        xp1.d.g(context, i17.f3379a, i17.f3380b, false, null, eVar, new au2.n(this, context));
    }
}
