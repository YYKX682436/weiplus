package wl3;

/* loaded from: classes10.dex */
public final class d implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wl3.e f528588d;

    public d(wl3.e eVar) {
        this.f528588d = eVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        wl3.e eVar = this.f528588d;
        android.view.ViewTreeObserver viewTreeObserver = eVar.f528595m;
        if (viewTreeObserver != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver);
            if (!viewTreeObserver.isAlive()) {
                android.view.View view = eVar.f528594i;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
                eVar.f528595m = view.getViewTreeObserver();
            }
            android.view.ViewTreeObserver viewTreeObserver2 = eVar.f528595m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(viewTreeObserver2);
            viewTreeObserver2.removeGlobalOnLayoutListener(eVar);
            eVar.f528595m = null;
        }
        eVar.getClass();
        eVar.getClass();
    }
}
