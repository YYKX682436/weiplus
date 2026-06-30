package pp3;

/* loaded from: classes5.dex */
public final class s implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pp3.u f439029d;

    public s(pp3.u uVar) {
        this.f439029d = uVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        pp3.u.f439031s = null;
        pp3.u uVar = this.f439029d;
        uVar.f439041r.d();
        android.util.SparseArray sparseArray = ((e21.f) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).f328047d;
        if (sparseArray.indexOfKey(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508) >= 0) {
            ((java.util.LinkedList) sparseArray.get(com.p314xaae8f345.p318x5a5de35.p330xb81a4bea.p335x584fd04f.C2933x39866d30.f10111xba02d508)).remove(uVar);
        }
        r45.n55 n55Var = (r45.n55) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ai(uVar.f439032f, 4, r45.n55.class);
        if (n55Var == null) {
            return;
        }
        n55Var.f462624d = 0;
    }
}
