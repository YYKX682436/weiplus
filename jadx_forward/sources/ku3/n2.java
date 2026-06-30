package ku3;

/* loaded from: classes3.dex */
public final class n2 implements yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f393869d;

    /* renamed from: e, reason: collision with root package name */
    public final zt3.a f393870e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f393871f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f393872g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f393873h;

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f393874i;

    /* renamed from: m, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f393875m;

    public n2(android.view.ViewGroup parent, ju3.d0 status, zt3.a kitContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kitContext, "kitContext");
        this.f393869d = parent;
        this.f393870e = kitContext;
        this.f393871f = jz5.h.b(new ku3.h2(this));
        this.f393872g = jz5.h.b(new ku3.g2(this));
        this.f393873h = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null)));
    }

    public final android.view.View a() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393872g).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    public final android.widget.TextView b() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f393871f).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    public final void c(java.lang.String str) {
        if (a().getVisibility() != 0) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f393875m;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            b().setText(str);
            b().setVisibility(0);
            b().animate().alpha(1.0f).start();
            this.f393875m = p3325xe03a0797.p3326xc267989b.l.d(this.f393873h, null, null, new ku3.k2(this, null), 3, null);
        }
    }

    public final void d(android.view.View.OnClickListener clickListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clickListener, "clickListener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordHintPlugin", "showPermissionAfterHint");
        if (b().getVisibility() == 0) {
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f393874i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            this.f393874i = p3325xe03a0797.p3326xc267989b.l.d(this.f393873h, null, null, new ku3.m2(this, null), 3, null);
        } else {
            android.view.View a17 = a();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(a17, arrayList.toArray(), "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            a17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(a17, "com/tencent/mm/plugin/recordvideo/plugin/professional/RecordHintPlugin", "showPermissionAfterHint", "(Landroid/view/View$OnClickListener;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        a().setOnClickListener(clickListener);
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f393875m;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.r2 r2Var2 = this.f393874i;
        if (r2Var2 != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f393873h, null, 1, null);
    }

    @Override // yt3.r2
    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        ku3.a2 a2Var = new ku3.a2(this);
        zt3.a aVar = this.f393870e;
        aVar.getClass();
        aVar.f557114i.mo7806x9d92d11c(aVar.f557109d, a2Var);
        aVar.R6(new ku3.f2(this));
    }
}
