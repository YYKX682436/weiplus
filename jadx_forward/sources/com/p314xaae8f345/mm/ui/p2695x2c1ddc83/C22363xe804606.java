package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/ui/conversation/ConvExposeHelper;", "Lgg5/c;", "Landroidx/lifecycle/v;", "<init>", "()V", "com/tencent/mm/ui/conversation/u1", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.conversation.ConvExposeHelper */
/* loaded from: classes11.dex */
public final class C22363xe804606 extends gg5.c implements p012xc85e97e9.p093xedfae76a.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606 f288826d;

    /* renamed from: e, reason: collision with root package name */
    public static java.lang.ref.WeakReference f288827e;

    /* renamed from: f, reason: collision with root package name */
    public static java.lang.ref.WeakReference f288828f;

    /* renamed from: g, reason: collision with root package name */
    public static int f288829g;

    /* renamed from: h, reason: collision with root package name */
    public static int f288830h;

    /* renamed from: i, reason: collision with root package name */
    public static int f288831i;

    /* renamed from: m, reason: collision with root package name */
    public static int f288832m;

    /* renamed from: n, reason: collision with root package name */
    public static int f288833n;

    /* renamed from: o, reason: collision with root package name */
    public static int f288834o;

    /* renamed from: p, reason: collision with root package name */
    public static int f288835p;

    /* renamed from: q, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f288836q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.concurrent.atomic.AtomicBoolean f288837r;

    /* renamed from: s, reason: collision with root package name */
    public static boolean f288838s;

    /* renamed from: t, reason: collision with root package name */
    public static boolean f288839t;

    /* renamed from: u, reason: collision with root package name */
    public static boolean f288840u;

    static {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606 c22363xe804606 = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606();
        f288826d = c22363xe804606;
        f288827e = new java.lang.ref.WeakReference(null);
        f288828f = new java.lang.ref.WeakReference(null);
        f288829g = -1;
        f288830h = -1;
        f288831i = -1;
        f288832m = -1;
        f288833n = -1;
        f288834o = -1;
        f288835p = -1;
        f288836q = new java.util.concurrent.atomic.AtomicBoolean(true);
        f288837r = new java.util.concurrent.atomic.AtomicBoolean(true);
        f288839t = true;
        f288840u = true;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a2 a2Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.a2();
        e42.k0 k0Var = (e42.k0) gm0.j1.s(e42.k0.class);
        if (k0Var != null) {
            ((a52.f) k0Var).b(c22363xe804606);
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40973x40b15f2e(a2Var);
        ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi().a0(0, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u1.f289624a);
    }

    private C22363xe804606() {
    }

    @Override // e42.j0
    public void A(android.app.Activity activity) {
        if (activity == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("LauncherUI", activity.getClass().getSimpleName())) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275259k = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j = activity.getClass().getSimpleName();
        a1Var.n(null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "onHellActivityResume lastDisappearedUIName=" + com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275259k + " lastStartUIName=" + com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j);
    }

    public final void c(android.widget.ListView listView, yf5.j0 j0Var) {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b42;
        android.content.Context context = listView != null ? listView.getContext() : null;
        android.widget.ListView listView2 = (android.widget.ListView) f288827e.get();
        android.content.Context context2 = listView2 != null ? listView2.getContext() : null;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context, context2)) {
            if (f288838s) {
                com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e54 = context2 instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 ? (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) context2 : null;
                if (activityC21387x976b8e54 != null && (mo273xed6858b42 = activityC21387x976b8e54.mo273xed6858b4()) != null) {
                    mo273xed6858b42.c(this);
                }
                f288838s = false;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "unregister previous lifecycle observer");
            }
            com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 activityC21387x976b8e542 = context instanceof com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54 ? (com.p314xaae8f345.mm.ui.ActivityC21387x976b8e54) context : null;
            if (activityC21387x976b8e542 != null && (mo273xed6858b4 = activityC21387x976b8e542.mo273xed6858b4()) != null) {
                mo273xed6858b4.a(this);
                f288838s = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "register new lifecycle observer");
            }
        }
        if (listView != null) {
            f288827e = new java.lang.ref.WeakReference(listView);
        }
        if (j0Var != null) {
            f288828f = new java.lang.ref.WeakReference(j0Var);
        }
        f288831i = listView != null ? listView.getFirstVisiblePosition() : -1;
        f288832m = listView != null ? listView.getLastVisiblePosition() : -1;
        f288833n = listView != null ? listView.getHeaderViewsCount() : -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038 A[Catch: Exception -> 0x008e, TryCatch #0 {Exception -> 0x008e, blocks: (B:16:0x0026, B:18:0x002c, B:23:0x0038, B:25:0x0046, B:27:0x004b, B:29:0x0050, B:33:0x006d, B:35:0x005a, B:38:0x0064, B:41:0x0070, B:43:0x0076, B:49:0x0081), top: B:15:0x0026 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(android.widget.ListView r5, yf5.j0 r6, boolean r7, java.lang.String r8) {
        /*
            r4 = this;
            if (r6 == 0) goto L9e
            if (r5 != 0) goto L6
            goto L9e
        L6:
            if (r7 != 0) goto L9
            return
        L9:
            kotlin.jvm.internal.h0 r7 = new kotlin.jvm.internal.h0
            r7.<init>()
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L1b
            int r2 = r8.length()
            if (r2 != 0) goto L19
            goto L1b
        L19:
            r2 = r1
            goto L1c
        L1b:
            r2 = r0
        L1c:
            if (r2 != 0) goto L26
            boolean r2 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(r8)
            if (r2 == 0) goto L26
            r7.f391656d = r8
        L26:
            java.lang.Object r8 = r7.f391656d     // Catch: java.lang.Exception -> L8e
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Exception -> L8e
            if (r8 == 0) goto L35
            int r8 = r8.length()     // Catch: java.lang.Exception -> L8e
            if (r8 != 0) goto L33
            goto L35
        L33:
            r8 = r1
            goto L36
        L35:
            r8 = r0
        L36:
            if (r8 == 0) goto L70
            int r8 = r5.getFirstVisiblePosition()     // Catch: java.lang.Exception -> L8e
            int r2 = r5.getLastVisiblePosition()     // Catch: java.lang.Exception -> L8e
            int r5 = r5.getHeaderViewsCount()     // Catch: java.lang.Exception -> L8e
            if (r8 <= r5) goto L48
            int r8 = r8 - r5
            goto L49
        L48:
            r8 = r1
        L49:
            if (r2 < r5) goto L4d
            int r2 = r2 - r5
            goto L4e
        L4d:
            r2 = r1
        L4e:
            if (r8 > r2) goto L70
        L50:
            r5 = r6
            yf5.w0 r5 = (yf5.w0) r5     // Catch: java.lang.Exception -> L8e
            com.tencent.mm.storage.l4 r5 = r5.getItem(r8)     // Catch: java.lang.Exception -> L8e
            if (r5 != 0) goto L5a
            goto L6b
        L5a:
            java.lang.String r3 = r5.h1()     // Catch: java.lang.Exception -> L8e
            boolean r3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.o4(r3)     // Catch: java.lang.Exception -> L8e
            if (r3 == 0) goto L6b
            java.lang.String r5 = r5.h1()     // Catch: java.lang.Exception -> L8e
            r7.f391656d = r5     // Catch: java.lang.Exception -> L8e
            goto L70
        L6b:
            if (r8 == r2) goto L70
            int r8 = r8 + 1
            goto L50
        L70:
            java.lang.Object r5 = r7.f391656d     // Catch: java.lang.Exception -> L8e
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5     // Catch: java.lang.Exception -> L8e
            if (r5 == 0) goto L7e
            int r5 = r5.length()     // Catch: java.lang.Exception -> L8e
            if (r5 != 0) goto L7d
            goto L7e
        L7d:
            r0 = r1
        L7e:
            if (r0 == 0) goto L81
            return
        L81:
            ku5.u0 r5 = ku5.t0.f394148d     // Catch: java.lang.Exception -> L8e
            com.tencent.mm.ui.conversation.z1 r6 = new com.tencent.mm.ui.conversation.z1     // Catch: java.lang.Exception -> L8e
            r6.<init>(r7)     // Catch: java.lang.Exception -> L8e
            ku5.t0 r5 = (ku5.t0) r5     // Catch: java.lang.Exception -> L8e
            r5.g(r6)     // Catch: java.lang.Exception -> L8e
            goto L9e
        L8e:
            r5 = move-exception
            java.lang.String r6 = r5.getMessage()
            java.lang.Object[] r5 = new java.lang.Object[]{r6, r5}
            java.lang.String r6 = "MicroMsg.ConvExposeHelper"
            java.lang.String r7 = "checkKefuServiceAccountShow ex %s"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r7, r5)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.i(android.widget.ListView, yf5.j0, boolean, java.lang.String):void");
    }

    public final java.util.List j() {
        int i17;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(java.lang.Thread.currentThread(), android.os.Looper.getMainLooper().getThread());
        yf5.j0 j0Var = (yf5.j0) f288828f.get();
        int i19 = f288831i;
        if (i19 == -1 || (i17 = f288832m) == -1 || (i18 = f288833n) == -1 || j0Var == null) {
            return kz5.p0.f395529d;
        }
        int i27 = i19 > i18 ? (i19 - i18) + 1 : 0;
        int i28 = i17 >= i18 ? (i17 - i18) - 1 : 0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (i27 <= i28) {
            while (true) {
                com.p314xaae8f345.mm.p2621x8fb0427b.l4 item = ((yf5.w0) j0Var).getItem(i27);
                if (item != null) {
                    arrayList.add(new rv.e(item, i27));
                }
                if (i27 == i28) {
                    break;
                }
                i27++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x01f2, code lost:
    
        if (zv.m0.f557569h == false) goto L136;
     */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0207 A[Catch: Exception -> 0x0205, TRY_LEAVE, TryCatch #1 {Exception -> 0x0205, blocks: (B:113:0x01ba, B:117:0x01d6, B:123:0x01e3, B:125:0x01f4, B:126:0x0207, B:127:0x01c4, B:131:0x01ce), top: B:112:0x01ba }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(android.widget.ListView r18, yf5.j0 r19, boolean r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22363xe804606.m(android.widget.ListView, yf5.j0, boolean, boolean, boolean):void");
    }

    @Override // p012xc85e97e9.p093xedfae76a.v
    /* renamed from: onStateChanged */
    public void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y source, p012xc85e97e9.p093xedfae76a.m event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "onStateChanged() event = " + event);
        if (event == p012xc85e97e9.p093xedfae76a.m.ON_START) {
            f288839t = true;
        } else if (event == p012xc85e97e9.p093xedfae76a.m.ON_PAUSE) {
            f288839t = false;
        }
    }

    @Override // e42.j0
    public void q(android.app.Activity activity, java.lang.Object obj) {
        if (activity == null || obj == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a1 a1Var = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275249a;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275259k = com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j;
        com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j = obj.getClass().getSimpleName();
        a1Var.n(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea ? ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea) obj).f279685f.u().d1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ConvExposeHelper", "onHellFragmentResume lastDisappearedUIName=" + com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275259k + " lastStartUIName=" + com.p314xaae8f345.mm.p2621x8fb0427b.a1.f275258j);
    }

    @Override // e42.j0
    public void t(android.app.Activity activity) {
    }

    @Override // e42.j0
    public void z(android.app.Activity activity, boolean z17) {
    }
}
