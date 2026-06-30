package qj5;

/* loaded from: classes8.dex */
public final class e implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj5.n f445502d;

    public e(qj5.n nVar) {
        this.f445502d = nVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        qj5.n nVar = this.f445502d;
        nVar.u();
        android.view.ViewTreeObserver viewTreeObserver = nVar.f445525z2;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = nVar.f445524y2;
                nVar.f445525z2 = view != null ? view.getViewTreeObserver() : null;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(nVar);
        }
        nVar.f445525z2 = null;
        qj5.o oVar = nVar.f445516q2;
        if (oVar != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g.b(oVar);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("containerDialog");
            throw null;
        }
    }
}
