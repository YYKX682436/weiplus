package dz4;

/* loaded from: classes11.dex */
public final class m2 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f326884d;

    public m2(dz4.u2 u2Var) {
        this.f326884d = u2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.u2 u2Var = this.f326884d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = u2Var.f326962d;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = u2Var.f326960b;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        u2Var.f326960b = null;
    }
}
