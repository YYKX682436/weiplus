package uk4;

/* loaded from: classes10.dex */
public class b implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uk4.e f510059d;

    public b(uk4.e eVar) {
        this.f510059d = eVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        uk4.e eVar = this.f510059d;
        android.view.ViewTreeObserver viewTreeObserver = eVar.f510070n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                eVar.f510070n = eVar.f510069m.getViewTreeObserver();
            }
            eVar.f510070n.removeGlobalOnLayoutListener(eVar);
            eVar.f510070n = null;
        }
        eVar.getClass();
        eVar.f510063d = null;
        eVar.getClass();
        eVar.f510076t.removeAllViews();
        eVar.f510077u.clear();
    }
}
