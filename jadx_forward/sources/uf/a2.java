package uf;

/* loaded from: classes7.dex */
public final class a2 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf.c2 f508503d;

    public a2(uf.c2 c2Var) {
        this.f508503d = c2Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        uf.c2 c2Var = this.f508503d;
        android.view.ViewTreeObserver viewTreeObserver = c2Var.f508539s;
        if (viewTreeObserver != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = c2Var.f508538r;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                c2Var.f508539s = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = c2Var.f508539s;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver2);
            viewTreeObserver2.removeOnGlobalLayoutListener(c2Var);
            c2Var.f508539s = null;
        }
        c2Var.f508529f.f508521g.d();
        c2Var.f508544x.mo146xb9724478(java.lang.Integer.valueOf(c2Var.f508529f.f508518d.size() + c2Var.f508529f.f508517c.size()));
    }
}
