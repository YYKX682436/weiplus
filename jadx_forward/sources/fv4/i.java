package fv4;

/* loaded from: classes8.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f348540a;

    /* renamed from: b, reason: collision with root package name */
    public fv4.g f348541b;

    /* renamed from: c, reason: collision with root package name */
    public tg0.c2 f348542c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f348543d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f348544e;

    /* renamed from: f, reason: collision with root package name */
    public final ev4.d f348545f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f348546g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f348547h = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: i, reason: collision with root package name */
    public final ev4.j f348548i;

    public i(android.content.Context context, int i17, java.util.Map map, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2) {
        java.lang.Object m143895xf1229813;
        android.view.View view;
        tg0.c1 c1Var;
        tg0.s2 s2Var;
        this.f348540a = context;
        this.f348541b = new fv4.a();
        this.f348545f = new ev4.d(c28688xe8dbe4c2, this);
        ev4.j jVar = new ev4.j(this);
        this.f348548i = jVar;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            tg0.l1 l1Var = (tg0.l1) i95.n0.c(tg0.l1.class);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(l1Var != null ? ((yg0.o3) l1Var).Di(context, i17, map, jVar.f338487b) : null);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            java.lang.String content = "init, create view failed: " + m143898xd4a2fc34;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FTSPlatformWebView", content);
        }
        tg0.c2 c2Var = (tg0.c2) (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813) ? null : m143895xf1229813);
        this.f348542c = c2Var;
        android.view.View view2 = (c2Var == null || (s2Var = c2Var.f500584f) == null) ? null : ((ch0.p0) s2Var).f122784a;
        this.f348541b.getClass();
        android.app.Activity a17 = a();
        this.f348543d = view2 == null ? new android.view.View(a17 instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? ((com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) a17).m81186xd24c19fa() : a17) : view2;
        tg0.c2 c2Var2 = this.f348542c;
        tg0.g2 g2Var = c2Var2 != null ? c2Var2.f500582d : null;
        if ((g2Var == null ? -1 : fv4.h.f348539a[g2Var.ordinal()]) == 1) {
            fv4.f fVar = new fv4.f();
            this.f348541b.g();
            this.f348541b = fVar;
            fVar.f(this);
        } else {
            fv4.k kVar = new fv4.k();
            this.f348541b.g();
            this.f348541b = kVar;
            kVar.f(this);
        }
        tg0.c2 c2Var3 = this.f348542c;
        if (c2Var3 != null && c2Var3.f500579a) {
            if ((c2Var3 != null ? c2Var3.f500582d : null) == tg0.g2.f500607f) {
                if (((c2Var3 == null || (c1Var = c2Var3.f500588j) == null || c1Var.f500562a != 1) ? false : true) && (view = this.f348543d) != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogicContext", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/websearch/searchplatformwebview/logic/PlatformWebViewLogicContext", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
            }
            ((ev4.i) this.f348548i.f338487b).b();
        }
    }

    public final android.app.Activity a() {
        android.content.Context context = this.f348540a;
        if ((context instanceof android.content.MutableContextWrapper) && (((android.content.MutableContextWrapper) context).getBaseContext() instanceof android.app.Activity)) {
            android.content.Context baseContext = ((android.content.MutableContextWrapper) context).getBaseContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(baseContext, "null cannot be cast to non-null type android.app.Activity");
            return (android.app.Activity) baseContext;
        }
        if (context instanceof android.app.Activity) {
            return (android.app.Activity) context;
        }
        return null;
    }
}
