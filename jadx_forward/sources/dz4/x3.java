package dz4;

/* loaded from: classes11.dex */
public final class x3 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.h4 f326992d;

    public x3(dz4.h4 h4Var) {
        this.f326992d = h4Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        dz4.h4 h4Var = this.f326992d;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = h4Var.f326822g;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = h4Var.f326820e;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        h4Var.f326820e = null;
    }
}
