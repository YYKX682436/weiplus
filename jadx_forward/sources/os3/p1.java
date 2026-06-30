package os3;

/* loaded from: classes8.dex */
public class p1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ os3.q1 f429702d;

    public p1(os3.q1 q1Var) {
        this.f429702d = q1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        os3.q1 q1Var = this.f429702d;
        ks3.v0 v0Var = q1Var.f429709d;
        int i18 = v0Var.f393291g;
        if (i18 == 0 || i18 == 1) {
            ms3.a aVar = (ms3.a) ((java.util.HashMap) q1Var.f429711f.f429760i).get(v0Var.f393288d);
            if (aVar != null) {
                gm0.j1.n().f354821b.d(aVar);
            }
        }
        ((java.util.HashMap) q1Var.f429711f.f429759h).remove(q1Var.f429709d.f393288d);
        ((java.util.HashMap) q1Var.f429711f.f429760i).remove(q1Var.f429709d.f393288d);
        q1Var.f429711f.f429756e.removeView(q1Var.f429710e);
        q1Var.f429711f.b();
    }
}
