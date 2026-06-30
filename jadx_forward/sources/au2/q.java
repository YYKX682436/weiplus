package au2;

@j95.b
/* loaded from: classes10.dex */
public final class q extends i95.w implements zy2.gb {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f95618i = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(au2.q.class).d() + ".finder_shortcut_id";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f95619d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f95620e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f95621f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Long f95622g;

    /* renamed from: h, reason: collision with root package name */
    public volatile int f95623h = -1;

    public final void Ai(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18 c14988xa0c9eb18;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
        e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o6i);
        e4Var.b(com.p314xaae8f345.mm.R.raw.f81211xadecd6f4);
        e4Var.c();
        java.lang.ref.WeakReference weakReference = this.f95619d;
        if (weakReference != null && (j0Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0) weakReference.get()) != null) {
            j0Var.dismiss();
        }
        this.f95619d = null;
        java.lang.ref.WeakReference weakReference2 = this.f95620e;
        if (weakReference2 != null && (c14988xa0c9eb18 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18) weakReference2.get()) != null) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22821xbaee45b5.o(c14988xa0c9eb18, false, 1, null);
        }
        this.f95620e = null;
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323817a;
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
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
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
            boolean r5 = r4 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18
            if (r5 == 0) goto L35
            r3 = r4
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18) r3
        L35:
            r1.f391656d = r3
            if (r3 != 0) goto L4f
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r3 = new com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            r4 = r3
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9)
            r1.f391656d = r3
            android.view.ViewGroup$LayoutParams r11 = new android.view.ViewGroup$LayoutParams
            r4 = -1
            r11.<init>(r4, r4)
            ym5.v6.c(r2, r3, r11)
        L4f:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference
            java.lang.Object r2 = r1.f391656d
            r11.<init>(r2)
            r10.f95620e = r11
            java.lang.Object r11 = r1.f391656d
            com.tencent.mm.plugin.finder.shortcuts.FinderShortcutsDrawer r11 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14988xa0c9eb18) r11
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
            dq.b r0 = r0.f302759g
            r11.<init>(r1, r12, r0)
            r0 = 1000(0x3e8, double:4.94E-321)
            pm0.v.V(r0, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: au2.q.Di(android.app.Activity, boolean):void");
    }

    public final void wi(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (Bi(context)) {
            Ai(context);
            return;
        }
        i95.m c17 = i95.n0.c(ae0.h.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ae0.e eVar = ae0.e.FINDER;
        ae0.g i17 = xp1.d.i(context, null, false, eVar, new zd0.C30835x2e755c());
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = i17.f84914c;
        if (j0Var != null) {
            this.f95619d = new java.lang.ref.WeakReference(j0Var);
        }
        pm0.v.K(null, new au2.m(this, context));
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            return;
        }
        i95.m c18 = i95.n0.c(ae0.h.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        xp1.d.g(context, i17.f84912a, i17.f84913b, false, null, eVar, new au2.n(this, context));
    }
}
