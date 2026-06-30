package xn5;

/* loaded from: classes13.dex */
public final class e1 implements xn5.z {

    /* renamed from: a, reason: collision with root package name */
    public static final xn5.e1 f537196a = new xn5.e1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f537197b = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p2776x373aa5.x2c.C22871x8161f454 f537198c = new com.p314xaae8f345.mm.p2776x373aa5.x2c.C22871x8161f454(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.Handler f537199d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.HashMap f537200e;

    /* renamed from: f, reason: collision with root package name */
    public static com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f537201f;

    static {
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("X2C_LAYOUT_THREAD");
        handlerThread.start();
        f537199d = new android.os.Handler(handlerThread.getLooper());
        f537200e = new java.util.HashMap();
    }

    @Override // xn5.z
    public android.view.View a(android.content.Context context, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f537197b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(context.hashCode());
        sb6.append('_');
        sb6.append(i17);
        sb6.append('_');
        sb6.append(viewGroup != null ? 1 : 0);
        xn5.a1 a1Var = (xn5.a1) concurrentHashMap.get(sb6.toString());
        if (a1Var != null) {
            java.util.List list = a1Var.f537179a;
            if (true ^ list.isEmpty()) {
                xn5.b1 b1Var = (xn5.b1) fp.l.b(list);
                android.view.View view = b1Var.f537184a;
                if (viewGroup != null) {
                    xn5.p0 p0Var = xn5.q0.f537235a;
                    android.view.ViewGroup.LayoutParams generateLayoutParams = viewGroup.generateLayoutParams(xn5.q0.f537238d);
                    java.lang.Object tag = view.getTag(com.p314xaae8f345.mm.R.id.psd);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) tag;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(generateLayoutParams);
                    generateLayoutParams.width = ((android.view.ViewGroup.LayoutParams) marginLayoutParams).width;
                    generateLayoutParams.height = ((android.view.ViewGroup.LayoutParams) marginLayoutParams).height;
                    if (generateLayoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
                        android.view.ViewGroup.MarginLayoutParams marginLayoutParams2 = (android.view.ViewGroup.MarginLayoutParams) generateLayoutParams;
                        marginLayoutParams2.rightMargin = marginLayoutParams.rightMargin;
                        marginLayoutParams2.topMargin = marginLayoutParams.topMargin;
                        marginLayoutParams2.leftMargin = marginLayoutParams.leftMargin;
                        marginLayoutParams2.bottomMargin = marginLayoutParams.bottomMargin;
                        marginLayoutParams2.setMarginStart(marginLayoutParams.getMarginStart());
                        marginLayoutParams2.setMarginEnd(marginLayoutParams.getMarginEnd());
                    }
                    view.setLayoutParams(generateLayoutParams);
                    if (z17) {
                        viewGroup.addView(view);
                    }
                }
                return b1Var.f537184a;
            }
        }
        return null;
    }

    @Override // xn5.z
    public void b(r45.hg7 preloadData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preloadData, "preloadData");
        f537199d.post(new xn5.f1(new xn5.z0(preloadData)));
    }

    @Override // xn5.z
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "clearLayoutCache");
        f537199d.removeCallbacksAndMessages(null);
        f537197b.clear();
    }

    @Override // xn5.z
    public void d(final android.content.Context context, p012xc85e97e9.p093xedfae76a.y lifecycleOwner, final java.lang.String actName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actName, "actName");
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(actName, context.getClass().getSimpleName()) + '_' + c01.id.c();
        f537199d.post(new xn5.f1(new xn5.y0(str, new java.lang.ref.WeakReference(context), actName)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "onCreate ".concat(str));
        lifecycleOwner.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.view.x2c.X2CLayoutCachePool$preload$1
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                xn5.e1 e1Var = xn5.e1.f537196a;
                android.content.Context context2 = context;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
                java.lang.String actName2 = actName;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actName2, "actName");
                java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(actName2, context2.getClass().getSimpleName()) + '_' + c01.id.c();
                android.os.Handler handler = xn5.e1.f537199d;
                int hashCode = context2.hashCode();
                java.lang.String u17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.u1(actName2, context2.getClass().getSimpleName());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(u17, "nullOrNilAs(...)");
                handler.post(new xn5.f1(new xn5.x0(str2, hashCode, u17)));
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.X2C.X2CLayoutCachePool", "onDestroy ".concat(str2));
            }
        });
    }

    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var;
        if (f537201f == null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 M = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("X2CPreloadLayoutData");
            f537201f = M;
            java.lang.String t17 = M != null ? M.t("BuildInfo.TIME") : null;
            boolean z17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.x2c.C20832xe5929cfd()) == 1;
            if ((!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t17, com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c) || z17) && (o4Var = f537201f) != null) {
                o4Var.d();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = f537201f;
            if (o4Var2 != null) {
                o4Var2.D("BuildInfo.TIME", com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274640c);
            }
        }
        return f537201f;
    }
}
