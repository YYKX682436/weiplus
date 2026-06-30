package br5;

/* loaded from: classes8.dex */
public final class a implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ br5.e f105281d;

    public a(br5.e eVar) {
        this.f105281d = eVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        this.f105281d.a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        br5.e eVar = this.f105281d;
        p3325xe03a0797.p3326xc267989b.y0 y0Var = eVar.f105286b;
        if (y0Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.m0 m0Var = eVar.f105287c;
        m0Var.getClass();
        zq5.b.d();
        p3325xe03a0797.p3326xc267989b.y0 y0Var2 = m0Var.f296530f;
        if (y0Var2 != null) {
            p012xc85e97e9.p093xedfae76a.o oVar = m0Var.f296544t;
            if (oVar != null) {
                oVar.c(m0Var.f296538n);
            }
            m0Var.b("setCoroutineScope");
            m0Var.c("setCoroutineScope");
            p3325xe03a0797.p3326xc267989b.z0.c(y0Var2, null);
            m0Var.f296530f = null;
        }
        p3325xe03a0797.p3326xc267989b.z0.d(y0Var, "onDetachFromWindow", null, 2, null);
        eVar.f105286b = null;
    }
}
