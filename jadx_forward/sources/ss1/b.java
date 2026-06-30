package ss1;

/* loaded from: classes8.dex */
public final class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss1.d f493416d;

    public b(ss1.d dVar) {
        this.f493416d = dVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        android.view.View view;
        ss1.d dVar = this.f493416d;
        android.view.ViewTreeObserver viewTreeObserver = dVar.f493424m;
        if (viewTreeObserver != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive() && (view = dVar.f493423i) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                dVar.f493424m = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = dVar.f493424m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(dVar);
            dVar.f493424m = null;
        }
        if (!dVar.f493425n) {
            dVar.f493419e = null;
        }
        rv.m3 m3Var = dVar.f493427p;
        if (m3Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m3Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.x3 x3Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.w3) m3Var).f268541a;
            x3Var.f269180g = null;
            x3Var.c(x3Var.f269179f ? "cancel" : "hide", null);
        }
    }
}
