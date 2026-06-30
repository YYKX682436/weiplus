package ym5;

/* loaded from: classes15.dex */
public final class r0 {

    /* renamed from: b, reason: collision with root package name */
    public static long f545019b;

    /* renamed from: c, reason: collision with root package name */
    public static long f545020c;

    /* renamed from: d, reason: collision with root package name */
    public static int f545021d;

    /* renamed from: e, reason: collision with root package name */
    public static int f545022e;

    /* renamed from: h, reason: collision with root package name */
    public static final yz5.a f545025h;

    /* renamed from: i, reason: collision with root package name */
    public static final yz5.a f545026i;

    /* renamed from: a, reason: collision with root package name */
    public static final ym5.r0 f545018a = new ym5.r0();

    /* renamed from: f, reason: collision with root package name */
    public static final android.graphics.Rect f545023f = new android.graphics.Rect();

    /* renamed from: g, reason: collision with root package name */
    public static boolean f545024g = true;

    static {
        ym5.a1.f(ym5.k0.f544945d);
        f545025h = ym5.q0.f545010d;
        f545026i = ym5.p0.f544992d;
    }

    public static final void a(ym5.r0 r0Var, android.view.View view, ym5.b1 b1Var) {
        r0Var.getClass();
        ym5.n0 n0Var = b1Var.f544747e;
        float mo136789x5392a02b = n0Var != null ? n0Var.mo136789x5392a02b(view) : 0.0f;
        boolean globalVisibleRect = view.getGlobalVisibleRect(f545023f);
        float width = (view.getMeasuredWidth() <= 0 || view.getMeasuredHeight() <= 0) ? 0.0f : (r4.width() * r4.height()) / (view.getMeasuredWidth() * view.getMeasuredHeight());
        ym5.n0 n0Var2 = b1Var.f544747e;
        boolean mo55689xe831ad7e = n0Var2 != null ? n0Var2.mo55689xe831ad7e(view) : true;
        boolean isShown = view.isShown();
        ym5.r0 r0Var2 = f545018a;
        boolean z17 = false;
        if (isShown && view.getAlpha() > 0.0f && view.getParent() != null && globalVisibleRect && view.hasWindowFocus()) {
            if (((mo136789x5392a02b == 0.0f) || width >= mo136789x5392a02b) && mo55689xe831ad7e) {
                ym5.n0 n0Var3 = b1Var.f544747e;
                long mo55681x18a217a5 = n0Var3 != null ? n0Var3.mo55681x18a217a5(view) : -1L;
                r0Var2.c(view, b1Var);
                long j17 = b1Var.f544745c;
                if (j17 != mo55681x18a217a5) {
                    ym5.n0 n0Var4 = b1Var.f544747e;
                    if (n0Var4 != null) {
                        n0Var4.mo976xcdf5f75c(b1Var.f544743a, j17, mo55681x18a217a5, true);
                    }
                    b1Var.f544745c = mo55681x18a217a5;
                    return;
                }
                return;
            }
        }
        if (b1Var.f544745c != -1) {
            r0Var2.c(view, b1Var);
            ym5.n0 n0Var5 = b1Var.f544747e;
            if (n0Var5 != null) {
                n0Var5.mo976xcdf5f75c(b1Var.f544743a, b1Var.f544745c, -1L, false);
            }
            b1Var.f544745c = -1L;
        }
        if (b1Var.f544751i) {
            return;
        }
        android.content.Context context = view.getContext();
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null && activity.isDestroyed()) {
            z17 = true;
        }
        if (z17) {
            if (b1Var.f544750h == 0) {
                b1Var.f544750h = java.lang.System.currentTimeMillis();
            } else if (java.lang.System.currentTimeMillis() - b1Var.f544750h > 5000) {
                b1Var.f544751i = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ExposeElves", "[checkLeak] leak view=" + view);
            }
        }
    }

    public static final void b(ym5.r0 r0Var, java.lang.String str) {
        r0Var.getClass();
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper, "getMainLooper(...)");
        if (!(ym5.a1.e(mainLooper) instanceof ym5.l0)) {
            android.os.Looper mainLooper2 = android.os.Looper.getMainLooper();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mainLooper2, "getMainLooper(...)");
            android.os.Looper.getMainLooper().setMessageLogging(new ym5.l0(ym5.a1.e(mainLooper2)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ExposeElves", "[checkSetLogging] source=" + str);
    }

    public final void c(android.view.View parent, ym5.b1 b1Var) {
        ym5.o0 o0Var = b1Var.f544748f;
        if (o0Var == null) {
            return;
        }
        ym5.u0 u0Var = (ym5.u0) o0Var;
        if ((u0Var.f545077c && u0Var.f545078d.f391649d == 2) || !(parent instanceof android.view.ViewGroup)) {
            return;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int childCount = viewGroup.getChildCount();
        long j17 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = viewGroup.getChildAt(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(childAt);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = u0Var.f545076b;
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m07 = c1163xf1deaba4.m0(childAt);
            ym5.m0 m0Var = u0Var.f545075a;
            long c17 = m0Var.c(m07);
            float b17 = m0Var.b(childAt);
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(f545023f);
            float width = (childAt.getMeasuredWidth() <= 0 || childAt.getMeasuredHeight() <= 0) ? 0.0f : (r4.width() * r4.height()) / (childAt.getMeasuredWidth() * childAt.getMeasuredHeight());
            if (childAt.isShown() && childAt.getAlpha() > 0.0f && childAt.hasWindowFocus() && globalVisibleRect) {
                if (((b17 == 0.0f) || width >= b17) && m0Var.a(c1163xf1deaba4.m0(childAt))) {
                    linkedList.add(childAt);
                    j17 += c17;
                }
            }
        }
        if (b1Var.f544749g == j17) {
            return;
        }
        b1Var.f544749g = j17;
        ym5.o0 o0Var2 = b1Var.f544748f;
        if (o0Var2 == null) {
            return;
        }
        ym5.u0 u0Var2 = (ym5.u0) o0Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = u0Var2.f545076b;
            if (!hasNext) {
                u0Var2.f545075a.e(c1163xf1deaba42, linkedList2);
                return;
            } else {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 m08 = c1163xf1deaba42.m0((android.view.View) it.next());
                if (m08 != null) {
                    linkedList2.add(m08);
                }
            }
        }
    }
}
