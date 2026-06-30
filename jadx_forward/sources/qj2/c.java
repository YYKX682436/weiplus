package qj2;

/* loaded from: classes10.dex */
public final class c implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qj2.d f445402d;

    public c(qj2.d dVar) {
        this.f445402d = dVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        if (i17 == i28 && i18 == i29 && i19 == i37 && i27 == i38) {
            return;
        }
        qj2.d dVar = this.f445402d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(dVar.m145853xb5886c64(), "addOnLayoutChangeListener change");
        dVar.getClass();
        pm0.v.X(new qj2.b(dVar));
    }
}
