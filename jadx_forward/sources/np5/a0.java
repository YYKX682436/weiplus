package np5;

/* loaded from: classes9.dex */
public class a0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ np5.b0 f420346d;

    public a0(np5.b0 b0Var) {
        this.f420346d = b0Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        np5.b0 b0Var = this.f420346d;
        if (b0Var.f420356i == null || !b0Var.f420353f.isEmpty()) {
            return;
        }
        b0Var.f420356i.dismiss();
        java.util.Iterator it = b0Var.f420354g.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p944x882e457a.m1 m1Var = (com.p314xaae8f345.mm.p944x882e457a.m1) it.next();
            gm0.j1.i();
            gm0.j1.n().f354821b.d(m1Var);
        }
        b0Var.f420354g.clear();
    }
}
